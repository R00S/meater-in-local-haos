package L6;

import L6.j;
import com.google.auto.value.AutoValue;

/* compiled from: LogEvent.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class t {

    /* compiled from: LogEvent.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract t a();

        public abstract a b(p pVar);

        public abstract a c(Integer num);

        public abstract a d(long j10);

        public abstract a e(long j10);

        public abstract a f(q qVar);

        public abstract a g(w wVar);

        abstract a h(byte[] bArr);

        abstract a i(String str);

        public abstract a j(long j10);
    }

    private static a a() {
        return new j.b();
    }

    public static a k(String str) {
        return a().i(str);
    }

    public static a l(byte[] bArr) {
        return a().h(bArr);
    }

    public abstract p b();

    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    public abstract q f();

    public abstract w g();

    public abstract byte[] h();

    public abstract String i();

    public abstract long j();
}
