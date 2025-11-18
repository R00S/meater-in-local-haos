package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class zzow implements zznn, zznu {

    /* renamed from: a */
    private static final zznq f26722a = new k20();

    /* renamed from: b */
    private static final int f26723b = zzsy.m20545i("qt  ");

    /* renamed from: g */
    private int f26728g;

    /* renamed from: h */
    private int f26729h;

    /* renamed from: i */
    private long f26730i;

    /* renamed from: j */
    private int f26731j;

    /* renamed from: k */
    private zzst f26732k;

    /* renamed from: l */
    private int f26733l;

    /* renamed from: m */
    private int f26734m;

    /* renamed from: n */
    private zznp f26735n;

    /* renamed from: o */
    private l20[] f26736o;

    /* renamed from: p */
    private long f26737p;

    /* renamed from: q */
    private boolean f26738q;

    /* renamed from: e */
    private final zzst f26726e = new zzst(16);

    /* renamed from: f */
    private final Stack<z10> f26727f = new Stack<>();

    /* renamed from: c */
    private final zzst f26724c = new zzst(zzsq.f26995a);

    /* renamed from: d */
    private final zzst f26725d = new zzst(4);

    /* renamed from: i */
    private final void m20357i(long j2) throws zzlm {
        zzpa zzpaVarM14846b;
        while (!this.f26727f.isEmpty() && this.f26727f.peek().f21351Q0 == j2) {
            z10 z10VarPop = this.f26727f.pop();
            if (z10VarPop.f21091P0 == y10.f21000B) {
                long jMax = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzpo zzpoVarM14848d = null;
                zznr zznrVar = new zznr();
                a20 a20VarM16152d = z10VarPop.m16152d(y10.f20999A0);
                if (a20VarM16152d != null && (zzpoVarM14848d = b20.m14848d(a20VarM16152d, this.f26738q)) != null) {
                    zznrVar.m20335a(zzpoVarM14848d);
                }
                for (int i2 = 0; i2 < z10VarPop.f21353S0.size(); i2++) {
                    z10 z10Var = z10VarPop.f21353S0.get(i2);
                    if (z10Var.f21091P0 == y10.f21004D && (zzpaVarM14846b = b20.m14846b(z10Var, z10VarPop.m16152d(y10.f21002C), -9223372036854775807L, null, this.f26738q)) != null) {
                        n20 n20VarM14847c = b20.m14847c(zzpaVarM14846b, z10Var.m16153e(y10.f21006E).m16153e(y10.f21008F).m16153e(y10.f21010G), zznrVar);
                        if (n20VarM14847c.f19975a != 0) {
                            l20 l20Var = new l20(zzpaVarM14846b, n20VarM14847c, this.f26735n.mo16032y(i2, zzpaVarM14846b.f26746b));
                            zzlh zzlhVarM20206j = zzpaVarM14846b.f26750f.m20206j(n20VarM14847c.f19978d + 30);
                            if (zzpaVarM14846b.f26746b == 1) {
                                if (zznrVar.m20336c()) {
                                    zzlhVarM20206j = zzlhVarM20206j.m20207k(zznrVar.f26656c, zznrVar.f26657d);
                                }
                                if (zzpoVarM14848d != null) {
                                    zzlhVarM20206j = zzlhVarM20206j.m20205a(zzpoVarM14848d);
                                }
                            }
                            l20Var.f19741c.mo20337a(zzlhVarM20206j);
                            jMax = Math.max(jMax, zzpaVarM14846b.f26749e);
                            arrayList.add(l20Var);
                        }
                    }
                }
                this.f26737p = jMax;
                this.f26736o = (l20[]) arrayList.toArray(new l20[arrayList.size()]);
                this.f26735n.mo16024d();
                this.f26735n.mo16033z(this);
                this.f26727f.clear();
                this.f26728g = 2;
            } else if (!this.f26727f.isEmpty()) {
                this.f26727f.peek().f21353S0.add(z10VarPop);
            }
        }
        if (this.f26728g != 2) {
            m20358j();
        }
    }

    /* renamed from: j */
    private final void m20358j() {
        this.f26728g = 0;
        this.f26731j = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: a */
    public final long mo20313a(long j2) {
        long j3 = Long.MAX_VALUE;
        for (l20 l20Var : this.f26736o) {
            n20 n20Var = l20Var.f19740b;
            int iM15592a = n20Var.m15592a(j2);
            if (iM15592a == -1) {
                iM15592a = n20Var.m15593b(j2);
            }
            long j4 = n20Var.f19976b[iM15592a];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: b */
    public final boolean mo20314b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: c */
    public final void mo20329c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ec  */
    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo20330d(com.google.android.gms.internal.ads.zzno r24, com.google.android.gms.internal.ads.zznt r25) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzow.mo20330d(com.google.android.gms.internal.ads.zzno, com.google.android.gms.internal.ads.zznt):int");
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: e */
    public final void mo20331e(zznp zznpVar) {
        this.f26735n = zznpVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: f */
    public final long mo20315f() {
        return this.f26737p;
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: g */
    public final boolean mo20332g(zzno zznoVar) throws InterruptedException, IOException {
        return m20.m15524a(zznoVar);
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: h */
    public final void mo20333h(long j2, long j3) {
        this.f26727f.clear();
        this.f26731j = 0;
        this.f26733l = 0;
        this.f26734m = 0;
        if (j2 == 0) {
            m20358j();
            return;
        }
        l20[] l20VarArr = this.f26736o;
        if (l20VarArr != null) {
            for (l20 l20Var : l20VarArr) {
                n20 n20Var = l20Var.f19740b;
                int iM15592a = n20Var.m15592a(j3);
                if (iM15592a == -1) {
                    iM15592a = n20Var.m15593b(j3);
                }
                l20Var.f19742d = iM15592a;
            }
        }
    }
}
