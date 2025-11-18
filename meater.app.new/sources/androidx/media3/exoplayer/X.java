package androidx.media3.exoplayer;

import X1.C1804a;
import androidx.media3.exoplayer.source.C2138b;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import java.io.IOException;
import q2.AbstractC4270C;
import q2.C4271D;

/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.q f26560a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26561b;

    /* renamed from: c, reason: collision with root package name */
    public final n2.s[] f26562c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26563d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26564e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26565f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26566g;

    /* renamed from: h, reason: collision with root package name */
    public Y f26567h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26568i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean[] f26569j;

    /* renamed from: k, reason: collision with root package name */
    private final u0[] f26570k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC4270C f26571l;

    /* renamed from: m, reason: collision with root package name */
    private final p0 f26572m;

    /* renamed from: n, reason: collision with root package name */
    private X f26573n;

    /* renamed from: o, reason: collision with root package name */
    private n2.x f26574o;

    /* renamed from: p, reason: collision with root package name */
    private C4271D f26575p;

    /* renamed from: q, reason: collision with root package name */
    private long f26576q;

    /* compiled from: MediaPeriodHolder.java */
    interface a {
        X a(Y y10, long j10);
    }

    public X(u0[] u0VarArr, long j10, AbstractC4270C abstractC4270C, r2.b bVar, p0 p0Var, Y y10, C4271D c4271d, long j11) {
        this.f26570k = u0VarArr;
        this.f26576q = j10;
        this.f26571l = abstractC4270C;
        this.f26572m = p0Var;
        r.b bVar2 = y10.f26577a;
        this.f26561b = bVar2.f27812a;
        this.f26567h = y10;
        this.f26563d = j11;
        this.f26574o = n2.x.f45675d;
        this.f26575p = c4271d;
        this.f26562c = new n2.s[u0VarArr.length];
        this.f26569j = new boolean[u0VarArr.length];
        this.f26560a = f(bVar2, p0Var, bVar, y10.f26578b, y10.f26580d);
    }

    private void c(n2.s[] sVarArr) {
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f26570k;
            if (i10 >= u0VarArr.length) {
                return;
            }
            if (u0VarArr[i10].l() == -2 && this.f26575p.c(i10)) {
                sVarArr[i10] = new n2.h();
            }
            i10++;
        }
    }

    private static androidx.media3.exoplayer.source.q f(r.b bVar, p0 p0Var, r2.b bVar2, long j10, long j11) {
        androidx.media3.exoplayer.source.q qVarH = p0Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new C2138b(qVarH, true, 0L, j11) : qVarH;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C4271D c4271d = this.f26575p;
            if (i10 >= c4271d.f47805a) {
                return;
            }
            boolean zC = c4271d.c(i10);
            q2.x xVar = this.f26575p.f47807c[i10];
            if (zC && xVar != null) {
                xVar.g();
            }
            i10++;
        }
    }

    private void h(n2.s[] sVarArr) {
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f26570k;
            if (i10 >= u0VarArr.length) {
                return;
            }
            if (u0VarArr[i10].l() == -2) {
                sVarArr[i10] = null;
            }
            i10++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C4271D c4271d = this.f26575p;
            if (i10 >= c4271d.f47805a) {
                return;
            }
            boolean zC = c4271d.c(i10);
            q2.x xVar = this.f26575p.f47807c[i10];
            if (zC && xVar != null) {
                xVar.h();
            }
            i10++;
        }
    }

    private boolean u() {
        return this.f26573n == null;
    }

    private static void y(p0 p0Var, androidx.media3.exoplayer.source.q qVar) {
        try {
            if (qVar instanceof C2138b) {
                p0Var.A(((C2138b) qVar).f27717B);
            } else {
                p0Var.A(qVar);
            }
        } catch (RuntimeException e10) {
            X1.n.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(X x10) {
        if (x10 == this.f26573n) {
            return;
        }
        g();
        this.f26573n = x10;
        i();
    }

    public void B(long j10) {
        this.f26576q = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        androidx.media3.exoplayer.source.q qVar = this.f26560a;
        if (qVar instanceof C2138b) {
            long j10 = this.f26567h.f26580d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C2138b) qVar).t(0L, j10);
        }
    }

    public long a(C4271D c4271d, long j10, boolean z10) {
        return b(c4271d, j10, z10, new boolean[this.f26570k.length]);
    }

    public long b(C4271D c4271d, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c4271d.f47805a) {
                break;
            }
            boolean[] zArr2 = this.f26569j;
            if (z10 || !c4271d.b(this.f26575p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f26562c);
        g();
        this.f26575p = c4271d;
        i();
        long j11 = this.f26560a.j(c4271d.f47807c, this.f26569j, this.f26562c, zArr, j10);
        c(this.f26562c);
        this.f26566g = false;
        int i11 = 0;
        while (true) {
            n2.s[] sVarArr = this.f26562c;
            if (i11 >= sVarArr.length) {
                return j11;
            }
            if (sVarArr[i11] != null) {
                C1804a.g(c4271d.c(i11));
                if (this.f26570k[i11].l() != -2) {
                    this.f26566g = true;
                }
            } else {
                C1804a.g(c4271d.f47807c[i11] == null);
            }
            i11++;
        }
    }

    public boolean d(Y y10) {
        if (a0.d(this.f26567h.f26581e, y10.f26581e)) {
            Y y11 = this.f26567h;
            if (y11.f26578b == y10.f26578b && y11.f26577a.equals(y10.f26577a)) {
                return true;
            }
        }
        return false;
    }

    public void e(W w10) {
        C1804a.g(u());
        this.f26560a.b(w10);
    }

    public long j() {
        if (!this.f26565f) {
            return this.f26567h.f26578b;
        }
        long jG = this.f26566g ? this.f26560a.g() : Long.MIN_VALUE;
        return jG == Long.MIN_VALUE ? this.f26567h.f26581e : jG;
    }

    public X k() {
        return this.f26573n;
    }

    public long l() {
        if (this.f26565f) {
            return this.f26560a.c();
        }
        return 0L;
    }

    public long m() {
        return this.f26576q;
    }

    public long n() {
        return this.f26567h.f26578b + this.f26576q;
    }

    public n2.x o() {
        return this.f26574o;
    }

    public C4271D p() {
        return this.f26575p;
    }

    public void q(float f10, U1.G g10, boolean z10) {
        this.f26565f = true;
        this.f26574o = this.f26560a.s();
        C4271D c4271dZ = z(f10, g10, z10);
        Y y10 = this.f26567h;
        long jMax = y10.f26578b;
        long j10 = y10.f26581e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(c4271dZ, jMax, false);
        long j11 = this.f26576q;
        Y y11 = this.f26567h;
        this.f26576q = j11 + (y11.f26578b - jA);
        this.f26567h = y11.b(jA);
    }

    public boolean r() {
        try {
            if (this.f26565f) {
                for (n2.s sVar : this.f26562c) {
                    if (sVar != null) {
                        sVar.a();
                    }
                }
            } else {
                this.f26560a.l();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        return this.f26565f && (!this.f26566g || this.f26560a.g() == Long.MIN_VALUE);
    }

    public boolean t() {
        return this.f26565f && (s() || j() - this.f26567h.f26578b >= this.f26563d);
    }

    public void v(q.a aVar, long j10) {
        this.f26564e = true;
        this.f26560a.r(aVar, j10);
    }

    public void w(long j10) {
        C1804a.g(u());
        if (this.f26565f) {
            this.f26560a.h(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f26572m, this.f26560a);
    }

    public C4271D z(float f10, U1.G g10, boolean z10) {
        C4271D c4271dK = this.f26571l.k(this.f26570k, o(), this.f26567h.f26577a, g10);
        for (int i10 = 0; i10 < c4271dK.f47805a; i10++) {
            if (c4271dK.c(i10)) {
                if (c4271dK.f47807c[i10] == null && this.f26570k[i10].l() != -2) {
                    z = false;
                }
                C1804a.g(z);
            } else {
                C1804a.g(c4271dK.f47807c[i10] == null);
            }
        }
        for (q2.x xVar : c4271dK.f47807c) {
            if (xVar != null) {
                xVar.q(f10);
                xVar.e(z10);
            }
        }
        return c4271dK;
    }
}
