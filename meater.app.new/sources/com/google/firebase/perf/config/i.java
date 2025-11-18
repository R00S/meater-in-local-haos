package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class i extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static i f38481a;

    private i() {
    }

    protected static synchronized i f() {
        try {
            if (f38481a == null) {
                f38481a = new i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38481a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
