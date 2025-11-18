package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* renamed from: androidx.room.d */
/* loaded from: classes.dex */
public interface InterfaceC0645d extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* renamed from: androidx.room.d$a */
    public static abstract class a extends Binder implements InterfaceC0645d {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        private static class C11439a implements InterfaceC0645d {

            /* renamed from: f */
            private IBinder f4251f;

            C11439a(IBinder iBinder) {
                this.f4251f = iBinder;
            }

            @Override // androidx.room.InterfaceC0645d
            /* renamed from: L1 */
            public void mo4587L1(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.f4251f.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4251f;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: H */
        public static InterfaceC0645d m4588H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0645d)) ? new C11439a(iBinder) : (InterfaceC0645d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo4587L1(parcel.createStringArray());
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    /* renamed from: L1 */
    void mo4587L1(String[] strArr) throws RemoteException;
}
