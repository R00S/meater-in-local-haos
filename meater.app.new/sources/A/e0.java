package A;

import android.view.View;
import android.view.WindowInsets;
import j1.C3719d;
import java.util.WeakHashMap;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import s1.C4469y0;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ^2\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010!\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010&\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u0017\u0010'\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0017\u0010,\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b+\u0010\u0018R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010:\u001a\u0002028\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0017\u0010<\u001a\u0002028\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b\u001f\u00106R\u0017\u0010?\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100R\u0017\u0010B\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\bA\u00100R\u0017\u0010E\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u00100R\u0017\u0010H\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u00100R\u0017\u0010K\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bI\u0010.\u001a\u0004\bJ\u00100R\u0017\u0010N\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bL\u0010.\u001a\u0004\bM\u00100R\u0017\u0010Q\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bO\u0010.\u001a\u0004\bP\u00100R\u0017\u0010V\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b\u001c\u0010UR\u0016\u0010Y\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006_"}, d2 = {"LA/e0;", "", "Ls1/y0;", "insets", "Landroid/view/View;", "view", "<init>", "(Ls1/y0;Landroid/view/View;)V", "Loa/F;", "f", "(Landroid/view/View;)V", "b", "windowInsets", "", "types", "g", "(Ls1/y0;I)V", "i", "(Ls1/y0;)V", "j", "LA/a;", "a", "LA/a;", "getCaptionBar", "()LA/a;", "captionBar", "getDisplayCutout", "displayCutout", "c", "getIme", "ime", "d", "getMandatorySystemGestures", "mandatorySystemGestures", "e", "getNavigationBars", "navigationBars", "getStatusBars", "statusBars", "systemBars", "h", "getSystemGestures", "systemGestures", "getTappableElement", "tappableElement", "LA/b0;", "LA/b0;", "getWaterfall", "()LA/b0;", "waterfall", "LA/d0;", "k", "LA/d0;", "getSafeDrawing", "()LA/d0;", "safeDrawing", "l", "getSafeGestures", "safeGestures", "m", "safeContent", "n", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "q", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "s", "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "()Z", "consumes", "v", "I", "accessCount", "LA/D;", "w", "LA/D;", "insetsListener", "x", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: A, reason: collision with root package name */
    private static boolean f87A;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f89y = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final WeakHashMap<View, e0> f90z = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C0793a captionBar;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0793a displayCutout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C0793a ime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C0793a mandatorySystemGestures;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C0793a navigationBars;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C0793a statusBars;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C0793a systemBars;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C0793a systemGestures;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C0793a tappableElement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b0 waterfall;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d0 safeDrawing;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d0 safeGestures;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final d0 safeContent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final b0 captionBarIgnoringVisibility;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final b0 navigationBarsIgnoringVisibility;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final b0 statusBarsIgnoringVisibility;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final b0 systemBarsIgnoringVisibility;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final b0 tappableElementIgnoringVisibility;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b0 imeAnimationTarget;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final b0 imeAnimationSource;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean consumes;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int accessCount;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final D insetsListener;

    /* compiled from: WindowInsets.android.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LA/e0$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "LA/e0;", "d", "(Landroid/view/View;)LA/e0;", "Ls1/y0;", "windowInsets", "", "type", "", "name", "LA/a;", "e", "(Ls1/y0;ILjava/lang/String;)LA/a;", "LA/b0;", "f", "(Ls1/y0;ILjava/lang/String;)LA/b0;", "c", "(LO/l;I)LA/e0;", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.e0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: WindowInsets.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A.e0$a$a, reason: collision with other inner class name */
        static final class C0002a extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ e0 f114B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ View f115C;

            /* compiled from: Effects.kt */
            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"A/e0$a$a$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: A.e0$a$a$a, reason: collision with other inner class name */
            public static final class C0003a implements InterfaceC1508K {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e0 f116a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f117b;

                public C0003a(e0 e0Var, View view) {
                    this.f116a = e0Var;
                    this.f117b = view;
                }

                @Override // kotlin.InterfaceC1508K
                public void c() {
                    this.f116a.b(this.f117b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0002a(e0 e0Var, View view) {
                super(1);
                this.f114B = e0Var;
                this.f115C = view;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC1508K invoke(C1510L c1510l) {
                this.f114B.f(this.f115C);
                return new C0003a(this.f114B, this.f115C);
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final e0 d(View view) {
            e0 e0Var;
            synchronized (e0.f90z) {
                try {
                    WeakHashMap weakHashMap = e0.f90z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        e0 e0Var2 = new e0(null, view, false ? 1 : 0);
                        weakHashMap.put(view, e0Var2);
                        obj2 = e0Var2;
                    }
                    e0Var = (e0) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return e0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0793a e(C4469y0 windowInsets, int type, String name) {
            C0793a c0793a = new C0793a(type, name);
            if (windowInsets != null) {
                c0793a.h(windowInsets, type);
            }
            return c0793a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b0 f(C4469y0 windowInsets, int type, String name) {
            C3719d c3719dG;
            if (windowInsets == null || (c3719dG = windowInsets.g(type)) == null) {
                c3719dG = C3719d.f43449e;
            }
            return j0.a(c3719dG, name);
        }

        public final e0 c(InterfaceC1554l interfaceC1554l, int i10) {
            if (C1560o.J()) {
                C1560o.S(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) interfaceC1554l.o(androidx.compose.ui.platform.M.k());
            e0 e0VarD = d(view);
            boolean zL = interfaceC1554l.l(e0VarD) | interfaceC1554l.l(view);
            Object objF = interfaceC1554l.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new C0002a(e0VarD, view);
                interfaceC1554l.J(objF);
            }
            C1516O.a(e0VarD, (Ba.l) objF, interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
            return e0VarD;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e0(C4469y0 c4469y0, View view, C3854k c3854k) {
        this(c4469y0, view);
    }

    public static /* synthetic */ void h(e0 e0Var, C4469y0 c4469y0, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        e0Var.g(c4469y0, i10);
    }

    public final void b(View view) {
        int i10 = this.accessCount - 1;
        this.accessCount = i10;
        if (i10 == 0) {
            s1.X.B0(view, null);
            s1.X.J0(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    /* renamed from: c, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    /* renamed from: d, reason: from getter */
    public final d0 getSafeContent() {
        return this.safeContent;
    }

    /* renamed from: e, reason: from getter */
    public final C0793a getSystemBars() {
        return this.systemBars;
    }

    public final void f(View view) {
        if (this.accessCount == 0) {
            s1.X.B0(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            s1.X.J0(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void g(C4469y0 windowInsets, int types) {
        if (f87A) {
            WindowInsets windowInsetsV = windowInsets.v();
            C3862t.d(windowInsetsV);
            windowInsets = C4469y0.w(windowInsetsV);
        }
        this.captionBar.h(windowInsets, types);
        this.ime.h(windowInsets, types);
        this.displayCutout.h(windowInsets, types);
        this.navigationBars.h(windowInsets, types);
        this.statusBars.h(windowInsets, types);
        this.systemBars.h(windowInsets, types);
        this.systemGestures.h(windowInsets, types);
        this.tappableElement.h(windowInsets, types);
        this.mandatorySystemGestures.h(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.f(j0.c(windowInsets.g(C4469y0.l.a())));
            this.navigationBarsIgnoringVisibility.f(j0.c(windowInsets.g(C4469y0.l.f())));
            this.statusBarsIgnoringVisibility.f(j0.c(windowInsets.g(C4469y0.l.g())));
            this.systemBarsIgnoringVisibility.f(j0.c(windowInsets.g(C4469y0.l.h())));
            this.tappableElementIgnoringVisibility.f(j0.c(windowInsets.g(C4469y0.l.j())));
            s1.r rVarE = windowInsets.e();
            if (rVarE != null) {
                this.waterfall.f(j0.c(rVarE.e()));
            }
        }
        androidx.compose.runtime.snapshots.g.INSTANCE.n();
    }

    public final void i(C4469y0 windowInsets) {
        this.imeAnimationSource.f(j0.c(windowInsets.f(C4469y0.l.c())));
    }

    public final void j(C4469y0 windowInsets) {
        this.imeAnimationTarget.f(j0.c(windowInsets.f(C4469y0.l.c())));
    }

    private e0(C4469y0 c4469y0, View view) {
        s1.r rVarE;
        C3719d c3719dE;
        Companion companion = INSTANCE;
        this.captionBar = companion.e(c4469y0, C4469y0.l.a(), "captionBar");
        C0793a c0793aE = companion.e(c4469y0, C4469y0.l.b(), "displayCutout");
        this.displayCutout = c0793aE;
        C0793a c0793aE2 = companion.e(c4469y0, C4469y0.l.c(), "ime");
        this.ime = c0793aE2;
        C0793a c0793aE3 = companion.e(c4469y0, C4469y0.l.e(), "mandatorySystemGestures");
        this.mandatorySystemGestures = c0793aE3;
        this.navigationBars = companion.e(c4469y0, C4469y0.l.f(), "navigationBars");
        this.statusBars = companion.e(c4469y0, C4469y0.l.g(), "statusBars");
        C0793a c0793aE4 = companion.e(c4469y0, C4469y0.l.h(), "systemBars");
        this.systemBars = c0793aE4;
        C0793a c0793aE5 = companion.e(c4469y0, C4469y0.l.i(), "systemGestures");
        this.systemGestures = c0793aE5;
        C0793a c0793aE6 = companion.e(c4469y0, C4469y0.l.j(), "tappableElement");
        this.tappableElement = c0793aE6;
        b0 b0VarA = j0.a((c4469y0 == null || (rVarE = c4469y0.e()) == null || (c3719dE = rVarE.e()) == null) ? C3719d.f43449e : c3719dE, "waterfall");
        this.waterfall = b0VarA;
        d0 d0VarG = f0.g(f0.g(c0793aE4, c0793aE2), c0793aE);
        this.safeDrawing = d0VarG;
        d0 d0VarG2 = f0.g(f0.g(f0.g(c0793aE6, c0793aE3), c0793aE5), b0VarA);
        this.safeGestures = d0VarG2;
        this.safeContent = f0.g(d0VarG, d0VarG2);
        this.captionBarIgnoringVisibility = companion.f(c4469y0, C4469y0.l.a(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.f(c4469y0, C4469y0.l.f(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.f(c4469y0, C4469y0.l.g(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.f(c4469y0, C4469y0.l.h(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.f(c4469y0, C4469y0.l.j(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.f(c4469y0, C4469y0.l.c(), "imeAnimationTarget");
        this.imeAnimationSource = companion.f(c4469y0, C4469y0.l.c(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(b0.l.f29943I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new D(this);
    }
}
