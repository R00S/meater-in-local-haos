package g7;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class U implements InterfaceC3441l {

    /* renamed from: B, reason: collision with root package name */
    private final IBinder f41968B;

    U(IBinder iBinder) {
        this.f41968B = iBinder;
    }

    @Override // g7.InterfaceC3441l
    public final void V0(InterfaceC3440k interfaceC3440k, C3436g c3436g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC3440k != null ? interfaceC3440k.asBinder() : null);
            if (c3436g != null) {
                parcelObtain.writeInt(1);
                k0.a(c3436g, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f41968B.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f41968B;
    }
}
