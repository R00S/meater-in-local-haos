package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* renamed from: com.google.firebase.crashlytics.h.p.h */
/* loaded from: classes2.dex */
final class C8261h extends AbstractC8258f0.e {

    /* renamed from: a */
    private final String f31352a;

    /* renamed from: b */
    private final String f31353b;

    /* renamed from: c */
    private final String f31354c;

    /* renamed from: d */
    private final long f31355d;

    /* renamed from: e */
    private final Long f31356e;

    /* renamed from: f */
    private final boolean f31357f;

    /* renamed from: g */
    private final AbstractC8258f0.e.a f31358g;

    /* renamed from: h */
    private final AbstractC8258f0.e.f f31359h;

    /* renamed from: i */
    private final AbstractC8258f0.e.AbstractC11515e f31360i;

    /* renamed from: j */
    private final AbstractC8258f0.e.c f31361j;

    /* renamed from: k */
    private final List<AbstractC8258f0.e.d> f31362k;

    /* renamed from: l */
    private final int f31363l;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.h$b */
    static final class b extends AbstractC8258f0.e.b {

        /* renamed from: a */
        private String f31364a;

        /* renamed from: b */
        private String f31365b;

        /* renamed from: c */
        private String f31366c;

        /* renamed from: d */
        private Long f31367d;

        /* renamed from: e */
        private Long f31368e;

        /* renamed from: f */
        private Boolean f31369f;

        /* renamed from: g */
        private AbstractC8258f0.e.a f31370g;

        /* renamed from: h */
        private AbstractC8258f0.e.f f31371h;

        /* renamed from: i */
        private AbstractC8258f0.e.AbstractC11515e f31372i;

        /* renamed from: j */
        private AbstractC8258f0.e.c f31373j;

        /* renamed from: k */
        private List<AbstractC8258f0.e.d> f31374k;

        /* renamed from: l */
        private Integer f31375l;

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: a */
        public AbstractC8258f0.e mo25715a() {
            String str = this.f31364a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " generator";
            }
            if (this.f31365b == null) {
                str2 = str2 + " identifier";
            }
            if (this.f31367d == null) {
                str2 = str2 + " startedAt";
            }
            if (this.f31369f == null) {
                str2 = str2 + " crashed";
            }
            if (this.f31370g == null) {
                str2 = str2 + " app";
            }
            if (this.f31375l == null) {
                str2 = str2 + " generatorType";
            }
            if (str2.isEmpty()) {
                return new C8261h(this.f31364a, this.f31365b, this.f31366c, this.f31367d.longValue(), this.f31368e, this.f31369f.booleanValue(), this.f31370g, this.f31371h, this.f31372i, this.f31373j, this.f31374k, this.f31375l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: b */
        public AbstractC8258f0.e.b mo25716b(AbstractC8258f0.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f31370g = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: c */
        public AbstractC8258f0.e.b mo25717c(String str) {
            this.f31366c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: d */
        public AbstractC8258f0.e.b mo25718d(boolean z) {
            this.f31369f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: e */
        public AbstractC8258f0.e.b mo25719e(AbstractC8258f0.e.c cVar) {
            this.f31373j = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: f */
        public AbstractC8258f0.e.b mo25720f(Long l) {
            this.f31368e = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: g */
        public AbstractC8258f0.e.b mo25721g(List<AbstractC8258f0.e.d> list) {
            this.f31374k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: h */
        public AbstractC8258f0.e.b mo25722h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f31364a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: i */
        public AbstractC8258f0.e.b mo25723i(int i2) {
            this.f31375l = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: j */
        public AbstractC8258f0.e.b mo25724j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f31365b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: l */
        public AbstractC8258f0.e.b mo25726l(AbstractC8258f0.e.AbstractC11515e abstractC11515e) {
            this.f31372i = abstractC11515e;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: m */
        public AbstractC8258f0.e.b mo25727m(long j2) {
            this.f31367d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.b
        /* renamed from: n */
        public AbstractC8258f0.e.b mo25728n(AbstractC8258f0.e.f fVar) {
            this.f31371h = fVar;
            return this;
        }

        b() {
        }

        private b(AbstractC8258f0.e eVar) {
            this.f31364a = eVar.mo25687g();
            this.f31365b = eVar.mo25689i();
            this.f31366c = eVar.mo25683c();
            this.f31367d = Long.valueOf(eVar.mo25692l());
            this.f31368e = eVar.mo25685e();
            this.f31369f = Boolean.valueOf(eVar.mo25694n());
            this.f31370g = eVar.mo25682b();
            this.f31371h = eVar.mo25693m();
            this.f31372i = eVar.mo25691k();
            this.f31373j = eVar.mo25684d();
            this.f31374k = eVar.mo25686f();
            this.f31375l = Integer.valueOf(eVar.mo25688h());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: b */
    public AbstractC8258f0.e.a mo25682b() {
        return this.f31358g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: c */
    public String mo25683c() {
        return this.f31354c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: d */
    public AbstractC8258f0.e.c mo25684d() {
        return this.f31361j;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: e */
    public Long mo25685e() {
        return this.f31356e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        AbstractC8258f0.e.f fVar;
        AbstractC8258f0.e.AbstractC11515e abstractC11515e;
        AbstractC8258f0.e.c cVar;
        List<AbstractC8258f0.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e)) {
            return false;
        }
        AbstractC8258f0.e eVar = (AbstractC8258f0.e) obj;
        return this.f31352a.equals(eVar.mo25687g()) && this.f31353b.equals(eVar.mo25689i()) && ((str = this.f31354c) != null ? str.equals(eVar.mo25683c()) : eVar.mo25683c() == null) && this.f31355d == eVar.mo25692l() && ((l = this.f31356e) != null ? l.equals(eVar.mo25685e()) : eVar.mo25685e() == null) && this.f31357f == eVar.mo25694n() && this.f31358g.equals(eVar.mo25682b()) && ((fVar = this.f31359h) != null ? fVar.equals(eVar.mo25693m()) : eVar.mo25693m() == null) && ((abstractC11515e = this.f31360i) != null ? abstractC11515e.equals(eVar.mo25691k()) : eVar.mo25691k() == null) && ((cVar = this.f31361j) != null ? cVar.equals(eVar.mo25684d()) : eVar.mo25684d() == null) && ((list = this.f31362k) != null ? list.equals(eVar.mo25686f()) : eVar.mo25686f() == null) && this.f31363l == eVar.mo25688h();
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: f */
    public List<AbstractC8258f0.e.d> mo25686f() {
        return this.f31362k;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: g */
    public String mo25687g() {
        return this.f31352a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: h */
    public int mo25688h() {
        return this.f31363l;
    }

    public int hashCode() {
        int iHashCode = (((this.f31352a.hashCode() ^ 1000003) * 1000003) ^ this.f31353b.hashCode()) * 1000003;
        String str = this.f31354c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f31355d;
        int i2 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.f31356e;
        int iHashCode3 = (((((i2 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f31357f ? 1231 : 1237)) * 1000003) ^ this.f31358g.hashCode()) * 1000003;
        AbstractC8258f0.e.f fVar = this.f31359h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC8258f0.e.AbstractC11515e abstractC11515e = this.f31360i;
        int iHashCode5 = (iHashCode4 ^ (abstractC11515e == null ? 0 : abstractC11515e.hashCode())) * 1000003;
        AbstractC8258f0.e.c cVar = this.f31361j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC8258f0.e.d> list = this.f31362k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f31363l;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: i */
    public String mo25689i() {
        return this.f31353b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: k */
    public AbstractC8258f0.e.AbstractC11515e mo25691k() {
        return this.f31360i;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: l */
    public long mo25692l() {
        return this.f31355d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: m */
    public AbstractC8258f0.e.f mo25693m() {
        return this.f31359h;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: n */
    public boolean mo25694n() {
        return this.f31357f;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e
    /* renamed from: o */
    public AbstractC8258f0.e.b mo25695o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f31352a + ", identifier=" + this.f31353b + ", appQualitySessionId=" + this.f31354c + ", startedAt=" + this.f31355d + ", endedAt=" + this.f31356e + ", crashed=" + this.f31357f + ", app=" + this.f31358g + ", user=" + this.f31359h + ", os=" + this.f31360i + ", device=" + this.f31361j + ", events=" + this.f31362k + ", generatorType=" + this.f31363l + "}";
    }

    private C8261h(String str, String str2, String str3, long j2, Long l, boolean z, AbstractC8258f0.e.a aVar, AbstractC8258f0.e.f fVar, AbstractC8258f0.e.AbstractC11515e abstractC11515e, AbstractC8258f0.e.c cVar, List<AbstractC8258f0.e.d> list, int i2) {
        this.f31352a = str;
        this.f31353b = str2;
        this.f31354c = str3;
        this.f31355d = j2;
        this.f31356e = l;
        this.f31357f = z;
        this.f31358g = aVar;
        this.f31359h = fVar;
        this.f31360i = abstractC11515e;
        this.f31361j = cVar;
        this.f31362k = list;
        this.f31363l = i2;
    }
}
