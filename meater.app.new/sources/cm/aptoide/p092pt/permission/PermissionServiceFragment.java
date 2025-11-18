package cm.aptoide.p092pt.permission;

import android.annotation.TargetApi;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.view.BackButtonFragment;
import p456rx.p460m.InterfaceC11252a;

/* loaded from: classes.dex */
public abstract class PermissionServiceFragment extends BackButtonFragment implements PermissionService {
    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void hasDownloadAccess(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        try {
            ((PermissionService) getActivity()).hasDownloadAccess(interfaceC11252a, interfaceC11252a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToAccounts(interfaceC11252a, interfaceC11252a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToCamera(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToCamera(interfaceC11252a, interfaceC11252a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(interfaceC11252a, interfaceC11252a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestDownloadAccess(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2, boolean z, boolean z2, long j2) {
        try {
            ((PermissionService) getActivity()).requestDownloadAccess(interfaceC11252a, interfaceC11252a2, z, z2, j2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(boolean z, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToAccounts(z, interfaceC11252a, interfaceC11252a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(z, interfaceC11252a, interfaceC11252a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, int i2, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(z, i2, interfaceC11252a, interfaceC11252a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }
}
