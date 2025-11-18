package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* loaded from: classes2.dex */
final class C7559o1 extends AbstractC7571q1 {

    /* renamed from: f */
    private int f27860f = 0;

    /* renamed from: g */
    private final int f27861g;

    /* renamed from: h */
    private final /* synthetic */ zzdu f27862h;

    C7559o1(zzdu zzduVar) {
        this.f27862h = zzduVar;
        this.f27861g = zzduVar.mo21396f();
    }

    @Override // com.google.android.gms.internal.measurement.zzed
    /* renamed from: a */
    public final byte mo21264a() {
        int i2 = this.f27860f;
        if (i2 >= this.f27861g) {
            throw new NoSuchElementException();
        }
        this.f27860f = i2 + 1;
        return this.f27862h.mo21397t(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27860f < this.f27861g;
    }
}
