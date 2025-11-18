package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzamt extends zzfn implements zzams {
    public zzamt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzamv zzamxVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzyd zzydVar = (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR);
                zzxz zzxzVar = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamxVar = iInterfaceQueryLocalInterface instanceof zzamv ? (zzamv) iInterfaceQueryLocalInterface : new zzamx(strongBinder);
                }
                mo16716y2(iObjectWrapperM14707P, zzydVar, zzxzVar, string, zzamxVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperMo16714x1 = mo16714x1();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16714x1);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperM14707P2 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar2 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamxVar = iInterfaceQueryLocalInterface2 instanceof zzamv ? (zzamv) iInterfaceQueryLocalInterface2 : new zzamx(strongBinder2);
                }
                mo16703Y2(iObjectWrapperM14707P2, zzxzVar2, string2, zzamxVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperM14707P3 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzyd zzydVar2 = (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR);
                zzxz zzxzVar3 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamxVar = iInterfaceQueryLocalInterface3 instanceof zzamv ? (zzamv) iInterfaceQueryLocalInterface3 : new zzamx(strongBinder3);
                }
                mo16712s4(iObjectWrapperM14707P3, zzydVar2, zzxzVar3, string3, string4, zzamxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperM14707P4 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar4 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamxVar = iInterfaceQueryLocalInterface4 instanceof zzamv ? (zzamv) iInterfaceQueryLocalInterface4 : new zzamx(strongBinder4);
                }
                mo16706c6(iObjectWrapperM14707P4, zzxzVar4, string5, string6, zzamxVar);
                parcel2.writeNoException();
                return true;
            case 8:
                pause();
                parcel2.writeNoException();
                return true;
            case 9:
                resume();
                parcel2.writeNoException();
                return true;
            case 10:
                mo16709h4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR), parcel.readString(), zzatl.m16941h7(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                mo16710o6((zzxz) zzfo.m19948b(parcel, zzxz.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zIsInitialized = isInitialized();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zIsInitialized);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperM14707P5 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar5 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamxVar = iInterfaceQueryLocalInterface5 instanceof zzamv ? (zzamv) iInterfaceQueryLocalInterface5 : new zzamx(strongBinder5);
                }
                mo16700M3(iObjectWrapperM14707P5, zzxzVar5, string7, string8, zzamxVar, (zzady) zzfo.m19948b(parcel, zzady.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                zzana zzanaVarMo16705b7 = mo16705b7();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzanaVarMo16705b7);
                return true;
            case 16:
                zzand zzandVarMo16707e6 = mo16707e6();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzandVarMo16707e6);
                return true;
            case 17:
                Bundle bundleZzsh = zzsh();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, bundleZzsh);
                return true;
            case 18:
                Bundle interstitialAdapterInfo = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, interstitialAdapterInfo);
                return true;
            case 19:
                Bundle bundleMo16711r4 = mo16711r4();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, bundleMo16711r4);
                return true;
            case 20:
                mo16702Q2((zzxz) zzfo.m19948b(parcel, zzxz.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                mo16713w0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zMo16715x3 = mo16715x3();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16715x3);
                return true;
            case 23:
                mo16699H4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzatl.m16941h7(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzafe zzafeVarMo16697F2 = mo16697F2();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzafeVarMo16697F2);
                return true;
            case 25:
                setImmersiveMode(zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 27:
                zzang zzangVarMo16701P1 = mo16701P1();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzangVarMo16701P1);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperM14707P6 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar6 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String string9 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamxVar = iInterfaceQueryLocalInterface6 instanceof zzamv ? (zzamv) iInterfaceQueryLocalInterface6 : new zzamx(strongBinder6);
                }
                mo16708f2(iObjectWrapperM14707P6, zzxzVar6, string9, zzamxVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                mo16704a4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                mo16698G4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzair.m16590h7(parcel.readStrongBinder()), parcel.createTypedArrayList(zzaiw.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
