package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w5 */
/* loaded from: classes2.dex */
final class C7290w5 implements zzz {

    /* renamed from: a */
    private final /* synthetic */ String f20833a;

    /* renamed from: b */
    private final /* synthetic */ C7364y5 f20834b;

    C7290w5(zzayu zzayuVar, String str, C7364y5 c7364y5) {
        this.f20833a = str;
        this.f20834b = c7364y5;
    }

    @Override // com.google.android.gms.internal.ads.zzz
    /* renamed from: a */
    public final void mo14744a(zzaf zzafVar) {
        String str = this.f20833a;
        String string = zzafVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        zzbad.m17353i(sb.toString());
        this.f20834b.mo16053b(null);
    }
}
