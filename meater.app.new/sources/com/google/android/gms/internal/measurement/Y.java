package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public class Y implements IInterface {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f33945B;

    /* renamed from: C, reason: collision with root package name */
    private final String f33946C;

    protected Y(IBinder iBinder, String str) {
        this.f33945B = iBinder;
        this.f33946C = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f33945B;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f33946C);
        return parcelObtain;
    }

    protected final Parcel g(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f33945B.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void k(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f33945B.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void u1(int i10, Parcel parcel) {
        try {
            this.f33945B.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
