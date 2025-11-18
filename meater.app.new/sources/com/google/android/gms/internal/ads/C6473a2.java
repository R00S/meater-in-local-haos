package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a2 */
/* loaded from: classes2.dex */
final class C6473a2 implements zzbbv<zzajw> {

    /* renamed from: a */
    final /* synthetic */ zzala f18071a;

    C6473a2(zzala zzalaVar) {
        this.f18071a = zzalaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbv
    /* renamed from: a */
    public final /* synthetic */ void mo14740a(zzajw zzajwVar) {
        final zzajw zzajwVar2 = zzajwVar;
        zzbbm.f22757a.execute(new Runnable(this, zzajwVar2) { // from class: com.google.android.gms.internal.ads.b2

            /* renamed from: f */
            private final C6473a2 f18228f;

            /* renamed from: g */
            private final zzajw f18229g;

            {
                this.f18228f = this;
                this.f18229g = zzajwVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6473a2 c6473a2 = this.f18228f;
                zzajw zzajwVar3 = this.f18229g;
                c6473a2.f18071a.f22097d.mo15097a(zzajwVar3);
                zzajwVar3.destroy();
            }
        });
    }
}
