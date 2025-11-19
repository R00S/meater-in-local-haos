package com.google.android.gms.internal.wearable;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class I extends J {

    /* renamed from: B, reason: collision with root package name */
    private int f34493B = 0;

    /* renamed from: C, reason: collision with root package name */
    private final int f34494C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ P f34495D;

    I(P p10) {
        this.f34495D = p10;
        this.f34494C = p10.h();
    }

    @Override // com.google.android.gms.internal.wearable.L
    public final byte a() {
        int i10 = this.f34493B;
        if (i10 >= this.f34494C) {
            throw new NoSuchElementException();
        }
        this.f34493B = i10 + 1;
        return this.f34495D.f(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34493B < this.f34494C;
    }
}
