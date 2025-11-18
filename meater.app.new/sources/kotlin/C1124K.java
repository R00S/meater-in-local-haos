package kotlin;

import U0.h;
import kotlin.C4737a;
import kotlin.C4761m;
import kotlin.C4774s0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C3854k;
import kotlin.x1;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.C5155d;
import z.C5157f;
import z.InterfaceC5159h;
import z.m;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LI/K;", "", "LU0/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/k;)V", "Lz/h;", "d", "(Lz/h;)F", "Loa/F;", "e", "(Lta/d;)Ljava/lang/Object;", "f", "(FFFFLta/d;)Ljava/lang/Object;", "to", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;", "LO/x1;", "c", "()LO/x1;", "a", "F", "Lv/a;", "Lv/m;", "Lv/a;", "animatable", "Lz/h;", "lastTargetInteraction", "g", "targetInteraction", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1124K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float hoveredElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float focusedElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C4737a<h, C4761m> animatable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5159h lastTargetInteraction;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5159h targetInteraction;

    /* compiled from: FloatingActionButton.kt */
    @f(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {397}, m = "animateElevation")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.K$a */
    static final class a extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f5858B;

        /* renamed from: C, reason: collision with root package name */
        Object f5859C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f5860D;

        /* renamed from: F, reason: collision with root package name */
        int f5862F;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5860D = obj;
            this.f5862F |= Integer.MIN_VALUE;
            return C1124K.this.b(null, this);
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @f(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {383}, m = "snapElevation")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.K$b */
    static final class b extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f5863B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f5864C;

        /* renamed from: E, reason: collision with root package name */
        int f5866E;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5864C = obj;
            this.f5866E |= Integer.MIN_VALUE;
            return C1124K.this.e(this);
        }
    }

    public /* synthetic */ C1124K(float f10, float f11, float f12, float f13, C3854k c3854k) {
        this(f10, f11, f12, f13);
    }

    private final float d(InterfaceC5159h interfaceC5159h) {
        return interfaceC5159h instanceof m.b ? this.pressedElevation : interfaceC5159h instanceof C5157f ? this.hoveredElevation : interfaceC5159h instanceof C5155d ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(ta.InterfaceC4588d<? super oa.C4153F> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlin.C1124K.b
            if (r0 == 0) goto L13
            r0 = r5
            I.K$b r0 = (kotlin.C1124K.b) r0
            int r1 = r0.f5866E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5866E = r1
            goto L18
        L13:
            I.K$b r0 = new I.K$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f5864C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f5866E
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f5863B
            I.K r0 = (kotlin.C1124K) r0
            oa.C4173r.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            oa.C4173r.b(r5)
            z.h r5 = r4.targetInteraction
            float r5 = r4.d(r5)
            v.a<U0.h, v.m> r2 = r4.animatable
            java.lang.Object r2 = r2.k()
            U0.h r2 = (U0.h) r2
            float r2 = r2.getValue()
            boolean r2 = U0.h.w(r2, r5)
            if (r2 != 0) goto L70
            v.a<U0.h, v.m> r2 = r4.animatable     // Catch: java.lang.Throwable -> L69
            U0.h r5 = U0.h.p(r5)     // Catch: java.lang.Throwable -> L69
            r0.f5863B = r4     // Catch: java.lang.Throwable -> L69
            r0.f5866E = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r2.t(r5, r0)     // Catch: java.lang.Throwable -> L69
            if (r5 != r1) goto L63
            return r1
        L63:
            r0 = r4
        L64:
            z.h r5 = r0.targetInteraction
            r0.lastTargetInteraction = r5
            goto L70
        L69:
            r5 = move-exception
            r0 = r4
        L6b:
            z.h r1 = r0.targetInteraction
            r0.lastTargetInteraction = r1
            throw r5
        L70:
            oa.F r5 = oa.C4153F.f46609a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1124K.e(ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(z.InterfaceC5159h r6, ta.InterfaceC4588d<? super oa.C4153F> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlin.C1124K.a
            if (r0 == 0) goto L13
            r0 = r7
            I.K$a r0 = (kotlin.C1124K.a) r0
            int r1 = r0.f5862F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5862F = r1
            goto L18
        L13:
            I.K$a r0 = new I.K$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5860D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f5862F
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f5859C
            z.h r6 = (z.InterfaceC5159h) r6
            java.lang.Object r0 = r0.f5858B
            I.K r0 = (kotlin.C1124K) r0
            oa.C4173r.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r7 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            oa.C4173r.b(r7)
            float r7 = r5.d(r6)
            r5.targetInteraction = r6
            v.a<U0.h, v.m> r2 = r5.animatable     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.k()     // Catch: java.lang.Throwable -> L67
            U0.h r2 = (U0.h) r2     // Catch: java.lang.Throwable -> L67
            float r2 = r2.getValue()     // Catch: java.lang.Throwable -> L67
            boolean r2 = U0.h.w(r2, r7)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L6a
            v.a<U0.h, v.m> r2 = r5.animatable     // Catch: java.lang.Throwable -> L67
            z.h r4 = r5.lastTargetInteraction     // Catch: java.lang.Throwable -> L67
            r0.f5858B = r5     // Catch: java.lang.Throwable -> L67
            r0.f5859C = r6     // Catch: java.lang.Throwable -> L67
            r0.f5862F = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.C1115B.d(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L67
            if (r7 != r1) goto L6a
            return r1
        L67:
            r7 = move-exception
            r0 = r5
            goto L70
        L6a:
            r0 = r5
        L6b:
            r0.lastTargetInteraction = r6
            oa.F r6 = oa.C4153F.f46609a
            return r6
        L70:
            r0.lastTargetInteraction = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1124K.b(z.h, ta.d):java.lang.Object");
    }

    public final x1<h> c() {
        return this.animatable.g();
    }

    public final Object f(float f10, float f11, float f12, float f13, InterfaceC4588d<? super C4153F> interfaceC4588d) throws Throwable {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.hoveredElevation = f12;
        this.focusedElevation = f13;
        Object objE = e(interfaceC4588d);
        return objE == C4696b.e() ? objE : C4153F.f46609a;
    }

    private C1124K(float f10, float f11, float f12, float f13) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.hoveredElevation = f12;
        this.focusedElevation = f13;
        this.animatable = new C4737a<>(h.p(this.defaultElevation), C4774s0.b(h.INSTANCE), null, null, 12, null);
    }
}
