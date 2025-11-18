package p024c.p071o.p072a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: WakefulBroadcastReceiver.java */
@Deprecated
/* renamed from: c.o.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0991a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f6526a = new SparseArray<>();

    /* renamed from: b */
    private static int f6527b = 1;

    /* renamed from: c */
    public static boolean m6270c(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f6526a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: d */
    public static ComponentName m6271d(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f6526a;
        synchronized (sparseArray) {
            int i2 = f6527b;
            int i3 = i2 + 1;
            f6527b = i3;
            if (i3 <= 0) {
                f6527b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i2);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i2, wakeLockNewWakeLock);
            return componentNameStartService;
        }
    }
}
