package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class g extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static g f38479a;

    private g() {
    }

    public static synchronized g e() {
        try {
            if (f38479a == null) {
                f38479a = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38479a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_bg";
    }

    protected Long d() {
        return 70L;
    }
}
