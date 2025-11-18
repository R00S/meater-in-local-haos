package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2698v0 implements Iterator {

    /* renamed from: B, reason: collision with root package name */
    private final Iterator f34686B;

    public C2698v0(Iterator it) {
        this.f34686B = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34686B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f34686B.next();
        return entry.getValue() instanceof C2702x0 ? new C2694t0(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34686B.remove();
    }
}
