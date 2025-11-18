package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class d extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static d f38475a;

    private d() {
    }

    protected static synchronized d e() {
        try {
            if (f38475a == null) {
                f38475a = new d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38475a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "experiment_app_start_ttid";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_experiment_app_start_ttid";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }
}
