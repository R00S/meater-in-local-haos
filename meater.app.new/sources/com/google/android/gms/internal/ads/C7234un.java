package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.un */
/* loaded from: classes2.dex */
final /* synthetic */ class C7234un implements zzbam {

    /* renamed from: a */
    static final zzbam f20645a = new C7234un();

    private C7234un() {
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    /* renamed from: a */
    public final Object mo14764a(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzcuz(arrayList) { // from class: com.google.android.gms.internal.ads.vn

            /* renamed from: a */
            private final ArrayList f20748a;

            {
                this.f20748a = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            /* renamed from: a */
            public final void mo15076a(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.f20748a);
            }
        };
    }
}
