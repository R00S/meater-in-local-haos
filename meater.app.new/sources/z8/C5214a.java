package z8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import z8.C5217d;

/* compiled from: AesCmacKey.java */
/* renamed from: z8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5214a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final C5217d f53848a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.b f53849b;

    /* renamed from: c, reason: collision with root package name */
    private final F8.a f53850c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f53851d;

    /* compiled from: AesCmacKey.java */
    /* renamed from: z8.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C5217d f53852a;

        /* renamed from: b, reason: collision with root package name */
        private F8.b f53853b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f53854c;

        private F8.a b() {
            if (this.f53852a.e() == C5217d.c.f53866e) {
                return F8.a.a(new byte[0]);
            }
            if (this.f53852a.e() == C5217d.c.f53865d || this.f53852a.e() == C5217d.c.f53864c) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f53854c.intValue()).array());
            }
            if (this.f53852a.e() == C5217d.c.f53863b) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f53854c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f53852a.e());
        }

        public C5214a a() throws GeneralSecurityException {
            C5217d c5217d = this.f53852a;
            if (c5217d == null || this.f53853b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c5217d.c() != this.f53853b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f53852a.f() && this.f53854c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f53852a.f() && this.f53854c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C5214a(this.f53852a, this.f53853b, b(), this.f53854c);
        }

        public b c(F8.b bVar) {
            this.f53853b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f53854c = num;
            return this;
        }

        public b e(C5217d c5217d) {
            this.f53852a = c5217d;
            return this;
        }

        private b() {
            this.f53852a = null;
            this.f53853b = null;
            this.f53854c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // z8.p
    public F8.a a() {
        return this.f53850c;
    }

    @Override // z8.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5217d b() {
        return this.f53848a;
    }

    private C5214a(C5217d c5217d, F8.b bVar, F8.a aVar, Integer num) {
        this.f53848a = c5217d;
        this.f53849b = bVar;
        this.f53850c = aVar;
        this.f53851d = num;
    }
}
