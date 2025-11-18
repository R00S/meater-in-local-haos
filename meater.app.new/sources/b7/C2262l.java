package b7;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2262l implements Parcelable {
    public static final Parcelable.Creator<C2262l> CREATOR = new C2260j();

    /* renamed from: B, reason: collision with root package name */
    Messenger f30657B;

    public C2262l(IBinder iBinder) {
        this.f30657B = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f30657B;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f30657B;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((C2262l) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f30657B;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
