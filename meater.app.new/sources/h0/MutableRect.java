package h0;

import kotlin.Metadata;

/* compiled from: MutableRect.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\bJ-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lh0/e;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Loa/F;", "e", "g", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "i", "(F)V", "d", "k", "c", "j", "h", "", "f", "()Z", "isEmpty", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h0.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class MutableRect {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    public MutableRect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    /* renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: c, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: d, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final void e(float left, float top, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    public final boolean f() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void g(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final void h(float f10) {
        this.bottom = f10;
    }

    public final void i(float f10) {
        this.left = f10;
    }

    public final void j(float f10) {
        this.right = f10;
    }

    public final void k(float f10) {
        this.top = f10;
    }

    public String toString() {
        return "MutableRect(" + C3472c.a(this.left, 1) + ", " + C3472c.a(this.top, 1) + ", " + C3472c.a(this.right, 1) + ", " + C3472c.a(this.bottom, 1) + ')';
    }
}
