package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f27631f;

    /* renamed from: g */
    private final String f27632g;

    protected zza(IBinder iBinder, String str) {
        this.f27631f = iBinder;
        this.f27632g = str;
    }

    /* renamed from: H */
    protected final Parcel m20948H() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f27632g);
        return parcelObtain;
    }

    /* renamed from: P */
    protected final void m20949P(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f27631f.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f27631f;
    }
}
