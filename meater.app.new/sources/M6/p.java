package M6;

import M6.d;
import android.util.Base64;
import com.google.auto.value.AutoValue;

/* compiled from: TransportContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class p {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(K6.f fVar);
    }

    public static a a() {
        return new d.b().d(K6.f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract K6.f d();

    public boolean e() {
        return c() != null;
    }

    public p f(K6.f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
