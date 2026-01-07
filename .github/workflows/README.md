# GitHub Actions Workflows

This directory contains GitHub Actions workflows for the Kitchen Cooking Engine integration.

## Workflows

### 1. HACS Validation (`hacs-validation.yml`)

Validates the integration against HACS requirements.

- **Triggers:** Push, Pull Request, Manual (workflow_dispatch), Daily schedule
- **Purpose:** Ensures the integration meets HACS standards

### 2. Create Test Release (`create-test-release.yml`)

Creates test releases from any branch without merging to main.

- **Trigger:** Manual (workflow_dispatch)
- **Purpose:** Allows testing integration changes via HACS before merging to main

## How to Create a Test Release

### Prerequisites

- You must have write access to the repository
- Your branch must be pushed to GitHub

### Steps

1. **Go to GitHub Actions:**
   - Navigate to `Actions` tab in the repository
   - Select `Create Test Release` workflow from the left sidebar

2. **Run the Workflow:**
   - Click `Run workflow` button
   - Select your branch (e.g., `copilot/add-ninja-combi-recipes`)
   - Choose release type:
     - **test:** Timestamped test release (default) - e.g., `v0.1.2.18-test.copilot-add-ninja-combi-recipes.20260107-142530`
     - **beta:** Beta release - e.g., `v0.1.2.18-beta.copilot-add-ninja-combi-recipes`
     - **rc:** Release candidate - e.g., `v0.1.2.18-rc.copilot-add-ninja-combi-recipes`
   - Optionally provide a custom version suffix (if empty, uses branch name)
   - Click `Run workflow`

3. **Wait for Completion:**
   - The workflow will take about 1-2 minutes
   - A GitHub Release will be created with:
     - Prerelease flag set (won't appear in "Latest")
     - ZIP file of the integration
     - Detailed release notes
     - Installation instructions

### Installing the Test Release via HACS

Once the test release is created:

1. **Open HACS in Home Assistant:**
   - Go to HACS → Integrations

2. **Find Kitchen Cooking Engine:**
   - If not already installed, add as custom repository:
     - Click three dots (⋮) → Custom repositories
     - URL: `https://github.com/R00S/meater-in-local-haos`
     - Category: Integration
     - Click Add

3. **Install Test Version:**
   - Find "Kitchen Cooking Engine" 
   - Click it
   - Click "Download" or "Redownload"
   - Select the test version from dropdown (will show with -test/-beta/-rc suffix)
   - Click "Download"

4. **Restart Home Assistant:**
   - Go to Settings → System → Restart
   - Wait for restart to complete

5. **Test the Integration:**
   - All new features from your branch are now active
   - Report any issues on the PR or as GitHub issues

### Example Workflow Runs

**Test Release (with timestamp):**
```
Branch: copilot/add-ninja-combi-recipes
Type: test
Version: v0.1.2.18-test.copilot-add-ninja-combi-recipes.20260107-142530
```

**Beta Release:**
```
Branch: copilot/add-ninja-combi-recipes
Type: beta
Version: v0.1.2.18-beta.copilot-add-ninja-combi-recipes
```

**Release Candidate:**
```
Branch: feature/new-ui
Type: rc
Version: v0.1.2.18-rc.feature-new-ui
```

### Benefits

✅ **Test Before Merge:** Test integration changes in real Home Assistant without merging to main
✅ **Multiple Test Versions:** Create multiple test releases for different branches
✅ **HACS Compatible:** Install directly through HACS like any other version
✅ **No Main Branch Impact:** Main branch remains clean and stable
✅ **Easy Rollback:** Can switch between test versions and stable versions in HACS
✅ **Collaborative Testing:** Share test version tag with others for testing

### Cleaning Up

After testing is complete and changes are merged to main:

1. The test releases remain in GitHub Releases (marked as prerelease)
2. You can manually delete old test releases from the Releases page
3. HACS will automatically show the new stable version as latest

### Troubleshooting

**Issue:** HACS doesn't show the test version
- **Solution:** Make sure you've added the repository as a custom repository in HACS
- Wait a few minutes for HACS to refresh
- Try removing and re-adding the integration in HACS

**Issue:** Test release creation fails
- **Solution:** Check that manifest.json has a valid version number
- Ensure you have write permissions to the repository

**Issue:** Installation fails in Home Assistant
- **Solution:** Check Home Assistant logs for specific errors
- Ensure the integration ZIP file was created successfully
- Verify manifest.json has correct dependencies

## Advanced Usage

### Custom Version Suffix

You can provide a custom suffix instead of using the branch name:

```
Branch: copilot/add-ninja-combi-recipes
Type: test
Custom Suffix: ninja-combi-v2
Result: v0.1.2.18-test.ninja-combi-v2.20260107-142530
```

This is useful when testing multiple iterations on the same branch.

### Automation

The test release workflow can be triggered via GitHub API or CLI:

```bash
gh workflow run create-test-release.yml \
  --ref copilot/add-ninja-combi-recipes \
  -f release_type=beta \
  -f version_suffix=iteration-1
```

## Questions?

For questions or issues with the workflows, please open an issue on GitHub.
