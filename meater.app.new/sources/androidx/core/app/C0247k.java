package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0245i;
import androidx.core.graphics.drawable.IconCompat;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: NotificationCompatJellybean.java */
/* renamed from: androidx.core.app.k */
/* loaded from: classes.dex */
class C0247k {

    /* renamed from: b */
    private static Field f2150b;

    /* renamed from: c */
    private static boolean f2151c;

    /* renamed from: a */
    private static final Object f2149a = new Object();

    /* renamed from: d */
    private static final Object f2152d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m1622a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m1623b(C0245i.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatM1562e = aVar.m1562e();
        bundle.putInt(RoomInstalled.ICON, iconCompatM1562e != null ? iconCompatM1562e.m1795e() : 0);
        bundle.putCharSequence("title", aVar.m1566i());
        bundle.putParcelable("actionIntent", aVar.m1558a());
        Bundle bundle2 = aVar.m1561d() != null ? new Bundle(aVar.m1561d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m1559b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m1626e(aVar.m1563f()));
        bundle.putBoolean("showsUserInterface", aVar.m1565h());
        bundle.putInt("semanticAction", aVar.m1564g());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m1624c(Notification notification) {
        synchronized (f2149a) {
            if (f2151c) {
                return null;
            }
            try {
                if (f2150b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2151c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2150b = declaredField;
                }
                Bundle bundle = (Bundle) f2150b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2150b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f2151c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e("NotificationCompat", "Unable to access notification extras", e3);
                f2151c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m1625d(C0250n c0250n) {
        new Bundle();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m1626e(C0250n[] c0250nArr) {
        if (c0250nArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0250nArr.length];
        for (int i2 = 0; i2 < c0250nArr.length; i2++) {
            bundleArr[i2] = m1625d(c0250nArr[i2]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m1627f(Notification.Builder builder, C0245i.a aVar) {
        IconCompat iconCompatM1562e = aVar.m1562e();
        builder.addAction(iconCompatM1562e != null ? iconCompatM1562e.m1795e() : 0, aVar.m1566i(), aVar.m1558a());
        Bundle bundle = new Bundle(aVar.m1561d());
        if (aVar.m1563f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1626e(aVar.m1563f()));
        }
        if (aVar.m1560c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1626e(aVar.m1560c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m1559b());
        return bundle;
    }
}
