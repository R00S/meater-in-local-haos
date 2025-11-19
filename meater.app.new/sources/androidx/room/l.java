package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public interface l extends IInterface {

    /* renamed from: k, reason: collision with root package name */
    public static final String f29175k = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    void D(String[] strArr);

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class a extends Binder implements l {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.l$a$a, reason: collision with other inner class name */
        private static class C0401a implements l {

            /* renamed from: B, reason: collision with root package name */
            private IBinder f29176B;

            C0401a(IBinder iBinder) {
                this.f29176B = iBinder;
            }

            @Override // androidx.room.l
            public void D(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(l.f29175k);
                    parcelObtain.writeStringArray(strArr);
                    this.f29176B.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29176B;
            }
        }

        public a() {
            attachInterface(this, l.f29175k);
        }

        public static l c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(l.f29175k);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new C0401a(iBinder) : (l) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = l.f29175k;
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
            D(parcel.createStringArray());
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
