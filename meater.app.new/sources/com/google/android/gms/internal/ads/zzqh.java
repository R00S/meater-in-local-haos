package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzqh implements zzql, zzqm {

    /* renamed from: f */
    private final Uri f26830f;

    /* renamed from: g */
    private final zzrw f26831g;

    /* renamed from: h */
    private final zznq f26832h;

    /* renamed from: j */
    private final Handler f26834j;

    /* renamed from: k */
    private final zzqi f26835k;

    /* renamed from: n */
    private final int f26838n;

    /* renamed from: o */
    private zzqm f26839o;

    /* renamed from: p */
    private zzlr f26840p;

    /* renamed from: q */
    private boolean f26841q;

    /* renamed from: i */
    private final int f26833i = -1;

    /* renamed from: m */
    private final String f26837m = null;

    /* renamed from: l */
    private final zzlt f26836l = new zzlt();

    public zzqh(Uri uri, zzrw zzrwVar, zznq zznqVar, int i2, Handler handler, zzqi zzqiVar, String str, int i3) {
        this.f26830f = uri;
        this.f26831g = zzrwVar;
        this.f26832h = zznqVar;
        this.f26834j = handler;
        this.f26835k = zzqiVar;
        this.f26838n = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: a */
    public final void mo20389a(zzkv zzkvVar, boolean z, zzqm zzqmVar) {
        this.f26839o = zzqmVar;
        zzqz zzqzVar = new zzqz(-9223372036854775807L, false);
        this.f26840p = zzqzVar;
        zzqmVar.mo15159e(zzqzVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: b */
    public final zzqj mo20390b(int i2, zzrt zzrtVar) {
        zzsk.m20477a(i2 == 0);
        return new x20(this.f26830f, this.f26831g.mo15673a(), this.f26832h.mo15390a(), this.f26833i, this.f26834j, this.f26835k, this, zzrtVar, null, this.f26838n);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: c */
    public final void mo20391c(zzqj zzqjVar) {
        ((x20) zzqjVar).m16029o();
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: d */
    public final void mo20392d() {
        this.f26839o = null;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    /* renamed from: e */
    public final void mo15159e(zzlr zzlrVar, Object obj) {
        boolean z = zzlrVar.mo15897c(0, this.f26836l, false).f26500d != -9223372036854775807L;
        if (!this.f26841q || z) {
            this.f26840p = zzlrVar;
            this.f26841q = z;
            this.f26839o.mo15159e(zzlrVar, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    /* renamed from: f */
    public final void mo20393f() throws IOException {
    }
}
