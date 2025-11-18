package B;

import java.util.List;
import kotlin.Metadata;
import y0.Z;

/* compiled from: LazyGridMeasuredItemProvider.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Jb\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LB/w;", "LC/x;", "LB/v;", "LB/l;", "itemProvider", "LC/u;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(LB/l;LC/u;I)V", "index", "lane", "span", "LU0/b;", "constraints", "c", "(IIIJ)LB/v;", "mainAxisSpacing", "d", "(IJIII)LB/v;", "", "key", "contentType", "crossAxisSize", "", "Ly0/Z;", "placeables", "b", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LB/v;", "a", "LB/l;", "LC/u;", "I", "Landroidx/compose/foundation/lazy/layout/c;", "e", "()Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class w implements kotlin.x<v> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l itemProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kotlin.u measureScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int defaultMainAxisSpacing;

    public w(l lVar, kotlin.u uVar, int i10) {
        this.itemProvider = lVar;
        this.measureScope = uVar;
        this.defaultMainAxisSpacing = i10;
    }

    public abstract v b(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Z> placeables, long constraints, int lane, int span);

    @Override // kotlin.x
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(int index, int lane, int span, long constraints) {
        return d(index, constraints, lane, span, this.defaultMainAxisSpacing);
    }

    public final v d(int index, long constraints, int lane, int span, int mainAxisSpacing) {
        int iM;
        Object objB = this.itemProvider.b(index);
        Object objD = this.itemProvider.d(index);
        List<Z> listF0 = this.measureScope.F0(index, constraints);
        if (U0.b.j(constraints)) {
            iM = U0.b.n(constraints);
        } else {
            if (!U0.b.i(constraints)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            iM = U0.b.m(constraints);
        }
        return b(index, objB, objD, iM, mainAxisSpacing, listF0, constraints, lane, span);
    }

    public final androidx.compose.foundation.lazy.layout.c e() {
        return this.itemProvider.e();
    }
}
