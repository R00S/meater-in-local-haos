package y2;

import X1.y;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.L;
import v2.r;

/* compiled from: AvifExtractor.java */
/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5122a implements InterfaceC4810p {

    /* renamed from: a, reason: collision with root package name */
    private final y f53102a = new y(4);

    /* renamed from: b, reason: collision with root package name */
    private final L f53103b = new L(-1, -1, "image/avif");

    private boolean a(InterfaceC4811q interfaceC4811q, int i10) {
        this.f53102a.S(4);
        interfaceC4811q.p(this.f53102a.e(), 0, 4);
        return this.f53102a.J() == ((long) i10);
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f53103b.b(j10, j11);
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        interfaceC4811q.j(4);
        return a(interfaceC4811q, 1718909296) && a(interfaceC4811q, 1635150182);
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f53103b.h(rVar);
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        return this.f53103b.i(interfaceC4811q, i10);
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
