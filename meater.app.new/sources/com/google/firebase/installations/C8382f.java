package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC8388l;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* renamed from: com.google.firebase.installations.f */
/* loaded from: classes2.dex */
final class C8382f extends AbstractC8388l {

    /* renamed from: a */
    private final String f31785a;

    /* renamed from: b */
    private final long f31786b;

    /* renamed from: c */
    private final long f31787c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* renamed from: com.google.firebase.installations.f$b */
    static final class b extends AbstractC8388l.a {

        /* renamed from: a */
        private String f31788a;

        /* renamed from: b */
        private Long f31789b;

        /* renamed from: c */
        private Long f31790c;

        b() {
        }

        @Override // com.google.firebase.installations.AbstractC8388l.a
        /* renamed from: a */
        public AbstractC8388l mo26248a() {
            String str = this.f31788a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " token";
            }
            if (this.f31789b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f31790c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new C8382f(this.f31788a, this.f31789b.longValue(), this.f31790c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.installations.AbstractC8388l.a
        /* renamed from: b */
        public AbstractC8388l.a mo26249b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f31788a = str;
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC8388l.a
        /* renamed from: c */
        public AbstractC8388l.a mo26250c(long j2) {
            this.f31790c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC8388l.a
        /* renamed from: d */
        public AbstractC8388l.a mo26251d(long j2) {
            this.f31789b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC8388l
    /* renamed from: b */
    public String mo26245b() {
        return this.f31785a;
    }

    @Override // com.google.firebase.installations.AbstractC8388l
    /* renamed from: c */
    public long mo26246c() {
        return this.f31787c;
    }

    @Override // com.google.firebase.installations.AbstractC8388l
    /* renamed from: d */
    public long mo26247d() {
        return this.f31786b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8388l)) {
            return false;
        }
        AbstractC8388l abstractC8388l = (AbstractC8388l) obj;
        return this.f31785a.equals(abstractC8388l.mo26245b()) && this.f31786b == abstractC8388l.mo26247d() && this.f31787c == abstractC8388l.mo26246c();
    }

    public int hashCode() {
        int iHashCode = (this.f31785a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f31786b;
        long j3 = this.f31787c;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f31785a + ", tokenExpirationTimestamp=" + this.f31786b + ", tokenCreationTimestamp=" + this.f31787c + "}";
    }

    private C8382f(String str, long j2, long j3) {
        this.f31785a = str;
        this.f31786b = j2;
        this.f31787c = j3;
    }
}
