package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbry extends zzbts<zzbrx> {
    public zzbry(Set<zzbuz<zzbrx>> set) {
        super(set);
    }

    /* renamed from: Y */
    public final void m18303Y(zzbvp zzbvpVar, Executor executor) {
        m18331U(zzbuz.m18387a(new C7372yd(this, zzbvpVar), executor));
    }

    /* renamed from: f0 */
    public final void m18304f0(final Context context) {
        m18330T(new zzbtu(context) { // from class: com.google.android.gms.internal.ads.ud

            /* renamed from: a */
            private final Context f20629a;

            {
                this.f20629a = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            /* renamed from: a */
            public final void mo14761a(Object obj) {
                ((zzbrx) obj).mo16105r(this.f20629a);
            }
        });
    }

    /* renamed from: g0 */
    public final void m18305g0(final Context context) {
        m18330T(new zzbtu(context) { // from class: com.google.android.gms.internal.ads.wd

            /* renamed from: a */
            private final Context f20847a;

            {
                this.f20847a = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            /* renamed from: a */
            public final void mo14761a(Object obj) {
                ((zzbrx) obj).mo16104k(this.f20847a);
            }
        });
    }

    /* renamed from: i0 */
    public final void m18306i0(final Context context) {
        m18330T(new zzbtu(context) { // from class: com.google.android.gms.internal.ads.xd

            /* renamed from: a */
            private final Context f20969a;

            {
                this.f20969a = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            /* renamed from: a */
            public final void mo14761a(Object obj) {
                ((zzbrx) obj).mo16103j(this.f20969a);
            }
        });
    }
}
