package A;

import A.C0794b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.Z;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJi\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010%\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"LA/x;", "LA/Q;", "Ly0/Z;", "", "f", "(Ly0/Z;)I", "k", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "LU0/b;", "b", "(IIIIZ)J", "", "placeables", "Ly0/K;", "measureScope", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Ly0/J;", "a", "([Ly0/Z;Ly0/K;I[III[IIII)Ly0/J;", "placeable", "LA/T;", "rowColumnParentData", "LU0/t;", "layoutDirection", "m", "(Ly0/Z;LA/T;ILU0/t;I)I", "childrenMainAxisSize", "Loa/F;", "g", "(I[I[ILy0/K;)V", "j", "()Z", "isHorizontal", "LA/b$d;", "o", "()LA/b$d;", "horizontalArrangement", "LA/b$l;", "p", "()LA/b$l;", "verticalArrangement", "LA/m;", "l", "()LA/m;", "crossAxisAlignment", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0815x extends Q {

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.x$a */
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int[] f241B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f242C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f243D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f244E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ y0.Z[] f245F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC0815x f246G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f247H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ y0.K f248I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f249J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int[] f250K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int[] iArr, int i10, int i11, int i12, y0.Z[] zArr, InterfaceC0815x interfaceC0815x, int i13, y0.K k10, int i14, int[] iArr2) {
            super(1);
            this.f241B = iArr;
            this.f242C = i10;
            this.f243D = i11;
            this.f244E = i12;
            this.f245F = zArr;
            this.f246G = interfaceC0815x;
            this.f247H = i13;
            this.f248I = k10;
            this.f249J = i14;
            this.f250K = iArr2;
        }

        public final void a(Z.a aVar) {
            int[] iArr = this.f241B;
            int i10 = iArr != null ? iArr[this.f242C] : 0;
            for (int i11 = this.f243D; i11 < this.f244E; i11++) {
                y0.Z z10 = this.f245F[i11];
                C3862t.d(z10);
                int iM = this.f246G.m(z10, P.d(z10), this.f247H, this.f248I.getLayoutDirection(), this.f249J) + i10;
                if (this.f246G.j()) {
                    Z.a.h(aVar, z10, this.f250K[i11 - this.f243D], iM, 0.0f, 4, null);
                } else {
                    Z.a.h(aVar, z10, iM, this.f250K[i11 - this.f243D], 0.0f, 4, null);
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    @Override // A.Q
    default y0.J a(y0.Z[] placeables, y0.K measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        int i10;
        int i11;
        if (j()) {
            i11 = mainAxisLayoutSize;
            i10 = crossAxisLayoutSize;
        } else {
            i10 = mainAxisLayoutSize;
            i11 = crossAxisLayoutSize;
        }
        return y0.K.E1(measureScope, i11, i10, null, new a(crossAxisOffset, currentLineIndex, startIndex, endIndex, placeables, this, crossAxisLayoutSize, measureScope, beforeCrossAxisAlignmentLine, mainAxisPositions), 4, null);
    }

    @Override // A.Q
    default long b(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return j() ? U.a(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax) : C0799g.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // A.Q
    default int f(y0.Z z10) {
        return j() ? z10.y0() : z10.v0();
    }

    @Override // A.Q
    default void g(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, y0.K measureScope) {
        if (j()) {
            o().c(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        } else {
            p().b(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        }
    }

    boolean j();

    @Override // A.Q
    default int k(y0.Z z10) {
        return j() ? z10.v0() : z10.y0();
    }

    AbstractC0805m l();

    default int m(y0.Z placeable, RowColumnParentData rowColumnParentData, int crossAxisLayoutSize, U0.t layoutDirection, int beforeCrossAxisAlignmentLine) {
        AbstractC0805m abstractC0805mL;
        if (rowColumnParentData == null || (abstractC0805mL = rowColumnParentData.getCrossAxisAlignment()) == null) {
            abstractC0805mL = l();
        }
        int iK = crossAxisLayoutSize - k(placeable);
        if (j()) {
            layoutDirection = U0.t.Ltr;
        }
        return abstractC0805mL.a(iK, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    C0794b.d o();

    C0794b.l p();
}
