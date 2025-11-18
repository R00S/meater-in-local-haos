package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaow extends zzfn implements zzaov {
    public zzaow() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: h7 */
    public static zzaov m16821h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzaov ? (zzaov) iInterfaceQueryLocalInterface : new zzaox(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaoy zzapaVar;
        zzaoj zzaolVar = null;
        zzaop zzaorVar = null;
        zzaos zzaouVar = null;
        zzaom zzaooVar = null;
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzfo.m19948b(parcel, creator);
            Bundle bundle2 = (Bundle) zzfo.m19948b(parcel, creator);
            zzyd zzydVar = (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzapaVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzapaVar = iInterfaceQueryLocalInterface instanceof zzaoy ? (zzaoy) iInterfaceQueryLocalInterface : new zzapa(strongBinder);
            }
            mo16818u3(iObjectWrapperM14707P, string, bundle, bundle2, zzydVar, zzapaVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            zzapj zzapjVarMo16812a6 = mo16812a6();
            parcel2.writeNoException();
            zzfo.m19953g(parcel2, zzapjVarMo16812a6);
        } else if (i2 == 3) {
            zzapj zzapjVarMo16815i5 = mo16815i5();
            parcel2.writeNoException();
            zzfo.m19953g(parcel2, zzapjVarMo16815i5);
        } else if (i2 == 5) {
            zzaar videoController = getVideoController();
            parcel2.writeNoException();
            zzfo.m19949c(parcel2, videoController);
        } else if (i2 == 10) {
            mo16817o3(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    zzxz zzxzVar = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper iObjectWrapperM14707P2 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzaolVar = iInterfaceQueryLocalInterface2 instanceof zzaoj ? (zzaoj) iInterfaceQueryLocalInterface2 : new zzaol(strongBinder2);
                    }
                    mo16810K4(string2, string3, zzxzVar, iObjectWrapperM14707P2, zzaolVar, zzamw.m16726h7(parcel.readStrongBinder()), (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    zzxz zzxzVar2 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper iObjectWrapperM14707P3 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzaooVar = iInterfaceQueryLocalInterface3 instanceof zzaom ? (zzaom) iInterfaceQueryLocalInterface3 : new zzaoo(strongBinder3);
                    }
                    mo16820y6(string4, string5, zzxzVar2, iObjectWrapperM14707P3, zzaooVar, zzamw.m16726h7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zMo16819x2 = mo16819x2(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfo.m19947a(parcel2, zMo16819x2);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    zzxz zzxzVar3 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper iObjectWrapperM14707P4 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzaouVar = iInterfaceQueryLocalInterface4 instanceof zzaos ? (zzaos) iInterfaceQueryLocalInterface4 : new zzaou(strongBinder4);
                    }
                    mo16814h5(string6, string7, zzxzVar3, iObjectWrapperM14707P4, zzaouVar, zzamw.m16726h7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zMo16811L2 = mo16811L2(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfo.m19947a(parcel2, zMo16811L2);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    zzxz zzxzVar4 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper iObjectWrapperM14707P5 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzaorVar = iInterfaceQueryLocalInterface5 instanceof zzaop ? (zzaop) iInterfaceQueryLocalInterface5 : new zzaor(strongBinder5);
                    }
                    mo16813g4(string8, string9, zzxzVar4, iObjectWrapperM14707P5, zzaorVar, zzamw.m16726h7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            mo16816j5(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
