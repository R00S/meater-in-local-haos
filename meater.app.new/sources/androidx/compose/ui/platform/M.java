package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.C2036q;
import kotlin.AbstractC1501G0;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import t3.InterfaceC4549f;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019¨\u0006+²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/q;", "owner", "Lkotlin/Function0;", "Loa/F;", "content", "a", "(Landroidx/compose/ui/platform/q;LBa/p;LO/l;I)V", "Landroid/content/Context;", "context", "LD0/f;", "n", "(Landroid/content/Context;LO/l;I)LD0/f;", "Landroid/content/res/Configuration;", "configuration", "LD0/d;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;LO/l;I)LD0/d;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "LO/G0;", "LO/G0;", "f", "()LO/G0;", "LocalConfiguration", "b", "g", "LocalContext", "c", "h", "LocalImageVectorCache", "d", "i", "LocalResourceIdCache", "Lt3/f;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<Configuration> f22922a = C1576w.d(null, a.f22928B, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1501G0<Context> f22923b = C1576w.f(b.f22929B);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1501G0<D0.d> f22924c = C1576w.f(c.f22930B);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC1501G0<D0.f> f22925d = C1576w.f(d.f22931B);

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC4549f> f22926e = C1576w.f(e.f22932B);

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC1501G0<View> f22927f = C1576w.f(f.f22933B);

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "a", "()Landroid/content/res/Configuration;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Configuration> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22928B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            M.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "a", "()Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<Context> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f22929B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            M.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LD0/d;", "a", "()LD0/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<D0.d> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f22930B = new c();

        c() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D0.d invoke() {
            M.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LD0/f;", "a", "()LD0/f;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<D0.f> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f22931B = new d();

        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D0.f invoke() {
            M.l("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt3/f;", "a", "()Lt3/f;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.a<InterfaceC4549f> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f22932B = new e();

        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4549f invoke() {
            M.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.a<View> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f22933B = new f();

        f() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            M.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Loa/F;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.l<Configuration, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<Configuration> f22934B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC1563p0<Configuration> interfaceC1563p0) {
            super(1);
            this.f22934B = interfaceC1563p0;
        }

        public final void a(Configuration configuration) {
            M.c(this.f22934B, new Configuration(configuration));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Configuration configuration) {
            a(configuration);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C2019h0 f22935B;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/M$h$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2019h0 f22936a;

            public a(C2019h0 c2019h0) {
                this.f22936a = c2019h0;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f22936a.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C2019h0 c2019h0) {
            super(1);
            this.f22935B = c2019h0;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            return new a(this.f22935B);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C2036q f22937B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ U f22938C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f22939D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(C2036q c2036q, U u10, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
            super(2);
            this.f22937B = c2036q;
            this.f22938C = u10;
            this.f22939D = pVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
            }
            C2013e0.a(this.f22937B, this.f22938C, this.f22939D, interfaceC1554l, 0);
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

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C2036q f22940B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f22941C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f22942D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(C2036q c2036q, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f22940B = c2036q;
            this.f22941C = pVar;
            this.f22942D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            M.a(this.f22940B, this.f22941C, interfaceC1554l, C1509K0.a(this.f22942D | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class k extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Context f22943B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ l f22944C;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/M$k$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f22945a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f22946b;

            public a(Context context, l lVar) {
                this.f22945a = context;
                this.f22946b = lVar;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f22945a.getApplicationContext().unregisterComponentCallbacks(this.f22946b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f22943B = context;
            this.f22944C = lVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            this.f22943B.getApplicationContext().registerComponentCallbacks(this.f22944C);
            return new a(this.f22943B, this.f22944C);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/M$l", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "configuration", "Loa/F;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Configuration f22947B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ D0.d f22948C;

        l(Configuration configuration, D0.d dVar) {
            this.f22947B = configuration;
            this.f22948C = dVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f22948C.c(this.f22947B.updateFrom(configuration));
            this.f22947B.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f22948C.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f22948C.a();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class m extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Context f22949B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ n f22950C;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/M$m$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f22951a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f22952b;

            public a(Context context, n nVar) {
                this.f22951a = context;
                this.f22952b = nVar;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f22951a.getApplicationContext().unregisterComponentCallbacks(this.f22952b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f22949B = context;
            this.f22950C = nVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            this.f22949B.getApplicationContext().registerComponentCallbacks(this.f22950C);
            return new a(this.f22949B, this.f22950C);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/M$n", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "Loa/F;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n implements ComponentCallbacks2 {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ D0.f f22953B;

        n(D0.f fVar) {
            this.f22953B = fVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            this.f22953B.a();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f22953B.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f22953B.a();
        }
    }

    public static final void a(C2036q c2036q, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1396852028);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(c2036q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1396852028, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = c2036q.getContext();
            Object objF = interfaceC1554lR.f();
            InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
            if (objF == companion.a()) {
                objF = kotlin.r1.c(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                interfaceC1554lR.J(objF);
            }
            InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
            Object objF2 = interfaceC1554lR.f();
            if (objF2 == companion.a()) {
                objF2 = new g(interfaceC1563p0);
                interfaceC1554lR.J(objF2);
            }
            c2036q.setConfigurationChangeObserver((Ba.l) objF2);
            Object objF3 = interfaceC1554lR.f();
            if (objF3 == companion.a()) {
                objF3 = new U(context);
                interfaceC1554lR.J(objF3);
            }
            U u10 = (U) objF3;
            C2036q.b viewTreeOwners = c2036q.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objF4 = interfaceC1554lR.f();
            if (objF4 == companion.a()) {
                objF4 = C2023j0.b(c2036q, viewTreeOwners.getSavedStateRegistryOwner());
                interfaceC1554lR.J(objF4);
            }
            C2019h0 c2019h0 = (C2019h0) objF4;
            C4153F c4153f = C4153F.f46609a;
            boolean zL = interfaceC1554lR.l(c2019h0);
            Object objF5 = interfaceC1554lR.f();
            if (zL || objF5 == companion.a()) {
                objF5 = new h(c2019h0);
                interfaceC1554lR.J(objF5);
            }
            C1516O.a(c4153f, (Ba.l) objF5, interfaceC1554lR, 6);
            C1576w.b(new C1503H0[]{f22922a.d(b(interfaceC1563p0)), f22923b.d(context), O1.a.a().d(viewTreeOwners.getLifecycleOwner()), f22926e.d(viewTreeOwners.getSavedStateRegistryOwner()), Y.i.d().d(c2019h0), f22927f.d(c2036q.getView()), f22924c.d(m(context, b(interfaceC1563p0), interfaceC1554lR, 0)), f22925d.d(n(context, interfaceC1554lR, 0)), C2013e0.j().d(Boolean.valueOf(((Boolean) interfaceC1554lR.o(C2013e0.k())).booleanValue() | c2036q.getScrollCaptureInProgress$ui_release()))}, W.c.d(1471621628, true, new i(c2036q, u10, pVar), interfaceC1554lR, 54), interfaceC1554lR, C1503H0.f12626i | 48);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        kotlin.W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new j(c2036q, pVar, i10));
        }
    }

    private static final Configuration b(InterfaceC1563p0<Configuration> interfaceC1563p0) {
        return interfaceC1563p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC1563p0<Configuration> interfaceC1563p0, Configuration configuration) {
        interfaceC1563p0.setValue(configuration);
    }

    public static final AbstractC1501G0<Configuration> f() {
        return f22922a;
    }

    public static final AbstractC1501G0<Context> g() {
        return f22923b;
    }

    public static final AbstractC1501G0<D0.d> h() {
        return f22924c;
    }

    public static final AbstractC1501G0<D0.f> i() {
        return f22925d;
    }

    public static final AbstractC1501G0<InterfaceC4549f> j() {
        return f22926e;
    }

    public static final AbstractC1501G0<View> k() {
        return f22927f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final D0.d m(Context context, Configuration configuration, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = new D0.d();
            interfaceC1554l.J(objF);
        }
        D0.d dVar = (D0.d) objF;
        Object objF2 = interfaceC1554l.f();
        Object obj = objF2;
        if (objF2 == companion.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC1554l.J(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objF3 = interfaceC1554l.f();
        if (objF3 == companion.a()) {
            objF3 = new l(configuration3, dVar);
            interfaceC1554l.J(objF3);
        }
        l lVar = (l) objF3;
        boolean zL = interfaceC1554l.l(context);
        Object objF4 = interfaceC1554l.f();
        if (zL || objF4 == companion.a()) {
            objF4 = new k(context, lVar);
            interfaceC1554l.J(objF4);
        }
        C1516O.a(dVar, (Ba.l) objF4, interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return dVar;
    }

    private static final D0.f n(Context context, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = new D0.f();
            interfaceC1554l.J(objF);
        }
        D0.f fVar = (D0.f) objF;
        Object objF2 = interfaceC1554l.f();
        if (objF2 == companion.a()) {
            objF2 = new n(fVar);
            interfaceC1554l.J(objF2);
        }
        n nVar = (n) objF2;
        boolean zL = interfaceC1554l.l(context);
        Object objF3 = interfaceC1554l.f();
        if (zL || objF3 == companion.a()) {
            objF3 = new m(context, nVar);
            interfaceC1554l.J(objF3);
        }
        C1516O.a(fVar, (Ba.l) objF3, interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return fVar;
    }
}
