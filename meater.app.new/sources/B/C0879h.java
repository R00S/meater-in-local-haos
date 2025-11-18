package B;

import A.C0794b;
import A.N;
import java.util.ArrayList;
import java.util.List;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC5034n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a{\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LB/b;", "columns", "Lb0/i;", "modifier", "LB/I;", "state", "LA/N;", "contentPadding", "", "reverseLayout", "LA/b$l;", "verticalArrangement", "LA/b$d;", "horizontalArrangement", "Lx/n;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "LB/C;", "Loa/F;", "content", "a", "(LB/b;Lb0/i;LB/I;LA/N;ZLA/b$l;LA/b$d;Lx/n;ZLBa/l;LO/l;II)V", "LB/F;", "d", "(LB/b;LA/b$d;LA/N;LO/l;I)LB/F;", "", "gridSize", "slotCount", "spacing", "", "c", "(III)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879h {

    /* compiled from: LazyGridDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B.h$a */
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC0873b f1256B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f1257C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ I f1258D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ N f1259E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f1260F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ C0794b.l f1261G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C0794b.d f1262H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ InterfaceC5034n f1263I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f1264J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ Ba.l<C, C4153F> f1265K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f1266L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f1267M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC0873b interfaceC0873b, b0.i iVar, I i10, N n10, boolean z10, C0794b.l lVar, C0794b.d dVar, InterfaceC5034n interfaceC5034n, boolean z11, Ba.l<? super C, C4153F> lVar2, int i11, int i12) {
            super(2);
            this.f1256B = interfaceC0873b;
            this.f1257C = iVar;
            this.f1258D = i10;
            this.f1259E = n10;
            this.f1260F = z10;
            this.f1261G = lVar;
            this.f1262H = dVar;
            this.f1263I = interfaceC5034n;
            this.f1264J = z11;
            this.f1265K = lVar2;
            this.f1266L = i11;
            this.f1267M = i12;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C0879h.a(this.f1256B, this.f1257C, this.f1258D, this.f1259E, this.f1260F, this.f1261G, this.f1262H, this.f1263I, this.f1264J, this.f1265K, interfaceC1554l, C1509K0.a(this.f1266L | 1), this.f1267M);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU0/d;", "LU0/b;", "constraints", "LB/E;", "a", "(LU0/d;J)LB/E;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B.h$b */
    static final class b extends AbstractC3864v implements Ba.p<U0.d, U0.b, E> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ N f1268B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC0873b f1269C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C0794b.d f1270D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N n10, InterfaceC0873b interfaceC0873b, C0794b.d dVar) {
            super(2);
            this.f1268B = n10;
            this.f1269C = interfaceC0873b;
            this.f1270D = dVar;
        }

        public final E a(U0.d dVar, long j10) {
            if (U0.b.l(j10) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
            }
            N n10 = this.f1268B;
            U0.t tVar = U0.t.Ltr;
            int iL = U0.b.l(j10) - dVar.i1(U0.h.u(androidx.compose.foundation.layout.o.g(n10, tVar) + androidx.compose.foundation.layout.o.f(this.f1268B, tVar)));
            InterfaceC0873b interfaceC0873b = this.f1269C;
            C0794b.d dVar2 = this.f1270D;
            int[] iArrV0 = kotlin.collections.r.V0(interfaceC0873b.a(dVar, iL, dVar.i1(dVar2.getSpacing())));
            int[] iArr = new int[iArrV0.length];
            dVar2.c(dVar, iL, iArrV0, tVar, iArr);
            return new E(iArrV0, iArr);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ E invoke(U0.d dVar, U0.b bVar) {
            return a(dVar, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(B.InterfaceC0873b r28, b0.i r29, B.I r30, A.N r31, boolean r32, A.C0794b.l r33, A.C0794b.d r34, kotlin.InterfaceC5034n r35, boolean r36, Ba.l<? super B.C, oa.C4153F> r37, kotlin.InterfaceC1554l r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0879h.a(B.b, b0.i, B.I, A.N, boolean, A.b$l, A.b$d, x.n, boolean, Ba.l, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> c(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    private static final F d(InterfaceC0873b interfaceC0873b, C0794b.d dVar, N n10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1632454918, i10, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.R(interfaceC0873b)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.R(dVar)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC1554l.R(n10)) || (i10 & 384) == 256);
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C0875d(new b(n10, interfaceC0873b, dVar));
            interfaceC1554l.J(objF);
        }
        F f10 = (F) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return f10;
    }
}
