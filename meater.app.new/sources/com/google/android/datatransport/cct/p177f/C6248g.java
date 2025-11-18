package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.AbstractC6254m;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_LogRequest.java */
/* renamed from: com.google.android.datatransport.cct.f.g */
/* loaded from: classes2.dex */
final class C6248g extends AbstractC6254m {

    /* renamed from: a */
    private final long f16681a;

    /* renamed from: b */
    private final long f16682b;

    /* renamed from: c */
    private final AbstractC6252k f16683c;

    /* renamed from: d */
    private final Integer f16684d;

    /* renamed from: e */
    private final String f16685e;

    /* renamed from: f */
    private final List<AbstractC6253l> f16686f;

    /* renamed from: g */
    private final EnumC6257p f16687g;

    /* compiled from: AutoValue_LogRequest.java */
    /* renamed from: com.google.android.datatransport.cct.f.g$b */
    static final class b extends AbstractC6254m.a {

        /* renamed from: a */
        private Long f16688a;

        /* renamed from: b */
        private Long f16689b;

        /* renamed from: c */
        private AbstractC6252k f16690c;

        /* renamed from: d */
        private Integer f16691d;

        /* renamed from: e */
        private String f16692e;

        /* renamed from: f */
        private List<AbstractC6253l> f16693f;

        /* renamed from: g */
        private EnumC6257p f16694g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: a */
        public AbstractC6254m mo13479a() {
            Long l = this.f16688a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " requestTimeMs";
            }
            if (this.f16689b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C6248g(this.f16688a.longValue(), this.f16689b.longValue(), this.f16690c, this.f16691d, this.f16692e, this.f16693f, this.f16694g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: b */
        public AbstractC6254m.a mo13480b(AbstractC6252k abstractC6252k) {
            this.f16690c = abstractC6252k;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: c */
        public AbstractC6254m.a mo13481c(List<AbstractC6253l> list) {
            this.f16693f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: d */
        AbstractC6254m.a mo13482d(Integer num) {
            this.f16691d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: e */
        AbstractC6254m.a mo13483e(String str) {
            this.f16692e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: f */
        public AbstractC6254m.a mo13484f(EnumC6257p enumC6257p) {
            this.f16694g = enumC6257p;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: g */
        public AbstractC6254m.a mo13485g(long j2) {
            this.f16688a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m.a
        /* renamed from: h */
        public AbstractC6254m.a mo13486h(long j2) {
            this.f16689b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m
    /* renamed from: b */
    public AbstractC6252k mo13472b() {
        return this.f16683c;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m
    /* renamed from: c */
    public List<AbstractC6253l> mo13473c() {
        return this.f16686f;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m
    /* renamed from: d */
    public Integer mo13474d() {
        return this.f16684d;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m
    /* renamed from: e */
    public String mo13475e() {
        return this.f16685e;
    }

    public boolean equals(Object obj) {
        AbstractC6252k abstractC6252k;
        Integer num;
        String str;
        List<AbstractC6253l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6254m)) {
            return false;
        }
        AbstractC6254m abstractC6254m = (AbstractC6254m) obj;
        if (this.f16681a == abstractC6254m.mo13477g() && this.f16682b == abstractC6254m.mo13478h() && ((abstractC6252k = this.f16683c) != null ? abstractC6252k.equals(abstractC6254m.mo13472b()) : abstractC6254m.mo13472b() == null) && ((num = this.f16684d) != null ? num.equals(abstractC6254m.mo13474d()) : abstractC6254m.mo13474d() == null) && ((str = this.f16685e) != null ? str.equals(abstractC6254m.mo13475e()) : abstractC6254m.mo13475e() == null) && ((list = this.f16686f) != null ? list.equals(abstractC6254m.mo13473c()) : abstractC6254m.mo13473c() == null)) {
            EnumC6257p enumC6257p = this.f16687g;
            if (enumC6257p == null) {
                if (abstractC6254m.mo13476f() == null) {
                    return true;
                }
            } else if (enumC6257p.equals(abstractC6254m.mo13476f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m
    /* renamed from: f */
    public EnumC6257p mo13476f() {
        return this.f16687g;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m
    /* renamed from: g */
    public long mo13477g() {
        return this.f16681a;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6254m
    /* renamed from: h */
    public long mo13478h() {
        return this.f16682b;
    }

    public int hashCode() {
        long j2 = this.f16681a;
        long j3 = this.f16682b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC6252k abstractC6252k = this.f16683c;
        int iHashCode = (i2 ^ (abstractC6252k == null ? 0 : abstractC6252k.hashCode())) * 1000003;
        Integer num = this.f16684d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f16685e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC6253l> list = this.f16686f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC6257p enumC6257p = this.f16687g;
        return iHashCode4 ^ (enumC6257p != null ? enumC6257p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f16681a + ", requestUptimeMs=" + this.f16682b + ", clientInfo=" + this.f16683c + ", logSource=" + this.f16684d + ", logSourceName=" + this.f16685e + ", logEvents=" + this.f16686f + ", qosTier=" + this.f16687g + "}";
    }

    private C6248g(long j2, long j3, AbstractC6252k abstractC6252k, Integer num, String str, List<AbstractC6253l> list, EnumC6257p enumC6257p) {
        this.f16681a = j2;
        this.f16682b = j3;
        this.f16683c = abstractC6252k;
        this.f16684d = num;
        this.f16685e = str;
        this.f16686f = list;
        this.f16687g = enumC6257p;
    }
}
