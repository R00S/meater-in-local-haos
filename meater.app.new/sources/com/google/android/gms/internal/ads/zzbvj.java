package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbvj extends zzbts<zzahy> implements zzahy {
    public zzbvj(Set<zzbuz<zzahy>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    /* renamed from: P */
    public final void mo16580P(final zzato zzatoVar) {
        m18330T(new zzbtu(zzatoVar) { // from class: com.google.android.gms.internal.ads.df

            /* renamed from: a */
            private final zzato f18687a;

            {
                this.f18687a = zzatoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            /* renamed from: a */
            public final void mo14761a(Object obj) {
                ((zzahy) obj).mo16580P(this.f18687a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    /* renamed from: j */
    public final void mo16581j() {
        m18330T(C6634ef.f18816a);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    /* renamed from: r */
    public final synchronized void mo16582r() {
        m18330T(C6560cf.f18448a);
    }
}
