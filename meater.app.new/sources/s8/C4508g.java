package s8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import s8.C4510i;

/* compiled from: AesEaxKey.java */
/* renamed from: s8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4508g extends AbstractC4503b {

    /* renamed from: a, reason: collision with root package name */
    private final C4510i f49446a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.b f49447b;

    /* renamed from: c, reason: collision with root package name */
    private final F8.a f49448c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f49449d;

    /* compiled from: AesEaxKey.java */
    /* renamed from: s8.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C4510i f49450a;

        /* renamed from: b, reason: collision with root package name */
        private F8.b f49451b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f49452c;

        private F8.a b() {
            if (this.f49450a.e() == C4510i.c.f49464d) {
                return F8.a.a(new byte[0]);
            }
            if (this.f49450a.e() == C4510i.c.f49463c) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f49452c.intValue()).array());
            }
            if (this.f49450a.e() == C4510i.c.f49462b) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f49452c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f49450a.e());
        }

        public C4508g a() throws GeneralSecurityException {
            C4510i c4510i = this.f49450a;
            if (c4510i == null || this.f49451b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c4510i.c() != this.f49451b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f49450a.f() && this.f49452c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f49450a.f() && this.f49452c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C4508g(this.f49450a, this.f49451b, b(), this.f49452c);
        }

        public b c(Integer num) {
            this.f49452c = num;
            return this;
        }

        public b d(F8.b bVar) {
            this.f49451b = bVar;
            return this;
        }

        public b e(C4510i c4510i) {
            this.f49450a = c4510i;
            return this;
        }

        private b() {
            this.f49450a = null;
            this.f49451b = null;
            this.f49452c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private C4508g(C4510i c4510i, F8.b bVar, F8.a aVar, Integer num) {
        this.f49446a = c4510i;
        this.f49447b = bVar;
        this.f49448c = aVar;
        this.f49449d = num;
    }
}
