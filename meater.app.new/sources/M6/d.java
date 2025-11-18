package M6;

import M6.p;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes2.dex */
final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f12077a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12078b;

    /* renamed from: c, reason: collision with root package name */
    private final K6.f f12079c;

    /* compiled from: AutoValue_TransportContext.java */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f12080a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f12081b;

        /* renamed from: c, reason: collision with root package name */
        private K6.f f12082c;

        b() {
        }

        @Override // M6.p.a
        public p a() {
            String str = "";
            if (this.f12080a == null) {
                str = " backendName";
            }
            if (this.f12082c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f12080a, this.f12081b, this.f12082c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M6.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f12080a = str;
            return this;
        }

        @Override // M6.p.a
        public p.a c(byte[] bArr) {
            this.f12081b = bArr;
            return this;
        }

        @Override // M6.p.a
        public p.a d(K6.f fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f12082c = fVar;
            return this;
        }
    }

    @Override // M6.p
    public String b() {
        return this.f12077a;
    }

    @Override // M6.p
    public byte[] c() {
        return this.f12078b;
    }

    @Override // M6.p
    public K6.f d() {
        return this.f12079c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f12077a.equals(pVar.b())) {
            if (Arrays.equals(this.f12078b, pVar instanceof d ? ((d) pVar).f12078b : pVar.c()) && this.f12079c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12077a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12078b)) * 1000003) ^ this.f12079c.hashCode();
    }

    private d(String str, byte[] bArr, K6.f fVar) {
        this.f12077a = str;
        this.f12078b = bArr;
        this.f12079c = fVar;
    }
}
