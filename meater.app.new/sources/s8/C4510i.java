package s8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: AesEaxParameters.java */
/* renamed from: s8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4510i extends AbstractC4504c {

    /* renamed from: a, reason: collision with root package name */
    private final int f49454a;

    /* renamed from: b, reason: collision with root package name */
    private final int f49455b;

    /* renamed from: c, reason: collision with root package name */
    private final int f49456c;

    /* renamed from: d, reason: collision with root package name */
    private final c f49457d;

    /* compiled from: AesEaxParameters.java */
    /* renamed from: s8.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f49458a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f49459b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f49460c;

        /* renamed from: d, reason: collision with root package name */
        private c f49461d;

        public C4510i a() throws GeneralSecurityException {
            Integer num = this.f49458a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f49459b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f49461d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f49460c != null) {
                return new C4510i(num.intValue(), this.f49459b.intValue(), this.f49460c.intValue(), this.f49461d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f49459b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f49458a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f49460c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f49461d = cVar;
            return this;
        }

        private b() {
            this.f49458a = null;
            this.f49459b = null;
            this.f49460c = null;
            this.f49461d = c.f49464d;
        }
    }

    /* compiled from: AesEaxParameters.java */
    /* renamed from: s8.i$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f49462b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f49463c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f49464d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f49465a;

        private c(String str) {
            this.f49465a = str;
        }

        public String toString() {
            return this.f49465a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f49455b;
    }

    public int c() {
        return this.f49454a;
    }

    public int d() {
        return this.f49456c;
    }

    public c e() {
        return this.f49457d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4510i)) {
            return false;
        }
        C4510i c4510i = (C4510i) obj;
        return c4510i.c() == c() && c4510i.b() == b() && c4510i.d() == d() && c4510i.e() == e();
    }

    public boolean f() {
        return this.f49457d != c.f49464d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f49454a), Integer.valueOf(this.f49455b), Integer.valueOf(this.f49456c), this.f49457d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f49457d + ", " + this.f49455b + "-byte IV, " + this.f49456c + "-byte tag, and " + this.f49454a + "-byte key)";
    }

    private C4510i(int i10, int i11, int i12, c cVar) {
        this.f49454a = i10;
        this.f49455b = i11;
        this.f49456c = i12;
        this.f49457d = cVar;
    }
}
