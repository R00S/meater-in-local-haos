package L6;

import L6.g;
import com.google.auto.value.AutoValue;

/* compiled from: ExperimentIds.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class q {

    /* compiled from: ExperimentIds.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract q a();

        public abstract a b(byte[] bArr);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new g.b();
    }

    public abstract byte[] b();

    public abstract byte[] c();
}
