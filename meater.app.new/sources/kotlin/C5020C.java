package kotlin;

import Ba.l;
import kotlin.C4761m;
import kotlin.C4774s0;
import kotlin.InterfaceC4753i;
import kotlin.InterfaceC4776t0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3856m;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: UpdatableAnimationState.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lx/C;", "", "Lv/i;", "", "animationSpec", "<init>", "(Lv/i;)V", "Lkotlin/Function1;", "Loa/F;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "h", "(LBa/l;LBa/a;Lta/d;)Ljava/lang/Object;", "Lv/t0;", "Lv/m;", "a", "Lv/t0;", "vectorizedSpec", "", "b", "J", "lastFrameTime", "c", "Lv/m;", "lastVelocity", "", "d", "Z", "isRunning", "e", "F", "i", "()F", "j", "(F)V", "value", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5020C {

    /* renamed from: f, reason: collision with root package name */
    private static final a f52310f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f52311g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final C4761m f52312h = new C4761m(0.0f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4776t0<C4761m> vectorizedSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTime = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C4761m lastVelocity = f52312h;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRunning;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx/C$a;", "", "<init>", "()V", "", "", "b", "(F)Z", "Lv/m;", "ZeroVector", "Lv/m;", "a", "()Lv/m;", "VisibilityThreshold", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.C$a */
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final C4761m a() {
            return C5020C.f52312h;
        }

        public final boolean b(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        private a() {
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @f(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {101, 147}, m = "animateToZero")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.C$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52318B;

        /* renamed from: C, reason: collision with root package name */
        Object f52319C;

        /* renamed from: D, reason: collision with root package name */
        Object f52320D;

        /* renamed from: E, reason: collision with root package name */
        float f52321E;

        /* renamed from: F, reason: collision with root package name */
        /* synthetic */ Object f52322F;

        /* renamed from: H, reason: collision with root package name */
        int f52324H;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52322F = obj;
            this.f52324H |= Integer.MIN_VALUE;
            return C5020C.this.h(null, null, this);
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.C$c */
    static final class c extends AbstractC3864v implements l<Long, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f52326C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l<Float, C4153F> f52327D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(float f10, l<? super Float, C4153F> lVar) {
            super(1);
            this.f52326C = f10;
            this.f52327D = lVar;
        }

        public final void a(long j10) {
            if (C5020C.this.lastFrameTime == Long.MIN_VALUE) {
                C5020C.this.lastFrameTime = j10;
            }
            C4761m c4761m = new C4761m(C5020C.this.getValue());
            long jB = this.f52326C == 0.0f ? C5020C.this.vectorizedSpec.b(new C4761m(C5020C.this.getValue()), C5020C.f52310f.a(), C5020C.this.lastVelocity) : Da.a.e((j10 - C5020C.this.lastFrameTime) / this.f52326C);
            float value = ((C4761m) C5020C.this.vectorizedSpec.e(jB, c4761m, C5020C.f52310f.a(), C5020C.this.lastVelocity)).getValue();
            C5020C c5020c = C5020C.this;
            c5020c.lastVelocity = (C4761m) c5020c.vectorizedSpec.g(jB, c4761m, C5020C.f52310f.a(), C5020C.this.lastVelocity);
            C5020C.this.lastFrameTime = j10;
            float value2 = C5020C.this.getValue() - value;
            C5020C.this.j(value);
            this.f52327D.invoke(Float.valueOf(value2));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
            a(l10.longValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.C$d */
    static final class d extends AbstractC3864v implements l<Long, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ l<Float, C4153F> f52329C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(l<? super Float, C4153F> lVar) {
            super(1);
            this.f52329C = lVar;
        }

        public final void a(long j10) {
            float value = C5020C.this.getValue();
            C5020C.this.j(0.0f);
            this.f52329C.invoke(Float.valueOf(value));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
            a(l10.longValue());
            return C4153F.f46609a;
        }
    }

    public C5020C(InterfaceC4753i<Float> interfaceC4753i) {
        this.vectorizedSpec = interfaceC4753i.a(C4774s0.i(C3856m.f44008a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: all -> 0x00ae, PHI: r0 r2 r13 r14 r15
      0x0082: PHI (r0v9 Ba.a) = (r0v3 Ba.a), (r0v10 Ba.a) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r2v4 x.C$b) = (r2v2 x.C$b), (r2v5 x.C$b) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r13v6 float) = (r13v4 float), (r13v7 float) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r14v7 Ba.l<? super java.lang.Float, oa.F>) = (r14v4 Ba.l<? super java.lang.Float, oa.F>), (r14v8 Ba.l<? super java.lang.Float, oa.F>) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r15v15 x.C) = (r15v9 x.C), (r15v16 x.C) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:48:0x00d1, B:42:0x00b1, B:45:0x00bc), top: B:55:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:59:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(Ba.l<? super java.lang.Float, oa.C4153F> r13, Ba.a<oa.C4153F> r14, ta.InterfaceC4588d<? super oa.C4153F> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5020C.h(Ba.l, Ba.a, ta.d):java.lang.Object");
    }

    /* renamed from: i, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final void j(float f10) {
        this.value = f10;
    }
}
