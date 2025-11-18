package kotlin.reflect.p371y.internal.p374j0.p378c.p379b;

import java.io.Serializable;
import kotlin.jvm.internal.C9789g;

/* compiled from: LookupLocation.kt */
/* renamed from: kotlin.f0.y.e.j0.c.b.e */
/* loaded from: classes2.dex */
public final class C9942e implements Serializable {

    /* renamed from: f */
    public static final a f37774f = new a(null);

    /* renamed from: g */
    private static final C9942e f37775g = new C9942e(-1, -1);

    /* renamed from: h */
    private final int f37776h;

    /* renamed from: i */
    private final int f37777i;

    /* compiled from: LookupLocation.kt */
    /* renamed from: kotlin.f0.y.e.j0.c.b.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C9942e m33021a() {
            return C9942e.f37775g;
        }
    }

    public C9942e(int i2, int i3) {
        this.f37776h = i2;
        this.f37777i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9942e)) {
            return false;
        }
        C9942e c9942e = (C9942e) obj;
        return this.f37776h == c9942e.f37776h && this.f37777i == c9942e.f37777i;
    }

    public int hashCode() {
        return (this.f37776h * 31) + this.f37777i;
    }

    public String toString() {
        return "Position(line=" + this.f37776h + ", column=" + this.f37777i + ')';
    }
}
