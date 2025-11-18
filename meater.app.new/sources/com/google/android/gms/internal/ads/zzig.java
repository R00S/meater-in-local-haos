package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzig implements zzhn, zzif, zzka {

    /* renamed from: A */
    private IOException f26265A;

    /* renamed from: B */
    private boolean f26266B;

    /* renamed from: C */
    private int f26267C;

    /* renamed from: D */
    private long f26268D;

    /* renamed from: E */
    private boolean f26269E;

    /* renamed from: F */
    private int f26270F;

    /* renamed from: G */
    private int f26271G;

    /* renamed from: a */
    private final zzid f26272a;

    /* renamed from: b */
    private final zzjr f26273b;

    /* renamed from: c */
    private final int f26274c;

    /* renamed from: d */
    private final SparseArray<C7098qz> f26275d;

    /* renamed from: e */
    private final int f26276e;

    /* renamed from: f */
    private final boolean f26277f;

    /* renamed from: g */
    private final Uri f26278g;

    /* renamed from: h */
    private final zzjp f26279h;

    /* renamed from: i */
    private volatile boolean f26280i;

    /* renamed from: j */
    private volatile zzio f26281j;

    /* renamed from: k */
    private volatile zzhw f26282k;

    /* renamed from: l */
    private boolean f26283l;

    /* renamed from: m */
    private int f26284m;

    /* renamed from: n */
    private zzho[] f26285n;

    /* renamed from: o */
    private long f26286o;

    /* renamed from: p */
    private boolean[] f26287p;

    /* renamed from: q */
    private boolean[] f26288q;

    /* renamed from: r */
    private boolean[] f26289r;

    /* renamed from: s */
    private int f26290s;

    /* renamed from: t */
    private long f26291t;

    /* renamed from: u */
    private long f26292u;

    /* renamed from: v */
    private long f26293v;

    /* renamed from: w */
    private boolean f26294w;

    /* renamed from: x */
    private long f26295x;

    /* renamed from: y */
    private zzjz f26296y;

    /* renamed from: z */
    private C7061pz f26297z;

    public zzig(Uri uri, zzjp zzjpVar, zzid zzidVar, int i2, int i3) {
        this(uri, zzjpVar, zzidVar, 2, i3, -1);
    }

    /* renamed from: i */
    static /* synthetic */ int m20082i(zzig zzigVar) {
        int i2 = zzigVar.f26270F;
        zzigVar.f26270F = i2 + 1;
        return i2;
    }

    /* renamed from: j */
    private final void m20083j(long j2) {
        this.f26293v = j2;
        this.f26269E = false;
        if (this.f26296y.m20116a()) {
            this.f26296y.m20119f();
        } else {
            m20088o();
            m20085l();
        }
    }

    /* renamed from: k */
    private final boolean m20084k() throws IOException {
        boolean z;
        m20085l();
        boolean z2 = false;
        if (m20089p()) {
            return false;
        }
        if (this.f26283l) {
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.f26289r;
                if (i2 >= zArr.length) {
                    z = false;
                    break;
                }
                if (zArr[i2] && !this.f26275d.valueAt(i2).m20068f()) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            m20086m();
        }
        return z2;
    }

    /* renamed from: l */
    private final void m20085l() {
        if (this.f26269E || this.f26296y.m20116a()) {
            return;
        }
        if (this.f26265A != null) {
            zzkh.m20129d(this.f26297z != null);
            if (SystemClock.elapsedRealtime() - this.f26268D >= Math.min((this.f26267C - 1) * 1000, 5000L)) {
                this.f26265A = null;
                if (this.f26283l) {
                    this.f26281j.mo20060b();
                } else {
                    for (int i2 = 0; i2 < this.f26275d.size(); i2++) {
                        this.f26275d.valueAt(i2).m20067e();
                    }
                    this.f26297z = m20087n();
                }
                this.f26271G = this.f26270F;
                this.f26296y.m20118d(this.f26297z, this);
                return;
            }
            return;
        }
        this.f26295x = 0L;
        this.f26294w = false;
        if (this.f26283l) {
            zzkh.m20129d(m20089p());
            long j2 = this.f26286o;
            if (j2 != -1 && this.f26293v >= j2) {
                this.f26269E = true;
                this.f26293v = -1L;
                return;
            } else {
                this.f26297z = new C7061pz(this.f26278g, this.f26279h, this.f26272a, this.f26273b, this.f26274c, this.f26281j.mo20059a(this.f26293v));
                this.f26293v = -1L;
            }
        } else {
            this.f26297z = m20087n();
        }
        this.f26271G = this.f26270F;
        this.f26296y.m20118d(this.f26297z, this);
    }

    /* renamed from: m */
    private final void m20086m() throws IOException {
        if (this.f26265A == null) {
            return;
        }
        int i2 = this.f26276e;
        if (i2 == -1) {
            if (this.f26281j != null) {
                this.f26281j.mo20060b();
            }
            i2 = 3;
        }
        if (this.f26267C > i2) {
            throw this.f26265A;
        }
    }

    /* renamed from: n */
    private final C7061pz m20087n() {
        return new C7061pz(this.f26278g, this.f26279h, this.f26272a, this.f26273b, this.f26274c, 0L);
    }

    /* renamed from: o */
    private final void m20088o() {
        for (int i2 = 0; i2 < this.f26275d.size(); i2++) {
            this.f26275d.valueAt(i2).m20067e();
        }
        this.f26297z = null;
        this.f26265A = null;
        this.f26267C = 0;
        this.f26266B = false;
    }

    /* renamed from: p */
    private final boolean m20089p() {
        return this.f26293v != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    /* renamed from: a */
    public final void mo20090a(zzkc zzkcVar) {
        this.f26269E = true;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    /* renamed from: b */
    public final void mo20091b(zzkc zzkcVar, IOException iOException) {
        this.f26265A = iOException;
        this.f26267C = this.f26270F <= this.f26271G ? 1 + this.f26267C : 1;
        this.f26268D = SystemClock.elapsedRealtime();
        m20085l();
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: c */
    public final void mo19969c() {
        zzjz zzjzVar;
        zzkh.m20129d(this.f26290s > 0);
        int i2 = this.f26290s - 1;
        this.f26290s = i2;
        if (i2 != 0 || (zzjzVar = this.f26296y) == null) {
            return;
        }
        zzjzVar.m20117b();
        this.f26296y = null;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    /* renamed from: d */
    public final void mo20078d() {
        this.f26280i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    /* renamed from: e */
    public final void mo20079e(zzhw zzhwVar) {
        this.f26282k = zzhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    /* renamed from: f */
    public final zzip mo20080f(int i2) {
        C7098qz c7098qz = this.f26275d.get(i2);
        if (c7098qz != null) {
            return c7098qz;
        }
        C7098qz c7098qz2 = new C7098qz(this, this.f26273b);
        this.f26275d.put(i2, c7098qz2);
        return c7098qz2;
    }

    @Override // com.google.android.gms.internal.ads.zzif
    /* renamed from: g */
    public final void mo20081g(zzio zzioVar) {
        this.f26281j = zzioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    /* renamed from: h */
    public final void mo20092h(zzkc zzkcVar) {
        if (this.f26284m > 0) {
            m20083j(this.f26293v);
        } else {
            m20088o();
            this.f26273b.m20110f(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: q */
    public final void mo19970q(int i2, long j2) {
        zzkh.m20129d(this.f26283l);
        zzkh.m20129d(!this.f26289r[i2]);
        int i3 = this.f26284m + 1;
        this.f26284m = i3;
        this.f26289r[i2] = true;
        this.f26287p[i2] = true;
        if (i3 == 1) {
            mo19973t(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: r */
    public final long mo19971r() {
        if (this.f26269E) {
            return -3L;
        }
        if (m20089p()) {
            return this.f26293v;
        }
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < this.f26275d.size(); i2++) {
            jMax = Math.max(jMax, this.f26275d.valueAt(i2).m20074l());
        }
        return jMax == Long.MIN_VALUE ? this.f26291t : jMax;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: s */
    public final int mo19972s() {
        return this.f26275d.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: t */
    public final void mo19973t(long j2) {
        zzkh.m20129d(this.f26283l);
        int i2 = 0;
        zzkh.m20129d(this.f26284m > 0);
        this.f26281j.mo20060b();
        this.f26292u = j2;
        if ((m20089p() ? this.f26293v : this.f26291t) == j2) {
            return;
        }
        this.f26291t = j2;
        boolean zM20071i = !m20089p();
        for (int i3 = 0; zM20071i && i3 < this.f26275d.size(); i3++) {
            zM20071i &= this.f26275d.valueAt(i3).m20071i(j2);
        }
        if (!zM20071i) {
            m20083j(j2);
        }
        while (true) {
            boolean[] zArr = this.f26288q;
            if (i2 >= zArr.length) {
                return;
            }
            zArr[i2] = true;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: u */
    public final boolean mo19974u(long j2) throws IOException {
        boolean z;
        if (this.f26283l) {
            return true;
        }
        if (this.f26296y == null) {
            this.f26296y = new zzjz("Loader:ExtractorSampleSource");
        }
        m20084k();
        if (this.f26281j != null && this.f26280i) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f26275d.size()) {
                    z = true;
                    break;
                }
                if (!this.f26275d.valueAt(i2).m20072j()) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                int size = this.f26275d.size();
                this.f26289r = new boolean[size];
                this.f26288q = new boolean[size];
                this.f26287p = new boolean[size];
                this.f26285n = new zzho[size];
                this.f26286o = -1L;
                for (int i3 = 0; i3 < size; i3++) {
                    zzhj zzhjVarM20073k = this.f26275d.valueAt(i3).m20073k();
                    this.f26285n[i3] = new zzho(zzhjVarM20073k.f26191a, zzhjVarM20073k.f26193c);
                    long j3 = zzhjVarM20073k.f26193c;
                    if (j3 != -1 && j3 > this.f26286o) {
                        this.f26286o = j3;
                    }
                }
                this.f26283l = true;
                return true;
            }
        }
        m20086m();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: v */
    public final zzho mo19975v(int i2) {
        zzkh.m20129d(this.f26283l);
        return this.f26285n[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: w */
    public final int mo19976w(int i2, long j2, zzhk zzhkVar, zzhm zzhmVar, boolean z) throws IOException {
        this.f26291t = j2;
        boolean[] zArr = this.f26288q;
        if (zArr[i2]) {
            zArr[i2] = false;
            return -5;
        }
        if (z || m20089p()) {
            m20086m();
            return -2;
        }
        C7098qz c7098qzValueAt = this.f26275d.valueAt(i2);
        if (this.f26287p[i2]) {
            zzhkVar.f26204a = c7098qzValueAt.m20073k();
            zzhkVar.f26205b = this.f26282k;
            this.f26287p[i2] = false;
            return -4;
        }
        if (c7098qzValueAt.m20069g(zzhmVar)) {
            zzhmVar.f26209d |= this.f26277f && (zzhmVar.f26210e > this.f26292u ? 1 : (zzhmVar.f26210e == this.f26292u ? 0 : -1)) < 0 ? 134217728 : 0;
            zzhmVar.f26210e += this.f26295x;
            return -3;
        }
        if (this.f26269E) {
            return -1;
        }
        m20086m();
        return -2;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: x */
    public final boolean mo19977x(long j2) throws IOException {
        zzkh.m20129d(this.f26283l);
        zzkh.m20129d(this.f26284m > 0);
        this.f26291t = j2;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f26289r;
            if (i2 >= zArr.length) {
                break;
            }
            if (!zArr[i2]) {
                this.f26275d.valueAt(i2).m20070h(j2);
            }
            i2++;
        }
        return this.f26269E || m20084k();
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    /* renamed from: y */
    public final void mo19978y(int i2) {
        zzkh.m20129d(this.f26283l);
        zzkh.m20129d(this.f26289r[i2]);
        int i3 = this.f26284m - 1;
        this.f26284m = i3;
        this.f26289r[i2] = false;
        this.f26288q[i2] = false;
        if (i3 == 0) {
            if (this.f26296y.m20116a()) {
                this.f26296y.m20119f();
            } else {
                m20088o();
                this.f26273b.m20110f(0);
            }
        }
    }

    private zzig(Uri uri, zzjp zzjpVar, zzid zzidVar, int i2, int i3, int i4) {
        this.f26278g = uri;
        this.f26279h = zzjpVar;
        this.f26272a = zzidVar;
        this.f26290s = 2;
        this.f26274c = i3;
        this.f26276e = -1;
        this.f26275d = new SparseArray<>();
        this.f26273b = new zzjr(262144);
        this.f26293v = -1L;
        this.f26277f = true;
        zzidVar.mo20076d(this);
    }
}
