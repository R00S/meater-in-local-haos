# Cleanup Prerelease Versions

## Problem

HACS (Home Assistant Community Store) only displays a limited number of releases. With 102 prerelease/test versions cluttering the release list, users cannot find the 22 important semi-working releases that were marked as "latest" (prerelease=false).

## Solution

This directory contains tools to delete all prerelease versions from the GitHub repository, keeping only releases that were marked as "latest" when created.

### Releases to Keep (22 total)

These releases have `prerelease=false` and will remain visible:

- 0.3.3.0
- 0.3.4.0
- v0.1.0.10dev
- v0.1.0.11dev
- v0.1.0.12dev
- v0.1.0.15
- v0.1.0.16
- v0.1.1.0b
- v0.1.1.1
- v0.1.1.10
- v0.1.1.11b
- v0.1.1.12
- v0.1.1.13
- v0.1.1.14
- v0.1.1.2
- v0.1.1.3
- v0.1.1.4
- v0.1.1.5
- v0.1.1.6
- v0.1.1.8
- v0.1.2.18r
- v0.1.2.7

### Releases to Delete (102 total)

All releases with `prerelease=true` will be deleted, including:
- All test releases (e.g., `v0.5.0.23-test.copilot-create-terms-of-reference.20260117-125601`)
- Alpha/beta versions marked as prerelease (e.g., `0.3.5.0a`, `v0.1.2.9b`)
- Development versions marked as prerelease (e.g., `v0.1.0.14.dev`)

## How to Use

### Option 1: GitHub Actions Workflow (Recommended - Web-Based) ⭐

**This is the easiest method - everything runs in the GitHub web interface!**

1. Go to: https://github.com/R00S/meater-in-local-haos/actions/workflows/cleanup-prereleases.yml
2. Click the "Run workflow" button (on the right side)
3. First time: Choose "dry_run: **true**" to preview what will be deleted
4. Review the workflow output to confirm the correct releases will be deleted
5. Second time: Run again with "dry_run: **false**" to actually delete the releases

No local setup needed! The workflow has the necessary permissions to delete releases.

### Option 2: Using GitHub CLI (gh)

If you have GitHub CLI installed and authenticated:

```bash
# Dry run (preview what will be deleted)
bash scripts/cleanup_prereleases.sh true

# Actually delete
bash scripts/cleanup_prereleases.sh false
```

### Option 3: Using Python Script

```bash
# Install dependencies
pip install PyGithub

# Dry run (preview what will be deleted)
python3 scripts/cleanup_prereleases.py --dry-run

# Actually delete (requires GitHub token with repo access)
export GITHUB_TOKEN=your_github_token_here
python3 scripts/cleanup_prereleases.py
```

## Expected Result

After cleanup:
- ✓ 22 "latest" releases remain visible in HACS
- ✓ Users can find early semi-working releases (v0.1.0.10dev, v0.1.1.0b, etc.)
- ✓ Test/prerelease versions (102) are removed from the list
- ✓ Latest release (0.3.4.0) remains as the default

## Safety

- The script only deletes releases with `prerelease=true`
- Releases with `prerelease=false` are never touched
- Dry run mode available to preview changes
- All deletions are logged with confirmation
