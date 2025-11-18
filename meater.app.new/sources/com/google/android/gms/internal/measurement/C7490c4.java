package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c4 */
/* loaded from: classes2.dex */
final class C7490c4<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f27708f;

    /* renamed from: g */
    private boolean f27709g;

    /* renamed from: h */
    private Iterator<Map.Entry<K, V>> f27710h;

    /* renamed from: i */
    private final /* synthetic */ C7597u3 f27711i;

    private C7490c4(C7597u3 c7597u3) {
        this.f27711i = c7597u3;
        this.f27708f = -1;
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m21029b() {
        if (this.f27710h == null) {
            this.f27710h = this.f27711i.f27905h.entrySet().iterator();
        }
        return this.f27710h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27708f + 1 < this.f27711i.f27904g.size() || (!this.f27711i.f27905h.isEmpty() && m21029b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f27709g = true;
        int i2 = this.f27708f + 1;
        this.f27708f = i2;
        return i2 < this.f27711i.f27904g.size() ? (Map.Entry) this.f27711i.f27904g.get(this.f27708f) : m21029b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f27709g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f27709g = false;
        this.f27711i.m21426q();
        if (this.f27708f >= this.f27711i.f27904g.size()) {
            m21029b().remove();
            return;
        }
        C7597u3 c7597u3 = this.f27711i;
        int i2 = this.f27708f;
        this.f27708f = i2 - 1;
        c7597u3.m21423l(i2);
    }

    /* synthetic */ C7490c4(C7597u3 c7597u3, C7591t3 c7591t3) {
        this(c7597u3);
    }
}
