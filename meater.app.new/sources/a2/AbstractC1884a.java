package a2;

import X1.C1804a;
import X1.L;
import java.util.ArrayList;

/* compiled from: BaseDataSource.java */
/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1884a implements androidx.media3.datasource.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19969a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<n> f19970b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f19971c;

    /* renamed from: d, reason: collision with root package name */
    private g f19972d;

    protected AbstractC1884a(boolean z10) {
        this.f19969a = z10;
    }

    @Override // androidx.media3.datasource.a
    public final void g(n nVar) {
        C1804a.e(nVar);
        if (this.f19970b.contains(nVar)) {
            return;
        }
        this.f19970b.add(nVar);
        this.f19971c++;
    }

    protected final void q(int i10) {
        g gVar = (g) L.i(this.f19972d);
        for (int i11 = 0; i11 < this.f19971c; i11++) {
            this.f19970b.get(i11).h(this, gVar, this.f19969a, i10);
        }
    }

    protected final void r() {
        g gVar = (g) L.i(this.f19972d);
        for (int i10 = 0; i10 < this.f19971c; i10++) {
            this.f19970b.get(i10).d(this, gVar, this.f19969a);
        }
        this.f19972d = null;
    }

    protected final void s(g gVar) {
        for (int i10 = 0; i10 < this.f19971c; i10++) {
            this.f19970b.get(i10).i(this, gVar, this.f19969a);
        }
    }

    protected final void t(g gVar) {
        this.f19972d = gVar;
        for (int i10 = 0; i10 < this.f19971c; i10++) {
            this.f19970b.get(i10).c(this, gVar, this.f19969a);
        }
    }
}
