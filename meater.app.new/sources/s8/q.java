package s8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: AesGcmParameters.java */
/* loaded from: classes2.dex */
public final class q extends AbstractC4504c {

    /* renamed from: a, reason: collision with root package name */
    private final int f49480a;

    /* renamed from: b, reason: collision with root package name */
    private final int f49481b;

    /* renamed from: c, reason: collision with root package name */
    private final int f49482c;

    /* renamed from: d, reason: collision with root package name */
    private final c f49483d;

    /* compiled from: AesGcmParameters.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f49484a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f49485b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f49486c;

        /* renamed from: d, reason: collision with root package name */
        private c f49487d;

        public q a() throws GeneralSecurityException {
            Integer num = this.f49484a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f49487d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f49485b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f49486c != null) {
                return new q(num.intValue(), this.f49485b.intValue(), this.f49486c.intValue(), this.f49487d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f49485b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f49484a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f49486c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f49487d = cVar;
            return this;
        }

        private b() {
            this.f49484a = null;
            this.f49485b = null;
            this.f49486c = null;
            this.f49487d = c.f49490d;
        }
    }

    /* compiled from: AesGcmParameters.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f49488b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f49489c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f49490d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f49491a;

        private c(String str) {
            this.f49491a = str;
        }

        public String toString() {
            return this.f49491a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f49481b;
    }

    public int c() {
        return this.f49480a;
    }

    public int d() {
        return this.f49482c;
    }

    public c e() {
        return this.f49483d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f49483d != c.f49490d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f49480a), Integer.valueOf(this.f49481b), Integer.valueOf(this.f49482c), this.f49483d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f49483d + ", " + this.f49481b + "-byte IV, " + this.f49482c + "-byte tag, and " + this.f49480a + "-byte key)";
    }

    private q(int i10, int i11, int i12, c cVar) {
        this.f49480a = i10;
        this.f49481b = i11;
        this.f49482c = i12;
        this.f49483d = cVar;
    }
}
