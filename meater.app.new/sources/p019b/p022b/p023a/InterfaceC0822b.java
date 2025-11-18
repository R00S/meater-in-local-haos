package p019b.p022b.p023a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: ICustomTabsService.java */
/* renamed from: b.b.a.b */
/* loaded from: classes.dex */
public interface InterfaceC0822b extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* renamed from: b.b.a.b$a */
    public static abstract class a extends Binder implements InterfaceC0822b {

        /* compiled from: ICustomTabsService.java */
        /* renamed from: b.b.a.b$a$a, reason: collision with other inner class name */
        private static class C11444a implements InterfaceC0822b {

            /* renamed from: f */
            private IBinder f5011f;

            C11444a(IBinder iBinder) {
                this.f5011f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5011f;
            }

            @Override // p019b.p022b.p023a.InterfaceC0822b
            /* renamed from: p3 */
            public boolean mo5255p3(long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j2);
                    this.f5011f.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p019b.p022b.p023a.InterfaceC0822b
            /* renamed from: q1 */
            public boolean mo5256q1(InterfaceC0821a interfaceC0821a, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC0821a != null ? interfaceC0821a.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeTypedList(list);
                    this.f5011f.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p019b.p022b.p023a.InterfaceC0822b
            /* renamed from: x4 */
            public boolean mo5257x4(InterfaceC0821a interfaceC0821a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC0821a != null ? interfaceC0821a.asBinder() : null);
                    this.f5011f.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: H */
        public static InterfaceC0822b m5258H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0822b)) ? new C11444a(iBinder) : (InterfaceC0822b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: p3 */
    boolean mo5255p3(long j2) throws RemoteException;

    /* renamed from: q1 */
    boolean mo5256q1(InterfaceC0821a interfaceC0821a, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: x4 */
    boolean mo5257x4(InterfaceC0821a interfaceC0821a) throws RemoteException;
}
