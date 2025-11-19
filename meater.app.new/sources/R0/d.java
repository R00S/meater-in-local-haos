package R0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Hyphens.kt */
@Aa.b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"LR0/d;", "", "", "value", "d", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f14679b = d(1);

    /* renamed from: c, reason: collision with root package name */
    private static final int f14680c = d(2);

    /* renamed from: d, reason: collision with root package name */
    private static final int f14681d = d(Integer.MIN_VALUE);

    /* compiled from: Hyphens.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LR0/d$a;", "", "<init>", "()V", "LR0/d;", "None", "I", "b", "()I", "Auto", "a", "Unspecified", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R0.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return d.f14680c;
        }

        public final int b() {
            return d.f14679b;
        }

        public final int c() {
            return d.f14681d;
        }

        private Companion() {
        }
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f14679b) ? "Hyphens.None" : e(i10, f14680c) ? "Hyphens.Auto" : e(i10, f14681d) ? "Hyphens.Unspecified" : "Invalid";
    }

    private static int d(int i10) {
        return i10;
    }
}
