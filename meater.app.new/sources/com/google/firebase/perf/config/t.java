package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class t extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static t f38492a;

    private t() {
    }

    public static synchronized t e() {
        try {
            if (f38492a == null) {
                f38492a = new t();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38492a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    protected Long d() {
        return 300L;
    }
}
