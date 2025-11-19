package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class u extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static u f38493a;

    private u() {
    }

    protected static synchronized u f() {
        try {
            if (f38493a == null) {
                f38493a = new u();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38493a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
