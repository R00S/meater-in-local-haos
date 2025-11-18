package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.fx */
/* loaded from: classes2.dex */
final class C6689fx implements Iterator<String> {

    /* renamed from: f */
    private Iterator<String> f18918f;

    /* renamed from: g */
    private final /* synthetic */ zzdqw f18919g;

    C6689fx(zzdqw zzdqwVar) {
        this.f18919g = zzdqwVar;
        this.f18918f = zzdqwVar.f25808f.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18918f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f18918f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
