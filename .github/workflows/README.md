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
# GitHub Actions Workflows Documentation

## 📋 Table of Contents

- [Create Test Release Workflow](#create-test-release-workflow)
  - [Overview](#overview)
  - [How to Use](#how-to-use)
  - [Installing Test Releases via HACS](#installing-test-releases-via-hacs)
  - [Version Format Examples](#version-format-examples)
  - [Troubleshooting](#troubleshooting)
- [HACS Validation Workflow](#hacs-validation-workflow)

---

## Create Test Release Workflow

### Overview

The **Create Test Release** workflow allows developers to create pre-release versions of the Kitchen Cooking Engine integration from any branch. This enables testing changes via HACS before merging to the main branch.

**Key Features:**
- ✅ Create releases from any branch (feature branches, bug fixes, etc.)
- ✅ Automatic version tagging with branch name and timestamp
- ✅ ZIP archive generation following HACS requirements
- ✅ Pre-release marking for safety
- ✅ Automatic release notes generation
- ✅ Easy installation via HACS

**Workflow File:** `.github/workflows/create-test-release.yml`

---

### How to Use

#### Step 1: Navigate to GitHub Actions

1. Go to your repository on GitHub
2. Click the **Actions** tab
3. In the left sidebar, click **Create Test Release**

> **Important:** The workflow must be merged to the `main` branch first before it appears in the Actions UI. Once merged, you can trigger it from any branch.

#### Step 2: Run the Workflow

1. Click the **Run workflow** button (top right)
2. A form will appear with the following options:

| Input | Description | Default | Required |
|-------|-------------|---------|----------|
| **Branch** | Select the branch you want to release from | `main` | Yes |
| **Release type** | Choose: `test`, `beta`, or `rc` | `test` | Yes |
| **Version suffix** | Optional custom suffix (leave empty for auto-generated) | - | No |

3. Click **Run workflow**

#### Step 3: Monitor Progress

- The workflow will appear in the Actions list
- Click on the workflow run to see live logs
- Wait for all steps to complete (usually 1-2 minutes)

#### Step 4: Find Your Release

Once complete:
1. Go to the **Releases** section (right sidebar on main repo page)
2. Your new test release will be listed with:
   - 🏷️ Version tag (e.g., `v0.1.2.18-test.feature-branch.20260107221730`)
   - 🧪 "Pre-release" badge
   - 📦 ZIP file attached

---

### Installing Test Releases via HACS

#### Prerequisites

- HACS installed in Home Assistant
- Kitchen Cooking Engine already added as a custom repository in HACS

#### Installation Steps

##### Option A: Redownload (If Already Installed)

1. Open **HACS** → **Integrations** in Home Assistant
2. Find **Kitchen Cooking Engine** in your list
3. Click on it
4. Click the **⋮** (three dots) menu
5. Select **Redownload**
6. In the version dropdown, select your test version (e.g., `v0.1.2.18-test.feature-branch.20260107221730`)
7. Click **Download**
8. **Restart Home Assistant**

##### Option B: Fresh Install

1. Open **HACS** → **Integrations**
2. Click **+ Explore & Download Repositories**
3. Search for **Kitchen Cooking Engine**
4. Click on it
5. In the version dropdown, select your test version
6. Click **Download**
7. **Restart Home Assistant**

#### Verifying Installation

After restarting Home Assistant:

1. Go to **Settings** → **Devices & Services**
2. Find **Kitchen Cooking Engine**
3. Click **Configure**
4. The version should match your test release tag

You can also check the logs:
```
Settings → System → Logs
```
Search for `kitchen_cooking_engine` to see initialization messages.

---

### Version Format Examples

The workflow generates version tags automatically based on your inputs:

#### Default Format (Auto-generated)

**Pattern:** `v{base_version}-{release_type}.{branch_name}.{timestamp}`

| Input | Generated Tag | Description |
|-------|---------------|-------------|
| Release type: `test`<br>Branch: `feature/new-sensor`<br>Suffix: *(empty)* | `v0.1.2.18-test.feature-new-sensor.20260107221730` | Sanitized branch name + timestamp |
| Release type: `beta`<br>Branch: `fix/temperature-bug`<br>Suffix: *(empty)* | `v0.1.2.18-beta.fix-temperature-bug.20260107221730` | Slashes replaced with hyphens |
| Release type: `rc`<br>Branch: `copilot/add-test-release-workflow`<br>Suffix: *(empty)* | `v0.1.2.18-rc.copilot-add-test-release-workflow.20260107221730` | Long branch names included |

#### Custom Suffix Format

**Pattern:** `v{base_version}-{release_type}.{custom_suffix}`

| Input | Generated Tag | Description |
|-------|---------------|-------------|
| Release type: `test`<br>Suffix: `john-testing` | `v0.1.2.18-test.john-testing` | Custom identifier |
| Release type: `beta`<br>Suffix: `v2` | `v0.1.2.18-beta.v2` | Iteration number |
| Release type: `rc`<br>Suffix: `final-review` | `v0.1.2.18-rc.final-review` | Descriptive suffix |

---

### Troubleshooting

#### Issue: Workflow doesn't appear in Actions UI

**Cause:** The workflow file hasn't been merged to the `main` branch yet.

**Solution:**
1. Merge the PR containing the workflow to `main`
2. Refresh the Actions page
3. The workflow should now appear

#### Issue: "Tag already exists" error

**Cause:** A release with the same version tag already exists.

**Solutions:**
- Use a custom suffix to make the version unique
- Delete the old release/tag from GitHub if it's no longer needed
- Wait a second and retry (timestamps change every second)

#### Issue: HACS doesn't show the test version

**Cause:** HACS may be caching the release list.

**Solutions:**
1. In HACS, click **⋮** → **Custom repositories**
2. Remove and re-add the repository
3. Or wait 5-10 minutes for HACS to refresh automatically

#### Issue: ZIP file structure is incorrect

**Cause:** The workflow expects the integration at `custom_components/kitchen_cooking_engine/`.

**Solution:**
- Verify the directory structure in your branch matches:
  ```
  custom_components/
    └── kitchen_cooking_engine/
        ├── __init__.py
        ├── manifest.json
        ├── sensor.py
        └── ...
  ```

#### Issue: Release is created but ZIP is missing

**Cause:** The "Upload ZIP to release" step may have failed.

**Solutions:**
1. Check the workflow logs for the upload step
2. Verify the ZIP was created in the "Create ZIP archive" step
3. Re-run the workflow

#### Issue: "Permission denied" when creating release

**Cause:** The workflow doesn't have write permissions.

**Solution:**
- The workflow already includes `permissions: contents: write`
- Verify your repository settings allow GitHub Actions to create releases:
  - Go to **Settings** → **Actions** → **General**
  - Under "Workflow permissions", select "Read and write permissions"

#### Issue: Workflow runs but HACS installation fails

**Cause:** The manifest.json or other required files might be missing from the ZIP.

**Solutions:**
1. Download the ZIP from the release
2. Extract and verify it contains:
   - `kitchen_cooking_engine/manifest.json`
   - `kitchen_cooking_engine/__init__.py`
   - All other integration files
3. If files are missing, check the ZIP creation step in the workflow logs

---

## HACS Validation Workflow

**Workflow File:** `.github/workflows/hacs-validation.yml`

This workflow automatically validates the integration against HACS requirements on every push, pull request, and daily via cron.

**What it checks:**
- ✅ Repository structure
- ✅ `manifest.json` validity
- ✅ `hacs.json` configuration
- ✅ Required files present
- ✅ HACS integration standards compliance

This workflow runs automatically and doesn't require manual triggering.

---

## Best Practices

### When to Use Test Releases

- ✅ Testing new features before merging
- ✅ Sharing work-in-progress with other developers
- ✅ User acceptance testing (UAT)
- ✅ Bug fix verification
- ✅ Performance testing

### When NOT to Use Test Releases

- ❌ Production deployments (use proper releases from `main`)
- ❌ Stable user installations
- ❌ Long-term testing (test releases may be cleaned up)

### Version Naming Guidelines

| Release Type | Use Case | Example |
|--------------|----------|---------|
| `test` | Quick testing, experimental features | `v0.1.2.18-test.experiment.20260107221730` |
| `beta` | Feature-complete but needs testing | `v0.1.2.18-beta.new-ui.20260107221730` |
| `rc` | Release candidate, final testing | `v0.1.2.18-rc.v1.20260107221730` |

### Cleaning Up Old Releases

Test releases should be deleted after:
- Feature is merged to main
- Bug is fixed and verified
- Testing is complete

To delete:
1. Go to **Releases**
2. Click on the release
3. Click **Delete** (bottom of page)
4. Confirm deletion
5. Optionally delete the tag: `git push --delete origin <tag-name>`

---

## Additional Resources

- [HACS Documentation](https://hacs.xyz/)
- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Home Assistant Integration Development](https://developers.home-assistant.io/)
- [Kitchen Cooking Engine Repository](https://github.com/R00S/meater-in-local-haos)

---

## Questions or Issues?

If you encounter problems not covered in this documentation:

1. Check the [GitHub Issues](https://github.com/R00S/meater-in-local-haos/issues)
2. Create a new issue with:
   - Workflow run URL
   - Error messages from logs
   - Steps to reproduce
   - Expected vs actual behavior
