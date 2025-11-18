package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.pn */
/* loaded from: classes2.dex */
final /* synthetic */ class C7049pn implements zzbal {

    /* renamed from: a */
    static final zzbal f20318a = new C7049pn();

    private C7049pn() {
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final zzbbh zzf(Object obj) {
        final String str = (String) obj;
        return zzbar.m17378o(new zzcuz(str) { // from class: com.google.android.gms.internal.ads.qn

            /* renamed from: a */
            private final String f20401a;

            {
                this.f20401a = str;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            /* renamed from: a */
            public final void mo15076a(Object obj2) {
                ((Bundle) obj2).putString("ms", this.f20401a);
            }
        });
    }
}
