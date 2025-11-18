package androidx.media3.exoplayer.source;

import X1.C1804a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.source.q;
import d2.C3025C;

/* compiled from: TimeOffsetMediaPeriod.java */
/* loaded from: classes.dex */
final class K implements q, q.a {

    /* renamed from: B, reason: collision with root package name */
    private final q f27683B;

    /* renamed from: C, reason: collision with root package name */
    private final long f27684C;

    /* renamed from: D, reason: collision with root package name */
    private q.a f27685D;

    /* compiled from: TimeOffsetMediaPeriod.java */
    private static final class a implements n2.s {

        /* renamed from: B, reason: collision with root package name */
        private final n2.s f27686B;

        /* renamed from: C, reason: collision with root package name */
        private final long f27687C;

        public a(n2.s sVar, long j10) {
            this.f27686B = sVar;
            this.f27687C = j10;
        }

        @Override // n2.s
        public void a() {
            this.f27686B.a();
        }

        public n2.s b() {
            return this.f27686B;
        }

        @Override // n2.s
        public boolean f() {
            return this.f27686B.f();
        }

        @Override // n2.s
        public int n(long j10) {
            return this.f27686B.n(j10 - this.f27687C);
        }

        @Override // n2.s
        public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iP = this.f27686B.p(c3025c, decoderInputBuffer, i10);
            if (iP == -4) {
                decoderInputBuffer.f26295G += this.f27687C;
            }
            return iP;
        }
    }

    public K(q qVar, long j10) {
        this.f27683B = qVar;
        this.f27684C = j10;
    }

    public q a() {
        return this.f27683B;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        return this.f27683B.b(w10.a().f(w10.f26554a - this.f27684C).d());
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        long jC = this.f27683B.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f27684C + jC;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, d2.I i10) {
        return this.f27683B.d(j10 - this.f27684C, i10) + this.f27684C;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        return this.f27683B.e();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        ((q.a) C1804a.e(this.f27685D)).f(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        long jG = this.f27683B.g();
        if (jG == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f27684C + jG;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
        this.f27683B.h(j10 - this.f27684C);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr, boolean[] zArr2, long j10) {
        n2.s[] sVarArr2 = new n2.s[sVarArr.length];
        int i10 = 0;
        while (true) {
            n2.s sVarB = null;
            if (i10 >= sVarArr.length) {
                break;
            }
            a aVar = (a) sVarArr[i10];
            if (aVar != null) {
                sVarB = aVar.b();
            }
            sVarArr2[i10] = sVarB;
            i10++;
        }
        long j11 = this.f27683B.j(xVarArr, zArr, sVarArr2, zArr2, j10 - this.f27684C);
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            n2.s sVar = sVarArr2[i11];
            if (sVar == null) {
                sVarArr[i11] = null;
            } else {
                n2.s sVar2 = sVarArr[i11];
                if (sVar2 == null || ((a) sVar2).b() != sVar) {
                    sVarArr[i11] = new a(sVar, this.f27684C);
                }
            }
        }
        return j11 + this.f27684C;
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void i(q qVar) {
        ((q.a) C1804a.e(this.f27685D)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() {
        this.f27683B.l();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j10) {
        return this.f27683B.m(j10 - this.f27684C) + this.f27684C;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        long jQ = this.f27683B.q();
        if (jQ == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f27684C + jQ;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        this.f27685D = aVar;
        this.f27683B.r(this, j10 - this.f27684C);
    }

    @Override // androidx.media3.exoplayer.source.q
    public n2.x s() {
        return this.f27683B.s();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        this.f27683B.u(j10 - this.f27684C, z10);
    }
}
