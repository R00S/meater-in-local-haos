package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.AbstractC6253l;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_LogEvent.java */
/* renamed from: com.google.android.datatransport.cct.f.f */
/* loaded from: classes2.dex */
final class C6247f extends AbstractC6253l {

    /* renamed from: a */
    private final long f16667a;

    /* renamed from: b */
    private final Integer f16668b;

    /* renamed from: c */
    private final long f16669c;

    /* renamed from: d */
    private final byte[] f16670d;

    /* renamed from: e */
    private final String f16671e;

    /* renamed from: f */
    private final long f16672f;

    /* renamed from: g */
    private final AbstractC6256o f16673g;

    /* compiled from: AutoValue_LogEvent.java */
    /* renamed from: com.google.android.datatransport.cct.f.f$b */
    static final class b extends AbstractC6253l.a {

        /* renamed from: a */
        private Long f16674a;

        /* renamed from: b */
        private Integer f16675b;

        /* renamed from: c */
        private Long f16676c;

        /* renamed from: d */
        private byte[] f16677d;

        /* renamed from: e */
        private String f16678e;

        /* renamed from: f */
        private Long f16679f;

        /* renamed from: g */
        private AbstractC6256o f16680g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: a */
        public AbstractC6253l mo13464a() {
            Long l = this.f16674a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " eventTimeMs";
            }
            if (this.f16676c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f16679f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C6247f(this.f16674a.longValue(), this.f16675b, this.f16676c.longValue(), this.f16677d, this.f16678e, this.f16679f.longValue(), this.f16680g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: b */
        public AbstractC6253l.a mo13465b(Integer num) {
            this.f16675b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: c */
        public AbstractC6253l.a mo13466c(long j2) {
            this.f16674a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: d */
        public AbstractC6253l.a mo13467d(long j2) {
            this.f16676c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: e */
        public AbstractC6253l.a mo13468e(AbstractC6256o abstractC6256o) {
            this.f16680g = abstractC6256o;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: f */
        AbstractC6253l.a mo13469f(byte[] bArr) {
            this.f16677d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: g */
        AbstractC6253l.a mo13470g(String str) {
            this.f16678e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l.a
        /* renamed from: h */
        public AbstractC6253l.a mo13471h(long j2) {
            this.f16679f = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l
    /* renamed from: b */
    public Integer mo13457b() {
        return this.f16668b;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l
    /* renamed from: c */
    public long mo13458c() {
        return this.f16667a;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l
    /* renamed from: d */
    public long mo13459d() {
        return this.f16669c;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l
    /* renamed from: e */
    public AbstractC6256o mo13460e() {
        return this.f16673g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6253l)) {
            return false;
        }
        AbstractC6253l abstractC6253l = (AbstractC6253l) obj;
        if (this.f16667a == abstractC6253l.mo13458c() && ((num = this.f16668b) != null ? num.equals(abstractC6253l.mo13457b()) : abstractC6253l.mo13457b() == null) && this.f16669c == abstractC6253l.mo13459d()) {
            if (Arrays.equals(this.f16670d, abstractC6253l instanceof C6247f ? ((C6247f) abstractC6253l).f16670d : abstractC6253l.mo13461f()) && ((str = this.f16671e) != null ? str.equals(abstractC6253l.mo13462g()) : abstractC6253l.mo13462g() == null) && this.f16672f == abstractC6253l.mo13463h()) {
                AbstractC6256o abstractC6256o = this.f16673g;
                if (abstractC6256o == null) {
                    if (abstractC6253l.mo13460e() == null) {
                        return true;
                    }
                } else if (abstractC6256o.equals(abstractC6253l.mo13460e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l
    /* renamed from: f */
    public byte[] mo13461f() {
        return this.f16670d;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l
    /* renamed from: g */
    public String mo13462g() {
        return this.f16671e;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6253l
    /* renamed from: h */
    public long mo13463h() {
        return this.f16672f;
    }

    public int hashCode() {
        long j2 = this.f16667a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f16668b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j3 = this.f16669c;
        int iHashCode2 = (((((i2 ^ iHashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f16670d)) * 1000003;
        String str = this.f16671e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f16672f;
        int i3 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        AbstractC6256o abstractC6256o = this.f16673g;
        return i3 ^ (abstractC6256o != null ? abstractC6256o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f16667a + ", eventCode=" + this.f16668b + ", eventUptimeMs=" + this.f16669c + ", sourceExtension=" + Arrays.toString(this.f16670d) + ", sourceExtensionJsonProto3=" + this.f16671e + ", timezoneOffsetSeconds=" + this.f16672f + ", networkConnectionInfo=" + this.f16673g + "}";
    }

    private C6247f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, AbstractC6256o abstractC6256o) {
        this.f16667a = j2;
        this.f16668b = num;
        this.f16669c = j3;
        this.f16670d = bArr;
        this.f16671e = str;
        this.f16672f = j4;
        this.f16673g = abstractC6256o;
    }
}
