package s8;

import java.util.Objects;

/* compiled from: ChaCha20Poly1305Parameters.java */
/* renamed from: s8.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4491A extends AbstractC4504c {

    /* renamed from: a, reason: collision with root package name */
    private final a f49396a;

    /* compiled from: ChaCha20Poly1305Parameters.java */
    /* renamed from: s8.A$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f49397b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f49398c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f49399d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f49400a;

        private a(String str) {
            this.f49400a = str;
        }

        public String toString() {
            return this.f49400a;
        }
    }

    private C4491A(a aVar) {
        this.f49396a = aVar;
    }

    public static C4491A a(a aVar) {
        return new C4491A(aVar);
    }

    public a b() {
        return this.f49396a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4491A) && ((C4491A) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f49396a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f49396a + ")";
    }
}
