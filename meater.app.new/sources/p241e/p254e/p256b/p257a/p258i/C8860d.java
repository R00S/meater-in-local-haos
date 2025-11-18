package p241e.p254e.p256b.p257a.p258i;

import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.AbstractC8786c;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8788e;
import p241e.p254e.p256b.p257a.p258i.AbstractC8873p;

/* compiled from: AutoValue_SendRequest.java */
/* renamed from: e.e.b.a.i.d */
/* loaded from: classes2.dex */
final class C8860d extends AbstractC8873p {

    /* renamed from: a */
    private final AbstractC8874q f33571a;

    /* renamed from: b */
    private final String f33572b;

    /* renamed from: c */
    private final AbstractC8786c<?> f33573c;

    /* renamed from: d */
    private final InterfaceC8788e<?, byte[]> f33574d;

    /* renamed from: e */
    private final C8785b f33575e;

    /* compiled from: AutoValue_SendRequest.java */
    /* renamed from: e.e.b.a.i.d$b */
    static final class b extends AbstractC8873p.a {

        /* renamed from: a */
        private AbstractC8874q f33576a;

        /* renamed from: b */
        private String f33577b;

        /* renamed from: c */
        private AbstractC8786c<?> f33578c;

        /* renamed from: d */
        private InterfaceC8788e<?, byte[]> f33579d;

        /* renamed from: e */
        private C8785b f33580e;

        b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p.a
        /* renamed from: a */
        public AbstractC8873p mo28126a() {
            AbstractC8874q abstractC8874q = this.f33576a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (abstractC8874q == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " transportContext";
            }
            if (this.f33577b == null) {
                str = str + " transportName";
            }
            if (this.f33578c == null) {
                str = str + " event";
            }
            if (this.f33579d == null) {
                str = str + " transformer";
            }
            if (this.f33580e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C8860d(this.f33576a, this.f33577b, this.f33578c, this.f33579d, this.f33580e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p.a
        /* renamed from: b */
        AbstractC8873p.a mo28127b(C8785b c8785b) {
            if (c8785b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f33580e = c8785b;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p.a
        /* renamed from: c */
        AbstractC8873p.a mo28128c(AbstractC8786c<?> abstractC8786c) {
            if (abstractC8786c == null) {
                throw new NullPointerException("Null event");
            }
            this.f33578c = abstractC8786c;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p.a
        /* renamed from: d */
        AbstractC8873p.a mo28129d(InterfaceC8788e<?, byte[]> interfaceC8788e) {
            if (interfaceC8788e == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f33579d = interfaceC8788e;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p.a
        /* renamed from: e */
        public AbstractC8873p.a mo28130e(AbstractC8874q abstractC8874q) {
            if (abstractC8874q == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f33576a = abstractC8874q;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p.a
        /* renamed from: f */
        public AbstractC8873p.a mo28131f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f33577b = str;
            return this;
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p
    /* renamed from: b */
    public C8785b mo28121b() {
        return this.f33575e;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p
    /* renamed from: c */
    AbstractC8786c<?> mo28122c() {
        return this.f33573c;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p
    /* renamed from: e */
    InterfaceC8788e<?, byte[]> mo28123e() {
        return this.f33574d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8873p)) {
            return false;
        }
        AbstractC8873p abstractC8873p = (AbstractC8873p) obj;
        return this.f33571a.equals(abstractC8873p.mo28124f()) && this.f33572b.equals(abstractC8873p.mo28125g()) && this.f33573c.equals(abstractC8873p.mo28122c()) && this.f33574d.equals(abstractC8873p.mo28123e()) && this.f33575e.equals(abstractC8873p.mo28121b());
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p
    /* renamed from: f */
    public AbstractC8874q mo28124f() {
        return this.f33571a;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8873p
    /* renamed from: g */
    public String mo28125g() {
        return this.f33572b;
    }

    public int hashCode() {
        return ((((((((this.f33571a.hashCode() ^ 1000003) * 1000003) ^ this.f33572b.hashCode()) * 1000003) ^ this.f33573c.hashCode()) * 1000003) ^ this.f33574d.hashCode()) * 1000003) ^ this.f33575e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f33571a + ", transportName=" + this.f33572b + ", event=" + this.f33573c + ", transformer=" + this.f33574d + ", encoding=" + this.f33575e + "}";
    }

    private C8860d(AbstractC8874q abstractC8874q, String str, AbstractC8786c<?> abstractC8786c, InterfaceC8788e<?, byte[]> interfaceC8788e, C8785b c8785b) {
        this.f33571a = abstractC8874q;
        this.f33572b = str;
        this.f33573c = abstractC8786c;
        this.f33574d = interfaceC8788e;
        this.f33575e = c8785b;
    }
}
