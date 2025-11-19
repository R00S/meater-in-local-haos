package L6;

import L6.f;
import android.util.SparseArray;
import com.google.auto.value.AutoValue;

/* compiled from: ComplianceData.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class p {

    /* compiled from: ComplianceData.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract p a();

        public abstract a b(s sVar);

        public abstract a c(b bVar);
    }

    /* compiled from: ComplianceData.java */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* renamed from: E, reason: collision with root package name */
        private static final SparseArray<b> f10985E;

        /* renamed from: B, reason: collision with root package name */
        private final int f10987B;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            f10985E = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i10) {
            this.f10987B = i10;
        }
    }

    public static a a() {
        return new f.b();
    }

    public abstract s b();

    public abstract b c();
}
