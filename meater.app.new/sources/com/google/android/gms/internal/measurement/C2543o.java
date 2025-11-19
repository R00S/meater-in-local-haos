package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2543o implements Iterator<InterfaceC2574s> {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ Iterator f34222B;

    C2543o(Iterator it) {
        this.f34222B = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34222B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC2574s next() {
        return new C2590u((String) this.f34222B.next());
    }
}
