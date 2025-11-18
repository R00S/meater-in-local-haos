package cm.aptoide.p092pt.actions;

import p456rx.C11234e;

/* loaded from: classes.dex */
public class PermissionManager {
    public C11234e<Boolean> hasDownloadAccess(PermissionService permissionService) {
        return C11234e.m40048l(new HasDownloadAccessOnSubscribe(permissionService));
    }

    public C11234e<Void> requestDownloadAccess(PermissionService permissionService) {
        return C11234e.m40048l(new RequestDownloadAccessOnSubscribe(permissionService, false, false, -1L));
    }

    public C11234e<Void> requestDownloadAccessWithWifiBypass(PermissionService permissionService, long j2) {
        return C11234e.m40048l(new RequestDownloadAccessOnSubscribe(permissionService, false, true, j2));
    }

    public C11234e<Void> requestDownloadAllowingMobileData(PermissionService permissionService) {
        return C11234e.m40048l(new RequestDownloadAccessOnSubscribe(permissionService, true, false, -1L));
    }

    public C11234e<Void> requestExternalStoragePermission(PermissionService permissionService) {
        return C11234e.m40048l(new RequestAccessToExternalFileSystemOnSubscribe(permissionService));
    }
}
