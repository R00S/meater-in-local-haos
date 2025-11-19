package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class e extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static e f38476a;

    private e() {
    }

    protected static synchronized e e() {
        try {
            if (f38476a == null) {
                f38476a = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38476a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "fragment_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(0.0d);
    }
}
