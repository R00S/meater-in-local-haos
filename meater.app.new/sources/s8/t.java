package s8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import s8.v;

/* compiled from: AesGcmSivKey.java */
/* loaded from: classes2.dex */
public final class t extends AbstractC4503b {

    /* renamed from: a, reason: collision with root package name */
    private final v f49498a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.b f49499b;

    /* renamed from: c, reason: collision with root package name */
    private final F8.a f49500c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f49501d;

    /* compiled from: AesGcmSivKey.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private v f49502a;

        /* renamed from: b, reason: collision with root package name */
        private F8.b f49503b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f49504c;

        private F8.a b() {
            if (this.f49502a.c() == v.c.f49512d) {
                return F8.a.a(new byte[0]);
            }
            if (this.f49502a.c() == v.c.f49511c) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f49504c.intValue()).array());
            }
            if (this.f49502a.c() == v.c.f49510b) {
                return F8.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f49504c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f49502a.c());
        }

        public t a() throws GeneralSecurityException {
            v vVar = this.f49502a;
            if (vVar == null || this.f49503b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f49503b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f49502a.d() && this.f49504c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f49502a.d() && this.f49504c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f49502a, this.f49503b, b(), this.f49504c);
        }

        public b c(Integer num) {
            this.f49504c = num;
            return this;
        }

        public b d(F8.b bVar) {
            this.f49503b = bVar;
            return this;
        }

        public b e(v vVar) {
            this.f49502a = vVar;
            return this;
        }

        private b() {
            this.f49502a = null;
            this.f49503b = null;
            this.f49504c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private t(v vVar, F8.b bVar, F8.a aVar, Integer num) {
        this.f49498a = vVar;
        this.f49499b = bVar;
        this.f49500c = aVar;
        this.f49501d = num;
    }
}
