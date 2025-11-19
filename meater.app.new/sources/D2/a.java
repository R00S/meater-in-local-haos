package D2;

import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.L;
import v2.r;

/* compiled from: JpegExtractor.java */
/* loaded from: classes.dex */
public final class a implements InterfaceC4810p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4810p f3346a;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f3346a = new L(65496, 2, "image/jpeg");
        } else {
            this.f3346a = new b();
        }
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f3346a.b(j10, j11);
    }

    @Override // v2.InterfaceC4810p
    public void c() {
        this.f3346a.c();
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        return this.f3346a.d(interfaceC4811q);
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f3346a.h(rVar);
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        return this.f3346a.i(interfaceC4811q, i10);
    }
}
