package s8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import s8.q;

/* compiled from: AesGcmKey.java */
/* renamed from: s8.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4516o extends AbstractC4503b {

    /* renamed from: a, reason: collision with root package name */
    private final q f49472a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.b f49473b;

    /* renamed from: c, reason: collision with root package name */
    private final F8.a f49474c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f49475d;

    /* compiled from: AesGcmKey.java */
    /* renamed from: s8.o$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private q f49476a;

        /* renamed from: b, reason: collision with root package name */
        private F8.b f49477b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f49478c;

        private F8.a b() {
            if (this.f49476a.e() == q.c.f49490d) {
                return F8.a.a(new byte[0]);
            }
            if (this.f49476a.e() == q.c.f49489c) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f49478c.intValue()).array());
            }
            if (this.f49476a.e() == q.c.f49488b) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f49478c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f49476a.e());
        }

        public C4516o a() throws GeneralSecurityException {
            q qVar = this.f49476a;
            if (qVar == null || this.f49477b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f49477b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f49476a.f() && this.f49478c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f49476a.f() && this.f49478c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C4516o(this.f49476a, this.f49477b, b(), this.f49478c);
        }

        public b c(Integer num) {
            this.f49478c = num;
            return this;
        }

        public b d(F8.b bVar) {
            this.f49477b = bVar;
            return this;
        }

        public b e(q qVar) {
            this.f49476a = qVar;
            return this;
        }

        private b() {
            this.f49476a = null;
            this.f49477b = null;
            this.f49478c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private C4516o(q qVar, F8.b bVar, F8.a aVar, Integer num) {
        this.f49472a = qVar;
        this.f49473b = bVar;
        this.f49474c = aVar;
        this.f49475d = num;
    }
}
