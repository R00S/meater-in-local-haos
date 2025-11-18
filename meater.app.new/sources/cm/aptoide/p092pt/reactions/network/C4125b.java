package cm.aptoide.p092pt.reactions.network;

import p456rx.p460m.InterfaceC11256e;

/* compiled from: lambda */
/* renamed from: cm.aptoide.pt.reactions.network.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C4125b implements InterfaceC11256e {

    /* renamed from: f */
    public final /* synthetic */ ReactionsRemoteService f10950f;

    public /* synthetic */ C4125b(ReactionsRemoteService reactionsRemoteService) {
        this.f10950f = reactionsRemoteService;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    public final Object call(Object obj) {
        return this.f10950f.mapErrorResponse((Throwable) obj);
    }
}
