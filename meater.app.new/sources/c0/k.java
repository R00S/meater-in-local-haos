package c0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: ContentDataType.android.kt */
@Aa.b
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00042\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lc0/k;", "", "", "dataType", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", "d", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getDataType", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f30870c = b(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f30871d = b(3);

    /* renamed from: e, reason: collision with root package name */
    private static final int f30872e = b(4);

    /* renamed from: f, reason: collision with root package name */
    private static final int f30873f = b(2);

    /* renamed from: g, reason: collision with root package name */
    private static final int f30874g = b(0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int dataType;

    /* compiled from: ContentDataType.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lc0/k$a;", "", "<init>", "()V", "Lc0/k;", "Text", "I", "a", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: c0.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return k.f30870c;
        }

        private Companion() {
        }
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof k) && i10 == ((k) obj).getDataType();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "ContentDataType(dataType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.dataType, obj);
    }

    /* renamed from: f, reason: from getter */
    public final /* synthetic */ int getDataType() {
        return this.dataType;
    }

    public int hashCode() {
        return d(this.dataType);
    }

    public String toString() {
        return e(this.dataType);
    }

    public static int b(int i10) {
        return i10;
    }
}
