package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel.java */
/* renamed from: android.support.v4.app.a */
/* loaded from: classes.dex */
public interface InterfaceC0001a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: android.support.v4.app.a$a */
    public static abstract class a extends Binder implements InterfaceC0001a {

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: android.support.v4.app.a$a$a, reason: collision with other inner class name */
        private static class C11430a implements InterfaceC0001a {

            /* renamed from: f */
            public static InterfaceC0001a f0f;

            /* renamed from: g */
            private IBinder f1g;

            C11430a(IBinder iBinder) {
                this.f1g = iBinder;
            }

            @Override // android.support.v4.app.InterfaceC0001a
            /* renamed from: F6 */
            public void mo2F6(String str, int i2, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str2);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f1g.transact(1, parcelObtain, null, 1) || a.m4P() == null) {
                        return;
                    }
                    a.m4P().mo2F6(str, i2, str2, notification);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1g;
            }
        }

        /* renamed from: H */
        public static InterfaceC0001a m3H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0001a)) ? new C11430a(iBinder) : (InterfaceC0001a) iInterfaceQueryLocalInterface;
        }

        /* renamed from: P */
        public static InterfaceC0001a m4P() {
            return C11430a.f0f;
        }
    }

    /* renamed from: F6 */
    void mo2F6(String str, int i2, String str2, Notification notification) throws RemoteException;
}
