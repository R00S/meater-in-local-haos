package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.AbstractC0807n;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: WakeLocks.java */
/* renamed from: androidx.work.impl.utils.j */
/* loaded from: classes.dex */
public class C0791j {

    /* renamed from: a */
    private static final String f4887a = AbstractC0807n.m5223f("WakeLocks");

    /* renamed from: b */
    private static final WeakHashMap<PowerManager.WakeLock, String> f4888b = new WeakHashMap<>();

    /* renamed from: a */
    public static void m5170a() {
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f4888b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC0807n.m5221c().mo5228h(f4887a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    /* renamed from: b */
    public static PowerManager.WakeLock m5171b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f4888b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str2);
        }
        return wakeLockNewWakeLock;
    }
}
