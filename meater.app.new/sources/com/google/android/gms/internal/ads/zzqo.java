package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzqo implements zzql {

    /* renamed from: f */
    private final zzql[] f26842f;

    /* renamed from: g */
    private final ArrayList<zzql> f26843g;

    /* renamed from: i */
    private zzqm f26845i;

    /* renamed from: j */
    private zzlr f26846j;

    /* renamed from: k */
    private Object f26847k;

    /* renamed from: m */
    private zzqq f26849m;

    /* renamed from: h */
    private final zzlu f26844h = new zzlu();

    /* renamed from: l */
    private int f26848l = -1;

    public zzqo(zzql... zzqlVarArr) {
        this.f26842f = zzqlVarArr;
        this.f26843g = new ArrayList<>(Arrays.asList(zzqlVarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m20394e(int i2, zzlr zzlrVar, Object obj) {
        zzqq zzqqVar;
        if (this.f26849m == null) {
            int iMo15900g = zzlrVar.mo15900g();
            int i3 = 0;
            while (true) {
                if (i3 >= iMo15900g) {
                    if (this.f26848l == -1) {
                        this.f26848l = zzlrVar.mo15901h();
                    } else if (zzlrVar.mo15901h() != this.f26848l) {
                        zzqqVar = new zzqq(1);
                    }
                    zzqqVar = null;
                } else {
                    if (zzlrVar.m20218d(i3, this.f26844h, false).f26507e) {
                        zzqqVar = new zzqq(0);
                        break;
                    }
                    i3++;
                }
            }
            this.f26849m = zzqqVar;
        }
        if (this.f26849m != null) {
            return;
        }
        this.f26843g.remove(this.f26842f[i2]);
        if (i2 == 0) {
            this.f26846j = zzlrVar;
            this.f26847k = obj;
        }
        if (this.f26843g.isEmpty()) {
            this.f26845i.mo15159e(this.f26846j, this.f26847k);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: a */
    public final void mo20389a(zzkv zzkvVar, boolean z, zzqm zzqmVar) {
        this.f26845i = zzqmVar;
        int i2 = 0;
        while (true) {
            zzql[] zzqlVarArr = this.f26842f;
            if (i2 >= zzqlVarArr.length) {
                return;
            }
            zzqlVarArr[i2].mo20389a(zzkvVar, false, new g30(this, i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: b */
    public final zzqj mo20390b(int i2, zzrt zzrtVar) {
        int length = this.f26842f.length;
        zzqj[] zzqjVarArr = new zzqj[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzqjVarArr[i3] = this.f26842f[i3].mo20390b(i2, zzrtVar);
        }
        return new f30(zzqjVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: c */
    public final void mo20391c(zzqj zzqjVar) {
        f30 f30Var = (f30) zzqjVar;
        int i2 = 0;
        while (true) {
            zzql[] zzqlVarArr = this.f26842f;
            if (i2 >= zzqlVarArr.length) {
                return;
            }
            zzqlVarArr[i2].mo20391c(f30Var.f18851f[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: d */
    public final void mo20392d() {
        for (zzql zzqlVar : this.f26842f) {
            zzqlVar.mo20392d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: f */
    public final void mo20393f() throws IOException {
        zzqq zzqqVar = this.f26849m;
        if (zzqqVar != null) {
            throw zzqqVar;
        }
        for (zzql zzqlVar : this.f26842f) {
            zzqlVar.mo20393f();
        }
    }
}
