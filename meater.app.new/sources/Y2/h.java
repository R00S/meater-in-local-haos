package Y2;

import S2.k;
import X1.L;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: TtmlSubtitle.java */
/* loaded from: classes.dex */
final class h implements k {

    /* renamed from: B, reason: collision with root package name */
    private final c f19381B;

    /* renamed from: C, reason: collision with root package name */
    private final long[] f19382C;

    /* renamed from: D, reason: collision with root package name */
    private final Map<String, g> f19383D;

    /* renamed from: E, reason: collision with root package name */
    private final Map<String, e> f19384E;

    /* renamed from: F, reason: collision with root package name */
    private final Map<String, String> f19385F;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f19381B = cVar;
        this.f19384E = map2;
        this.f19385F = map3;
        this.f19383D = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f19382C = cVar.j();
    }

    @Override // S2.k
    public int c(long j10) {
        int iE = L.e(this.f19382C, j10, false, false);
        if (iE < this.f19382C.length) {
            return iE;
        }
        return -1;
    }

    @Override // S2.k
    public long j(int i10) {
        return this.f19382C[i10];
    }

    @Override // S2.k
    public List<W1.a> n(long j10) {
        return this.f19381B.h(j10, this.f19383D, this.f19384E, this.f19385F);
    }

    @Override // S2.k
    public int p() {
        return this.f19382C.length;
    }
}
