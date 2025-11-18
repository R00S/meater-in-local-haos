package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: MetadataBackendRegistry.java */
@Singleton
/* renamed from: com.google.android.datatransport.runtime.backends.k */
/* loaded from: classes2.dex */
class C6268k implements InterfaceC6262e {

    /* renamed from: a */
    private final a f16780a;

    /* renamed from: b */
    private final C6266i f16781b;

    /* renamed from: c */
    private final Map<String, InterfaceC6270m> f16782c;

    /* compiled from: MetadataBackendRegistry.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    static class a {

        /* renamed from: a */
        private final Context f16783a;

        /* renamed from: b */
        private Map<String, String> f16784b = null;

        a(Context context) {
            this.f16783a = context;
        }

        /* renamed from: a */
        private Map<String, String> m13530a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleM13532d = m13532d(context);
            if (bundleM13532d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleM13532d.keySet()) {
                Object obj = bundleM13532d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        /* renamed from: c */
        private Map<String, String> m13531c() {
            if (this.f16784b == null) {
                this.f16784b = m13530a(this.f16783a);
            }
            return this.f16784b;
        }

        /* renamed from: d */
        private static Bundle m13532d(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC6261d m13533b(String str) {
            String str2 = m13531c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC6261d) Class.forName(str2).asSubclass(InterfaceC6261d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (InstantiationException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e6);
                return null;
            }
        }
    }

    @Inject
    C6268k(Context context, C6266i c6266i) {
        this(new a(context), c6266i);
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6262e
    public synchronized InterfaceC6270m get(String str) {
        if (this.f16782c.containsKey(str)) {
            return this.f16782c.get(str);
        }
        InterfaceC6261d interfaceC6261dM13533b = this.f16780a.m13533b(str);
        if (interfaceC6261dM13533b == null) {
            return null;
        }
        InterfaceC6270m interfaceC6270mCreate = interfaceC6261dM13533b.create(this.f16781b.m13526a(str));
        this.f16782c.put(str, interfaceC6270mCreate);
        return interfaceC6270mCreate;
    }

    C6268k(a aVar, C6266i c6266i) {
        this.f16782c = new HashMap();
        this.f16780a = aVar;
        this.f16781b = c6266i;
    }
}
