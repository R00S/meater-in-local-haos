package L6;

import L6.e;
import com.google.auto.value.AutoValue;

/* compiled from: ClientInfo.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class o {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract o a();

        public abstract a b(L6.a aVar);

        public abstract a c(b bVar);
    }

    /* compiled from: ClientInfo.java */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: B, reason: collision with root package name */
        private final int f10982B;

        b(int i10) {
            this.f10982B = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract L6.a b();

    public abstract b c();
}
