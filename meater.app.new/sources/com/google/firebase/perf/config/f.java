package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s9.C4518a;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class f extends v<String> {

    /* renamed from: a, reason: collision with root package name */
    private static f f38477a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Long, String> f38478b = Collections.unmodifiableMap(new a());

    /* compiled from: ConfigurationConstants.java */
    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        try {
            if (f38477a == null) {
                f38477a = new f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38477a;
    }

    protected static String f(long j10) {
        return f38478b.get(Long.valueOf(j10));
    }

    protected static boolean g(long j10) {
        return f38478b.containsKey(Long.valueOf(j10));
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_log_source";
    }

    protected String d() {
        return C4518a.f49527c;
    }
}
