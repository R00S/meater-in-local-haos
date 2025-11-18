package cm.aptoide.p092pt.home.bundles;

import p456rx.p460m.InterfaceC11256e;

/* compiled from: lambda */
/* renamed from: cm.aptoide.pt.home.bundles.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C3003d implements InterfaceC11256e {

    /* renamed from: f */
    public final /* synthetic */ BundlesRepository f9550f;

    public /* synthetic */ C3003d(BundlesRepository bundlesRepository) {
        this.f9550f = bundlesRepository;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    public final Object call(Object obj) {
        return this.f9550f.cloneList((HomeBundlesModel) obj);
    }
}
