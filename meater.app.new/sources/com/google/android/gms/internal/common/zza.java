package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f27606f;

    /* renamed from: g */
    private final String f27607g;

    protected zza(IBinder iBinder, String str) {
        this.f27606f = iBinder;
        this.f27607g = str;
    }

    /* renamed from: H */
    protected final Parcel m20909H(int i2, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f27606f.transact(i2, parcel, parcelObtain, 0);
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

    /* renamed from: P */
    protected final void m20910P(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f27606f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27606f;
    }

    /* renamed from: k0 */
    protected final Parcel m20911k0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f27607g);
        return parcelObtain;
    }
}
