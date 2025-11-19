package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class X3 extends Z3 {

    /* renamed from: B, reason: collision with root package name */
    private int f33938B = 0;

    /* renamed from: C, reason: collision with root package name */
    private final int f33939C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ Y3 f33940D;

    X3(Y3 y32) {
        this.f33940D = y32;
        this.f33939C = y32.z();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2476f4
    public final byte a() {
        int i10 = this.f33938B;
        if (i10 >= this.f33939C) {
            throw new NoSuchElementException();
        }
        this.f33938B = i10 + 1;
        return this.f33940D.y(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33938B < this.f33939C;
    }
}
