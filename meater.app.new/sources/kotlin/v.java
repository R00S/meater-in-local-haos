package kotlin;

import Ba.l;
import U0.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;
import y0.f0;
import y0.l0;

/* compiled from: LazyLayoutMeasureScope.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJb\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u001d*\u00020 H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010#\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\u00020\u001a*\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010\"J\u0019\u0010+\u001a\u00020\u001a*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u001a*\u00020\u001dH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001fJ\u0019\u0010.\u001a\u00020 *\u00020\u001dH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u00020 *\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b0\u0010/J\u0016\u00103\u001a\u000202*\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\u000201*\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00104R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R<\u0010B\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0>j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0014\u0010K\u001a\u00020H8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"LC/v;", "LC/u;", "Ly0/K;", "LC/o;", "itemContentFactory", "Ly0/l0;", "subcomposeMeasureScope", "<init>", "(LC/o;Ly0/l0;)V", "", "width", "height", "", "Ly0/a;", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "Loa/F;", "rulers", "Ly0/Z$a;", "placementBlock", "Ly0/J;", "m0", "(IILjava/util/Map;LBa/l;LBa/l;)Ly0/J;", "h0", "(IILjava/util/Map;LBa/l;)Ly0/J;", "LU0/h;", "i1", "(F)I", "", "X0", "(F)F", "LU0/v;", "w1", "(J)F", "index", "LU0/b;", "constraints", "", "Ly0/Z;", "F0", "(IJ)Ljava/util/List;", "i0", "E0", "(I)F", "G0", "x", "(F)J", "s", "LU0/k;", "Lh0/m;", "t1", "(J)J", "Z", "B", "LC/o;", "C", "Ly0/l0;", "LC/q;", "D", "LC/q;", "itemProvider", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "E", "Ljava/util/HashMap;", "placeablesCache", "getDensity", "()F", "density", "R0", "fontScale", "", "U0", "()Z", "isLookingAhead", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v implements u, K {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C0976o itemContentFactory;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final l0 subcomposeMeasureScope;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final q itemProvider;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Integer, List<Z>> placeablesCache = new HashMap<>();

    public v(C0976o c0976o, l0 l0Var) {
        this.itemContentFactory = c0976o;
        this.subcomposeMeasureScope = l0Var;
        this.itemProvider = c0976o.d().invoke();
    }

    @Override // U0.d
    public float E0(int i10) {
        return this.subcomposeMeasureScope.E0(i10);
    }

    @Override // kotlin.u
    public List<Z> F0(int index, long constraints) {
        List<Z> list = this.placeablesCache.get(Integer.valueOf(index));
        if (list != null) {
            return list;
        }
        Object objB = this.itemProvider.b(index);
        List<H> listO1 = this.subcomposeMeasureScope.o1(objB, this.itemContentFactory.b(index, objB, this.itemProvider.d(index)));
        int size = listO1.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(listO1.get(i10).T(constraints));
        }
        this.placeablesCache.put(Integer.valueOf(index), arrayList);
        return arrayList;
    }

    @Override // U0.d
    public float G0(float f10) {
        return this.subcomposeMeasureScope.G0(f10);
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // y0.r
    public boolean U0() {
        return this.subcomposeMeasureScope.U0();
    }

    @Override // U0.d
    public float X0(float f10) {
        return this.subcomposeMeasureScope.X0(f10);
    }

    @Override // U0.d
    public long Z(long j10) {
        return this.subcomposeMeasureScope.Z(j10);
    }

    @Override // U0.d
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // y0.r
    public t getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // y0.K
    public J h0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, l<? super Z.a, C4153F> placementBlock) {
        return this.subcomposeMeasureScope.h0(width, height, alignmentLines, placementBlock);
    }

    @Override // U0.l
    public float i0(long j10) {
        return this.subcomposeMeasureScope.i0(j10);
    }

    @Override // U0.d
    public int i1(float f10) {
        return this.subcomposeMeasureScope.i1(f10);
    }

    @Override // y0.K
    public J m0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, l<? super f0, C4153F> rulers, l<? super Z.a, C4153F> placementBlock) {
        return this.subcomposeMeasureScope.m0(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // kotlin.u, U0.l
    public long s(float f10) {
        return this.subcomposeMeasureScope.s(f10);
    }

    @Override // U0.d
    public long t1(long j10) {
        return this.subcomposeMeasureScope.t1(j10);
    }

    @Override // U0.d
    public float w1(long j10) {
        return this.subcomposeMeasureScope.w1(j10);
    }

    @Override // kotlin.u, U0.d
    public long x(float f10) {
        return this.subcomposeMeasureScope.x(f10);
    }
}
