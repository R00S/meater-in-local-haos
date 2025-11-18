package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdts<T> {

    /* renamed from: a */
    private final List<zzdtu<T>> f25996a;

    /* renamed from: b */
    private final List<zzdtu<Collection<T>>> f25997b;

    private zzdts(int i2, int i3) {
        this.f25996a = zzdtf.m19862a(i2);
        this.f25997b = zzdtf.m19862a(i3);
    }

    /* renamed from: a */
    public final zzdts<T> m19881a(zzdtu<? extends T> zzdtuVar) {
        this.f25996a.add(zzdtuVar);
        return this;
    }

    /* renamed from: b */
    public final zzdts<T> m19882b(zzdtu<? extends Collection<? extends T>> zzdtuVar) {
        this.f25997b.add(zzdtuVar);
        return this;
    }

    /* renamed from: c */
    public final zzdtq<T> m19883c() {
        return new zzdtq<>(this.f25996a, this.f25997b);
    }
}
