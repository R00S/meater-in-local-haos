package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class b extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static b f38473a;

    private b() {
    }

    protected static synchronized b e() {
        try {
            if (f38473a == null) {
                f38473a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38473a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_deactivated";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }
}
