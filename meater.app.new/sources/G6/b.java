package G6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import m6.InterfaceC3970e;

/* compiled from: ApplicationVersionSignature.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, InterfaceC3970e> f4979a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static InterfaceC3970e c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, InterfaceC3970e> concurrentMap = f4979a;
        InterfaceC3970e interfaceC3970e = concurrentMap.get(packageName);
        if (interfaceC3970e != null) {
            return interfaceC3970e;
        }
        InterfaceC3970e interfaceC3970eD = d(context);
        InterfaceC3970e interfaceC3970ePutIfAbsent = concurrentMap.putIfAbsent(packageName, interfaceC3970eD);
        return interfaceC3970ePutIfAbsent == null ? interfaceC3970eD : interfaceC3970ePutIfAbsent;
    }

    private static InterfaceC3970e d(Context context) {
        return new d(b(a(context)));
    }
}
