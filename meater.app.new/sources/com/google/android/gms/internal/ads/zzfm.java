package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzfm implements IInterface {

    /* renamed from: f */
    private final IBinder f26097f;

    /* renamed from: g */
    private final String f26098g;

    protected zzfm(IBinder iBinder, String str) {
        this.f26097f = iBinder;
        this.f26098g = str;
    }

    /* renamed from: E0 */
    protected final void m19943E0(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f26097f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: H */
    protected final Parcel m19944H() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f26098g);
        return parcelObtain;
    }

    /* renamed from: P */
    protected final Parcel m19945P(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f26097f.transact(i2, parcel, parcelObtain, 0);
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
        return this.f26097f;
    }

    /* renamed from: k0 */
    protected final void m19946k0(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f26097f.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
