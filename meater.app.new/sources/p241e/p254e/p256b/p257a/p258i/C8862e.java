package p241e.p254e.p256b.p257a.p258i;

import java.util.Arrays;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.EnumC8787d;
import p241e.p254e.p256b.p257a.p258i.AbstractC8874q;

/* compiled from: AutoValue_TransportContext.java */
/* renamed from: e.e.b.a.i.e */
/* loaded from: classes2.dex */
final class C8862e extends AbstractC8874q {

    /* renamed from: a */
    private final String f33583a;

    /* renamed from: b */
    private final byte[] f33584b;

    /* renamed from: c */
    private final EnumC8787d f33585c;

    /* compiled from: AutoValue_TransportContext.java */
    /* renamed from: e.e.b.a.i.e$b */
    static final class b extends AbstractC8874q.a {

        /* renamed from: a */
        private String f33586a;

        /* renamed from: b */
        private byte[] f33587b;

        /* renamed from: c */
        private EnumC8787d f33588c;

        b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8874q.a
        /* renamed from: a */
        public AbstractC8874q mo28137a() {
            String str = this.f33586a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " backendName";
            }
            if (this.f33588c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new C8862e(this.f33586a, this.f33587b, this.f33588c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8874q.a
        /* renamed from: b */
        public AbstractC8874q.a mo28138b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f33586a = str;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8874q.a
        /* renamed from: c */
        public AbstractC8874q.a mo28139c(byte[] bArr) {
            this.f33587b = bArr;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8874q.a
        /* renamed from: d */
        public AbstractC8874q.a mo28140d(EnumC8787d enumC8787d) {
            if (enumC8787d == null) {
                throw new NullPointerException("Null priority");
            }
            this.f33588c = enumC8787d;
            return this;
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8874q
    /* renamed from: b */
    public String mo28134b() {
        return this.f33583a;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8874q
    /* renamed from: c */
    public byte[] mo28135c() {
        return this.f33584b;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8874q
    /* renamed from: d */
    public EnumC8787d mo28136d() {
        return this.f33585c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8874q)) {
            return false;
        }
        AbstractC8874q abstractC8874q = (AbstractC8874q) obj;
        if (this.f33583a.equals(abstractC8874q.mo28134b())) {
            if (Arrays.equals(this.f33584b, abstractC8874q instanceof C8862e ? ((C8862e) abstractC8874q).f33584b : abstractC8874q.mo28135c()) && this.f33585c.equals(abstractC8874q.mo28136d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f33583a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33584b)) * 1000003) ^ this.f33585c.hashCode();
    }

    private C8862e(String str, byte[] bArr, EnumC8787d enumC8787d) {
        this.f33583a = str;
        this.f33584b = bArr;
        this.f33585c = enumC8787d;
    }
}
