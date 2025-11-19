package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class m extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static m f38485a;

    private m() {
    }

    public static synchronized m e() {
        try {
            if (f38485a == null) {
                f38485a = new m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38485a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    protected Long d() {
        return 0L;
    }
}
