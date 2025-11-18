package p019b.p022b.p023a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ICustomTabsCallback.java */
/* renamed from: b.b.a.a */
/* loaded from: classes.dex */
public interface InterfaceC0821a extends IInterface {

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: b.b.a.a$a */
    public static abstract class a extends Binder implements InterfaceC0821a {
        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                mo5254r5(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                mo5252N4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                mo5250B6(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                mo5253q6(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 6) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            mo5251J6(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: B6 */
    void mo5250B6(Bundle bundle) throws RemoteException;

    /* renamed from: J6 */
    void mo5251J6(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    /* renamed from: N4 */
    void mo5252N4(String str, Bundle bundle) throws RemoteException;

    /* renamed from: q6 */
    void mo5253q6(String str, Bundle bundle) throws RemoteException;

    /* renamed from: r5 */
    void mo5254r5(int i2, Bundle bundle) throws RemoteException;
}
