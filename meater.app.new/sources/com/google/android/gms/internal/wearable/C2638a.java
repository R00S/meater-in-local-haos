package com.google.android.gms.internal.wearable;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2638a implements IInterface {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f34551B;

    /* renamed from: C, reason: collision with root package name */
    private final String f34552C;

    protected C2638a(IBinder iBinder, String str) {
        this.f34551B = iBinder;
        this.f34552C = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34551B;
    }

    protected final void c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f34551B.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void g(int i10, Parcel parcel) {
        try {
            this.f34551B.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel k() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f34552C);
        return parcelObtain;
    }
}
