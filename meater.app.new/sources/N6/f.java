package N6;

import N6.a;
import com.google.auto.value.AutoValue;

/* compiled from: BackendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class f {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<M6.i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<M6.i> b();

    public abstract byte[] c();
}
