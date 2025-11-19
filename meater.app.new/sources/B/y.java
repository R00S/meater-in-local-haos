package B;

import B.H;
import java.util.List;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: LazyGridMeasuredLineProvider.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\"\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"LB/y;", "", "", "isVertical", "LB/E;", "slots", "", "gridItemsCount", "spaceBetweenLines", "LB/w;", "measuredItemProvider", "LB/H;", "spanLayoutProvider", "<init>", "(ZLB/E;IILB/w;LB/H;)V", "startSlot", "span", "LU0/b;", "a", "(II)J", "index", "d", "(I)I", "lineIndex", "LB/x;", "c", "(I)LB/x;", "", "LB/v;", "items", "", "LB/c;", "spans", "mainAxisSpacing", "b", "(I[LB/v;Ljava/util/List;I)LB/x;", "Z", "LB/E;", "I", "e", "LB/w;", "f", "LB/H;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final E slots;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int gridItemsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int spaceBetweenLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w measuredItemProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final H spanLayoutProvider;

    public y(boolean z10, E e10, int i10, int i11, w wVar, H h10) {
        this.isVertical = z10;
        this.slots = e10;
        this.gridItemsCount = i10;
        this.spaceBetweenLines = i11;
        this.measuredItemProvider = wVar;
        this.spanLayoutProvider = h10;
    }

    public final long a(int startSlot, int span) {
        int i10;
        if (span == 1) {
            i10 = this.slots.getSizes()[startSlot];
        } else {
            int i11 = (span + startSlot) - 1;
            i10 = (this.slots.getPositions()[i11] + this.slots.getSizes()[i11]) - this.slots.getPositions()[startSlot];
        }
        int iD = Ha.g.d(i10, 0);
        return this.isVertical ? U0.b.INSTANCE.e(iD) : U0.b.INSTANCE.d(iD);
    }

    public abstract x b(int index, v[] items, List<C0874c> spans, int mainAxisSpacing);

    public final x c(int lineIndex) {
        H.c cVarC = this.spanLayoutProvider.c(lineIndex);
        int size = cVarC.b().size();
        int i10 = (size == 0 || cVarC.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        v[] vVarArr = new v[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iD = C0874c.d(cVarC.b().get(i12).getPackedValue());
            v vVarD = this.measuredItemProvider.d(cVarC.getFirstItemIndex() + i12, a(i11, iD), i11, iD, i10);
            i11 += iD;
            C4153F c4153f = C4153F.f46609a;
            vVarArr[i12] = vVarD;
        }
        return b(lineIndex, vVarArr, cVarC.b(), i10);
    }

    public final int d(int index) {
        H h10 = this.spanLayoutProvider;
        return h10.i(index, h10.getSlotsPerLine());
    }
}
