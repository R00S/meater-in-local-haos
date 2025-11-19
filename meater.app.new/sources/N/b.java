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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LN/b;", "", "", "value", "v", "(I)I", "other", "u", "(II)I", "", "z", "(I)Ljava/lang/String;", "y", "", "", "w", "(ILjava/lang/Object;)Z", "B", "I", "C", "a", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final int f12197D;

    /* renamed from: E, reason: collision with root package name */
    private static final int f12198E;

    /* renamed from: F, reason: collision with root package name */
    private static final int f12199F;

    /* renamed from: G, reason: collision with root package name */
    private static final Set<b> f12200G;

    /* renamed from: H, reason: collision with root package name */
    private static final List<b> f12201H;

    /* renamed from: I, reason: collision with root package name */
    private static final Set<b> f12202I;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: WindowSizeClass.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"LN/b$a;", "", "<init>", "()V", "LN/b;", "LU0/h;", "b", "(I)F", "height", "", "supportedSizeClasses", "c", "(FLjava/util/Set;)I", "Medium", "I", "f", "()I", "Expanded", "e", "DefaultSizeClasses", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "getDefaultSizeClasses$annotations", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(int i10) {
            return b.x(i10, e()) ? h.u(900) : b.x(i10, f()) ? h.u(480) : h.u(0);
        }

        public final int c(float height, Set<b> supportedSizeClasses) {
            if (h.t(height, h.u(0)) < 0) {
                throw new IllegalArgumentException("Width must not be negative");
            }
            if (supportedSizeClasses.isEmpty()) {
                throw new IllegalArgumentException("Must support at least one size class");
            }
            int iE = e();
            List list = b.f12201H;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int value = ((b) list.get(i10)).getValue();
                if (supportedSizeClasses.contains(b.s(value))) {
                    if (h.t(height, b.INSTANCE.b(value)) >= 0) {
                        return value;
                    }
                    iE = value;
                }
            }
            return iE;
        }

        public final Set<b> d() {
            return b.f12200G;
        }

        public final int e() {
            return b.f12199F;
        }

        public final int f() {
            return b.f12198E;
        }

        private Companion() {
        }
    }

    static {
        int iV = v(0);
        f12197D = iV;
        int iV2 = v(1);
        f12198E = iV2;
        int iV3 = v(2);
        f12199F = iV3;
        f12200G = V.g(s(iV), s(iV2), s(iV3));
        List<b> listP = r.p(s(iV3), s(iV2), s(iV));
        f12201H = listP;
        f12202I = r.b1(listP);
    }

    private /* synthetic */ b(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ b s(int i10) {
        return new b(i10);
    }

    public static int u(int i10, int i11) {
        Companion companion = INSTANCE;
        return h.t(companion.b(i10), companion.b(i11));
    }

    public static boolean w(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).getValue();
    }

    public static final boolean x(int i10, int i11) {
        return i10 == i11;
    }

    public static int y(int i10) {
        return Integer.hashCode(i10);
    }

    public static String z(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WindowHeightSizeClass.");
        sb2.append(x(i10, f12197D) ? "Compact" : x(i10, f12198E) ? "Medium" : x(i10, f12199F) ? "Expanded" : "");
        return sb2.toString();
    }

    /* renamed from: A, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        return t(bVar.getValue());
    }

    public boolean equals(Object obj) {
        return w(this.value, obj);
    }

    public int hashCode() {
        return y(this.value);
    }

    public int t(int i10) {
        return u(this.value, i10);
    }

    public String toString() {
        return z(this.value);
    }

    private static int v(int i10) {
        return i10;
    }
}
