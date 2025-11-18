package p241e.p254e.p256b.p269b.p270a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IGetInstallReferrerService.java */
/* renamed from: e.e.b.b.a.a */
/* loaded from: classes2.dex */
public interface InterfaceC8892a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: e.e.b.b.a.a$a */
    public static abstract class a extends Binder implements InterfaceC8892a {

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: e.e.b.b.a.a$a$a, reason: collision with other inner class name */
        private static class C11522a implements InterfaceC8892a {

            /* renamed from: f */
            private IBinder f33673f;

            C11522a(IBinder iBinder) {
                this.f33673f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33673f;
            }

            @Override // p241e.p254e.p256b.p269b.p270a.InterfaceC8892a
            /* renamed from: e3 */
            public Bundle mo28236e3(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f33673f.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: H */
        public static InterfaceC8892a m28237H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8892a)) ? new C11522a(iBinder) : (InterfaceC8892a) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: e3 */
    Bundle mo28236e3(Bundle bundle) throws RemoteException;
}
