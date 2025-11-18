package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
final class n00 implements zzkv {

    /* renamed from: a */
    private final zzlo[] f19948a;

    /* renamed from: b */
    private final zzrp f19949b;

    /* renamed from: c */
    private final zzro f19950c;

    /* renamed from: d */
    private final Handler f19951d;

    /* renamed from: e */
    private final p00 f19952e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<zzkw> f19953f;

    /* renamed from: g */
    private final zzlu f19954g;

    /* renamed from: h */
    private final zzlt f19955h;

    /* renamed from: i */
    private boolean f19956i;

    /* renamed from: j */
    private boolean f19957j;

    /* renamed from: k */
    private int f19958k;

    /* renamed from: l */
    private int f19959l;

    /* renamed from: m */
    private int f19960m;

    /* renamed from: n */
    private int f19961n;

    /* renamed from: o */
    private boolean f19962o;

    /* renamed from: p */
    private zzlr f19963p;

    /* renamed from: q */
    private Object f19964q;

    /* renamed from: r */
    private zzrb f19965r;

    /* renamed from: s */
    private zzro f19966s;

    /* renamed from: t */
    private zzln f19967t;

    /* renamed from: u */
    private zzle f19968u;

    /* renamed from: v */
    private int f19969v;

    /* renamed from: w */
    private int f19970w;

    /* renamed from: x */
    private long f19971x;

    @SuppressLint({"HandlerLeak"})
    public n00(zzlo[] zzloVarArr, zzrp zzrpVar, zzll zzllVar) {
        String str = zzsy.f27028e;
        StringBuilder sb = new StringBuilder("Init ExoPlayerLib/2.4.2 [".length() + 1 + String.valueOf(str).length());
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzsk.m20481e(zzloVarArr.length > 0);
        this.f19948a = (zzlo[]) zzsk.m20480d(zzloVarArr);
        this.f19949b = (zzrp) zzsk.m20480d(zzrpVar);
        this.f19957j = false;
        this.f19958k = 0;
        this.f19959l = 1;
        this.f19953f = new CopyOnWriteArraySet<>();
        zzro zzroVar = new zzro(new zzrm[zzloVarArr.length]);
        this.f19950c = zzroVar;
        this.f19963p = zzlr.f26496a;
        this.f19954g = new zzlu();
        this.f19955h = new zzlt();
        this.f19965r = zzrb.f26894a;
        this.f19966s = zzroVar;
        this.f19967t = zzln.f26490a;
        o00 o00Var = new o00(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f19951d = o00Var;
        zzle zzleVar = new zzle(0, 0L);
        this.f19968u = zzleVar;
        this.f19952e = new p00(zzloVarArr, zzrpVar, zzllVar, this.f19957j, 0, o00Var, zzleVar, this);
    }

    /* renamed from: o */
    private final int m15575o() {
        if (this.f19963p.m20216a() || this.f19960m > 0) {
            return this.f19969v;
        }
        this.f19963p.mo15897c(this.f19968u.f26451a, this.f19955h, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: F */
    public final int mo15576F() {
        return this.f19959l;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: a */
    public final void mo15577a(boolean z) {
        if (this.f19957j != z) {
            this.f19957j = z;
            this.f19952e.m15744y(z);
            Iterator<zzkw> it = this.f19953f.iterator();
            while (it.hasNext()) {
                it.next().mo17590a(z, this.f19959l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: b */
    public final void mo15578b(long j2) {
        int iM15575o = m15575o();
        if (iM15575o < 0 || (!this.f19963p.m20216a() && iM15575o >= this.f19963p.mo15900g())) {
            throw new zzlk(this.f19963p, iM15575o, j2);
        }
        this.f19960m++;
        this.f19969v = iM15575o;
        if (this.f19963p.m20216a()) {
            this.f19970w = 0;
        } else {
            this.f19963p.m20218d(iM15575o, this.f19954g, false);
            if (j2 != -9223372036854775807L) {
                zzkt.m20190b(j2);
            }
            this.f19963p.mo15897c(0, this.f19955h, false);
            this.f19970w = 0;
        }
        if (j2 == -9223372036854775807L) {
            this.f19971x = 0L;
            this.f19952e.m15740m(this.f19963p, iM15575o, -9223372036854775807L);
            return;
        }
        this.f19971x = j2;
        this.f19952e.m15740m(this.f19963p, iM15575o, zzkt.m20190b(j2));
        Iterator<zzkw> it = this.f19953f.iterator();
        while (it.hasNext()) {
            it.next().mo17592c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: c */
    public final void mo15579c() {
        this.f19952e.m15738b();
        this.f19951d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: d */
    public final long mo15580d() {
        if (this.f19963p.m20216a() || this.f19960m > 0) {
            return this.f19971x;
        }
        this.f19963p.mo15897c(this.f19968u.f26451a, this.f19955h, false);
        return this.f19955h.m20220b() + zzkt.m20189a(this.f19968u.f26454d);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: e */
    public final long mo15581e() {
        if (this.f19963p.m20216a() || this.f19960m > 0) {
            return this.f19971x;
        }
        this.f19963p.mo15897c(this.f19968u.f26451a, this.f19955h, false);
        return this.f19955h.m20220b() + zzkt.m20189a(this.f19968u.f26453c);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: f */
    public final boolean mo15582f() {
        return this.f19957j;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: g */
    public final long mo15583g() {
        if (this.f19963p.m20216a()) {
            return -9223372036854775807L;
        }
        return zzkt.m20189a(this.f19963p.m20218d(m15575o(), this.f19954g, false).f26511i);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: h */
    public final int mo15584h() {
        return this.f19948a.length;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: i */
    public final void mo15585i(zzky... zzkyVarArr) {
        this.f19952e.m15742p(zzkyVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: j */
    public final void mo15586j(zzql zzqlVar) {
        if (!this.f19963p.m20216a() || this.f19964q != null) {
            this.f19963p = zzlr.f26496a;
            this.f19964q = null;
            Iterator<zzkw> it = this.f19953f.iterator();
            while (it.hasNext()) {
                it.next().mo17598i(this.f19963p, this.f19964q);
            }
        }
        if (this.f19956i) {
            this.f19956i = false;
            this.f19965r = zzrb.f26894a;
            this.f19966s = this.f19950c;
            this.f19949b.mo20446d(null);
            Iterator<zzkw> it2 = this.f19953f.iterator();
            while (it2.hasNext()) {
                it2.next().mo17594e(this.f19965r, this.f19966s);
            }
        }
        this.f19961n++;
        this.f19952e.m15741n(zzqlVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: k */
    public final void mo15587k(zzky... zzkyVarArr) {
        this.f19952e.m15743w(zzkyVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: l */
    public final void mo15588l(zzkw zzkwVar) {
        this.f19953f.remove(zzkwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    /* renamed from: m */
    public final void mo15589m(zzkw zzkwVar) {
        this.f19953f.add(zzkwVar);
    }

    /* renamed from: n */
    final void m15590n(Message message) {
        switch (message.what) {
            case 0:
                this.f19961n--;
                return;
            case 1:
                this.f19959l = message.arg1;
                Iterator<zzkw> it = this.f19953f.iterator();
                while (it.hasNext()) {
                    it.next().mo17590a(this.f19957j, this.f19959l);
                }
                return;
            case 2:
                this.f19962o = message.arg1 != 0;
                Iterator<zzkw> it2 = this.f19953f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo17600k(this.f19962o);
                }
                return;
            case 3:
                if (this.f19961n == 0) {
                    zzrr zzrrVar = (zzrr) message.obj;
                    this.f19956i = true;
                    this.f19965r = zzrrVar.f26936a;
                    this.f19966s = zzrrVar.f26937b;
                    this.f19949b.mo20446d(zzrrVar.f26938c);
                    Iterator<zzkw> it3 = this.f19953f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo17594e(this.f19965r, this.f19966s);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.f19960m - 1;
                this.f19960m = i2;
                if (i2 == 0) {
                    this.f19968u = (zzle) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzkw> it4 = this.f19953f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo17592c();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f19960m == 0) {
                    this.f19968u = (zzle) message.obj;
                    Iterator<zzkw> it5 = this.f19953f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo17592c();
                    }
                    return;
                }
                return;
            case 6:
                zzlg zzlgVar = (zzlg) message.obj;
                this.f19960m -= zzlgVar.f26458d;
                if (this.f19961n == 0) {
                    this.f19963p = zzlgVar.f26455a;
                    this.f19964q = zzlgVar.f26456b;
                    this.f19968u = zzlgVar.f26457c;
                    Iterator<zzkw> it6 = this.f19953f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo17598i(this.f19963p, this.f19964q);
                    }
                    return;
                }
                return;
            case 7:
                zzln zzlnVar = (zzln) message.obj;
                if (this.f19967t.equals(zzlnVar)) {
                    return;
                }
                this.f19967t = zzlnVar;
                Iterator<zzkw> it7 = this.f19953f.iterator();
                while (it7.hasNext()) {
                    it7.next().mo17597h(zzlnVar);
                }
                return;
            case 8:
                zzku zzkuVar = (zzku) message.obj;
                Iterator<zzkw> it8 = this.f19953f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo17601l(zzkuVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void stop() {
        this.f19952e.m15739f();
    }
}
