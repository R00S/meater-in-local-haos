package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yy */
/* loaded from: classes2.dex */
final class C7393yy implements Handler.Callback {

    /* renamed from: f */
    private final Handler f21322f;

    /* renamed from: g */
    private final HandlerThread f21323g;

    /* renamed from: h */
    private final Handler f21324h;

    /* renamed from: i */
    private final C7430zy f21325i;

    /* renamed from: j */
    private final boolean[] f21326j;

    /* renamed from: m */
    private final List<zzhp> f21329m;

    /* renamed from: n */
    private zzhp[] f21330n;

    /* renamed from: o */
    private zzhp f21331o;

    /* renamed from: p */
    private boolean f21332p;

    /* renamed from: q */
    private boolean f21333q;

    /* renamed from: r */
    private boolean f21334r;

    /* renamed from: s */
    private int f21335s;

    /* renamed from: v */
    private long f21338v;

    /* renamed from: w */
    private volatile long f21339w;

    /* renamed from: x */
    private volatile long f21340x;

    /* renamed from: y */
    private volatile long f21341y;

    /* renamed from: t */
    private int f21336t = 0;

    /* renamed from: u */
    private int f21337u = 0;

    /* renamed from: k */
    private final long f21327k = 2500000;

    /* renamed from: l */
    private final long f21328l = 5000000;

    public C7393yy(Handler handler, boolean z, boolean[] zArr, int i2, int i3) {
        this.f21324h = handler;
        this.f21333q = z;
        this.f21326j = new boolean[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            this.f21326j[i4] = zArr[i4];
        }
        this.f21335s = 1;
        this.f21339w = -1L;
        this.f21341y = -1L;
        this.f21325i = new C7430zy();
        this.f21329m = new ArrayList(zArr.length);
        zzko zzkoVar = new zzko(C7393yy.class.getSimpleName().concat(":Handler"), -16);
        this.f21323g = zzkoVar;
        zzkoVar.start();
        this.f21322f = new Handler(zzkoVar.getLooper(), this);
    }

    /* renamed from: e */
    private final void m16129e(int i2) {
        if (this.f21335s != i2) {
            this.f21335s = i2;
            this.f21324h.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    /* renamed from: g */
    private final void m16130g(int i2, long j2, long j3) {
        long jElapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.f21322f.sendEmptyMessage(i2);
        } else {
            this.f21322f.sendEmptyMessageDelayed(i2, jElapsedRealtime);
        }
    }

    /* renamed from: j */
    private final boolean m16131j(zzhp zzhpVar) {
        if (zzhpVar.mo19990s()) {
            return true;
        }
        if (!zzhpVar.mo19984d()) {
            return false;
        }
        if (this.f21335s == 4) {
            return true;
        }
        long jMo20006b = zzhpVar.mo20006b();
        long jMo20009q = zzhpVar.mo20009q();
        long j2 = this.f21334r ? this.f21328l : this.f21327k;
        return j2 <= 0 || jMo20009q == -1 || jMo20009q == -3 || jMo20009q >= this.f21340x + j2 || !(jMo20006b == -1 || jMo20006b == -2 || jMo20009q < jMo20006b);
    }

    /* renamed from: l */
    private static void m16132l(zzhp zzhpVar) throws zzgd {
        if (zzhpVar.m20031c() == 3) {
            zzhpVar.m20034k();
        }
    }

    /* renamed from: p */
    private final void m16133p() throws zzgd {
        this.f21334r = false;
        this.f21325i.m16167a();
        for (int i2 = 0; i2 < this.f21329m.size(); i2++) {
            this.f21329m.get(i2).m20033j();
        }
    }

    /* renamed from: q */
    private final void m16134q() throws zzgd {
        this.f21325i.m16168b();
        for (int i2 = 0; i2 < this.f21329m.size(); i2++) {
            m16132l(this.f21329m.get(i2));
        }
    }

    /* renamed from: r */
    private final void m16135r() {
        zzhp zzhpVar = this.f21331o;
        if (zzhpVar == null || !this.f21329m.contains(zzhpVar) || this.f21331o.mo19990s()) {
            this.f21340x = this.f21325i.m16170e();
        } else {
            this.f21340x = this.f21331o.mo19991t();
            this.f21325i.m16169c(this.f21340x);
        }
        this.f21338v = SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: s */
    private final void m16136s() {
        m16137t();
        m16129e(1);
    }

    /* renamed from: t */
    private final void m16137t() {
        this.f21322f.removeMessages(7);
        this.f21322f.removeMessages(2);
        int i2 = 0;
        this.f21334r = false;
        this.f21325i.m16168b();
        if (this.f21330n == null) {
            return;
        }
        while (true) {
            zzhp[] zzhpVarArr = this.f21330n;
            if (i2 >= zzhpVarArr.length) {
                this.f21330n = null;
                this.f21331o = null;
                this.f21329m.clear();
                return;
            }
            zzhp zzhpVar = zzhpVarArr[i2];
            try {
                m16132l(zzhpVar);
                if (zzhpVar.m20031c() == 2) {
                    zzhpVar.m20030a();
                }
            } catch (zzgd e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            } catch (RuntimeException e3) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e3);
            }
            try {
                zzhpVar.m20032h();
            } catch (zzgd e4) {
                Log.e("ExoPlayerImplInternal", "Release failed.", e4);
            } catch (RuntimeException e5) {
                Log.e("ExoPlayerImplInternal", "Release failed.", e5);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final long m16138a() {
        if (this.f21341y == -1) {
            return -1L;
        }
        return this.f21341y / 1000;
    }

    /* renamed from: b */
    public final long m16139b() {
        if (this.f21339w == -1) {
            return -1L;
        }
        return this.f21339w / 1000;
    }

    /* renamed from: c */
    public final synchronized void m16140c() {
        if (this.f21332p) {
            return;
        }
        this.f21322f.sendEmptyMessage(5);
        while (!this.f21332p) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f21323g.quit();
    }

    /* renamed from: d */
    public final void m16141d(long j2) {
        this.f21322f.obtainMessage(6, Long.valueOf(j2)).sendToTarget();
    }

    /* renamed from: f */
    public final void m16142f() {
        this.f21322f.sendEmptyMessage(4);
    }

    /* renamed from: h */
    public final void m16143h(zzgf zzgfVar, int i2, Object obj) {
        this.f21336t++;
        this.f21322f.obtainMessage(9, 1, 0, Pair.create(zzgfVar, obj)).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzhp zzhpVar;
        int iM20031c;
        try {
            switch (message.what) {
                case 1:
                    zzhp[] zzhpVarArr = (zzhp[]) message.obj;
                    m16137t();
                    this.f21330n = zzhpVarArr;
                    for (int i2 = 0; i2 < zzhpVarArr.length; i2++) {
                        if (zzhpVarArr[i2].mo19989r()) {
                            zzkh.m20129d(this.f21331o == null);
                            this.f21331o = zzhpVarArr[i2];
                        }
                    }
                    m16129e(2);
                    this.f21322f.sendEmptyMessage(2);
                    return true;
                case 2:
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i3 = 0;
                    boolean z = true;
                    while (true) {
                        zzhp[] zzhpVarArr2 = this.f21330n;
                        if (i3 >= zzhpVarArr2.length) {
                            if (z) {
                                long jMax = 0;
                                int i4 = 0;
                                boolean z2 = true;
                                boolean z3 = true;
                                while (true) {
                                    zzhp[] zzhpVarArr3 = this.f21330n;
                                    if (i4 < zzhpVarArr3.length) {
                                        zzhp zzhpVar2 = zzhpVarArr3[i4];
                                        if (this.f21326j[i4] && zzhpVar2.m20031c() == 1) {
                                            zzhpVar2.m20035n(this.f21340x, false);
                                            this.f21329m.add(zzhpVar2);
                                            z2 = z2 && zzhpVar2.mo19990s();
                                            z3 = z3 && m16131j(zzhpVar2);
                                            if (jMax != -1) {
                                                long jMo20006b = zzhpVar2.mo20006b();
                                                if (jMo20006b == -1) {
                                                    jMax = -1;
                                                } else if (jMo20006b != -2) {
                                                    jMax = Math.max(jMax, jMo20006b);
                                                }
                                            }
                                        }
                                        i4++;
                                    } else {
                                        this.f21339w = jMax;
                                        if (z2) {
                                            m16129e(5);
                                        } else {
                                            m16129e(z3 ? 4 : 3);
                                            if (this.f21333q && this.f21335s == 4) {
                                                m16133p();
                                            }
                                        }
                                        this.f21322f.sendEmptyMessage(7);
                                    }
                                }
                            } else {
                                m16130g(2, jElapsedRealtime, 10L);
                            }
                            return true;
                        }
                        if (zzhpVarArr2[i3].m20031c() == 0 && this.f21330n[i3].m20036p(this.f21340x) == 0) {
                            z = false;
                        }
                        i3++;
                    }
                    break;
                case 3:
                    boolean z4 = message.arg1 != 0;
                    try {
                        this.f21334r = false;
                        this.f21333q = z4;
                        if (z4) {
                            int i5 = this.f21335s;
                            if (i5 == 4) {
                                m16133p();
                                this.f21322f.sendEmptyMessage(7);
                            } else if (i5 == 3) {
                                this.f21322f.sendEmptyMessage(7);
                            }
                        } else {
                            m16134q();
                            m16135r();
                        }
                        this.f21324h.obtainMessage(2).sendToTarget();
                        return true;
                    } catch (Throwable th) {
                        this.f21324h.obtainMessage(2).sendToTarget();
                        throw th;
                    }
                case 4:
                    m16136s();
                    return true;
                case 5:
                    m16137t();
                    m16129e(1);
                    synchronized (this) {
                        this.f21332p = true;
                        notifyAll();
                    }
                    return true;
                case 6:
                    long jLongValue = ((Long) message.obj).longValue();
                    this.f21334r = false;
                    this.f21340x = jLongValue * 1000;
                    this.f21325i.m16168b();
                    this.f21325i.m16169c(this.f21340x);
                    int i6 = this.f21335s;
                    if (i6 != 1 && i6 != 2) {
                        for (int i7 = 0; i7 < this.f21329m.size(); i7++) {
                            zzhp zzhpVar3 = this.f21329m.get(i7);
                            m16132l(zzhpVar3);
                            zzhpVar3.mo19987i(this.f21340x);
                        }
                        m16129e(3);
                        this.f21322f.sendEmptyMessage(7);
                        return true;
                    }
                    return true;
                case 7:
                    zzkp.m20153a("doSomeWork");
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long jMin = this.f21339w != -1 ? this.f21339w : Long.MAX_VALUE;
                    m16135r();
                    boolean z5 = true;
                    boolean z6 = true;
                    for (int i8 = 0; i8 < this.f21329m.size(); i8++) {
                        zzhp zzhpVar4 = this.f21329m.get(i8);
                        zzhpVar4.mo20007l(this.f21340x, this.f21338v);
                        z5 = z5 && zzhpVar4.mo19990s();
                        z6 = z6 && m16131j(zzhpVar4);
                        if (jMin != -1) {
                            long jMo20006b2 = zzhpVar4.mo20006b();
                            long jMo20009q = zzhpVar4.mo20009q();
                            if (jMo20009q == -1) {
                                jMin = -1;
                            } else if (jMo20009q != -3 && (jMo20006b2 == -1 || jMo20006b2 == -2 || jMo20009q < jMo20006b2)) {
                                jMin = Math.min(jMin, jMo20009q);
                            }
                        }
                    }
                    this.f21341y = jMin;
                    if (z5) {
                        m16129e(5);
                        m16134q();
                    } else {
                        int i9 = this.f21335s;
                        if (i9 == 3 && z6) {
                            m16129e(4);
                            if (this.f21333q) {
                                m16133p();
                            }
                        } else if (i9 == 4 && !z6) {
                            this.f21334r = this.f21333q;
                            m16129e(3);
                            m16134q();
                        }
                    }
                    this.f21322f.removeMessages(7);
                    if ((this.f21333q && this.f21335s == 4) || this.f21335s == 3) {
                        m16130g(7, jElapsedRealtime2, 10L);
                    } else if (!this.f21329m.isEmpty()) {
                        m16130g(7, jElapsedRealtime2, 1000L);
                    }
                    zzkp.m20154b();
                    return true;
                case 8:
                    int i10 = message.arg1;
                    boolean z7 = message.arg2 != 0;
                    boolean[] zArr = this.f21326j;
                    if (zArr[i10] != z7) {
                        zArr[i10] = z7;
                        int i11 = this.f21335s;
                        if (i11 != 1 && i11 != 2 && ((iM20031c = (zzhpVar = this.f21330n[i10]).m20031c()) == 1 || iM20031c == 2 || iM20031c == 3)) {
                            if (z7) {
                                boolean z8 = this.f21333q && this.f21335s == 4;
                                zzhpVar.m20035n(this.f21340x, z8);
                                this.f21329m.add(zzhpVar);
                                if (z8) {
                                    zzhpVar.m20033j();
                                }
                                this.f21322f.sendEmptyMessage(7);
                            } else {
                                if (zzhpVar == this.f21331o) {
                                    this.f21325i.m16169c(zzhpVar.mo19991t());
                                }
                                m16132l(zzhpVar);
                                this.f21329m.remove(zzhpVar);
                                zzhpVar.m20030a();
                            }
                        }
                    }
                    return true;
                case 9:
                    int i12 = message.arg1;
                    try {
                        Pair pair = (Pair) message.obj;
                        ((zzgf) pair.first).mo19966f(i12, pair.second);
                        synchronized (this) {
                            this.f21337u++;
                            notifyAll();
                        }
                        int i13 = this.f21335s;
                        if (i13 != 1 && i13 != 2) {
                            this.f21322f.sendEmptyMessage(7);
                        }
                        return true;
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f21337u++;
                            notifyAll();
                            throw th2;
                        }
                    }
                default:
                    return false;
            }
        } catch (zzgd e2) {
            Log.e("ExoPlayerImplInternal", "Internal track renderer error.", e2);
            this.f21324h.obtainMessage(3, e2).sendToTarget();
            m16136s();
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            this.f21324h.obtainMessage(3, new zzgd(e3, true)).sendToTarget();
            m16136s();
            return true;
        }
    }

    /* renamed from: i */
    public final void m16144i(zzhp... zzhpVarArr) {
        this.f21322f.obtainMessage(1, zzhpVarArr).sendToTarget();
    }

    /* renamed from: k */
    public final synchronized void m16145k(zzgf zzgfVar, int i2, Object obj) {
        if (this.f21332p) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Sent message(1");
            sb.append(") after release. Message ignored.");
            Log.w("ExoPlayerImplInternal", sb.toString());
            return;
        }
        int i3 = this.f21336t;
        this.f21336t = i3 + 1;
        this.f21322f.obtainMessage(9, 1, 0, Pair.create(zzgfVar, obj)).sendToTarget();
        while (this.f21337u <= i3) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: m */
    public final void m16146m(int i2, boolean z) {
        this.f21322f.obtainMessage(8, 0, z ? 1 : 0).sendToTarget();
    }

    /* renamed from: n */
    public final void m16147n(boolean z) {
        this.f21322f.obtainMessage(3, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: o */
    public final long m16148o() {
        return this.f21340x / 1000;
    }
}
