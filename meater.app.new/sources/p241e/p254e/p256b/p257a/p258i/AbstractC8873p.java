package p241e.p254e.p256b.p257a.p258i;

import com.google.auto.value.AutoValue;
import p241e.p254e.p256b.p257a.AbstractC8786c;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8788e;
import p241e.p254e.p256b.p257a.p258i.C8860d;

/* compiled from: SendRequest.java */
@AutoValue
/* renamed from: e.e.b.a.i.p */
/* loaded from: classes2.dex */
abstract class AbstractC8873p {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* renamed from: e.e.b.a.i.p$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC8873p mo28126a();

        /* renamed from: b */
        abstract a mo28127b(C8785b c8785b);

        /* renamed from: c */
        abstract a mo28128c(AbstractC8786c<?> abstractC8786c);

        /* renamed from: d */
        abstract a mo28129d(InterfaceC8788e<?, byte[]> interfaceC8788e);

        /* renamed from: e */
        public abstract a mo28130e(AbstractC8874q abstractC8874q);

        /* renamed from: f */
        public abstract a mo28131f(String str);
    }

    AbstractC8873p() {
    }

    /* renamed from: a */
    public static a m28167a() {
        return new C8860d.b();
    }

    /* renamed from: b */
    public abstract C8785b mo28121b();

    /* renamed from: c */
    abstract AbstractC8786c<?> mo28122c();

    /* renamed from: d */
    public byte[] m28168d() {
        return mo28123e().mo26009a(mo28122c().mo27943b());
    }

    /* renamed from: e */
    abstract InterfaceC8788e<?, byte[]> mo28123e();

    /* renamed from: f */
    public abstract AbstractC8874q mo28124f();

    /* renamed from: g */
    public abstract String mo28125g();
}
