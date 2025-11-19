package kotlin;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.InterfaceC0797e;
import A.InterfaceC0801i;
import A0.InterfaceC0828g;
import Ba.l;
import Ba.p;
import Ba.q;
import F0.v;
import F0.x;
import U0.n;
import U0.o;
import U0.t;
import Xb.C1841i;
import Xb.I;
import Y.j;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.platform.C2013e0;
import b0.c;
import b0.i;
import h0.C3476g;
import i0.c1;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1516O;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C4768p0;
import kotlin.C5018A;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4631Q;
import u0.InterfaceC4622H;
import ua.C4696b;
import w.C4960e;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0084\u0001\u0010\u0019\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010\u001c\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010#\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010$\"\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%\"\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%\"\u0014\u0010)\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%\"\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/²\u0006\f\u0010.\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"LI/z;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "LI/y;", "j", "(LI/z;LBa/l;LO/l;II)LI/y;", "LA/i;", "Loa/F;", "drawerContent", "Lb0/i;", "modifier", "drawerState", "gesturesEnabled", "Li0/c1;", "drawerShape", "LU0/h;", "drawerElevation", "Li0/t0;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "a", "(LBa/q;Lb0/i;LI/y;ZLi0/c1;FJJJLBa/p;LO/l;II)V", "", "b", "pos", "i", "(FFF)F", "open", "onClose", "fraction", "color", "(ZLBa/a;LBa/a;JLO/l;I)V", "F", "EndDrawerPadding", "DrawerPositionalThreshold", "c", "DrawerVelocityThreshold", "Lv/p0;", "d", "Lv/p0;", "AnimationSpec", "alpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1161x {

    /* renamed from: a, reason: collision with root package name */
    private static final float f6477a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f6478b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f6479c = U0.h.u(400);

    /* renamed from: d, reason: collision with root package name */
    private static final C4768p0<Float> f6480d = new C4768p0<>(256, 0, null, 6, null);

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA/e;", "Loa/F;", "a", "(LA/e;LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.x$a */
    static final class a extends AbstractC3864v implements q<InterfaceC0797e, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1162y f6481B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f6482C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ I f6483D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f6484E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ c1 f6485F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f6486G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f6487H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f6488I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6489J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f6490K;

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$a$a, reason: collision with other inner class name */
        static final class C0125a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1162y f6491B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ U0.d f6492C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ float f6493D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ float f6494E;

            /* compiled from: Drawer.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI/v;", "LI/z;", "Loa/F;", "a", "(LI/v;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.x$a$a$a, reason: collision with other inner class name */
            static final class C0126a extends AbstractC3864v implements l<C1159v<EnumC1163z>, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ float f6495B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ float f6496C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0126a(float f10, float f11) {
                    super(1);
                    this.f6495B = f10;
                    this.f6496C = f11;
                }

                public final void a(C1159v<EnumC1163z> c1159v) {
                    c1159v.a(EnumC1163z.Closed, this.f6495B);
                    c1159v.a(EnumC1163z.Open, this.f6496C);
                }

                @Override // Ba.l
                public /* bridge */ /* synthetic */ C4153F invoke(C1159v<EnumC1163z> c1159v) {
                    a(c1159v);
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125a(C1162y c1162y, U0.d dVar, float f10, float f11) {
                super(0);
                this.f6491B = c1162y;
                this.f6492C = dVar;
                this.f6493D = f10;
                this.f6494E = f11;
            }

            public final void a() {
                this.f6491B.h(this.f6492C);
                C1140c.I(this.f6491B.c(), C1139b.a(new C0126a(this.f6493D, this.f6494E)), null, 2, null);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$a$b */
        static final class b extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ boolean f6497B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C1162y f6498C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ I f6499D;

            /* compiled from: Drawer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {542}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.x$a$b$a, reason: collision with other inner class name */
            static final class C0127a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f6500B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C1162y f6501C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0127a(C1162y c1162y, InterfaceC4588d<? super C0127a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f6501C = c1162y;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0127a(this.f6501C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0127a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f6500B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C1162y c1162y = this.f6501C;
                        this.f6500B = 1;
                        if (c1162y.b(this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z10, C1162y c1162y, I i10) {
                super(0);
                this.f6497B = z10;
                this.f6498C = c1162y;
                this.f6499D = i10;
            }

            public final void a() {
                if (this.f6497B && this.f6498C.c().q().invoke(EnumC1163z.Closed).booleanValue()) {
                    C1841i.d(this.f6499D, null, null, new C0127a(this.f6498C, null), 3, null);
                }
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$a$c */
        static final class c extends AbstractC3864v implements Ba.a<Float> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ float f6502B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ float f6503C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C1162y f6504D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f10, float f11, C1162y c1162y) {
                super(0);
                this.f6502B = f10;
                this.f6503C = f11;
                this.f6504D = c1162y;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(C1161x.i(this.f6502B, this.f6503C, this.f6504D.g()));
            }
        }

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/d;", "LU0/n;", "a", "(LU0/d;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$a$d */
        static final class d extends AbstractC3864v implements l<U0.d, n> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1162y f6505B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C1162y c1162y) {
                super(1);
                this.f6505B = c1162y;
            }

            public final long a(U0.d dVar) {
                return o.a(Da.a.c(this.f6505B.g()), 0);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ n invoke(U0.d dVar) {
                return n.b(a(dVar));
            }
        }

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$a$e */
        static final class e extends AbstractC3864v implements l<x, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ String f6506B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C1162y f6507C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ I f6508D;

            /* compiled from: Drawer.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.x$a$e$a, reason: collision with other inner class name */
            static final class C0128a extends AbstractC3864v implements Ba.a<Boolean> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ C1162y f6509B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ I f6510C;

                /* compiled from: Drawer.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {577}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: I.x$a$e$a$a, reason: collision with other inner class name */
                static final class C0129a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                    /* renamed from: B, reason: collision with root package name */
                    int f6511B;

                    /* renamed from: C, reason: collision with root package name */
                    final /* synthetic */ C1162y f6512C;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0129a(C1162y c1162y, InterfaceC4588d<? super C0129a> interfaceC4588d) {
                        super(2, interfaceC4588d);
                        this.f6512C = c1162y;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                        return new C0129a(this.f6512C, interfaceC4588d);
                    }

                    @Override // Ba.p
                    public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                        return ((C0129a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objE = C4696b.e();
                        int i10 = this.f6511B;
                        if (i10 == 0) {
                            C4173r.b(obj);
                            C1162y c1162y = this.f6512C;
                            this.f6511B = 1;
                            if (c1162y.b(this) == objE) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0128a(C1162y c1162y, I i10) {
                    super(0);
                    this.f6509B = c1162y;
                    this.f6510C = i10;
                }

                @Override // Ba.a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    if (this.f6509B.c().q().invoke(EnumC1163z.Closed).booleanValue()) {
                        C1841i.d(this.f6510C, null, null, new C0129a(this.f6509B, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, C1162y c1162y, I i10) {
                super(1);
                this.f6506B = str;
                this.f6507C = c1162y;
                this.f6508D = i10;
            }

            public final void a(x xVar) {
                v.F(xVar, this.f6506B);
                if (this.f6507C.e()) {
                    v.h(xVar, null, new C0128a(this.f6507C, this.f6508D), 1, null);
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
                a(xVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$a$f */
        static final class f extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f6513B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
                super(2);
                this.f6513B = qVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-1941234439, i10, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:586)");
                }
                i iVarF = r.f(i.INSTANCE, 0.0f, 1, null);
                q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> qVar = this.f6513B;
                y0.I iA = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.k(), interfaceC1554l, 0);
                int iA2 = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = b0.h.e(interfaceC1554l, iVarF);
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
                C1.b(interfaceC1554lA, iA, aVar.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, aVar.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = aVar.b();
                if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                    interfaceC1554lA.J(Integer.valueOf(iA2));
                    interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, aVar.d());
                qVar.g(C0802j.f149a, interfaceC1554l, 6);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C1162y c1162y, boolean z10, I i10, long j10, c1 c1Var, long j11, long j12, float f10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(3);
            this.f6481B = c1162y;
            this.f6482C = z10;
            this.f6483D = i10;
            this.f6484E = j10;
            this.f6485F = c1Var;
            this.f6486G = j11;
            this.f6487H = j12;
            this.f6488I = f10;
            this.f6489J = pVar;
            this.f6490K = qVar;
        }

        public final void a(InterfaceC0797e interfaceC0797e, InterfaceC1554l interfaceC1554l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC1554l.R(interfaceC0797e) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(816674999, i11, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:503)");
            }
            long jC = interfaceC0797e.getConstraints();
            if (!U0.b.h(jC)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            float f10 = -U0.b.l(jC);
            U0.d dVar = (U0.d) interfaceC1554l.o(C2013e0.d());
            boolean zR = interfaceC1554l.R(this.f6481B) | interfaceC1554l.R(dVar) | interfaceC1554l.g(f10);
            C1162y c1162y = this.f6481B;
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new C0125a(c1162y, dVar, f10, 0.0f);
                interfaceC1554l.J(objF);
            }
            C1516O.g((Ba.a) objF, interfaceC1554l, 0);
            boolean z10 = interfaceC1554l.o(C2013e0.h()) == t.Rtl;
            i.Companion companion = i.INSTANCE;
            i iVarE = C1139b.e(companion, this.f6481B.c(), EnumC5037q.Horizontal, this.f6482C, z10, null, false, 48, null);
            C1162y c1162y2 = this.f6481B;
            boolean z11 = this.f6482C;
            I i12 = this.f6483D;
            long j10 = this.f6484E;
            c1 c1Var = this.f6485F;
            long j11 = this.f6486G;
            long j12 = this.f6487H;
            float f11 = this.f6488I;
            p<InterfaceC1554l, Integer, C4153F> pVar = this.f6489J;
            q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> qVar = this.f6490K;
            c.Companion companion2 = b0.c.INSTANCE;
            y0.I iH = androidx.compose.foundation.layout.d.h(companion2.o(), false);
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE2 = b0.h.e(interfaceC1554l, iVarE);
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
            C1.b(interfaceC1554lA, iH, aVar.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, aVar.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = aVar.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE2, aVar.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            y0.I iH2 = androidx.compose.foundation.layout.d.h(companion2.o(), false);
            int iA2 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF2 = interfaceC1554l.F();
            i iVarE3 = b0.h.e(interfaceC1554l, companion);
            Ba.a<InterfaceC0828g> aVarA2 = aVar.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.getInserting()) {
                interfaceC1554l.T(aVarA2);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA2, iH2, aVar.c());
            C1.b(interfaceC1554lA2, interfaceC1578xF2, aVar.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB2 = aVar.b();
            if (interfaceC1554lA2.getInserting() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA2.J(Integer.valueOf(iA2));
                interfaceC1554lA2.k(Integer.valueOf(iA2), pVarB2);
            }
            C1.b(interfaceC1554lA2, iVarE3, aVar.d());
            pVar.invoke(interfaceC1554l, 0);
            interfaceC1554l.P();
            boolean zE = c1162y2.e();
            boolean zC = interfaceC1554l.c(z11) | interfaceC1554l.R(c1162y2) | interfaceC1554l.l(i12);
            Object objF2 = interfaceC1554l.f();
            if (zC || objF2 == InterfaceC1554l.INSTANCE.a()) {
                objF2 = new b(z11, c1162y2, i12);
                interfaceC1554l.J(objF2);
            }
            Ba.a aVar2 = (Ba.a) objF2;
            boolean zG = interfaceC1554l.g(f10) | interfaceC1554l.R(c1162y2);
            Object objF3 = interfaceC1554l.f();
            if (zG || objF3 == InterfaceC1554l.INSTANCE.a()) {
                objF3 = new c(f10, 0.0f, c1162y2);
                interfaceC1554l.J(objF3);
            }
            C1161x.b(zE, aVar2, (Ba.a) objF3, j10, interfaceC1554l, 0);
            String strA = j0.a(i0.INSTANCE.e(), interfaceC1554l, 6);
            U0.d dVar2 = (U0.d) interfaceC1554l.o(C2013e0.d());
            i iVarO = r.o(companion, dVar2.E0(U0.b.n(jC)), dVar2.E0(U0.b.m(jC)), dVar2.E0(U0.b.l(jC)), dVar2.E0(U0.b.k(jC)));
            boolean zR2 = interfaceC1554l.R(c1162y2);
            Object objF4 = interfaceC1554l.f();
            if (zR2 || objF4 == InterfaceC1554l.INSTANCE.a()) {
                objF4 = new d(c1162y2);
                interfaceC1554l.J(objF4);
            }
            i iVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.l.a(iVarO, (l) objF4), 0.0f, 0.0f, C1161x.f6477a, 0.0f, 11, null);
            boolean zR3 = interfaceC1554l.R(strA) | interfaceC1554l.R(c1162y2) | interfaceC1554l.l(i12);
            Object objF5 = interfaceC1554l.f();
            if (zR3 || objF5 == InterfaceC1554l.INSTANCE.a()) {
                objF5 = new e(strA, c1162y2, i12);
                interfaceC1554l.J(objF5);
            }
            k0.a(F0.o.d(iVarM, false, (l) objF5, 1, null), c1Var, j11, j12, null, f11, W.c.d(-1941234439, true, new f(qVar), interfaceC1554l, 54), interfaceC1554l, 1572864, 16);
            interfaceC1554l.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(InterfaceC0797e interfaceC0797e, InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC0797e, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.x$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f6514B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f6515C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1162y f6516D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f6517E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ c1 f6518F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f6519G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f6520H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f6521I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f6522J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6523K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f6524L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f6525M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, i iVar, C1162y c1162y, boolean z10, c1 c1Var, float f10, long j10, long j11, long j12, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10, int i11) {
            super(2);
            this.f6514B = qVar;
            this.f6515C = iVar;
            this.f6516D = c1162y;
            this.f6517E = z10;
            this.f6518F = c1Var;
            this.f6519G = f10;
            this.f6520H = j10;
            this.f6521I = j11;
            this.f6522J = j12;
            this.f6523K = pVar;
            this.f6524L = i10;
            this.f6525M = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1161x.a(this.f6514B, this.f6515C, this.f6516D, this.f6517E, this.f6518F, this.f6519G, this.f6520H, this.f6521I, this.f6522J, this.f6523K, interfaceC1554l, C1509K0.a(this.f6524L | 1), this.f6525M);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.x$c */
    static final class c extends AbstractC3864v implements l<k0.f, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ long f6526B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<Float> f6527C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, Ba.a<Float> aVar) {
            super(1);
            this.f6526B = j10;
            this.f6527C = aVar;
        }

        public final void a(k0.f fVar) {
            k0.f.T0(fVar, this.f6526B, 0L, 0L, this.f6527C.invoke().floatValue(), null, null, 0, 118, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.x$d */
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ boolean f6528B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f6529C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a<Float> f6530D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f6531E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f6532F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, Ba.a<C4153F> aVar, Ba.a<Float> aVar2, long j10, int i10) {
            super(2);
            this.f6528B = z10;
            this.f6529C = aVar;
            this.f6530D = aVar2;
            this.f6531E = j10;
            this.f6532F = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1161x.b(this.f6528B, this.f6529C, this.f6530D, this.f6531E, interfaceC1554l, C1509K0.a(this.f6532F | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Drawer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {834}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.x$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6533B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f6534C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f6535D;

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/g;", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$e$a */
        static final class a extends AbstractC3864v implements l<C3476g, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Ba.a<C4153F> f6536B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ba.a<C4153F> aVar) {
                super(1);
                this.f6536B = aVar;
            }

            public final void a(long j10) {
                this.f6536B.invoke();
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C3476g c3476g) {
                a(c3476g.getPackedValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ba.a<C4153F> aVar, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6535D = aVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            e eVar = new e(this.f6535D, interfaceC4588d);
            eVar.f6534C = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6533B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4622H interfaceC4622H = (InterfaceC4622H) this.f6534C;
                a aVar = new a(this.f6535D);
                this.f6533B = 1;
                if (C5018A.j(interfaceC4622H, null, null, null, aVar, this, 7, null) == objE) {
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

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.x$f */
    static final class f extends AbstractC3864v implements l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f6537B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f6538C;

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.x$f$a */
        static final class a extends AbstractC3864v implements Ba.a<Boolean> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Ba.a<C4153F> f6539B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ba.a<C4153F> aVar) {
                super(0);
                this.f6539B = aVar;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f6539B.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Ba.a<C4153F> aVar) {
            super(1);
            this.f6537B = str;
            this.f6538C = aVar;
        }

        public final void a(x xVar) {
            v.B(xVar, this.f6537B);
            v.p(xVar, null, new a(this.f6538C), 1, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.x$g */
    static final class g extends AbstractC3864v implements l<EnumC1163z, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f6540B = new g();

        g() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC1163z enumC1163z) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI/y;", "a", "()LI/y;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.x$h */
    static final class h extends AbstractC3864v implements Ba.a<C1162y> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ EnumC1163z f6541B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ l<EnumC1163z, Boolean> f6542C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(EnumC1163z enumC1163z, l<? super EnumC1163z, Boolean> lVar) {
            super(0);
            this.f6541B = enumC1163z;
            this.f6542C = lVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1162y invoke() {
            return new C1162y(this.f6541B, this.f6542C);
        }
    }

    static {
        float f10 = 56;
        f6477a = U0.h.u(f10);
        f6478b = U0.h.u(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Ba.q<? super A.InterfaceC0801i, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r34, b0.i r35, kotlin.C1162y r36, boolean r37, i0.c1 r38, float r39, long r40, long r42, long r44, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r46, kotlin.InterfaceC1554l r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1161x.a(Ba.q, b0.i, I.y, boolean, i0.c1, float, long, long, long, Ba.p, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z10, Ba.a<C4153F> aVar, Ba.a<Float> aVar2, long j10, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        i iVarC;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1983403750);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.l(aVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1554lR.i(j10) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:829)");
            }
            String strA = j0.a(i0.INSTANCE.a(), interfaceC1554lR, 6);
            if (z10) {
                interfaceC1554lR.S(487729414);
                i.Companion companion = i.INSTANCE;
                int i12 = i11 & 112;
                boolean z11 = i12 == 32;
                Object objF = interfaceC1554lR.f();
                if (z11 || objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = new e(aVar, null);
                    interfaceC1554lR.J(objF);
                }
                i iVarC2 = C4631Q.c(companion, aVar, (p) objF);
                boolean zR = (i12 == 32) | interfaceC1554lR.R(strA);
                Object objF2 = interfaceC1554lR.f();
                if (zR || objF2 == InterfaceC1554l.INSTANCE.a()) {
                    objF2 = new f(strA, aVar);
                    interfaceC1554lR.J(objF2);
                }
                iVarC = F0.o.c(iVarC2, true, (l) objF2);
                interfaceC1554lR.I();
            } else {
                interfaceC1554lR.S(487978282);
                interfaceC1554lR.I();
                iVarC = i.INSTANCE;
            }
            i iVarE = r.f(i.INSTANCE, 0.0f, 1, null).e(iVarC);
            boolean z12 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objF3 = interfaceC1554lR.f();
            if (z12 || objF3 == InterfaceC1554l.INSTANCE.a()) {
                objF3 = new c(j10, aVar2);
                interfaceC1554lR.J(objF3);
            }
            C4960e.a(iVarE, (l) objF3, interfaceC1554lR, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new d(z10, aVar, aVar2, j10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f10, float f11, float f12) {
        float f13 = (f12 - f10) / (f11 - f10);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            return 1.0f;
        }
        return f13;
    }

    public static final C1162y j(EnumC1163z enumC1163z, l<? super EnumC1163z, Boolean> lVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            lVar = g.f6540B;
        }
        if (C1560o.J()) {
            C1560o.S(-1435874229, i10, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:429)");
        }
        Object[] objArr = new Object[0];
        j<C1162y, EnumC1163z> jVarA = C1162y.INSTANCE.a(lVar);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.R(enumC1163z)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.R(lVar)) || (i10 & 48) == 32);
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new h(enumC1163z, lVar);
            interfaceC1554l.J(objF);
        }
        C1162y c1162y = (C1162y) Y.b.c(objArr, jVarA, null, (Ba.a) objF, interfaceC1554l, 0, 4);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1162y;
    }
}
