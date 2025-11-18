package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.l;

/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public interface m extends IInterface {

    /* renamed from: l, reason: collision with root package name */
    public static final String f29177l = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    int Q(l lVar, String str);

    void d1(int i10, String[] strArr);

    void n1(l lVar, int i10);

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class a extends Binder implements m {

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.m$a$a, reason: collision with other inner class name */
        private static class C0402a implements m {

            /* renamed from: B, reason: collision with root package name */
            private IBinder f29178B;

            C0402a(IBinder iBinder) {
                this.f29178B = iBinder;
            }

            @Override // androidx.room.m
            public int Q(l lVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(m.f29177l);
                    parcelObtain.writeStrongInterface(lVar);
                    parcelObtain.writeString(str);
                    this.f29178B.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29178B;
            }

            @Override // androidx.room.m
            public void d1(int i10, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(m.f29177l);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f29178B.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.m
            public void n1(l lVar, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(m.f29177l);
                    parcelObtain.writeStrongInterface(lVar);
                    parcelObtain.writeInt(i10);
                    this.f29178B.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, m.f29177l);
        }

        public static m c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(m.f29177l);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new C0402a(iBinder) : (m) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = m.f29177l;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iQ = Q(l.a.c(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iQ);
            } else if (i10 == 2) {
                n1(l.a.c(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                d1(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
