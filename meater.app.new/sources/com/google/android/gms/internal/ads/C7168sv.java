package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sv */
/* loaded from: classes2.dex */
final class C7168sv implements InterfaceC7390yv {

    /* renamed from: a */
    private InterfaceC7390yv[] f20542a;

    C7168sv(InterfaceC7390yv... interfaceC7390yvArr) {
        this.f20542a = interfaceC7390yvArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7390yv
    /* renamed from: a */
    public final InterfaceC7353xv mo15151a(Class<?> cls) {
        for (InterfaceC7390yv interfaceC7390yv : this.f20542a) {
            if (interfaceC7390yv.mo15152b(cls)) {
                return interfaceC7390yv.mo15151a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7390yv
    /* renamed from: b */
    public final boolean mo15152b(Class<?> cls) {
        for (InterfaceC7390yv interfaceC7390yv : this.f20542a) {
            if (interfaceC7390yv.mo15152b(cls)) {
                return true;
            }
        }
        return false;
    }
}
