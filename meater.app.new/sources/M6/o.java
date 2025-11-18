package M6;

import M6.c;
import com.google.auto.value.AutoValue;

/* compiled from: SendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
abstract class o {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract o a();

        abstract a b(K6.c cVar);

        abstract a c(K6.d<?> dVar);

        abstract a d(K6.h<?, byte[]> hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract K6.c b();

    abstract K6.d<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    abstract K6.h<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
