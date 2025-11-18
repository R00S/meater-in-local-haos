package ac;

import Xb.InterfaceC1867v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Errors.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aS\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n\u001a0\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u0010*\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "Lac/e;", "Lkotlin/Function3;", "Lac/f;", "", "Lta/d;", "Loa/F;", "", "action", "a", "(Lac/e;LBa/q;)Lac/e;", "collector", "b", "(Lac/e;Lac/f;Lta/d;)Ljava/lang/Object;", "Lta/g;", "coroutineContext", "", "c", "(Ljava/lang/Throwable;Lta/g;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ac/n$a", "Lac/e;", "Lac/f;", "collector", "Loa/F;", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements InterfaceC1970e<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1970e f20369B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.q f20370C;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {112, 113}, m = "collect")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ac.n$a$a, reason: collision with other inner class name */
        public static final class C0293a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            /* synthetic */ Object f20371B;

            /* renamed from: C, reason: collision with root package name */
            int f20372C;

            /* renamed from: E, reason: collision with root package name */
            Object f20374E;

            /* renamed from: F, reason: collision with root package name */
            Object f20375F;

            public C0293a(InterfaceC4588d interfaceC4588d) {
                super(interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f20371B = obj;
                this.f20372C |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        public a(InterfaceC1970e interfaceC1970e, Ba.q qVar) {
            this.f20369B = interfaceC1970e;
            this.f20370C = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // ac.InterfaceC1970e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(ac.InterfaceC1971f<? super T> r6, ta.InterfaceC4588d<? super oa.C4153F> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ac.n.a.C0293a
                if (r0 == 0) goto L13
                r0 = r7
                ac.n$a$a r0 = (ac.n.a.C0293a) r0
                int r1 = r0.f20372C
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20372C = r1
                goto L18
            L13:
                ac.n$a$a r0 = new ac.n$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f20371B
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f20372C
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oa.C4173r.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f20375F
                ac.f r6 = (ac.InterfaceC1971f) r6
                java.lang.Object r2 = r0.f20374E
                ac.n$a r2 = (ac.n.a) r2
                oa.C4173r.b(r7)
                goto L53
            L40:
                oa.C4173r.b(r7)
                ac.e r7 = r5.f20369B
                r0.f20374E = r5
                r0.f20375F = r6
                r0.f20372C = r4
                java.lang.Object r7 = ac.C1972g.g(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                Ba.q r2 = r2.f20370C
                r4 = 0
                r0.f20374E = r4
                r0.f20375F = r4
                r0.f20372C = r3
                r3 = 6
                kotlin.jvm.internal.r.a(r3)
                java.lang.Object r6 = r2.g(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.r.a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                oa.F r6 = oa.C4153F.f46609a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.n.a.b(ac.f, ta.d):java.lang.Object");
        }
    }

    /* compiled from: Errors.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20376B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f20377C;

        /* renamed from: D, reason: collision with root package name */
        int f20378D;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20377C = obj;
            this.f20378D |= Integer.MIN_VALUE;
            return C1972g.g(null, null, this);
        }
    }

    /* compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class c<T> implements InterfaceC1971f {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1971f<T> f20379B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ O<Throwable> f20380C;

        /* compiled from: Errors.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            Object f20381B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f20382C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ c<T> f20383D;

            /* renamed from: E, reason: collision with root package name */
            int f20384E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(interfaceC4588d);
                this.f20383D = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f20382C = obj;
                this.f20384E |= Integer.MIN_VALUE;
                return this.f20383D.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC1971f<? super T> interfaceC1971f, O<Throwable> o10) {
            this.f20379B = interfaceC1971f;
            this.f20380C = o10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // ac.InterfaceC1971f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(T r5, ta.InterfaceC4588d<? super oa.C4153F> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof ac.n.c.a
                if (r0 == 0) goto L13
                r0 = r6
                ac.n$c$a r0 = (ac.n.c.a) r0
                int r1 = r0.f20384E
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20384E = r1
                goto L18
            L13:
                ac.n$c$a r0 = new ac.n$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f20382C
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f20384E
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f20381B
                ac.n$c r5 = (ac.n.c) r5
                oa.C4173r.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                oa.C4173r.b(r6)
                ac.f<T> r6 = r4.f20379B     // Catch: java.lang.Throwable -> L4a
                r0.f20381B = r4     // Catch: java.lang.Throwable -> L4a
                r0.f20384E = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                oa.F r5 = oa.C4153F.f46609a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.O<java.lang.Throwable> r5 = r5.f20380C
                r5.f43978B = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.n.c.a(java.lang.Object, ta.d):java.lang.Object");
        }
    }

    public static final <T> InterfaceC1970e<T> a(InterfaceC1970e<? extends T> interfaceC1970e, Ba.q<? super InterfaceC1971f<? super T>, ? super Throwable, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar) {
        return new a(interfaceC1970e, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(ac.InterfaceC1970e<? extends T> r4, ac.InterfaceC1971f<? super T> r5, ta.InterfaceC4588d<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof ac.n.b
            if (r0 == 0) goto L13
            r0 = r6
            ac.n$b r0 = (ac.n.b) r0
            int r1 = r0.f20378D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20378D = r1
            goto L18
        L13:
            ac.n$b r0 = new ac.n$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f20377C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f20378D
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f20376B
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            oa.C4173r.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            oa.C4173r.b(r6)
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            ac.n$c r2 = new ac.n$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f20376B = r6     // Catch: java.lang.Throwable -> L51
            r0.f20378D = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f43978B
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            ta.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            oa.C4158c.a(r4, r5)
            throw r4
        L72:
            oa.C4158c.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.n.b(ac.e, ac.f, ta.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, ta.g gVar) {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 == null || !interfaceC1867v0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC1867v0.u());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && C3862t.b(th2, th);
    }
}
