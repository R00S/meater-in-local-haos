package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzo extends zza implements zzm {
    zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void beginAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeLong(j2);
        m21490k0(23, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeString(str2);
        zzb.m21493c(parcelM21488H, bundle);
        m21490k0(9, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void endAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeLong(j2);
        m21490k0(24, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void generateEventId(zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(22, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCachedAppInstanceId(zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(19, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getConditionalUserProperties(String str, String str2, zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeString(str2);
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(10, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCurrentScreenClass(zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(17, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCurrentScreenName(zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(16, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getGmpAppId(zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(21, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getMaxUserProperties(String str, zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(6, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getUserProperties(String str, String str2, boolean z, zzn zznVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeString(str2);
        zzb.m21494d(parcelM21488H, z);
        zzb.m21492b(parcelM21488H, zznVar);
        m21490k0(5, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void initialize(IObjectWrapper iObjectWrapper, zzv zzvVar, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        zzb.m21493c(parcelM21488H, zzvVar);
        parcelM21488H.writeLong(j2);
        m21490k0(1, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeString(str2);
        zzb.m21493c(parcelM21488H, bundle);
        zzb.m21494d(parcelM21488H, z);
        zzb.m21494d(parcelM21488H, z2);
        parcelM21488H.writeLong(j2);
        m21490k0(2, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeInt(i2);
        parcelM21488H.writeString(str);
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        zzb.m21492b(parcelM21488H, iObjectWrapper2);
        zzb.m21492b(parcelM21488H, iObjectWrapper3);
        m21490k0(33, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        zzb.m21493c(parcelM21488H, bundle);
        parcelM21488H.writeLong(j2);
        m21490k0(27, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        parcelM21488H.writeLong(j2);
        m21490k0(28, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        parcelM21488H.writeLong(j2);
        m21490k0(29, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        parcelM21488H.writeLong(j2);
        m21490k0(30, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzn zznVar, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        zzb.m21492b(parcelM21488H, zznVar);
        parcelM21488H.writeLong(j2);
        m21490k0(31, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        parcelM21488H.writeLong(j2);
        m21490k0(25, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        parcelM21488H.writeLong(j2);
        m21490k0(26, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void performAction(Bundle bundle, zzn zznVar, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21493c(parcelM21488H, bundle);
        zzb.m21492b(parcelM21488H, zznVar);
        parcelM21488H.writeLong(j2);
        m21490k0(32, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void registerOnMeasurementEventListener(zzs zzsVar) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, zzsVar);
        m21490k0(35, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21493c(parcelM21488H, bundle);
        parcelM21488H.writeLong(j2);
        m21490k0(8, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        parcelM21488H.writeString(str);
        parcelM21488H.writeString(str2);
        parcelM21488H.writeLong(j2);
        m21490k0(15, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21494d(parcelM21488H, z);
        m21490k0(39, parcelM21488H);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeString(str2);
        zzb.m21492b(parcelM21488H, iObjectWrapper);
        zzb.m21494d(parcelM21488H, z);
        parcelM21488H.writeLong(j2);
        m21490k0(4, parcelM21488H);
    }
}
