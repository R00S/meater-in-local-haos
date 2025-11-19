package s8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: AesGcmSivParameters.java */
/* loaded from: classes2.dex */
public final class v extends AbstractC4504c {

    /* renamed from: a, reason: collision with root package name */
    private final int f49506a;

    /* renamed from: b, reason: collision with root package name */
    private final c f49507b;

    /* compiled from: AesGcmSivParameters.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f49508a;

        /* renamed from: b, reason: collision with root package name */
        private c f49509b;

        public v a() throws GeneralSecurityException {
            Integer num = this.f49508a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f49509b != null) {
                return new v(num.intValue(), this.f49509b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f49508a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f49509b = cVar;
            return this;
        }

        private b() {
            this.f49508a = null;
            this.f49509b = c.f49512d;
        }
    }

    /* compiled from: AesGcmSivParameters.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f49510b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f49511c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f49512d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f49513a;

        private c(String str) {
            this.f49513a = str;
        }

        public String toString() {
            return this.f49513a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f49506a;
    }

    public c c() {
        return this.f49507b;
    }

    public boolean d() {
        return this.f49507b != c.f49512d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f49506a), this.f49507b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f49507b + ", " + this.f49506a + "-byte key)";
    }

    private v(int i10, c cVar) {
        this.f49506a = i10;
        this.f49507b = cVar;
    }
}
