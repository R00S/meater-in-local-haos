package p241e.p254e.p256b.p257a.p258i;

import java.util.Map;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.p258i.AbstractC8867j;

/* compiled from: AutoValue_EventInternal.java */
/* renamed from: e.e.b.a.i.c */
/* loaded from: classes2.dex */
final class C8853c extends AbstractC8867j {

    /* renamed from: a */
    private final String f33557a;

    /* renamed from: b */
    private final Integer f33558b;

    /* renamed from: c */
    private final C8866i f33559c;

    /* renamed from: d */
    private final long f33560d;

    /* renamed from: e */
    private final long f33561e;

    /* renamed from: f */
    private final Map<String, String> f33562f;

    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: e.e.b.a.i.c$b */
    static final class b extends AbstractC8867j.a {

        /* renamed from: a */
        private String f33563a;

        /* renamed from: b */
        private Integer f33564b;

        /* renamed from: c */
        private C8866i f33565c;

        /* renamed from: d */
        private Long f33566d;

        /* renamed from: e */
        private Long f33567e;

        /* renamed from: f */
        private Map<String, String> f33568f;

        b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: d */
        public AbstractC8867j mo28102d() {
            String str = this.f33563a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " transportName";
            }
            if (this.f33565c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f33566d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f33567e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f33568f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new C8853c(this.f33563a, this.f33564b, this.f33565c, this.f33566d.longValue(), this.f33567e.longValue(), this.f33568f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: e */
        protected Map<String, String> mo28103e() {
            Map<String, String> map = this.f33568f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: f */
        protected AbstractC8867j.a mo28104f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f33568f = map;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: g */
        public AbstractC8867j.a mo28105g(Integer num) {
            this.f33564b = num;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: h */
        public AbstractC8867j.a mo28106h(C8866i c8866i) {
            if (c8866i == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f33565c = c8866i;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: i */
        public AbstractC8867j.a mo28107i(long j2) {
            this.f33566d = Long.valueOf(j2);
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: j */
        public AbstractC8867j.a mo28108j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f33563a = str;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j.a
        /* renamed from: k */
        public AbstractC8867j.a mo28109k(long j2) {
            this.f33567e = Long.valueOf(j2);
            return this;
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j
    /* renamed from: c */
    protected Map<String, String> mo28096c() {
        return this.f33562f;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j
    /* renamed from: d */
    public Integer mo28097d() {
        return this.f33558b;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j
    /* renamed from: e */
    public C8866i mo28098e() {
        return this.f33559c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8867j)) {
            return false;
        }
        AbstractC8867j abstractC8867j = (AbstractC8867j) obj;
        return this.f33557a.equals(abstractC8867j.mo28100j()) && ((num = this.f33558b) != null ? num.equals(abstractC8867j.mo28097d()) : abstractC8867j.mo28097d() == null) && this.f33559c.equals(abstractC8867j.mo28098e()) && this.f33560d == abstractC8867j.mo28099f() && this.f33561e == abstractC8867j.mo28101k() && this.f33562f.equals(abstractC8867j.mo28096c());
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j
    /* renamed from: f */
    public long mo28099f() {
        return this.f33560d;
    }

    public int hashCode() {
        int iHashCode = (this.f33557a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f33558b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f33559c.hashCode()) * 1000003;
        long j2 = this.f33560d;
        int i2 = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f33561e;
        return ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f33562f.hashCode();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j
    /* renamed from: j */
    public String mo28100j() {
        return this.f33557a;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8867j
    /* renamed from: k */
    public long mo28101k() {
        return this.f33561e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f33557a + ", code=" + this.f33558b + ", encodedPayload=" + this.f33559c + ", eventMillis=" + this.f33560d + ", uptimeMillis=" + this.f33561e + ", autoMetadata=" + this.f33562f + "}";
    }

    private C8853c(String str, Integer num, C8866i c8866i, long j2, long j3, Map<String, String> map) {
        this.f33557a = str;
        this.f33558b = num;
        this.f33559c = c8866i;
        this.f33560d = j2;
        this.f33561e = j3;
        this.f33562f = map;
    }
}
