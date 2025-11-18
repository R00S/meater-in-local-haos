package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ja */
/* loaded from: classes2.dex */
final class C6814ja implements zzbdo {

    /* renamed from: a */
    private final /* synthetic */ zzbgl f19467a;

    C6814ja(zzbgl zzbglVar) {
        this.f19467a = zzbglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdo
    /* renamed from: b */
    public final void mo15368b(String str, String str2) {
        zzbgl zzbglVar = this.f19467a;
        String strValueOf = String.valueOf(str);
        zzbglVar.f23002k = strValueOf.length() != 0 ? "ExoPlayer caching failed. Type: ".concat(strValueOf) : new String("ExoPlayer caching failed. Type: ");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(str2).length());
        sb.append("ExoPlayer failed during precache: ");
        sb.append(str);
        sb.append(" Exception: ");
        sb.append(str2);
        zzbad.m17353i(sb.toString());
        this.f19467a.mo17627b();
    }
}
