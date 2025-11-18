package B;

import A.C0794b;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import i0.F0;
import java.util.ArrayList;
import java.util.List;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.collections.C3830k;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4170o;
import y0.Z;

/* compiled from: LazyGridMeasure.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a¤\u0002\u0010.\u001a\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2$\u0010'\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0&0\u001d0%2*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0%\u0012\u0004\u0012\u00020+0(H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0093\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a092\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001d2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b:\u0010;\u001a-\u0010?\u001a\u00020*\"\u0004\b\u0000\u0010<*\b\u0012\u0004\u0012\u00028\u0000092\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0002¢\u0006\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"", "itemsCount", "LB/y;", "measuredLineProvider", "LB/w;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "LU0/b;", "constraints", "", "isVertical", "LA/b$l;", "verticalArrangement", "LA/b$d;", "horizontalArrangement", "reverseLayout", "LU0/d;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "LB/v;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "LXb/I;", "coroutineScope", "LC/J;", "placementScopeInvalidator", "Li0/F0;", "graphicsContext", "Lkotlin/Function1;", "Loa/o;", "prefetchInfoRetriever", "Lkotlin/Function3;", "Ly0/Z$a;", "Loa/F;", "Ly0/J;", "layout", "LB/u;", "d", "(ILB/y;LB/w;IIIIIIFJZLA/b$l;LA/b$d;ZLU0/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;LXb/I;LO/p0;Li0/F0;LBa/l;LBa/q;)LB/u;", "LB/x;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "b", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLA/b$l;LA/b$d;ZLU0/d;)Ljava/util/List;", "T", "", "arr", "a", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* compiled from: LazyGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<v> f1335B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<C4153F> f1336C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<v> list, InterfaceC1563p0<C4153F> interfaceC1563p0) {
            super(1);
            this.f1335B = list;
            this.f1336C = interfaceC1563p0;
        }

        public final void a(Z.a aVar) {
            List<v> list = this.f1335B;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).t(aVar);
            }
            kotlin.J.a(this.f1336C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    private static final <T> void a(List<T> list, T[] tArr) {
        for (T t10 : tArr) {
            list.add(t10);
        }
    }

    private static final List<v> b(List<x> list, List<v> list2, List<v> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, C0794b.l lVar, C0794b.d dVar, boolean z11, U0.d dVar2) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12 && i14 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (!z12) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int mainAxisSizeWithSpacings = i14;
                while (true) {
                    int i17 = size2 - 1;
                    v vVar = list2.get(size2);
                    mainAxisSizeWithSpacings -= vVar.getMainAxisSizeWithSpacings();
                    vVar.n(mainAxisSizeWithSpacings, 0, i10, i11);
                    arrayList.add(vVar);
                    if (i17 < 0) {
                        break;
                    }
                    size2 = i17;
                }
            }
            int size3 = list.size();
            int mainAxisSizeWithSpacings2 = i14;
            for (int i18 = 0; i18 < size3; i18++) {
                x xVar = list.get(i18);
                a(arrayList, xVar.f(mainAxisSizeWithSpacings2, i10, i11));
                mainAxisSizeWithSpacings2 += xVar.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i19 = 0; i19 < size4; i19++) {
                v vVar2 = list3.get(i19);
                vVar2.n(mainAxisSizeWithSpacings2, 0, i10, i11);
                arrayList.add(vVar2);
                mainAxisSizeWithSpacings2 += vVar2.getMainAxisSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i20 = 0; i20 < size5; i20++) {
                iArr[i20] = list.get(c(i20, z11, size5)).getMainAxisSize();
            }
            int[] iArr2 = new int[size5];
            for (int i21 = 0; i21 < size5; i21++) {
                iArr2[i21] = 0;
            }
            if (z10) {
                if (lVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement");
                }
                lVar.b(dVar2, i15, iArr, iArr2);
            } else {
                if (dVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement");
                }
                dVar.c(dVar2, i15, iArr, U0.t.Ltr, iArr2);
            }
            Ha.d dVarZ = C3831l.Z(iArr2);
            if (z11) {
                dVarZ = Ha.g.n(dVarZ);
            }
            int first = dVarZ.getFirst();
            int last = dVarZ.getLast();
            int step = dVarZ.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    x xVar2 = list.get(c(first, z11, size5));
                    if (z11) {
                        mainAxisSize = (i15 - mainAxisSize) - xVar2.getMainAxisSize();
                    }
                    a(arrayList, xVar2.f(mainAxisSize, i10, i11));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int c(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    public static final u d(int i10, y yVar, w wVar, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, C0794b.l lVar, C0794b.d dVar, boolean z11, U0.d dVar2, LazyLayoutItemAnimator<v> lazyLayoutItemAnimator, int i17, List<Integer> list, Xb.I i18, InterfaceC1563p0<C4153F> interfaceC1563p0, F0 f02, Ba.l<? super Integer, ? extends List<C4170o<Integer, U0.b>>> lVar2, Ba.q<? super Integer, ? super Integer, ? super Ba.l<? super Z.a, C4153F>, ? extends y0.J> qVar) {
        boolean z12;
        int i19;
        int mainAxisSizeWithSpacings;
        x xVar;
        int index;
        x xVar2;
        int i20;
        int i21;
        int iH;
        List<v> list2;
        int i22;
        int i23;
        float f11;
        v[] items;
        v vVar;
        int i24;
        int i25;
        if (i12 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        if (i10 <= 0) {
            int iN = U0.b.n(j10);
            int iM = U0.b.m(j10);
            lazyLayoutItemAnimator.m(0, iN, iM, new ArrayList(), wVar.e(), wVar, z10, false, i17, false, 0, 0, i18, f02);
            long jI = lazyLayoutItemAnimator.i();
            if (!U0.r.e(jI, U0.r.INSTANCE.a())) {
                iN = U0.c.i(j10, U0.r.g(jI));
                iM = U0.c.h(j10, U0.r.f(jI));
            }
            return new u(null, 0, false, 0.0f, qVar.g(Integer.valueOf(iN), Integer.valueOf(iM), a.f1334B), false, i18, dVar2, i17, lVar2, kotlin.collections.r.m(), -i12, i11 + i13, 0, z11, z10 ? EnumC5037q.Vertical : EnumC5037q.Horizontal, i13, i14);
        }
        int iRound = Math.round(f10);
        int i26 = i16 - iRound;
        if (i15 == 0 && i26 < 0) {
            iRound += i26;
            i26 = 0;
        }
        C3830k c3830k = new C3830k();
        int i27 = -i12;
        int i28 = (i14 < 0 ? i14 : 0) + i27;
        int mainAxisSizeWithSpacings2 = i26 + i28;
        int i29 = i15;
        while (mainAxisSizeWithSpacings2 < 0 && i29 > 0) {
            i29--;
            x xVarC = yVar.c(i29);
            c3830k.add(0, xVarC);
            mainAxisSizeWithSpacings2 += xVarC.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings2 < i28) {
            iRound += mainAxisSizeWithSpacings2;
            mainAxisSizeWithSpacings2 = i28;
        }
        int i30 = mainAxisSizeWithSpacings2 - i28;
        int i31 = i11 + i13;
        int i32 = i29;
        int iD = Ha.g.d(i31, 0);
        int i33 = i32;
        int mainAxisSizeWithSpacings3 = i30;
        int mainAxisSizeWithSpacings4 = -i30;
        int i34 = 0;
        boolean z13 = false;
        while (true) {
            z12 = true;
            if (i34 >= c3830k.size()) {
                break;
            }
            if (mainAxisSizeWithSpacings4 >= iD) {
                c3830k.remove(i34);
                z13 = true;
            } else {
                i33++;
                mainAxisSizeWithSpacings4 += ((x) c3830k.get(i34)).getMainAxisSizeWithSpacings();
                i34++;
            }
        }
        int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings4;
        boolean z14 = z13;
        int i35 = i33;
        int i36 = i32;
        while (i35 < i10 && (mainAxisSizeWithSpacings5 < iD || mainAxisSizeWithSpacings5 <= 0 || c3830k.isEmpty())) {
            int i37 = iD;
            x xVarC2 = yVar.c(i35);
            if (xVarC2.e()) {
                break;
            }
            mainAxisSizeWithSpacings5 += xVarC2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings5 <= i28) {
                i24 = i28;
                i25 = i36;
                if (((v) C3831l.o0(xVarC2.getItems())).getIndex() != i10 - 1) {
                    mainAxisSizeWithSpacings3 -= xVarC2.getMainAxisSizeWithSpacings();
                    i36 = i35 + 1;
                    z14 = true;
                }
                i35++;
                iD = i37;
                i28 = i24;
            } else {
                i24 = i28;
                i25 = i36;
            }
            c3830k.add(xVarC2);
            i36 = i25;
            i35++;
            iD = i37;
            i28 = i24;
        }
        int i38 = i36;
        if (mainAxisSizeWithSpacings5 < i11) {
            int i39 = i11 - mainAxisSizeWithSpacings5;
            int i40 = mainAxisSizeWithSpacings5 + i39;
            int i41 = i38;
            mainAxisSizeWithSpacings = mainAxisSizeWithSpacings3 - i39;
            while (mainAxisSizeWithSpacings < i12 && i41 > 0) {
                int i42 = i41 - 1;
                x xVarC3 = yVar.c(i42);
                c3830k.add(0, xVarC3);
                mainAxisSizeWithSpacings += xVarC3.getMainAxisSizeWithSpacings();
                i41 = i42;
            }
            iRound += i39;
            if (mainAxisSizeWithSpacings < 0) {
                iRound += mainAxisSizeWithSpacings;
                i19 = i40 + mainAxisSizeWithSpacings;
                mainAxisSizeWithSpacings = 0;
            } else {
                i19 = i40;
            }
        } else {
            i19 = mainAxisSizeWithSpacings5;
            mainAxisSizeWithSpacings = mainAxisSizeWithSpacings3;
        }
        float f12 = (Da.a.a(Math.round(f10)) != Da.a.a(iRound) || Math.abs(Math.round(f10)) < Math.abs(iRound)) ? f10 : iRound;
        if (mainAxisSizeWithSpacings < 0) {
            throw new IllegalArgumentException("negative initial offset");
        }
        int i43 = -mainAxisSizeWithSpacings;
        x xVar3 = (x) c3830k.first();
        v vVar2 = (v) C3831l.Y(xVar3.getItems());
        int index2 = vVar2 != null ? vVar2.getIndex() : 0;
        x xVar4 = (x) c3830k.y();
        if (xVar4 == null || (items = xVar4.getItems()) == null || (vVar = (v) C3831l.r0(items)) == null) {
            xVar = xVar3;
            index = 0;
        } else {
            xVar = xVar3;
            index = vVar.getIndex();
        }
        int size = list.size();
        List listM = null;
        int i44 = mainAxisSizeWithSpacings;
        List listM2 = null;
        int i45 = 0;
        while (i45 < size) {
            int i46 = size;
            int iIntValue = list.get(i45).intValue();
            if (iIntValue < 0 || iIntValue >= index2) {
                i23 = index2;
                f11 = f12;
            } else {
                i23 = index2;
                int iD2 = yVar.d(iIntValue);
                f11 = f12;
                v vVarA = wVar.a(iIntValue, 0, iD2, yVar.a(0, iD2));
                if (listM2 == null) {
                    listM2 = new ArrayList();
                }
                List list3 = listM2;
                list3.add(vVarA);
                listM2 = list3;
            }
            i45++;
            size = i46;
            index2 = i23;
            f12 = f11;
        }
        int i47 = index2;
        float f13 = f12;
        if (listM2 == null) {
            listM2 = kotlin.collections.r.m();
        }
        List list4 = listM2;
        int size2 = list.size();
        int i48 = 0;
        while (i48 < size2) {
            int iIntValue2 = list.get(i48).intValue();
            if (index + 1 > iIntValue2 || iIntValue2 >= i10) {
                i22 = index;
            } else {
                int iD3 = yVar.d(iIntValue2);
                i22 = index;
                v vVarA2 = wVar.a(iIntValue2, 0, iD3, yVar.a(0, iD3));
                if (listM == null) {
                    listM = new ArrayList();
                }
                List list5 = listM;
                list5.add(vVarA2);
                listM = list5;
            }
            i48++;
            index = i22;
        }
        int i49 = index;
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list6 = listM;
        if (i12 > 0 || i14 < 0) {
            int size3 = c3830k.size();
            x xVar5 = xVar;
            int i50 = 0;
            int i51 = i44;
            while (i50 < size3) {
                int mainAxisSizeWithSpacings6 = ((x) c3830k.get(i50)).getMainAxisSizeWithSpacings();
                if (i51 == 0 || mainAxisSizeWithSpacings6 > i51 || i50 == kotlin.collections.r.o(c3830k)) {
                    break;
                }
                i51 -= mainAxisSizeWithSpacings6;
                i50++;
                xVar5 = (x) c3830k.get(i50);
            }
            xVar2 = xVar5;
            i20 = i51;
        } else {
            xVar2 = xVar;
            i20 = i44;
        }
        int iL = z10 ? U0.b.l(j10) : U0.c.i(j10, i19);
        int iH2 = z10 ? U0.c.h(j10, i19) : U0.b.k(j10);
        int i52 = i47;
        List<v> listB = b(c3830k, list4, list6, iL, iH2, i19, i11, i43, z10, lVar, dVar, z11, dVar2);
        int i53 = i19;
        lazyLayoutItemAnimator.m((int) f13, iL, iH2, listB, wVar.e(), wVar, z10, false, i17, false, i20, i53, i18, f02);
        long jI2 = lazyLayoutItemAnimator.i();
        if (U0.r.e(jI2, U0.r.INSTANCE.a())) {
            i21 = iL;
            iH = iH2;
        } else {
            int i54 = z10 ? iH2 : iL;
            i21 = U0.c.i(j10, Math.max(iL, U0.r.g(jI2)));
            iH = U0.c.h(j10, Math.max(iH2, U0.r.f(jI2)));
            int i55 = z10 ? iH : i21;
            if (i55 != i54) {
                int size4 = listB.size();
                for (int i56 = 0; i56 < size4; i56++) {
                    listB.get(i56).v(i55);
                }
            }
        }
        if (i49 == i10 - 1 && i53 <= i11) {
            z12 = false;
        }
        y0.J jG = qVar.g(Integer.valueOf(i21), Integer.valueOf(iH), new b(listB, interfaceC1563p0));
        if (list4.isEmpty() && list6.isEmpty()) {
            list2 = listB;
        } else {
            ArrayList arrayList = new ArrayList(listB.size());
            int size5 = listB.size();
            int i57 = 0;
            while (i57 < size5) {
                v vVar3 = listB.get(i57);
                int index3 = vVar3.getIndex();
                int i58 = i52;
                if (i58 <= index3 && index3 <= i49) {
                    arrayList.add(vVar3);
                }
                i57++;
                i52 = i58;
            }
            list2 = arrayList;
        }
        return new u(xVar2, i20, z12, f13, jG, z14, i18, dVar2, i17, lVar2, list2, i27, i31, i10, z11, z10 ? EnumC5037q.Vertical : EnumC5037q.Horizontal, i13, i14);
    }

    /* compiled from: LazyGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f1334B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }

        public final void a(Z.a aVar) {
        }
    }
}
