package androidx.compose.foundation.gestures;

import Ba.l;
import Ba.p;
import b0.i;
import b0.k;
import kotlin.C4758k0;
import kotlin.C5046z;
import kotlin.EnumC5037q;
import kotlin.InterfaceC5024d;
import kotlin.InterfaceC5034n;
import kotlin.InterfaceC5036p;
import kotlin.InterfaceC5041u;
import kotlin.InterfaceC5044x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.L;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import u0.C4627M;
import u0.PointerInputChange;
import ua.C4696b;
import w.I;
import z.InterfaceC5162k;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001&\u001ae\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lb0/i;", "Lx/x;", "state", "Lx/q;", "orientation", "Lw/I;", "overscrollEffect", "", "enabled", "reverseDirection", "Lx/n;", "flingBehavior", "Lz/k;", "interactionSource", "Lx/d;", "bringIntoViewSpec", "f", "(Lb0/i;Lx/x;Lx/q;Lw/I;ZZLx/n;Lz/k;Lx/d;)Lb0/i;", "Lx/z;", "Lh0/g;", "offset", "g", "(Lx/z;JLta/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lu0/z;", "a", "LBa/l;", "CanDragCalculation", "Lx/u;", "b", "Lx/u;", "NoOpScrollScope", "Lb0/k;", "c", "Lb0/k;", "e", "()Lb0/k;", "DefaultScrollMotionDurationScale", "androidx/compose/foundation/gestures/d$d", "d", "Landroidx/compose/foundation/gestures/d$d;", "UnityDensity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final l<PointerInputChange, Boolean> f22075a = a.f22079B;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC5041u f22076b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static final k f22077c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final C0314d f22078d = new C0314d();

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "change", "", "a", "(Lu0/z;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<PointerInputChange, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22079B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.valueOf(!C4627M.g(pointerInputChange.getType(), C4627M.INSTANCE.b()));
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/d$b", "Lb0/k;", "", "z", "()F", "scaleFactor", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements k {
        b() {
        }

        @Override // ta.g
        public <R> R L(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) k.a.a(this, r10, pVar);
        }

        @Override // ta.g
        public g N(g.c<?> cVar) {
            return k.a.c(this, cVar);
        }

        @Override // ta.g.b, ta.g
        public <E extends g.b> E b(g.c<E> cVar) {
            return (E) k.a.b(this, cVar);
        }

        @Override // ta.g
        public g s(g gVar) {
            return k.a.d(this, gVar);
        }

        @Override // b0.k
        public float z() {
            return 1.0f;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/d$d", "LU0/d;", "", "getDensity", "()F", "density", "R0", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.d$d, reason: collision with other inner class name */
    public static final class C0314d implements U0.d {
        C0314d() {
        }

        @Override // U0.l
        /* renamed from: R0 */
        public float getFontScale() {
            return 1.0f;
        }

        @Override // U0.d
        public float getDensity() {
            return 1.0f;
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {966}, m = "semanticsScrollBy-d-4ec7I")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f22080B;

        /* renamed from: C, reason: collision with root package name */
        Object f22081C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f22082D;

        /* renamed from: E, reason: collision with root package name */
        int f22083E;

        e(InterfaceC4588d<? super e> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22082D = obj;
            this.f22083E |= Integer.MIN_VALUE;
            return d.g(null, 0L, this);
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {967}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/p;", "Loa/F;", "<anonymous>", "(Lx/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22084B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f22085C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C5046z f22086D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f22087E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ L f22088F;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Loa/F;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements p<Float, Float, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ L f22089B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C5046z f22090C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ InterfaceC5036p f22091D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L l10, C5046z c5046z, InterfaceC5036p interfaceC5036p) {
                super(2);
                this.f22089B = l10;
                this.f22090C = c5046z;
                this.f22091D = interfaceC5036p;
            }

            public final void a(float f10, float f11) {
                float f12 = f10 - this.f22089B.f43975B;
                C5046z c5046z = this.f22090C;
                this.f22089B.f43975B += c5046z.t(c5046z.A(this.f22091D.b(c5046z.B(c5046z.t(f12)), t0.e.INSTANCE.b())));
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C5046z c5046z, long j10, L l10, InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22086D = c5046z;
            this.f22087E = j10;
            this.f22088F = l10;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5036p interfaceC5036p, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(interfaceC5036p, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = new f(this.f22086D, this.f22087E, this.f22088F, interfaceC4588d);
            fVar.f22085C = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22084B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5036p interfaceC5036p = (InterfaceC5036p) this.f22085C;
                float fA = this.f22086D.A(this.f22087E);
                a aVar = new a(this.f22088F, this.f22086D, interfaceC5036p);
                this.f22084B = 1;
                if (C4758k0.e(0.0f, fA, 0.0f, null, aVar, this, 12, null) == objE) {
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

    public static final k e() {
        return f22077c;
    }

    public static final i f(i iVar, InterfaceC5044x interfaceC5044x, EnumC5037q enumC5037q, I i10, boolean z10, boolean z11, InterfaceC5034n interfaceC5034n, InterfaceC5162k interfaceC5162k, InterfaceC5024d interfaceC5024d) {
        return iVar.e(new ScrollableElement(interfaceC5044x, enumC5037q, i10, z10, z11, interfaceC5034n, interfaceC5162k, interfaceC5024d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(kotlin.C5046z r11, long r12, ta.InterfaceC4588d<? super h0.C3476g> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.d.e
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.d$e r0 = (androidx.compose.foundation.gestures.d.e) r0
            int r1 = r0.f22083E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22083E = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.d$e r0 = new androidx.compose.foundation.gestures.d$e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f22082D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f22083E
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.f22081C
            kotlin.jvm.internal.L r11 = (kotlin.jvm.internal.L) r11
            java.lang.Object r12 = r0.f22080B
            x.z r12 = (kotlin.C5046z) r12
            oa.C4173r.b(r14)
            r14 = r11
            r11 = r12
            goto L5c
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            oa.C4173r.b(r14)
            kotlin.jvm.internal.L r14 = new kotlin.jvm.internal.L
            r14.<init>()
            w.C r2 = w.EnumC4950C.Default
            androidx.compose.foundation.gestures.d$f r10 = new androidx.compose.foundation.gestures.d$f
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f22080B = r11
            r0.f22081C = r14
            r0.f22083E = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L5c
            return r1
        L5c:
            float r12 = r14.f43975B
            long r11 = r11.B(r12)
            h0.g r11 = h0.C3476g.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.g(x.z, long, ta.d):java.lang.Object");
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/d$c", "Lx/u;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements InterfaceC5041u {
        c() {
        }

        @Override // kotlin.InterfaceC5041u
        public float a(float pixels) {
            return pixels;
        }
    }
}
