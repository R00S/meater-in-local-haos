package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2471f implements Iterator<InterfaceC2574s> {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ Iterator f34110B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ Iterator f34111C;

    C2471f(C2479g c2479g, Iterator it, Iterator it2) {
        this.f34110B = it;
        this.f34111C = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f34110B.hasNext()) {
            return true;
        }
        return this.f34111C.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC2574s next() {
        if (this.f34110B.hasNext()) {
            return new C2590u(((Integer) this.f34110B.next()).toString());
        }
        if (this.f34111C.hasNext()) {
            return new C2590u((String) this.f34111C.next());
        }
        throw new NoSuchElementException();
    }
}
