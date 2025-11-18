package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* renamed from: com.google.firebase.crashlytics.h.p.o */
/* loaded from: classes2.dex */
final class C8278o extends AbstractC8258f0.e.d.a.b.AbstractC11502a {

    /* renamed from: a */
    private final long f31455a;

    /* renamed from: b */
    private final long f31456b;

    /* renamed from: c */
    private final String f31457c;

    /* renamed from: d */
    private final String f31458d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.o$b */
    static final class b extends AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a {

        /* renamed from: a */
        private Long f31459a;

        /* renamed from: b */
        private Long f31460b;

        /* renamed from: c */
        private String f31461c;

        /* renamed from: d */
        private String f31462d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a
        /* renamed from: a */
        public AbstractC8258f0.e.d.a.b.AbstractC11502a mo25786a() {
            Long l = this.f31459a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " baseAddress";
            }
            if (this.f31460b == null) {
                str = str + " size";
            }
            if (this.f31461c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C8278o(this.f31459a.longValue(), this.f31460b.longValue(), this.f31461c, this.f31462d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a mo25787b(long j2) {
            this.f31459a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a mo25788c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f31461c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a mo25789d(long j2) {
            this.f31460b = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a
        /* renamed from: e */
        public AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a mo25790e(String str) {
            this.f31462d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a
    /* renamed from: b */
    public long mo25781b() {
        return this.f31455a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a
    /* renamed from: c */
    public String mo25782c() {
        return this.f31457c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a
    /* renamed from: d */
    public long mo25783d() {
        return this.f31456b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11502a
    /* renamed from: e */
    public String mo25784e() {
        return this.f31458d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a.b.AbstractC11502a)) {
            return false;
        }
        AbstractC8258f0.e.d.a.b.AbstractC11502a abstractC11502a = (AbstractC8258f0.e.d.a.b.AbstractC11502a) obj;
        if (this.f31455a == abstractC11502a.mo25781b() && this.f31456b == abstractC11502a.mo25783d() && this.f31457c.equals(abstractC11502a.mo25782c())) {
            String str = this.f31458d;
            if (str == null) {
                if (abstractC11502a.mo25784e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC11502a.mo25784e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f31455a;
        long j3 = this.f31456b;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f31457c.hashCode()) * 1000003;
        String str = this.f31458d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f31455a + ", size=" + this.f31456b + ", name=" + this.f31457c + ", uuid=" + this.f31458d + "}";
    }

    private C8278o(long j2, long j3, String str, String str2) {
        this.f31455a = j2;
        this.f31456b = j3;
        this.f31457c = str;
        this.f31458d = str2;
    }
}
