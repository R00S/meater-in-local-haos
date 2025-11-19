package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class o extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static o f38487a;

    private o() {
    }

    public static synchronized o e() {
        try {
            if (f38487a == null) {
                f38487a = new o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38487a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_max_length_minutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_max_duration_min";
    }

    protected Long d() {
        return 240L;
    }
}
