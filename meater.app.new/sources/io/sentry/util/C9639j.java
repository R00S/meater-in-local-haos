package io.sentry.util;

import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import java.util.Properties;

/* compiled from: DebugMetaPropertiesApplier.java */
/* renamed from: io.sentry.util.j */
/* loaded from: classes2.dex */
public final class C9639j {

    /* renamed from: a */
    public static String f36929a = "sentry-debug-meta.properties";

    /* renamed from: a */
    private static void m31770a(C9680x4 c9680x4, Properties properties) {
        if (c9680x4.getBundleIds().isEmpty()) {
            String property = properties.getProperty("io.sentry.bundle-ids");
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "Bundle IDs found: %s", property);
            if (property != null) {
                for (String str : property.split(",", -1)) {
                    c9680x4.addBundleId(str);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m31771b(C9680x4 c9680x4, Properties properties) {
        if (c9680x4.getProguardUuid() == null) {
            String strM31773d = m31773d(properties);
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "Proguard UUID found: %s", strM31773d);
            c9680x4.setProguardUuid(strM31773d);
        }
    }

    /* renamed from: c */
    public static void m31772c(C9680x4 c9680x4, Properties properties) {
        if (properties != null) {
            m31771b(c9680x4, properties);
            m31770a(c9680x4, properties);
        }
    }

    /* renamed from: d */
    public static String m31773d(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
