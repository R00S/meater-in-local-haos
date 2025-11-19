package T2;

import S2.k;
import X1.C1804a;
import java.util.Collections;
import java.util.List;

/* compiled from: CeaSubtitle.java */
/* loaded from: classes.dex */
final class f implements k {

    /* renamed from: B, reason: collision with root package name */
    private final List<W1.a> f15870B;

    public f(List<W1.a> list) {
        this.f15870B = list;
    }

    @Override // S2.k
    public int c(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // S2.k
    public long j(int i10) {
        C1804a.a(i10 == 0);
        return 0L;
    }

    @Override // S2.k
    public List<W1.a> n(long j10) {
        return j10 >= 0 ? this.f15870B : Collections.emptyList();
    }

    @Override // S2.k
    public int p() {
        return 1;
    }
}
