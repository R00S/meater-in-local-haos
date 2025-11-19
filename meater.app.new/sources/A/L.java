package A;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"LA/L;", "LA/d0;", "insets", "LA/i0;", "sides", "<init>", "(LA/d0;ILkotlin/jvm/internal/k;)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "", "c", "(LU0/d;LU0/t;)I", "b", "(LU0/d;)I", "a", "d", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LA/d0;", "getInsets", "()LA/d0;", "I", "getSides-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class L implements d0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 insets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sides;

    public /* synthetic */ L(d0 d0Var, int i10, C3854k c3854k) {
        this(d0Var, i10);
    }

    @Override // A.d0
    public int a(U0.d density, U0.t layoutDirection) {
        if (i0.j(this.sides, layoutDirection == U0.t.Ltr ? i0.INSTANCE.c() : i0.INSTANCE.d())) {
            return this.insets.a(density, layoutDirection);
        }
        return 0;
    }

    @Override // A.d0
    public int b(U0.d density) {
        if (i0.j(this.sides, i0.INSTANCE.g())) {
            return this.insets.b(density);
        }
        return 0;
    }

    @Override // A.d0
    public int c(U0.d density, U0.t layoutDirection) {
        if (i0.j(this.sides, layoutDirection == U0.t.Ltr ? i0.INSTANCE.a() : i0.INSTANCE.b())) {
            return this.insets.c(density, layoutDirection);
        }
        return 0;
    }

    @Override // A.d0
    public int d(U0.d density) {
        if (i0.j(this.sides, i0.INSTANCE.e())) {
            return this.insets.d(density);
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof L)) {
            return false;
        }
        L l10 = (L) other;
        return C3862t.b(this.insets, l10.insets) && i0.i(this.sides, l10.sides);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + i0.k(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) i0.m(this.sides)) + ')';
    }

    private L(d0 d0Var, int i10) {
        this.insets = d0Var;
        this.sides = i10;
    }
}
