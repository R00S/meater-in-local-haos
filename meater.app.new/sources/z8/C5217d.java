package z8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: AesCmacParameters.java */
/* renamed from: z8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5217d extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f53857a;

    /* renamed from: b, reason: collision with root package name */
    private final int f53858b;

    /* renamed from: c, reason: collision with root package name */
    private final c f53859c;

    /* compiled from: AesCmacParameters.java */
    /* renamed from: z8.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f53860a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f53861b;

        /* renamed from: c, reason: collision with root package name */
        private c f53862c;

        public C5217d a() throws GeneralSecurityException {
            Integer num = this.f53860a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f53861b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f53862c != null) {
                return new C5217d(num.intValue(), this.f53861b.intValue(), this.f53862c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f53860a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 >= 10 && 16 >= i10) {
                this.f53861b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f53862c = cVar;
            return this;
        }

        private b() {
            this.f53860a = null;
            this.f53861b = null;
            this.f53862c = c.f53866e;
        }
    }

    /* compiled from: AesCmacParameters.java */
    /* renamed from: z8.d$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f53863b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f53864c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f53865d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f53866e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f53867a;

        private c(String str) {
            this.f53867a = str;
        }

        public String toString() {
            return this.f53867a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f53858b;
    }

    public int c() {
        return this.f53857a;
    }

    public int d() {
        c cVar = this.f53859c;
        if (cVar == c.f53866e) {
            return b();
        }
        if (cVar != c.f53863b && cVar != c.f53864c && cVar != c.f53865d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public c e() {
        return this.f53859c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5217d)) {
            return false;
        }
        C5217d c5217d = (C5217d) obj;
        return c5217d.c() == c() && c5217d.d() == d() && c5217d.e() == e();
    }

    public boolean f() {
        return this.f53859c != c.f53866e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53857a), Integer.valueOf(this.f53858b), this.f53859c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f53859c + ", " + this.f53858b + "-byte tags, and " + this.f53857a + "-byte key)";
    }

    private C5217d(int i10, int i11, c cVar) {
        this.f53857a = i10;
        this.f53858b = i11;
        this.f53859c = cVar;
    }
}
