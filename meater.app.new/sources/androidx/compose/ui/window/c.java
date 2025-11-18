package androidx.compose.ui.window;

import A0.InterfaceC0828g;
import F0.v;
import F0.x;
import Xb.I;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import f0.C3300a;
import java.util.List;
import java.util.UUID;
import kotlin.AbstractC1501G0;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;
import oa.C4153F;
import ta.InterfaceC4588d;
import y0.H;
import y0.InterfaceC5116v;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aP\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0010*\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\" \u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)²\u0006\u0012\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lb0/c;", "alignment", "LU0/n;", "offset", "Lkotlin/Function0;", "Loa/F;", "onDismissRequest", "Landroidx/compose/ui/window/s;", "properties", "content", "c", "(Lb0/c;JLBa/a;Landroidx/compose/ui/window/s;LBa/p;LO/l;II)V", "Landroidx/compose/ui/window/r;", "popupPositionProvider", "a", "(Landroidx/compose/ui/window/r;LBa/a;Landroidx/compose/ui/window/s;LBa/p;LO/l;II)V", "", "focusable", "Landroidx/compose/ui/window/t;", "securePolicy", "clippingEnabled", "", "h", "(ZLandroidx/compose/ui/window/t;Z)I", "Landroid/view/View;", "j", "(Landroid/view/View;)Z", "isParentFlagSecureEnabled", "i", "(Landroidx/compose/ui/window/s;Z)I", "Landroid/graphics/Rect;", "LU0/p;", "k", "(Landroid/graphics/Rect;)LU0/p;", "LO/G0;", "", "LO/G0;", "getLocalPopupTestTag", "()LO/G0;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<String> f23641a = C1576w.d(null, a.f23642B, 1, null);

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<String> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f23642B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.c f23643B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ long f23644C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f23645D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ s f23646E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23647F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f23648G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f23649H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0.c cVar, long j10, Ba.a<C4153F> aVar, s sVar, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10, int i11) {
            super(2);
            this.f23643B = cVar;
            this.f23644C = j10;
            this.f23645D = aVar;
            this.f23646E = sVar;
            this.f23647F = pVar;
            this.f23648G = i10;
            this.f23649H = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            c.c(this.f23643B, this.f23644C, this.f23645D, this.f23646E, this.f23647F, interfaceC1554l, C1509K0.a(this.f23648G | 1), this.f23649H);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    static final class C0341c extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l f23650B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f23651C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ s f23652D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f23653E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ U0.t f23654F;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/c$c$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.window.c$c$a */
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f23655a;

            public a(l lVar) {
                this.f23655a = lVar;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f23655a.e();
                this.f23655a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0341c(l lVar, Ba.a<C4153F> aVar, s sVar, String str, U0.t tVar) {
            super(1);
            this.f23650B = lVar;
            this.f23651C = aVar;
            this.f23652D = sVar;
            this.f23653E = str;
            this.f23654F = tVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            this.f23650B.r();
            this.f23650B.t(this.f23651C, this.f23652D, this.f23653E, this.f23654F);
            return new a(this.f23650B);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l f23656B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f23657C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ s f23658D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f23659E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ U0.t f23660F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l lVar, Ba.a<C4153F> aVar, s sVar, String str, U0.t tVar) {
            super(0);
            this.f23656B = lVar;
            this.f23657C = aVar;
            this.f23658D = sVar;
            this.f23659E = str;
            this.f23660F = tVar;
        }

        public final void a() {
            this.f23656B.t(this.f23657C, this.f23658D, this.f23659E, this.f23660F);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0/v;", "childCoordinates", "Loa/F;", "a", "(Ly0/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.l<InterfaceC5116v, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l f23667B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(l lVar) {
            super(1);
            this.f23667B = lVar;
        }

        public final void a(InterfaceC5116v interfaceC5116v) {
            InterfaceC5116v interfaceC5116vU = interfaceC5116v.U();
            C3862t.d(interfaceC5116vU);
            this.f23667B.v(interfaceC5116vU);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC5116v interfaceC5116v) {
            a(interfaceC5116v);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ r f23671B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f23672C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ s f23673D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23674E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f23675F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f23676G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(r rVar, Ba.a<C4153F> aVar, s sVar, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10, int i11) {
            super(2);
            this.f23671B = rVar;
            this.f23672C = aVar;
            this.f23673D = sVar;
            this.f23674E = pVar;
            this.f23675F = i10;
            this.f23676G = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            c.a(this.f23671B, this.f23672C, this.f23673D, this.f23674E, interfaceC1554l, C1509K0.a(this.f23675F | 1), this.f23676G);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class j extends AbstractC3864v implements Ba.a<UUID> {

        /* renamed from: B, reason: collision with root package name */
        public static final j f23677B = new j();

        j() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l f23678B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ x1<Ba.p<InterfaceC1554l, Integer, C4153F>> f23679C;

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<x, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f23680B = new a();

            a() {
                super(1);
            }

            public final void a(x xVar) {
                v.r(xVar);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
                a(xVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/r;", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends AbstractC3864v implements Ba.l<U0.r, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ l f23681B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l lVar) {
                super(1);
                this.f23681B = lVar;
            }

            public final void a(long j10) {
                this.f23681B.m1setPopupContentSizefhxjrPA(U0.r.b(j10));
                this.f23681B.x();
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(U0.r rVar) {
                a(rVar.getPackedValue());
                return C4153F.f46609a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.window.c$k$c, reason: collision with other inner class name */
        static final class C0342c extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ x1<Ba.p<InterfaceC1554l, Integer, C4153F>> f23682B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0342c(x1<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> x1Var) {
                super(2);
                this.f23682B = x1Var;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(606497925, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                }
                c.b(this.f23682B).invoke(interfaceC1554l, 0);
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
        k(l lVar, x1<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> x1Var) {
            super(2);
            this.f23678B = lVar;
            this.f23679C = x1Var;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1302892335, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
            }
            b0.i iVarD = F0.o.d(b0.i.INSTANCE, false, a.f23680B, 1, null);
            boolean zL = interfaceC1554l.l(this.f23678B);
            l lVar = this.f23678B;
            Object objF = interfaceC1554l.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new b(lVar);
                interfaceC1554l.J(objF);
            }
            b0.i iVarA = C3300a.a(androidx.compose.ui.layout.e.a(iVarD, (Ba.l) objF), this.f23678B.getCanCalculatePosition() ? 1.0f : 0.0f);
            W.a aVarD = W.c.d(606497925, true, new C0342c(this.f23679C), interfaceC1554l, 54);
            androidx.compose.ui.window.d dVar = androidx.compose.ui.window.d.f23683a;
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            b0.i iVarE = b0.h.e(interfaceC1554l, iVarA);
            InterfaceC0828g.Companion aVar = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = aVar.a();
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
            C1.b(interfaceC1554lA, dVar, aVar.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, aVar.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = aVar.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, aVar.d());
            aVarD.invoke(interfaceC1554l, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.window.r r35, Ba.a<oa.C4153F> r36, androidx.compose.ui.window.s r37, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r38, kotlin.InterfaceC1554l r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.a(androidx.compose.ui.window.r, Ba.a, androidx.compose.ui.window.s, Ba.p, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ba.p<InterfaceC1554l, Integer, C4153F> b(x1<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> x1Var) {
        return (Ba.p) x1Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(b0.c r24, long r25, Ba.a<oa.C4153F> r27, androidx.compose.ui.window.s r28, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r29, kotlin.InterfaceC1554l r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.c(b0.c, long, Ba.a, androidx.compose.ui.window.s, Ba.p, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(boolean z10, t tVar, boolean z11) {
        int i10 = !z10 ? 262152 : 262144;
        if (tVar == t.SecureOn) {
            i10 |= 8192;
        }
        return !z11 ? i10 | 512 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(s sVar, boolean z10) {
        return (sVar.getInheritSecurePolicy() && z10) ? sVar.getFlags() | 8192 : (!sVar.getInheritSecurePolicy() || z10) ? sVar.getFlags() : sVar.getFlags() & (-8193);
    }

    public static final boolean j(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0.p k(Rect rect) {
        return new U0.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l f23661B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ r f23662C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l lVar, r rVar) {
            super(1);
            this.f23661B = lVar;
            this.f23662C = rVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            this.f23661B.setPositionProvider(this.f23662C);
            this.f23661B.x();
            return new a();
        }

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/c$e$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements InterfaceC1508K {
            @Override // kotlin.InterfaceC1508K
            public void c() {
            }
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {377}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f23663B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f23664C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l f23665D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l lVar, InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f23665D = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = new f(this.f23665D, interfaceC4588d);
            fVar.f23664C = obj;
            return fVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r3.f23663B
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f23664C
                Xb.I r1 = (Xb.I) r1
                oa.C4173r.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                oa.C4173r.b(r4)
                java.lang.Object r4 = r3.f23664C
                Xb.I r4 = (Xb.I) r4
                r1 = r4
            L23:
                boolean r4 = Xb.J.f(r1)
                if (r4 == 0) goto L3c
                androidx.compose.ui.window.c$f$a r4 = androidx.compose.ui.window.c.f.a.f23666B
                r3.f23664C = r1
                r3.f23663B = r2
                java.lang.Object r4 = androidx.compose.ui.platform.C2033o0.a(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.l r4 = r3.f23665D
                r4.p()
                goto L23
            L3c:
                oa.F r4 = oa.C4153F.f46609a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<Long, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f23666B = new a();

            a() {
                super(1);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
                a(l10.longValue());
                return C4153F.f46609a;
            }

            public final void a(long j10) {
            }
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "<anonymous parameter 0>", "LU0/b;", "<anonymous parameter 1>", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    static final class h implements y0.I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f23668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U0.t f23669b;

        h(l lVar, U0.t tVar) {
            this.f23668a = lVar;
            this.f23669b = tVar;
        }

        @Override // y0.I
        public final J e(K k10, List<? extends H> list, long j10) {
            this.f23668a.setParentLayoutDirection(this.f23669b);
            return K.E1(k10, 0, 0, null, a.f23670B, 4, null);
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f23670B = new a();

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
}
