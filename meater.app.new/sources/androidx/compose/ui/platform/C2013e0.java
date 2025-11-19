package androidx.compose.ui.platform;

import kotlin.AbstractC1341l;
import kotlin.AbstractC1501G0;
import kotlin.AbstractC1572u;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1340k;
import kotlin.InterfaceC1554l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import q0.InterfaceC4258a;
import r0.InterfaceC4332b;
import u0.InterfaceC4657w;

/* compiled from: CompositionLocals.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010\u0012\"&\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0010\u0012\u0004\b/\u0010\u0018\u001a\u0004\b.\u0010\u0012\"\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010\u0010\u001a\u0004\b#\u0010\u0012\"\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002040\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010\u0010\u001a\u0004\b6\u0010\u0012\"\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002080\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b)\u0010\u0012\"\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020;0\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b-\u0010\u0012\"(\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010\u0010\u0012\u0004\bA\u0010\u0018\u001a\u0004\b@\u0010\u0012\"\u001f\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\bD\u0010\u0012\"\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010\u0010\u001a\u0004\bH\u0010\u0012\"\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010\u0010\u001a\u0004\b<\u0010\u0012\"\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020L0\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\b?\u0010\u0012\"\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020O0\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010\u0010\u001a\u0004\bQ\u0010\u0012\"\"\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010\u0010\u001a\u0004\b2\u0010\u0012\" \u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010\u0010\u001a\u0004\b5\u0010\u0012\"\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020V0Y8F¢\u0006\u0006\u001a\u0004\b9\u0010Z¨\u0006\\"}, d2 = {"LA0/m0;", "owner", "Landroidx/compose/ui/platform/b1;", "uriHandler", "Lkotlin/Function0;", "Loa/F;", "content", "a", "(LA0/m0;Landroidx/compose/ui/platform/b1;LBa/p;LO/l;I)V", "", "name", "", "n", "(Ljava/lang/String;)Ljava/lang/Void;", "LO/G0;", "Landroidx/compose/ui/platform/i;", "LO/G0;", "c", "()LO/G0;", "LocalAccessibilityManager", "Lc0/d;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Lc0/i;", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/c0;", "d", "getLocalClipboardManager", "LocalClipboardManager", "Li0/F0;", "e", "f", "LocalGraphicsContext", "LU0/d;", "LocalDensity", "Lg0/f;", "g", "getLocalFocusManager", "LocalFocusManager", "LL0/k$b;", "h", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "LL0/l$b;", "i", "LocalFontFamilyResolver", "Lq0/a;", "j", "getLocalHapticFeedback", "LocalHapticFeedback", "Lr0/b;", "k", "LocalInputModeManager", "LU0/t;", "l", "LocalLayoutDirection", "LM0/G;", "m", "getLocalTextInputService", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/Y0;", "getLocalSoftwareKeyboardController", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/Z0;", "o", "getLocalTextToolbar", "LocalTextToolbar", "p", "LocalUriHandler", "Landroidx/compose/ui/platform/i1;", "q", "LocalViewConfiguration", "Landroidx/compose/ui/platform/q1;", "r", "getLocalWindowInfo", "LocalWindowInfo", "Lu0/w;", "s", "LocalPointerIconService", "", "t", "LocalProvidableScrollCaptureInProgress", "LO/u;", "()LO/u;", "LocalScrollCaptureInProgress", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2013e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC2020i> f23074a = C1576w.f(a.f23094B);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1501G0<c0.d> f23075b = C1576w.f(b.f23095B);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1501G0<c0.i> f23076c = C1576w.f(c.f23096B);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC2009c0> f23077d = C1576w.f(d.f23097B);

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC1501G0<i0.F0> f23078e = C1576w.f(i.f23102B);

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC1501G0<U0.d> f23079f = C1576w.f(e.f23098B);

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC1501G0<g0.f> f23080g = C1576w.f(f.f23099B);

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC1340k.b> f23081h = C1576w.f(h.f23101B);

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC1501G0<AbstractC1341l.b> f23082i = C1576w.f(g.f23100B);

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC4258a> f23083j = C1576w.f(j.f23103B);

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC4332b> f23084k = C1576w.f(k.f23104B);

    /* renamed from: l, reason: collision with root package name */
    private static final AbstractC1501G0<U0.t> f23085l = C1576w.f(l.f23105B);

    /* renamed from: m, reason: collision with root package name */
    private static final AbstractC1501G0<M0.G> f23086m = C1576w.f(p.f23109B);

    /* renamed from: n, reason: collision with root package name */
    private static final AbstractC1501G0<Y0> f23087n = C1576w.f(o.f23108B);

    /* renamed from: o, reason: collision with root package name */
    private static final AbstractC1501G0<Z0> f23088o = C1576w.f(q.f23110B);

    /* renamed from: p, reason: collision with root package name */
    private static final AbstractC1501G0<b1> f23089p = C1576w.f(r.f23111B);

    /* renamed from: q, reason: collision with root package name */
    private static final AbstractC1501G0<i1> f23090q = C1576w.f(s.f23112B);

    /* renamed from: r, reason: collision with root package name */
    private static final AbstractC1501G0<q1> f23091r = C1576w.f(t.f23113B);

    /* renamed from: s, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC4657w> f23092s = C1576w.f(m.f23106B);

    /* renamed from: t, reason: collision with root package name */
    private static final AbstractC1501G0<Boolean> f23093t = C1576w.d(null, n.f23107B, 1, null);

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/i;", "a", "()Landroidx/compose/ui/platform/i;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$a */
    static final class a extends AbstractC3864v implements Ba.a<InterfaceC2020i> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f23094B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2020i invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc0/d;", "a", "()Lc0/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$b */
    static final class b extends AbstractC3864v implements Ba.a<c0.d> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f23095B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0.d invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc0/i;", "a", "()Lc0/i;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$c */
    static final class c extends AbstractC3864v implements Ba.a<c0.i> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f23096B = new c();

        c() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0.i invoke() {
            C2013e0.n("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/c0;", "a", "()Landroidx/compose/ui/platform/c0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$d */
    static final class d extends AbstractC3864v implements Ba.a<InterfaceC2009c0> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f23097B = new d();

        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2009c0 invoke() {
            C2013e0.n("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/d;", "a", "()LU0/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$e */
    static final class e extends AbstractC3864v implements Ba.a<U0.d> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f23098B = new e();

        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0.d invoke() {
            C2013e0.n("LocalDensity");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg0/f;", "a", "()Lg0/f;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$f */
    static final class f extends AbstractC3864v implements Ba.a<g0.f> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f23099B = new f();

        f() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0.f invoke() {
            C2013e0.n("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LL0/l$b;", "a", "()LL0/l$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$g */
    static final class g extends AbstractC3864v implements Ba.a<AbstractC1341l.b> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f23100B = new g();

        g() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1341l.b invoke() {
            C2013e0.n("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LL0/k$b;", "a", "()LL0/k$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$h */
    static final class h extends AbstractC3864v implements Ba.a<InterfaceC1340k.b> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f23101B = new h();

        h() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1340k.b invoke() {
            C2013e0.n("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/F0;", "a", "()Li0/F0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$i */
    static final class i extends AbstractC3864v implements Ba.a<i0.F0> {

        /* renamed from: B, reason: collision with root package name */
        public static final i f23102B = new i();

        i() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0.F0 invoke() {
            C2013e0.n("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/a;", "a", "()Lq0/a;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$j */
    static final class j extends AbstractC3864v implements Ba.a<InterfaceC4258a> {

        /* renamed from: B, reason: collision with root package name */
        public static final j f23103B = new j();

        j() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4258a invoke() {
            C2013e0.n("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lr0/b;", "a", "()Lr0/b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$k */
    static final class k extends AbstractC3864v implements Ba.a<InterfaceC4332b> {

        /* renamed from: B, reason: collision with root package name */
        public static final k f23104B = new k();

        k() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4332b invoke() {
            C2013e0.n("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/t;", "a", "()LU0/t;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$l */
    static final class l extends AbstractC3864v implements Ba.a<U0.t> {

        /* renamed from: B, reason: collision with root package name */
        public static final l f23105B = new l();

        l() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0.t invoke() {
            C2013e0.n("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu0/w;", "a", "()Lu0/w;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$m */
    static final class m extends AbstractC3864v implements Ba.a<InterfaceC4657w> {

        /* renamed from: B, reason: collision with root package name */
        public static final m f23106B = new m();

        m() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4657w invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$n */
    static final class n extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final n f23107B = new n();

        n() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/Y0;", "a", "()Landroidx/compose/ui/platform/Y0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$o */
    static final class o extends AbstractC3864v implements Ba.a<Y0> {

        /* renamed from: B, reason: collision with root package name */
        public static final o f23108B = new o();

        o() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y0 invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LM0/G;", "a", "()LM0/G;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$p */
    static final class p extends AbstractC3864v implements Ba.a<M0.G> {

        /* renamed from: B, reason: collision with root package name */
        public static final p f23109B = new p();

        p() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M0.G invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/Z0;", "a", "()Landroidx/compose/ui/platform/Z0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$q */
    static final class q extends AbstractC3864v implements Ba.a<Z0> {

        /* renamed from: B, reason: collision with root package name */
        public static final q f23110B = new q();

        q() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0 invoke() {
            C2013e0.n("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/b1;", "a", "()Landroidx/compose/ui/platform/b1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$r */
    static final class r extends AbstractC3864v implements Ba.a<b1> {

        /* renamed from: B, reason: collision with root package name */
        public static final r f23111B = new r();

        r() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            C2013e0.n("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/i1;", "a", "()Landroidx/compose/ui/platform/i1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$s */
    static final class s extends AbstractC3864v implements Ba.a<i1> {

        /* renamed from: B, reason: collision with root package name */
        public static final s f23112B = new s();

        s() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i1 invoke() {
            C2013e0.n("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/q1;", "a", "()Landroidx/compose/ui/platform/q1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.e0$t */
    static final class t extends AbstractC3864v implements Ba.a<q1> {

        /* renamed from: B, reason: collision with root package name */
        public static final t f23113B = new t();

        t() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q1 invoke() {
            C2013e0.n("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.e0$u */
    static final class u extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ A0.m0 f23114B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b1 f23115C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23116D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f23117E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(A0.m0 m0Var, b1 b1Var, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f23114B = m0Var;
            this.f23115C = b1Var;
            this.f23116D = pVar;
            this.f23117E = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C2013e0.a(this.f23114B, this.f23115C, this.f23116D, interfaceC1554l, C1509K0.a(this.f23117E | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(A0.m0 m0Var, b1 b1Var, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(874662829);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC1554lR.R(m0Var) : interfaceC1554lR.l(m0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC1554lR.R(b1Var) : interfaceC1554lR.l(b1Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.l(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(874662829, i11, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            C1576w.b(new C1503H0[]{f23074a.d(m0Var.getAccessibilityManager()), f23075b.d(m0Var.getAutofill()), f23076c.d(m0Var.getAutofillTree()), f23077d.d(m0Var.getClipboardManager()), f23079f.d(m0Var.getDensity()), f23080g.d(m0Var.getFocusOwner()), f23081h.e(m0Var.getFontLoader()), f23082i.e(m0Var.getFontFamilyResolver()), f23083j.d(m0Var.getHapticFeedBack()), f23084k.d(m0Var.getInputModeManager()), f23085l.d(m0Var.getLayoutDirection()), f23086m.d(m0Var.getTextInputService()), f23087n.d(m0Var.getSoftwareKeyboardController()), f23088o.d(m0Var.getTextToolbar()), f23089p.d(b1Var), f23090q.d(m0Var.getViewConfiguration()), f23091r.d(m0Var.getWindowInfo()), f23092s.d(m0Var.getPointerIconService()), f23078e.d(m0Var.getGraphicsContext())}, pVar, interfaceC1554lR, ((i11 >> 3) & 112) | C1503H0.f12626i);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        kotlin.W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new u(m0Var, b1Var, pVar, i10));
        }
    }

    public static final AbstractC1501G0<InterfaceC2020i> c() {
        return f23074a;
    }

    public static final AbstractC1501G0<U0.d> d() {
        return f23079f;
    }

    public static final AbstractC1501G0<AbstractC1341l.b> e() {
        return f23082i;
    }

    public static final AbstractC1501G0<i0.F0> f() {
        return f23078e;
    }

    public static final AbstractC1501G0<InterfaceC4332b> g() {
        return f23084k;
    }

    public static final AbstractC1501G0<U0.t> h() {
        return f23085l;
    }

    public static final AbstractC1501G0<InterfaceC4657w> i() {
        return f23092s;
    }

    public static final AbstractC1501G0<Boolean> j() {
        return f23093t;
    }

    public static final AbstractC1572u<Boolean> k() {
        return f23093t;
    }

    public static final AbstractC1501G0<b1> l() {
        return f23089p;
    }

    public static final AbstractC1501G0<i1> m() {
        return f23090q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void n(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
