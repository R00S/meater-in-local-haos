package z8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import z8.l;

/* compiled from: HmacKey.java */
/* loaded from: classes2.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    private final l f53876a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.b f53877b;

    /* renamed from: c, reason: collision with root package name */
    private final F8.a f53878c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f53879d;

    /* compiled from: HmacKey.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private l f53880a;

        /* renamed from: b, reason: collision with root package name */
        private F8.b f53881b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f53882c;

        private F8.a b() {
            if (this.f53880a.f() == l.d.f53903e) {
                return F8.a.a(new byte[0]);
            }
            if (this.f53880a.f() == l.d.f53902d || this.f53880a.f() == l.d.f53901c) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f53882c.intValue()).array());
            }
            if (this.f53880a.f() == l.d.f53900b) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f53882c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f53880a.f());
        }

        public i a() throws GeneralSecurityException {
            l lVar = this.f53880a;
            if (lVar == null || this.f53881b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (lVar.d() != this.f53881b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f53880a.g() && this.f53882c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f53880a.g() && this.f53882c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f53880a, this.f53881b, b(), this.f53882c);
        }

        public b c(Integer num) {
            this.f53882c = num;
            return this;
        }

        public b d(F8.b bVar) {
            this.f53881b = bVar;
            return this;
        }

        public b e(l lVar) {
            this.f53880a = lVar;
            return this;
        }

        private b() {
            this.f53880a = null;
            this.f53881b = null;
            this.f53882c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // z8.p
    public F8.a a() {
        return this.f53878c;
    }

    @Override // z8.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f53876a;
    }

    private i(l lVar, F8.b bVar, F8.a aVar, Integer num) {
        this.f53876a = lVar;
        this.f53877b = bVar;
        this.f53878c = aVar;
        this.f53879d = num;
    }
}
