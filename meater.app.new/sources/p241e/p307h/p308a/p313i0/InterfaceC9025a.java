package p241e.p307h.p308a.p313i0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* compiled from: IFileDownloadIPCCallback.java */
/* renamed from: e.h.a.i0.a */
/* loaded from: classes2.dex */
public interface InterfaceC9025a extends IInterface {

    /* compiled from: IFileDownloadIPCCallback.java */
    /* renamed from: e.h.a.i0.a$a */
    public static abstract class a extends Binder implements InterfaceC9025a {

        /* compiled from: IFileDownloadIPCCallback.java */
        /* renamed from: e.h.a.i0.a$a$a, reason: collision with other inner class name */
        private static class C11523a implements InterfaceC9025a {

            /* renamed from: f */
            private IBinder f34796f;

            C11523a(IBinder iBinder) {
                this.f34796f = iBinder;
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9025a
            /* renamed from: D4 */
            public void mo28910D4(MessageSnapshot messageSnapshot) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (messageSnapshot != null) {
                        parcelObtain.writeInt(1);
                        messageSnapshot.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f34796f.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34796f;
            }
        }

        public a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }

        /* renamed from: H */
        public static InterfaceC9025a m28911H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC9025a)) ? new C11523a(iBinder) : (InterfaceC9025a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                mo28910D4(parcel.readInt() != 0 ? MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return true;
        }
    }

    /* renamed from: D4 */
    void mo28910D4(MessageSnapshot messageSnapshot) throws RemoteException;
}
