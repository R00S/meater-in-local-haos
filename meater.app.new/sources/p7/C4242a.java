package p7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4242a implements IInterface {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f47654B;

    /* renamed from: C, reason: collision with root package name */
    private final String f47655C;

    protected C4242a(IBinder iBinder, String str) {
        this.f47654B = iBinder;
        this.f47655C = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f47654B;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f47655C);
        return parcelObtain;
    }

    protected final void g(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f47654B.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void k(int i10, Parcel parcel) {
        try {
            this.f47654B.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
