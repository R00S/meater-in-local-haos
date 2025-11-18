package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class c extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static c f38474a;

    private c() {
    }

    protected static synchronized c d() {
        try {
            if (f38474a == null) {
                f38474a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38474a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "isEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_enabled";
    }
}
