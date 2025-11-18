package h0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: RoundRect.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u0018BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\n\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001e\u0010#R\u001d\u0010\u000b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001c\u0010#R\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lh0/k;", "", "", "left", "top", "right", "bottom", "Lh0/a;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "e", "()F", "b", "g", "c", "f", "d", "J", "h", "()J", "i", "j", "width", "height", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C3480k {

    /* renamed from: j, reason: collision with root package name */
    private static final C3480k f42194j = C3481l.c(0.0f, 0.0f, 0.0f, 0.0f, C3470a.INSTANCE.a());

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long topLeftCornerRadius;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long topRightCornerRadius;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long bottomRightCornerRadius;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long bottomLeftCornerRadius;

    public /* synthetic */ C3480k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, C3854k c3854k) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    /* renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: c, reason: from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    public final float d() {
        return this.bottom - this.top;
    }

    /* renamed from: e, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3480k)) {
            return false;
        }
        C3480k c3480k = (C3480k) other;
        return Float.compare(this.left, c3480k.left) == 0 && Float.compare(this.top, c3480k.top) == 0 && Float.compare(this.right, c3480k.right) == 0 && Float.compare(this.bottom, c3480k.bottom) == 0 && C3470a.c(this.topLeftCornerRadius, c3480k.topLeftCornerRadius) && C3470a.c(this.topRightCornerRadius, c3480k.topRightCornerRadius) && C3470a.c(this.bottomRightCornerRadius, c3480k.bottomRightCornerRadius) && C3470a.c(this.bottomLeftCornerRadius, c3480k.bottomLeftCornerRadius);
    }

    /* renamed from: f, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: g, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: h, reason: from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + C3470a.f(this.topLeftCornerRadius)) * 31) + C3470a.f(this.topRightCornerRadius)) * 31) + C3470a.f(this.bottomRightCornerRadius)) * 31) + C3470a.f(this.bottomLeftCornerRadius);
    }

    /* renamed from: i, reason: from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    public final float j() {
        return this.right - this.left;
    }

    public String toString() {
        long j10 = this.topLeftCornerRadius;
        long j11 = this.topRightCornerRadius;
        long j12 = this.bottomRightCornerRadius;
        long j13 = this.bottomLeftCornerRadius;
        String str = C3472c.a(this.left, 1) + ", " + C3472c.a(this.top, 1) + ", " + C3472c.a(this.right, 1) + ", " + C3472c.a(this.bottom, 1);
        if (!C3470a.c(j10, j11) || !C3470a.c(j11, j12) || !C3470a.c(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) C3470a.g(j10)) + ", topRight=" + ((Object) C3470a.g(j11)) + ", bottomRight=" + ((Object) C3470a.g(j12)) + ", bottomLeft=" + ((Object) C3470a.g(j13)) + ')';
        }
        if (C3470a.d(j10) == C3470a.e(j10)) {
            return "RoundRect(rect=" + str + ", radius=" + C3472c.a(C3470a.d(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + C3472c.a(C3470a.d(j10), 1) + ", y=" + C3472c.a(C3470a.e(j10), 1) + ')';
    }

    private C3480k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
        this.topLeftCornerRadius = j10;
        this.topRightCornerRadius = j11;
        this.bottomRightCornerRadius = j12;
        this.bottomLeftCornerRadius = j13;
    }
}
