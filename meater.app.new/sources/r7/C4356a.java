package r7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4356a implements IInterface {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f48429B;

    /* renamed from: C, reason: collision with root package name */
    private final String f48430C;

    protected C4356a(IBinder iBinder, String str) {
        this.f48429B = iBinder;
        this.f48430C = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48429B;
    }

    protected final Parcel c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f48429B.transact(i10, parcel, parcelObtain, 0);
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

    protected final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f48430C);
        return parcelObtain;
    }
}
