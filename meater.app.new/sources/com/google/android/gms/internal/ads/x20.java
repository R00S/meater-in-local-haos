package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes2.dex */
final class x20 implements zznp, zzqj, zzqv, zzsf<c30> {

    /* renamed from: A */
    private boolean f20900A;

    /* renamed from: B */
    private int f20901B;

    /* renamed from: C */
    private zzrb f20902C;

    /* renamed from: D */
    private long f20903D;

    /* renamed from: E */
    private boolean[] f20904E;

    /* renamed from: F */
    private boolean[] f20905F;

    /* renamed from: G */
    private boolean f20906G;

    /* renamed from: I */
    private long f20908I;

    /* renamed from: K */
    private int f20910K;

    /* renamed from: L */
    private boolean f20911L;

    /* renamed from: M */
    private boolean f20912M;

    /* renamed from: f */
    private final Uri f20913f;

    /* renamed from: g */
    private final zzrv f20914g;

    /* renamed from: h */
    private final int f20915h;

    /* renamed from: i */
    private final Handler f20916i;

    /* renamed from: j */
    private final zzqi f20917j;

    /* renamed from: k */
    private final zzqm f20918k;

    /* renamed from: l */
    private final zzrt f20919l;

    /* renamed from: m */
    private final String f20920m;

    /* renamed from: n */
    private final long f20921n;

    /* renamed from: p */
    private final d30 f20923p;

    /* renamed from: v */
    private zzqk f20929v;

    /* renamed from: w */
    private zznu f20930w;

    /* renamed from: x */
    private boolean f20931x;

    /* renamed from: y */
    private boolean f20932y;

    /* renamed from: z */
    private boolean f20933z;

    /* renamed from: o */
    private final zzse f20922o = new zzse("Loader:ExtractorMediaPeriod");

    /* renamed from: q */
    private final zzsm f20924q = new zzsm();

    /* renamed from: r */
    private final Runnable f20925r = new y20(this);

    /* renamed from: s */
    private final Runnable f20926s = new z20(this);

    /* renamed from: t */
    private final Handler f20927t = new Handler();

    /* renamed from: J */
    private long f20909J = -9223372036854775807L;

    /* renamed from: u */
    private final SparseArray<zzqt> f20928u = new SparseArray<>();

    /* renamed from: H */
    private long f20907H = -1;

    public x20(Uri uri, zzrv zzrvVar, zznn[] zznnVarArr, int i2, Handler handler, zzqi zzqiVar, zzqm zzqmVar, zzrt zzrtVar, String str, int i3) {
        this.f20913f = uri;
        this.f20914g = zzrvVar;
        this.f20915h = i2;
        this.f20916i = handler;
        this.f20917j = zzqiVar;
        this.f20918k = zzqmVar;
        this.f20919l = zzrtVar;
        this.f20920m = str;
        this.f20921n = i3;
        this.f20923p = new d30(zznnVarArr, this);
    }

    /* renamed from: D */
    private final boolean m16009D() {
        return this.f20909J != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m16013I() {
        if (this.f20912M || this.f20932y || this.f20930w == null || !this.f20931x) {
            return;
        }
        int size = this.f20928u.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f20928u.valueAt(i2).m20409p() == null) {
                return;
            }
        }
        this.f20924q.m20490c();
        zzra[] zzraVarArr = new zzra[size];
        this.f20905F = new boolean[size];
        this.f20904E = new boolean[size];
        this.f20903D = this.f20930w.mo20315f();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                this.f20902C = new zzrb(zzraVarArr);
                this.f20932y = true;
                this.f20918k.mo15159e(new zzqz(this.f20903D, this.f20930w.mo20314b()), null);
                this.f20929v.mo15127d(this);
                return;
            }
            zzlh zzlhVarM20409p = this.f20928u.valueAt(i3).m20409p();
            zzraVarArr[i3] = new zzra(zzlhVarM20409p);
            String str = zzlhVarM20409p.f26470k;
            if (!zzsp.m20496c(str) && !zzsp.m20495b(str)) {
                z = false;
            }
            this.f20905F[i3] = z;
            this.f20906G = z | this.f20906G;
            i3++;
        }
    }

    /* renamed from: J */
    private final int m16014J() {
        int size = this.f20928u.size();
        int iM20407n = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM20407n += this.f20928u.valueAt(i2).m20407n();
        }
        return iM20407n;
    }

    /* renamed from: K */
    private final long m16015K() {
        int size = this.f20928u.size();
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.f20928u.valueAt(i2).m20406l());
        }
        return jMax;
    }

    /* renamed from: p */
    private final void m16016p() {
        zznu zznuVar;
        c30 c30Var = new c30(this, this.f20913f, this.f20914g, this.f20923p, this.f20924q);
        if (this.f20932y) {
            zzsk.m20481e(m16009D());
            long j2 = this.f20903D;
            if (j2 != -9223372036854775807L && this.f20909J >= j2) {
                this.f20911L = true;
                this.f20909J = -9223372036854775807L;
                return;
            } else {
                c30Var.m14962e(this.f20930w.mo20313a(this.f20909J), this.f20909J);
                this.f20909J = -9223372036854775807L;
            }
        }
        this.f20910K = m16014J();
        int i2 = this.f20915h;
        if (i2 == -1) {
            i2 = (this.f20932y && this.f20907H == -1 && ((zznuVar = this.f20930w) == null || zznuVar.mo20315f() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f20922o.m20473b(c30Var, this, i2);
    }

    /* renamed from: t */
    private final void m16018t(c30 c30Var) {
        if (this.f20907H == -1) {
            this.f20907H = c30Var.f18400i;
        }
    }

    /* renamed from: C */
    final void m16022C(int i2, long j2) {
        zzqt zzqtVarValueAt = this.f20928u.valueAt(i2);
        if (!this.f20911L || j2 <= zzqtVarValueAt.m20406l()) {
            zzqtVarValueAt.m20405k(j2, true);
        } else {
            zzqtVarValueAt.m20410q();
        }
    }

    /* renamed from: H */
    final void m16023H() throws IOException {
        this.f20922o.m20475h(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzqx
    /* renamed from: a */
    public final long mo15124a() {
        if (this.f20901B == 0) {
            return Long.MIN_VALUE;
        }
        return mo15135r();
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzqx
    /* renamed from: b */
    public final boolean mo15125b(long j2) {
        if (this.f20911L) {
            return false;
        }
        if (this.f20932y && this.f20901B == 0) {
            return false;
        }
        boolean zM20489b = this.f20924q.m20489b();
        if (this.f20922o.m20472a()) {
            return zM20489b;
        }
        m16016p();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: c */
    public final long mo15126c(zzrm[] zzrmVarArr, boolean[] zArr, zzqw[] zzqwVarArr, boolean[] zArr2, long j2) {
        zzsk.m20481e(this.f20932y);
        for (int i2 = 0; i2 < zzrmVarArr.length; i2++) {
            if (zzqwVarArr[i2] != null && (zzrmVarArr[i2] == null || !zArr[i2])) {
                int i3 = ((e30) zzqwVarArr[i2]).f18725a;
                zzsk.m20481e(this.f20904E[i3]);
                this.f20901B--;
                this.f20904E[i3] = false;
                this.f20928u.valueAt(i3).m20402e();
                zzqwVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i4 = 0; i4 < zzrmVarArr.length; i4++) {
            if (zzqwVarArr[i4] == null && zzrmVarArr[i4] != null) {
                zzrm zzrmVar = zzrmVarArr[i4];
                zzsk.m20481e(zzrmVar.length() == 1);
                zzsk.m20481e(zzrmVar.mo20439b(0) == 0);
                int iM20436a = this.f20902C.m20436a(zzrmVar.mo20438a());
                zzsk.m20481e(!this.f20904E[iM20436a]);
                this.f20901B++;
                this.f20904E[iM20436a] = true;
                zzqwVarArr[i4] = new e30(this, iM20436a);
                zArr2[i4] = true;
                z = true;
            }
        }
        if (!this.f20933z) {
            int size = this.f20928u.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (!this.f20904E[i5]) {
                    this.f20928u.valueAt(i5).m20402e();
                }
            }
        }
        if (this.f20901B == 0) {
            this.f20900A = false;
            if (this.f20922o.m20472a()) {
                this.f20922o.m20476i();
            }
        } else if (!this.f20933z ? j2 != 0 : z) {
            j2 = mo15131h(j2);
            for (int i6 = 0; i6 < zzqwVarArr.length; i6++) {
                if (zzqwVarArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.f20933z = true;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    /* renamed from: d */
    public final void mo16024d() {
        this.f20931x = true;
        this.f20927t.post(this.f20925r);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: e */
    public final long mo15128e() {
        if (!this.f20900A) {
            return -9223372036854775807L;
        }
        this.f20900A = false;
        return this.f20908I;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: f */
    public final void mo15129f() throws IOException {
        this.f20922o.m20475h(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    /* renamed from: g */
    public final /* synthetic */ void mo16025g(zzsh zzshVar, long j2, long j3) {
        m16018t((c30) zzshVar);
        this.f20911L = true;
        if (this.f20903D == -9223372036854775807L) {
            long jM16015K = m16015K();
            this.f20903D = jM16015K == Long.MIN_VALUE ? 0L : jM16015K + 10000;
            this.f20918k.mo15159e(new zzqz(this.f20903D, this.f20930w.mo20314b()), null);
        }
        this.f20929v.mo15130g(this);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: h */
    public final long mo15131h(long j2) {
        if (!this.f20930w.mo20314b()) {
            j2 = 0;
        }
        this.f20908I = j2;
        int size = this.f20928u.size();
        boolean zM20405k = !m16009D();
        for (int i2 = 0; zM20405k && i2 < size; i2++) {
            if (this.f20904E[i2]) {
                zM20405k = this.f20928u.valueAt(i2).m20405k(j2, false);
            }
        }
        if (!zM20405k) {
            this.f20909J = j2;
            this.f20911L = false;
            if (this.f20922o.m20472a()) {
                this.f20922o.m20476i();
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    this.f20928u.valueAt(i3).m20411t(this.f20904E[i3]);
                }
            }
        }
        this.f20900A = false;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    /* renamed from: i */
    public final void mo16026i(zzlh zzlhVar) {
        this.f20927t.post(this.f20925r);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: j */
    public final void mo15132j(zzqk zzqkVar, long j2) {
        this.f20929v = zzqkVar;
        this.f20924q.m20489b();
        m16016p();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: k */
    public final void mo15133k(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: l */
    public final zzrb mo15134l() {
        return this.f20902C;
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    /* renamed from: m */
    public final /* synthetic */ int mo16027m(zzsh zzshVar, long j2, long j3, IOException iOException) {
        zznu zznuVar;
        c30 c30Var = (c30) zzshVar;
        m16018t(c30Var);
        Handler handler = this.f20916i;
        if (handler != null && this.f20917j != null) {
            handler.post(new b30(this, iOException));
        }
        if (iOException instanceof zzrc) {
            return 3;
        }
        boolean z = m16014J() > this.f20910K;
        if (this.f20907H == -1 && ((zznuVar = this.f20930w) == null || zznuVar.mo20315f() == -9223372036854775807L)) {
            this.f20908I = 0L;
            this.f20900A = this.f20932y;
            int size = this.f20928u.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f20928u.valueAt(i2).m20411t(!this.f20932y || this.f20904E[i2]);
            }
            c30Var.m14962e(0L, 0L);
        }
        this.f20910K = m16014J();
        return z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    /* renamed from: n */
    public final /* synthetic */ void mo16028n(zzsh zzshVar, long j2, long j3, boolean z) {
        m16018t((c30) zzshVar);
        if (z || this.f20901B <= 0) {
            return;
        }
        int size = this.f20928u.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f20928u.valueAt(i2).m20411t(this.f20904E[i2]);
        }
        this.f20929v.mo15130g(this);
    }

    /* renamed from: o */
    public final void m16029o() {
        this.f20922o.m20474f(new a30(this, this.f20923p));
        this.f20927t.removeCallbacksAndMessages(null);
        this.f20912M = true;
    }

    /* renamed from: q */
    final int m16030q(int i2, zzlj zzljVar, zznd zzndVar, boolean z) {
        if (this.f20900A || m16009D()) {
            return -3;
        }
        return this.f20928u.valueAt(i2).m20403f(zzljVar, zzndVar, z, this.f20911L, this.f20908I);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: r */
    public final long mo15135r() {
        long jM16015K;
        if (this.f20911L) {
            return Long.MIN_VALUE;
        }
        if (m16009D()) {
            return this.f20909J;
        }
        if (this.f20906G) {
            jM16015K = Long.MAX_VALUE;
            int size = this.f20928u.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f20905F[i2]) {
                    jM16015K = Math.min(jM16015K, this.f20928u.valueAt(i2).m20406l());
                }
            }
        } else {
            jM16015K = m16015K();
        }
        return jM16015K == Long.MIN_VALUE ? this.f20908I : jM16015K;
    }

    /* renamed from: v */
    final boolean m16031v(int i2) {
        if (this.f20911L) {
            return true;
        }
        return !m16009D() && this.f20928u.valueAt(i2).m20408o();
    }

    @Override // com.google.android.gms.internal.ads.zznp
    /* renamed from: y */
    public final zznw mo16032y(int i2, int i3) {
        zzqt zzqtVar = this.f20928u.get(i2);
        if (zzqtVar != null) {
            return zzqtVar;
        }
        zzqt zzqtVar2 = new zzqt(this.f20919l);
        zzqtVar2.m20404h(this);
        this.f20928u.put(i2, zzqtVar2);
        return zzqtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    /* renamed from: z */
    public final void mo16033z(zznu zznuVar) {
        this.f20930w = zznuVar;
        this.f20927t.post(this.f20925r);
    }
}
