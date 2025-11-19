package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2519l implements InterfaceC2574s {

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC2574s f34189B;

    /* renamed from: C, reason: collision with root package name */
    private final String f34190C;

    public C2519l() {
        this.f34189B = InterfaceC2574s.f34292p;
        this.f34190C = "return";
    }

    public final InterfaceC2574s a() {
        return this.f34189B;
    }

    public final String b() {
        return this.f34190C;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        return new C2519l(this.f34190C, this.f34189B.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2519l)) {
            return false;
        }
        C2519l c2519l = (C2519l) obj;
        return this.f34190C.equals(c2519l.f34190C) && this.f34189B.equals(c2519l.f34189B);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Boolean f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.f34190C.hashCode() * 31) + this.f34189B.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C2519l(String str) {
        this.f34189B = InterfaceC2574s.f34292p;
        this.f34190C = str;
    }

    public C2519l(String str, InterfaceC2574s interfaceC2574s) {
        this.f34189B = interfaceC2574s;
        this.f34190C = str;
    }
}
