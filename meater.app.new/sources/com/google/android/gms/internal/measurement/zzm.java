package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public interface zzm extends IInterface {
    void beginAdUnitExposure(String str, long j2) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void endAdUnitExposure(String str, long j2) throws RemoteException;

    void generateEventId(zzn zznVar) throws RemoteException;

    void getAppInstanceId(zzn zznVar) throws RemoteException;

    void getCachedAppInstanceId(zzn zznVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzn zznVar) throws RemoteException;

    void getCurrentScreenClass(zzn zznVar) throws RemoteException;

    void getCurrentScreenName(zzn zznVar) throws RemoteException;

    void getGmpAppId(zzn zznVar) throws RemoteException;

    void getMaxUserProperties(String str, zzn zznVar) throws RemoteException;

    void getTestFlag(zzn zznVar, int i2) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, zzn zznVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(IObjectWrapper iObjectWrapper, zzv zzvVar, long j2) throws RemoteException;

    void isDataCollectionEnabled(zzn zznVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzn zznVar, long j2) throws RemoteException;

    void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) throws RemoteException;

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzn zznVar, long j2) throws RemoteException;

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) throws RemoteException;

    void performAction(Bundle bundle, zzn zznVar, long j2) throws RemoteException;

    void registerOnMeasurementEventListener(zzs zzsVar) throws RemoteException;

    void resetAnalyticsData(long j2) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException;

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setEventInterceptor(zzs zzsVar) throws RemoteException;

    void setInstanceIdProvider(zzt zztVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j2) throws RemoteException;

    void setMinimumSessionDuration(long j2) throws RemoteException;

    void setSessionTimeoutDuration(long j2) throws RemoteException;

    void setUserId(String str, long j2) throws RemoteException;

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j2) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzs zzsVar) throws RemoteException;
}
