package F;

import F0.v;
import F0.x;
import H0.AbstractC1064h;
import H0.C1060d;
import H0.G;
import H0.SpanStyle;
import H0.TextLayoutInput;
import H0.TextLayoutResult;
import U0.t;
import Xb.I;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.C2013e0;
import androidx.compose.ui.platform.b1;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import i0.N0;
import i0.R0;
import i0.c1;
import java.util.Arrays;
import java.util.List;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.U;
import kotlin.m1;
import kotlin.r1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4656v;
import u0.InterfaceC4655u;
import ua.C4696b;
import z.C5161j;
import z.InterfaceC5162k;

/* compiled from: TextLinkScope.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010&\u001a\u00020\u001e2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010!\"\u0004\u0018\u00010\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#H\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010+R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00107\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010-\u001a\u0004\b5\u0010+\"\u0004\b6\u0010\u0005R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"LF/l;", "", "LH0/d;", "initialText", "<init>", "(LH0/d;)V", "Lb0/i;", "LH0/d$c;", "LH0/h;", "Landroidx/compose/foundation/text/LinkRange;", "link", "t", "(Lb0/i;LH0/d$c;)Lb0/i;", "k", "Li0/c1;", "s", "(LH0/d$c;)Li0/c1;", "Li0/R0;", "q", "(LH0/d$c;)Li0/R0;", "LH0/F;", "textLayoutResult", "j", "(LH0/d$c;LH0/F;)LH0/d$c;", "LH0/C;", "other", "p", "(LH0/C;LH0/C;)LH0/C;", "Landroidx/compose/ui/platform/b1;", "uriHandler", "Loa/F;", "o", "(LH0/h;Landroidx/compose/ui/platform/b1;)V", "", "keys", "Lkotlin/Function1;", "LF/h;", "block", "c", "([Ljava/lang/Object;LBa/l;LO/l;I)V", "b", "(LO/l;I)V", "i", "()LH0/d;", "a", "LH0/d;", "getInitialText$foundation_release", "<set-?>", "LO/p0;", "n", "()LH0/F;", "r", "(LH0/F;)V", "m", "setText$foundation_release", "text", "Landroidx/compose/runtime/snapshots/k;", "d", "Landroidx/compose/runtime/snapshots/k;", "annotators", "Lkotlin/Function0;", "", "l", "()LBa/a;", "shouldMeasureLinks", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1060d initialText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 textLayoutResult = r1.c(null, null, 2, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C1060d text;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<Ba.l<F.h, C4153F>> annotators;

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f4240B = new a();

        a() {
            super(1);
        }

        public final void a(x xVar) {
            v.n(xVar);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1060d.Range<AbstractC1064h> f4242C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ b1 f4243D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1060d.Range<AbstractC1064h> range, b1 b1Var) {
            super(0);
            this.f4242C = range;
            this.f4243D = b1Var;
        }

        public final void a() {
            l.this.o(this.f4242C.g(), this.f4243D);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {226}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f4244B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ F.f f4245C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f4246D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F.f fVar, InterfaceC5162k interfaceC5162k, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f4245C = fVar;
            this.f4246D = interfaceC5162k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new c(this.f4245C, this.f4246D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f4244B;
            if (i10 == 0) {
                C4173r.b(obj);
                F.f fVar = this.f4245C;
                InterfaceC5162k interfaceC5162k = this.f4246D;
                this.f4244B = 1;
                if (fVar.e(interfaceC5162k, this) == objE) {
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

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF/h;", "Loa/F;", "a", "(LF/h;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<F.h, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1060d.Range<AbstractC1064h> f4248C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ F.f f4249D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1060d.Range<AbstractC1064h> range, F.f fVar) {
            super(1);
            this.f4248C = range;
            this.f4249D = fVar;
        }

        public final void a(F.h hVar) {
            G styles;
            G styles2;
            G styles3;
            l lVar = l.this;
            G styles4 = this.f4248C.g().getStyles();
            SpanStyle pressedStyle = null;
            SpanStyle spanStyleP = lVar.p(lVar.p(styles4 != null ? styles4.getStyle() : null, (!this.f4249D.f() || (styles3 = this.f4248C.g().getStyles()) == null) ? null : styles3.getFocusedStyle()), (!this.f4249D.g() || (styles2 = this.f4248C.g().getStyles()) == null) ? null : styles2.getHoveredStyle());
            if (this.f4249D.h() && (styles = this.f4248C.g().getStyles()) != null) {
                pressedStyle = styles.getPressedStyle();
            }
            SpanStyle spanStyleP2 = lVar.p(spanStyleP, pressedStyle);
            if (spanStyleP2 != null) {
                C1060d.Range<AbstractC1064h> range = this.f4248C;
                hVar.a(spanStyleP2, range.h(), range.f());
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(F.h hVar) {
            a(hVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f4251C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(2);
            this.f4251C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            l.this.b(interfaceC1554l, C1509K0.a(this.f4251C | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<F.h, C4153F> f4253C;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"F/l$f$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f4254a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ba.l f4255b;

            public a(l lVar, Ba.l lVar2) {
                this.f4254a = lVar;
                this.f4255b = lVar2;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f4254a.annotators.remove(this.f4255b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Ba.l<? super F.h, C4153F> lVar) {
            super(1);
            this.f4253C = lVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            l.this.annotators.add(this.f4253C);
            return new a(l.this, this.f4253C);
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object[] f4257C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.l<F.h, C4153F> f4258D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f4259E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Object[] objArr, Ba.l<? super F.h, C4153F> lVar, int i10) {
            super(2);
            this.f4257C = objArr;
            this.f4258D = lVar;
            this.f4259E = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            l lVar = l.this;
            Object[] objArr = this.f4257C;
            lVar.c(Arrays.copyOf(objArr, objArr.length), this.f4258D, interfaceC1554l, C1509K0.a(this.f4259E | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Loa/F;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.l<androidx.compose.ui.graphics.c, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1060d.Range<AbstractC1064h> f4261C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C1060d.Range<AbstractC1064h> range) {
            super(1);
            this.f4261C = range;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            c1 c1VarS = l.this.s(this.f4261C);
            if (c1VarS != null) {
                cVar.n0(c1VarS);
                cVar.G(true);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"F/l$i", "Li0/c1;", "Lh0/m;", "size", "LU0/t;", "layoutDirection", "LU0/d;", "density", "Li0/N0;", "a", "(JLU0/t;LU0/d;)Li0/N0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements c1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R0 f4262a;

        i(R0 r02) {
            this.f4262a = r02;
        }

        @Override // i0.c1
        public N0 a(long size, t layoutDirection, U0.d density) {
            return new N0.a(this.f4262a);
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class j extends AbstractC3864v implements Ba.a<Boolean> {
        j() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            TextLayoutInput layoutInput;
            C1060d text = l.this.getText();
            TextLayoutResult textLayoutResultN = l.this.n();
            return Boolean.valueOf(C3862t.b(text, (textLayoutResultN == null || (layoutInput = textLayoutResultN.getLayoutInput()) == null) ? null : layoutInput.getText()));
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/n;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class k extends AbstractC3864v implements Ba.a<U0.n> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ U0.p f4264B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(U0.p pVar) {
            super(0);
            this.f4264B = pVar;
        }

        public final long a() {
            return this.f4264B.k();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ U0.n invoke() {
            return U0.n.b(a());
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/n;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: F.l$l, reason: collision with other inner class name */
    static final class C0079l extends AbstractC3864v implements Ba.a<U0.n> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0079l f4265B = new C0079l();

        C0079l() {
            super(0);
        }

        public final long a() {
            return U0.n.INSTANCE.a();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ U0.n invoke() {
            return U0.n.b(a());
        }
    }

    /* compiled from: TextLinkScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/n;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class m extends AbstractC3864v implements Ba.a<U0.n> {

        /* renamed from: B, reason: collision with root package name */
        public static final m f4266B = new m();

        m() {
            super(0);
        }

        public final long a() {
            return U0.n.INSTANCE.a();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ U0.n invoke() {
            return U0.n.b(a());
        }
    }

    public l(C1060d c1060d) {
        SpanStyle style;
        this.initialText = c1060d;
        C1060d.a aVar = new C1060d.a(c1060d);
        List<C1060d.Range<AbstractC1064h>> listD = c1060d.d(0, c1060d.length());
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1060d.Range<AbstractC1064h> range = listD.get(i10);
            G styles = range.g().getStyles();
            if (styles != null && (style = styles.getStyle()) != null) {
                aVar.b(style, range.h(), range.f());
            }
        }
        this.text = aVar.l();
        this.annotators = m1.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Object[] objArr, Ba.l<? super F.h, C4153F> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-2083052099);
        int i11 = (i10 & 48) == 0 ? (interfaceC1554lR.l(lVar) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.l(this) ? 256 : 128;
        }
        interfaceC1554lR.s(-416630839, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= interfaceC1554lR.l(obj) ? 4 : 0;
        }
        interfaceC1554lR.M();
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-2083052099, i11, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:298)");
            }
            U u10 = new U(2);
            u10.a(lVar);
            u10.b(objArr);
            Object[] objArrD = u10.d(new Object[u10.c()]);
            boolean zL = ((i11 & 112) == 32) | interfaceC1554lR.l(this);
            Object objF = interfaceC1554lR.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new f(lVar);
                interfaceC1554lR.J(objF);
            }
            C1516O.d(objArrD, (Ba.l) objF, interfaceC1554lR, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new g(objArr, lVar, i10));
        }
    }

    private final C1060d.Range<AbstractC1064h> j(C1060d.Range<AbstractC1064h> link, TextLayoutResult textLayoutResult) {
        int iO = TextLayoutResult.o(textLayoutResult, textLayoutResult.m() - 1, false, 2, null);
        if (link.h() < iO) {
            return C1060d.Range.e(link, null, 0, Math.min(link.f(), iO), null, 11, null);
        }
        return null;
    }

    private final b0.i k(b0.i iVar, C1060d.Range<AbstractC1064h> range) {
        return androidx.compose.ui.graphics.b.a(iVar, new h(range));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(AbstractC1064h link, b1 uriHandler) {
        if (link instanceof AbstractC1064h.b) {
            link.a();
            try {
                uriHandler.a(((AbstractC1064h.b) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        } else if (link instanceof AbstractC1064h.a) {
            link.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpanStyle p(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle spanStyleX;
        return (spanStyle == null || (spanStyleX = spanStyle.x(spanStyle2)) == null) ? spanStyle2 : spanStyleX;
    }

    private final R0 q(C1060d.Range<AbstractC1064h> link) {
        TextLayoutResult textLayoutResultN;
        R0 r0X = null;
        if (l().invoke().booleanValue() && (textLayoutResultN = n()) != null) {
            C1060d.Range<AbstractC1064h> rangeJ = j(link, textLayoutResultN);
            if (rangeJ == null) {
                return null;
            }
            r0X = textLayoutResultN.x(rangeJ.h(), rangeJ.f());
            C3478i c3478iD = textLayoutResultN.d(rangeJ.h());
            r0X.t(C3476g.u(C3477h.a(textLayoutResultN.p(rangeJ.h()) == textLayoutResultN.p(rangeJ.f() + (-1)) ? Math.min(textLayoutResultN.d(rangeJ.f() - 1).getLeft(), c3478iD.getLeft()) : 0.0f, c3478iD.getTop())));
        }
        return r0X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c1 s(C1060d.Range<AbstractC1064h> link) {
        R0 r0Q = q(link);
        if (r0Q != null) {
            return new i(r0Q);
        }
        return null;
    }

    private final b0.i t(b0.i iVar, final C1060d.Range<AbstractC1064h> range) {
        return iVar.e(new r(new s() { // from class: F.k
            @Override // F.s
            public final p a(q qVar) {
                return l.u(this.f4234a, range, qVar);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p u(l lVar, C1060d.Range range, q qVar) {
        TextLayoutResult textLayoutResultN = lVar.n();
        if (textLayoutResultN == null) {
            return qVar.a(0, 0, C0079l.f4265B);
        }
        C1060d.Range<AbstractC1064h> rangeJ = lVar.j(range, textLayoutResultN);
        if (rangeJ == null) {
            return qVar.a(0, 0, m.f4266B);
        }
        U0.p pVarB = U0.q.b(textLayoutResultN.x(rangeJ.h(), rangeJ.f()).getBounds());
        return qVar.a(pVarB.l(), pVarB.f(), new k(pVarB));
    }

    public final void b(InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        SpanStyle spanStyle;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1154651354);
        int i12 = 2;
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1154651354, i11, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:200)");
            }
            b1 b1Var = (b1) interfaceC1554lR.o(C2013e0.l());
            C1060d c1060d = this.text;
            List<C1060d.Range<AbstractC1064h>> listD = c1060d.d(0, c1060d.length());
            int size = listD.size();
            int i13 = 0;
            while (i13 < size) {
                C1060d.Range<AbstractC1064h> range = listD.get(i13);
                if (range.h() != range.f()) {
                    interfaceC1554lR.S(1385536272);
                    Object objF = interfaceC1554lR.f();
                    InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
                    if (objF == companion.a()) {
                        objF = C5161j.a();
                        interfaceC1554lR.J(objF);
                    }
                    InterfaceC5162k interfaceC5162k = (InterfaceC5162k) objF;
                    b0.i iVarD = F0.o.d(C4656v.b(androidx.compose.foundation.h.b(t(k(b0.i.INSTANCE, range), range), interfaceC5162k, false, i12, null), InterfaceC4655u.INSTANCE.b(), false, i12, null), false, a.f4240B, 1, null);
                    boolean zL = interfaceC1554lR.l(this) | interfaceC1554lR.R(range) | interfaceC1554lR.l(b1Var);
                    Object objF2 = interfaceC1554lR.f();
                    if (zL || objF2 == companion.a()) {
                        objF2 = new b(range, b1Var);
                        interfaceC1554lR.J(objF2);
                    }
                    androidx.compose.foundation.layout.d.a(androidx.compose.foundation.d.e(iVarD, interfaceC5162k, null, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? null : null, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null, (Ba.a) objF2), interfaceC1554lR, 0);
                    if (F.m.b(range.g().getStyles())) {
                        interfaceC1554lR.S(1388165134);
                        interfaceC1554lR.I();
                    } else {
                        interfaceC1554lR.S(1386296950);
                        Object objF3 = interfaceC1554lR.f();
                        if (objF3 == companion.a()) {
                            objF3 = new F.f();
                            interfaceC1554lR.J(objF3);
                        }
                        F.f fVar = (F.f) objF3;
                        Object objF4 = interfaceC1554lR.f();
                        if (objF4 == companion.a()) {
                            spanStyle = null;
                            objF4 = new c(fVar, interfaceC5162k, null);
                            interfaceC1554lR.J(objF4);
                        } else {
                            spanStyle = null;
                        }
                        C1516O.e(interfaceC5162k, (Ba.p) objF4, interfaceC1554lR, 6);
                        Boolean boolValueOf = Boolean.valueOf(fVar.g());
                        Boolean boolValueOf2 = Boolean.valueOf(fVar.f());
                        Boolean boolValueOf3 = Boolean.valueOf(fVar.h());
                        G styles = range.g().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : spanStyle;
                        G styles2 = range.g().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : spanStyle;
                        G styles3 = range.g().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : spanStyle;
                        G styles4 = range.g().getStyles();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : spanStyle};
                        boolean zL2 = interfaceC1554lR.l(this) | interfaceC1554lR.R(range);
                        Object objF5 = interfaceC1554lR.f();
                        if (zL2 || objF5 == companion.a()) {
                            objF5 = new d(range, fVar);
                            interfaceC1554lR.J(objF5);
                        }
                        c(objArr, (Ba.l) objF5, interfaceC1554lR, (i11 << 6) & 896);
                        interfaceC1554lR.I();
                    }
                    interfaceC1554lR.I();
                } else {
                    interfaceC1554lR.S(1388179022);
                    interfaceC1554lR.I();
                }
                i13++;
                i12 = 2;
            }
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new e(i10));
        }
    }

    public final C1060d i() {
        C1060d c1060dL;
        if (this.annotators.isEmpty()) {
            c1060dL = this.text;
        } else {
            C1060d.a aVar = new C1060d.a(0, 1, null);
            aVar.f(this.initialText);
            F.h hVar = new F.h(aVar);
            SnapshotStateList<Ba.l<F.h, C4153F>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i10 = 0; i10 < size; i10++) {
                snapshotStateList.get(i10).invoke(hVar);
            }
            c1060dL = aVar.l();
        }
        this.text = c1060dL;
        return c1060dL;
    }

    public final Ba.a<Boolean> l() {
        return new j();
    }

    /* renamed from: m, reason: from getter */
    public final C1060d getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult n() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void r(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }
}
