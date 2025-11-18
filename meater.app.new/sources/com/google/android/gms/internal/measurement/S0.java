package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.apptionlabs.meater_app.data.Config;
import java.util.HashMap;
import m7.InterfaceC3977a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class S0 extends BinderC2437b0 implements P0 {
    public S0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static P0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof P0 ? (P0) iInterfaceQueryLocalInterface : new R0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2437b0
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        U0 w02;
        U0 w03 = null;
        V0 x02 = null;
        U0 w04 = null;
        U0 w05 = null;
        U0 w06 = null;
        U0 w07 = null;
        InterfaceC2429a1 c2447c1 = null;
        InterfaceC2429a1 c2447c12 = null;
        InterfaceC2429a1 c2447c13 = null;
        U0 w08 = null;
        U0 w09 = null;
        U0 w010 = null;
        U0 w011 = null;
        U0 w012 = null;
        U0 w013 = null;
        InterfaceC2438b1 c2473f1 = null;
        U0 w014 = null;
        U0 w015 = null;
        U0 w016 = null;
        U0 w017 = null;
        switch (i10) {
            case 1:
                InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                C2456d1 c2456d1 = (C2456d1) C2428a0.a(parcel, C2456d1.CREATOR);
                long j10 = parcel.readLong();
                C2428a0.f(parcel);
                initialize(interfaceC3977aG, c2456d1, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                boolean zH = C2428a0.h(parcel);
                boolean zH2 = C2428a0.h(parcel);
                long j11 = parcel.readLong();
                C2428a0.f(parcel);
                logEvent(string, string2, bundle, zH, zH2, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    w02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w02 = iInterfaceQueryLocalInterface instanceof U0 ? (U0) iInterfaceQueryLocalInterface : new W0(strongBinder);
                }
                long j12 = parcel.readLong();
                C2428a0.f(parcel);
                logEventAndBundle(string3, string4, bundle2, w02, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC3977a interfaceC3977aG2 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                boolean zH3 = C2428a0.h(parcel);
                long j13 = parcel.readLong();
                C2428a0.f(parcel);
                setUserProperty(string5, string6, interfaceC3977aG2, zH3, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zH4 = C2428a0.h(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w03 = iInterfaceQueryLocalInterface2 instanceof U0 ? (U0) iInterfaceQueryLocalInterface2 : new W0(strongBinder2);
                }
                C2428a0.f(parcel);
                getUserProperties(string7, string8, zH4, w03);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w017 = iInterfaceQueryLocalInterface3 instanceof U0 ? (U0) iInterfaceQueryLocalInterface3 : new W0(strongBinder3);
                }
                C2428a0.f(parcel);
                getMaxUserProperties(string9, w017);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                C2428a0.f(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                C2428a0.f(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                C2428a0.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w016 = iInterfaceQueryLocalInterface4 instanceof U0 ? (U0) iInterfaceQueryLocalInterface4 : new W0(strongBinder4);
                }
                C2428a0.f(parcel);
                getConditionalUserProperties(string13, string14, w016);
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                boolean zH5 = C2428a0.h(parcel);
                long j16 = parcel.readLong();
                C2428a0.f(parcel);
                setMeasurementEnabled(zH5, j16);
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                long j17 = parcel.readLong();
                C2428a0.f(parcel);
                resetAnalyticsData(j17);
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                long j18 = parcel.readLong();
                C2428a0.f(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                C2428a0.f(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                InterfaceC3977a interfaceC3977aG3 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                C2428a0.f(parcel);
                setCurrentScreen(interfaceC3977aG3, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w015 = iInterfaceQueryLocalInterface5 instanceof U0 ? (U0) iInterfaceQueryLocalInterface5 : new W0(strongBinder5);
                }
                C2428a0.f(parcel);
                getCurrentScreenName(w015);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w014 = iInterfaceQueryLocalInterface6 instanceof U0 ? (U0) iInterfaceQueryLocalInterface6 : new W0(strongBinder6);
                }
                C2428a0.f(parcel);
                getCurrentScreenClass(w014);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c2473f1 = iInterfaceQueryLocalInterface7 instanceof InterfaceC2438b1 ? (InterfaceC2438b1) iInterfaceQueryLocalInterface7 : new C2473f1(strongBinder7);
                }
                C2428a0.f(parcel);
                setInstanceIdProvider(c2473f1);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w013 = iInterfaceQueryLocalInterface8 instanceof U0 ? (U0) iInterfaceQueryLocalInterface8 : new W0(strongBinder8);
                }
                C2428a0.f(parcel);
                getCachedAppInstanceId(w013);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w012 = iInterfaceQueryLocalInterface9 instanceof U0 ? (U0) iInterfaceQueryLocalInterface9 : new W0(strongBinder9);
                }
                C2428a0.f(parcel);
                getAppInstanceId(w012);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w011 = iInterfaceQueryLocalInterface10 instanceof U0 ? (U0) iInterfaceQueryLocalInterface10 : new W0(strongBinder10);
                }
                C2428a0.f(parcel);
                getGmpAppId(w011);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w010 = iInterfaceQueryLocalInterface11 instanceof U0 ? (U0) iInterfaceQueryLocalInterface11 : new W0(strongBinder11);
                }
                C2428a0.f(parcel);
                generateEventId(w010);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                C2428a0.f(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                C2428a0.f(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                InterfaceC3977a interfaceC3977aG4 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityStarted(interfaceC3977aG4, j23);
                break;
            case 26:
                InterfaceC3977a interfaceC3977aG5 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityStopped(interfaceC3977aG5, j24);
                break;
            case 27:
                InterfaceC3977a interfaceC3977aG6 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityCreated(interfaceC3977aG6, bundle5, j25);
                break;
            case 28:
                InterfaceC3977a interfaceC3977aG7 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityDestroyed(interfaceC3977aG7, j26);
                break;
            case 29:
                InterfaceC3977a interfaceC3977aG8 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityPaused(interfaceC3977aG8, j27);
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                InterfaceC3977a interfaceC3977aG9 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityResumed(interfaceC3977aG9, j28);
                break;
            case 31:
                InterfaceC3977a interfaceC3977aG10 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w09 = iInterfaceQueryLocalInterface12 instanceof U0 ? (U0) iInterfaceQueryLocalInterface12 : new W0(strongBinder12);
                }
                long j29 = parcel.readLong();
                C2428a0.f(parcel);
                onActivitySaveInstanceState(interfaceC3977aG10, w09, j29);
                break;
            case 32:
                Bundle bundle6 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w08 = iInterfaceQueryLocalInterface13 instanceof U0 ? (U0) iInterfaceQueryLocalInterface13 : new W0(strongBinder13);
                }
                long j30 = parcel.readLong();
                C2428a0.f(parcel);
                performAction(bundle6, w08, j30);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC3977a interfaceC3977aG11 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                InterfaceC3977a interfaceC3977aG12 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                InterfaceC3977a interfaceC3977aG13 = InterfaceC3977a.AbstractBinderC0607a.g(parcel.readStrongBinder());
                C2428a0.f(parcel);
                logHealthData(i12, string19, interfaceC3977aG11, interfaceC3977aG12, interfaceC3977aG13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c2447c13 = iInterfaceQueryLocalInterface14 instanceof InterfaceC2429a1 ? (InterfaceC2429a1) iInterfaceQueryLocalInterface14 : new C2447c1(strongBinder14);
                }
                C2428a0.f(parcel);
                setEventInterceptor(c2447c13);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c2447c12 = iInterfaceQueryLocalInterface15 instanceof InterfaceC2429a1 ? (InterfaceC2429a1) iInterfaceQueryLocalInterface15 : new C2447c1(strongBinder15);
                }
                C2428a0.f(parcel);
                registerOnMeasurementEventListener(c2447c12);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c2447c1 = iInterfaceQueryLocalInterface16 instanceof InterfaceC2429a1 ? (InterfaceC2429a1) iInterfaceQueryLocalInterface16 : new C2447c1(strongBinder16);
                }
                C2428a0.f(parcel);
                unregisterOnMeasurementEventListener(c2447c1);
                break;
            case 37:
                HashMap mapB = C2428a0.b(parcel);
                C2428a0.f(parcel);
                initForTests(mapB);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w07 = iInterfaceQueryLocalInterface17 instanceof U0 ? (U0) iInterfaceQueryLocalInterface17 : new W0(strongBinder17);
                }
                int i13 = parcel.readInt();
                C2428a0.f(parcel);
                getTestFlag(w07, i13);
                break;
            case 39:
                boolean zH6 = C2428a0.h(parcel);
                C2428a0.f(parcel);
                setDataCollectionEnabled(zH6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w06 = iInterfaceQueryLocalInterface18 instanceof U0 ? (U0) iInterfaceQueryLocalInterface18 : new W0(strongBinder18);
                }
                C2428a0.f(parcel);
                isDataCollectionEnabled(w06);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                C2428a0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j31 = parcel.readLong();
                C2428a0.f(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                C2428a0.f(parcel);
                setConsent(bundle8, j32);
                break;
            case 45:
                Bundle bundle9 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                C2428a0.f(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w05 = iInterfaceQueryLocalInterface19 instanceof U0 ? (U0) iInterfaceQueryLocalInterface19 : new W0(strongBinder19);
                }
                C2428a0.f(parcel);
                getSessionId(w05);
                break;
            case 48:
                Intent intent = (Intent) C2428a0.a(parcel, Intent.CREATOR);
                C2428a0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                C2481g1 c2481g1 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j34 = parcel.readLong();
                C2428a0.f(parcel);
                setCurrentScreenByScionActivityInfo(c2481g1, string20, string21, j34);
                break;
            case 51:
                C2481g1 c2481g12 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                long j35 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityStartedByScionActivityInfo(c2481g12, j35);
                break;
            case 52:
                C2481g1 c2481g13 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                long j36 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityStoppedByScionActivityInfo(c2481g13, j36);
                break;
            case 53:
                C2481g1 c2481g14 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                Bundle bundle10 = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
                long j37 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityCreatedByScionActivityInfo(c2481g14, bundle10, j37);
                break;
            case 54:
                C2481g1 c2481g15 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                long j38 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityDestroyedByScionActivityInfo(c2481g15, j38);
                break;
            case 55:
                C2481g1 c2481g16 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                long j39 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityPausedByScionActivityInfo(c2481g16, j39);
                break;
            case 56:
                C2481g1 c2481g17 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                long j40 = parcel.readLong();
                C2428a0.f(parcel);
                onActivityResumedByScionActivityInfo(c2481g17, j40);
                break;
            case 57:
                C2481g1 c2481g18 = (C2481g1) C2428a0.a(parcel, C2481g1.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w04 = iInterfaceQueryLocalInterface20 instanceof U0 ? (U0) iInterfaceQueryLocalInterface20 : new W0(strongBinder20);
                }
                long j41 = parcel.readLong();
                C2428a0.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(c2481g18, w04, j41);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    x02 = iInterfaceQueryLocalInterface21 instanceof V0 ? (V0) iInterfaceQueryLocalInterface21 : new X0(strongBinder21);
                }
                C2428a0.f(parcel);
                retrieveAndUploadBatches(x02);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
