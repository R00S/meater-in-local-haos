package A;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"LA/o;", "LA/d0;", "included", "excluded", "<init>", "(LA/d0;LA/d0;)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "", "c", "(LU0/d;LU0/t;)I", "b", "(LU0/d;)I", "a", "d", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "LA/d0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0807o implements d0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 included;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d0 excluded;

    public C0807o(d0 d0Var, d0 d0Var2) {
        this.included = d0Var;
        this.excluded = d0Var2;
    }

    @Override // A.d0
    public int a(U0.d density, U0.t layoutDirection) {
        return Ha.g.d(this.included.a(density, layoutDirection) - this.excluded.a(density, layoutDirection), 0);
    }

    @Override // A.d0
    public int b(U0.d density) {
        return Ha.g.d(this.included.b(density) - this.excluded.b(density), 0);
    }

    @Override // A.d0
    public int c(U0.d density, U0.t layoutDirection) {
        return Ha.g.d(this.included.c(density, layoutDirection) - this.excluded.c(density, layoutDirection), 0);
    }

    @Override // A.d0
    public int d(U0.d density) {
        return Ha.g.d(this.included.d(density) - this.excluded.d(density), 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0807o)) {
            return false;
        }
        C0807o c0807o = (C0807o) other;
        return C3862t.b(c0807o.included, this.included) && C3862t.b(c0807o.excluded, this.excluded);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
