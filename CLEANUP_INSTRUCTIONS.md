# 🧹 Cleanup Prerelease Versions - Quick Start

## Problem
HACS only shows a limited number of releases, and 102 prerelease/test versions are hiding the 22 important "latest" releases from users.

## Solution - Run in GitHub Web Interface (No Setup Required!) ⭐

### Step 1: Go to the Cleanup Workflow
Click this link: https://github.com/R00S/meater-in-local-haos/actions/workflows/cleanup-prereleases.yml

### Step 2: Run a Dry Run First
1. Click the **"Run workflow"** button (top right, green button)
2. Select Branch: `copilot/remove-non-latest-releases` (or `main` after merging)
3. Choose: **dry_run: true** 
4. Click **"Run workflow"**
5. Wait for it to complete (click on the workflow run to see details)
6. Review the output to confirm it will delete the right releases

### Step 3: Execute the Cleanup
1. Click **"Run workflow"** again
2. Choose: **dry_run: false**
3. Click **"Run workflow"**
4. The workflow will delete all 102 prerelease versions
5. The 22 "latest" releases will remain visible in HACS

## What Gets Deleted?
- ✗ All test releases (e.g., `v0.5.0.23-test.copilot-create-terms-of-reference...`)
- ✗ All prerelease versions (102 total)

## What Gets Kept?
- ✓ All "latest" releases (22 total)
- ✓ Including: 0.3.4.0, 0.3.3.0, v0.1.0.10dev, v0.1.1.0b, v0.1.1.1, v0.1.2.7, etc.

## Alternative Methods
See `scripts/README.md` for:
- GitHub CLI method
- Python script method

---

**Note:** This is safe to run - only releases with `prerelease=true` are deleted. The workflow has built-in protections.
