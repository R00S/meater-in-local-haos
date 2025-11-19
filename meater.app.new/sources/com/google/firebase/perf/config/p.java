package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class p extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static p f38488a;

    private p() {
    }

    public static synchronized p e() {
        try {
            if (f38488a == null) {
                f38488a = new p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38488a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    protected Long d() {
        return 0L;
    }
}
