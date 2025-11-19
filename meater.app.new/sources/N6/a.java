package N6;

import N6.f;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<M6.i> f12532a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12533b;

    /* compiled from: AutoValue_BackendRequest.java */
    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable<M6.i> f12534a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f12535b;

        b() {
        }

        @Override // N6.f.a
        public f a() {
            String str = "";
            if (this.f12534a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f12534a, this.f12535b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // N6.f.a
        public f.a b(Iterable<M6.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f12534a = iterable;
            return this;
        }

        @Override // N6.f.a
        public f.a c(byte[] bArr) {
            this.f12535b = bArr;
            return this;
        }
    }

    @Override // N6.f
    public Iterable<M6.i> b() {
        return this.f12532a;
    }

    @Override // N6.f
    public byte[] c() {
        return this.f12533b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f12532a.equals(fVar.b())) {
            if (Arrays.equals(this.f12533b, fVar instanceof a ? ((a) fVar).f12533b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12532a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12533b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f12532a + ", extras=" + Arrays.toString(this.f12533b) + "}";
    }

    private a(Iterable<M6.i> iterable, byte[] bArr) {
        this.f12532a = iterable;
        this.f12533b = bArr;
    }
}
