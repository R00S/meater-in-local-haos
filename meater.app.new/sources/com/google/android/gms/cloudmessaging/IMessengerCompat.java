package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
interface IMessengerCompat extends IInterface {

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        /* renamed from: E1 */
        public void mo13751E1(Message message) throws RemoteException {
            message.arg2 = Binder.getCallingUid();
            throw null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            parcel.enforceInterface(getInterfaceDescriptor());
            if (i2 != 1) {
                return false;
            }
            mo13751E1(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static class Proxy implements IMessengerCompat {

        /* renamed from: f */
        private final IBinder f17138f;

        Proxy(IBinder iBinder) {
            this.f17138f = iBinder;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        /* renamed from: E1 */
        public void mo13751E1(Message message) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            parcelObtain.writeInt(1);
            message.writeToParcel(parcelObtain, 0);
            try {
                this.f17138f.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f17138f;
        }
    }

    /* renamed from: E1 */
    void mo13751E1(Message message) throws RemoteException;
}
