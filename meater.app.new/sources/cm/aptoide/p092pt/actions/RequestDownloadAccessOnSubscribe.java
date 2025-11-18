package cm.aptoide.p092pt.actions;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;

/* loaded from: classes.dex */
public class RequestDownloadAccessOnSubscribe implements C11234e.a<Void> {
    private final boolean allowDownloadOnMobileData;
    private final boolean canBypassWifi;
    private final PermissionService permissionRequest;
    private final long size;

    public RequestDownloadAccessOnSubscribe(PermissionService permissionService, boolean z, boolean z2, long j2) {
        this.permissionRequest = permissionService;
        this.allowDownloadOnMobileData = z;
        this.canBypassWifi = z2;
        this.size = j2;
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
        this.permissionRequest.requestDownloadAccess(new InterfaceC11252a() { // from class: cm.aptoide.pt.actions.f
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                RequestDownloadAccessOnSubscribe.lambda$call$0(abstractC11245j);
            }
        }, new InterfaceC11252a() { // from class: cm.aptoide.pt.actions.e
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                abstractC11245j.onError(new SecurityException("Permission denied to download file"));
            }
        }, this.allowDownloadOnMobileData, this.canBypassWifi, this.size);
    }
}
