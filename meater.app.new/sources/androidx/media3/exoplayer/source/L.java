package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.r;

/* compiled from: WrappingMediaSource.java */
/* loaded from: classes.dex */
public abstract class L extends AbstractC2139c<Void> {

    /* renamed from: l, reason: collision with root package name */
    private static final Void f27688l = null;

    /* renamed from: k, reason: collision with root package name */
    protected final r f27689k;

    protected L(r rVar) {
        this.f27689k = rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC2139c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final r.b C(Void r12, r.b bVar) {
        return I(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC2139c
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final long D(Void r12, long j10, r.b bVar) {
        return K(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC2139c
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final int E(Void r12, int i10) {
        return M(i10);
    }

    protected abstract void O(U1.G g10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC2139c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void F(Void r12, r rVar, U1.G g10) {
        O(g10);
    }

    protected final void Q() {
        H(f27688l, this.f27689k);
    }

    protected void R() {
        Q();
    }

    @Override // androidx.media3.exoplayer.source.r
    public U1.v h() {
        return this.f27689k.h();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(U1.v vVar) {
        this.f27689k.j(vVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k() {
        return this.f27689k.k();
    }

    @Override // androidx.media3.exoplayer.source.r
    public U1.G l() {
        return this.f27689k.l();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.AbstractC2137a
    protected final void y(a2.n nVar) {
        super.y(nVar);
        R();
    }

    protected r.b I(r.b bVar) {
        return bVar;
    }

    protected int M(int i10) {
        return i10;
    }

    protected long K(long j10, r.b bVar) {
        return j10;
    }
}
