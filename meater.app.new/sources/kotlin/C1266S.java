package kotlin;

import A.N;
import A.d0;
import A.f0;
import Ba.l;
import Ba.p;
import Ba.q;
import U0.h;
import U0.t;
import androidx.compose.foundation.layout.o;
import b0.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.C1303x;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;
import y0.j0;
import y0.l0;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001an\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Lb0/i;", "modifier", "Lkotlin/Function0;", "Loa/F;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "LK/x;", "floatingActionButtonPosition", "Li0/t0;", "containerColor", "contentColor", "LA/d0;", "contentWindowInsets", "Lkotlin/Function1;", "LA/N;", "content", "a", "(Lb0/i;LBa/p;LBa/p;LBa/p;LBa/p;IJJLA/d0;LBa/q;LO/l;II)V", "fabPosition", "snackbar", "fab", "b", "(ILBa/p;LBa/q;LBa/p;LBa/p;LA/d0;LBa/p;LO/l;I)V", "LU0/h;", "F", "FabSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1266S {

    /* renamed from: a, reason: collision with root package name */
    private static final float f7987a = h.u(16);

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA/d0;", "consumedWindowInsets", "Loa/F;", "a", "(LA/d0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.S$a */
    static final class a extends AbstractC3864v implements l<d0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ L.h f7988B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ d0 f7989C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L.h hVar, d0 d0Var) {
            super(1);
            this.f7988B = hVar;
            this.f7989C = d0Var;
        }

        public final void a(d0 d0Var) {
            this.f7988B.f(f0.e(this.f7989C, d0Var));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(d0 d0Var) {
            a(d0Var);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.S$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f7990B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7991C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f7992D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7993E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7994F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ L.h f7995G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7996H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, L.h hVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4) {
            super(2);
            this.f7990B = i10;
            this.f7991C = pVar;
            this.f7992D = qVar;
            this.f7993E = pVar2;
            this.f7994F = pVar3;
            this.f7995G = hVar;
            this.f7996H = pVar4;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1979205334, i10, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
            }
            C1266S.b(this.f7990B, this.f7991C, this.f7992D, this.f7993E, this.f7994F, this.f7995G, this.f7996H, interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.S$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f7997B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7998C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7999D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8000E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8001F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f8002G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f8003H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f8004I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ d0 f8005J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f8006K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f8007L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f8008M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, int i10, long j10, long j11, d0 d0Var, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i11, int i12) {
            super(2);
            this.f7997B = iVar;
            this.f7998C = pVar;
            this.f7999D = pVar2;
            this.f8000E = pVar3;
            this.f8001F = pVar4;
            this.f8002G = i10;
            this.f8003H = j10;
            this.f8004I = j11;
            this.f8005J = d0Var;
            this.f8006K = qVar;
            this.f8007L = i11;
            this.f8008M = i12;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1266S.a(this.f7997B, this.f7998C, this.f7999D, this.f8000E, this.f8001F, this.f8002G, this.f8003H, this.f8004I, this.f8005J, this.f8006K, interfaceC1554l, C1509K0.a(this.f8007L | 1), this.f8008M);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/l0;", "LU0/b;", "constraints", "Ly0/J;", "a", "(Ly0/l0;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.S$d */
    static final class d extends AbstractC3864v implements p<l0, U0.b, J> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8009B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8010C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8011D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f8012E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ d0 f8013F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8014G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f8015H;

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.S$d$a */
        static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ List<Z> f8016B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ List<Z> f8017C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ List<Z> f8018D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ List<Z> f8019E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ C1302w f8020F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ int f8021G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ int f8022H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ d0 f8023I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ l0 f8024J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ int f8025K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ int f8026L;

            /* renamed from: M, reason: collision with root package name */
            final /* synthetic */ Integer f8027M;

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ List<Z> f8028N;

            /* renamed from: O, reason: collision with root package name */
            final /* synthetic */ Integer f8029O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends Z> list, List<? extends Z> list2, List<? extends Z> list3, List<? extends Z> list4, C1302w c1302w, int i10, int i11, d0 d0Var, l0 l0Var, int i12, int i13, Integer num, List<? extends Z> list5, Integer num2) {
                super(1);
                this.f8016B = list;
                this.f8017C = list2;
                this.f8018D = list3;
                this.f8019E = list4;
                this.f8020F = c1302w;
                this.f8021G = i10;
                this.f8022H = i11;
                this.f8023I = d0Var;
                this.f8024J = l0Var;
                this.f8025K = i12;
                this.f8026L = i13;
                this.f8027M = num;
                this.f8028N = list5;
                this.f8029O = num2;
            }

            public final void a(Z.a aVar) {
                List<Z> list = this.f8016B;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Z.a.h(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
                List<Z> list2 = this.f8017C;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Z.a.h(aVar, list2.get(i11), 0, 0, 0.0f, 4, null);
                }
                List<Z> list3 = this.f8018D;
                int i12 = this.f8021G;
                int i13 = this.f8022H;
                d0 d0Var = this.f8023I;
                l0 l0Var = this.f8024J;
                int i14 = this.f8025K;
                int i15 = this.f8026L;
                int size3 = list3.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    Z.a.h(aVar, list3.get(i16), ((i12 - i13) / 2) + d0Var.c(l0Var, l0Var.getLayoutDirection()), i14 - i15, 0.0f, 4, null);
                }
                List<Z> list4 = this.f8019E;
                int i17 = this.f8025K;
                Integer num = this.f8027M;
                int size4 = list4.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    Z.a.h(aVar, list4.get(i18), 0, i17 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                C1302w c1302w = this.f8020F;
                if (c1302w != null) {
                    List<Z> list5 = this.f8028N;
                    int i19 = this.f8025K;
                    Integer num2 = this.f8029O;
                    int size5 = list5.size();
                    for (int i20 = 0; i20 < size5; i20++) {
                        Z z10 = list5.get(i20);
                        int left = c1302w.getLeft();
                        C3862t.d(num2);
                        Z.a.h(aVar, z10, left, i19 - num2.intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.S$d$b */
        static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ d0 f8030B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ l0 f8031C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ List<Z> f8032D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f8033E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ List<Z> f8034F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Integer f8035G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f8036H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(d0 d0Var, l0 l0Var, List<? extends Z> list, int i10, List<? extends Z> list2, Integer num, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
                super(2);
                this.f8030B = d0Var;
                this.f8031C = l0Var;
                this.f8032D = list;
                this.f8033E = i10;
                this.f8034F = list2;
                this.f8035G = num;
                this.f8036H = qVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                Integer num;
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-1213360416, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                }
                N nD = f0.d(this.f8030B, this.f8031C);
                this.f8036H.g(o.d(o.g(nD, this.f8031C.getLayoutDirection()), this.f8032D.isEmpty() ? nD.getTop() : this.f8031C.E0(this.f8033E), o.f(nD, this.f8031C.getLayoutDirection()), (this.f8034F.isEmpty() || (num = this.f8035G) == null) ? nD.getBottom() : this.f8031C.E0(num.intValue())), interfaceC1554l, 0);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                a(interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.S$d$c */
        static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8037B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                super(2);
                this.f8037B = pVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-2146438447, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                }
                this.f8037B.invoke(interfaceC1554l, 0);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                a(interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, int i10, d0 d0Var, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f8009B = pVar;
            this.f8010C = pVar2;
            this.f8011D = pVar3;
            this.f8012E = i10;
            this.f8013F = d0Var;
            this.f8014G = pVar4;
            this.f8015H = qVar;
        }

        public final J a(l0 l0Var, long j10) {
            Object obj;
            Object obj2;
            Object obj3;
            C1302w c1302w;
            Object obj4;
            Integer numValueOf;
            int height;
            int iD;
            Object obj5;
            Object obj6;
            int iI1;
            int iI12;
            int iL = U0.b.l(j10);
            int iK = U0.b.k(j10);
            long jD = U0.b.d(j10, 0, 0, 0, 0, 10, null);
            List<H> listO1 = l0Var.o1(EnumC1267T.TopBar, this.f8009B);
            ArrayList arrayList = new ArrayList(listO1.size());
            int size = listO1.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(listO1.get(i10).T(jD));
            }
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int height2 = ((Z) obj).getHeight();
                int iO = r.o(arrayList);
                if (1 <= iO) {
                    int i11 = 1;
                    while (true) {
                        Object obj7 = arrayList.get(i11);
                        int height3 = ((Z) obj7).getHeight();
                        if (height2 < height3) {
                            obj = obj7;
                            height2 = height3;
                        }
                        if (i11 == iO) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            Z z10 = (Z) obj;
            int height4 = z10 != null ? z10.getHeight() : 0;
            List<H> listO12 = l0Var.o1(EnumC1267T.Snackbar, this.f8010C);
            d0 d0Var = this.f8013F;
            ArrayList arrayList2 = new ArrayList(listO12.size());
            int size2 = listO12.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(listO12.get(i12).T(U0.c.n(jD, (-d0Var.c(l0Var, l0Var.getLayoutDirection())) - d0Var.a(l0Var, l0Var.getLayoutDirection()), -d0Var.d(l0Var))));
            }
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int height5 = ((Z) obj2).getHeight();
                int iO2 = r.o(arrayList2);
                if (1 <= iO2) {
                    Object obj8 = obj2;
                    int i13 = height5;
                    int i14 = 1;
                    while (true) {
                        Object obj9 = arrayList2.get(i14);
                        int height6 = ((Z) obj9).getHeight();
                        if (i13 < height6) {
                            obj8 = obj9;
                            i13 = height6;
                        }
                        if (i14 == iO2) {
                            break;
                        }
                        i14++;
                    }
                    obj2 = obj8;
                }
            }
            Z z11 = (Z) obj2;
            int height7 = z11 != null ? z11.getHeight() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int width = ((Z) obj3).getWidth();
                int iO3 = r.o(arrayList2);
                if (1 <= iO3) {
                    Object obj10 = obj3;
                    int i15 = width;
                    int i16 = 1;
                    while (true) {
                        Object obj11 = arrayList2.get(i16);
                        int width2 = ((Z) obj11).getWidth();
                        if (i15 < width2) {
                            obj10 = obj11;
                            i15 = width2;
                        }
                        if (i16 == iO3) {
                            break;
                        }
                        i16++;
                    }
                    obj3 = obj10;
                }
            }
            Z z12 = (Z) obj3;
            int width3 = z12 != null ? z12.getWidth() : 0;
            List<H> listO13 = l0Var.o1(EnumC1267T.Fab, this.f8011D);
            d0 d0Var2 = this.f8013F;
            ArrayList arrayList3 = new ArrayList(listO13.size());
            int size3 = listO13.size();
            int i17 = 0;
            while (i17 < size3) {
                List<H> list = listO13;
                int i18 = size3;
                d0 d0Var3 = d0Var2;
                Z zT = listO13.get(i17).T(U0.c.n(jD, (-d0Var2.c(l0Var, l0Var.getLayoutDirection())) - d0Var2.a(l0Var, l0Var.getLayoutDirection()), -d0Var2.d(l0Var)));
                if (zT.getHeight() == 0 || zT.getWidth() == 0) {
                    zT = null;
                }
                if (zT != null) {
                    arrayList3.add(zT);
                }
                i17++;
                d0Var2 = d0Var3;
                listO13 = list;
                size3 = i18;
            }
            if (arrayList3.isEmpty()) {
                c1302w = null;
            } else {
                if (arrayList3.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int width4 = ((Z) obj5).getWidth();
                    int iO4 = r.o(arrayList3);
                    if (1 <= iO4) {
                        Object obj12 = obj5;
                        int i19 = width4;
                        int i20 = 1;
                        while (true) {
                            Object obj13 = arrayList3.get(i20);
                            int width5 = ((Z) obj13).getWidth();
                            if (i19 < width5) {
                                obj12 = obj13;
                                i19 = width5;
                            }
                            if (i20 == iO4) {
                                break;
                            }
                            i20++;
                        }
                        obj5 = obj12;
                    }
                }
                C3862t.d(obj5);
                int width6 = ((Z) obj5).getWidth();
                if (arrayList3.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList3.get(0);
                    int height8 = ((Z) obj6).getHeight();
                    int iO5 = r.o(arrayList3);
                    if (1 <= iO5) {
                        Object obj14 = obj6;
                        int i21 = height8;
                        int i22 = 1;
                        while (true) {
                            Object obj15 = arrayList3.get(i22);
                            Object obj16 = obj14;
                            int height9 = ((Z) obj15).getHeight();
                            if (i21 < height9) {
                                i21 = height9;
                                obj14 = obj15;
                            } else {
                                obj14 = obj16;
                            }
                            if (i22 == iO5) {
                                break;
                            }
                            i22++;
                        }
                        obj6 = obj14;
                    }
                }
                C3862t.d(obj6);
                int height10 = ((Z) obj6).getHeight();
                int i23 = this.f8012E;
                C1303x.Companion companion = C1303x.INSTANCE;
                if (!C1303x.e(i23, companion.c())) {
                    if (!(C1303x.e(i23, companion.a()) ? true : C1303x.e(i23, companion.b()))) {
                        iI1 = (iL - width6) / 2;
                    } else if (l0Var.getLayoutDirection() == t.Ltr) {
                        iI12 = l0Var.i1(C1266S.f7987a);
                        iI1 = (iL - iI12) - width6;
                    } else {
                        iI1 = l0Var.i1(C1266S.f7987a);
                    }
                    c1302w = new C1302w(iI1, width6, height10);
                } else if (l0Var.getLayoutDirection() == t.Ltr) {
                    iI1 = l0Var.i1(C1266S.f7987a);
                    c1302w = new C1302w(iI1, width6, height10);
                } else {
                    iI12 = l0Var.i1(C1266S.f7987a);
                    iI1 = (iL - iI12) - width6;
                    c1302w = new C1302w(iI1, width6, height10);
                }
            }
            List<H> listO14 = l0Var.o1(EnumC1267T.BottomBar, W.c.b(-2146438447, true, new c(this.f8014G)));
            ArrayList arrayList4 = new ArrayList(listO14.size());
            int size4 = listO14.size();
            for (int i24 = 0; i24 < size4; i24++) {
                arrayList4.add(listO14.get(i24).T(jD));
            }
            if (arrayList4.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList4.get(0);
                int height11 = ((Z) obj4).getHeight();
                int iO6 = r.o(arrayList4);
                if (1 <= iO6) {
                    int i25 = 1;
                    while (true) {
                        Object obj17 = arrayList4.get(i25);
                        int height12 = ((Z) obj17).getHeight();
                        if (height11 < height12) {
                            height11 = height12;
                            obj4 = obj17;
                        }
                        if (i25 == iO6) {
                            break;
                        }
                        i25++;
                    }
                }
            }
            Z z13 = (Z) obj4;
            Integer numValueOf2 = z13 != null ? Integer.valueOf(z13.getHeight()) : null;
            if (c1302w != null) {
                int i26 = this.f8012E;
                d0 d0Var4 = this.f8013F;
                if (numValueOf2 == null || C1303x.e(i26, C1303x.INSTANCE.b())) {
                    height = c1302w.getHeight() + l0Var.i1(C1266S.f7987a);
                    iD = d0Var4.d(l0Var);
                } else {
                    height = numValueOf2.intValue() + c1302w.getHeight();
                    iD = l0Var.i1(C1266S.f7987a);
                }
                numValueOf = Integer.valueOf(height + iD);
            } else {
                numValueOf = null;
            }
            int iIntValue = height7 != 0 ? height7 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : this.f8013F.d(l0Var)) : 0;
            int i27 = width3;
            List<H> listO15 = l0Var.o1(EnumC1267T.MainContent, W.c.b(-1213360416, true, new b(this.f8013F, l0Var, arrayList, height4, arrayList4, numValueOf2, this.f8015H)));
            ArrayList arrayList5 = new ArrayList(listO15.size());
            int size5 = listO15.size();
            for (int i28 = 0; i28 < size5; i28++) {
                arrayList5.add(listO15.get(i28).T(jD));
            }
            return K.E1(l0Var, iL, iK, null, new a(arrayList5, arrayList, arrayList2, arrayList4, c1302w, iL, i27, this.f8013F, l0Var, iK, iIntValue, numValueOf2, arrayList3, numValueOf), 4, null);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ J invoke(l0 l0Var, U0.b bVar) {
            return a(l0Var, bVar.getValue());
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.S$e */
    static final class e extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f8038B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8039C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f8040D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8041E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8042F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ d0 f8043G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8044H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f8045I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, d0 d0Var, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, int i11) {
            super(2);
            this.f8038B = i10;
            this.f8039C = pVar;
            this.f8040D = qVar;
            this.f8041E = pVar2;
            this.f8042F = pVar3;
            this.f8043G = d0Var;
            this.f8044H = pVar4;
            this.f8045I = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1266S.b(this.f8038B, this.f8039C, this.f8040D, this.f8041E, this.f8042F, this.f8043G, this.f8044H, interfaceC1554l, C1509K0.a(this.f8045I | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b0.i r29, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r30, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r31, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r32, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r33, int r34, long r35, long r37, A.d0 r39, Ba.q<? super A.N, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r40, kotlin.InterfaceC1554l r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1266S.a(b0.i, Ba.p, Ba.p, Ba.p, Ba.p, int, long, long, A.d0, Ba.q, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(int i10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, d0 d0Var, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, InterfaceC1554l interfaceC1554l, int i11) {
        int i12;
        int i13;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1554lR.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1554lR.l(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1554lR.l(qVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC1554lR.l(pVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= interfaceC1554lR.l(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= interfaceC1554lR.R(d0Var) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= interfaceC1554lR.l(pVar4) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-975511942, i12, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z10 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256);
            Object objF = interfaceC1554lR.f();
            if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
                i13 = 1;
                objF = new d(pVar, pVar2, pVar3, i10, d0Var, pVar4, qVar);
                interfaceC1554lR.J(objF);
            } else {
                i13 = 1;
            }
            j0.a(null, (p) objF, interfaceC1554lR, 0, i13);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new e(i10, pVar, qVar, pVar2, pVar3, d0Var, pVar4, i11));
        }
    }
}
