package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import m7.InterfaceC3977a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public interface P0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(U0 u02);

    void getAppInstanceId(U0 u02);

    void getCachedAppInstanceId(U0 u02);

    void getConditionalUserProperties(String str, String str2, U0 u02);

    void getCurrentScreenClass(U0 u02);

    void getCurrentScreenName(U0 u02);

    void getGmpAppId(U0 u02);

    void getMaxUserProperties(String str, U0 u02);

    void getSessionId(U0 u02);

    void getTestFlag(U0 u02, int i10);

    void getUserProperties(String str, String str2, boolean z10, U0 u02);

    void initForTests(Map map);

    void initialize(InterfaceC3977a interfaceC3977a, C2456d1 c2456d1, long j10);

    void isDataCollectionEnabled(U0 u02);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, U0 u02, long j10);

    void logHealthData(int i10, String str, InterfaceC3977a interfaceC3977a, InterfaceC3977a interfaceC3977a2, InterfaceC3977a interfaceC3977a3);

    void onActivityCreated(InterfaceC3977a interfaceC3977a, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(C2481g1 c2481g1, Bundle bundle, long j10);

    void onActivityDestroyed(InterfaceC3977a interfaceC3977a, long j10);

    void onActivityDestroyedByScionActivityInfo(C2481g1 c2481g1, long j10);

    void onActivityPaused(InterfaceC3977a interfaceC3977a, long j10);

    void onActivityPausedByScionActivityInfo(C2481g1 c2481g1, long j10);

    void onActivityResumed(InterfaceC3977a interfaceC3977a, long j10);

    void onActivityResumedByScionActivityInfo(C2481g1 c2481g1, long j10);

    void onActivitySaveInstanceState(InterfaceC3977a interfaceC3977a, U0 u02, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(C2481g1 c2481g1, U0 u02, long j10);

    void onActivityStarted(InterfaceC3977a interfaceC3977a, long j10);

    void onActivityStartedByScionActivityInfo(C2481g1 c2481g1, long j10);

    void onActivityStopped(InterfaceC3977a interfaceC3977a, long j10);

    void onActivityStoppedByScionActivityInfo(C2481g1 c2481g1, long j10);

    void performAction(Bundle bundle, U0 u02, long j10);

    void registerOnMeasurementEventListener(InterfaceC2429a1 interfaceC2429a1);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(V0 v02);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(InterfaceC3977a interfaceC3977a, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(C2481g1 c2481g1, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC2429a1 interfaceC2429a1);

    void setInstanceIdProvider(InterfaceC2438b1 interfaceC2438b1);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, InterfaceC3977a interfaceC3977a, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(InterfaceC2429a1 interfaceC2429a1);
}
