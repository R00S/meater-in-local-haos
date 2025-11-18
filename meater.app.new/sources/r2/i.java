package r2;

import X1.C1804a;
import X1.InterfaceC1807d;
import X1.L;
import X1.s;
import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import m8.AbstractC4009y;
import m8.AbstractC4010z;
import r2.d;

/* compiled from: DefaultBandwidthMeter.java */
/* loaded from: classes.dex */
public final class i implements d, a2.n {

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC4009y<Long> f48363p = AbstractC4009y.K(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC4009y<Long> f48364q = AbstractC4009y.K(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC4009y<Long> f48365r = AbstractC4009y.K(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC4009y<Long> f48366s = AbstractC4009y.K(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC4009y<Long> f48367t = AbstractC4009y.K(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC4009y<Long> f48368u = AbstractC4009y.K(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: v, reason: collision with root package name */
    private static i f48369v;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4010z<Integer, Long> f48370a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.C0674a f48371b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1807d f48372c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f48373d;

    /* renamed from: e, reason: collision with root package name */
    private final n f48374e;

    /* renamed from: f, reason: collision with root package name */
    private int f48375f;

    /* renamed from: g, reason: collision with root package name */
    private long f48376g;

    /* renamed from: h, reason: collision with root package name */
    private long f48377h;

    /* renamed from: i, reason: collision with root package name */
    private long f48378i;

    /* renamed from: j, reason: collision with root package name */
    private long f48379j;

    /* renamed from: k, reason: collision with root package name */
    private long f48380k;

    /* renamed from: l, reason: collision with root package name */
    private long f48381l;

    /* renamed from: m, reason: collision with root package name */
    private int f48382m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f48383n;

    /* renamed from: o, reason: collision with root package name */
    private int f48384o;

    /* compiled from: DefaultBandwidthMeter.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f48385a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Integer, Long> f48386b;

        /* renamed from: c, reason: collision with root package name */
        private int f48387c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC1807d f48388d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f48389e;

        public b(Context context) {
            this.f48385a = context == null ? null : context.getApplicationContext();
            this.f48386b = b(L.S(context));
            this.f48387c = 2000;
            this.f48388d = InterfaceC1807d.f18647a;
            this.f48389e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] iArrL = i.l(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            AbstractC4009y<Long> abstractC4009y = i.f48363p;
            map.put(2, abstractC4009y.get(iArrL[0]));
            map.put(3, i.f48364q.get(iArrL[1]));
            map.put(4, i.f48365r.get(iArrL[2]));
            map.put(5, i.f48366s.get(iArrL[3]));
            map.put(10, i.f48367t.get(iArrL[4]));
            map.put(9, i.f48368u.get(iArrL[5]));
            map.put(7, abstractC4009y.get(iArrL[0]));
            return map;
        }

        public i a() {
            return new i(this.f48385a, this.f48386b, this.f48387c, this.f48388d, this.f48389e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] l(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.i.l(java.lang.String):int[]");
    }

    private long m(int i10) {
        Long l10 = this.f48370a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f48370a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized i n(Context context) {
        try {
            if (f48369v == null) {
                f48369v = new b(context).a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f48369v;
    }

    private static boolean o(a2.g gVar, boolean z10) {
        return z10 && !gVar.d(8);
    }

    private void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f48381l) {
            return;
        }
        this.f48381l = j11;
        this.f48371b.c(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i10) {
        int i11 = this.f48382m;
        if (i11 == 0 || this.f48373d) {
            if (this.f48383n) {
                i10 = this.f48384o;
            }
            if (i11 == i10) {
                return;
            }
            this.f48382m = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f48380k = m(i10);
                long jC = this.f48372c.c();
                p(this.f48375f > 0 ? (int) (jC - this.f48376g) : 0, this.f48377h, this.f48380k);
                this.f48376g = jC;
                this.f48377h = 0L;
                this.f48379j = 0L;
                this.f48378i = 0L;
                this.f48374e.i();
            }
        }
    }

    @Override // r2.d
    public void a(d.a aVar) {
        this.f48371b.e(aVar);
    }

    @Override // a2.n
    public synchronized void c(androidx.media3.datasource.a aVar, a2.g gVar, boolean z10) {
        try {
            if (o(gVar, z10)) {
                if (this.f48375f == 0) {
                    this.f48376g = this.f48372c.c();
                }
                this.f48375f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // a2.n
    public synchronized void d(androidx.media3.datasource.a aVar, a2.g gVar, boolean z10) {
        try {
            if (o(gVar, z10)) {
                C1804a.g(this.f48375f > 0);
                long jC = this.f48372c.c();
                int i10 = (int) (jC - this.f48376g);
                this.f48378i += i10;
                long j10 = this.f48379j;
                long j11 = this.f48377h;
                this.f48379j = j10 + j11;
                if (i10 > 0) {
                    this.f48374e.c((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                    if (this.f48378i >= 2000 || this.f48379j >= 524288) {
                        this.f48380k = (long) this.f48374e.f(0.5f);
                    }
                    p(i10, this.f48377h, this.f48380k);
                    this.f48376g = jC;
                    this.f48377h = 0L;
                }
                this.f48375f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // r2.d
    public synchronized long f() {
        return this.f48380k;
    }

    @Override // r2.d
    public void g(Handler handler, d.a aVar) {
        C1804a.e(handler);
        C1804a.e(aVar);
        this.f48371b.b(handler, aVar);
    }

    @Override // a2.n
    public synchronized void h(androidx.media3.datasource.a aVar, a2.g gVar, boolean z10, int i10) {
        if (o(gVar, z10)) {
            this.f48377h += i10;
        }
    }

    private i(Context context, Map<Integer, Long> map, int i10, InterfaceC1807d interfaceC1807d, boolean z10) {
        this.f48370a = AbstractC4010z.c(map);
        this.f48371b = new d.a.C0674a();
        this.f48374e = new n(i10);
        this.f48372c = interfaceC1807d;
        this.f48373d = z10;
        if (context == null) {
            this.f48382m = 0;
            this.f48380k = m(0);
            return;
        }
        s sVarD = s.d(context);
        int iF = sVarD.f();
        this.f48382m = iF;
        this.f48380k = m(iF);
        sVarD.i(new s.c() { // from class: r2.h
            @Override // X1.s.c
            public final void a(int i11) {
                this.f48362a.q(i11);
            }
        });
    }

    @Override // r2.d
    public a2.n e() {
        return this;
    }

    @Override // a2.n
    public void i(androidx.media3.datasource.a aVar, a2.g gVar, boolean z10) {
    }
}
