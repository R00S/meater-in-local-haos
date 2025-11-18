package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.google.android.gms.internal.ads.qw */
/* loaded from: classes2.dex */
final class C7095qw<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f20412f;

    /* renamed from: g */
    private Iterator<Map.Entry<K, V>> f20413g;

    /* renamed from: h */
    private final /* synthetic */ C7021ow f20414h;

    private C7095qw(C7021ow c7021ow) {
        this.f20414h = c7021ow;
        this.f20412f = c7021ow.f20218g.size();
    }

    /* renamed from: b */
    private final Iterator<Map.Entry<K, V>> m15812b() {
        if (this.f20413g == null) {
            this.f20413g = this.f20414h.f20222k.entrySet().iterator();
        }
        return this.f20413g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f20412f;
        return (i2 > 0 && i2 <= this.f20414h.f20218g.size()) || m15812b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (m15812b().hasNext()) {
            return m15812b().next();
        }
        List list = this.f20414h.f20218g;
        int i2 = this.f20412f - 1;
        this.f20412f = i2;
        return (Map.Entry) list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C7095qw(C7021ow c7021ow, C7058pw c7058pw) {
        this(c7021ow);
    }
}
