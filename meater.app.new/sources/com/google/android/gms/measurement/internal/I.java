package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class I implements Iterator<String> {

    /* renamed from: B, reason: collision with root package name */
    private Iterator<String> f34873B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ F f34874C;

    I(F f10) {
        this.f34874C = f10;
        this.f34873B = f10.f34839B.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34873B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f34873B.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
