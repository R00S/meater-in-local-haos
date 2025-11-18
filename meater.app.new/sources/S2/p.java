package S2;

import X1.C1804a;
import java.util.List;

/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes.dex */
public abstract class p extends c2.e implements k {

    /* renamed from: F, reason: collision with root package name */
    private k f15289F;

    /* renamed from: G, reason: collision with root package name */
    private long f15290G;

    public void D(long j10, k kVar, long j11) {
        this.f30929C = j10;
        this.f15289F = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f15290G = j10;
    }

    @Override // S2.k
    public int c(long j10) {
        return ((k) C1804a.e(this.f15289F)).c(j10 - this.f15290G);
    }

    @Override // S2.k
    public long j(int i10) {
        return ((k) C1804a.e(this.f15289F)).j(i10) + this.f15290G;
    }

    @Override // S2.k
    public List<W1.a> n(long j10) {
        return ((k) C1804a.e(this.f15289F)).n(j10 - this.f15290G);
    }

    @Override // S2.k
    public int p() {
        return ((k) C1804a.e(this.f15289F)).p();
    }

    @Override // c2.e, c2.AbstractC2308a
    public void t() {
        super.t();
        this.f15289F = null;
    }
}
