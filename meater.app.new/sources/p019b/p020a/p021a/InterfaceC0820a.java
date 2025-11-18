package p019b.p020a.p021a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IPackageInstallObserver.java */
/* renamed from: b.a.a.a */
/* loaded from: classes.dex */
public interface InterfaceC0820a extends IInterface {

    /* compiled from: IPackageInstallObserver.java */
    /* renamed from: b.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC0820a {
        public a() {
            throw new RuntimeException("Stub!");
        }

        public static InterfaceC0820a asInterface(IBinder iBinder) {
            throw new RuntimeException("Stub!");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            throw new RuntimeException("Stub!");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            throw new RuntimeException("Stub!");
        }

        public abstract void packageInstalled(String str, int i2) throws RemoteException;
    }
}
