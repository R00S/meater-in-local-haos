package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* renamed from: com.google.android.gms.internal.ads.pv */
/* loaded from: classes2.dex */
final class C7057pv implements InterfaceC6947mw {

    /* renamed from: a */
    private static final InterfaceC7390yv f20331a = new C7131rv();

    /* renamed from: b */
    private final InterfaceC7390yv f20332b;

    public C7057pv() {
        this(new C7168sv(C6687fv.m15150c(), m15785c()));
    }

    /* renamed from: b */
    private static boolean m15784b(InterfaceC7353xv interfaceC7353xv) {
        return interfaceC7353xv.mo15355c() == zzdob.zze.f25766i;
    }

    /* renamed from: c */
    private static InterfaceC7390yv m15785c() {
        try {
            return (InterfaceC7390yv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f20331a;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6947mw
    /* renamed from: a */
    public final <T> InterfaceC6910lw<T> mo15574a(Class<T> cls) {
        C6984nw.m15612L(cls);
        InterfaceC7353xv interfaceC7353xvMo15151a = this.f20332b.mo15151a(cls);
        return interfaceC7353xvMo15151a.mo15353a() ? zzdob.class.isAssignableFrom(cls) ? C6540bw.m14953k(C6984nw.m15649s(), C7352xu.m16047b(), interfaceC7353xvMo15151a.mo15354b()) : C6540bw.m14953k(C6984nw.m15647q(), C7352xu.m16048c(), interfaceC7353xvMo15151a.mo15354b()) : zzdob.class.isAssignableFrom(cls) ? m15784b(interfaceC7353xvMo15151a) ? C6503aw.m14810p(cls, interfaceC7353xvMo15151a, C6651ew.m15115b(), AbstractC6872kv.m15440d(), C6984nw.m15649s(), C7352xu.m16047b(), C7316wv.m15982b()) : C6503aw.m14810p(cls, interfaceC7353xvMo15151a, C6651ew.m15115b(), AbstractC6872kv.m15440d(), C6984nw.m15649s(), null, C7316wv.m15982b()) : m15784b(interfaceC7353xvMo15151a) ? C6503aw.m14810p(cls, interfaceC7353xvMo15151a, C6651ew.m15114a(), AbstractC6872kv.m15439c(), C6984nw.m15647q(), C7352xu.m16048c(), C7316wv.m15981a()) : C6503aw.m14810p(cls, interfaceC7353xvMo15151a, C6651ew.m15114a(), AbstractC6872kv.m15439c(), C6984nw.m15648r(), null, C7316wv.m15981a());
    }

    private C7057pv(InterfaceC7390yv interfaceC7390yv) {
        this.f20332b = (InterfaceC7390yv) zzdod.m19743d(interfaceC7390yv, "messageInfoFactory");
    }
}
