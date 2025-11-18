package kotlin;

import A.InterfaceC0801i;
import A.N;
import A.d0;
import A.f0;
import A.g0;
import Ba.l;
import Ba.p;
import Ba.q;
import U0.h;
import androidx.compose.foundation.layout.o;
import b0.i;
import i0.c1;
import java.util.List;
import kotlin.AbstractC1501G0;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.J;
import y0.Z;
import y0.j0;
import y0.l0;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0084\u0002\u0010&\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aü\u0001\u0010(\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001av\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b3\u00104\"\u0014\u00107\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"LI/y;", "drawerState", "LI/g0;", "snackbarHostState", "LI/Z;", "g", "(LI/y;LI/g0;LO/l;II)LI/Z;", "LA/d0;", "contentWindowInsets", "Lb0/i;", "modifier", "scaffoldState", "Lkotlin/Function0;", "Loa/F;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "LI/F;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "LA/i;", "drawerContent", "drawerGesturesEnabled", "Li0/c1;", "drawerShape", "LU0/h;", "drawerElevation", "Li0/t0;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "LA/N;", "content", "b", "(LA/d0;Lb0/i;LI/Z;LBa/p;LBa/p;LBa/q;LBa/p;IZLBa/q;ZLi0/c1;FJJJJJLBa/q;LO/l;III)V", "a", "(Lb0/i;LI/Z;LBa/p;LBa/p;LBa/q;LBa/p;IZLBa/q;ZLi0/c1;FJJJJJLBa/q;LO/l;III)V", "isFabDocked", "fabPosition", "snackbar", "fab", "c", "(ZILBa/p;LBa/q;LBa/p;LBa/p;LA/d0;LBa/p;LO/l;I)V", "LO/G0;", "LI/E;", "LO/G0;", "f", "()LO/G0;", "LocalFabPlacement", "F", "FabSpacing", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135X {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<C1118E> f5938a = C1576w.f(a.f5940B);

    /* renamed from: b, reason: collision with root package name */
    private static final float f5939b = h.u(16);

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI/E;", "a", "()LI/E;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.X$a */
    static final class a extends AbstractC3864v implements Ba.a<C1118E> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f5940B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1118E invoke() {
            return null;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.X$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q<i, InterfaceC1554l, Integer, C4153F> f5941B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f5941B = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1409196448, i10, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:242)");
            }
            this.f5941B.g(i.INSTANCE, interfaceC1554l, 54);
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
    /* renamed from: I.X$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ d0 f5942B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f5943C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1137Z f5944D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5945E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5946F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ q<g0, InterfaceC1554l, Integer, C4153F> f5947G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5948H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f5949I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f5950J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f5951K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ boolean f5952L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ c1 f5953M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ float f5954N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f5955O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ long f5956P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ long f5957Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ long f5958R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ long f5959S;

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f5960T;

        /* renamed from: U, reason: collision with root package name */
        final /* synthetic */ int f5961U;

        /* renamed from: V, reason: collision with root package name */
        final /* synthetic */ int f5962V;

        /* renamed from: W, reason: collision with root package name */
        final /* synthetic */ int f5963W;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d0 d0Var, i iVar, C1137Z c1137z, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, q<? super g0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, int i10, boolean z10, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar2, boolean z11, c1 c1Var, float f10, long j10, long j11, long j12, long j13, long j14, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar3, int i11, int i12, int i13) {
            super(2);
            this.f5942B = d0Var;
            this.f5943C = iVar;
            this.f5944D = c1137z;
            this.f5945E = pVar;
            this.f5946F = pVar2;
            this.f5947G = qVar;
            this.f5948H = pVar3;
            this.f5949I = i10;
            this.f5950J = z10;
            this.f5951K = qVar2;
            this.f5952L = z11;
            this.f5953M = c1Var;
            this.f5954N = f10;
            this.f5955O = j10;
            this.f5956P = j11;
            this.f5957Q = j12;
            this.f5958R = j13;
            this.f5959S = j14;
            this.f5960T = qVar3;
            this.f5961U = i11;
            this.f5962V = i12;
            this.f5963W = i13;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1135X.b(this.f5942B, this.f5943C, this.f5944D, this.f5945E, this.f5946F, this.f5947G, this.f5948H, this.f5949I, this.f5950J, this.f5951K, this.f5952L, this.f5953M, this.f5954N, this.f5955O, this.f5956P, this.f5957Q, this.f5958R, this.f5959S, this.f5960T, interfaceC1554l, C1509K0.a(this.f5961U | 1), C1509K0.a(this.f5962V), this.f5963W);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.X$d */
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f5964B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1137Z f5965C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5966D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5967E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ q<g0, InterfaceC1554l, Integer, C4153F> f5968F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5969G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f5970H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f5971I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f5972J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f5973K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ c1 f5974L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ float f5975M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ long f5976N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f5977O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ long f5978P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ long f5979Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ long f5980R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f5981S;

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ int f5982T;

        /* renamed from: U, reason: collision with root package name */
        final /* synthetic */ int f5983U;

        /* renamed from: V, reason: collision with root package name */
        final /* synthetic */ int f5984V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(i iVar, C1137Z c1137z, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, q<? super g0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, int i10, boolean z10, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar2, boolean z11, c1 c1Var, float f10, long j10, long j11, long j12, long j13, long j14, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar3, int i11, int i12, int i13) {
            super(2);
            this.f5964B = iVar;
            this.f5965C = c1137z;
            this.f5966D = pVar;
            this.f5967E = pVar2;
            this.f5968F = qVar;
            this.f5969G = pVar3;
            this.f5970H = i10;
            this.f5971I = z10;
            this.f5972J = qVar2;
            this.f5973K = z11;
            this.f5974L = c1Var;
            this.f5975M = f10;
            this.f5976N = j10;
            this.f5977O = j11;
            this.f5978P = j12;
            this.f5979Q = j13;
            this.f5980R = j14;
            this.f5981S = qVar3;
            this.f5982T = i11;
            this.f5983U = i12;
            this.f5984V = i13;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1135X.a(this.f5964B, this.f5965C, this.f5966D, this.f5967E, this.f5968F, this.f5969G, this.f5970H, this.f5971I, this.f5972J, this.f5973K, this.f5974L, this.f5975M, this.f5976N, this.f5977O, this.f5978P, this.f5979Q, this.f5980R, this.f5981S, interfaceC1554l, C1509K0.a(this.f5982T | 1), C1509K0.a(this.f5983U), this.f5984V);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/i;", "childModifier", "Loa/F;", "a", "(Lb0/i;LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.X$e */
    static final class e extends AbstractC3864v implements q<i, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1131S f5985B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ d0 f5986C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f5987D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f5988E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f5989F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f5990G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5991H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f5992I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5993J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f5994K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ q<g0, InterfaceC1554l, Integer, C4153F> f5995L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ C1137Z f5996M;

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA/d0;", "consumedWindowInsets", "Loa/F;", "a", "(LA/d0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.X$e$a */
        static final class a extends AbstractC3864v implements l<d0, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1131S f5997B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ d0 f5998C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1131S c1131s, d0 d0Var) {
                super(1);
                this.f5997B = c1131s;
                this.f5998C = d0Var;
            }

            public final void a(d0 d0Var) {
                this.f5997B.f(f0.e(this.f5998C, d0Var));
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(d0 d0Var) {
                a(d0Var);
                return C4153F.f46609a;
            }
        }

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.X$e$b */
        static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ boolean f5999B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f6000C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6001D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f6002E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6003F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ C1131S f6004G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6005H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ q<g0, InterfaceC1554l, Integer, C4153F> f6006I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ C1137Z f6007J;

            /* compiled from: Scaffold.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.X$e$b$a */
            static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ q<g0, InterfaceC1554l, Integer, C4153F> f6008B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C1137Z f6009C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(q<? super g0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, C1137Z c1137z) {
                    super(2);
                    this.f6008B = qVar;
                    this.f6009C = c1137z;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(433906483, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:223)");
                    }
                    this.f6008B.g(this.f6009C.getSnackbarHostState(), interfaceC1554l, 0);
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
            b(boolean z10, int i10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, C1131S c1131s, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, q<? super g0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar2, C1137Z c1137z) {
                super(2);
                this.f5999B = z10;
                this.f6000C = i10;
                this.f6001D = pVar;
                this.f6002E = qVar;
                this.f6003F = pVar2;
                this.f6004G = c1131s;
                this.f6005H = pVar3;
                this.f6006I = qVar2;
                this.f6007J = c1137z;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(1772955108, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:216)");
                }
                C1135X.c(this.f5999B, this.f6000C, this.f6001D, this.f6002E, W.c.d(433906483, true, new a(this.f6006I, this.f6007J), interfaceC1554l, 54), this.f6003F, this.f6004G, this.f6005H, interfaceC1554l, 24576);
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
        e(C1131S c1131s, d0 d0Var, long j10, long j11, boolean z10, int i10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, q<? super g0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar2, C1137Z c1137z) {
            super(3);
            this.f5985B = c1131s;
            this.f5986C = d0Var;
            this.f5987D = j10;
            this.f5988E = j11;
            this.f5989F = z10;
            this.f5990G = i10;
            this.f5991H = pVar;
            this.f5992I = qVar;
            this.f5993J = pVar2;
            this.f5994K = pVar3;
            this.f5995L = qVar2;
            this.f5996M = c1137z;
        }

        public final void a(i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC1554l.R(iVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-219833176, i11, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:207)");
            }
            boolean zR = interfaceC1554l.R(this.f5985B) | interfaceC1554l.R(this.f5986C);
            C1131S c1131s = this.f5985B;
            d0 d0Var = this.f5986C;
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new a(c1131s, d0Var);
                interfaceC1554l.J(objF);
            }
            k0.a(g0.b(iVar, (l) objF), null, this.f5987D, this.f5988E, null, 0.0f, W.c.d(1772955108, true, new b(this.f5989F, this.f5990G, this.f5991H, this.f5992I, this.f5993J, this.f5985B, this.f5994K, this.f5995L, this.f5996M), interfaceC1554l, 54), interfaceC1554l, 1572864, 50);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            a(iVar, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/l0;", "LU0/b;", "constraints", "Ly0/J;", "a", "(Ly0/l0;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.X$f */
    static final class f extends AbstractC3864v implements p<l0, U0.b, J> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6010B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6011C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6012D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f6013E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f6014F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ d0 f6015G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6016H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f6017I;

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.X$f$a */
        static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ List<Z> f6018B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ List<Z> f6019C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ List<Z> f6020D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ List<Z> f6021E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ List<Z> f6022F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ int f6023G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ int f6024H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ int f6025I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ Integer f6026J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ C1118E f6027K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ Integer f6028L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends Z> list, List<? extends Z> list2, List<? extends Z> list3, List<? extends Z> list4, List<? extends Z> list5, int i10, int i11, int i12, Integer num, C1118E c1118e, Integer num2) {
                super(1);
                this.f6018B = list;
                this.f6019C = list2;
                this.f6020D = list3;
                this.f6021E = list4;
                this.f6022F = list5;
                this.f6023G = i10;
                this.f6024H = i11;
                this.f6025I = i12;
                this.f6026J = num;
                this.f6027K = c1118e;
                this.f6028L = num2;
            }

            public final void a(Z.a aVar) {
                List<Z> list = this.f6018B;
                int i10 = this.f6023G;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Z.a.h(aVar, list.get(i11), 0, i10, 0.0f, 4, null);
                }
                List<Z> list2 = this.f6019C;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Z.a.h(aVar, list2.get(i12), 0, 0, 0.0f, 4, null);
                }
                List<Z> list3 = this.f6020D;
                int i13 = this.f6024H;
                int i14 = this.f6025I;
                int size3 = list3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    Z.a.h(aVar, list3.get(i15), 0, i13 - i14, 0.0f, 4, null);
                }
                List<Z> list4 = this.f6021E;
                int i16 = this.f6024H;
                Integer num = this.f6026J;
                int size4 = list4.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    Z.a.h(aVar, list4.get(i17), 0, i16 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                List<Z> list5 = this.f6022F;
                C1118E c1118e = this.f6027K;
                int i18 = this.f6024H;
                Integer num2 = this.f6028L;
                int size5 = list5.size();
                for (int i19 = 0; i19 < size5; i19++) {
                    Z.a.h(aVar, list5.get(i19), c1118e != null ? c1118e.getLeft() : 0, i18 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
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
        /* renamed from: I.X$f$b */
        static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ d0 f6029B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ l0 f6030C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ List<Z> f6031D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ List<Z> f6032E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ Integer f6033F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f6034G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(d0 d0Var, l0 l0Var, List<? extends Z> list, List<? extends Z> list2, Integer num, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
                super(2);
                this.f6029B = d0Var;
                this.f6030C = l0Var;
                this.f6031D = list;
                this.f6032E = list2;
                this.f6033F = num;
                this.f6034G = qVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                Integer num;
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-570781649, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:510)");
                }
                N nD = f0.d(this.f6029B, this.f6030C);
                this.f6034G.g(o.d(o.g(nD, this.f6030C.getLayoutDirection()), this.f6031D.isEmpty() ? nD.getTop() : h.u(0), o.f(nD, this.f6030C.getLayoutDirection()), (this.f6032E.isEmpty() || (num = this.f6033F) == null) ? nD.getBottom() : this.f6030C.E0(num.intValue())), interfaceC1554l, 0);
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
        /* renamed from: I.X$f$c */
        static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1118E f6035B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6036C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(C1118E c1118e, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                super(2);
                this.f6035B = c1118e;
                this.f6036C = pVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(424088350, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:476)");
                }
                C1576w.a(C1135X.f().d(this.f6035B), this.f6036C, interfaceC1554l, C1503H0.f12626i);
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
        f(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, int i10, boolean z10, d0 d0Var, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f6010B = pVar;
            this.f6011C = pVar2;
            this.f6012D = pVar3;
            this.f6013E = i10;
            this.f6014F = z10;
            this.f6015G = d0Var;
            this.f6016H = pVar4;
            this.f6017I = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final y0.J a(y0.l0 r33, long r34) {
            /*
                Method dump skipped, instructions count: 903
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C1135X.f.a(y0.l0, long):y0.J");
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ J invoke(l0 l0Var, U0.b bVar) {
            return a(l0Var, bVar.getValue());
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.X$g */
    static final class g extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ boolean f6037B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f6038C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6039D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ q<N, InterfaceC1554l, Integer, C4153F> f6040E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6041F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6042G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ d0 f6043H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6044I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f6045J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(boolean z10, int i10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, d0 d0Var, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, int i11) {
            super(2);
            this.f6037B = z10;
            this.f6038C = i10;
            this.f6039D = pVar;
            this.f6040E = qVar;
            this.f6041F = pVar2;
            this.f6042G = pVar3;
            this.f6043H = d0Var;
            this.f6044I = pVar4;
            this.f6045J = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1135X.c(this.f6037B, this.f6038C, this.f6039D, this.f6040E, this.f6041F, this.f6042G, this.f6043H, this.f6044I, interfaceC1554l, C1509K0.a(this.f6045J | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b0.i r58, kotlin.C1137Z r59, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r60, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r61, Ba.q<? super kotlin.g0, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r62, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r63, int r64, boolean r65, Ba.q<? super A.InterfaceC0801i, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r66, boolean r67, i0.c1 r68, float r69, long r70, long r72, long r74, long r76, long r78, Ba.q<? super A.N, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r80, kotlin.InterfaceC1554l r81, int r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1135X.a(b0.i, I.Z, Ba.p, Ba.p, Ba.q, Ba.p, int, boolean, Ba.q, boolean, i0.c1, float, long, long, long, long, long, Ba.q, O.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(A.d0 r36, b0.i r37, kotlin.C1137Z r38, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r39, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r40, Ba.q<? super kotlin.g0, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r41, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r42, int r43, boolean r44, Ba.q<? super A.InterfaceC0801i, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r45, boolean r46, i0.c1 r47, float r48, long r49, long r51, long r53, long r55, long r57, Ba.q<? super A.N, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r59, kotlin.InterfaceC1554l r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1135X.b(A.d0, b0.i, I.Z, Ba.p, Ba.p, Ba.q, Ba.p, int, boolean, Ba.q, boolean, i0.c1, float, long, long, long, long, long, Ba.q, O.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, int i10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super N, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, d0 d0Var, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, InterfaceC1554l interfaceC1554l, int i11) {
        int i12;
        int i13;
        int i14;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-468424875);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1554lR.c(z10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1554lR.h(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1554lR.l(pVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC1554lR.l(qVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= interfaceC1554lR.l(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= interfaceC1554lR.l(pVar3) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= interfaceC1554lR.R(d0Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= interfaceC1554lR.l(pVar4) ? 8388608 : 4194304;
        }
        if ((i12 & 4793491) == 4793490 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-468424875, i12, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:390)");
            }
            boolean z11 = ((i12 & 896) == 256) | ((57344 & i12) == 16384) | ((3670016 & i12) == 1048576) | ((458752 & i12) == 131072) | ((i12 & 112) == 32) | ((i12 & 14) == 4) | ((29360128 & i12) == 8388608) | ((i12 & 7168) == 2048);
            Object objF = interfaceC1554lR.f();
            if (z11 || objF == InterfaceC1554l.INSTANCE.a()) {
                i13 = 1;
                i14 = 0;
                objF = new f(pVar, pVar2, pVar3, i10, z10, d0Var, pVar4, qVar);
                interfaceC1554lR.J(objF);
            } else {
                i13 = 1;
                i14 = 0;
            }
            j0.a(null, (p) objF, interfaceC1554lR, i14, i13);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new g(z10, i10, pVar, qVar, pVar2, pVar3, d0Var, pVar4, i11));
        }
    }

    public static final AbstractC1501G0<C1118E> f() {
        return f5938a;
    }

    public static final C1137Z g(C1162y c1162y, g0 g0Var, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            c1162y = C1161x.j(EnumC1163z.Closed, null, interfaceC1554l, 6, 2);
        }
        if ((i11 & 2) != 0) {
            Object objF = interfaceC1554l.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new g0();
                interfaceC1554l.J(objF);
            }
            g0Var = (g0) objF;
        }
        if (C1560o.J()) {
            C1560o.S(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:74)");
        }
        Object objF2 = interfaceC1554l.f();
        if (objF2 == InterfaceC1554l.INSTANCE.a()) {
            objF2 = new C1137Z(c1162y, g0Var);
            interfaceC1554l.J(objF2);
        }
        C1137Z c1137z = (C1137Z) objF2;
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1137z;
    }
}
