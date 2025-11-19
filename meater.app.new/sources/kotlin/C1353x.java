package kotlin;

import Aa.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: FontSynthesis.kt */
@b
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"LL0/x;", "", "", "value", "c", "(I)I", "", "i", "(I)Ljava/lang/String;", "f", "other", "", "d", "(ILjava/lang/Object;)Z", "a", "I", "h", "(I)Z", "isWeightOn", "g", "isStyleOn", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f9059c = c(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f9060d = c(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f9061e = c(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f9062f = c(3);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: FontSynthesis.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"LL0/x$a;", "", "<init>", "()V", "LL0/x;", "All", "I", "a", "()I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return C1353x.f9060d;
        }

        private Companion() {
        }
    }

    private /* synthetic */ C1353x(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ C1353x b(int i10) {
        return new C1353x(i10);
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof C1353x) && i10 == ((C1353x) obj).getValue();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean g(int i10) {
        return e(i10, f9060d) || e(i10, f9062f);
    }

    public static final boolean h(int i10) {
        return e(i10, f9060d) || e(i10, f9061e);
    }

    public static String i(int i10) {
        return e(i10, f9059c) ? "None" : e(i10, f9060d) ? "All" : e(i10, f9061e) ? "Weight" : e(i10, f9062f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.value, obj);
    }

    public int hashCode() {
        return f(this.value);
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }

    public static int c(int i10) {
        return i10;
    }
}
