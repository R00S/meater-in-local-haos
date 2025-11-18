package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: INotificationSideChannel.java */
/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2194a extends IInterface {

    /* renamed from: m, reason: collision with root package name */
    public static final String f29876m = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0418a extends Binder implements InterfaceC2194a {

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        private static class C0419a implements InterfaceC2194a {

            /* renamed from: B, reason: collision with root package name */
            private IBinder f29877B;

            C0419a(IBinder iBinder) {
                this.f29877B = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29877B;
            }

            @Override // b.InterfaceC2194a
            public void f1(String str, int i10, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2194a.f29876m);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f29877B.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC2194a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2194a.f29876m);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2194a)) ? new C0419a(iBinder) : (InterfaceC2194a) iInterfaceQueryLocalInterface;
        }
    }

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: b.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void f1(String str, int i10, String str2, Notification notification);
}
