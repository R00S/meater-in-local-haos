package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* renamed from: com.google.firebase.crashlytics.h.p.q */
/* loaded from: classes2.dex */
final class C8280q extends AbstractC8258f0.e.d.a.b.AbstractC11506d {

    /* renamed from: a */
    private final String f31473a;

    /* renamed from: b */
    private final String f31474b;

    /* renamed from: c */
    private final long f31475c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.q$b */
    static final class b extends AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a {

        /* renamed from: a */
        private String f31476a;

        /* renamed from: b */
        private String f31477b;

        /* renamed from: c */
        private Long f31478c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a
        /* renamed from: a */
        public AbstractC8258f0.e.d.a.b.AbstractC11506d mo25814a() {
            String str = this.f31476a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " name";
            }
            if (this.f31477b == null) {
                str2 = str2 + " code";
            }
            if (this.f31478c == null) {
                str2 = str2 + " address";
            }
            if (str2.isEmpty()) {
                return new C8280q(this.f31476a, this.f31477b, this.f31478c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a mo25815b(long j2) {
            this.f31478c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a mo25816c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f31477b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a mo25817d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f31476a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11506d
    /* renamed from: b */
    public long mo25811b() {
        return this.f31475c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11506d
    /* renamed from: c */
    public String mo25812c() {
        return this.f31474b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11506d
    /* renamed from: d */
    public String mo25813d() {
        return this.f31473a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a.b.AbstractC11506d)) {
            return false;
        }
        AbstractC8258f0.e.d.a.b.AbstractC11506d abstractC11506d = (AbstractC8258f0.e.d.a.b.AbstractC11506d) obj;
        return this.f31473a.equals(abstractC11506d.mo25813d()) && this.f31474b.equals(abstractC11506d.mo25812c()) && this.f31475c == abstractC11506d.mo25811b();
    }

    public int hashCode() {
        int iHashCode = (((this.f31473a.hashCode() ^ 1000003) * 1000003) ^ this.f31474b.hashCode()) * 1000003;
        long j2 = this.f31475c;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f31473a + ", code=" + this.f31474b + ", address=" + this.f31475c + "}";
    }

    private C8280q(String str, String str2, long j2) {
        this.f31473a = str;
        this.f31474b = str2;
        this.f31475c = j2;
    }
}
