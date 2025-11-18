package com.google.android.gms.internal.p475authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzc implements IInterface {

    /* renamed from: f */
    private final IBinder f27489f;

    /* renamed from: g */
    private final String f27490g;

    protected zzc(IBinder iBinder, String str) {
        this.f27489f = iBinder;
        this.f27490g = str;
    }

    /* renamed from: H */
    protected final Parcel m20869H() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f27490g);
        return parcelObtain;
    }

    /* renamed from: P */
    protected final void m20870P(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f27489f.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f27489f;
    }
}
