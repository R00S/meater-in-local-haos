package kotlin;

import Ba.p;
import Xb.I;
import kotlin.C1509K0;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.L;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: InfiniteTransition.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!¨\u0006*"}, d2 = {"Lv/N;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "Loa/F;", "i", "(J)V", "Lv/N$a;", "animation", "f", "(Lv/N$a;)V", "j", "k", "(LO/l;I)V", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "LQ/b;", "b", "LQ/b;", "_animations", "", "<set-?>", "c", "LO/p0;", "g", "()Z", "l", "(Z)V", "refreshChildNeeded", "d", "J", "startTimeNanos", "e", "h", "m", "isRunning", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4725N {

    /* renamed from: f, reason: collision with root package name */
    public static final int f50608f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Q.b<a<?, ?>> _animations = new Q.b<>(new a[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 refreshChildNeeded = r1.c(Boolean.FALSE, null, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startTimeNanos = Long.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isRunning = r1.c(Boolean.TRUE, null, 2, null);

    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R+\u0010/\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103RB\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010D¨\u0006H"}, d2 = {"Lv/N$a;", "T", "Lv/q;", "V", "LO/x1;", "initialValue", "targetValue", "Lv/q0;", "typeConverter", "Lv/i;", "animationSpec", "", "label", "<init>", "(Lv/N;Ljava/lang/Object;Ljava/lang/Object;Lv/q0;Lv/i;Ljava/lang/String;)V", "Loa/F;", "t", "(Ljava/lang/Object;Ljava/lang/Object;Lv/i;)V", "", "playTimeNanos", "p", "(J)V", "s", "()V", "q", "B", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "C", "i", "setTargetValue$animation_core_release", "D", "Lv/q0;", "getTypeConverter", "()Lv/q0;", "E", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "F", "LO/p0;", "getValue", "r", "value", "G", "Lv/i;", "getAnimationSpec", "()Lv/i;", "Lv/l0;", "H", "Lv/l0;", "getAnimation", "()Lv/l0;", "setAnimation$animation_core_release", "(Lv/l0;)V", "animation", "", "I", "Z", "j", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "J", "startOnTheNextFrame", "K", "playTimeNanosOffset", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.N$a */
    public final class a<T, V extends AbstractC4769q> implements x1<T> {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private T initialValue;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private T targetValue;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4770q0<T, V> typeConverter;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1563p0 value;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4753i<T> animationSpec;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private C4760l0<T, V> animation;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private long playTimeNanosOffset;

        public a(T t10, T t11, InterfaceC4770q0<T, V> interfaceC4770q0, InterfaceC4753i<T> interfaceC4753i, String str) {
            this.initialValue = t10;
            this.targetValue = t11;
            this.typeConverter = interfaceC4770q0;
            this.label = str;
            this.value = r1.c(t10, null, 2, null);
            this.animationSpec = interfaceC4753i;
            this.animation = new C4760l0<>(this.animationSpec, interfaceC4770q0, this.initialValue, this.targetValue, null, 16, null);
        }

        @Override // kotlin.x1
        public T getValue() {
            return this.value.getValue();
        }

        public final T h() {
            return this.initialValue;
        }

        public final T i() {
            return this.targetValue;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void p(long playTimeNanos) {
            C4725N.this.l(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j10 = playTimeNanos - this.playTimeNanosOffset;
            r(this.animation.f(j10));
            this.isFinished = this.animation.e(j10);
        }

        public final void q() {
            this.startOnTheNextFrame = true;
        }

        public void r(T t10) {
            this.value.setValue(t10);
        }

        public final void s() {
            r(this.animation.g());
            this.startOnTheNextFrame = true;
        }

        public final void t(T initialValue, T targetValue, InterfaceC4753i<T> animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new C4760l0<>(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null);
            C4725N.this.l(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.N$b */
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f50625B;

        /* renamed from: C, reason: collision with root package name */
        int f50626C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f50627D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<x1<Long>> f50628E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C4725N f50629F;

        /* compiled from: InfiniteTransition.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v.N$b$a */
        static final class a extends AbstractC3864v implements Ba.l<Long, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC1563p0<x1<Long>> f50630B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4725N f50631C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ L f50632D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ I f50633E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC1563p0<x1<Long>> interfaceC1563p0, C4725N c4725n, L l10, I i10) {
                super(1);
                this.f50630B = interfaceC1563p0;
                this.f50631C = c4725n;
                this.f50632D = l10;
                this.f50633E = i10;
            }

            public final void a(long j10) {
                x1<Long> value = this.f50630B.getValue();
                long jLongValue = value != null ? value.getValue().longValue() : j10;
                int i10 = 0;
                if (this.f50631C.startTimeNanos == Long.MIN_VALUE || this.f50632D.f43975B != C4758k0.n(this.f50633E.getCoroutineContext())) {
                    this.f50631C.startTimeNanos = j10;
                    Q.b bVar = this.f50631C._animations;
                    int size = bVar.getSize();
                    if (size > 0) {
                        Object[] objArrT = bVar.t();
                        int i11 = 0;
                        do {
                            ((a) objArrT[i11]).q();
                            i11++;
                        } while (i11 < size);
                    }
                    this.f50632D.f43975B = C4758k0.n(this.f50633E.getCoroutineContext());
                }
                if (this.f50632D.f43975B != 0.0f) {
                    this.f50631C.i((long) ((jLongValue - this.f50631C.startTimeNanos) / this.f50632D.f43975B));
                    return;
                }
                Q.b bVar2 = this.f50631C._animations;
                int size2 = bVar2.getSize();
                if (size2 > 0) {
                    Object[] objArrT2 = bVar2.t();
                    do {
                        ((a) objArrT2[i10]).s();
                        i10++;
                    } while (i10 < size2);
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
                a(l10.longValue());
                return C4153F.f46609a;
            }
        }

        /* compiled from: InfiniteTransition.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v.N$b$b, reason: collision with other inner class name */
        static final class C0724b extends AbstractC3864v implements Ba.a<Float> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ I f50634B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0724b(I i10) {
                super(0);
                this.f50634B = i10;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(C4758k0.n(this.f50634B.getCoroutineContext()));
            }
        }

        /* compiled from: InfiniteTransition.kt */
        @f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v.N$b$c */
        static final class c extends l implements p<Float, InterfaceC4588d<? super Boolean>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f50635B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ float f50636C;

            c(InterfaceC4588d<? super c> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            public final Object b(float f10, InterfaceC4588d<? super Boolean> interfaceC4588d) {
                return ((c) create(Float.valueOf(f10), interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                c cVar = new c(interfaceC4588d);
                cVar.f50636C = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ Object invoke(Float f10, InterfaceC4588d<? super Boolean> interfaceC4588d) {
                return b(f10.floatValue(), interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f50635B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f50636C > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1563p0<x1<Long>> interfaceC1563p0, C4725N c4725n, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f50628E = interfaceC1563p0;
            this.f50629F = c4725n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f50628E, this.f50629F, interfaceC4588d);
            bVar.f50627D = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f50626C
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f50625B
                kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
                java.lang.Object r4 = r7.f50627D
                Xb.I r4 = (Xb.I) r4
                oa.C4173r.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f50625B
                kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
                java.lang.Object r4 = r7.f50627D
                Xb.I r4 = (Xb.I) r4
                oa.C4173r.b(r8)
                r8 = r4
                goto L56
            L30:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f50627D
                Xb.I r8 = (Xb.I) r8
                kotlin.jvm.internal.L r1 = new kotlin.jvm.internal.L
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f43975B = r4
            L40:
                v.N$b$a r4 = new v.N$b$a
                O.p0<O.x1<java.lang.Long>> r5 = r7.f50628E
                v.N r6 = r7.f50629F
                r4.<init>(r5, r6, r1, r8)
                r7.f50627D = r8
                r7.f50625B = r1
                r7.f50626C = r3
                java.lang.Object r4 = kotlin.C4723L.a(r4, r7)
                if (r4 != r0) goto L56
                return r0
            L56:
                float r4 = r1.f43975B
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                v.N$b$b r4 = new v.N$b$b
                r4.<init>(r8)
                ac.e r4 = kotlin.m1.n(r4)
                v.N$b$c r5 = new v.N$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f50627D = r8
                r7.f50625B = r1
                r7.f50626C = r2
                java.lang.Object r4 = ac.C1972g.p(r4, r5, r7)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C4725N.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.N$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f50638C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f50638C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C4725N.this.k(interfaceC1554l, C1509K0.a(this.f50638C | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public C4725N(String str) {
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long playTimeNanos) {
        boolean z10;
        Q.b<a<?, ?>> bVar = this._animations;
        int size = bVar.getSize();
        if (size > 0) {
            a<?, ?>[] aVarArrT = bVar.t();
            z10 = true;
            int i10 = 0;
            do {
                a<?, ?> aVar = aVarArrT[i10];
                if (!aVar.getIsFinished()) {
                    aVar.p(playTimeNanos);
                }
                if (!aVar.getIsFinished()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < size);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z10) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    public final void f(a<?, ?> animation) {
        this._animations.c(animation);
        l(true);
    }

    public final void j(a<?, ?> animation) {
        this._animations.B(animation);
    }

    public final void k(InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object objF = interfaceC1554lR.f();
            InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
            if (objF == companion.a()) {
                objF = r1.c(null, null, 2, null);
                interfaceC1554lR.J(objF);
            }
            InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
            if (h() || g()) {
                interfaceC1554lR.S(1719915818);
                boolean zL = interfaceC1554lR.l(this);
                Object objF2 = interfaceC1554lR.f();
                if (zL || objF2 == companion.a()) {
                    objF2 = new b(interfaceC1563p0, this, null);
                    interfaceC1554lR.J(objF2);
                }
                C1516O.e(this, (p) objF2, interfaceC1554lR, i11 & 14);
                interfaceC1554lR.I();
            } else {
                interfaceC1554lR.S(1721436120);
                interfaceC1554lR.I();
            }
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new c(i10));
        }
    }
}
