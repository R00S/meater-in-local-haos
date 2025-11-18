package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f38177a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38178b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38179c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f38180a;

        /* renamed from: b, reason: collision with root package name */
        private Long f38181b;

        /* renamed from: c, reason: collision with root package name */
        private Long f38182c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f38180a == null) {
                str = " token";
            }
            if (this.f38181b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f38182c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f38180a, this.f38181b.longValue(), this.f38182c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f38180a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j10) {
            this.f38182c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j10) {
            this.f38181b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f38177a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f38179c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f38178b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f38177a.equals(fVar.b()) && this.f38178b == fVar.d() && this.f38179c == fVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f38177a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f38178b;
        long j11 = this.f38179c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f38177a + ", tokenExpirationTimestamp=" + this.f38178b + ", tokenCreationTimestamp=" + this.f38179c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f38177a = str;
        this.f38178b = j10;
        this.f38179c = j11;
    }
}
