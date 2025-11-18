package androidx.lifecycle;

import androidx.lifecycle.AbstractC0511g;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements InterfaceC0513i {

    /* renamed from: a */
    private final InterfaceC0510f[] f3418a;

    CompositeGeneratedAdaptersObserver(InterfaceC0510f[] interfaceC0510fArr) {
        this.f3418a = interfaceC0510fArr;
    }

    @Override // androidx.lifecycle.InterfaceC0513i
    /* renamed from: a */
    public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
        C0520p c0520p = new C0520p();
        for (InterfaceC0510f interfaceC0510f : this.f3418a) {
            interfaceC0510f.m3860a(interfaceC0515k, bVar, false, c0520p);
        }
        for (InterfaceC0510f interfaceC0510f2 : this.f3418a) {
            interfaceC0510f2.m3860a(interfaceC0515k, bVar, true, c0520p);
        }
    }
}
