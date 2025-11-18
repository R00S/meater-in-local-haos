package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.w3 */
/* loaded from: classes2.dex */
final class C7609w3<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f27920f;

    /* renamed from: g */
    private Iterator<Map.Entry<K, V>> f27921g;

    /* renamed from: h */
    private final /* synthetic */ C7597u3 f27922h;

    private C7609w3(C7597u3 c7597u3) {
        this.f27922h = c7597u3;
        this.f27920f = c7597u3.f27904g.size();
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m21442b() {
        if (this.f27921g == null) {
            this.f27921g = this.f27922h.f27908k.entrySet().iterator();
        }
        return this.f27921g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f27920f;
        return (i2 > 0 && i2 <= this.f27922h.f27904g.size()) || m21442b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (m21442b().hasNext()) {
            return m21442b().next();
        }
        List list = this.f27922h.f27904g;
        int i2 = this.f27920f - 1;
        this.f27920f = i2;
        return (Map.Entry) list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C7609w3(C7597u3 c7597u3, C7591t3 c7591t3) {
        this(c7597u3);
    }
}
