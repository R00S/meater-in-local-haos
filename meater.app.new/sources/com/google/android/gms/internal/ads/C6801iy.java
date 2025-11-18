package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.google.android.gms.internal.ads.iy */
/* loaded from: classes2.dex */
final class C6801iy<E> implements Iterator<E> {

    /* renamed from: f */
    private int f19404f = 0;

    /* renamed from: g */
    private final /* synthetic */ zzdta f19405g;

    C6801iy(zzdta zzdtaVar) {
        this.f19405g = zzdtaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19404f < this.f19405g.f25968g.size() || this.f19405g.f25969h.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.f19404f >= this.f19405g.f25968g.size()) {
            zzdta zzdtaVar = this.f19405g;
            zzdtaVar.f25968g.add(zzdtaVar.f25969h.next());
        }
        List<E> list = this.f19405g.f25968g;
        int i2 = this.f19404f;
        this.f19404f = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
