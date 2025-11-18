package k0;

import i0.S0;
import i0.e1;
import i0.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: DrawScope.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u0014R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lk0/k;", "Lk0/g;", "", "width", "miter", "Li0/e1;", "cap", "Li0/f1;", "join", "Li0/S0;", "pathEffect", "<init>", "(FFIILi0/S0;Lkotlin/jvm/internal/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "e", "()F", "b", "c", "I", "d", "Li0/S0;", "()Li0/S0;", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k0.k, reason: from toString */
/* loaded from: classes.dex */
public final class Stroke extends g {

    /* renamed from: g, reason: collision with root package name */
    private static final int f43727g = e1.INSTANCE.a();

    /* renamed from: h, reason: collision with root package name */
    private static final int f43728h = f1.INSTANCE.b();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float miter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int join;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final S0 pathEffect;

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, S0 s02, C3854k c3854k) {
        this(f10, f11, i10, i11, s02);
    }

    /* renamed from: a, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* renamed from: b, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    /* renamed from: c, reason: from getter */
    public final float getMiter() {
        return this.miter;
    }

    /* renamed from: d, reason: from getter */
    public final S0 getPathEffect() {
        return this.pathEffect;
    }

    /* renamed from: e, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return this.width == stroke.width && this.miter == stroke.miter && e1.e(this.cap, stroke.cap) && f1.e(this.join, stroke.join) && C3862t.b(this.pathEffect, stroke.pathEffect);
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + e1.f(this.cap)) * 31) + f1.f(this.join)) * 31;
        S0 s02 = this.pathEffect;
        return iHashCode + (s02 != null ? s02.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) e1.g(this.cap)) + ", join=" + ((Object) f1.g(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, S0 s02, int i12, C3854k c3854k) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f43727g : i10, (i12 & 8) != 0 ? f43728h : i11, (i12 & 16) != 0 ? null : s02, null);
    }

    private Stroke(float f10, float f11, int i10, int i11, S0 s02) {
        super(null);
        this.width = f10;
        this.miter = f11;
        this.cap = i10;
        this.join = i11;
        this.pathEffect = s02;
    }
}
