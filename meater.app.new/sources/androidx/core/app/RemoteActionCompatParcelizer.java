package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2036a = (IconCompat) versionedParcel.m4740v(remoteActionCompat.f2036a, 1);
        remoteActionCompat.f2037b = versionedParcel.m4730l(remoteActionCompat.f2037b, 2);
        remoteActionCompat.f2038c = versionedParcel.m4730l(remoteActionCompat.f2038c, 3);
        remoteActionCompat.f2039d = (PendingIntent) versionedParcel.m4736r(remoteActionCompat.f2039d, 4);
        remoteActionCompat.f2040e = versionedParcel.m4726h(remoteActionCompat.f2040e, 5);
        remoteActionCompat.f2041f = versionedParcel.m4726h(remoteActionCompat.f2041f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.m4742x(false, false);
        versionedParcel.m4721M(remoteActionCompat.f2036a, 1);
        versionedParcel.m4712D(remoteActionCompat.f2037b, 2);
        versionedParcel.m4712D(remoteActionCompat.f2038c, 3);
        versionedParcel.m4716H(remoteActionCompat.f2039d, 4);
        versionedParcel.m4744z(remoteActionCompat.f2040e, 5);
        versionedParcel.m4744z(remoteActionCompat.f2041f, 6);
    }
}
