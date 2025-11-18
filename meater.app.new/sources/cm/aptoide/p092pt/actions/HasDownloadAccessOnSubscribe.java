package cm.aptoide.p092pt.actions;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;

/* loaded from: classes.dex */
public class HasDownloadAccessOnSubscribe implements C11234e.a<Boolean> {
    private final PermissionService permissionService;

    public HasDownloadAccessOnSubscribe(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    static /* synthetic */ void lambda$call$0(AbstractC11245j abstractC11245j) {
        if (abstractC11245j.isUnsubscribed()) {
            return;
        }
        abstractC11245j.onNext(Boolean.TRUE);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$call$1(AbstractC11245j abstractC11245j) {
        if (abstractC11245j.isUnsubscribed()) {
            return;
        }
        abstractC11245j.onNext(Boolean.FALSE);
        abstractC11245j.onCompleted();
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Boolean> abstractC11245j) {
        this.permissionService.hasDownloadAccess(new InterfaceC11252a() { // from class: cm.aptoide.pt.actions.b
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                HasDownloadAccessOnSubscribe.lambda$call$0(abstractC11245j);
            }
        }, new InterfaceC11252a() { // from class: cm.aptoide.pt.actions.a
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                HasDownloadAccessOnSubscribe.lambda$call$1(abstractC11245j);
            }
        });
    }
}
