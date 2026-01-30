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

### Option 1: GitHub Actions Workflow (Recommended)

1. Go to the "Actions" tab in GitHub
2. Select "Cleanup Prerelease Versions" workflow
3. Click "Run workflow"
4. Choose "dry_run: true" to preview what will be deleted
5. Once confirmed, run again with "dry_run: false" to actually delete

### Option 2: Manual Script Execution

```bash
# Install dependencies
pip install PyGithub

# Dry run (preview what will be deleted)
python3 scripts/cleanup_prereleases.py --dry-run

# Actually delete (requires GitHub token with repo access)
export GITHUB_TOKEN=your_github_token_here
python3 scripts/cleanup_prereleases.py
```

To create a GitHub personal access token:
1. Go to GitHub Settings > Developer settings > Personal access tokens > Tokens (classic)
2. Click "Generate new token (classic)"
3. Select scope: `repo` (Full control of private repositories)
4. Generate and copy the token

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
