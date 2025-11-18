package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zaa implements IInterface {

    /* renamed from: f */
    private final IBinder f27571f;

    /* renamed from: g */
    private final String f27572g;

    protected zaa(IBinder iBinder, String str) {
        this.f27571f = iBinder;
        this.f27572g = str;
    }

    /* renamed from: E0 */
    protected final void m20889E0(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f27571f.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: H */
    protected final Parcel m20890H() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f27572g);
        return parcelObtain;
    }

    /* renamed from: P */
    protected final Parcel m20891P(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f27571f.transact(i2, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f27571f;
    }

    /* renamed from: k0 */
    protected final void m20892k0(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f27571f.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
