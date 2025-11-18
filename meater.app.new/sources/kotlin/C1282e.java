package kotlin;

import A.C0794b;
import A.U;
import A.W;
import A.X;
import A.d0;
import A.g0;
import A0.InterfaceC0828g;
import Ba.p;
import Ba.q;
import F0.x;
import H0.TextStyle;
import androidx.compose.foundation.layout.r;
import b0.c;
import b0.i;
import f0.C3303d;
import i0.C3602t0;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C1;
import kotlin.C1282e;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.C4751h;
import kotlin.C4761m;
import kotlin.CubicBezierEasing;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.InterfaceC4753i;
import kotlin.InterfaceC4787z;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.L;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import y0.C5097b;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\u001az\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a~\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0094\u0001\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a@\u00107\u001a\u0002062\u0006\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00132\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001022\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u000104H\u0082@¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00109\"\u001a\u0010>\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010=\"\u0014\u0010@\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00109\"\u0014\u0010A\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109\"\u001a\u0010F\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bD\u0010E\"\u0014\u0010H\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00109\"\u0014\u0010J\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00109\"\u0014\u0010L\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00109\"\u0014\u0010N\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\f\u0010O\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010P\u001a\u00020\"8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "title", "Lb0/i;", "modifier", "navigationIcon", "Lkotlin/Function1;", "LA/W;", "actions", "LU0/h;", "expandedHeight", "LA/d0;", "windowInsets", "LK/a0;", "colors", "LK/c0;", "scrollBehavior", "d", "(LBa/p;Lb0/i;LBa/p;LBa/q;FLA/d0;LK/a0;LK/c0;LO/l;II)V", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "LK/d0;", "j", "(FFFLO/l;II)LK/d0;", "LH0/J;", "titleTextStyle", "", "centeredTitle", "a", "(Lb0/i;LBa/p;LH0/J;ZLBa/p;LBa/q;FLA/d0;LK/a0;LK/c0;LO/l;II)V", "LK/U;", "scrolledOffset", "Li0/t0;", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "LA/b$l;", "titleVerticalArrangement", "LA/b$d;", "titleHorizontalArrangement", "", "titleBottomPadding", "hideTitleSemantics", "e", "(Lb0/i;LK/U;JJJLBa/p;LH0/J;FLA/b$l;LA/b$d;IZLBa/p;LBa/p;LO/l;II)V", "state", "velocity", "Lv/z;", "flingAnimationSpec", "Lv/i;", "snapAnimationSpec", "LU0/y;", "k", "(LK/d0;FLv/z;Lv/i;Lta/d;)Ljava/lang/Object;", "F", "BottomAppBarHorizontalPadding", "b", "getBottomAppBarVerticalPadding", "()F", "BottomAppBarVerticalPadding", "c", "FABHorizontalPadding", "FABVerticalPadding", "Lv/x;", "Lv/x;", "getTopTitleAlphaEasing", "()Lv/x;", "TopTitleAlphaEasing", "f", "MediumTitleBottomPadding", "g", "LargeTitleBottomPadding", "h", "TopAppBarHorizontalPadding", "i", "TopAppBarTitleInset", "colorTransitionFraction", "appBarContainerColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.e, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282e {

    /* renamed from: a, reason: collision with root package name */
    private static final float f8296a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f8297b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f8298c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f8299d;

    /* renamed from: e, reason: collision with root package name */
    private static final CubicBezierEasing f8300e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f8301f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f8302g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f8303h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f8304i;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$a */
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f8305B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f8306C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1279c0 interfaceC1279c0, float f10) {
            super(0);
            this.f8305B = interfaceC1279c0;
            this.f8306C = f10;
        }

        public final void a() {
            C1281d0 state;
            InterfaceC1279c0 interfaceC1279c0 = this.f8305B;
            if (C3862t.a((interfaceC1279c0 == null || (state = interfaceC1279c0.getState()) == null) ? null : Float.valueOf(state.e()), -this.f8306C)) {
                return;
            }
            InterfaceC1279c0 interfaceC1279c02 = this.f8305B;
            C1281d0 state2 = interfaceC1279c02 != null ? interfaceC1279c02.getState() : null;
            if (state2 == null) {
                return;
            }
            state2.i(-this.f8306C);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "b", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ d0 f8307B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f8308C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f8309D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C1275a0 f8310E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8311F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ TextStyle f8312G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f8313H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8314I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8315J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d0 d0Var, float f10, InterfaceC1279c0 interfaceC1279c0, C1275a0 c1275a0, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, TextStyle textStyle, boolean z10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3) {
            super(2);
            this.f8307B = d0Var;
            this.f8308C = f10;
            this.f8309D = interfaceC1279c0;
            this.f8310E = c1275a0;
            this.f8311F = pVar;
            this.f8312G = textStyle;
            this.f8313H = z10;
            this.f8314I = pVar2;
            this.f8315J = pVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float c(InterfaceC1279c0 interfaceC1279c0) {
            C1281d0 state;
            if (interfaceC1279c0 == null || (state = interfaceC1279c0.getState()) == null) {
                return 0.0f;
            }
            return state.d();
        }

        public final void b(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1943739546, i10, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
            }
            b0.i iVarK = r.k(C3303d.b(g0.c(b0.i.INSTANCE, this.f8307B)), 0.0f, this.f8308C, 1, null);
            boolean zR = interfaceC1554l.R(this.f8309D);
            final InterfaceC1279c0 interfaceC1279c0 = this.f8309D;
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new InterfaceC1268U() { // from class: K.f
                    @Override // kotlin.InterfaceC1268U
                    public final float a() {
                        return C1282e.b.c(interfaceC1279c0);
                    }
                };
                interfaceC1554l.J(objF);
            }
            InterfaceC1268U interfaceC1268U = (InterfaceC1268U) objF;
            long navigationIconContentColor = this.f8310E.getNavigationIconContentColor();
            long titleContentColor = this.f8310E.getTitleContentColor();
            long actionIconContentColor = this.f8310E.getActionIconContentColor();
            p<InterfaceC1554l, Integer, C4153F> pVar = this.f8311F;
            TextStyle textStyle = this.f8312G;
            C0794b c0794b = C0794b.f54a;
            C1282e.e(iVarK, interfaceC1268U, navigationIconContentColor, titleContentColor, actionIconContentColor, pVar, textStyle, 1.0f, c0794b.b(), this.f8313H ? c0794b.b() : c0794b.e(), 0, false, this.f8314I, this.f8315J, interfaceC1554l, 113246208, 3126);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            b(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.e$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f8316B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8317C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ TextStyle f8318D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f8319E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8320F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ q<W, InterfaceC1554l, Integer, C4153F> f8321G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ float f8322H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ d0 f8323I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C1275a0 f8324J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f8325K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f8326L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f8327M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(b0.i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, TextStyle textStyle, boolean z10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, float f10, d0 d0Var, C1275a0 c1275a0, InterfaceC1279c0 interfaceC1279c0, int i10, int i11) {
            super(2);
            this.f8316B = iVar;
            this.f8317C = pVar;
            this.f8318D = textStyle;
            this.f8319E = z10;
            this.f8320F = pVar2;
            this.f8321G = qVar;
            this.f8322H = f10;
            this.f8323I = d0Var;
            this.f8324J = c1275a0;
            this.f8325K = interfaceC1279c0;
            this.f8326L = i10;
            this.f8327M = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1282e.a(this.f8316B, this.f8317C, this.f8318D, this.f8319E, this.f8320F, this.f8321G, this.f8322H, this.f8323I, this.f8324J, this.f8325K, interfaceC1554l, C1509K0.a(this.f8326L | 1), this.f8327M);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$d */
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q<W, InterfaceC1554l, Integer, C4153F> f8328B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f8328B = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1370231018, i10, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
            }
            C0794b.d dVarC = C0794b.f54a.c();
            c.InterfaceC0420c interfaceC0420cI = b0.c.INSTANCE.i();
            q<W, InterfaceC1554l, Integer, C4153F> qVar = this.f8328B;
            i.Companion companion = b0.i.INSTANCE;
            I iB = U.b(dVarC, interfaceC0420cI, interfaceC1554l, 54);
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            b0.i iVarE = b0.h.e(interfaceC1554l, companion);
            InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion2.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.getInserting()) {
                interfaceC1554l.T(aVarA);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA, iB, companion2.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion2.d());
            qVar.g(X.f45a, interfaceC1554l, 6);
            interfaceC1554l.P();
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

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Loa/F;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$e */
    static final class e extends AbstractC3864v implements Ba.l<Float, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f8329B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC1279c0 interfaceC1279c0) {
            super(1);
            this.f8329B = interfaceC1279c0;
        }

        public final void a(float f10) {
            C1281d0 state = this.f8329B.getState();
            state.h(state.d() + f10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Float f10) {
            a(f10.floatValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", l = {1911}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXb/I;", "", "velocity", "Loa/F;", "<anonymous>", "(LXb/I;F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements q<Xb.I, Float, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8330B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ float f8331C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f8332D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC1279c0 interfaceC1279c0, InterfaceC4588d<? super f> interfaceC4588d) {
            super(3, interfaceC4588d);
            this.f8332D = interfaceC1279c0;
        }

        public final Object b(Xb.I i10, float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            f fVar = new f(this.f8332D, interfaceC4588d);
            fVar.f8331C = f10;
            return fVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(Xb.I i10, Float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(i10, f10.floatValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f8330B;
            if (i10 == 0) {
                C4173r.b(obj);
                float f10 = this.f8331C;
                C1281d0 state = this.f8332D.getState();
                InterfaceC4787z<Float> interfaceC4787zA = this.f8332D.a();
                InterfaceC4753i<Float> interfaceC4753iB = this.f8332D.b();
                this.f8330B = 1;
                if (C1282e.k(state, f10, interfaceC4787zA, interfaceC4753iB, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$g */
    static final class g extends AbstractC3864v implements Ba.a<Float> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f8333B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC1279c0 interfaceC1279c0) {
            super(0);
            this.f8333B = interfaceC1279c0;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            C1281d0 state;
            InterfaceC1279c0 interfaceC1279c0 = this.f8333B;
            return Float.valueOf(((interfaceC1279c0 == null || (state = interfaceC1279c0.getState()) == null) ? 0.0f : state.f()) > 0.01f ? 1.0f : 0.0f);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.e$h */
    static final class h extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8334B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f8335C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8336D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ q<W, InterfaceC1554l, Integer, C4153F> f8337E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f8338F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ d0 f8339G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C1275a0 f8340H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f8341I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f8342J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f8343K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, b0.i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, float f10, d0 d0Var, C1275a0 c1275a0, InterfaceC1279c0 interfaceC1279c0, int i10, int i11) {
            super(2);
            this.f8334B = pVar;
            this.f8335C = iVar;
            this.f8336D = pVar2;
            this.f8337E = qVar;
            this.f8338F = f10;
            this.f8339G = d0Var;
            this.f8340H = c1275a0;
            this.f8341I = interfaceC1279c0;
            this.f8342J = i10;
            this.f8343K = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1282e.d(this.f8334B, this.f8335C, this.f8336D, this.f8337E, this.f8338F, this.f8339G, this.f8340H, this.f8341I, interfaceC1554l, C1509K0.a(this.f8342J | 1), this.f8343K);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$j */
    static final class j implements I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1268U f8345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0794b.d f8346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0794b.l f8347c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8348d;

        /* compiled from: AppBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.e$j$a */
        static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Z f8349B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f8350C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Z f8351D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C0794b.d f8352E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ long f8353F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Z f8354G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ K f8355H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ C0794b.l f8356I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ int f8357J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ int f8358K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z10, int i10, Z z11, C0794b.d dVar, long j10, Z z12, K k10, C0794b.l lVar, int i11, int i12) {
                super(1);
                this.f8349B = z10;
                this.f8350C = i10;
                this.f8351D = z11;
                this.f8352E = dVar;
                this.f8353F = j10;
                this.f8354G = z12;
                this.f8355H = k10;
                this.f8356I = lVar;
                this.f8357J = i11;
                this.f8358K = i12;
            }

            public final void a(Z.a aVar) {
                int iL;
                int height;
                int height2;
                int iL2;
                Z z10 = this.f8349B;
                Z.a.l(aVar, z10, 0, (this.f8350C - z10.getHeight()) / 2, 0.0f, 4, null);
                Z z11 = this.f8351D;
                C0794b.d dVar = this.f8352E;
                C0794b c0794b = C0794b.f54a;
                if (C3862t.b(dVar, c0794b.b())) {
                    iL = (U0.b.l(this.f8353F) - this.f8351D.getWidth()) / 2;
                    if (iL < this.f8349B.getWidth()) {
                        iL2 = this.f8349B.getWidth() - iL;
                    } else if (this.f8351D.getWidth() + iL > U0.b.l(this.f8353F) - this.f8354G.getWidth()) {
                        iL2 = (U0.b.l(this.f8353F) - this.f8354G.getWidth()) - (this.f8351D.getWidth() + iL);
                    }
                    iL += iL2;
                } else {
                    iL = C3862t.b(dVar, c0794b.c()) ? (U0.b.l(this.f8353F) - this.f8351D.getWidth()) - this.f8354G.getWidth() : Math.max(this.f8355H.i1(C1282e.f8304i), this.f8349B.getWidth());
                }
                int i10 = iL;
                C0794b.l lVar = this.f8356I;
                if (!C3862t.b(lVar, c0794b.b())) {
                    if (C3862t.b(lVar, c0794b.a())) {
                        int i11 = this.f8357J;
                        if (i11 == 0) {
                            height2 = this.f8350C - this.f8351D.getHeight();
                        } else {
                            int height3 = i11 - (this.f8351D.getHeight() - this.f8358K);
                            int height4 = this.f8351D.getHeight() + height3;
                            if (height4 > U0.b.k(this.f8353F)) {
                                height3 -= height4 - U0.b.k(this.f8353F);
                            }
                            height = (this.f8350C - this.f8351D.getHeight()) - Math.max(0, height3);
                        }
                    } else {
                        height = 0;
                    }
                    Z.a.l(aVar, z11, i10, height, 0.0f, 4, null);
                    Z.a.l(aVar, this.f8354G, U0.b.l(this.f8353F) - this.f8354G.getWidth(), (this.f8350C - this.f8354G.getHeight()) / 2, 0.0f, 4, null);
                }
                height2 = (this.f8350C - this.f8351D.getHeight()) / 2;
                height = height2;
                Z.a.l(aVar, z11, i10, height, 0.0f, 4, null);
                Z.a.l(aVar, this.f8354G, U0.b.l(this.f8353F) - this.f8354G.getWidth(), (this.f8350C - this.f8354G.getHeight()) / 2, 0.0f, 4, null);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        j(InterfaceC1268U interfaceC1268U, C0794b.d dVar, C0794b.l lVar, int i10) {
            this.f8345a = interfaceC1268U;
            this.f8346b = dVar;
            this.f8347c = lVar;
            this.f8348d = i10;
        }

        @Override // y0.I
        public final J e(K k10, List<? extends H> list, long j10) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                H h10 = list.get(i10);
                if (C3862t.b(androidx.compose.ui.layout.a.a(h10), "navigationIcon")) {
                    Z zT = h10.T(U0.b.d(j10, 0, 0, 0, 0, 14, null));
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        H h11 = list.get(i11);
                        if (C3862t.b(androidx.compose.ui.layout.a.a(h11), "actionIcons")) {
                            Z zT2 = h11.T(U0.b.d(j10, 0, 0, 0, 0, 14, null));
                            int iL = U0.b.l(j10) == Integer.MAX_VALUE ? U0.b.l(j10) : Ha.g.d((U0.b.l(j10) - zT.getWidth()) - zT2.getWidth(), 0);
                            int size3 = list.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                H h12 = list.get(i12);
                                if (C3862t.b(androidx.compose.ui.layout.a.a(h12), "title")) {
                                    Z zT3 = h12.T(U0.b.d(j10, 0, iL, 0, 0, 12, null));
                                    int iJ = zT3.J(C5097b.b()) != Integer.MIN_VALUE ? zT3.J(C5097b.b()) : 0;
                                    float fA = this.f8345a.a();
                                    int iK = U0.b.k(j10) == Integer.MAX_VALUE ? U0.b.k(j10) : U0.b.k(j10) + (Float.isNaN(fA) ? 0 : Da.a.c(fA));
                                    return K.E1(k10, U0.b.l(j10), iK, null, new a(zT, iK, zT3, this.f8346b, j10, zT2, k10, this.f8347c, this.f8348d, iJ), 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.e$k */
    static final class k extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f8359B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC1268U f8360C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f8361D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f8362E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f8363F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8364G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ TextStyle f8365H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f8366I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C0794b.l f8367J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ C0794b.d f8368K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f8369L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ boolean f8370M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8371N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8372O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f8373P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ int f8374Q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(b0.i iVar, InterfaceC1268U interfaceC1268U, long j10, long j11, long j12, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, TextStyle textStyle, float f10, C0794b.l lVar, C0794b.d dVar, int i10, boolean z10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, int i11, int i12) {
            super(2);
            this.f8359B = iVar;
            this.f8360C = interfaceC1268U;
            this.f8361D = j10;
            this.f8362E = j11;
            this.f8363F = j12;
            this.f8364G = pVar;
            this.f8365H = textStyle;
            this.f8366I = f10;
            this.f8367J = lVar;
            this.f8368K = dVar;
            this.f8369L = i10;
            this.f8370M = z10;
            this.f8371N = pVar2;
            this.f8372O = pVar3;
            this.f8373P = i11;
            this.f8374Q = i12;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1282e.e(this.f8359B, this.f8360C, this.f8361D, this.f8362E, this.f8363F, this.f8364G, this.f8365H, this.f8366I, this.f8367J, this.f8368K, this.f8369L, this.f8370M, this.f8371N, this.f8372O, interfaceC1554l, C1509K0.a(this.f8373P | 1), C1509K0.a(this.f8374Q));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LK/d0;", "a", "()LK/d0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$l */
    static final class l extends AbstractC3864v implements Ba.a<C1281d0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f8375B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f8376C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f8377D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(float f10, float f11, float f12) {
            super(0);
            this.f8375B = f10;
            this.f8376C = f11;
            this.f8377D = f12;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1281d0 invoke() {
            return new C1281d0(this.f8375B, this.f8376C, this.f8377D);
        }
    }

    /* compiled from: AppBar.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {2501, 2515}, m = "settleAppBar")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.e$m */
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f8378B;

        /* renamed from: C, reason: collision with root package name */
        Object f8379C;

        /* renamed from: D, reason: collision with root package name */
        Object f8380D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f8381E;

        /* renamed from: F, reason: collision with root package name */
        int f8382F;

        m(InterfaceC4588d<? super m> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8381E = obj;
            this.f8382F |= Integer.MIN_VALUE;
            return C1282e.k(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/h;", "", "Lv/m;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$n */
    static final class n extends AbstractC3864v implements Ba.l<C4751h<Float, C4761m>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ L f8383B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1281d0 f8384C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ L f8385D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(L l10, C1281d0 c1281d0, L l11) {
            super(1);
            this.f8383B = l10;
            this.f8384C = c1281d0;
            this.f8385D = l11;
        }

        public final void a(C4751h<Float, C4761m> c4751h) {
            float fFloatValue = c4751h.e().floatValue() - this.f8383B.f43975B;
            float fD = this.f8384C.d();
            this.f8384C.h(fD + fFloatValue);
            float fAbs = Math.abs(fD - this.f8384C.d());
            this.f8383B.f43975B = c4751h.e().floatValue();
            this.f8385D.f43975B = c4751h.f().floatValue();
            if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                c4751h.a();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C4751h<Float, C4761m> c4751h) {
            a(c4751h);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/h;", "", "Lv/m;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$o */
    static final class o extends AbstractC3864v implements Ba.l<C4751h<Float, C4761m>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1281d0 f8386B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C1281d0 c1281d0) {
            super(1);
            this.f8386B = c1281d0;
        }

        public final void a(C4751h<Float, C4761m> c4751h) {
            this.f8386B.h(c4751h.e().floatValue());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C4751h<Float, C4761m> c4751h) {
            a(c4751h);
            return C4153F.f46609a;
        }
    }

    static {
        float f10 = 16;
        float f11 = 12;
        float fU = U0.h.u(U0.h.u(f10) - U0.h.u(f11));
        f8296a = fU;
        float fU2 = U0.h.u(U0.h.u(f10) - U0.h.u(f11));
        f8297b = fU2;
        f8298c = U0.h.u(U0.h.u(f10) - fU);
        f8299d = U0.h.u(U0.h.u(f11) - fU2);
        f8300e = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        f8301f = U0.h.u(24);
        f8302g = U0.h.u(28);
        float fU3 = U0.h.u(4);
        f8303h = fU3;
        f8304i = U0.h.u(U0.h.u(f10) - fU3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b0.i r33, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r34, H0.TextStyle r35, boolean r36, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r37, Ba.q<? super A.W, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r38, float r39, A.d0 r40, kotlin.C1275a0 r41, kotlin.InterfaceC1279c0 r42, kotlin.InterfaceC1554l r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1282e.a(b0.i, Ba.p, H0.J, boolean, Ba.p, Ba.q, float, A.d0, K.a0, K.c0, O.l, int, int):void");
    }

    private static final long b(x1<C3602t0> x1Var) {
        return x1Var.getValue().getValue();
    }

    private static final float c(x1<Float> x1Var) {
        return x1Var.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r24, b0.i r25, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r26, Ba.q<? super A.W, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r27, float r28, A.d0 r29, kotlin.C1275a0 r30, kotlin.InterfaceC1279c0 r31, kotlin.InterfaceC1554l r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1282e.d(Ba.p, b0.i, Ba.p, Ba.q, float, A.d0, K.a0, K.c0, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(b0.i iVar, InterfaceC1268U interfaceC1268U, long j10, long j11, long j12, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, TextStyle textStyle, float f10, C0794b.l lVar, C0794b.d dVar, int i10, boolean z10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, InterfaceC1554l interfaceC1554l, int i11, int i12) {
        int i13;
        int i14;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-742442296);
        if ((i11 & 6) == 0) {
            i13 = (interfaceC1554lR.R(iVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? interfaceC1554lR.R(interfaceC1268U) : interfaceC1554lR.l(interfaceC1268U) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= interfaceC1554lR.i(j10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= interfaceC1554lR.i(j11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= interfaceC1554lR.i(j12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= interfaceC1554lR.l(pVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= interfaceC1554lR.R(textStyle) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= interfaceC1554lR.g(f10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= interfaceC1554lR.R(lVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 |= interfaceC1554lR.R(dVar) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = (interfaceC1554lR.h(i10) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= interfaceC1554lR.c(z10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= interfaceC1554lR.l(pVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= interfaceC1554lR.l(pVar3) ? 2048 : 1024;
        }
        if ((306783379 & i13) == 306783378 && (i14 & 1171) == 1170 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-742442296, i13, i14, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z11 = ((i13 & 112) == 32 || ((i13 & 64) != 0 && interfaceC1554lR.l(interfaceC1268U))) | ((1879048192 & i13) == 536870912) | ((234881024 & i13) == 67108864) | ((i14 & 14) == 4);
            Object objF = interfaceC1554lR.f();
            if (z11 || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new j(interfaceC1268U, dVar, lVar, i10);
                interfaceC1554lR.J(objF);
            }
            I i15 = (I) objF;
            int iA = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            b0.i iVarE = b0.h.e(interfaceC1554lR, iVar);
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.getInserting()) {
                interfaceC1554lR.T(aVarA);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA, i15, companion.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion.d());
            i.Companion companion2 = b0.i.INSTANCE;
            b0.i iVarB = androidx.compose.ui.layout.a.b(companion2, "navigationIcon");
            float f11 = f8303h;
            b0.i iVarM = androidx.compose.foundation.layout.o.m(iVarB, f11, 0.0f, 0.0f, 0.0f, 14, null);
            c.Companion companion3 = b0.c.INSTANCE;
            I iH = androidx.compose.foundation.layout.d.h(companion3.o(), false);
            int iA2 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF2 = interfaceC1554lR.F();
            b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarM);
            Ba.a<InterfaceC0828g> aVarA2 = companion.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.getInserting()) {
                interfaceC1554lR.T(aVarA2);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA2, iH, companion.c());
            C1.b(interfaceC1554lA2, interfaceC1578xF2, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion.b();
            if (interfaceC1554lA2.getInserting() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA2.J(Integer.valueOf(iA2));
                interfaceC1554lA2.k(Integer.valueOf(iA2), pVarB2);
            }
            C1.b(interfaceC1554lA2, iVarE2, companion.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            C1503H0<C3602t0> c1503h0D = C1298s.a().d(C3602t0.g(j10));
            int i16 = C1503H0.f12626i;
            C1576w.a(c1503h0D, pVar2, interfaceC1554lR, ((i14 >> 3) & 112) | i16);
            interfaceC1554lR.P();
            b0.i iVarC = androidx.compose.ui.graphics.b.c(androidx.compose.foundation.layout.o.k(androidx.compose.ui.layout.a.b(companion2, "title"), f11, 0.0f, 2, null).e(z10 ? F0.o.a(companion2, i.f8344B) : companion2), 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            I iH2 = androidx.compose.foundation.layout.d.h(companion3.o(), false);
            int iA3 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF3 = interfaceC1554lR.F();
            b0.i iVarE3 = b0.h.e(interfaceC1554lR, iVarC);
            Ba.a<InterfaceC0828g> aVarA3 = companion.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.getInserting()) {
                interfaceC1554lR.T(aVarA3);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA3 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA3, iH2, companion.c());
            C1.b(interfaceC1554lA3, interfaceC1578xF3, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB3 = companion.b();
            if (interfaceC1554lA3.getInserting() || !C3862t.b(interfaceC1554lA3.f(), Integer.valueOf(iA3))) {
                interfaceC1554lA3.J(Integer.valueOf(iA3));
                interfaceC1554lA3.k(Integer.valueOf(iA3), pVarB3);
            }
            C1.b(interfaceC1554lA3, iVarE3, companion.d());
            int i17 = i13 >> 9;
            L.i.a(j11, textStyle, pVar, interfaceC1554lR, ((i13 >> 15) & 112) | (i17 & 14) | (i17 & 896));
            interfaceC1554lR.P();
            b0.i iVarM2 = androidx.compose.foundation.layout.o.m(androidx.compose.ui.layout.a.b(companion2, "actionIcons"), 0.0f, 0.0f, f11, 0.0f, 11, null);
            I iH3 = androidx.compose.foundation.layout.d.h(companion3.o(), false);
            int iA4 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF4 = interfaceC1554lR.F();
            b0.i iVarE4 = b0.h.e(interfaceC1554lR, iVarM2);
            Ba.a<InterfaceC0828g> aVarA4 = companion.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.getInserting()) {
                interfaceC1554lR.T(aVarA4);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA4 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA4, iH3, companion.c());
            C1.b(interfaceC1554lA4, interfaceC1578xF4, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB4 = companion.b();
            if (interfaceC1554lA4.getInserting() || !C3862t.b(interfaceC1554lA4.f(), Integer.valueOf(iA4))) {
                interfaceC1554lA4.J(Integer.valueOf(iA4));
                interfaceC1554lA4.k(Integer.valueOf(iA4), pVarB4);
            }
            C1.b(interfaceC1554lA4, iVarE4, companion.d());
            C1576w.a(C1298s.a().d(C3602t0.g(j12)), pVar3, interfaceC1554lR, ((i14 >> 6) & 112) | i16);
            interfaceC1554lR.P();
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new k(iVar, interfaceC1268U, j10, j11, j12, pVar, textStyle, f10, lVar, dVar, i10, z10, pVar2, pVar3, i11, i12));
        }
    }

    public static final C1281d0 j(float f10, float f11, float f12, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = -3.4028235E38f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        if (C1560o.J()) {
            C1560o.S(1801969826, i10, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        Y.j<C1281d0, ?> jVarA = C1281d0.INSTANCE.a();
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.g(f10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.g(f11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC1554l.g(f12)) || (i10 & 384) == 256);
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new l(f10, f11, f12);
            interfaceC1554l.J(objF);
        }
        C1281d0 c1281d0 = (C1281d0) Y.b.c(objArr, jVarA, null, (Ba.a) objF, interfaceC1554l, 0, 4);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1281d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(kotlin.C1281d0 r22, float r23, kotlin.InterfaceC4787z<java.lang.Float> r24, kotlin.InterfaceC4753i<java.lang.Float> r25, ta.InterfaceC4588d<? super U0.y> r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1282e.k(K.d0, float, v.z, v.i, ta.d):java.lang.Object");
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.e$i */
    static final class i extends AbstractC3864v implements Ba.l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final i f8344B = new i();

        i() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }

        public final void a(x xVar) {
        }
    }
}
