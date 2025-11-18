package com.google.firebase.installations.p197q;

import com.google.firebase.installations.p197q.AbstractC8396d;
import com.google.firebase.installations.p197q.C8395c;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* renamed from: com.google.firebase.installations.q.a */
/* loaded from: classes2.dex */
final class C8393a extends AbstractC8396d {

    /* renamed from: b */
    private final String f31819b;

    /* renamed from: c */
    private final C8395c.a f31820c;

    /* renamed from: d */
    private final String f31821d;

    /* renamed from: e */
    private final String f31822e;

    /* renamed from: f */
    private final long f31823f;

    /* renamed from: g */
    private final long f31824g;

    /* renamed from: h */
    private final String f31825h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: com.google.firebase.installations.q.a$b */
    static final class b extends AbstractC8396d.a {

        /* renamed from: a */
        private String f31826a;

        /* renamed from: b */
        private C8395c.a f31827b;

        /* renamed from: c */
        private String f31828c;

        /* renamed from: d */
        private String f31829d;

        /* renamed from: e */
        private Long f31830e;

        /* renamed from: f */
        private Long f31831f;

        /* renamed from: g */
        private String f31832g;

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: a */
        public AbstractC8396d mo26307a() {
            C8395c.a aVar = this.f31827b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (aVar == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " registrationStatus";
            }
            if (this.f31830e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f31831f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C8393a(this.f31826a, this.f31827b, this.f31828c, this.f31829d, this.f31830e.longValue(), this.f31831f.longValue(), this.f31832g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: b */
        public AbstractC8396d.a mo26308b(String str) {
            this.f31828c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: c */
        public AbstractC8396d.a mo26309c(long j2) {
            this.f31830e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: d */
        public AbstractC8396d.a mo26310d(String str) {
            this.f31826a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: e */
        public AbstractC8396d.a mo26311e(String str) {
            this.f31832g = str;
            return this;
        }

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: f */
        public AbstractC8396d.a mo26312f(String str) {
            this.f31829d = str;
            return this;
        }

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: g */
        public AbstractC8396d.a mo26313g(C8395c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f31827b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.p197q.AbstractC8396d.a
        /* renamed from: h */
        public AbstractC8396d.a mo26314h(long j2) {
            this.f31831f = Long.valueOf(j2);
            return this;
        }

        b() {
        }

        private b(AbstractC8396d abstractC8396d) {
            this.f31826a = abstractC8396d.mo26301d();
            this.f31827b = abstractC8396d.mo26304g();
            this.f31828c = abstractC8396d.mo26299b();
            this.f31829d = abstractC8396d.mo26303f();
            this.f31830e = Long.valueOf(abstractC8396d.mo26300c());
            this.f31831f = Long.valueOf(abstractC8396d.mo26305h());
            this.f31832g = abstractC8396d.mo26302e();
        }
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: b */
    public String mo26299b() {
        return this.f31821d;
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: c */
    public long mo26300c() {
        return this.f31823f;
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: d */
    public String mo26301d() {
        return this.f31819b;
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: e */
    public String mo26302e() {
        return this.f31825h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8396d)) {
            return false;
        }
        AbstractC8396d abstractC8396d = (AbstractC8396d) obj;
        String str3 = this.f31819b;
        if (str3 != null ? str3.equals(abstractC8396d.mo26301d()) : abstractC8396d.mo26301d() == null) {
            if (this.f31820c.equals(abstractC8396d.mo26304g()) && ((str = this.f31821d) != null ? str.equals(abstractC8396d.mo26299b()) : abstractC8396d.mo26299b() == null) && ((str2 = this.f31822e) != null ? str2.equals(abstractC8396d.mo26303f()) : abstractC8396d.mo26303f() == null) && this.f31823f == abstractC8396d.mo26300c() && this.f31824g == abstractC8396d.mo26305h()) {
                String str4 = this.f31825h;
                if (str4 == null) {
                    if (abstractC8396d.mo26302e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC8396d.mo26302e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: f */
    public String mo26303f() {
        return this.f31822e;
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: g */
    public C8395c.a mo26304g() {
        return this.f31820c;
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: h */
    public long mo26305h() {
        return this.f31824g;
    }

    public int hashCode() {
        String str = this.f31819b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f31820c.hashCode()) * 1000003;
        String str2 = this.f31821d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f31822e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.f31823f;
        int i2 = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f31824g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f31825h;
        return i3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.p197q.AbstractC8396d
    /* renamed from: n */
    public AbstractC8396d.a mo26306n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f31819b + ", registrationStatus=" + this.f31820c + ", authToken=" + this.f31821d + ", refreshToken=" + this.f31822e + ", expiresInSecs=" + this.f31823f + ", tokenCreationEpochInSecs=" + this.f31824g + ", fisError=" + this.f31825h + "}";
    }

    private C8393a(String str, C8395c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.f31819b = str;
        this.f31820c = aVar;
        this.f31821d = str2;
        this.f31822e = str3;
        this.f31823f = j2;
        this.f31824g = j3;
        this.f31825h = str4;
    }
}
