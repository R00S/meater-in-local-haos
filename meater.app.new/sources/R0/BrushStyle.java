package R0;

import i0.AbstractC3582j0;
import i0.C3602t0;
import i0.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"LR0/b;", "LR0/m;", "Li0/a1;", "value", "", "alpha", "<init>", "(Li0/a1;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li0/a1;", "a", "()Li0/a1;", "c", "F", "d", "()F", "Li0/t0;", "e", "()J", "color", "Li0/j0;", "h", "()Li0/j0;", "brush", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: R0.b, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class BrushStyle implements m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a1 value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    public BrushStyle(a1 a1Var, float f10) {
        this.value = a1Var;
        this.alpha = f10;
    }

    /* renamed from: a, reason: from getter */
    public final a1 getValue() {
        return this.value;
    }

    @Override // R0.m
    /* renamed from: d, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // R0.m
    /* renamed from: e */
    public long getValue() {
        return C3602t0.INSTANCE.e();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) other;
        return C3862t.b(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    @Override // R0.m
    public AbstractC3582j0 h() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.hashCode(this.alpha);
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + ')';
    }
}
