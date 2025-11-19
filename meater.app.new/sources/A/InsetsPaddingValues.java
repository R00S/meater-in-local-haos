package A;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LA/F;", "LA/N;", "LA/d0;", "insets", "LU0/d;", "density", "<init>", "(LA/d0;LU0/d;)V", "LU0/t;", "layoutDirection", "LU0/h;", "a", "(LU0/t;)F", "d", "()F", "c", "b", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LA/d0;", "getInsets", "()LA/d0;", "LU0/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.F, reason: from toString */
/* loaded from: classes.dex */
final class InsetsPaddingValues implements N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 insets;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final U0.d density;

    public InsetsPaddingValues(d0 d0Var, U0.d dVar) {
        this.insets = d0Var;
        this.density = dVar;
    }

    @Override // A.N
    public float a(U0.t layoutDirection) {
        U0.d dVar = this.density;
        return dVar.E0(this.insets.c(dVar, layoutDirection));
    }

    @Override // A.N
    /* renamed from: b */
    public float getBottom() {
        U0.d dVar = this.density;
        return dVar.E0(this.insets.d(dVar));
    }

    @Override // A.N
    public float c(U0.t layoutDirection) {
        U0.d dVar = this.density;
        return dVar.E0(this.insets.a(dVar, layoutDirection));
    }

    @Override // A.N
    /* renamed from: d */
    public float getTop() {
        U0.d dVar = this.density;
        return dVar.E0(this.insets.b(dVar));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) other;
        return C3862t.b(this.insets, insetsPaddingValues.insets) && C3862t.b(this.density, insetsPaddingValues.density);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
