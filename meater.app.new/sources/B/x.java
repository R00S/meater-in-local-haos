package B;

import java.util.List;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: LazyGridMeasuredLine.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001a¨\u0006'"}, d2 = {"LB/x;", "", "", "index", "", "LB/v;", "items", "LB/E;", "slots", "", "LB/c;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[LB/v;LB/E;Ljava/util/List;ZI)V", "e", "()Z", "offset", "layoutWidth", "layoutHeight", "f", "(III)[LB/v;", "a", "I", "()I", "b", "[LB/v;", "()[LB/v;", "c", "LB/E;", "d", "Ljava/util/List;", "Z", "g", "mainAxisSize", "h", "mainAxisSizeWithSpacings", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v[] items;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final E slots;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<C0874c> spans;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    public x(int i10, v[] vVarArr, E e10, List<C0874c> list, boolean z10, int i11) {
        this.index = i10;
        this.items = vVarArr;
        this.slots = e10;
        this.spans = list;
        this.isVertical = z10;
        this.mainAxisSpacing = i11;
        int iMax = 0;
        for (v vVar : vVarArr) {
            iMax = Math.max(iMax, vVar.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = Ha.g.d(iMax + this.mainAxisSpacing, 0);
    }

    /* renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: b, reason: from getter */
    public final v[] getItems() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: d, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean e() {
        return this.items.length == 0;
    }

    public final v[] f(int offset, int layoutWidth, int layoutHeight) {
        v[] vVarArr = this.items;
        int length = vVarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            v vVar = vVarArr[i10];
            int i13 = i11 + 1;
            int iD = C0874c.d(this.spans.get(i11).getPackedValue());
            int i14 = this.slots.getPositions()[i12];
            boolean z10 = this.isVertical;
            vVar.u(offset, i14, layoutWidth, layoutHeight, z10 ? this.index : i12, z10 ? i12 : this.index);
            C4153F c4153f = C4153F.f46609a;
            i12 += iD;
            i10++;
            i11 = i13;
        }
        return this.items;
    }
}
