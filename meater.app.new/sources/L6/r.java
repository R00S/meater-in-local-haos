package L6;

import L6.h;
import com.google.auto.value.AutoValue;

/* compiled from: ExternalPRequestContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class r {

    /* compiled from: ExternalPRequestContext.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract r a();

        public abstract a b(Integer num);
    }

    public static a a() {
        return new h.b();
    }

    public abstract Integer b();
}
