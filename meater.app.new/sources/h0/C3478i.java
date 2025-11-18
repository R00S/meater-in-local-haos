package h0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Rect.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010(\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010*R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010(\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010*R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010(\u0012\u0004\b3\u0010,\u001a\u0004\b/\u0010*R\u001a\u00106\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010*R\u001a\u00109\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010,\u001a\u0004\b7\u0010*R \u0010>\u001a\u00020:8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b=\u0010,\u001a\u0004\b;\u0010<R\u001a\u0010B\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010,\u001a\u0004\b?\u0010@R\u0017\u0010D\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bC\u0010<R\u0017\u0010E\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Lh0/i;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Lh0/g;", "offset", "q", "(J)Lh0/i;", "translateX", "translateY", "p", "(FF)Lh0/i;", "other", "m", "(Lh0/i;)Lh0/i;", "otherLeft", "otherTop", "otherRight", "otherBottom", "l", "(FFFF)Lh0/i;", "", "o", "(Lh0/i;)Z", "b", "(J)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "F", "f", "()F", "getLeft$annotations", "()V", "i", "getTop$annotations", "c", "g", "getRight$annotations", "d", "getBottom$annotations", "k", "getWidth$annotations", "width", "e", "getHeight$annotations", "height", "Lh0/m;", "h", "()J", "getSize-NH-jbRc$annotations", "size", "n", "()Z", "isEmpty$annotations", "isEmpty", "j", "topLeft", "center", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C3478i {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C3478i f42188f = new C3478i(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* compiled from: Rect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lh0/i$a;", "", "<init>", "()V", "Lh0/i;", "Zero", "Lh0/i;", "a", "()Lh0/i;", "getZero$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h0.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C3478i a() {
            return C3478i.f42188f;
        }

        private Companion() {
        }
    }

    public C3478i(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public final boolean b(long offset) {
        return C3476g.m(offset) >= this.left && C3476g.m(offset) < this.right && C3476g.n(offset) >= this.top && C3476g.n(offset) < this.bottom;
    }

    /* renamed from: c, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final long d() {
        return C3477h.a(this.left + (k() / 2.0f), this.top + (e() / 2.0f));
    }

    public final float e() {
        return this.bottom - this.top;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3478i)) {
            return false;
        }
        C3478i c3478i = (C3478i) other;
        return Float.compare(this.left, c3478i.left) == 0 && Float.compare(this.top, c3478i.top) == 0 && Float.compare(this.right, c3478i.right) == 0 && Float.compare(this.bottom, c3478i.bottom) == 0;
    }

    /* renamed from: f, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: g, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final long h() {
        return C3483n.a(k(), e());
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    /* renamed from: i, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final long j() {
        return C3477h.a(this.left, this.top);
    }

    public final float k() {
        return this.right - this.left;
    }

    public final C3478i l(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new C3478i(Math.max(this.left, otherLeft), Math.max(this.top, otherTop), Math.min(this.right, otherRight), Math.min(this.bottom, otherBottom));
    }

    public final C3478i m(C3478i other) {
        return new C3478i(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean n() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean o(C3478i other) {
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    public final C3478i p(float translateX, float translateY) {
        return new C3478i(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public final C3478i q(long offset) {
        return new C3478i(this.left + C3476g.m(offset), this.top + C3476g.n(offset), this.right + C3476g.m(offset), this.bottom + C3476g.n(offset));
    }

    public String toString() {
        return "Rect.fromLTRB(" + C3472c.a(this.left, 1) + ", " + C3472c.a(this.top, 1) + ", " + C3472c.a(this.right, 1) + ", " + C3472c.a(this.bottom, 1) + ')';
    }
}
