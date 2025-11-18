package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2630z implements InterfaceC2574s {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        return InterfaceC2574s.f34292p;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2630z;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Boolean f() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
