package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2682o1 extends AbstractC2688q1 {
    C2682o1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2688q1
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f34651a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2688q1
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f34651a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2688q1
    public final void c(Object obj, long j10, boolean z10) {
        if (C2690r1.f34661h) {
            C2690r1.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            C2690r1.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2688q1
    public final void d(Object obj, long j10, byte b10) {
        if (C2690r1.f34661h) {
            C2690r1.d(obj, j10, b10);
        } else {
            C2690r1.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2688q1
    public final void e(Object obj, long j10, double d10) {
        this.f34651a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2688q1
    public final void f(Object obj, long j10, float f10) {
        this.f34651a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2688q1
    public final boolean g(Object obj, long j10) {
        return C2690r1.f34661h ? C2690r1.y(obj, j10) : C2690r1.z(obj, j10);
    }
}
