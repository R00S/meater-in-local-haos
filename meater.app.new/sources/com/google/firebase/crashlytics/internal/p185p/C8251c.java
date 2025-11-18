package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* renamed from: com.google.firebase.crashlytics.h.p.c */
/* loaded from: classes2.dex */
final class C8251c extends AbstractC8258f0.a {

    /* renamed from: a */
    private final int f31297a;

    /* renamed from: b */
    private final String f31298b;

    /* renamed from: c */
    private final int f31299c;

    /* renamed from: d */
    private final int f31300d;

    /* renamed from: e */
    private final long f31301e;

    /* renamed from: f */
    private final long f31302f;

    /* renamed from: g */
    private final long f31303g;

    /* renamed from: h */
    private final String f31304h;

    /* renamed from: i */
    private final List<AbstractC8258f0.a.AbstractC11498a> f31305i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.c$b */
    static final class b extends AbstractC8258f0.a.b {

        /* renamed from: a */
        private Integer f31306a;

        /* renamed from: b */
        private String f31307b;

        /* renamed from: c */
        private Integer f31308c;

        /* renamed from: d */
        private Integer f31309d;

        /* renamed from: e */
        private Long f31310e;

        /* renamed from: f */
        private Long f31311f;

        /* renamed from: g */
        private Long f31312g;

        /* renamed from: h */
        private String f31313h;

        /* renamed from: i */
        private List<AbstractC8258f0.a.AbstractC11498a> f31314i;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: a */
        public AbstractC8258f0.a mo25618a() {
            Integer num = this.f31306a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " pid";
            }
            if (this.f31307b == null) {
                str = str + " processName";
            }
            if (this.f31308c == null) {
                str = str + " reasonCode";
            }
            if (this.f31309d == null) {
                str = str + " importance";
            }
            if (this.f31310e == null) {
                str = str + " pss";
            }
            if (this.f31311f == null) {
                str = str + " rss";
            }
            if (this.f31312g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C8251c(this.f31306a.intValue(), this.f31307b, this.f31308c.intValue(), this.f31309d.intValue(), this.f31310e.longValue(), this.f31311f.longValue(), this.f31312g.longValue(), this.f31313h, this.f31314i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: b */
        public AbstractC8258f0.a.b mo25619b(List<AbstractC8258f0.a.AbstractC11498a> list) {
            this.f31314i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: c */
        public AbstractC8258f0.a.b mo25620c(int i2) {
            this.f31309d = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: d */
        public AbstractC8258f0.a.b mo25621d(int i2) {
            this.f31306a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: e */
        public AbstractC8258f0.a.b mo25622e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f31307b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: f */
        public AbstractC8258f0.a.b mo25623f(long j2) {
            this.f31310e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: g */
        public AbstractC8258f0.a.b mo25624g(int i2) {
            this.f31308c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: h */
        public AbstractC8258f0.a.b mo25625h(long j2) {
            this.f31311f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: i */
        public AbstractC8258f0.a.b mo25626i(long j2) {
            this.f31312g = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a.b
        /* renamed from: j */
        public AbstractC8258f0.a.b mo25627j(String str) {
            this.f31313h = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: b */
    public List<AbstractC8258f0.a.AbstractC11498a> mo25609b() {
        return this.f31305i;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: c */
    public int mo25610c() {
        return this.f31300d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: d */
    public int mo25611d() {
        return this.f31297a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: e */
    public String mo25612e() {
        return this.f31298b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.a)) {
            return false;
        }
        AbstractC8258f0.a aVar = (AbstractC8258f0.a) obj;
        if (this.f31297a == aVar.mo25611d() && this.f31298b.equals(aVar.mo25612e()) && this.f31299c == aVar.mo25614g() && this.f31300d == aVar.mo25610c() && this.f31301e == aVar.mo25613f() && this.f31302f == aVar.mo25615h() && this.f31303g == aVar.mo25616i() && ((str = this.f31304h) != null ? str.equals(aVar.mo25617j()) : aVar.mo25617j() == null)) {
            List<AbstractC8258f0.a.AbstractC11498a> list = this.f31305i;
            if (list == null) {
                if (aVar.mo25609b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.mo25609b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: f */
    public long mo25613f() {
        return this.f31301e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: g */
    public int mo25614g() {
        return this.f31299c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: h */
    public long mo25615h() {
        return this.f31302f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f31297a ^ 1000003) * 1000003) ^ this.f31298b.hashCode()) * 1000003) ^ this.f31299c) * 1000003) ^ this.f31300d) * 1000003;
        long j2 = this.f31301e;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f31302f;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f31303g;
        int i4 = (i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str = this.f31304h;
        int iHashCode2 = (i4 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC8258f0.a.AbstractC11498a> list = this.f31305i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: i */
    public long mo25616i() {
        return this.f31303g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.a
    /* renamed from: j */
    public String mo25617j() {
        return this.f31304h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f31297a + ", processName=" + this.f31298b + ", reasonCode=" + this.f31299c + ", importance=" + this.f31300d + ", pss=" + this.f31301e + ", rss=" + this.f31302f + ", timestamp=" + this.f31303g + ", traceFile=" + this.f31304h + ", buildIdMappingForArch=" + this.f31305i + "}";
    }

    private C8251c(int i2, String str, int i3, int i4, long j2, long j3, long j4, String str2, List<AbstractC8258f0.a.AbstractC11498a> list) {
        this.f31297a = i2;
        this.f31298b = str;
        this.f31299c = i3;
        this.f31300d = i4;
        this.f31301e = j2;
        this.f31302f = j3;
        this.f31303g = j4;
        this.f31304h = str2;
        this.f31305i = list;
    }
}
