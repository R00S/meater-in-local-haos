package N6;

import com.google.auto.value.AutoValue;

/* compiled from: BackendResponse.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class g {

    /* compiled from: BackendResponse.java */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new b(a.INVALID_PAYLOAD, -1L);
    }

    public static g e(long j10) {
        return new b(a.OK, j10);
    }

    public static g f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
