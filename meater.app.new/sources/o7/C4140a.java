package o7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4140a implements IInterface {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f46573B;

    /* renamed from: C, reason: collision with root package name */
    private final String f46574C = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected C4140a(IBinder iBinder, String str) {
        this.f46573B = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46573B;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46574C);
        return parcelObtain;
    }

    protected final Parcel g(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f46573B.transact(i10, parcel, parcelObtain, 0);
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
}
