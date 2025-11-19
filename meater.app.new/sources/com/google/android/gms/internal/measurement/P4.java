package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class P4<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: B, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f33840B;

    public P4(Iterator<Map.Entry<K, Object>> it) {
        this.f33840B = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33840B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f33840B.next();
        return next.getValue() instanceof N4 ? new Q4(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f33840B.remove();
    }
}
