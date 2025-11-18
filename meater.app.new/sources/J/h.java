package J;

import Xb.C1841i;
import Xb.C1868w;
import Xb.I;
import Xb.InterfaceC1864u;
import Xb.InterfaceC1867v0;
import Xb.J;
import com.apptionlabs.meater_app.model.TemperatureLog;
import h0.C3476g;
import h0.C3477h;
import h0.C3482m;
import i0.C3600s0;
import i0.C3602t0;
import kotlin.C4716F;
import kotlin.C4737a;
import kotlin.C4739b;
import kotlin.C4755j;
import kotlin.C4761m;
import kotlin.C4768p0;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: RippleAnimation.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R+\u0010/\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R+\u00101\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b&\u0010,\"\u0004\b0\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"LJ/h;", "", "Lh0/g;", "origin", "", "radius", "", "bounded", "<init>", "(Lh0/g;FZLkotlin/jvm/internal/k;)V", "Loa/F;", "f", "(Lta/d;)Ljava/lang/Object;", "g", "d", "h", "()V", "Lk0/f;", "Li0/t0;", "color", "e", "(Lk0/f;J)V", "a", "Lh0/g;", "b", "F", "c", "Z", "Ljava/lang/Float;", "startRadius", "targetCenter", "Lv/a;", "Lv/m;", "Lv/a;", "animatedAlpha", "animatedRadiusPercent", "animatedCenterPercent", "LXb/u;", "i", "LXb/u;", "finishSignalDeferred", "<set-?>", "j", "LO/p0;", "()Z", "l", "(Z)V", "finishedFadingIn", "k", "finishRequested", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C3476g origin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Float startRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private C3476g targetCenter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C4737a<Float, C4761m> animatedAlpha;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C4737a<Float, C4761m> animatedRadiusPercent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C4737a<Float, C4761m> animatedCenterPercent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1864u<C4153F> finishSignalDeferred;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 finishedFadingIn;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 finishRequested;

    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {77, 79, 80}, m = "animate")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f7094B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f7095C;

        /* renamed from: E, reason: collision with root package name */
        int f7097E;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7095C = obj;
            this.f7097E |= Integer.MIN_VALUE;
            return h.this.d(this);
        }
    }

    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "LXb/v0;", "<anonymous>", "(LXb/I;)LXb/v0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super InterfaceC1867v0>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7098B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f7099C;

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {86}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f7101B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ h f7102C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f7102C = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f7102C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f7101B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C4737a c4737a = this.f7102C.animatedAlpha;
                    Float fB = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    C4768p0 c4768p0J = C4755j.j(75, 0, C4716F.e(), 2, null);
                    this.f7101B = 1;
                    if (C4737a.f(c4737a, fB, c4768p0J, null, null, this, 12, null) == objE) {
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

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {92}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: J.h$b$b, reason: collision with other inner class name */
        static final class C0147b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f7103B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ h f7104C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0147b(h hVar, InterfaceC4588d<? super C0147b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f7104C = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0147b(this.f7104C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0147b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f7103B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C4737a c4737a = this.f7104C.animatedRadiusPercent;
                    Float fB = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    C4768p0 c4768p0J = C4755j.j(225, 0, C4716F.d(), 2, null);
                    this.f7103B = 1;
                    if (C4737a.f(c4737a, fB, c4768p0J, null, null, this, 12, null) == objE) {
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

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {98}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f7105B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ h f7106C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h hVar, InterfaceC4588d<? super c> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f7106C = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new c(this.f7106C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f7105B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C4737a c4737a = this.f7106C.animatedCenterPercent;
                    Float fB = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    C4768p0 c4768p0J = C4755j.j(225, 0, C4716F.e(), 2, null);
                    this.f7105B = 1;
                    if (C4737a.f(c4737a, fB, c4768p0J, null, null, this, 12, null) == objE) {
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

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = h.this.new b(interfaceC4588d);
            bVar.f7099C = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super InterfaceC1867v0> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f7098B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            I i10 = (I) this.f7099C;
            C1841i.d(i10, null, null, new a(h.this, null), 3, null);
            C1841i.d(i10, null, null, new C0147b(h.this, null), 3, null);
            return C1841i.d(i10, null, null, new c(h.this, null), 3, null);
        }
    }

    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "LXb/v0;", "<anonymous>", "(LXb/I;)LXb/v0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super InterfaceC1867v0>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7107B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f7108C;

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {109}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f7110B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ h f7111C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f7111C = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f7111C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f7110B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C4737a c4737a = this.f7111C.animatedAlpha;
                    Float fB = kotlin.coroutines.jvm.internal.b.b(0.0f);
                    C4768p0 c4768p0J = C4755j.j(150, 0, C4716F.e(), 2, null);
                    this.f7110B = 1;
                    if (C4737a.f(c4737a, fB, c4768p0J, null, null, this, 12, null) == objE) {
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

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = h.this.new c(interfaceC4588d);
            cVar.f7108C = obj;
            return cVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super InterfaceC1867v0> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f7107B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return C1841i.d((I) this.f7108C, null, null, new a(h.this, null), 3, null);
        }
    }

    public /* synthetic */ h(C3476g c3476g, float f10, boolean z10, C3854k c3854k) {
        this(c3476g, f10, z10);
    }

    private final Object f(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new b(null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    private final Object g(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new c(null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.finishRequested.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j() {
        return ((Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void k(boolean z10) {
        this.finishRequested.setValue(Boolean.valueOf(z10));
    }

    private final void l(boolean z10) {
        this.finishedFadingIn.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ta.InterfaceC4588d<? super oa.C4153F> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof J.h.a
            if (r0 == 0) goto L13
            r0 = r7
            J.h$a r0 = (J.h.a) r0
            int r1 = r0.f7097E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7097E = r1
            goto L18
        L13:
            J.h$a r0 = new J.h$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7095C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f7097E
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            oa.C4173r.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f7094B
            J.h r2 = (J.h) r2
            oa.C4173r.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f7094B
            J.h r2 = (J.h) r2
            oa.C4173r.b(r7)
            goto L56
        L47:
            oa.C4173r.b(r7)
            r0.f7094B = r6
            r0.f7097E = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            Xb.u<oa.F> r7 = r2.finishSignalDeferred
            r0.f7094B = r2
            r0.f7097E = r4
            java.lang.Object r7 = r7.n(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.f7094B = r7
            r0.f7097E = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            oa.F r7 = oa.C4153F.f46609a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: J.h.d(ta.d):java.lang.Object");
    }

    public final void e(k0.f fVar, long j10) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(i.b(fVar.C()));
        }
        if (this.origin == null) {
            this.origin = C3476g.d(fVar.p1());
        }
        if (this.targetCenter == null) {
            this.targetCenter = C3476g.d(C3477h.a(C3482m.i(fVar.C()) / 2.0f, C3482m.g(fVar.C()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? this.animatedAlpha.m().floatValue() : 1.0f;
        Float f10 = this.startRadius;
        C3862t.d(f10);
        float fB = W0.b.b(f10.floatValue(), this.radius, this.animatedRadiusPercent.m().floatValue());
        C3476g c3476g = this.origin;
        C3862t.d(c3476g);
        float fM = C3476g.m(c3476g.getPackedValue());
        C3476g c3476g2 = this.targetCenter;
        C3862t.d(c3476g2);
        float fB2 = W0.b.b(fM, C3476g.m(c3476g2.getPackedValue()), this.animatedCenterPercent.m().floatValue());
        C3476g c3476g3 = this.origin;
        C3862t.d(c3476g3);
        float fN = C3476g.n(c3476g3.getPackedValue());
        C3476g c3476g4 = this.targetCenter;
        C3862t.d(c3476g4);
        long jA = C3477h.a(fB2, W0.b.b(fN, C3476g.n(c3476g4.getPackedValue()), this.animatedCenterPercent.m().floatValue()));
        long jK = C3602t0.k(j10, C3602t0.n(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            k0.f.r1(fVar, jK, fB, jA, 0.0f, null, null, 0, TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, null);
            return;
        }
        float fI = C3482m.i(fVar.C());
        float fG = C3482m.g(fVar.C());
        int iB = C3600s0.INSTANCE.b();
        k0.d drawContext = fVar.getDrawContext();
        long jC = drawContext.C();
        drawContext.G().h();
        try {
            drawContext.getTransform().a(0.0f, 0.0f, fI, fG, iB);
            k0.f.r1(fVar, jK, fB, jA, 0.0f, null, null, 0, TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, null);
        } finally {
            drawContext.G().t();
            drawContext.E(jC);
        }
    }

    public final void h() {
        k(true);
        this.finishSignalDeferred.X(C4153F.f46609a);
    }

    private h(C3476g c3476g, float f10, boolean z10) {
        this.origin = c3476g;
        this.radius = f10;
        this.bounded = z10;
        this.animatedAlpha = C4739b.b(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = C4739b.b(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = C4739b.b(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = C1868w.a(null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn = r1.c(bool, null, 2, null);
        this.finishRequested = r1.c(bool, null, 2, null);
    }
}
