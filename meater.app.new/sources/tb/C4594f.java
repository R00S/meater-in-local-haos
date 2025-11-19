package tb;

import Ra.InterfaceC1688a;
import Ra.InterfaceC1700m;

/* renamed from: tb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4594f implements Ba.p {

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC1688a f50011B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC1688a f50012C;

    public C4594f(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2) {
        this.f50011B = interfaceC1688a;
        this.f50012C = interfaceC1688a2;
    }

    @Override // Ba.p
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(C4595g.i(this.f50011B, this.f50012C, (InterfaceC1700m) obj, (InterfaceC1700m) obj2));
    }
}
