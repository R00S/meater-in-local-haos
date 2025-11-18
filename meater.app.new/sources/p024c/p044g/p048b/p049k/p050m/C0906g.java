package p024c.p044g.p048b.p049k.p050m;

import p024c.p044g.p048b.p049k.p050m.C0905f;

/* compiled from: DimensionDependency.java */
/* renamed from: c.g.b.k.m.g */
/* loaded from: classes.dex */
class C0906g extends C0905f {

    /* renamed from: m */
    public int f6129m;

    public C0906g(AbstractC0915p abstractC0915p) {
        super(abstractC0915p);
        if (abstractC0915p instanceof C0911l) {
            this.f6112e = C0905f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f6112e = C0905f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.C0905f
    /* renamed from: d */
    public void mo5830d(int i2) {
        if (this.f6117j) {
            return;
        }
        this.f6117j = true;
        this.f6114g = i2;
        for (InterfaceC0903d interfaceC0903d : this.f6118k) {
            interfaceC0903d.mo5808a(interfaceC0903d);
        }
    }
}
