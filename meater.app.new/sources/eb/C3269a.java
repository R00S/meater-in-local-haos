package eb;

import hb.InterfaceC3525r;

/* renamed from: eb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3269a implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final C3270b f40874B;

    public C3269a(C3270b c3270b) {
        this.f40874B = c3270b;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(C3270b.h(this.f40874B, (InterfaceC3525r) obj));
    }
}
