package E;

import U0.t;
import h0.C3482m;
import i0.N0;
import i0.c1;
import kotlin.Metadata;

/* compiled from: CornerBasedShape.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LE/a;", "Li0/c1;", "LE/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(LE/b;LE/b;LE/b;LE/b;)V", "Lh0/m;", "size", "LU0/t;", "layoutDirection", "LU0/d;", "density", "Li0/N0;", "a", "(JLU0/t;LU0/d;)Li0/N0;", "", "e", "(JFFFFLU0/t;)Li0/N0;", "c", "(LE/b;LE/b;LE/b;LE/b;)LE/a;", "all", "b", "(LE/b;)LE/a;", "LE/b;", "i", "()LE/b;", "h", "f", "d", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a implements c1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b topStart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b topEnd;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b bottomEnd;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b bottomStart;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.topStart = bVar;
        this.topEnd = bVar2;
        this.bottomEnd = bVar3;
        this.bottomStart = bVar4;
    }

    public static /* synthetic */ a d(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            bVar = aVar.topStart;
        }
        if ((i10 & 2) != 0) {
            bVar2 = aVar.topEnd;
        }
        if ((i10 & 4) != 0) {
            bVar3 = aVar.bottomEnd;
        }
        if ((i10 & 8) != 0) {
            bVar4 = aVar.bottomStart;
        }
        return aVar.c(bVar, bVar2, bVar3, bVar4);
    }

    @Override // i0.c1
    public final N0 a(long size, t layoutDirection, U0.d density) {
        float fA = this.topStart.a(size, density);
        float fA2 = this.topEnd.a(size, density);
        float fA3 = this.bottomEnd.a(size, density);
        float fA4 = this.bottomStart.a(size, density);
        float fH = C3482m.h(size);
        float f10 = fA + fA4;
        if (f10 > fH) {
            float f11 = fH / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA4;
        float f13 = fA2 + fA3;
        if (f13 > fH) {
            float f14 = fH / f13;
            fA2 *= f14;
            fA3 *= f14;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && f12 >= 0.0f) {
            return e(size, fA, fA2, fA3, f12, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + f12 + ")!").toString());
    }

    public final a b(b all) {
        return c(all, all, all, all);
    }

    public abstract a c(b topStart, b topEnd, b bottomEnd, b bottomStart);

    public abstract N0 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, t layoutDirection);

    /* renamed from: f, reason: from getter */
    public final b getBottomEnd() {
        return this.bottomEnd;
    }

    /* renamed from: g, reason: from getter */
    public final b getBottomStart() {
        return this.bottomStart;
    }

    /* renamed from: h, reason: from getter */
    public final b getTopEnd() {
        return this.topEnd;
    }

    /* renamed from: i, reason: from getter */
    public final b getTopStart() {
        return this.topStart;
    }
}
