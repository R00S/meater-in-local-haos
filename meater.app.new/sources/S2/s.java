package S2;

import S2.r;
import android.util.SparseArray;
import v2.J;
import v2.O;

/* compiled from: SubtitleTranscodingExtractorOutput.java */
/* loaded from: classes.dex */
public final class s implements v2.r {

    /* renamed from: B, reason: collision with root package name */
    private final v2.r f15296B;

    /* renamed from: C, reason: collision with root package name */
    private final r.a f15297C;

    /* renamed from: D, reason: collision with root package name */
    private final SparseArray<u> f15298D = new SparseArray<>();

    public s(v2.r rVar, r.a aVar) {
        this.f15296B = rVar;
        this.f15297C = aVar;
    }

    @Override // v2.r
    public O a(int i10, int i11) {
        if (i11 != 3) {
            return this.f15296B.a(i10, i11);
        }
        u uVar = this.f15298D.get(i10);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.f15296B.a(i10, i11), this.f15297C);
        this.f15298D.put(i10, uVar2);
        return uVar2;
    }

    @Override // v2.r
    public void f(J j10) {
        this.f15296B.f(j10);
    }

    @Override // v2.r
    public void n() {
        this.f15296B.n();
    }
}
