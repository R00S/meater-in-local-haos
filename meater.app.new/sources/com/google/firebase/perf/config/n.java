package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class n extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static n f38486a;

    private n() {
    }

    public static synchronized n f() {
        try {
            if (f38486a == null) {
                f38486a = new n();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38486a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    protected Long d() {
        return 100L;
    }

    protected Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
