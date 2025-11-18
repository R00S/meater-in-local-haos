package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* renamed from: com.google.firebase.crashlytics.h.p.i */
/* loaded from: classes2.dex */
final class C8272i extends AbstractC8258f0.e.a {

    /* renamed from: a */
    private final String f31386a;

    /* renamed from: b */
    private final String f31387b;

    /* renamed from: c */
    private final String f31388c;

    /* renamed from: d */
    private final AbstractC8258f0.e.a.b f31389d;

    /* renamed from: e */
    private final String f31390e;

    /* renamed from: f */
    private final String f31391f;

    /* renamed from: g */
    private final String f31392g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.i$b */
    static final class b extends AbstractC8258f0.e.a.AbstractC11500a {

        /* renamed from: a */
        private String f31393a;

        /* renamed from: b */
        private String f31394b;

        /* renamed from: c */
        private String f31395c;

        /* renamed from: d */
        private AbstractC8258f0.e.a.b f31396d;

        /* renamed from: e */
        private String f31397e;

        /* renamed from: f */
        private String f31398f;

        /* renamed from: g */
        private String f31399g;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.AbstractC11500a
        /* renamed from: a */
        public AbstractC8258f0.e.a mo25707a() {
            String str = this.f31393a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " identifier";
            }
            if (this.f31394b == null) {
                str2 = str2 + " version";
            }
            if (str2.isEmpty()) {
                return new C8272i(this.f31393a, this.f31394b, this.f31395c, this.f31396d, this.f31397e, this.f31398f, this.f31399g);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.AbstractC11500a
        /* renamed from: b */
        public AbstractC8258f0.e.a.AbstractC11500a mo25708b(String str) {
            this.f31398f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.AbstractC11500a
        /* renamed from: c */
        public AbstractC8258f0.e.a.AbstractC11500a mo25709c(String str) {
            this.f31399g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.AbstractC11500a
        /* renamed from: d */
        public AbstractC8258f0.e.a.AbstractC11500a mo25710d(String str) {
            this.f31395c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.AbstractC11500a
        /* renamed from: e */
        public AbstractC8258f0.e.a.AbstractC11500a mo25711e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f31393a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.AbstractC11500a
        /* renamed from: f */
        public AbstractC8258f0.e.a.AbstractC11500a mo25712f(String str) {
            this.f31397e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.AbstractC11500a
        /* renamed from: g */
        public AbstractC8258f0.e.a.AbstractC11500a mo25713g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f31394b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a
    /* renamed from: b */
    public String mo25700b() {
        return this.f31391f;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a
    /* renamed from: c */
    public String mo25701c() {
        return this.f31392g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a
    /* renamed from: d */
    public String mo25702d() {
        return this.f31388c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a
    /* renamed from: e */
    public String mo25703e() {
        return this.f31386a;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC8258f0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.a)) {
            return false;
        }
        AbstractC8258f0.e.a aVar = (AbstractC8258f0.e.a) obj;
        if (this.f31386a.equals(aVar.mo25703e()) && this.f31387b.equals(aVar.mo25706h()) && ((str = this.f31388c) != null ? str.equals(aVar.mo25702d()) : aVar.mo25702d() == null) && ((bVar = this.f31389d) != null ? bVar.equals(aVar.mo25705g()) : aVar.mo25705g() == null) && ((str2 = this.f31390e) != null ? str2.equals(aVar.mo25704f()) : aVar.mo25704f() == null) && ((str3 = this.f31391f) != null ? str3.equals(aVar.mo25700b()) : aVar.mo25700b() == null)) {
            String str4 = this.f31392g;
            if (str4 == null) {
                if (aVar.mo25701c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.mo25701c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a
    /* renamed from: f */
    public String mo25704f() {
        return this.f31390e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a
    /* renamed from: g */
    public AbstractC8258f0.e.a.b mo25705g() {
        return this.f31389d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a
    /* renamed from: h */
    public String mo25706h() {
        return this.f31387b;
    }

    public int hashCode() {
        int iHashCode = (((this.f31386a.hashCode() ^ 1000003) * 1000003) ^ this.f31387b.hashCode()) * 1000003;
        String str = this.f31388c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC8258f0.e.a.b bVar = this.f31389d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f31390e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f31391f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f31392g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f31386a + ", version=" + this.f31387b + ", displayVersion=" + this.f31388c + ", organization=" + this.f31389d + ", installationUuid=" + this.f31390e + ", developmentPlatform=" + this.f31391f + ", developmentPlatformVersion=" + this.f31392g + "}";
    }

    private C8272i(String str, String str2, String str3, AbstractC8258f0.e.a.b bVar, String str4, String str5, String str6) {
        this.f31386a = str;
        this.f31387b = str2;
        this.f31388c = str3;
        this.f31389d = bVar;
        this.f31390e = str4;
        this.f31391f = str5;
        this.f31392g = str6;
    }
}
