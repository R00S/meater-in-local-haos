package E;

import U0.t;
import h0.C3471b;
import h0.C3478i;
import h0.C3481l;
import h0.C3483n;
import i0.N0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: RoundedCornerShape.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LE/f;", "LE/a;", "LE/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(LE/b;LE/b;LE/b;LE/b;)V", "Lh0/m;", "size", "", "LU0/t;", "layoutDirection", "Li0/N0;", "e", "(JFFFFLU0/t;)Li0/N0;", "j", "(LE/b;LE/b;LE/b;LE/b;)LE/f;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E.f, reason: from toString */
/* loaded from: classes.dex */
public final class RoundedCornerShape extends a {
    public RoundedCornerShape(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // E.a
    public N0 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, t layoutDirection) {
        if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
            return new N0.b(C3483n.c(size));
        }
        C3478i c3478iC = C3483n.c(size);
        t tVar = t.Ltr;
        return new N0.c(C3481l.b(c3478iC, C3471b.b(layoutDirection == tVar ? topStart : topEnd, 0.0f, 2, null), C3471b.b(layoutDirection == tVar ? topEnd : topStart, 0.0f, 2, null), C3471b.b(layoutDirection == tVar ? bottomEnd : bottomStart, 0.0f, 2, null), C3471b.b(layoutDirection == tVar ? bottomStart : bottomEnd, 0.0f, 2, null)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) other;
        return C3862t.b(getTopStart(), roundedCornerShape.getTopStart()) && C3862t.b(getTopEnd(), roundedCornerShape.getTopEnd()) && C3862t.b(getBottomEnd(), roundedCornerShape.getBottomEnd()) && C3862t.b(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // E.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public RoundedCornerShape c(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        return new RoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
