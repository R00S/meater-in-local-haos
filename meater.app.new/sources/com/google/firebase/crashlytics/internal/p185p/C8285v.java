package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* renamed from: com.google.firebase.crashlytics.h.p.v */
/* loaded from: classes2.dex */
final class C8285v extends AbstractC8258f0.e.d.AbstractC11513d {

    /* renamed from: a */
    private final String f31515a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.v$b */
    static final class b extends AbstractC8258f0.e.d.AbstractC11513d.a {

        /* renamed from: a */
        private String f31516a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11513d.a
        /* renamed from: a */
        public AbstractC8258f0.e.d.AbstractC11513d mo25871a() {
            String str = this.f31516a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " content";
            }
            if (str2.isEmpty()) {
                return new C8285v(this.f31516a);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11513d.a
        /* renamed from: b */
        public AbstractC8258f0.e.d.AbstractC11513d.a mo25872b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f31516a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11513d
    /* renamed from: b */
    public String mo25870b() {
        return this.f31515a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8258f0.e.d.AbstractC11513d) {
            return this.f31515a.equals(((AbstractC8258f0.e.d.AbstractC11513d) obj).mo25870b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31515a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f31515a + "}";
    }

    private C8285v(String str) {
        this.f31515a = str;
    }
}
