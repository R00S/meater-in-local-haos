package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class l extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static l f38484a;

    protected l() {
    }

    protected static synchronized l e() {
        try {
            if (f38484a == null) {
                f38484a = new l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38484a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_enabled";
    }

    protected Boolean d() {
        return Boolean.TRUE;
    }
}
