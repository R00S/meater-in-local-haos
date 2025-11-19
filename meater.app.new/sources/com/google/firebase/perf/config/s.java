package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class s extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static s f38491a;

    private s() {
    }

    public static synchronized s e() {
        try {
            if (f38491a == null) {
                f38491a = new s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38491a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    protected Long d() {
        return 30L;
    }
}
