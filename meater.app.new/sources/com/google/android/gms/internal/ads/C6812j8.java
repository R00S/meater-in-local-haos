package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.j8 */
/* loaded from: classes2.dex */
final class C6812j8 implements zzgh {

    /* renamed from: a */
    private WeakReference<zzgh> f19464a;

    /* renamed from: b */
    private final /* synthetic */ zzbdk f19465b;

    private C6812j8(zzbdk zzbdkVar) {
        this.f19465b = zzbdkVar;
        this.f19464a = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    /* renamed from: a */
    public final void mo15364a(boolean z, int i2) {
        zzgh zzghVar = this.f19464a.get();
        if (zzghVar != null) {
            zzghVar.mo15364a(z, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    /* renamed from: b */
    public final void mo15365b(zzgd zzgdVar) {
        this.f19465b.m17496f("PlayerError", zzgdVar.getMessage());
        zzgh zzghVar = this.f19464a.get();
        if (zzghVar != null) {
            zzghVar.mo15365b(zzgdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    /* renamed from: c */
    public final void mo15366c() {
        zzgh zzghVar = this.f19464a.get();
        if (zzghVar != null) {
            zzghVar.mo15366c();
        }
    }

    /* renamed from: d */
    public final void m15367d(zzgh zzghVar) {
        this.f19464a = new WeakReference<>(zzghVar);
    }
}
