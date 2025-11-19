package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import m7.InterfaceC3977a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public final class R0 extends Y implements P0 {
    R0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeLong(j10);
        k(23, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.d(parcelC, bundle);
        k(9, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void clearMeasurementEnabled(long j10) {
        Parcel parcelC = c();
        parcelC.writeLong(j10);
        k(43, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeLong(j10);
        k(24, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void generateEventId(U0 u02) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, u02);
        k(22, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCachedAppInstanceId(U0 u02) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, u02);
        k(19, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getConditionalUserProperties(String str, String str2, U0 u02) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.c(parcelC, u02);
        k(10, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenClass(U0 u02) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, u02);
        k(17, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenName(U0 u02) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, u02);
        k(16, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getGmpAppId(U0 u02) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, u02);
        k(21, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getMaxUserProperties(String str, U0 u02) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        C2428a0.c(parcelC, u02);
        k(6, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getUserProperties(String str, String str2, boolean z10, U0 u02) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.e(parcelC, z10);
        C2428a0.c(parcelC, u02);
        k(5, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void initialize(InterfaceC3977a interfaceC3977a, C2456d1 c2456d1, long j10) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, interfaceC3977a);
        C2428a0.d(parcelC, c2456d1);
        parcelC.writeLong(j10);
        k(1, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.d(parcelC, bundle);
        C2428a0.e(parcelC, z10);
        C2428a0.e(parcelC, z11);
        parcelC.writeLong(j10);
        k(2, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logHealthData(int i10, String str, InterfaceC3977a interfaceC3977a, InterfaceC3977a interfaceC3977a2, InterfaceC3977a interfaceC3977a3) {
        Parcel parcelC = c();
        parcelC.writeInt(i10);
        parcelC.writeString(str);
        C2428a0.c(parcelC, interfaceC3977a);
        C2428a0.c(parcelC, interfaceC3977a2);
        C2428a0.c(parcelC, interfaceC3977a3);
        k(33, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityCreatedByScionActivityInfo(C2481g1 c2481g1, Bundle bundle, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        C2428a0.d(parcelC, bundle);
        parcelC.writeLong(j10);
        k(53, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityDestroyedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        parcelC.writeLong(j10);
        k(54, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityPausedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        parcelC.writeLong(j10);
        k(55, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityResumedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        parcelC.writeLong(j10);
        k(56, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivitySaveInstanceStateByScionActivityInfo(C2481g1 c2481g1, U0 u02, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        C2428a0.c(parcelC, u02);
        parcelC.writeLong(j10);
        k(57, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStartedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        parcelC.writeLong(j10);
        k(51, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStoppedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        parcelC.writeLong(j10);
        k(52, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void registerOnMeasurementEventListener(InterfaceC2429a1 interfaceC2429a1) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, interfaceC2429a1);
        k(35, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void retrieveAndUploadBatches(V0 v02) {
        Parcel parcelC = c();
        C2428a0.c(parcelC, v02);
        k(58, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, bundle);
        parcelC.writeLong(j10);
        k(8, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setCurrentScreenByScionActivityInfo(C2481g1 c2481g1, String str, String str2, long j10) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2481g1);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeLong(j10);
        k(50, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelC = c();
        C2428a0.e(parcelC, z10);
        k(39, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel parcelC = c();
        C2428a0.e(parcelC, z10);
        parcelC.writeLong(j10);
        k(11, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setUserProperty(String str, String str2, InterfaceC3977a interfaceC3977a, boolean z10, long j10) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.c(parcelC, interfaceC3977a);
        C2428a0.e(parcelC, z10);
        parcelC.writeLong(j10);
        k(4, parcelC);
    }
}
