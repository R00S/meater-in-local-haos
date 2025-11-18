package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdtq<T> implements zzdti<Set<T>> {

    /* renamed from: a */
    private static final zzdti<Set<Object>> f25993a = zzdtj.m19869a(Collections.emptySet());

    /* renamed from: b */
    private final List<zzdtu<T>> f25994b;

    /* renamed from: c */
    private final List<zzdtu<Collection<T>>> f25995c;

    private zzdtq(List<zzdtu<T>> list, List<zzdtu<Collection<T>>> list2) {
        this.f25994b = list;
        this.f25995c = list2;
    }

    /* renamed from: a */
    public static <T> zzdts<T> m19880a(int i2, int i3) {
        return new zzdts<>(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        int size = this.f25994b.size();
        ArrayList arrayList = new ArrayList(this.f25995c.size());
        int size2 = this.f25995c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection<T> collection = this.f25995c.get(i2).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetM19863b = zzdtf.m19863b(size);
        int size3 = this.f25994b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            hashSetM19863b.add(zzdto.m19873a(this.f25994b.get(i3).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            Iterator it = ((Collection) arrayList.get(i4)).iterator();
            while (it.hasNext()) {
                hashSetM19863b.add(zzdto.m19873a(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetM19863b);
    }
}
