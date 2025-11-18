package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IResultReceiver.java */
/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public interface InterfaceC0029a extends IInterface {

    /* compiled from: IResultReceiver.java */
    /* renamed from: android.support.v4.os.a$a */
    public static abstract class a extends Binder implements InterfaceC0029a {

        /* compiled from: IResultReceiver.java */
        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        private static class C11432a implements InterfaceC0029a {

            /* renamed from: f */
            private IBinder f84f;

            C11432a(IBinder iBinder) {
                this.f84f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f84f;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: H */
        public static InterfaceC0029a m123H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0029a)) ? new C11432a(iBinder) : (InterfaceC0029a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo122d7(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    /* renamed from: d7 */
    void mo122d7(int i2, Bundle bundle) throws RemoteException;
}
