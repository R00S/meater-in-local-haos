package t0;

import A0.A0;
import A0.B0;
import Xb.I;
import b0.i;
import com.apptionlabs.meater_app.data.Temperature;
import h0.C3476g;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import ta.InterfaceC4588d;

/* compiled from: NestedScrollNode.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b \u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010$R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lt0/c;", "LA0/A0;", "Lt0/a;", "Lb0/i$c;", "connection", "Lt0/b;", "dispatcher", "<init>", "(Lt0/a;Lt0/b;)V", "newDispatcher", "Loa/F;", "o2", "(Lt0/b;)V", "p2", "()V", "n2", "Lh0/g;", "available", "Lt0/e;", "source", "Q0", "(JI)J", "consumed", "u1", "(JJI)J", "LU0/y;", "C0", "(JLta/d;)Ljava/lang/Object;", "d0", "(JJLta/d;)Ljava/lang/Object;", "T1", "U1", "q2", "O", "Lt0/a;", "getConnection", "()Lt0/a;", "setConnection", "(Lt0/a;)V", "P", "Lt0/b;", "resolvedDispatcher", "", "Q", "Ljava/lang/Object;", "U", "()Ljava/lang/Object;", "traverseKey", "l2", "parentConnection", "LXb/I;", "k2", "()LXb/I;", "nestedCoroutineScope", "m2", "()Lt0/c;", "parentNestedScrollNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends i.c implements A0, InterfaceC4536a {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4536a connection;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private t0.b resolvedDispatcher;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    /* compiled from: NestedScrollNode.kt */
    @f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {104, Temperature.MAX_INTERNAL_SECOND_GEN_PROBE}, m = "onPostFling-RZ2iAVY")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f49730B;

        /* renamed from: C, reason: collision with root package name */
        long f49731C;

        /* renamed from: D, reason: collision with root package name */
        long f49732D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f49733E;

        /* renamed from: G, reason: collision with root package name */
        int f49735G;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49733E = obj;
            this.f49735G |= Integer.MIN_VALUE;
            return c.this.d0(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {97, 98}, m = "onPreFling-QWom1Mo")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f49736B;

        /* renamed from: C, reason: collision with root package name */
        long f49737C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f49738D;

        /* renamed from: F, reason: collision with root package name */
        int f49740F;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49738D = obj;
            this.f49740F |= Integer.MIN_VALUE;
            return c.this.C0(0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXb/I;", "a", "()LXb/I;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: t0.c$c, reason: collision with other inner class name */
    static final class C0704c extends AbstractC3864v implements Ba.a<I> {
        C0704c() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I invoke() {
            return c.this.k2();
        }
    }

    public c(InterfaceC4536a interfaceC4536a, t0.b bVar) {
        this.connection = interfaceC4536a;
        this.resolvedDispatcher = bVar == null ? new t0.b() : bVar;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I k2() {
        I iH;
        c cVarM2 = m2();
        if ((cVarM2 == null || (iH = cVarM2.k2()) == null) && (iH = this.resolvedDispatcher.getScope()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return iH;
    }

    private final InterfaceC4536a l2() {
        if (getIsAttached()) {
            return m2();
        }
        return null;
    }

    private final void n2() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.j(null);
        }
    }

    private final void o2(t0.b newDispatcher) {
        n2();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new t0.b();
        } else if (!C3862t.b(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            p2();
        }
    }

    private final void p2() {
        this.resolvedDispatcher.j(this);
        this.resolvedDispatcher.i(new C0704c());
        this.resolvedDispatcher.k(J1());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t0.InterfaceC4536a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object C0(long r9, ta.InterfaceC4588d<? super U0.y> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof t0.c.b
            if (r0 == 0) goto L13
            r0 = r11
            t0.c$b r0 = (t0.c.b) r0
            int r1 = r0.f49740F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49740F = r1
            goto L18
        L13:
            t0.c$b r0 = new t0.c$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f49738D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f49740F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f49737C
            oa.C4173r.b(r11)
            goto L7d
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f49737C
            java.lang.Object r2 = r0.f49736B
            t0.c r2 = (t0.c) r2
            oa.C4173r.b(r11)
            goto L57
        L40:
            oa.C4173r.b(r11)
            t0.a r11 = r8.l2()
            if (r11 == 0) goto L61
            r0.f49736B = r8
            r0.f49737C = r9
            r0.f49740F = r4
            java.lang.Object r11 = r11.C0(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            U0.y r11 = (U0.y) r11
            long r4 = r11.getPackedValue()
        L5d:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L69
        L61:
            U0.y$a r11 = U0.y.INSTANCE
            long r4 = r11.a()
            r2 = r8
            goto L5d
        L69:
            t0.a r11 = r2.connection
            long r4 = U0.y.k(r4, r9)
            r2 = 0
            r0.f49736B = r2
            r0.f49737C = r9
            r0.f49740F = r3
            java.lang.Object r11 = r11.C0(r4, r0)
            if (r11 != r1) goto L7d
            return r1
        L7d:
            U0.y r11 = (U0.y) r11
            long r0 = r11.getPackedValue()
            long r9 = U0.y.l(r9, r0)
            U0.y r9 = U0.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.C0(long, ta.d):java.lang.Object");
    }

    @Override // t0.InterfaceC4536a
    public long Q0(long available, int source) {
        InterfaceC4536a interfaceC4536aL2 = l2();
        long jQ0 = interfaceC4536aL2 != null ? interfaceC4536aL2.Q0(available, source) : C3476g.INSTANCE.c();
        return C3476g.r(jQ0, this.connection.Q0(C3476g.q(available, jQ0), source));
    }

    @Override // b0.i.c
    public void T1() {
        p2();
    }

    @Override // A0.A0
    /* renamed from: U, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // b0.i.c
    public void U1() {
        n2();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // t0.InterfaceC4536a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d0(long r16, long r18, ta.InterfaceC4588d<? super U0.y> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof t0.c.a
            if (r2 == 0) goto L16
            r2 = r1
            t0.c$a r2 = (t0.c.a) r2
            int r3 = r2.f49735G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f49735G = r3
            goto L1b
        L16:
            t0.c$a r2 = new t0.c$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f49733E
            java.lang.Object r9 = ua.C4696b.e()
            int r3 = r2.f49735G
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f49731C
            oa.C4173r.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f49732D
            long r5 = r2.f49731C
            java.lang.Object r7 = r2.f49730B
            t0.c r7 = (t0.c) r7
            oa.C4173r.b(r1)
            r13 = r3
            r11 = r5
            goto L65
        L47:
            oa.C4173r.b(r1)
            t0.a r3 = r0.connection
            r2.f49730B = r0
            r11 = r16
            r2.f49731C = r11
            r13 = r18
            r2.f49732D = r13
            r2.f49735G = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.d0(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            r7 = r0
        L65:
            U0.y r1 = (U0.y) r1
            long r4 = r1.getPackedValue()
            t0.a r3 = r7.l2()
            if (r3 == 0) goto L94
            long r6 = U0.y.l(r11, r4)
            long r11 = U0.y.k(r13, r4)
            r1 = 0
            r2.f49730B = r1
            r2.f49731C = r4
            r2.f49735G = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.d0(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            U0.y r1 = (U0.y) r1
            long r4 = r1.getPackedValue()
            r13 = r2
            goto L9b
        L94:
            r13 = r4
            U0.y$a r1 = U0.y.INSTANCE
            long r4 = r1.a()
        L9b:
            long r1 = U0.y.l(r13, r4)
            U0.y r1 = U0.y.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.d0(long, long, ta.d):java.lang.Object");
    }

    public final c m2() {
        if (getIsAttached()) {
            return (c) B0.b(this);
        }
        return null;
    }

    public final void q2(InterfaceC4536a connection, t0.b dispatcher) {
        this.connection = connection;
        o2(dispatcher);
    }

    @Override // t0.InterfaceC4536a
    public long u1(long consumed, long available, int source) {
        long jU1 = this.connection.u1(consumed, available, source);
        InterfaceC4536a interfaceC4536aL2 = l2();
        return C3476g.r(jU1, interfaceC4536aL2 != null ? interfaceC4536aL2.u1(C3476g.r(consumed, jU1), C3476g.q(available, jU1), source) : C3476g.INSTANCE.c());
    }
}
