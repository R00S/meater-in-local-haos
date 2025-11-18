package com.google.firebase.installations.p197q;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.p197q.C8393a;
import com.google.firebase.installations.p197q.C8395c;

/* compiled from: PersistedInstallationEntry.java */
@AutoValue
/* renamed from: com.google.firebase.installations.q.d */
/* loaded from: classes2.dex */
public abstract class AbstractC8396d {

    /* renamed from: a */
    public static AbstractC8396d f31844a = m26328a().mo26307a();

    /* compiled from: PersistedInstallationEntry.java */
    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.q.d$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC8396d mo26307a();

        /* renamed from: b */
        public abstract a mo26308b(String str);

        /* renamed from: c */
        public abstract a mo26309c(long j2);

        /* renamed from: d */
        public abstract a mo26310d(String str);

        /* renamed from: e */
        public abstract a mo26311e(String str);

        /* renamed from: f */
        public abstract a mo26312f(String str);

        /* renamed from: g */
        public abstract a mo26313g(C8395c.a aVar);

        /* renamed from: h */
        public abstract a mo26314h(long j2);
    }

    /* renamed from: a */
    public static a m26328a() {
        return new C8393a.b().mo26314h(0L).mo26313g(C8395c.a.ATTEMPT_MIGRATION).mo26309c(0L);
    }

    /* renamed from: b */
    public abstract String mo26299b();

    /* renamed from: c */
    public abstract long mo26300c();

    /* renamed from: d */
    public abstract String mo26301d();

    /* renamed from: e */
    public abstract String mo26302e();

    /* renamed from: f */
    public abstract String mo26303f();

    /* renamed from: g */
    public abstract C8395c.a mo26304g();

    /* renamed from: h */
    public abstract long mo26305h();

    /* renamed from: i */
    public boolean m26329i() {
        return mo26304g() == C8395c.a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m26330j() {
        return mo26304g() == C8395c.a.NOT_GENERATED || mo26304g() == C8395c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m26331k() {
        return mo26304g() == C8395c.a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m26332l() {
        return mo26304g() == C8395c.a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m26333m() {
        return mo26304g() == C8395c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract a mo26306n();

    /* renamed from: o */
    public AbstractC8396d m26334o(String str, long j2, long j3) {
        return mo26306n().mo26308b(str).mo26309c(j2).mo26314h(j3).mo26307a();
    }

    /* renamed from: p */
    public AbstractC8396d m26335p() {
        return mo26306n().mo26308b(null).mo26307a();
    }

    /* renamed from: q */
    public AbstractC8396d m26336q(String str) {
        return mo26306n().mo26311e(str).mo26313g(C8395c.a.REGISTER_ERROR).mo26307a();
    }

    /* renamed from: r */
    public AbstractC8396d m26337r() {
        return mo26306n().mo26313g(C8395c.a.NOT_GENERATED).mo26307a();
    }

    /* renamed from: s */
    public AbstractC8396d m26338s(String str, String str2, long j2, String str3, long j3) {
        return mo26306n().mo26310d(str).mo26313g(C8395c.a.REGISTERED).mo26308b(str3).mo26312f(str2).mo26309c(j3).mo26314h(j2).mo26307a();
    }

    /* renamed from: t */
    public AbstractC8396d m26339t(String str) {
        return mo26306n().mo26310d(str).mo26313g(C8395c.a.UNREGISTERED).mo26307a();
    }
}
