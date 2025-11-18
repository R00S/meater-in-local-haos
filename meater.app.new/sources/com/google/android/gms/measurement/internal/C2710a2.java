package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C2428a0;
import java.util.ArrayList;
import java.util.List;
import v7.C4901c;
import v7.InterfaceC4906h;
import v7.InterfaceC4907i;
import v7.InterfaceC4911m;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2710a2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC4906h {
    C2710a2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // v7.InterfaceC4906h
    public final List<P5> C(String str, String str2, String str3, boolean z10) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        C2428a0.e(parcelC, z10);
        Parcel parcelG = g(15, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(P5.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // v7.InterfaceC4906h
    public final void F0(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        k(6, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void G(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        k(4, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void I(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        k(18, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void J0(E5 e52, Bundle bundle, InterfaceC4907i interfaceC4907i) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        C2428a0.d(parcelC, bundle);
        C2428a0.c(parcelC, interfaceC4907i);
        k(31, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void O0(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        k(25, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final C4901c R(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        Parcel parcelG = g(21, parcelC);
        C4901c c4901c = (C4901c) C2428a0.a(parcelG, C4901c.CREATOR);
        parcelG.recycle();
        return c4901c;
    }

    @Override // v7.InterfaceC4906h
    public final void T(C2749g c2749g) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2749g);
        k(13, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void U0(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        k(20, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final List<P5> Y0(String str, String str2, boolean z10, E5 e52) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.e(parcelC, z10);
        C2428a0.d(parcelC, e52);
        Parcel parcelG = g(14, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(P5.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // v7.InterfaceC4906h
    public final void a1(E5 e52, C2735e c2735e) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        C2428a0.d(parcelC, c2735e);
        k(30, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void e1(P5 p52, E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, p52);
        C2428a0.d(parcelC, e52);
        k(2, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void g0(long j10, String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeLong(j10);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        k(10, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void g1(C2749g c2749g, E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2749g);
        C2428a0.d(parcelC, e52);
        k(12, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final List<C2797m5> i0(E5 e52, Bundle bundle) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        C2428a0.d(parcelC, bundle);
        Parcel parcelG = g(24, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(C2797m5.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // v7.InterfaceC4906h
    public final String j0(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        Parcel parcelG = g(11, parcelC);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // v7.InterfaceC4906h
    public final List<C2749g> k0(String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        Parcel parcelG = g(17, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(C2749g.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // v7.InterfaceC4906h
    public final void l1(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        k(26, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void n(Bundle bundle, E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, bundle);
        C2428a0.d(parcelC, e52);
        k(19, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void p0(J j10, String str, String str2) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, j10);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        k(5, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void r(E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        k(27, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final byte[] w0(J j10, String str) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, j10);
        parcelC.writeString(str);
        Parcel parcelG = g(9, parcelC);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // v7.InterfaceC4906h
    public final void x(E5 e52, v7.k0 k0Var, InterfaceC4911m interfaceC4911m) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, e52);
        C2428a0.d(parcelC, k0Var);
        C2428a0.c(parcelC, interfaceC4911m);
        k(29, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final void x0(J j10, E5 e52) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, j10);
        C2428a0.d(parcelC, e52);
        k(1, parcelC);
    }

    @Override // v7.InterfaceC4906h
    public final List<C2749g> y(String str, String str2, E5 e52) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.d(parcelC, e52);
        Parcel parcelG = g(16, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(C2749g.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }
}
