package n2;

import X1.C1804a;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.source.G;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: CompositeSequenceableLoader.java */
/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4056d implements G {

    /* renamed from: B, reason: collision with root package name */
    private final AbstractC4009y<a> f45613B;

    /* renamed from: C, reason: collision with root package name */
    private long f45614C;

    /* compiled from: CompositeSequenceableLoader.java */
    /* renamed from: n2.d$a */
    private static final class a implements G {

        /* renamed from: B, reason: collision with root package name */
        private final G f45615B;

        /* renamed from: C, reason: collision with root package name */
        private final AbstractC4009y<Integer> f45616C;

        public a(G g10, List<Integer> list) {
            this.f45615B = g10;
            this.f45616C = AbstractC4009y.B(list);
        }

        public AbstractC4009y<Integer> a() {
            return this.f45616C;
        }

        @Override // androidx.media3.exoplayer.source.G
        public boolean b(W w10) {
            return this.f45615B.b(w10);
        }

        @Override // androidx.media3.exoplayer.source.G
        public long c() {
            return this.f45615B.c();
        }

        @Override // androidx.media3.exoplayer.source.G
        public boolean e() {
            return this.f45615B.e();
        }

        @Override // androidx.media3.exoplayer.source.G
        public long g() {
            return this.f45615B.g();
        }

        @Override // androidx.media3.exoplayer.source.G
        public void h(long j10) {
            this.f45615B.h(j10);
        }
    }

    public C4056d(List<? extends G> list, List<List<Integer>> list2) {
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        C1804a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarY.a(new a(list.get(i10), list2.get(i10)));
        }
        this.f45613B = aVarY.k();
        this.f45614C = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        boolean zB;
        boolean z10 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                break;
            }
            zB = false;
            for (int i10 = 0; i10 < this.f45613B.size(); i10++) {
                long jC2 = this.f45613B.get(i10).c();
                boolean z11 = jC2 != Long.MIN_VALUE && jC2 <= w10.f26554a;
                if (jC2 == jC || z11) {
                    zB |= this.f45613B.get(i10).b(w10);
                }
            }
            z10 |= zB;
        } while (zB);
        return z10;
    }

    @Override // androidx.media3.exoplayer.source.G
    public long c() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f45613B.size(); i10++) {
            long jC = this.f45613B.get(i10).c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean e() {
        for (int i10 = 0; i10 < this.f45613B.size(); i10++) {
            if (this.f45613B.get(i10).e()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.G
    public long g() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f45613B.size(); i10++) {
            a aVar = this.f45613B.get(i10);
            long jG = aVar.g();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
            if (jG != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jG);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f45614C = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f45614C;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.G
    public void h(long j10) {
        for (int i10 = 0; i10 < this.f45613B.size(); i10++) {
            this.f45613B.get(i10).h(j10);
        }
    }
}
