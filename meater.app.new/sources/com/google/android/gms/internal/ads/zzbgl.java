package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public abstract class zzbgl extends zzbft {

    /* renamed from: i */
    private final zzbdk f23000i;

    /* renamed from: j */
    private boolean f23001j;

    /* renamed from: k */
    private String f23002k;

    /* renamed from: l */
    private boolean f23003l;

    public zzbgl(zzbdf zzbdfVar) {
        super(zzbdfVar);
        this.f23002k = null;
        zzbdk zzbdkVar = new zzbdk();
        this.f23000i = zzbdkVar;
        zzbdkVar.m17500c(new C6814ja(this));
    }

    /* renamed from: C */
    protected abstract zzhn mo17650C(String str);

    /* renamed from: D */
    protected abstract int mo17651D();

    /* renamed from: E */
    public final void m17654E() {
        synchronized (this) {
            this.f23003l = true;
            this.f23000i.m17499a();
        }
    }

    /* renamed from: F */
    public final zzbdk m17655F() {
        return this.f23000i;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        synchronized (this) {
            this.f23001j = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft, com.google.android.gms.common.api.Releasable
    /* renamed from: c */
    public void mo13849c() {
        this.f23000i.m17503i();
        super.mo13849c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        java.lang.Thread.sleep(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        throw new java.io.IOException("Interrupted sleep.");
     */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [long] */
    /* JADX WARN: Type inference failed for: r1v34 */
    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo17640y(java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgl.mo17640y(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: z */
    protected final String mo17641z(String str) {
        String strValueOf = String.valueOf(super.mo17641z(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }
}
