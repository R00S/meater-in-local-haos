package N;

import U0.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;

/* compiled from: WindowSizeClass.kt */
@Aa.b
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LN/d;", "", "", "value", "w", "(I)I", "other", "v", "(II)I", "", "A", "(I)Ljava/lang/String;", "z", "", "", "x", "(ILjava/lang/Object;)Z", "B", "I", "C", "a", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements Comparable<d> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final int f12208D;

    /* renamed from: E, reason: collision with root package name */
    private static final int f12209E;

    /* renamed from: F, reason: collision with root package name */
    private static final int f12210F;

    /* renamed from: G, reason: collision with root package name */
    private static final Set<d> f12211G;

    /* renamed from: H, reason: collision with root package name */
    private static final List<d> f12212H;

    /* renamed from: I, reason: collision with root package name */
    private static final Set<d> f12213I;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: WindowSizeClass.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"LN/d$a;", "", "<init>", "()V", "LN/d;", "LU0/h;", "b", "(I)F", "width", "", "supportedSizeClasses", "c", "(FLjava/util/Set;)I", "Compact", "I", "d", "()I", "Medium", "g", "Expanded", "f", "DefaultSizeClasses", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "getDefaultSizeClasses$annotations", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(int i10) {
            return d.y(i10, f()) ? h.u(840) : d.y(i10, g()) ? h.u(600) : h.u(0);
        }

        public final int c(float width, Set<d> supportedSizeClasses) {
            if (h.t(width, h.u(0)) < 0) {
                throw new IllegalArgumentException("Width must not be negative");
            }
            if (supportedSizeClasses.isEmpty()) {
                throw new IllegalArgumentException("Must support at least one size class");
            }
            int iD = d();
            List list = d.f12212H;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int value = ((d) list.get(i10)).getValue();
                if (supportedSizeClasses.contains(d.t(value))) {
                    if (h.t(width, d.INSTANCE.b(value)) >= 0) {
                        return value;
                    }
                    iD = value;
                }
            }
            return iD;
        }

        public final int d() {
            return d.f12208D;
        }

        public final Set<d> e() {
            return d.f12211G;
        }

        public final int f() {
            return d.f12210F;
        }

        public final int g() {
            return d.f12209E;
        }

        private Companion() {
        }
    }

    static {
        int iW = w(0);
        f12208D = iW;
        int iW2 = w(1);
        f12209E = iW2;
        int iW3 = w(2);
        f12210F = iW3;
        f12211G = V.g(t(iW), t(iW2), t(iW3));
        List<d> listP = r.p(t(iW3), t(iW2), t(iW));
        f12212H = listP;
        f12213I = r.b1(listP);
    }

    private /* synthetic */ d(int i10) {
        this.value = i10;
    }

    public static String A(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WindowWidthSizeClass.");
        sb2.append(y(i10, f12208D) ? "Compact" : y(i10, f12209E) ? "Medium" : y(i10, f12210F) ? "Expanded" : "");
        return sb2.toString();
    }

    public static final /* synthetic */ d t(int i10) {
        return new d(i10);
    }

    public static int v(int i10, int i11) {
        Companion companion = INSTANCE;
        return h.t(companion.b(i10), companion.b(i11));
    }

    public static boolean x(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).getValue();
    }

    public static final boolean y(int i10, int i11) {
        return i10 == i11;
    }

    public static int z(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: B, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(d dVar) {
        return u(dVar.getValue());
    }

    public boolean equals(Object obj) {
        return x(this.value, obj);
    }

    public int hashCode() {
        return z(this.value);
    }

    public String toString() {
        return A(this.value);
    }

    public int u(int i10) {
        return v(this.value, i10);
    }

    private static int w(int i10) {
        return i10;
    }
}
