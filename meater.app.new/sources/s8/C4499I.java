package s8;

import java.util.Objects;

/* compiled from: XChaCha20Poly1305Parameters.java */
/* renamed from: s8.I, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4499I extends AbstractC4504c {

    /* renamed from: a, reason: collision with root package name */
    private final a f49417a;

    /* compiled from: XChaCha20Poly1305Parameters.java */
    /* renamed from: s8.I$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f49418b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f49419c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f49420d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f49421a;

        private a(String str) {
            this.f49421a = str;
        }

        public String toString() {
            return this.f49421a;
        }
    }

    private C4499I(a aVar) {
        this.f49417a = aVar;
    }

    public static C4499I a(a aVar) {
        return new C4499I(aVar);
    }

    public a b() {
        return this.f49417a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4499I) && ((C4499I) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f49417a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f49417a + ")";
    }
}
