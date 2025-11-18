package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzl extends zzc implements zzm {
    public zzl() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzm asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzm ? (zzm) iInterfaceQueryLocalInterface : new zzo(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    /* renamed from: H */
    protected final boolean mo22099H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzn zzpVar;
        zzn zzpVar2 = null;
        zzn zzpVar3 = null;
        zzn zzpVar4 = null;
        zzs zzuVar = null;
        zzs zzuVar2 = null;
        zzs zzuVar3 = null;
        zzn zzpVar5 = null;
        zzn zzpVar6 = null;
        zzn zzpVar7 = null;
        zzn zzpVar8 = null;
        zzn zzpVar9 = null;
        zzn zzpVar10 = null;
        zzt zzwVar = null;
        zzn zzpVar11 = null;
        zzn zzpVar12 = null;
        zzn zzpVar13 = null;
        zzn zzpVar14 = null;
        switch (i2) {
            case 1:
                initialize(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzv) zzb.m21491a(parcel, zzv.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzb.m21491a(parcel, Bundle.CREATOR), zzb.m21495e(parcel), zzb.m21495e(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzb.m21491a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzn ? (zzn) iInterfaceQueryLocalInterface : new zzp(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, zzpVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzb.m21495e(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zM21495e = zzb.m21495e(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar2 = iInterfaceQueryLocalInterface2 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface2 : new zzp(strongBinder2);
                }
                getUserProperties(string3, string4, zM21495e, zzpVar2);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar14 = iInterfaceQueryLocalInterface3 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface3 : new zzp(strongBinder3);
                }
                getMaxUserProperties(string5, zzpVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) zzb.m21491a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzb.m21491a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar13 = iInterfaceQueryLocalInterface4 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface4 : new zzp(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, zzpVar13);
                break;
            case 11:
                setMeasurementEnabled(zzb.m21495e(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar12 = iInterfaceQueryLocalInterface5 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface5 : new zzp(strongBinder5);
                }
                getCurrentScreenName(zzpVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar11 = iInterfaceQueryLocalInterface6 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface6 : new zzp(strongBinder6);
                }
                getCurrentScreenClass(zzpVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzwVar = iInterfaceQueryLocalInterface7 instanceof zzt ? (zzt) iInterfaceQueryLocalInterface7 : new zzw(strongBinder7);
                }
                setInstanceIdProvider(zzwVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar10 = iInterfaceQueryLocalInterface8 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface8 : new zzp(strongBinder8);
                }
                getCachedAppInstanceId(zzpVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar9 = iInterfaceQueryLocalInterface9 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface9 : new zzp(strongBinder9);
                }
                getAppInstanceId(zzpVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar8 = iInterfaceQueryLocalInterface10 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface10 : new zzp(strongBinder10);
                }
                getGmpAppId(zzpVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar7 = iInterfaceQueryLocalInterface11 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface11 : new zzp(strongBinder11);
                }
                generateEventId(zzpVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (Bundle) zzb.m21491a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar6 = iInterfaceQueryLocalInterface12 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface12 : new zzp(strongBinder12);
                }
                onActivitySaveInstanceState(iObjectWrapperM14707P, zzpVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzb.m21491a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar5 = iInterfaceQueryLocalInterface13 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface13 : new zzp(strongBinder13);
                }
                performAction(bundle2, zzpVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzuVar3 = iInterfaceQueryLocalInterface14 instanceof zzs ? (zzs) iInterfaceQueryLocalInterface14 : new zzu(strongBinder14);
                }
                setEventInterceptor(zzuVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzuVar2 = iInterfaceQueryLocalInterface15 instanceof zzs ? (zzs) iInterfaceQueryLocalInterface15 : new zzu(strongBinder15);
                }
                registerOnMeasurementEventListener(zzuVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzuVar = iInterfaceQueryLocalInterface16 instanceof zzs ? (zzs) iInterfaceQueryLocalInterface16 : new zzu(strongBinder16);
                }
                unregisterOnMeasurementEventListener(zzuVar);
                break;
            case 37:
                initForTests(zzb.m21496f(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar4 = iInterfaceQueryLocalInterface17 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface17 : new zzp(strongBinder17);
                }
                getTestFlag(zzpVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(zzb.m21495e(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar3 = iInterfaceQueryLocalInterface18 instanceof zzn ? (zzn) iInterfaceQueryLocalInterface18 : new zzp(strongBinder18);
                }
                isDataCollectionEnabled(zzpVar3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
