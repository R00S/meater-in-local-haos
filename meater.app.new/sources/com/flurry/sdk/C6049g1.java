package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.g1 */
/* loaded from: classes2.dex */
public final class C6049g1 {

    /* renamed from: c */
    private static List<C6031e1> f15909c;

    /* renamed from: e */
    private static List<String> f15911e;

    /* renamed from: a */
    private static List<InterfaceC6058h1> f15907a = new ArrayList();

    /* renamed from: b */
    private static final Map<Class<? extends InterfaceC6058h1>, C6031e1> f15908b = new LinkedHashMap();

    /* renamed from: d */
    private static final Map<Class<? extends InterfaceC6058h1>, InterfaceC6058h1> f15910d = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        f15911e = arrayList;
        arrayList.add("com.flurry.android.marketing.core.FlurryMarketingCoreModule");
        f15911e.add("com.flurry.android.marketing.FlurryMarketingModule");
        f15911e.add("com.flurry.android.config.killswitch.FlurryKillSwitchModule");
        f15911e.add("com.flurry.android.nativecrash.FlurryNativeCrashModule");
        f15911e.add("com.flurry.android.nativecrash.internal.FlurryNativeCrashModuleStreamingImpl");
        f15911e.add("com.flurry.android.FlurryAdModule");
        f15911e.add("com.flurry.android.ymadlite.YahooAdModule");
    }

    /* renamed from: a */
    public static void m13075a(Context context) throws IllegalAccessException, InstantiationException {
        ArrayList<C6031e1> arrayList;
        C6021d1.m13030c(3, "FlurryModuleManager", "Init Ads");
        Map<Class<? extends InterfaceC6058h1>, C6031e1> map = f15908b;
        synchronized (map) {
            arrayList = new ArrayList(map.values());
            f15909c = arrayList;
        }
        for (C6031e1 c6031e1 : arrayList) {
            C6021d1.m13030c(5, "FlurryModuleManager", "registration ".concat(String.valueOf(c6031e1)));
            try {
                Class<? extends InterfaceC6058h1> cls = c6031e1.f15809a;
                if (cls != null && Build.VERSION.SDK_INT >= c6031e1.f15810b) {
                    InterfaceC6058h1 interfaceC6058h1NewInstance = cls.newInstance();
                    interfaceC6058h1NewInstance.m13087a(context);
                    f15910d.put(c6031e1.f15809a, interfaceC6058h1NewInstance);
                }
            } catch (Exception e2) {
                C6021d1.m13031d(5, "FlurryModuleManager", "Flurry Module for class " + c6031e1.f15809a + " is not available:", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m13076b(InterfaceC6058h1 interfaceC6058h1) {
        C6021d1.m13030c(3, "FlurryModuleManager", "Register Add-On ".concat(String.valueOf(interfaceC6058h1)));
        if (interfaceC6058h1 == null) {
            C6021d1.m13030c(5, "FlurryModuleManager", "Module is null, cannot register it");
            return;
        }
        boolean z = false;
        Iterator<InterfaceC6058h1> it = f15907a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().getClass().getSimpleName().equals(interfaceC6058h1.getClass().getSimpleName())) {
                z = true;
                break;
            }
        }
        if (!z) {
            f15907a.add(interfaceC6058h1);
            return;
        }
        C6021d1.m13030c(3, "FlurryModuleManager", interfaceC6058h1 + " has been register already as addOn module");
    }

    /* renamed from: c */
    public static void m13077c(Class<? extends InterfaceC6058h1> cls) {
        C6021d1.m13030c(3, "FlurryModuleManager", "Register Ads ".concat(String.valueOf(cls)));
        if (cls == null) {
            return;
        }
        Map<Class<? extends InterfaceC6058h1>, C6031e1> map = f15908b;
        synchronized (map) {
            map.put(cls, new C6031e1(cls));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m13078d(Context context) {
        C6021d1.m13030c(2, "FlurryModuleManager", "Init Add on modules");
        synchronized (f15910d) {
            for (InterfaceC6058h1 interfaceC6058h1 : f15907a) {
                try {
                    C6021d1.m13030c(2, "FlurryModuleManager", "Module list: ".concat(String.valueOf(interfaceC6058h1)));
                    Map<Class<? extends InterfaceC6058h1>, InterfaceC6058h1> map = f15910d;
                    if (map.containsKey(interfaceC6058h1.getClass())) {
                        C6021d1.m13030c(5, "FlurryModuleManager", interfaceC6058h1.getClass() + " has been initialized");
                    } else {
                        interfaceC6058h1.m13087a(context);
                        map.put(interfaceC6058h1.getClass(), interfaceC6058h1);
                        C6021d1.m13030c(3, "FlurryModuleManager", "Initialized modules: " + interfaceC6058h1.getClass());
                    }
                } catch (C6028da e2) {
                    C6021d1.m13037j("FlurryModuleManager", e2.getMessage());
                }
            }
        }
    }
}
