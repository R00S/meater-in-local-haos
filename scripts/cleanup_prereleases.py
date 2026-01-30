#!/usr/bin/env python3
"""
Script to delete all prerelease versions from the GitHub repository,
keeping only releases that were marked as "latest" (prerelease=false).

This helps make the early semi-working releases visible in HACS, which only
shows a limited number of releases.

Usage:
    # Dry run (list what would be deleted)
    python3 cleanup_prereleases.py --dry-run

    # Actually delete (requires GITHUB_TOKEN environment variable)
    export GITHUB_TOKEN=your_token_here
    python3 cleanup_prereleases.py

    # Delete with token as argument
    python3 cleanup_prereleases.py --token ghp_your_token_here
"""
import os
import sys
import argparse

try:
    from github import Github
except ImportError:
    print("ERROR: PyGithub is not installed.")
    print("Install it with: pip install PyGithub")
    sys.exit(1)


def main():
    parser = argparse.ArgumentParser(
        description='Delete prerelease versions from GitHub repository'
    )
    parser.add_argument(
        '--token',
        help='GitHub personal access token (or set GITHUB_TOKEN env var)',
        default=os.environ.get('GITHUB_TOKEN')
    )
    parser.add_argument(
        '--repo',
        help='Repository in format owner/repo',
        default='R00S/meater-in-local-haos'
    )
    parser.add_argument(
        '--dry-run',
        action='store_true',
        help='List releases without deleting'
    )
    
    args = parser.parse_args()
    
    if not args.token and not args.dry_run:
        print("ERROR: GitHub token is required for deletion.")
        print("Provide it via --token argument or GITHUB_TOKEN environment variable.")
        print("Or use --dry-run to just list what would be deleted.")
        sys.exit(1)
    
    # Initialize GitHub client
    if args.token:
        g = Github(args.token)
    else:
        g = Github()  # Anonymous access for dry run
    
    try:
        repo = g.get_repo(args.repo)
    except Exception as e:
        print(f"ERROR: Failed to access repository {args.repo}: {e}")
        sys.exit(1)
    
    print(f"{'='*80}")
    print(f"Cleanup Prerelease Versions - {'DRY RUN' if args.dry_run else 'EXECUTING'}")
    print(f"Repository: {args.repo}")
    print(f"{'='*80}\n")
    
    # Fetch all releases
    print("Fetching all releases...")
    try:
        releases = list(repo.get_releases())
    except Exception as e:
        print(f"ERROR: Failed to fetch releases: {e}")
        sys.exit(1)
    
    print(f"Total releases found: {len(releases)}\n")
    
    # Categorize releases
    to_keep = []
    to_delete = []
    
    for release in releases:
        if not release.prerelease and not release.draft:
            to_keep.append(release)
        elif release.prerelease:
            to_delete.append(release)
    
    print(f"Releases to KEEP (prerelease=false): {len(to_keep)}")
    print(f"Releases to DELETE (prerelease=true): {len(to_delete)}\n")
    
    print(f"{'='*80}")
    print("RELEASES TO KEEP:")
    print(f"{'='*80}")
    for r in sorted(to_keep, key=lambda x: x.tag_name):
        print(f"  ✓ {r.tag_name}")
    
    print(f"\n{'='*80}")
    print(f"RELEASES TO DELETE ({len(to_delete)} total):")
    print(f"{'='*80}")
    
    # Show first 30 releases that will be deleted
    display_list = sorted(to_delete, key=lambda x: x.tag_name)
    for release in display_list[:30]:
        print(f"  ✗ {release.tag_name} (ID: {release.id})")
    
    if len(to_delete) > 30:
        print(f"  ... and {len(to_delete) - 30} more")
    
    # Perform deletion if not dry run
    if not args.dry_run:
        print(f"\n{'='*80}")
        print("DELETING RELEASES...")
        print(f"{'='*80}\n")
        
        deleted_count = 0
        errors = []
        
        for i, release in enumerate(sorted(to_delete, key=lambda x: x.tag_name), 1):
            print(f"[{i}/{len(to_delete)}] Deleting: {release.tag_name}", end=" ... ")
            try:
                release.delete_release()
                print("✓ DELETED")
                deleted_count += 1
            except Exception as e:
                error_msg = f"Failed to delete {release.tag_name}: {str(e)}"
                print(f"✗ ERROR: {str(e)}")
                errors.append(error_msg)
        
        print(f"\n{'='*80}")
        print("SUMMARY")
        print(f"{'='*80}")
        print(f"Successfully deleted: {deleted_count}/{len(to_delete)} releases")
        print(f"Kept: {len(to_keep)} latest releases")
        if errors:
            print(f"\nErrors encountered: {len(errors)}")
            for err in errors:
                print(f"  - {err}")
            sys.exit(1)
        else:
            print("\n✓ All prerelease versions successfully deleted!")
            print(f"✓ {len(to_keep)} latest releases remain visible in HACS")
        print(f"{'='*80}")
    else:
        print(f"\n{'='*80}")
        print("DRY RUN SUMMARY")
        print(f"{'='*80}")
        print(f"Would delete: {len(to_delete)} prerelease versions")
        print(f"Would keep: {len(to_keep)} latest releases")
        print(f"\nTo actually delete these releases, run without --dry-run:")
        print(f"  export GITHUB_TOKEN=your_token")
        print(f"  python3 {sys.argv[0]}")
        print(f"{'='*80}")


if __name__ == '__main__':
    main()
