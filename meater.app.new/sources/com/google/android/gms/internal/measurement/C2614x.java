package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2614x implements Iterator<InterfaceC2574s> {

    /* renamed from: B, reason: collision with root package name */
    private int f34432B = 0;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2590u f34433C;

    C2614x(C2590u c2590u) {
        this.f34433C = c2590u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34432B < this.f34433C.f34389B.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC2574s next() {
        if (this.f34432B >= this.f34433C.f34389B.length()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f34432B;
        this.f34432B = i10 + 1;
        return new C2590u(String.valueOf(i10));
    }
}
