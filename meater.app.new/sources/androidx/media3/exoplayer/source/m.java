package androidx.media3.exoplayer.source;

import U1.G;

/* compiled from: ForwardingTimeline.java */
/* loaded from: classes.dex */
public abstract class m extends U1.G {

    /* renamed from: e, reason: collision with root package name */
    protected final U1.G f27784e;

    public m(U1.G g10) {
        this.f27784e = g10;
    }

    @Override // U1.G
    public int a(boolean z10) {
        return this.f27784e.a(z10);
    }

    @Override // U1.G
    public int b(Object obj) {
        return this.f27784e.b(obj);
    }

    @Override // U1.G
    public int c(boolean z10) {
        return this.f27784e.c(z10);
    }

    @Override // U1.G
    public int e(int i10, int i11, boolean z10) {
        return this.f27784e.e(i10, i11, z10);
    }

    @Override // U1.G
    public G.b g(int i10, G.b bVar, boolean z10) {
        return this.f27784e.g(i10, bVar, z10);
    }

    @Override // U1.G
    public int i() {
        return this.f27784e.i();
    }

    @Override // U1.G
    public int l(int i10, int i11, boolean z10) {
        return this.f27784e.l(i10, i11, z10);
    }

    @Override // U1.G
    public Object m(int i10) {
        return this.f27784e.m(i10);
    }

    @Override // U1.G
    public G.c o(int i10, G.c cVar, long j10) {
        return this.f27784e.o(i10, cVar, j10);
    }

    @Override // U1.G
    public int p() {
        return this.f27784e.p();
    }
}
