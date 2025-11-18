package cm.aptoide.p092pt.actions;

import android.annotation.TargetApi;
import p456rx.p460m.InterfaceC11252a;

/* loaded from: classes.dex */
public interface PermissionService {
    @TargetApi(23)
    void hasDownloadAccess(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2);

    @TargetApi(23)
    void requestAccessToAccounts(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2);

    @TargetApi(23)
    void requestAccessToAccounts(boolean z, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2);

    @TargetApi(23)
    void requestAccessToCamera(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, int i2, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2);

    @TargetApi(23)
    void requestDownloadAccess(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2, boolean z, boolean z2, long j2);
}
