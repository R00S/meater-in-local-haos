package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class r extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static r f38490a;

    private r() {
    }

    public static synchronized r f() {
        try {
            if (f38490a == null) {
                f38490a = new r();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38490a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_session_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(0.01d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
