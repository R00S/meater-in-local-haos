package androidx.media3.exoplayer.source;

import X1.C1804a;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import java.io.IOException;

/* compiled from: MaskingMediaPeriod.java */
/* loaded from: classes.dex */
public final class o implements q, q.a {

    /* renamed from: B, reason: collision with root package name */
    public final r.b f27790B;

    /* renamed from: C, reason: collision with root package name */
    private final long f27791C;

    /* renamed from: D, reason: collision with root package name */
    private final r2.b f27792D;

    /* renamed from: E, reason: collision with root package name */
    private r f27793E;

    /* renamed from: F, reason: collision with root package name */
    private q f27794F;

    /* renamed from: G, reason: collision with root package name */
    private q.a f27795G;

    /* renamed from: H, reason: collision with root package name */
    private a f27796H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f27797I;

    /* renamed from: J, reason: collision with root package name */
    private long f27798J = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod.java */
    public interface a {
        void a(r.b bVar, IOException iOException);

        void b(r.b bVar);
    }

    public o(r.b bVar, r2.b bVar2, long j10) {
        this.f27790B = bVar;
        this.f27792D = bVar2;
        this.f27791C = j10;
    }

    private long o(long j10) {
        long j11 = this.f27798J;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public void a(r.b bVar) {
        long jO = o(this.f27791C);
        q qVarA = ((r) C1804a.e(this.f27793E)).a(bVar, this.f27792D, jO);
        this.f27794F = qVarA;
        if (this.f27795G != null) {
            qVarA.r(this, jO);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        q qVar = this.f27794F;
        return qVar != null && qVar.b(w10);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return ((q) X1.L.i(this.f27794F)).c();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, d2.I i10) {
        return ((q) X1.L.i(this.f27794F)).d(j10, i10);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        q qVar = this.f27794F;
        return qVar != null && qVar.e();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        ((q.a) X1.L.i(this.f27795G)).f(this);
        a aVar = this.f27796H;
        if (aVar != null) {
            aVar.b(this.f27790B);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        return ((q) X1.L.i(this.f27794F)).g();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
        ((q) X1.L.i(this.f27794F)).h(j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr, boolean[] zArr2, long j10) {
        long j11 = this.f27798J;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f27791C) ? j10 : j11;
        this.f27798J = -9223372036854775807L;
        return ((q) X1.L.i(this.f27794F)).j(xVarArr, zArr, sVarArr, zArr2, j12);
    }

    public long k() {
        return this.f27798J;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() throws IOException {
        try {
            q qVar = this.f27794F;
            if (qVar != null) {
                qVar.l();
            } else {
                r rVar = this.f27793E;
                if (rVar != null) {
                    rVar.i();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f27796H;
            if (aVar == null) {
                throw e10;
            }
            if (this.f27797I) {
                return;
            }
            this.f27797I = true;
            aVar.a(this.f27790B, e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j10) {
        return ((q) X1.L.i(this.f27794F)).m(j10);
    }

    public long n() {
        return this.f27791C;
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(q qVar) {
        ((q.a) X1.L.i(this.f27795G)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        return ((q) X1.L.i(this.f27794F)).q();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        this.f27795G = aVar;
        q qVar = this.f27794F;
        if (qVar != null) {
            qVar.r(this, o(this.f27791C));
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public n2.x s() {
        return ((q) X1.L.i(this.f27794F)).s();
    }

    public void t(long j10) {
        this.f27798J = j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        ((q) X1.L.i(this.f27794F)).u(j10, z10);
    }

    public void v() {
        if (this.f27794F != null) {
            ((r) C1804a.e(this.f27793E)).p(this.f27794F);
        }
    }

    public void w(r rVar) {
        C1804a.g(this.f27793E == null);
        this.f27793E = rVar;
    }
}
