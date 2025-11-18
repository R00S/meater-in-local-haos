package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaqh extends zzfn implements zzaqg {
    public zzaqh() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzaqg zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzaqg ? (zzaqg) iInterfaceQueryLocalInterface : new zzaqi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                onCreate((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                onRestart();
                parcel2.writeNoException();
                return true;
            case 3:
                onStart();
                parcel2.writeNoException();
                return true;
            case 4:
                onResume();
                parcel2.writeNoException();
                return true;
            case 5:
                onPause();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) zzfo.m19948b(parcel, Bundle.CREATOR);
                onSaveInstanceState(bundle);
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, bundle);
                return true;
            case 7:
                onStop();
                parcel2.writeNoException();
                return true;
            case 8:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 9:
                zzdd();
                parcel2.writeNoException();
                return true;
            case 10:
                onBackPressed();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZztg = zztg();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zZztg);
                return true;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) zzfo.m19948b(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzac(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
