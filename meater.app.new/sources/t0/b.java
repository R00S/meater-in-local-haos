package t0;

import Xb.I;
import h0.C3476g;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC3864v;
import ta.InterfaceC4588d;

/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0016\u0010,\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lt0/b;", "", "<init>", "()V", "Lh0/g;", "available", "Lt0/e;", "source", "d", "(JI)J", "consumed", "b", "(JJI)J", "LU0/y;", "c", "(JLta/d;)Ljava/lang/Object;", "a", "(JJLta/d;)Ljava/lang/Object;", "Lt0/c;", "Lt0/c;", "f", "()Lt0/c;", "j", "(Lt0/c;)V", "nestedScrollNode", "Lkotlin/Function0;", "LXb/I;", "LBa/a;", "getCalculateNestedScrollScope$ui_release", "()LBa/a;", "i", "(LBa/a;)V", "calculateNestedScrollScope", "LXb/I;", "h", "()LXb/I;", "k", "(LXb/I;)V", "scope", "e", "coroutineScope", "Lt0/a;", "g", "()Lt0/a;", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private t0.c nestedScrollNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Ba.a<? extends I> calculateNestedScrollScope = new a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private I scope;

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXb/I;", "a", "()LXb/I;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<I> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I invoke() {
            return b.this.getScope();
        }
    }

    /* compiled from: NestedScrollModifier.kt */
    @f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {218}, m = "dispatchPostFling-RZ2iAVY")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t0.b$b, reason: collision with other inner class name */
    static final class C0703b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f49721B;

        /* renamed from: D, reason: collision with root package name */
        int f49723D;

        C0703b(InterfaceC4588d<? super C0703b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49721B = obj;
            this.f49723D |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollModifier.kt */
    @f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {203}, m = "dispatchPreFling-QWom1Mo")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f49724B;

        /* renamed from: D, reason: collision with root package name */
        int f49726D;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49724B = obj;
            this.f49726D |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, ta.InterfaceC4588d<? super U0.y> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof t0.b.C0703b
            if (r0 == 0) goto L14
            r0 = r12
            t0.b$b r0 = (t0.b.C0703b) r0
            int r1 = r0.f49723D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f49723D = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            t0.b$b r0 = new t0.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f49721B
            java.lang.Object r0 = ua.C4696b.e()
            int r1 = r6.f49723D
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            oa.C4173r.b(r12)
            goto L47
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            oa.C4173r.b(r12)
            t0.a r1 = r7.g()
            if (r1 == 0) goto L4e
            r6.f49723D = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.d0(r2, r4, r6)
            if (r12 != r0) goto L47
            return r0
        L47:
            U0.y r12 = (U0.y) r12
            long r8 = r12.getPackedValue()
            goto L54
        L4e:
            U0.y$a r8 = U0.y.INSTANCE
            long r8 = r8.a()
        L54:
            U0.y r8 = U0.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.a(long, long, ta.d):java.lang.Object");
    }

    public final long b(long consumed, long available, int source) {
        InterfaceC4536a interfaceC4536aG = g();
        return interfaceC4536aG != null ? interfaceC4536aG.u1(consumed, available, source) : C3476g.INSTANCE.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, ta.InterfaceC4588d<? super U0.y> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t0.b.c
            if (r0 == 0) goto L13
            r0 = r7
            t0.b$c r0 = (t0.b.c) r0
            int r1 = r0.f49726D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49726D = r1
            goto L18
        L13:
            t0.b$c r0 = new t0.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49724B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f49726D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r7)
            t0.a r7 = r4.g()
            if (r7 == 0) goto L4a
            r0.f49726D = r3
            java.lang.Object r7 = r7.C0(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            U0.y r7 = (U0.y) r7
            long r5 = r7.getPackedValue()
            goto L50
        L4a:
            U0.y$a r5 = U0.y.INSTANCE
            long r5 = r5.a()
        L50:
            U0.y r5 = U0.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.c(long, ta.d):java.lang.Object");
    }

    public final long d(long available, int source) {
        InterfaceC4536a interfaceC4536aG = g();
        return interfaceC4536aG != null ? interfaceC4536aG.Q0(available, source) : C3476g.INSTANCE.c();
    }

    public final I e() {
        I iInvoke = this.calculateNestedScrollScope.invoke();
        if (iInvoke != null) {
            return iInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* renamed from: f, reason: from getter */
    public final t0.c getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    public final InterfaceC4536a g() {
        t0.c cVar = this.nestedScrollNode;
        if (cVar != null) {
            return cVar.m2();
        }
        return null;
    }

    /* renamed from: h, reason: from getter */
    public final I getScope() {
        return this.scope;
    }

    public final void i(Ba.a<? extends I> aVar) {
        this.calculateNestedScrollScope = aVar;
    }

    public final void j(t0.c cVar) {
        this.nestedScrollNode = cVar;
    }

    public final void k(I i10) {
        this.scope = i10;
    }
}
