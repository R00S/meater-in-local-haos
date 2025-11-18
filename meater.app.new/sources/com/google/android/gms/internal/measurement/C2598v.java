package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2598v implements InterfaceC2574s {

    /* renamed from: B, reason: collision with root package name */
    private final String f34401B;

    /* renamed from: C, reason: collision with root package name */
    private final ArrayList<InterfaceC2574s> f34402C;

    public C2598v(String str, List<InterfaceC2574s> list) {
        this.f34401B = str;
        ArrayList<InterfaceC2574s> arrayList = new ArrayList<>();
        this.f34402C = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f34401B;
    }

    public final ArrayList<InterfaceC2574s> b() {
        return this.f34402C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2598v)) {
            return false;
        }
        C2598v c2598v = (C2598v) obj;
        String str = this.f34401B;
        if (str == null ? c2598v.f34401B != null : !str.equals(c2598v.f34401B)) {
            return false;
        }
        ArrayList<InterfaceC2574s> arrayList = this.f34402C;
        ArrayList<InterfaceC2574s> arrayList2 = c2598v.f34402C;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Boolean f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.f34401B;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<InterfaceC2574s> arrayList = this.f34402C;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        return this;
    }
}
