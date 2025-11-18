package A;

import A.AbstractC0812u;
import A.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4402l;
import y0.InterfaceC5112q;

/* compiled from: FlowLayoutOverflow.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010%R\"\u00106\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010%\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b7\u0010%\"\u0004\b8\u00105R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010<R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010<R\u001e\u0010A\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u0010@R\u001e\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b4\u0010@R,\u0010E\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010DR\u0014\u0010F\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"LA/v;", "", "LA/u$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(LA/u$a;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "Ls/l;", "f", "(ZII)Ls/l;", "LA/r$a;", "e", "(ZII)LA/r$a;", "Ly0/q;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "LU0/b;", "constraints", "Loa/F;", "m", "(Ly0/q;Ly0/q;ZJ)V", "LA/x;", "measurePolicy", "Ly0/H;", "l", "(LA/x;Ly0/H;Ly0/H;J)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LA/u$a;", "i", "()LA/u$a;", "b", "I", "g", "c", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "d", "getItemShown$foundation_layout_release", "k", "(I)V", "itemShown", "getItemCount$foundation_layout_release", "j", "itemCount", "Ly0/H;", "Ly0/Z;", "Ly0/Z;", "seeMorePlaceable", "h", "collapsePlaceable", "Ls/l;", "seeMoreSize", "collapseSize", "Lkotlin/Function2;", "LBa/p;", "getOverflowMeasurable", "noOfItemsShown", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.v, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class FlowLayoutOverflowState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC0812u.a type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minLinesToShowCollapse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minCrossAxisSizeToShowCollapse;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int itemShown = -1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int itemCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private y0.H seeMoreMeasurable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private y0.Z seeMorePlaceable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private y0.H collapseMeasurable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private y0.Z collapsePlaceable;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C4402l seeMoreSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C4402l collapseSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Ba.p<? super Boolean, ? super Integer, ? extends y0.H> getOverflowMeasurable;

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.v$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f232a;

        static {
            int[] iArr = new int[AbstractC0812u.a.values().length];
            try {
                iArr[AbstractC0812u.a.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0812u.a.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0812u.a.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0812u.a.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f232a = iArr;
        }
    }

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0/Z;", "placeable", "Loa/F;", "a", "(Ly0/Z;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.v$b */
    static final class b extends AbstractC3864v implements Ba.l<y0.Z, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC0815x f234C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0815x interfaceC0815x) {
            super(1);
            this.f234C = interfaceC0815x;
        }

        public final void a(y0.Z z10) {
            int iF;
            int iK;
            if (z10 != null) {
                InterfaceC0815x interfaceC0815x = this.f234C;
                iF = interfaceC0815x.f(z10);
                iK = interfaceC0815x.k(z10);
            } else {
                iF = 0;
                iK = 0;
            }
            FlowLayoutOverflowState.this.seeMoreSize = C4402l.a(C4402l.b(iF, iK));
            FlowLayoutOverflowState.this.seeMorePlaceable = z10;
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(y0.Z z10) {
            a(z10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0/Z;", "placeable", "Loa/F;", "a", "(Ly0/Z;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.v$c */
    static final class c extends AbstractC3864v implements Ba.l<y0.Z, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC0815x f236C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC0815x interfaceC0815x) {
            super(1);
            this.f236C = interfaceC0815x;
        }

        public final void a(y0.Z z10) {
            int iF;
            int iK;
            if (z10 != null) {
                InterfaceC0815x interfaceC0815x = this.f236C;
                iF = interfaceC0815x.f(z10);
                iK = interfaceC0815x.k(z10);
            } else {
                iF = 0;
                iK = 0;
            }
            FlowLayoutOverflowState.this.collapseSize = C4402l.a(C4402l.b(iF, iK));
            FlowLayoutOverflowState.this.collapsePlaceable = z10;
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(y0.Z z10) {
            a(z10);
            return C4153F.f46609a;
        }
    }

    public FlowLayoutOverflowState(AbstractC0812u.a aVar, int i10, int i11) {
        this.type = aVar;
        this.minLinesToShowCollapse = i10;
        this.minCrossAxisSizeToShowCollapse = i11;
    }

    public final r.a e(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        y0.H hInvoke;
        C4402l c4402l;
        y0.Z z10;
        y0.H h10;
        y0.Z z11;
        int i10 = a.f232a[this.type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return null;
        }
        if (i10 != 3 && i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (hasNext) {
            Ba.p<? super Boolean, ? super Integer, ? extends y0.H> pVar = this.getOverflowMeasurable;
            if (pVar == null || (hInvoke = pVar.invoke(Boolean.TRUE, Integer.valueOf(h()))) == null) {
                hInvoke = this.seeMoreMeasurable;
            }
            c4402l = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                z10 = this.seeMorePlaceable;
                h10 = hInvoke;
                z11 = z10;
            }
            h10 = hInvoke;
            z11 = null;
        } else {
            if (lineIndex < this.minLinesToShowCollapse - 1 || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                hInvoke = null;
            } else {
                Ba.p<? super Boolean, ? super Integer, ? extends y0.H> pVar2 = this.getOverflowMeasurable;
                if (pVar2 == null || (hInvoke = pVar2.invoke(Boolean.FALSE, Integer.valueOf(h()))) == null) {
                    hInvoke = this.collapseMeasurable;
                }
            }
            c4402l = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                z10 = this.collapsePlaceable;
                h10 = hInvoke;
                z11 = z10;
            }
            h10 = hInvoke;
            z11 = null;
        }
        if (h10 == null) {
            return null;
        }
        C3862t.d(c4402l);
        return new r.a(h10, z11, c4402l.getPackedValue(), false, 8, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) other;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final C4402l f(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        int i10 = a.f232a[this.type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return null;
        }
        if (i10 == 3) {
            if (hasNext) {
                return this.seeMoreSize;
            }
            return null;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (hasNext) {
            return this.seeMoreSize;
        }
        if (lineIndex + 1 < this.minLinesToShowCollapse || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
            return null;
        }
        return this.collapseSize;
    }

    /* renamed from: g, reason: from getter */
    public final int getMinLinesToShowCollapse() {
        return this.minLinesToShowCollapse;
    }

    public final int h() {
        int i10 = this.itemShown;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC0812u.a getType() {
        return this.type;
    }

    public final void j(int i10) {
        this.itemCount = i10;
    }

    public final void k(int i10) {
        this.itemShown = i10;
    }

    public final void l(InterfaceC0815x measurePolicy, y0.H seeMoreMeasurable, y0.H collapseMeasurable, long constraints) {
        J j10 = measurePolicy.j() ? J.Horizontal : J.Vertical;
        long jF = M.f(M.e(M.c(constraints, j10), 0, 0, 0, 0, 10, null), j10);
        if (seeMoreMeasurable != null) {
            C0811t.k(seeMoreMeasurable, measurePolicy, jF, new b(measurePolicy));
            this.seeMoreMeasurable = seeMoreMeasurable;
        }
        if (collapseMeasurable != null) {
            C0811t.k(collapseMeasurable, measurePolicy, jF, new c(measurePolicy));
            this.collapseMeasurable = collapseMeasurable;
        }
    }

    public final void m(InterfaceC5112q seeMoreMeasurable, InterfaceC5112q collapseMeasurable, boolean isHorizontal, long constraints) {
        long jC = M.c(constraints, isHorizontal ? J.Horizontal : J.Vertical);
        if (seeMoreMeasurable != null) {
            int i10 = C0811t.i(seeMoreMeasurable, isHorizontal, U0.b.k(jC));
            this.seeMoreSize = C4402l.a(C4402l.b(i10, C0811t.f(seeMoreMeasurable, isHorizontal, i10)));
            this.seeMoreMeasurable = seeMoreMeasurable instanceof y0.H ? (y0.H) seeMoreMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (collapseMeasurable != null) {
            int i11 = C0811t.i(collapseMeasurable, isHorizontal, U0.b.k(jC));
            this.collapseSize = C4402l.a(C4402l.b(i11, C0811t.f(collapseMeasurable, isHorizontal, i11)));
            this.collapseMeasurable = collapseMeasurable instanceof y0.H ? (y0.H) collapseMeasurable : null;
            this.collapsePlaceable = null;
        }
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }
}
