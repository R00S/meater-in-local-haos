package z8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: HmacParameters.java */
/* loaded from: classes2.dex */
public final class l extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f53886a;

    /* renamed from: b, reason: collision with root package name */
    private final int f53887b;

    /* renamed from: c, reason: collision with root package name */
    private final d f53888c;

    /* renamed from: d, reason: collision with root package name */
    private final c f53889d;

    /* compiled from: HmacParameters.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f53890a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f53891b;

        /* renamed from: c, reason: collision with root package name */
        private c f53892c;

        /* renamed from: d, reason: collision with root package name */
        private d f53893d;

        private static void f(int i10, c cVar) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f53894b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f53895c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f53896d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f53897e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f53898f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public l a() throws GeneralSecurityException {
            Integer num = this.f53890a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f53891b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f53892c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f53893d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f53890a));
            }
            f(this.f53891b.intValue(), this.f53892c);
            return new l(this.f53890a.intValue(), this.f53891b.intValue(), this.f53893d, this.f53892c);
        }

        public b b(c cVar) {
            this.f53892c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f53890a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.f53891b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f53893d = dVar;
            return this;
        }

        private b() {
            this.f53890a = null;
            this.f53891b = null;
            this.f53892c = null;
            this.f53893d = d.f53903e;
        }
    }

    /* compiled from: HmacParameters.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f53894b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f53895c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f53896d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f53897e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f53898f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f53899a;

        private c(String str) {
            this.f53899a = str;
        }

        public String toString() {
            return this.f53899a;
        }
    }

    /* compiled from: HmacParameters.java */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f53900b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f53901c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f53902d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f53903e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f53904a;

        private d(String str) {
            this.f53904a = str;
        }

        public String toString() {
            return this.f53904a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f53887b;
    }

    public c c() {
        return this.f53889d;
    }

    public int d() {
        return this.f53886a;
    }

    public int e() {
        d dVar = this.f53888c;
        if (dVar == d.f53903e) {
            return b();
        }
        if (dVar != d.f53900b && dVar != d.f53901c && dVar != d.f53902d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f53888c;
    }

    public boolean g() {
        return this.f53888c != d.f53903e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53886a), Integer.valueOf(this.f53887b), this.f53888c, this.f53889d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f53888c + ", hashType: " + this.f53889d + ", " + this.f53887b + "-byte tags, and " + this.f53886a + "-byte key)";
    }

    private l(int i10, int i11, d dVar, c cVar) {
        this.f53886a = i10;
        this.f53887b = i11;
        this.f53888c = dVar;
        this.f53889d = cVar;
    }
}
