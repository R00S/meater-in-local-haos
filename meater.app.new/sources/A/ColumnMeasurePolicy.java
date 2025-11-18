package A;

import A.C0794b;
import b0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.InterfaceC5112q;
import y0.Z;

/* compiled from: Column.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010'\u001a\u00020&2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J=\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J,\u00106\u001a\u00020&*\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020/H\u0016ø\u0001\u0001¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010<J)\u0010?\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b?\u0010<J)\u0010@\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010<J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010K\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"LA/h;", "Ly0/I;", "LA/Q;", "LA/b$l;", "verticalArrangement", "Lb0/c$b;", "horizontalAlignment", "<init>", "(LA/b$l;Lb0/c$b;)V", "Ly0/Z;", "placeable", "LA/T;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "LU0/t;", "layoutDirection", "r", "(Ly0/Z;LA/T;IILU0/t;)I", "f", "(Ly0/Z;)I", "k", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Ly0/K;", "measureScope", "Loa/F;", "g", "(I[I[ILy0/K;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Ly0/J;", "a", "([Ly0/Z;Ly0/K;I[III[IIII)Ly0/J;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "LU0/b;", "b", "(IIIIZ)J", "", "Ly0/H;", "measurables", "constraints", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "height", "c", "(Ly0/r;Ljava/util/List;I)I", "width", "h", "d", "i", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "LA/b$l;", "Lb0/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class ColumnMeasurePolicy implements y0.I, Q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C0794b.l verticalArrangement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.b horizontalAlignment;

    /* compiled from: Column.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.h$a */
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ y0.Z[] f130B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ ColumnMeasurePolicy f131C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f132D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f133E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ y0.K f134F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int[] f135G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0.Z[] zArr, ColumnMeasurePolicy columnMeasurePolicy, int i10, int i11, y0.K k10, int[] iArr) {
            super(1);
            this.f130B = zArr;
            this.f131C = columnMeasurePolicy;
            this.f132D = i10;
            this.f133E = i11;
            this.f134F = k10;
            this.f135G = iArr;
        }

        public final void a(Z.a aVar) {
            y0.Z[] zArr = this.f130B;
            ColumnMeasurePolicy columnMeasurePolicy = this.f131C;
            int i10 = this.f132D;
            int i11 = this.f133E;
            y0.K k10 = this.f134F;
            int[] iArr = this.f135G;
            int length = zArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                y0.Z z10 = zArr[i12];
                C3862t.d(z10);
                Z.a.h(aVar, z10, columnMeasurePolicy.r(z10, P.d(z10), i10, i11, k10.getLayoutDirection()), iArr[i13], 0.0f, 4, null);
                i12++;
                i13++;
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public ColumnMeasurePolicy(C0794b.l lVar, c.b bVar) {
        this.verticalArrangement = lVar;
        this.horizontalAlignment = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(y0.Z placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine, U0.t layoutDirection) {
        AbstractC0805m crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize - placeable.getWidth(), layoutDirection, placeable, beforeCrossAxisAlignmentLine) : this.horizontalAlignment.a(0, crossAxisLayoutSize - placeable.getWidth(), layoutDirection);
    }

    @Override // A.Q
    public y0.J a(y0.Z[] placeables, y0.K measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return y0.K.E1(measureScope, crossAxisLayoutSize, mainAxisLayoutSize, null, new a(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, measureScope, mainAxisPositions), 4, null);
    }

    @Override // A.Q
    public long b(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return C0799g.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // y0.I
    public int c(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.h(list, i10, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    @Override // y0.I
    public int d(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.f(list, i10, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    @Override // y0.I
    public y0.J e(y0.K k10, List<? extends y0.H> list, long j10) {
        return S.a(this, U0.b.m(j10), U0.b.n(j10), U0.b.k(j10), U0.b.l(j10), k10.i1(this.verticalArrangement.getSpacing()), k10, list, new y0.Z[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) other;
        return C3862t.b(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && C3862t.b(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    @Override // A.Q
    public int f(y0.Z z10) {
        return z10.getHeight();
    }

    @Override // A.Q
    public void g(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, y0.K measureScope) {
        this.verticalArrangement.b(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
    }

    @Override // y0.I
    public int h(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.g(list, i10, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    @Override // y0.I
    public int i(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.e(list, i10, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    @Override // A.Q
    public int k(y0.Z z10) {
        return z10.getWidth();
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}
