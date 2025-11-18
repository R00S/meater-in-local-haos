package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sn */
/* loaded from: classes2.dex */
final class C7160sn implements zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final Set<String> f20529a;

    C7160sn(Set<String> set) {
        this.f20529a = set;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcuz<Bundle>> mo14982b() {
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f20529a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return zzbar.m17378o(new zzcuz(arrayList) { // from class: com.google.android.gms.internal.ads.tn

            /* renamed from: a */
            private final ArrayList f20577a;

            {
                this.f20577a = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            /* renamed from: a */
            public final void mo15076a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.f20577a);
            }
        });
    }
}
