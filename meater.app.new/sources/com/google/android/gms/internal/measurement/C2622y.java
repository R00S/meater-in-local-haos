package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2622y extends A {
    public C2622y() {
        this.f33564a.add(Z.BITWISE_AND);
        this.f33564a.add(Z.BITWISE_LEFT_SHIFT);
        this.f33564a.add(Z.BITWISE_NOT);
        this.f33564a.add(Z.BITWISE_OR);
        this.f33564a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f33564a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f33564a.add(Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2574s b(String str, Z2 z22, List<InterfaceC2574s> list) {
        switch (B.f33661a[Y1.c(str).ordinal()]) {
            case 1:
                Y1.f(Z.BITWISE_AND, 2, list);
                return new C2511k(Double.valueOf(Y1.i(z22.b(list.get(0)).h().doubleValue()) & Y1.i(z22.b(list.get(1)).h().doubleValue())));
            case 2:
                Y1.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C2511k(Double.valueOf(Y1.i(z22.b(list.get(0)).h().doubleValue()) << ((int) (Y1.m(z22.b(list.get(1)).h().doubleValue()) & 31))));
            case 3:
                Y1.f(Z.BITWISE_NOT, 1, list);
                return new C2511k(Double.valueOf(~Y1.i(z22.b(list.get(0)).h().doubleValue())));
            case 4:
                Y1.f(Z.BITWISE_OR, 2, list);
                return new C2511k(Double.valueOf(Y1.i(z22.b(list.get(0)).h().doubleValue()) | Y1.i(z22.b(list.get(1)).h().doubleValue())));
            case 5:
                Y1.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C2511k(Double.valueOf(Y1.i(z22.b(list.get(0)).h().doubleValue()) >> ((int) (Y1.m(z22.b(list.get(1)).h().doubleValue()) & 31))));
            case 6:
                Y1.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C2511k(Double.valueOf(Y1.m(z22.b(list.get(0)).h().doubleValue()) >>> ((int) (Y1.m(z22.b(list.get(1)).h().doubleValue()) & 31))));
            case 7:
                Y1.f(Z.BITWISE_XOR, 2, list);
                return new C2511k(Double.valueOf(Y1.i(z22.b(list.get(0)).h().doubleValue()) ^ Y1.i(z22.b(list.get(1)).h().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
