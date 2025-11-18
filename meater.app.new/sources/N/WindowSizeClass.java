package N;

import U0.k;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: WindowSizeClass.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"LN/c;", "", "LN/d;", "widthSizeClass", "LN/b;", "heightSizeClass", "<init>", "(II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "c", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N.c, reason: from toString */
/* loaded from: classes.dex */
public final class WindowSizeClass {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int widthSizeClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int heightSizeClass;

    /* compiled from: WindowSizeClass.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"LN/c$a;", "", "<init>", "()V", "LU0/k;", "size", "", "LN/d;", "supportedWidthSizeClasses", "LN/b;", "supportedHeightSizeClasses", "LN/c;", "a", "(JLjava/util/Set;Ljava/util/Set;)LN/c;", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WindowSizeClass b(Companion companion, long j10, Set set, Set set2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                set = d.INSTANCE.e();
            }
            if ((i10 & 4) != 0) {
                set2 = b.INSTANCE.d();
            }
            return companion.a(j10, set, set2);
        }

        public final WindowSizeClass a(long size, Set<d> supportedWidthSizeClasses, Set<b> supportedHeightSizeClasses) {
            return new WindowSizeClass(d.INSTANCE.c(k.e(size), supportedWidthSizeClasses), b.INSTANCE.c(k.d(size), supportedHeightSizeClasses), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ WindowSizeClass(int i10, int i11, C3854k c3854k) {
        this(i10, i11);
    }

    /* renamed from: a, reason: from getter */
    public final int getHeightSizeClass() {
        return this.heightSizeClass;
    }

    /* renamed from: b, reason: from getter */
    public final int getWidthSizeClass() {
        return this.widthSizeClass;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WindowSizeClass.class != other.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) other;
        return d.y(this.widthSizeClass, windowSizeClass.widthSizeClass) && b.x(this.heightSizeClass, windowSizeClass.heightSizeClass);
    }

    public int hashCode() {
        return (d.z(this.widthSizeClass) * 31) + b.y(this.heightSizeClass);
    }

    public String toString() {
        return "WindowSizeClass(" + ((Object) d.A(this.widthSizeClass)) + ", " + ((Object) b.z(this.heightSizeClass)) + ')';
    }

    private WindowSizeClass(int i10, int i11) {
        this.widthSizeClass = i10;
        this.heightSizeClass = i11;
    }
}
