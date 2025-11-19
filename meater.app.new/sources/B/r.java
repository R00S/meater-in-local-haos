package B;

import A.C0794b;
import A.N;
import B.H;
import androidx.compose.runtime.snapshots.g;
import i0.F0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0972k;
import kotlin.C1509K0;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC5034n;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4170o;
import w.C4961f;
import y0.Z;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a{\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lb0/i;", "modifier", "LB/I;", "state", "LB/F;", "slots", "LA/N;", "contentPadding", "", "reverseLayout", "isVertical", "Lx/n;", "flingBehavior", "userScrollEnabled", "LA/b$l;", "verticalArrangement", "LA/b$d;", "horizontalArrangement", "Lkotlin/Function1;", "LB/C;", "Loa/F;", "content", "a", "(Lb0/i;LB/I;LB/F;LA/N;ZZLx/n;ZLA/b$l;LA/b$d;LBa/l;LO/l;III)V", "Lkotlin/Function0;", "LB/l;", "itemProviderLambda", "LXb/I;", "coroutineScope", "Li0/F0;", "graphicsContext", "Lkotlin/Function2;", "LC/u;", "LU0/b;", "Ly0/J;", "b", "(LBa/a;LB/I;LB/F;LA/N;ZZLA/b$d;LA/b$l;LXb/I;Li0/F0;LO/l;I)LBa/p;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* compiled from: LazyGrid.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f1295B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ I f1296C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ F f1297D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ N f1298E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f1299F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f1300G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ InterfaceC5034n f1301H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f1302I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C0794b.l f1303J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ C0794b.d f1304K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ Ba.l<C, C4153F> f1305L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f1306M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f1307N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f1308O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0.i iVar, I i10, F f10, N n10, boolean z10, boolean z11, InterfaceC5034n interfaceC5034n, boolean z12, C0794b.l lVar, C0794b.d dVar, Ba.l<? super C, C4153F> lVar2, int i11, int i12, int i13) {
            super(2);
            this.f1295B = iVar;
            this.f1296C = i10;
            this.f1297D = f10;
            this.f1298E = n10;
            this.f1299F = z10;
            this.f1300G = z11;
            this.f1301H = interfaceC5034n;
            this.f1302I = z12;
            this.f1303J = lVar;
            this.f1304K = dVar;
            this.f1305L = lVar2;
            this.f1306M = i11;
            this.f1307N = i12;
            this.f1308O = i13;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            r.a(this.f1295B, this.f1296C, this.f1297D, this.f1298E, this.f1299F, this.f1300G, this.f1301H, this.f1302I, this.f1303J, this.f1304K, this.f1305L, interfaceC1554l, C1509K0.a(this.f1306M | 1), C1509K0.a(this.f1307N), this.f1308O);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazyGrid.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LC/u;", "LU0/b;", "containerConstraints", "LB/u;", "a", "(LC/u;J)LB/u;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.p<kotlin.u, U0.b, u> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ I f1309B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f1310C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ N f1311D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f1312E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a<l> f1313F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ F f1314G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C0794b.l f1315H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ C0794b.d f1316I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ Xb.I f1317J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ F0 f1318K;

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Ly0/Z$a;", "Loa/F;", "placement", "Ly0/J;", "a", "(IILBa/l;)Ly0/J;"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.q<Integer, Integer, Ba.l<? super Z.a, ? extends C4153F>, y0.J> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ kotlin.u f1319B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ long f1320C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f1321D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f1322E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.u uVar, long j10, int i10, int i11) {
                super(3);
                this.f1319B = uVar;
                this.f1320C = j10;
                this.f1321D = i10;
                this.f1322E = i11;
            }

            public final y0.J a(int i10, int i11, Ba.l<? super Z.a, C4153F> lVar) {
                return this.f1319B.h0(U0.c.i(this.f1320C, i10 + this.f1321D), U0.c.h(this.f1320C, i11 + this.f1322E), M.h(), lVar);
            }

            @Override // Ba.q
            public /* bridge */ /* synthetic */ y0.J g(Integer num, Integer num2, Ba.l<? super Z.a, ? extends C4153F> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }
        }

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001Jb\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"B/r$b$b", "LB/w;", "", "index", "", "key", "contentType", "crossAxisSize", "mainAxisSpacing", "", "Ly0/Z;", "placeables", "LU0/b;", "constraints", "lane", "span", "LB/v;", "b", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)LB/v;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B.r$b$b, reason: collision with other inner class name */
        public static final class C0021b extends w {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.u f1323d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ I f1324e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f1325f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f1326g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f1327h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f1328i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ long f1329j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0021b(l lVar, kotlin.u uVar, int i10, I i11, boolean z10, boolean z11, int i12, int i13, long j10) {
                super(lVar, uVar, i10);
                this.f1323d = uVar;
                this.f1324e = i11;
                this.f1325f = z10;
                this.f1326g = z11;
                this.f1327h = i12;
                this.f1328i = i13;
                this.f1329j = j10;
            }

            @Override // B.w
            public v b(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends Z> placeables, long constraints, int lane, int span) {
                return new v(index, key, this.f1325f, crossAxisSize, mainAxisSpacing, this.f1326g, this.f1323d.getLayoutDirection(), this.f1327h, this.f1328i, placeables, this.f1329j, contentType, this.f1324e.r(), constraints, lane, span, null);
            }
        }

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"B/r$b$c", "LB/y;", "", "index", "", "LB/v;", "items", "", "LB/c;", "spans", "mainAxisSpacing", "LB/x;", "b", "(I[LB/v;Ljava/util/List;I)LB/x;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends y {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f1330g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ E f1331h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(boolean z10, E e10, int i10, int i11, C0021b c0021b, H h10) {
                super(z10, e10, i10, i11, c0021b, h10);
                this.f1330g = z10;
                this.f1331h = e10;
            }

            @Override // B.y
            public x b(int index, v[] items, List<C0874c> spans, int mainAxisSpacing) {
                return new x(index, items, this.f1331h, spans, this.f1330g, mainAxisSpacing);
            }
        }

        /* compiled from: LazyGrid.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "line", "Ljava/util/ArrayList;", "Loa/o;", "LU0/b;", "Lkotlin/collections/ArrayList;", "a", "(I)Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
        static final class d extends AbstractC3864v implements Ba.l<Integer, ArrayList<C4170o<? extends Integer, ? extends U0.b>>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ H f1332B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ c f1333C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(H h10, c cVar) {
                super(1);
                this.f1332B = h10;
                this.f1333C = cVar;
            }

            public final ArrayList<C4170o<Integer, U0.b>> a(int i10) {
                H.c cVarC = this.f1332B.c(i10);
                int firstItemIndex = cVarC.getFirstItemIndex();
                ArrayList<C4170o<Integer, U0.b>> arrayList = new ArrayList<>(cVarC.b().size());
                List<C0874c> listB = cVarC.b();
                c cVar = this.f1333C;
                int size = listB.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int iD = C0874c.d(listB.get(i12).getPackedValue());
                    arrayList.add(oa.v.a(Integer.valueOf(firstItemIndex), U0.b.a(cVar.a(i11, iD))));
                    firstItemIndex++;
                    i11 += iD;
                }
                return arrayList;
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ ArrayList<C4170o<? extends Integer, ? extends U0.b>> invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(I i10, boolean z10, N n10, boolean z11, Ba.a<? extends l> aVar, F f10, C0794b.l lVar, C0794b.d dVar, Xb.I i11, F0 f02) {
            super(2);
            this.f1309B = i10;
            this.f1310C = z10;
            this.f1311D = n10;
            this.f1312E = z11;
            this.f1313F = aVar;
            this.f1314G = f10;
            this.f1315H = lVar;
            this.f1316I = dVar;
            this.f1317J = i11;
            this.f1318K = f02;
        }

        public final u a(kotlin.u uVar, long j10) {
            float spacing;
            long jA;
            int iD;
            int iP;
            kotlin.J.a(this.f1309B.t());
            C4961f.a(j10, this.f1310C ? EnumC5037q.Vertical : EnumC5037q.Horizontal);
            int iI1 = this.f1310C ? uVar.i1(this.f1311D.a(uVar.getLayoutDirection())) : uVar.i1(androidx.compose.foundation.layout.o.g(this.f1311D, uVar.getLayoutDirection()));
            int iI12 = this.f1310C ? uVar.i1(this.f1311D.c(uVar.getLayoutDirection())) : uVar.i1(androidx.compose.foundation.layout.o.f(this.f1311D, uVar.getLayoutDirection()));
            int iI13 = uVar.i1(this.f1311D.getTop());
            int iI14 = uVar.i1(this.f1311D.getBottom());
            int i10 = iI13 + iI14;
            int i11 = iI1 + iI12;
            boolean z10 = this.f1310C;
            int i12 = z10 ? i10 : i11;
            int i13 = (!z10 || this.f1312E) ? (z10 && this.f1312E) ? iI14 : (z10 || this.f1312E) ? iI12 : iI1 : iI13;
            int i14 = i12 - i13;
            long jN = U0.c.n(j10, -i11, -i10);
            l lVarInvoke = this.f1313F.invoke();
            H hG = lVarInvoke.g();
            E eA = this.f1314G.a(uVar, j10);
            int length = eA.getSizes().length;
            hG.h(length);
            if (this.f1310C) {
                C0794b.l lVar = this.f1315H;
                if (lVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                spacing = lVar.getSpacing();
            } else {
                C0794b.d dVar = this.f1316I;
                if (dVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                spacing = dVar.getSpacing();
            }
            int iI15 = uVar.i1(spacing);
            int iA = lVarInvoke.a();
            int iK = this.f1310C ? U0.b.k(j10) - i10 : U0.b.l(j10) - i11;
            if (!this.f1312E || iK > 0) {
                jA = U0.o.a(iI1, iI13);
            } else {
                boolean z11 = this.f1310C;
                if (!z11) {
                    iI1 += iK;
                }
                if (z11) {
                    iI13 += iK;
                }
                jA = U0.o.a(iI1, iI13);
            }
            C0021b c0021b = new C0021b(lVarInvoke, uVar, iI15, this.f1309B, this.f1310C, this.f1312E, i13, i14, jA);
            c cVar = new c(this.f1310C, eA, iA, iI15, c0021b, hG);
            d dVar2 = new d(hG, cVar);
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            I i15 = this.f1309B;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Ba.l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
            try {
                int I10 = i15.I(lVarInvoke, i15.o());
                if (I10 < iA || iA <= 0) {
                    iD = hG.d(I10);
                    iP = i15.p();
                } else {
                    iD = hG.d(iA - 1);
                    iP = 0;
                }
                C4153F c4153f = C4153F.f46609a;
                companion.m(gVarD, gVarF, lVarH);
                u uVarD = t.d(iA, cVar, c0021b, iK, i13, i14, iI15, iD, iP, this.f1309B.getScrollToBeConsumed(), jN, this.f1310C, this.f1315H, this.f1316I, this.f1312E, uVar, this.f1309B.r(), length, C0972k.a(lVarInvoke, this.f1309B.getPinnedItems(), this.f1309B.getBeyondBoundsInfo()), this.f1317J, this.f1309B.w(), this.f1318K, dVar2, new a(uVar, j10, i11, i10));
                I.l(this.f1309B, uVarD, false, 2, null);
                return uVarD;
            } catch (Throwable th) {
                companion.m(gVarD, gVarF, lVarH);
                throw th;
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ u invoke(kotlin.u uVar, U0.b bVar) {
            return a(uVar, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b0.i r30, B.I r31, B.F r32, A.N r33, boolean r34, boolean r35, kotlin.InterfaceC5034n r36, boolean r37, A.C0794b.l r38, A.C0794b.d r39, Ba.l<? super B.C, oa.C4153F> r40, kotlin.InterfaceC1554l r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.r.a(b0.i, B.I, B.F, A.N, boolean, boolean, x.n, boolean, A.b$l, A.b$d, Ba.l, O.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final Ba.p<kotlin.u, U0.b, y0.J> b(Ba.a<? extends B.l> r17, B.I r18, B.F r19, A.N r20, boolean r21, boolean r22, A.C0794b.d r23, A.C0794b.l r24, Xb.I r25, i0.F0 r26, kotlin.InterfaceC1554l r27, int r28) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.r.b(Ba.a, B.I, B.F, A.N, boolean, boolean, A.b$d, A.b$l, Xb.I, i0.F0, O.l, int):Ba.p");
    }
}
