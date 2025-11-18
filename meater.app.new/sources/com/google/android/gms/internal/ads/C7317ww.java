package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.google.android.gms.internal.ads.ww */
/* loaded from: classes2.dex */
final class C7317ww<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f20873f;

    /* renamed from: g */
    private boolean f20874g;

    /* renamed from: h */
    private Iterator<Map.Entry<K, V>> f20875h;

    /* renamed from: i */
    private final /* synthetic */ C7021ow f20876i;

    private C7317ww(C7021ow c7021ow) {
        this.f20876i = c7021ow;
        this.f20873f = -1;
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m15984b() {
        if (this.f20875h == null) {
            this.f20875h = this.f20876i.f20219h.entrySet().iterator();
        }
        return this.f20875h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20873f + 1 < this.f20876i.f20218g.size() || (!this.f20876i.f20219h.isEmpty() && m15984b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f20874g = true;
        int i2 = this.f20873f + 1;
        this.f20873f = i2;
        return i2 < this.f20876i.f20218g.size() ? (Map.Entry) this.f20876i.f20218g.get(this.f20873f) : m15984b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20874g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f20874g = false;
        this.f20876i.m15697k();
        if (this.f20873f >= this.f20876i.f20218g.size()) {
            m15984b().remove();
            return;
        }
        C7021ow c7021ow = this.f20876i;
        int i2 = this.f20873f;
        this.f20873f = i2 - 1;
        c7021ow.m15703r(i2);
    }

    /* synthetic */ C7317ww(C7021ow c7021ow, C7058pw c7058pw) {
        this(c7021ow);
    }
}
