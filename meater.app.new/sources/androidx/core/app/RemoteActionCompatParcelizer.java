package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f24713a = (IconCompat) versionedParcel.v(remoteActionCompat.f24713a, 1);
        remoteActionCompat.f24714b = versionedParcel.l(remoteActionCompat.f24714b, 2);
        remoteActionCompat.f24715c = versionedParcel.l(remoteActionCompat.f24715c, 3);
        remoteActionCompat.f24716d = (PendingIntent) versionedParcel.r(remoteActionCompat.f24716d, 4);
        remoteActionCompat.f24717e = versionedParcel.h(remoteActionCompat.f24717e, 5);
        remoteActionCompat.f24718f = versionedParcel.h(remoteActionCompat.f24718f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f24713a, 1);
        versionedParcel.D(remoteActionCompat.f24714b, 2);
        versionedParcel.D(remoteActionCompat.f24715c, 3);
        versionedParcel.H(remoteActionCompat.f24716d, 4);
        versionedParcel.z(remoteActionCompat.f24717e, 5);
        versionedParcel.z(remoteActionCompat.f24718f, 6);
    }
}
