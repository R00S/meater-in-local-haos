package b1;

import b1.C2201f;

/* compiled from: DimensionDependency.java */
/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2202g extends C2201f {

    /* renamed from: m, reason: collision with root package name */
    public int f30042m;

    C2202g(p pVar) {
        super(pVar);
        if (pVar instanceof C2207l) {
            this.f30025e = C2201f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f30025e = C2201f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // b1.C2201f
    public void d(int i10) {
        if (this.f30030j) {
            return;
        }
        this.f30030j = true;
        this.f30027g = i10;
        for (InterfaceC2199d interfaceC2199d : this.f30031k) {
            interfaceC2199d.a(interfaceC2199d);
        }
    }
}
