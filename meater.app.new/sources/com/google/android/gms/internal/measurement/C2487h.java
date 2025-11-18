package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2487h implements InterfaceC2574s {

    /* renamed from: B, reason: collision with root package name */
    private final boolean f34133B;

    public C2487h(Boolean bool) {
        if (bool == null) {
            this.f34133B = false;
        } else {
            this.f34133B = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        return new C2487h(Boolean.valueOf(this.f34133B));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2487h) && this.f34133B == ((C2487h) obj).f34133B;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Boolean f() {
        return Boolean.valueOf(this.f34133B);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Double h() {
        return Double.valueOf(this.f34133B ? 1.0d : 0.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f34133B).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() {
        return Boolean.toString(this.f34133B);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f34133B);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        if ("toString".equals(str)) {
            return new C2590u(Boolean.toString(this.f34133B));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f34133B), str));
    }
}
