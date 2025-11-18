package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import com.google.firebase.sessions.api.SessionSubscriber;

/* compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* renamed from: com.google.firebase.crashlytics.h.n.v */
/* loaded from: classes2.dex */
public class C8230v implements SessionSubscriber {

    /* renamed from: a */
    private final C8201e0 f30983a;

    /* renamed from: b */
    private final C8229u f30984b;

    public C8230v(C8201e0 c8201e0, C8298f c8298f) {
        this.f30983a = c8201e0;
        this.f30984b = new C8229u(c8298f);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    /* renamed from: a */
    public boolean mo25364a() {
        return this.f30983a.m25239d();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    /* renamed from: b */
    public SessionSubscriber.a mo25365b() {
        return SessionSubscriber.a.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    /* renamed from: c */
    public void mo25366c(SessionSubscriber.SessionDetails sessionDetails) {
        C8179h.m25176f().m25177b("App Quality Sessions session changed: " + sessionDetails);
        this.f30984b.m25362f(sessionDetails.getSessionId());
    }

    /* renamed from: d */
    public String m25367d(String str) {
        return this.f30984b.m25361a(str);
    }

    /* renamed from: e */
    public void m25368e(String str) {
        this.f30984b.m25363g(str);
    }
}
