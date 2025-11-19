package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: IResultReceiver.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: o, reason: collision with root package name */
    public static final String f30810o = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* compiled from: IResultReceiver.java */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void r1(int i10, Bundle bundle);

    /* compiled from: IResultReceiver.java */
    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0428a extends Binder implements a {

        /* compiled from: IResultReceiver.java */
        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C0429a implements a {

            /* renamed from: B, reason: collision with root package name */
            private IBinder f30811B;

            C0429a(IBinder iBinder) {
                this.f30811B = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30811B;
            }
        }

        public AbstractBinderC0428a() {
            attachInterface(this, a.f30810o);
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f30810o);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0429a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f30810o;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            r1(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
