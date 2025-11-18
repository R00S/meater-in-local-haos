package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.q2 */
/* loaded from: classes2.dex */
final class C7572q2<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: f */
    private Iterator<Map.Entry<K, Object>> f27875f;

    public C7572q2(Iterator<Map.Entry<K, Object>> it) {
        this.f27875f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27875f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f27875f.next();
        return next.getValue() instanceof zzfp ? new C7560o2(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f27875f.remove();
    }
}
