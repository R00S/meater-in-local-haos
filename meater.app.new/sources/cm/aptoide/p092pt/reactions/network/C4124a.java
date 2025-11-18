package cm.aptoide.p092pt.reactions.network;

import p456rx.p460m.InterfaceC11256e;
import retrofit2.Response;

/* compiled from: lambda */
/* renamed from: cm.aptoide.pt.reactions.network.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C4124a implements InterfaceC11256e {

    /* renamed from: f */
    public final /* synthetic */ ReactionsRemoteService f10949f;

    public /* synthetic */ C4124a(ReactionsRemoteService reactionsRemoteService) {
        this.f10949f = reactionsRemoteService;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    public final Object call(Object obj) {
        return this.f10949f.mapResponse((Response) obj);
    }
}
