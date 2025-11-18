package kotlin;

import Ba.p;
import Ba.q;
import Xb.C1841i;
import Xb.I;
import Xb.J;
import com.apptionlabs.meater_app.data.Temperature;
import h0.C3476g;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.EnumC4651q;
import u0.InterfaceC4622H;
import u0.InterfaceC4637c;
import u0.PointerInputChange;
import ua.C4696b;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0088\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001aX\u0010\u0015\u001a\u00020\u0003*\u00020\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u001b\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001d\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001d\u0010\u001e\"6\u0010!\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lu0/H;", "Lkotlin/Function1;", "Lh0/g;", "Loa/F;", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Lx/r;", "Lta/d;", "", "onPress", "onTap", "i", "(Lu0/H;LBa/l;LBa/l;LBa/q;LBa/l;Lta/d;)Ljava/lang/Object;", "Lu0/c;", "g", "(Lu0/c;Lta/d;)Ljava/lang/Object;", "Lu0/z;", "firstUp", "f", "(Lu0/c;Lu0/z;Lta/d;)Ljava/lang/Object;", "h", "(Lu0/H;LBa/q;LBa/l;Lta/d;)Ljava/lang/Object;", "", "requireUnconsumed", "Lu0/q;", "pass", "d", "(Lu0/c;ZLu0/q;Lta/d;)Ljava/lang/Object;", "k", "(Lu0/c;Lu0/q;Lta/d;)Ljava/lang/Object;", "a", "LBa/q;", "NoPressGesture", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5018A {

    /* renamed from: a, reason: collision with root package name */
    private static final q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52216a = new a(null);

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx/r;", "Lh0/g;", "it", "Loa/F;", "<anonymous>", "(Lx/r;Lh0/g;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.A$a */
    static final class a extends l implements q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52217B;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        public final Object b(InterfaceC5038r interfaceC5038r, long j10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return new a(interfaceC4588d).invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(InterfaceC5038r interfaceC5038r, C3476g c3476g, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(interfaceC5038r, c3476g.getPackedValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f52217B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.A$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52218B;

        /* renamed from: C, reason: collision with root package name */
        Object f52219C;

        /* renamed from: D, reason: collision with root package name */
        boolean f52220D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f52221E;

        /* renamed from: F, reason: collision with root package name */
        int f52222F;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52221E = obj;
            this.f52222F |= Integer.MIN_VALUE;
            return C5018A.d(null, false, null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Lu0/z;", "<anonymous>", "(Lu0/c;)Lu0/z;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.A$c */
    static final class c extends k implements p<InterfaceC4637c, InterfaceC4588d<? super PointerInputChange>, Object> {

        /* renamed from: C, reason: collision with root package name */
        long f52223C;

        /* renamed from: D, reason: collision with root package name */
        int f52224D;

        /* renamed from: E, reason: collision with root package name */
        private /* synthetic */ Object f52225E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ PointerInputChange f52226F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PointerInputChange pointerInputChange, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52226F = pointerInputChange;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super PointerInputChange> interfaceC4588d) {
            return ((c) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = new c(this.f52226F, interfaceC4588d);
            cVar.f52225E = obj;
            return cVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r11.f52224D
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                long r3 = r11.f52223C
                java.lang.Object r1 = r11.f52225E
                u0.c r1 = (u0.InterfaceC4637c) r1
                oa.C4173r.b(r12)
                goto L47
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                oa.C4173r.b(r12)
                java.lang.Object r12 = r11.f52225E
                u0.c r12 = (u0.InterfaceC4637c) r12
                u0.z r1 = r11.f52226F
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.i1 r1 = r12.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r12
            L34:
                r11.f52225E = r1
                r11.f52223C = r3
                r11.f52224D = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r5 = r1
                r8 = r11
                java.lang.Object r12 = kotlin.C5018A.e(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                u0.z r12 = (u0.PointerInputChange) r12
                long r5 = r12.getUptimeMillis()
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 < 0) goto L34
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C5018A.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {195}, m = "consumeUntilUp")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.A$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52227B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f52228C;

        /* renamed from: D, reason: collision with root package name */
        int f52229D;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52228C = obj;
            this.f52229D |= Integer.MIN_VALUE;
            return C5018A.g(null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.A$e */
    static final class e extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52230B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f52231C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC4622H f52232D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52233E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.l<C3476g, C4153F> f52234F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ C5039s f52235G;

        /* compiled from: TapGestureDetector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x.A$e$a */
        static final class a extends k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: C, reason: collision with root package name */
            int f52236C;

            /* renamed from: D, reason: collision with root package name */
            private /* synthetic */ Object f52237D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ I f52238E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52239F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Ba.l<C3476g, C4153F> f52240G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ C5039s f52241H;

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$e$a$a, reason: collision with other inner class name */
            static final class C0758a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52242B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52243C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0758a(C5039s c5039s, InterfaceC4588d<? super C0758a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52243C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0758a(this.f52243C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0758a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52242B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C5039s c5039s = this.f52243C;
                        this.f52242B = 1;
                        if (c5039s.o(this) == objE) {
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

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$e$a$b */
            static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52244B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52245C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ C5039s f52246D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f52247E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, C5039s c5039s, PointerInputChange pointerInputChange, InterfaceC4588d<? super b> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52245C = qVar;
                    this.f52246D = c5039s;
                    this.f52247E = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new b(this.f52245C, this.f52246D, this.f52247E, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52244B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> qVar = this.f52245C;
                        C5039s c5039s = this.f52246D;
                        C3476g c3476gD = C3476g.d(this.f52247E.getPosition());
                        this.f52244B = 1;
                        if (qVar.g(c5039s, c3476gD, this) == objE) {
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

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$e$a$c */
            static final class c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52248B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52249C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C5039s c5039s, InterfaceC4588d<? super c> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52249C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new c(this.f52249C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C4696b.e();
                    if (this.f52248B != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    this.f52249C.b();
                    return C4153F.f46609a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$e$a$d */
            static final class d extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52250B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52251C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C5039s c5039s, InterfaceC4588d<? super d> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52251C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new d(this.f52251C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C4696b.e();
                    if (this.f52250B != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    this.f52251C.d();
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(I i10, q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, Ba.l<? super C3476g, C4153F> lVar, C5039s c5039s, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f52238E = i10;
                this.f52239F = qVar;
                this.f52240G = lVar;
                this.f52241H = c5039s;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f52238E, this.f52239F, this.f52240G, this.f52241H, interfaceC4588d);
                aVar.f52237D = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    java.lang.Object r7 = ua.C4696b.e()
                    int r0 = r6.f52236C
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L2a
                    if (r0 == r9) goto L1f
                    if (r0 != r8) goto L17
                    oa.C4173r.b(r24)
                    r0 = r24
                    goto L7d
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r6.f52237D
                    u0.c r0 = (u0.InterfaceC4637c) r0
                    oa.C4173r.b(r24)
                    r11 = r0
                    r0 = r24
                    goto L51
                L2a:
                    oa.C4173r.b(r24)
                    java.lang.Object r0 = r6.f52237D
                    r11 = r0
                    u0.c r11 = (u0.InterfaceC4637c) r11
                    Xb.I r0 = r6.f52238E
                    x.A$e$a$a r3 = new x.A$e$a$a
                    x.s r1 = r6.f52241H
                    r3.<init>(r1, r10)
                    r4 = 3
                    r5 = 0
                    r1 = 0
                    r2 = 0
                    Xb.C1837g.d(r0, r1, r2, r3, r4, r5)
                    r6.f52237D = r11
                    r6.f52236C = r9
                    r1 = 0
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = kotlin.C5018A.e(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L51
                    return r7
                L51:
                    u0.z r0 = (u0.PointerInputChange) r0
                    r0.a()
                    Ba.q<x.r, h0.g, ta.d<? super oa.F>, java.lang.Object> r1 = r6.f52239F
                    Ba.q r2 = kotlin.C5018A.c()
                    if (r1 == r2) goto L72
                    Xb.I r12 = r6.f52238E
                    x.A$e$a$b r15 = new x.A$e$a$b
                    Ba.q<x.r, h0.g, ta.d<? super oa.F>, java.lang.Object> r1 = r6.f52239F
                    x.s r2 = r6.f52241H
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    r13 = 0
                    r14 = 0
                    Xb.C1837g.d(r12, r13, r14, r15, r16, r17)
                L72:
                    r6.f52237D = r10
                    r6.f52236C = r8
                    java.lang.Object r0 = kotlin.C5018A.l(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7d
                    return r7
                L7d:
                    u0.z r0 = (u0.PointerInputChange) r0
                    if (r0 != 0) goto L93
                    Xb.I r11 = r6.f52238E
                    x.A$e$a$c r14 = new x.A$e$a$c
                    x.s r0 = r6.f52241H
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    r12 = 0
                    r13 = 0
                    Xb.C1837g.d(r11, r12, r13, r14, r15, r16)
                    goto Lbd
                L93:
                    r0.a()
                    Xb.I r1 = r6.f52238E
                    x.A$e$a$d r2 = new x.A$e$a$d
                    x.s r3 = r6.f52241H
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r18 = 0
                    r19 = 0
                    r17 = r1
                    r20 = r2
                    Xb.C1837g.d(r17, r18, r19, r20, r21, r22)
                    Ba.l<h0.g, oa.F> r1 = r6.f52240G
                    if (r1 == 0) goto Lbd
                    long r2 = r0.getPosition()
                    h0.g r0 = h0.C3476g.d(r2)
                    r1.invoke(r0)
                Lbd:
                    oa.F r0 = oa.C4153F.f46609a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C5018A.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC4622H interfaceC4622H, q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, Ba.l<? super C3476g, C4153F> lVar, C5039s c5039s, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52232D = interfaceC4622H;
            this.f52233E = qVar;
            this.f52234F = lVar;
            this.f52235G = c5039s;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            e eVar = new e(this.f52232D, this.f52233E, this.f52234F, this.f52235G, interfaceC4588d);
            eVar.f52231C = obj;
            return eVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f52230B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f52231C;
                InterfaceC4622H interfaceC4622H = this.f52232D;
                a aVar = new a(i11, this.f52233E, this.f52234F, this.f52235G, null);
                this.f52230B = 1;
                if (C5035o.c(interfaceC4622H, aVar, this) == objE) {
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

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {Temperature.MAX_INTERNAL_PROBE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.A$f */
    static final class f extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52252B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f52253C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC4622H f52254D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52255E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.l<C3476g, C4153F> f52256F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ba.l<C3476g, C4153F> f52257G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Ba.l<C3476g, C4153F> f52258H;

        /* compiled from: TapGestureDetector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x.A$f$a */
        static final class a extends k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: C, reason: collision with root package name */
            Object f52259C;

            /* renamed from: D, reason: collision with root package name */
            Object f52260D;

            /* renamed from: E, reason: collision with root package name */
            Object f52261E;

            /* renamed from: F, reason: collision with root package name */
            long f52262F;

            /* renamed from: G, reason: collision with root package name */
            int f52263G;

            /* renamed from: H, reason: collision with root package name */
            private /* synthetic */ Object f52264H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ I f52265I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52266J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ Ba.l<C3476g, C4153F> f52267K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ Ba.l<C3476g, C4153F> f52268L;

            /* renamed from: M, reason: collision with root package name */
            final /* synthetic */ Ba.l<C3476g, C4153F> f52269M;

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ C5039s f52270N;

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$a, reason: collision with other inner class name */
            static final class C0759a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52271B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52272C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0759a(C5039s c5039s, InterfaceC4588d<? super C0759a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52272C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0759a(this.f52272C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0759a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C4696b.e();
                    if (this.f52271B != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    this.f52272C.d();
                    return C4153F.f46609a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {103}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$b */
            static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52273B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52274C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C5039s c5039s, InterfaceC4588d<? super b> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52274C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new b(this.f52274C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52273B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C5039s c5039s = this.f52274C;
                        this.f52273B = 1;
                        if (c5039s.o(this) == objE) {
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

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {106}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$c */
            static final class c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52275B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52276C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ C5039s f52277D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f52278E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, C5039s c5039s, PointerInputChange pointerInputChange, InterfaceC4588d<? super c> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52276C = qVar;
                    this.f52277D = c5039s;
                    this.f52278E = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new c(this.f52276C, this.f52277D, this.f52278E, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52275B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> qVar = this.f52276C;
                        C5039s c5039s = this.f52277D;
                        C3476g c3476gD = C3476g.d(this.f52278E.getPosition());
                        this.f52275B = 1;
                        if (qVar.g(c5039s, c3476gD, this) == objE) {
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

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {115}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Lu0/z;", "<anonymous>", "(Lu0/c;)Lu0/z;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$d */
            static final class d extends k implements p<InterfaceC4637c, InterfaceC4588d<? super PointerInputChange>, Object> {

                /* renamed from: C, reason: collision with root package name */
                int f52279C;

                /* renamed from: D, reason: collision with root package name */
                private /* synthetic */ Object f52280D;

                d(InterfaceC4588d<? super d> interfaceC4588d) {
                    super(2, interfaceC4588d);
                }

                @Override // Ba.p
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super PointerInputChange> interfaceC4588d) {
                    return ((d) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    d dVar = new d(interfaceC4588d);
                    dVar.f52280D = obj;
                    return dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52279C;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        InterfaceC4637c interfaceC4637c = (InterfaceC4637c) this.f52280D;
                        this.f52279C = 1;
                        obj = C5018A.l(interfaceC4637c, null, this, 1, null);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$e */
            static final class e extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52281B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52282C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C5039s c5039s, InterfaceC4588d<? super e> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52282C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new e(this.f52282C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C4696b.e();
                    if (this.f52281B != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    this.f52282C.b();
                    return C4153F.f46609a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$f, reason: collision with other inner class name */
            static final class C0760f extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52283B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52284C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0760f(C5039s c5039s, InterfaceC4588d<? super C0760f> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52284C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0760f(this.f52284C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0760f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C4696b.e();
                    if (this.f52283B != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    this.f52284C.d();
                    return C4153F.f46609a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$g */
            static final class g extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52285B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52286C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(C5039s c5039s, InterfaceC4588d<? super g> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52286C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new g(this.f52286C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((g) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C4696b.e();
                    if (this.f52285B != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    this.f52286C.d();
                    return C4153F.f46609a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$h */
            static final class h extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52287B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5039s f52288C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(C5039s c5039s, InterfaceC4588d<? super h> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52288C = c5039s;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new h(this.f52288C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((h) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52287B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C5039s c5039s = this.f52288C;
                        this.f52287B = 1;
                        if (c5039s.o(this) == objE) {
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

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$i */
            static final class i extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f52289B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> f52290C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ C5039s f52291D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f52292E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                i(q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, C5039s c5039s, PointerInputChange pointerInputChange, InterfaceC4588d<? super i> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52290C = qVar;
                    this.f52291D = c5039s;
                    this.f52292E = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new i(this.f52290C, this.f52291D, this.f52292E, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((i) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52289B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> qVar = this.f52290C;
                        C5039s c5039s = this.f52291D;
                        C3476g c3476gD = C3476g.d(this.f52292E.getPosition());
                        this.f52289B = 1;
                        if (qVar.g(c5039s, c3476gD, this) == objE) {
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

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.A$f$a$j */
            static final class j extends k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: C, reason: collision with root package name */
                int f52293C;

                /* renamed from: D, reason: collision with root package name */
                private /* synthetic */ Object f52294D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ I f52295E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ Ba.l<C3476g, C4153F> f52296F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ Ba.l<C3476g, C4153F> f52297G;

                /* renamed from: H, reason: collision with root package name */
                final /* synthetic */ O<PointerInputChange> f52298H;

                /* renamed from: I, reason: collision with root package name */
                final /* synthetic */ C5039s f52299I;

                /* compiled from: TapGestureDetector.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: x.A$f$a$j$a, reason: collision with other inner class name */
                static final class C0761a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                    /* renamed from: B, reason: collision with root package name */
                    int f52300B;

                    /* renamed from: C, reason: collision with root package name */
                    final /* synthetic */ C5039s f52301C;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0761a(C5039s c5039s, InterfaceC4588d<? super C0761a> interfaceC4588d) {
                        super(2, interfaceC4588d);
                        this.f52301C = c5039s;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                        return new C0761a(this.f52301C, interfaceC4588d);
                    }

                    @Override // Ba.p
                    public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                        return ((C0761a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        C4696b.e();
                        if (this.f52300B != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                        this.f52301C.d();
                        return C4153F.f46609a;
                    }
                }

                /* compiled from: TapGestureDetector.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: x.A$f$a$j$b */
                static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                    /* renamed from: B, reason: collision with root package name */
                    int f52302B;

                    /* renamed from: C, reason: collision with root package name */
                    final /* synthetic */ C5039s f52303C;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(C5039s c5039s, InterfaceC4588d<? super b> interfaceC4588d) {
                        super(2, interfaceC4588d);
                        this.f52303C = c5039s;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                        return new b(this.f52303C, interfaceC4588d);
                    }

                    @Override // Ba.p
                    public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                        return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        C4696b.e();
                        if (this.f52302B != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                        this.f52303C.b();
                        return C4153F.f46609a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                j(I i10, Ba.l<? super C3476g, C4153F> lVar, Ba.l<? super C3476g, C4153F> lVar2, O<PointerInputChange> o10, C5039s c5039s, InterfaceC4588d<? super j> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f52295E = i10;
                    this.f52296F = lVar;
                    this.f52297G = lVar2;
                    this.f52298H = o10;
                    this.f52299I = c5039s;
                }

                @Override // Ba.p
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((j) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    j jVar = new j(this.f52295E, this.f52296F, this.f52297G, this.f52298H, this.f52299I, interfaceC4588d);
                    jVar.f52294D = obj;
                    return jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f52293C;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        InterfaceC4637c interfaceC4637c = (InterfaceC4637c) this.f52294D;
                        this.f52293C = 1;
                        obj = C5018A.l(interfaceC4637c, null, this, 1, null);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        pointerInputChange.a();
                        C1841i.d(this.f52295E, null, null, new C0761a(this.f52299I, null), 3, null);
                        this.f52296F.invoke(C3476g.d(pointerInputChange.getPosition()));
                        return C4153F.f46609a;
                    }
                    C1841i.d(this.f52295E, null, null, new b(this.f52299I, null), 3, null);
                    Ba.l<C3476g, C4153F> lVar = this.f52297G;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(C3476g.d(this.f52298H.f43978B.getPosition()));
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(I i10, q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, Ba.l<? super C3476g, C4153F> lVar, Ba.l<? super C3476g, C4153F> lVar2, Ba.l<? super C3476g, C4153F> lVar3, C5039s c5039s, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f52265I = i10;
                this.f52266J = qVar;
                this.f52267K = lVar;
                this.f52268L = lVar2;
                this.f52269M = lVar3;
                this.f52270N = c5039s;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f52265I, this.f52266J, this.f52267K, this.f52268L, this.f52269M, this.f52270N, interfaceC4588d);
                aVar.f52264H = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00fb A[Catch: PointerEventTimeoutCancellationException -> 0x010c, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x010c, blocks: (B:34:0x00f5, B:36:0x00fb, B:38:0x0110), top: B:93:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0110 A[Catch: PointerEventTimeoutCancellationException -> 0x010c, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x010c, blocks: (B:34:0x00f5, B:36:0x00fb, B:38:0x0110), top: B:93:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0148 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0224 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 586
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C5018A.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(InterfaceC4622H interfaceC4622H, q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, Ba.l<? super C3476g, C4153F> lVar, Ba.l<? super C3476g, C4153F> lVar2, Ba.l<? super C3476g, C4153F> lVar3, InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52254D = interfaceC4622H;
            this.f52255E = qVar;
            this.f52256F = lVar;
            this.f52257G = lVar2;
            this.f52258H = lVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = new f(this.f52254D, this.f52255E, this.f52256F, this.f52257G, this.f52258H, interfaceC4588d);
            fVar.f52253C = obj;
            return fVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f52252B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f52253C;
                C5039s c5039s = new C5039s(this.f52254D);
                InterfaceC4622H interfaceC4622H = this.f52254D;
                a aVar = new a(i11, this.f52255E, this.f52256F, this.f52257G, this.f52258H, c5039s, null);
                this.f52252B = 1;
                if (C5035o.c(interfaceC4622H, aVar, this) == objE) {
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

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.A$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52304B;

        /* renamed from: C, reason: collision with root package name */
        Object f52305C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f52306D;

        /* renamed from: E, reason: collision with root package name */
        int f52307E;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52306D = obj;
            this.f52307E |= Integer.MIN_VALUE;
            return C5018A.k(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(u0.InterfaceC4637c r9, boolean r10, u0.EnumC4651q r11, ta.InterfaceC4588d<? super u0.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof kotlin.C5018A.b
            if (r0 == 0) goto L13
            r0 = r12
            x.A$b r0 = (kotlin.C5018A.b) r0
            int r1 = r0.f52222F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52222F = r1
            goto L18
        L13:
            x.A$b r0 = new x.A$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f52221E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f52222F
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f52220D
            java.lang.Object r10 = r0.f52219C
            u0.q r10 = (u0.EnumC4651q) r10
            java.lang.Object r11 = r0.f52218B
            u0.c r11 = (u0.InterfaceC4637c) r11
            oa.C4173r.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            oa.C4173r.b(r12)
        L42:
            r0.f52218B = r9
            r0.f52219C = r11
            r0.f52220D = r10
            r0.f52222F = r3
            java.lang.Object r12 = r9.l0(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            u0.o r12 = (u0.C4649o) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            u0.z r7 = (u0.PointerInputChange) r7
            if (r10 == 0) goto L6c
            boolean r7 = u0.C4650p.a(r7)
            goto L70
        L6c:
            boolean r7 = u0.C4650p.b(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5018A.d(u0.c, boolean, u0.q, ta.d):java.lang.Object");
    }

    public static /* synthetic */ Object e(InterfaceC4637c interfaceC4637c, boolean z10, EnumC4651q enumC4651q, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            enumC4651q = EnumC4651q.Main;
        }
        return d(interfaceC4637c, z10, enumC4651q, interfaceC4588d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(InterfaceC4637c interfaceC4637c, PointerInputChange pointerInputChange, InterfaceC4588d<? super PointerInputChange> interfaceC4588d) {
        return interfaceC4637c.u0(interfaceC4637c.getViewConfiguration().a(), new c(pointerInputChange, null), interfaceC4588d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(u0.InterfaceC4637c r8, ta.InterfaceC4588d<? super oa.C4153F> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C5018A.d
            if (r0 == 0) goto L13
            r0 = r9
            x.A$d r0 = (kotlin.C5018A.d) r0
            int r1 = r0.f52229D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52229D = r1
            goto L18
        L13:
            x.A$d r0 = new x.A$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f52228C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f52229D
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f52227B
            u0.c r8 = (u0.InterfaceC4637c) r8
            oa.C4173r.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            oa.C4173r.b(r9)
        L38:
            r0.f52227B = r8
            r0.f52229D = r3
            r9 = 0
            java.lang.Object r9 = u0.InterfaceC4637c.D1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            u0.o r9 = (u0.C4649o) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            u0.z r7 = (u0.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            u0.z r4 = (u0.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            oa.F r8 = oa.C4153F.f46609a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5018A.g(u0.c, ta.d):java.lang.Object");
    }

    public static final Object h(InterfaceC4622H interfaceC4622H, q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, Ba.l<? super C3476g, C4153F> lVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new e(interfaceC4622H, qVar, lVar, new C5039s(interfaceC4622H), null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    public static final Object i(InterfaceC4622H interfaceC4622H, Ba.l<? super C3476g, C4153F> lVar, Ba.l<? super C3476g, C4153F> lVar2, q<? super InterfaceC5038r, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, Ba.l<? super C3476g, C4153F> lVar3, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new f(interfaceC4622H, qVar, lVar2, lVar, lVar3, null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    public static /* synthetic */ Object j(InterfaceC4622H interfaceC4622H, Ba.l lVar, Ba.l lVar2, q qVar, Ba.l lVar3, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        Ba.l lVar4 = (i10 & 1) != 0 ? null : lVar;
        Ba.l lVar5 = (i10 & 2) != 0 ? null : lVar2;
        if ((i10 & 4) != 0) {
            qVar = f52216a;
        }
        return i(interfaceC4622H, lVar4, lVar5, qVar, (i10 & 8) != 0 ? null : lVar3, interfaceC4588d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(u0.InterfaceC4637c r18, u0.EnumC4651q r19, ta.InterfaceC4588d<? super u0.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5018A.k(u0.c, u0.q, ta.d):java.lang.Object");
    }

    public static /* synthetic */ Object l(InterfaceC4637c interfaceC4637c, EnumC4651q enumC4651q, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4651q = EnumC4651q.Main;
        }
        return k(interfaceC4637c, enumC4651q, interfaceC4588d);
    }
}
