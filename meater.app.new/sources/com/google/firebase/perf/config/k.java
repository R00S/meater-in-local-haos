package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class k extends v<String> {

    /* renamed from: a, reason: collision with root package name */
    private static k f38483a;

    protected k() {
    }

    protected static synchronized k e() {
        try {
            if (f38483a == null) {
                f38483a = new k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38483a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_disabled_android_versions";
    }

    protected String d() {
        return "";
    }
}
