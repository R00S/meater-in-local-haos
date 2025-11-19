package L6;

import L6.k;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: LogRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class u {

    /* compiled from: LogRequest.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract u a();

        public abstract a b(o oVar);

        public abstract a c(List<t> list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(x xVar);

        public abstract a g(long j10);

        public abstract a h(long j10);

        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new k.b();
    }

    public abstract o b();

    public abstract List<t> c();

    public abstract Integer d();

    public abstract String e();

    public abstract x f();

    public abstract long g();

    public abstract long h();
}
