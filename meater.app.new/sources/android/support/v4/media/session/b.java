package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMediaSession.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: IMediaSession.java */
    public static abstract class a extends Binder implements b {

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C0297a implements b {

            /* renamed from: B, reason: collision with root package name */
            private IBinder f20526B;

            C0297a(IBinder iBinder) {
                this.f20526B = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20526B;
            }

            @Override // android.support.v4.media.session.b
            public void p(android.support.v4.media.session.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f20526B.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0297a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    void p(android.support.v4.media.session.a aVar);
}
