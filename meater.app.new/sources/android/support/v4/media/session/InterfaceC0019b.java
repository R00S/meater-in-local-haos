package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMediaSession.java */
/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0019b extends IInterface {

    /* compiled from: IMediaSession.java */
    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends Binder implements InterfaceC0019b {

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C11431a implements InterfaceC0019b {

            /* renamed from: f */
            private IBinder f65f;

            C11431a(IBinder iBinder) {
                this.f65f = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0019b
            /* renamed from: Z0 */
            public void mo81Z0(InterfaceC0018a interfaceC0018a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC0018a != null ? interfaceC0018a.asBinder() : null);
                    this.f65f.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f65f;
            }
        }

        /* renamed from: H */
        public static InterfaceC0019b m82H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0019b)) ? new C11431a(iBinder) : (InterfaceC0019b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: Z0 */
    void mo81Z0(InterfaceC0018a interfaceC0018a) throws RemoteException;
}
