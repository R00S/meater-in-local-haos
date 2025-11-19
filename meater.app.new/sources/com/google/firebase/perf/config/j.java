package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class j extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static j f38482a;

    private j() {
    }

    public static synchronized j e() {
        try {
            if (f38482a == null) {
                f38482a = new j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38482a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_time_limit_sec";
    }

    protected Long d() {
        return 600L;
    }
}
