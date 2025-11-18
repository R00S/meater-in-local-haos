package A;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: BoxWithConstraints.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LA/f;", "LA/e;", "LA/c;", "LU0/d;", "density", "LU0/b;", "constraints", "<init>", "(LU0/d;JLkotlin/jvm/internal/k;)V", "Lb0/i;", "Lb0/c;", "alignment", "a", "(Lb0/i;Lb0/c;)Lb0/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LU0/d;", "b", "J", "c", "()J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final /* data */ class BoxWithConstraintsScopeImpl implements InterfaceC0797e, InterfaceC0795c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final U0.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.layout.f f120c;

    public /* synthetic */ BoxWithConstraintsScopeImpl(U0.d dVar, long j10, C3854k c3854k) {
        this(dVar, j10);
    }

    @Override // A.InterfaceC0795c
    public b0.i a(b0.i iVar, b0.c cVar) {
        return this.f120c.a(iVar, cVar);
    }

    @Override // A.InterfaceC0797e
    /* renamed from: c, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) other;
        return C3862t.b(this.density, boxWithConstraintsScopeImpl.density) && U0.b.f(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + U0.b.o(this.constraints);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) U0.b.q(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(U0.d dVar, long j10) {
        this.density = dVar;
        this.constraints = j10;
        this.f120c = androidx.compose.foundation.layout.f.f22255a;
    }
}
