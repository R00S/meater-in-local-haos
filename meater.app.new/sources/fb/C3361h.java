package fb;

import Ba.l;
import Hb.AbstractC1082f0;
import Ra.InterfaceC1692e;

/* renamed from: fb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3361h implements l {

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC1692e f41442B;

    /* renamed from: C, reason: collision with root package name */
    private final C3362i f41443C;

    /* renamed from: D, reason: collision with root package name */
    private final AbstractC1082f0 f41444D;

    /* renamed from: E, reason: collision with root package name */
    private final C3354a f41445E;

    public C3361h(InterfaceC1692e interfaceC1692e, C3362i c3362i, AbstractC1082f0 abstractC1082f0, C3354a c3354a) {
        this.f41442B = interfaceC1692e;
        this.f41443C = c3362i;
        this.f41444D = abstractC1082f0;
        this.f41445E = c3354a;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return C3362i.k(this.f41442B, this.f41443C, this.f41444D, this.f41445E, (Ib.g) obj);
    }
}
