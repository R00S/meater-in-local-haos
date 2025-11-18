package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2495i implements Iterator<InterfaceC2574s> {

    /* renamed from: B, reason: collision with root package name */
    private int f34147B = 0;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2479g f34148C;

    C2495i(C2479g c2479g) {
        this.f34148C = c2479g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34147B < this.f34148C.B();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC2574s next() {
        if (this.f34147B < this.f34148C.B()) {
            C2479g c2479g = this.f34148C;
            int i10 = this.f34147B;
            this.f34147B = i10 + 1;
            return c2479g.y(i10);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f34147B);
    }
}
