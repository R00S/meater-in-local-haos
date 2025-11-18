package cm.aptoide.p092pt.actions;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;

/* loaded from: classes.dex */
public class RequestAccessToExternalFileSystemOnSubscribe implements C11234e.a<Void> {
    private final PermissionService permissionService;

    public RequestAccessToExternalFileSystemOnSubscribe(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    static /* synthetic */ void lambda$call$0(AbstractC11245j abstractC11245j) {
        if (abstractC11245j.isUnsubscribed()) {
            return;
        }
        abstractC11245j.onNext(null);
        abstractC11245j.onCompleted();
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Void> abstractC11245j) {
        this.permissionService.requestAccessToExternalFileSystem(new InterfaceC11252a() { // from class: cm.aptoide.pt.actions.c
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                RequestAccessToExternalFileSystemOnSubscribe.lambda$call$0(abstractC11245j);
            }
        }, new InterfaceC11252a() { // from class: cm.aptoide.pt.actions.d
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                abstractC11245j.onError(new SecurityException("Permission denied to access to external storage."));
            }
        });
    }
}
