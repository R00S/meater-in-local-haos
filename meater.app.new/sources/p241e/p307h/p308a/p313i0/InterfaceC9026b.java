package p241e.p307h.p308a.p313i0;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import p241e.p307h.p308a.p313i0.InterfaceC9025a;

/* compiled from: IFileDownloadIPCService.java */
/* renamed from: e.h.a.i0.b */
/* loaded from: classes2.dex */
public interface InterfaceC9026b extends IInterface {

    /* compiled from: IFileDownloadIPCService.java */
    /* renamed from: e.h.a.i0.b$a */
    public static abstract class a extends Binder implements InterfaceC9026b {

        /* compiled from: IFileDownloadIPCService.java */
        /* renamed from: e.h.a.i0.b$a$a, reason: collision with other inner class name */
        private static class C11524a implements InterfaceC9026b {

            /* renamed from: f */
            private IBinder f34797f;

            C11524a(IBinder iBinder) {
                this.f34797f = iBinder;
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: Q */
            public byte mo27633Q(int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(i2);
                    this.f34797f.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readByte();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: S */
            public void mo27634S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    int i5 = 1;
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    if (fileDownloadHeader != null) {
                        parcelObtain.writeInt(1);
                        fileDownloadHeader.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!z3) {
                        i5 = 0;
                    }
                    parcelObtain.writeInt(i5);
                    this.f34797f.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: V4 */
            public void mo27635V4(InterfaceC9025a interfaceC9025a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeStrongBinder(interfaceC9025a != null ? interfaceC9025a.asBinder() : null);
                    this.f34797f.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: Y6 */
            public void mo27636Y6() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    this.f34797f.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: a0 */
            public boolean mo27639a0(int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(i2);
                    this.f34797f.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34797f;
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: o0 */
            public boolean mo27642o0(int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(i2);
                    this.f34797f.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: t0 */
            public void mo27644t0(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f34797f.transact(13, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC9026b
            /* renamed from: v1 */
            public void mo27646v1(InterfaceC9025a interfaceC9025a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeStrongBinder(interfaceC9025a != null ? interfaceC9025a.asBinder() : null);
                    this.f34797f.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCService");
        }

        /* renamed from: E0 */
        public static InterfaceC9026b m28912E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC9026b)) ? new C11524a(iBinder) : (InterfaceC9026b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    mo27646v1(InterfaceC9025a.a.m28911H(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    mo27635V4(InterfaceC9025a.a.m28911H(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zMo27631I2 = mo27631I2(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo27631I2 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    mo27634S(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? FileDownloadHeader.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zMo27639a0 = mo27639a0(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo27639a0 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    mo27636Y6();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zMo27637Z2 = mo27637Z2(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo27637Z2 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    long jMo27645u5 = mo27645u5(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jMo27645u5);
                    return true;
                case 9:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    long jMo27643p4 = mo27643p4(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jMo27643p4);
                    return true;
                case 10:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    byte bMo27633Q = mo27633Q(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeByte(bMo27633Q);
                    return true;
                case 11:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zMo27638Z4 = mo27638Z4();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo27638Z4 ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    mo27630E6(parcel.readInt(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 13:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    mo27644t0(parcel.readInt() != 0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean zMo27642o0 = mo27642o0(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo27642o0 ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    mo27641l2();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    /* renamed from: E6 */
    void mo27630E6(int i2, Notification notification) throws RemoteException;

    /* renamed from: I2 */
    boolean mo27631I2(String str, String str2) throws RemoteException;

    /* renamed from: Q */
    byte mo27633Q(int i2) throws RemoteException;

    /* renamed from: S */
    void mo27634S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException;

    /* renamed from: V4 */
    void mo27635V4(InterfaceC9025a interfaceC9025a) throws RemoteException;

    /* renamed from: Y6 */
    void mo27636Y6() throws RemoteException;

    /* renamed from: Z2 */
    boolean mo27637Z2(int i2) throws RemoteException;

    /* renamed from: Z4 */
    boolean mo27638Z4() throws RemoteException;

    /* renamed from: a0 */
    boolean mo27639a0(int i2) throws RemoteException;

    /* renamed from: l2 */
    void mo27641l2() throws RemoteException;

    /* renamed from: o0 */
    boolean mo27642o0(int i2) throws RemoteException;

    /* renamed from: p4 */
    long mo27643p4(int i2) throws RemoteException;

    /* renamed from: t0 */
    void mo27644t0(boolean z) throws RemoteException;

    /* renamed from: u5 */
    long mo27645u5(int i2) throws RemoteException;

    /* renamed from: v1 */
    void mo27646v1(InterfaceC9025a interfaceC9025a) throws RemoteException;
}
