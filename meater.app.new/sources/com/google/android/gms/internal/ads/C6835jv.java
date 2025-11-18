package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jv */
/* loaded from: classes2.dex */
final class C6835jv<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: f */
    private Iterator<Map.Entry<K, Object>> f19503f;

    public C6835jv(Iterator<Map.Entry<K, Object>> it) {
        this.f19503f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19503f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f19503f.next();
        return next.getValue() instanceof zzdon ? new C6798iv(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19503f.remove();
    }
}
