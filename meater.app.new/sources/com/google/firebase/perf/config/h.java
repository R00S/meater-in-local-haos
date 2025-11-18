package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes2.dex */
public final class h extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static h f38480a;

    private h() {
    }

    public static synchronized h e() {
        try {
            if (f38480a == null) {
                f38480a = new h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38480a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_fg";
    }

    protected Long d() {
        return 700L;
    }
}
