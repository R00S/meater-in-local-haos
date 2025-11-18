package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Dp.kt */
@Aa.b
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"LU0/h;", "", "", "value", "u", "(F)F", "other", "", "t", "(FF)I", "", "y", "(F)Ljava/lang/String;", "x", "(F)I", "", "", "v", "(FLjava/lang/Object;)Z", "B", "F", "getValue", "()F", "C", "a", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final float f16733D = u(0.0f);

    /* renamed from: E, reason: collision with root package name */
    private static final float f16734E = u(Float.POSITIVE_INFINITY);

    /* renamed from: F, reason: collision with root package name */
    private static final float f16735F = u(Float.NaN);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final float value;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LU0/h$a;", "", "<init>", "()V", "LU0/h;", "Hairline", "F", "a", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "b", "getInfinity-D9Ej5fM$annotations", "Unspecified", "c", "getUnspecified-D9Ej5fM$annotations", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final float a() {
            return h.f16733D;
        }

        public final float b() {
            return h.f16734E;
        }

        public final float c() {
            return h.f16735F;
        }

        private Companion() {
        }
    }

    private /* synthetic */ h(float f10) {
        this.value = f10;
    }

    public static final /* synthetic */ h p(float f10) {
        return new h(f10);
    }

    public static int t(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static boolean v(float f10, Object obj) {
        return (obj instanceof h) && Float.compare(f10, ((h) obj).getValue()) == 0;
    }

    public static final boolean w(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int x(float f10) {
        return Float.hashCode(f10);
    }

    public static String y(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return s(hVar.getValue());
    }

    public boolean equals(Object obj) {
        return v(this.value, obj);
    }

    public int hashCode() {
        return x(this.value);
    }

    public int s(float f10) {
        return t(this.value, f10);
    }

    public String toString() {
        return y(this.value);
    }

    /* renamed from: z, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public static float u(float f10) {
        return f10;
    }
}
