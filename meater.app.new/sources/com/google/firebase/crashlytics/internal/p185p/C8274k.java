package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* renamed from: com.google.firebase.crashlytics.h.p.k */
/* loaded from: classes2.dex */
final class C8274k extends AbstractC8258f0.e.c {

    /* renamed from: a */
    private final int f31401a;

    /* renamed from: b */
    private final String f31402b;

    /* renamed from: c */
    private final int f31403c;

    /* renamed from: d */
    private final long f31404d;

    /* renamed from: e */
    private final long f31405e;

    /* renamed from: f */
    private final boolean f31406f;

    /* renamed from: g */
    private final int f31407g;

    /* renamed from: h */
    private final String f31408h;

    /* renamed from: i */
    private final String f31409i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.k$b */
    static final class b extends AbstractC8258f0.e.c.a {

        /* renamed from: a */
        private Integer f31410a;

        /* renamed from: b */
        private String f31411b;

        /* renamed from: c */
        private Integer f31412c;

        /* renamed from: d */
        private Long f31413d;

        /* renamed from: e */
        private Long f31414e;

        /* renamed from: f */
        private Boolean f31415f;

        /* renamed from: g */
        private Integer f31416g;

        /* renamed from: h */
        private String f31417h;

        /* renamed from: i */
        private String f31418i;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: a */
        public AbstractC8258f0.e.c mo25739a() {
            Integer num = this.f31410a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " arch";
            }
            if (this.f31411b == null) {
                str = str + " model";
            }
            if (this.f31412c == null) {
                str = str + " cores";
            }
            if (this.f31413d == null) {
                str = str + " ram";
            }
            if (this.f31414e == null) {
                str = str + " diskSpace";
            }
            if (this.f31415f == null) {
                str = str + " simulator";
            }
            if (this.f31416g == null) {
                str = str + " state";
            }
            if (this.f31417h == null) {
                str = str + " manufacturer";
            }
            if (this.f31418i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C8274k(this.f31410a.intValue(), this.f31411b, this.f31412c.intValue(), this.f31413d.longValue(), this.f31414e.longValue(), this.f31415f.booleanValue(), this.f31416g.intValue(), this.f31417h, this.f31418i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: b */
        public AbstractC8258f0.e.c.a mo25740b(int i2) {
            this.f31410a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: c */
        public AbstractC8258f0.e.c.a mo25741c(int i2) {
            this.f31412c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: d */
        public AbstractC8258f0.e.c.a mo25742d(long j2) {
            this.f31414e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: e */
        public AbstractC8258f0.e.c.a mo25743e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f31417h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: f */
        public AbstractC8258f0.e.c.a mo25744f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f31411b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: g */
        public AbstractC8258f0.e.c.a mo25745g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f31418i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: h */
        public AbstractC8258f0.e.c.a mo25746h(long j2) {
            this.f31413d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: i */
        public AbstractC8258f0.e.c.a mo25747i(boolean z) {
            this.f31415f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c.a
        /* renamed from: j */
        public AbstractC8258f0.e.c.a mo25748j(int i2) {
            this.f31416g = Integer.valueOf(i2);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: b */
    public int mo25730b() {
        return this.f31401a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: c */
    public int mo25731c() {
        return this.f31403c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: d */
    public long mo25732d() {
        return this.f31405e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: e */
    public String mo25733e() {
        return this.f31408h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.c)) {
            return false;
        }
        AbstractC8258f0.e.c cVar = (AbstractC8258f0.e.c) obj;
        return this.f31401a == cVar.mo25730b() && this.f31402b.equals(cVar.mo25734f()) && this.f31403c == cVar.mo25731c() && this.f31404d == cVar.mo25736h() && this.f31405e == cVar.mo25732d() && this.f31406f == cVar.mo25738j() && this.f31407g == cVar.mo25737i() && this.f31408h.equals(cVar.mo25733e()) && this.f31409i.equals(cVar.mo25735g());
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: f */
    public String mo25734f() {
        return this.f31402b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: g */
    public String mo25735g() {
        return this.f31409i;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: h */
    public long mo25736h() {
        return this.f31404d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f31401a ^ 1000003) * 1000003) ^ this.f31402b.hashCode()) * 1000003) ^ this.f31403c) * 1000003;
        long j2 = this.f31404d;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f31405e;
        return ((((((((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f31406f ? 1231 : 1237)) * 1000003) ^ this.f31407g) * 1000003) ^ this.f31408h.hashCode()) * 1000003) ^ this.f31409i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: i */
    public int mo25737i() {
        return this.f31407g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.c
    /* renamed from: j */
    public boolean mo25738j() {
        return this.f31406f;
    }

    public String toString() {
        return "Device{arch=" + this.f31401a + ", model=" + this.f31402b + ", cores=" + this.f31403c + ", ram=" + this.f31404d + ", diskSpace=" + this.f31405e + ", simulator=" + this.f31406f + ", state=" + this.f31407g + ", manufacturer=" + this.f31408h + ", modelClass=" + this.f31409i + "}";
    }

    private C8274k(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.f31401a = i2;
        this.f31402b = str;
        this.f31403c = i3;
        this.f31404d = j2;
        this.f31405e = j3;
        this.f31406f = z;
        this.f31407g = i4;
        this.f31408h = str2;
        this.f31409i = str3;
    }
}
