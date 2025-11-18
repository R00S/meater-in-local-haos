package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f28419f;

    /* renamed from: g */
    private final String f28420g;

    protected zza(IBinder iBinder, String str) {
        this.f28419f = iBinder;
        this.f28420g = str;
    }

    /* renamed from: H */
    protected final Parcel m22615H() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f28420g);
        return parcelObtain;
    }

    /* renamed from: P */
    protected final void m22616P(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f28419f.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f28419f;
    }
}
