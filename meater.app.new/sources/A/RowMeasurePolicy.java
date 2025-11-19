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

/* compiled from: Row.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%Ji\u0010,\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J=\u00104\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J)\u00109\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J)\u0010<\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010:J)\u0010=\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010:J)\u0010>\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010:J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u0002022\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"LA/V;", "Ly0/I;", "LA/Q;", "LA/b$d;", "horizontalArrangement", "Lb0/c$c;", "verticalAlignment", "<init>", "(LA/b$d;Lb0/c$c;)V", "Ly0/Z;", "placeable", "LA/T;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "r", "(Ly0/Z;LA/T;II)I", "f", "(Ly0/Z;)I", "k", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "measureScope", "Loa/F;", "g", "(I[I[ILy0/K;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "a", "([Ly0/Z;Ly0/K;I[III[IIII)Ly0/J;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "b", "(IIIIZ)J", "Ly0/r;", "Ly0/q;", "height", "c", "(Ly0/r;Ljava/util/List;I)I", "width", "h", "d", "i", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "LA/b$d;", "Lb0/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.V, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class RowMeasurePolicy implements y0.I, Q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C0794b.d horizontalArrangement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.InterfaceC0420c verticalAlignment;

    /* compiled from: Row.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.V$a */
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ y0.Z[] f40B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ RowMeasurePolicy f41C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f42D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f43E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int[] f44F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0.Z[] zArr, RowMeasurePolicy rowMeasurePolicy, int i10, int i11, int[] iArr) {
            super(1);
            this.f40B = zArr;
            this.f41C = rowMeasurePolicy;
            this.f42D = i10;
            this.f43E = i11;
            this.f44F = iArr;
        }

        public final void a(Z.a aVar) {
            y0.Z[] zArr = this.f40B;
            RowMeasurePolicy rowMeasurePolicy = this.f41C;
            int i10 = this.f42D;
            int i11 = this.f43E;
            int[] iArr = this.f44F;
            int length = zArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                y0.Z z10 = zArr[i12];
                C3862t.d(z10);
                Z.a.h(aVar, z10, iArr[i13], rowMeasurePolicy.r(z10, P.d(z10), i10, i11), 0.0f, 4, null);
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

    public RowMeasurePolicy(C0794b.d dVar, c.InterfaceC0420c interfaceC0420c) {
        this.horizontalArrangement = dVar;
        this.verticalAlignment = interfaceC0420c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(y0.Z placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine) {
        AbstractC0805m crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize - placeable.getHeight(), U0.t.Ltr, placeable, beforeCrossAxisAlignmentLine) : this.verticalAlignment.a(0, crossAxisLayoutSize - placeable.getHeight());
    }

    @Override // A.Q
    public y0.J a(y0.Z[] placeables, y0.K measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return y0.K.E1(measureScope, mainAxisLayoutSize, crossAxisLayoutSize, null, new a(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, mainAxisPositions), 4, null);
    }

    @Override // A.Q
    public long b(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return U.a(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // y0.I
    public int c(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.d(list, i10, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    @Override // y0.I
    public int d(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.b(list, i10, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    @Override // y0.I
    public y0.J e(y0.K k10, List<? extends y0.H> list, long j10) {
        return S.a(this, U0.b.n(j10), U0.b.m(j10), U0.b.l(j10), U0.b.k(j10), k10.i1(this.horizontalArrangement.getSpacing()), k10, list, new y0.Z[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) other;
        return C3862t.b(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && C3862t.b(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    @Override // A.Q
    public int f(y0.Z z10) {
        return z10.getWidth();
    }

    @Override // A.Q
    public void g(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, y0.K measureScope) {
        this.horizontalArrangement.c(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
    }

    @Override // y0.I
    public int h(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.c(list, i10, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    @Override // y0.I
    public int i(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return H.f19a.a(list, i10, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    @Override // A.Q
    public int k(y0.Z z10) {
        return z10.getHeight();
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }
}
