package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdtp<T> {

    /* renamed from: a */
    private final List<T> f25992a = new ArrayList(11);

    private zzdtp(int i2) {
    }

    /* renamed from: d */
    public static <T> zzdtp<T> m19876d(int i2) {
        return new zzdtp<>(11);
    }

    /* renamed from: a */
    public final zzdtp<T> m19877a(T t) {
        this.f25992a.add(zzdto.m19874b(t, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: b */
    public final zzdtp<T> m19878b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            zzdto.m19874b(it.next(), "Set contributions cannot be null");
        }
        this.f25992a.addAll(collection);
        return this;
    }

    /* renamed from: c */
    public final Set<T> m19879c() {
        int size = this.f25992a.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableSet(new HashSet(this.f25992a)) : Collections.singleton(this.f25992a.get(0)) : Collections.emptySet();
    }
}
