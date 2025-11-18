package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbrm extends zzbts<zzbro> implements zzbro {
    public zzbrm(Set<zzbuz<zzbro>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(final int i2) {
        m18330T(new zzbtu(i2) { // from class: com.google.android.gms.internal.ads.rd

            /* renamed from: a */
            private final int f20446a;

            {
                this.f20446a = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            /* renamed from: a */
            public final void mo14761a(Object obj) {
                ((zzbro) obj).onAdFailedToLoad(this.f20446a);
            }
        });
    }
}
