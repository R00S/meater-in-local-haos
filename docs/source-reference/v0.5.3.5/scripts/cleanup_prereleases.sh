#!/bin/bash
# Batch script to delete all prerelease versions using GitHub CLI
# This script requires 'gh' CLI to be authenticated
# Run: gh auth login
# Then: bash scripts/cleanup_prereleases.sh

set -e

REPO="R00S/meater-in-local-haos"
DRY_RUN="${1:-false}"

echo "================================================================================"
echo "Cleanup Prerelease Versions"
echo "Repository: $REPO"
echo "Mode: $([ "$DRY_RUN" = "true" ] && echo "DRY RUN" || echo "EXECUTING")"
echo "================================================================================"
echo ""

# Check if gh is installed
if ! command -v gh &> /dev/null; then
    echo "ERROR: GitHub CLI (gh) is not installed."
    echo "Install it from: https://cli.github.com/"
    exit 1
fi

# Check if jq is installed
if ! command -v jq &> /dev/null; then
    echo "ERROR: jq is not installed."
    echo "Install it from: https://stedolan.github.io/jq/"
    exit 1
fi

# Check if gh is authenticated
if ! gh auth status &> /dev/null; then
    echo "ERROR: GitHub CLI is not authenticated."
    echo "Run: gh auth login"
    exit 1
fi

echo "Fetching all releases..."
ALL_RELEASES=$(gh release list --repo "$REPO" --limit 1000 --json tagName,isPrerelease,isDraft)

# Count releases
TOTAL_COUNT=$(echo "$ALL_RELEASES" | jq 'length')
KEEP_COUNT=$(echo "$ALL_RELEASES" | jq '[.[] | select(.isPrerelease == false and .isDraft == false)] | length')
DELETE_COUNT=$(echo "$ALL_RELEASES" | jq '[.[] | select(.isPrerelease == true)] | length')

echo "Total releases: $TOTAL_COUNT"
echo "Releases to KEEP (prerelease=false): $KEEP_COUNT"
echo "Releases to DELETE (prerelease=true): $DELETE_COUNT"
echo ""

echo "================================================================================"
echo "RELEASES TO KEEP:"
echo "================================================================================"
echo "$ALL_RELEASES" | jq -r '.[] | select(.isPrerelease == false and .isDraft == false) | "  ✓ \(.tagName)"' | sort

echo ""
echo "================================================================================"
echo "RELEASES TO DELETE:"
echo "================================================================================"
TO_DELETE=$(echo "$ALL_RELEASES" | jq -r '.[] | select(.isPrerelease == true) | .tagName' | sort)
echo "$TO_DELETE" | head -30 | sed 's/^/  ✗ /'
REMAINING=$(echo "$TO_DELETE" | wc -l | xargs)
if [ "$REMAINING" -gt 30 ]; then
    echo "  ... and $((REMAINING - 30)) more"
fi

if [ "$DRY_RUN" = "true" ]; then
    echo ""
    echo "================================================================================"
    echo "DRY RUN - No releases will be deleted"
    echo "================================================================================"
    echo "To actually delete, run: bash $0 false"
    exit 0
fi

echo ""
echo "================================================================================"
echo "DELETING RELEASES..."
echo "================================================================================"
echo ""

DELETED=0
FAILED=0

while IFS= read -r tag; do
    echo -n "[$((DELETED + FAILED + 1))/$DELETE_COUNT] Deleting: $tag ... "
    if gh release delete "$tag" --repo "$REPO" --yes 2>&1; then
        echo "✓ DELETED"
        ((DELETED++))
    else
        echo "✗ FAILED"
        ((FAILED++))
    fi
done <<< "$TO_DELETE"

echo ""
echo "================================================================================"
echo "SUMMARY"
echo "================================================================================"
echo "Successfully deleted: $DELETED releases"
echo "Failed: $FAILED releases"
echo "Kept: $KEEP_COUNT latest releases"
echo ""
echo "✓ Cleanup complete!"
echo "✓ $KEEP_COUNT latest releases are now visible in HACS"
echo "================================================================================"
