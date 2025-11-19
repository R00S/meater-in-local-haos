package M6;

import M6.i;
import java.util.Arrays;
import java.util.Map;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes2.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f12047a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f12048b;

    /* renamed from: c, reason: collision with root package name */
    private final h f12049c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12050d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12051e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f12052f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f12053g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12054h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f12055i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f12056j;

    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: M6.b$b, reason: collision with other inner class name */
    static final class C0188b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f12057a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f12058b;

        /* renamed from: c, reason: collision with root package name */
        private h f12059c;

        /* renamed from: d, reason: collision with root package name */
        private Long f12060d;

        /* renamed from: e, reason: collision with root package name */
        private Long f12061e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f12062f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f12063g;

        /* renamed from: h, reason: collision with root package name */
        private String f12064h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f12065i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f12066j;

        C0188b() {
        }

        @Override // M6.i.a
        public i d() {
            String str = "";
            if (this.f12057a == null) {
                str = " transportName";
            }
            if (this.f12059c == null) {
                str = str + " encodedPayload";
            }
            if (this.f12060d == null) {
                str = str + " eventMillis";
            }
            if (this.f12061e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f12062f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f12057a, this.f12058b, this.f12059c, this.f12060d.longValue(), this.f12061e.longValue(), this.f12062f, this.f12063g, this.f12064h, this.f12065i, this.f12066j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M6.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f12062f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // M6.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f12062f = map;
            return this;
        }

        @Override // M6.i.a
        public i.a g(Integer num) {
            this.f12058b = num;
            return this;
        }

        @Override // M6.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f12059c = hVar;
            return this;
        }

        @Override // M6.i.a
        public i.a i(long j10) {
            this.f12060d = Long.valueOf(j10);
            return this;
        }

        @Override // M6.i.a
        public i.a j(byte[] bArr) {
            this.f12065i = bArr;
            return this;
        }

        @Override // M6.i.a
        public i.a k(byte[] bArr) {
            this.f12066j = bArr;
            return this;
        }

        @Override // M6.i.a
        public i.a l(Integer num) {
            this.f12063g = num;
            return this;
        }

        @Override // M6.i.a
        public i.a m(String str) {
            this.f12064h = str;
            return this;
        }

        @Override // M6.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f12057a = str;
            return this;
        }

        @Override // M6.i.a
        public i.a o(long j10) {
            this.f12061e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // M6.i
    protected Map<String, String> c() {
        return this.f12052f;
    }

    @Override // M6.i
    public Integer d() {
        return this.f12048b;
    }

    @Override // M6.i
    public h e() {
        return this.f12049c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f12047a.equals(iVar.n()) && ((num = this.f12048b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f12049c.equals(iVar.e()) && this.f12050d == iVar.f() && this.f12051e == iVar.o() && this.f12052f.equals(iVar.c()) && ((num2 = this.f12053g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f12054h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            boolean z10 = iVar instanceof b;
            if (Arrays.equals(this.f12055i, z10 ? ((b) iVar).f12055i : iVar.g())) {
                if (Arrays.equals(this.f12056j, z10 ? ((b) iVar).f12056j : iVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // M6.i
    public long f() {
        return this.f12050d;
    }

    @Override // M6.i
    public byte[] g() {
        return this.f12055i;
    }

    @Override // M6.i
    public byte[] h() {
        return this.f12056j;
    }

    public int hashCode() {
        int iHashCode = (this.f12047a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12048b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f12049c.hashCode()) * 1000003;
        long j10 = this.f12050d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f12051e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f12052f.hashCode()) * 1000003;
        Integer num2 = this.f12053g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f12054h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f12055i)) * 1000003) ^ Arrays.hashCode(this.f12056j);
    }

    @Override // M6.i
    public Integer l() {
        return this.f12053g;
    }

    @Override // M6.i
    public String m() {
        return this.f12054h;
    }

    @Override // M6.i
    public String n() {
        return this.f12047a;
    }

    @Override // M6.i
    public long o() {
        return this.f12051e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f12047a + ", code=" + this.f12048b + ", encodedPayload=" + this.f12049c + ", eventMillis=" + this.f12050d + ", uptimeMillis=" + this.f12051e + ", autoMetadata=" + this.f12052f + ", productId=" + this.f12053g + ", pseudonymousId=" + this.f12054h + ", experimentIdsClear=" + Arrays.toString(this.f12055i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f12056j) + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f12047a = str;
        this.f12048b = num;
        this.f12049c = hVar;
        this.f12050d = j10;
        this.f12051e = j11;
        this.f12052f = map;
        this.f12053g = num2;
        this.f12054h = str2;
        this.f12055i = bArr;
        this.f12056j = bArr2;
    }
}
