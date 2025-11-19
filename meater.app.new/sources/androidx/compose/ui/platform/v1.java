package androidx.compose.ui.platform;

import Xb.C1841i;
import ac.C1972g;
import ac.D;
import ac.InterfaceC1971f;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.view.View;
import android.view.ViewParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC1564q;
import kotlin.C1513M0;
import kotlin.C1579x0;
import kotlin.InterfaceC1545g0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import x0.C5047a;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\",\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001e\u0010!\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroid/view/View;", "LO/q;", "d", "(Landroid/view/View;)LO/q;", "Landroid/content/Context;", "applicationContext", "Lac/H;", "", "e", "(Landroid/content/Context;)Lac/H;", "Lta/g;", "coroutineContext", "Landroidx/lifecycle/m;", "lifecycle", "LO/M0;", "b", "(Landroid/view/View;Lta/g;Landroidx/lifecycle/m;)LO/M0;", "", "a", "Ljava/util/Map;", "animationScale", "value", "f", "i", "(Landroid/view/View;LO/q;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "h", "(Landroid/view/View;)LO/M0;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Context, ac.H<Float>> f23361a = new LinkedHashMap();

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/v1$b", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements InterfaceC2111s {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Xb.I f23364B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1579x0 f23365C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1513M0 f23366D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<C2050x0> f23367E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ View f23368F;

        /* compiled from: WindowRecomposer.android.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23369a;

            static {
                int[] iArr = new int[AbstractC2106m.a.values().length];
                try {
                    iArr[AbstractC2106m.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f23369a = iArr;
            }
        }

        /* compiled from: WindowRecomposer.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {396}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.v1$b$b, reason: collision with other inner class name */
        static final class C0330b extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f23370B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f23371C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O<C2050x0> f23372D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C1513M0 f23373E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ InterfaceC2114v f23374F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ b f23375G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ View f23376H;

            /* compiled from: WindowRecomposer.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.v1$b$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f23377B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ ac.H<Float> f23378C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ C2050x0 f23379D;

                /* compiled from: WindowRecomposer.android.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "Loa/F;", "b", "(FLta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.ui.platform.v1$b$b$a$a, reason: collision with other inner class name */
                static final class C0331a<T> implements InterfaceC1971f {

                    /* renamed from: B, reason: collision with root package name */
                    final /* synthetic */ C2050x0 f23380B;

                    C0331a(C2050x0 c2050x0) {
                        this.f23380B = c2050x0;
                    }

                    @Override // ac.InterfaceC1971f
                    public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC4588d interfaceC4588d) {
                        return b(((Number) obj).floatValue(), interfaceC4588d);
                    }

                    public final Object b(float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                        this.f23380B.c(f10);
                        return C4153F.f46609a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(ac.H<Float> h10, C2050x0 c2050x0, InterfaceC4588d<? super a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f23378C = h10;
                    this.f23379D = c2050x0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new a(this.f23378C, this.f23379D, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f23377B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        ac.H<Float> h10 = this.f23378C;
                        C0331a c0331a = new C0331a(this.f23379D);
                        this.f23377B = 1;
                        if (h10.b(c0331a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0330b(kotlin.jvm.internal.O<C2050x0> o10, C1513M0 c1513m0, InterfaceC2114v interfaceC2114v, b bVar, View view, InterfaceC4588d<? super C0330b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f23372D = o10;
                this.f23373E = c1513m0;
                this.f23374F = interfaceC2114v;
                this.f23375G = bVar;
                this.f23376H = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0330b c0330b = new C0330b(this.f23372D, this.f23373E, this.f23374F, this.f23375G, this.f23376H, interfaceC4588d);
                c0330b.f23371C = obj;
                return c0330b;
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0330b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r11.f23370B
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r11.f23371C
                    Xb.v0 r0 = (Xb.InterfaceC1867v0) r0
                    oa.C4173r.b(r12)     // Catch: java.lang.Throwable -> L14
                    goto L6a
                L14:
                    r12 = move-exception
                    goto L81
                L17:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1f:
                    oa.C4173r.b(r12)
                    java.lang.Object r12 = r11.f23371C
                    r4 = r12
                    Xb.I r4 = (Xb.I) r4
                    kotlin.jvm.internal.O<androidx.compose.ui.platform.x0> r12 = r11.f23372D     // Catch: java.lang.Throwable -> L58
                    T r12 = r12.f43978B     // Catch: java.lang.Throwable -> L58
                    androidx.compose.ui.platform.x0 r12 = (androidx.compose.ui.platform.C2050x0) r12     // Catch: java.lang.Throwable -> L58
                    if (r12 == 0) goto L5b
                    android.view.View r1 = r11.f23376H     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L58
                    ac.H r1 = androidx.compose.ui.platform.v1.a(r1)     // Catch: java.lang.Throwable -> L58
                    java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L58
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L58
                    float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L58
                    r12.c(r5)     // Catch: java.lang.Throwable -> L58
                    androidx.compose.ui.platform.v1$b$b$a r7 = new androidx.compose.ui.platform.v1$b$b$a     // Catch: java.lang.Throwable -> L58
                    r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L58
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    Xb.v0 r12 = Xb.C1837g.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
                    goto L5c
                L58:
                    r12 = move-exception
                    r0 = r3
                    goto L81
                L5b:
                    r12 = r3
                L5c:
                    O.M0 r1 = r11.f23373E     // Catch: java.lang.Throwable -> L7d
                    r11.f23371C = r12     // Catch: java.lang.Throwable -> L7d
                    r11.f23370B = r2     // Catch: java.lang.Throwable -> L7d
                    java.lang.Object r1 = r1.B0(r11)     // Catch: java.lang.Throwable -> L7d
                    if (r1 != r0) goto L69
                    return r0
                L69:
                    r0 = r12
                L6a:
                    if (r0 == 0) goto L6f
                    Xb.InterfaceC1867v0.a.a(r0, r3, r2, r3)
                L6f:
                    androidx.lifecycle.v r12 = r11.f23374F
                    androidx.lifecycle.m r12 = r12.getLifecycle()
                    androidx.compose.ui.platform.v1$b r0 = r11.f23375G
                    r12.d(r0)
                    oa.F r12 = oa.C4153F.f46609a
                    return r12
                L7d:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                L81:
                    if (r0 == 0) goto L86
                    Xb.InterfaceC1867v0.a.a(r0, r3, r2, r3)
                L86:
                    androidx.lifecycle.v r0 = r11.f23374F
                    androidx.lifecycle.m r0 = r0.getLifecycle()
                    androidx.compose.ui.platform.v1$b r1 = r11.f23375G
                    r0.d(r1)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.v1.b.C0330b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(Xb.I i10, C1579x0 c1579x0, C1513M0 c1513m0, kotlin.jvm.internal.O<C2050x0> o10, View view) {
            this.f23364B = i10;
            this.f23365C = c1579x0;
            this.f23366D = c1513m0;
            this.f23367E = o10;
            this.f23368F = view;
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v source, AbstractC2106m.a event) {
            int i10 = a.f23369a[event.ordinal()];
            if (i10 == 1) {
                C1841i.d(this.f23364B, null, Xb.K.f19033E, new C0330b(this.f23367E, this.f23366D, source, this, this.f23368F, null), 1, null);
                return;
            }
            if (i10 == 2) {
                C1579x0 c1579x0 = this.f23365C;
                if (c1579x0 != null) {
                    c1579x0.h();
                }
                this.f23366D.A0();
                return;
            }
            if (i10 == 3) {
                this.f23366D.n0();
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f23366D.a0();
            }
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {117, 123}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lac/f;", "", "Loa/F;", "<anonymous>", "(Lac/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC1971f<? super Float>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f23381B;

        /* renamed from: C, reason: collision with root package name */
        int f23382C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f23383D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ContentResolver f23384E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Uri f23385F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ d f23386G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Zb.g<C4153F> f23387H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Context f23388I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, Zb.g<C4153F> gVar, Context context, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f23384E = contentResolver;
            this.f23385F = uri;
            this.f23386G = dVar;
            this.f23387H = gVar;
            this.f23388I = context;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1971f<? super Float> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(interfaceC1971f, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = new c(this.f23384E, this.f23385F, this.f23386G, this.f23387H, this.f23388I, interfaceC4588d);
            cVar.f23383D = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r8.f23382C
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f23381B
                Zb.i r1 = (Zb.i) r1
                java.lang.Object r4 = r8.f23383D
                ac.f r4 = (ac.InterfaceC1971f) r4
                oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f23381B
                Zb.i r1 = (Zb.i) r1
                java.lang.Object r4 = r8.f23383D
                ac.f r4 = (ac.InterfaceC1971f) r4
                oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                oa.C4173r.b(r9)
                java.lang.Object r9 = r8.f23383D
                ac.f r9 = (ac.InterfaceC1971f) r9
                android.content.ContentResolver r1 = r8.f23384E
                android.net.Uri r4 = r8.f23385F
                r5 = 0
                androidx.compose.ui.platform.v1$d r6 = r8.f23386G
                r1.registerContentObserver(r4, r5, r6)
                Zb.g<oa.F> r1 = r8.f23387H     // Catch: java.lang.Throwable -> L1b
                Zb.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f23383D = r9     // Catch: java.lang.Throwable -> L1b
                r8.f23381B = r1     // Catch: java.lang.Throwable -> L1b
                r8.f23382C = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                return r0
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f23388I     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.b.b(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f23383D = r4     // Catch: java.lang.Throwable -> L1b
                r8.f23381B = r1     // Catch: java.lang.Throwable -> L1b
                r8.f23382C = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.a(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f23384E
                androidx.compose.ui.platform.v1$d r0 = r8.f23386G
                r9.unregisterContentObserver(r0)
                oa.F r9 = oa.C4153F.f46609a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f23384E
                androidx.compose.ui.platform.v1$d r1 = r8.f23386G
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.v1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/v1$d", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "Loa/F;", "onChange", "(ZLandroid/net/Uri;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Zb.g<C4153F> f23389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Zb.g<C4153F> gVar, Handler handler) {
            super(handler);
            this.f23389a = gVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            this.f23389a.w(C4153F.f46609a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.ui.platform.x0] */
    public static final C1513M0 b(View view, ta.g gVar, AbstractC2106m abstractC2106m) {
        C1579x0 c1579x0;
        if (gVar.b(ta.e.INSTANCE) == null || gVar.b(InterfaceC1545g0.INSTANCE) == null) {
            gVar = Q.INSTANCE.a().s(gVar);
        }
        InterfaceC1545g0 interfaceC1545g0 = (InterfaceC1545g0) gVar.b(InterfaceC1545g0.INSTANCE);
        if (interfaceC1545g0 != null) {
            C1579x0 c1579x02 = new C1579x0(interfaceC1545g0);
            c1579x02.c();
            c1579x0 = c1579x02;
        } else {
            c1579x0 = null;
        }
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        b0.k kVar = (b0.k) gVar.b(b0.k.INSTANCE);
        b0.k kVar2 = kVar;
        if (kVar == null) {
            ?? c2050x0 = new C2050x0();
            o10.f43978B = c2050x0;
            kVar2 = c2050x0;
        }
        ta.g gVarS = gVar.s(c1579x0 != null ? c1579x0 : ta.h.f50000B).s(kVar2);
        C1513M0 c1513m0 = new C1513M0(gVarS);
        c1513m0.n0();
        Xb.I iA = Xb.J.a(gVarS);
        if (abstractC2106m == null) {
            InterfaceC2114v interfaceC2114vA = android.view.View.a(view);
            abstractC2106m = interfaceC2114vA != null ? interfaceC2114vA.getLifecycle() : null;
        }
        if (abstractC2106m != null) {
            view.addOnAttachStateChangeListener(new a(view, c1513m0));
            abstractC2106m.a(new b(iA, c1579x0, c1513m0, o10, view));
            return c1513m0;
        }
        C5047a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ C1513M0 c(View view, ta.g gVar, AbstractC2106m abstractC2106m, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = ta.h.f50000B;
        }
        if ((i10 & 2) != 0) {
            abstractC2106m = null;
        }
        return b(view, gVar, abstractC2106m);
    }

    public static final AbstractC1564q d(View view) {
        AbstractC1564q abstractC1564qF = f(view);
        if (abstractC1564qF != null) {
            return abstractC1564qF;
        }
        for (ViewParent parent = view.getParent(); abstractC1564qF == null && (parent instanceof View); parent = parent.getParent()) {
            abstractC1564qF = f((View) parent);
        }
        return abstractC1564qF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ac.H<Float> e(Context context) {
        ac.H<Float> h10;
        Map<Context, ac.H<Float>> map = f23361a;
        synchronized (map) {
            try {
                ac.H<Float> hV = map.get(context);
                if (hV == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Zb.g gVarB = Zb.j.b(-1, null, null, 6, null);
                    hV = C1972g.v(C1972g.r(new c(contentResolver, uriFor, new d(gVarB, n1.i.a(Looper.getMainLooper())), gVarB, context, null)), Xb.J.b(), D.Companion.b(ac.D.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, hV);
                }
                h10 = hV;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h10;
    }

    public static final AbstractC1564q f(View view) {
        Object tag = view.getTag(b0.l.f29941G);
        if (tag instanceof AbstractC1564q) {
            return (AbstractC1564q) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final C1513M0 h(View view) {
        if (!view.isAttachedToWindow()) {
            C5047a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewG = g(view);
        AbstractC1564q abstractC1564qF = f(viewG);
        if (abstractC1564qF == null) {
            return u1.f23353a.a(viewG);
        }
        if (abstractC1564qF instanceof C1513M0) {
            return (C1513M0) abstractC1564qF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, AbstractC1564q abstractC1564q) {
        view.setTag(b0.l.f29941G, abstractC1564q);
    }

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/v1$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loa/F;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ View f23362B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1513M0 f23363C;

        a(View view, C1513M0 c1513m0) {
            this.f23362B = view;
            this.f23363C = c1513m0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            this.f23362B.removeOnAttachStateChangeListener(this);
            this.f23363C.a0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
        }
    }
}
