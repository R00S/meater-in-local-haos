package com.facebook.p172q0.p173a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IReceiverService.java */
/* renamed from: com.facebook.q0.a.a */
/* loaded from: classes2.dex */
public interface InterfaceC5949a extends IInterface {

    /* compiled from: IReceiverService.java */
    /* renamed from: com.facebook.q0.a.a$a */
    public static abstract class a extends Binder implements InterfaceC5949a {

        /* compiled from: IReceiverService.java */
        /* renamed from: com.facebook.q0.a.a$a$a, reason: collision with other inner class name */
        private static class C11464a implements InterfaceC5949a {

            /* renamed from: f */
            public static InterfaceC5949a f15560f;

            /* renamed from: g */
            private IBinder f15561g;

            C11464a(IBinder iBinder) {
                this.f15561g = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15561g;
            }

            @Override // com.facebook.p172q0.p173a.InterfaceC5949a
            /* renamed from: u1 */
            public int mo12883u1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f15561g.transact(1, parcelObtain, parcelObtain2, 0) && a.m12885P() != null) {
                        return a.m12885P().mo12883u1(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: H */
        public static InterfaceC5949a m12884H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5949a)) ? new C11464a(iBinder) : (InterfaceC5949a) iInterfaceQueryLocalInterface;
        }

        /* renamed from: P */
        public static InterfaceC5949a m12885P() {
            return C11464a.f15560f;
        }
    }

    /* renamed from: u1 */
    int mo12883u1(Bundle bundle) throws RemoteException;
}
