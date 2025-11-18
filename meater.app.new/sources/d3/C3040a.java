package d3;

import X1.y;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.L;
import v2.r;

/* compiled from: WebpExtractor.java */
/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3040a implements InterfaceC4810p {

    /* renamed from: a, reason: collision with root package name */
    private final y f39721a = new y(4);

    /* renamed from: b, reason: collision with root package name */
    private final L f39722b = new L(-1, -1, "image/webp");

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f39722b.b(j10, j11);
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        this.f39721a.S(4);
        interfaceC4811q.p(this.f39721a.e(), 0, 4);
        if (this.f39721a.J() != 1380533830) {
            return false;
        }
        interfaceC4811q.j(4);
        this.f39721a.S(4);
        interfaceC4811q.p(this.f39721a.e(), 0, 4);
        return this.f39721a.J() == 1464156752;
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f39722b.h(rVar);
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        return this.f39722b.i(interfaceC4811q, i10);
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
