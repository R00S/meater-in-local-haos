package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* renamed from: com.google.firebase.crashlytics.h.p.s */
/* loaded from: classes2.dex */
final class C8282s extends AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b {

    /* renamed from: a */
    private final long f31485a;

    /* renamed from: b */
    private final String f31486b;

    /* renamed from: c */
    private final String f31487c;

    /* renamed from: d */
    private final long f31488d;

    /* renamed from: e */
    private final int f31489e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.s$b */
    static final class b extends AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a {

        /* renamed from: a */
        private Long f31490a;

        /* renamed from: b */
        private String f31491b;

        /* renamed from: c */
        private String f31492c;

        /* renamed from: d */
        private Long f31493d;

        /* renamed from: e */
        private Integer f31494e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a
        /* renamed from: a */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b mo25832a() {
            Long l = this.f31490a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " pc";
            }
            if (this.f31491b == null) {
                str = str + " symbol";
            }
            if (this.f31493d == null) {
                str = str + " offset";
            }
            if (this.f31494e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C8282s(this.f31490a.longValue(), this.f31491b, this.f31492c, this.f31493d.longValue(), this.f31494e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a mo25833b(String str) {
            this.f31492c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a mo25834c(int i2) {
            this.f31494e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a mo25835d(long j2) {
            this.f31493d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a
        /* renamed from: e */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a mo25836e(long j2) {
            this.f31490a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a
        /* renamed from: f */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a mo25837f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f31491b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b
    /* renamed from: b */
    public String mo25827b() {
        return this.f31487c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b
    /* renamed from: c */
    public int mo25828c() {
        return this.f31489e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b
    /* renamed from: d */
    public long mo25829d() {
        return this.f31488d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b
    /* renamed from: e */
    public long mo25830e() {
        return this.f31485a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b)) {
            return false;
        }
        AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b abstractC11510b = (AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b) obj;
        return this.f31485a == abstractC11510b.mo25830e() && this.f31486b.equals(abstractC11510b.mo25831f()) && ((str = this.f31487c) != null ? str.equals(abstractC11510b.mo25827b()) : abstractC11510b.mo25827b() == null) && this.f31488d == abstractC11510b.mo25829d() && this.f31489e == abstractC11510b.mo25828c();
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b
    /* renamed from: f */
    public String mo25831f() {
        return this.f31486b;
    }

    public int hashCode() {
        long j2 = this.f31485a;
        int iHashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f31486b.hashCode()) * 1000003;
        String str = this.f31487c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f31488d;
        return this.f31489e ^ ((iHashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f31485a + ", symbol=" + this.f31486b + ", file=" + this.f31487c + ", offset=" + this.f31488d + ", importance=" + this.f31489e + "}";
    }

    private C8282s(long j2, String str, String str2, long j3, int i2) {
        this.f31485a = j2;
        this.f31486b = str;
        this.f31487c = str2;
        this.f31488d = j3;
        this.f31489e = i2;
    }
}
