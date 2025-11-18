package kotlin;

import Ba.p;
import kotlin.InterfaceC1545g0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: PausableMonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LO/x0;", "LO/g0;", "frameClock", "<init>", "(LO/g0;)V", "Loa/F;", "c", "()V", "h", "R", "Lkotlin/Function1;", "", "onFrame", "K", "(LBa/l;Lta/d;)Ljava/lang/Object;", "B", "LO/g0;", "LO/b0;", "C", "LO/b0;", "latch", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579x0 implements InterfaceC1545g0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1545g0 frameClock;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C1531b0 latch = new C1531b0();

    /* compiled from: PausableMonotonicFrameClock.kt */
    @f(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.x0$a */
    static final class a<R> extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f13056B;

        /* renamed from: C, reason: collision with root package name */
        Object f13057C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f13058D;

        /* renamed from: F, reason: collision with root package name */
        int f13060F;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13058D = obj;
            this.f13060F |= Integer.MIN_VALUE;
            return C1579x0.this.K(null, this);
        }
    }

    public C1579x0(InterfaceC1545g0 interfaceC1545g0) {
        this.frameClock = interfaceC1545g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC1545g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object K(Ba.l<? super java.lang.Long, ? extends R> r6, ta.InterfaceC4588d<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlin.C1579x0.a
            if (r0 == 0) goto L13
            r0 = r7
            O.x0$a r0 = (kotlin.C1579x0.a) r0
            int r1 = r0.f13060F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13060F = r1
            goto L18
        L13:
            O.x0$a r0 = new O.x0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13058D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f13060F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oa.C4173r.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f13057C
            Ba.l r6 = (Ba.l) r6
            java.lang.Object r2 = r0.f13056B
            O.x0 r2 = (kotlin.C1579x0) r2
            oa.C4173r.b(r7)
            goto L53
        L40:
            oa.C4173r.b(r7)
            O.b0 r7 = r5.latch
            r0.f13056B = r5
            r0.f13057C = r6
            r0.f13060F = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            O.g0 r7 = r2.frameClock
            r2 = 0
            r0.f13056B = r2
            r0.f13057C = r2
            r0.f13060F = r3
            java.lang.Object r7 = r7.K(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1579x0.K(Ba.l, ta.d):java.lang.Object");
    }

    @Override // ta.g
    public <R> R L(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) InterfaceC1545g0.a.a(this, r10, pVar);
    }

    @Override // ta.g
    public g N(g.c<?> cVar) {
        return InterfaceC1545g0.a.c(this, cVar);
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) InterfaceC1545g0.a.b(this, cVar);
    }

    public final void c() {
        this.latch.d();
    }

    public final void h() {
        this.latch.f();
    }

    @Override // ta.g
    public g s(g gVar) {
        return InterfaceC1545g0.a.d(this, gVar);
    }
}
