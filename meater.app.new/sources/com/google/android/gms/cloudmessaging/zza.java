package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.IMessengerCompat;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public class zza implements Parcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C6327a();

    /* renamed from: f */
    private Messenger f17184f;

    /* renamed from: g */
    private IMessengerCompat f17185g;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    /* renamed from: com.google.android.gms.cloudmessaging.zza$zza, reason: collision with other inner class name */
    public static final class C11476zza extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return zza.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return zza.class;
        }
    }

    public zza(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f17184f = new Messenger(iBinder);
        } else {
            this.f17185g = new IMessengerCompat.Proxy(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m13779a() {
        Messenger messenger = this.f17184f;
        return messenger != null ? messenger.getBinder() : this.f17185g.asBinder();
    }

    /* renamed from: b */
    public final void m13780b(Message message) throws RemoteException {
        Messenger messenger = this.f17184f;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f17185g.mo13751E1(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m13779a().equals(((zza) obj).m13779a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m13779a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f17184f;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f17185g.asBinder());
        }
    }
}
