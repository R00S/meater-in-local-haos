package ac;

import kotlin.Metadata;
import kotlin.jvm.internal.O;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Reduce.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lac/e;", "b", "(Lac/e;Lta/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lta/d;", "", "", "predicate", "a", "(Lac/e;LBa/p;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"ac/q$a", "Lac/f;", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements InterfaceC1971f<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O f20400B;

        public a(O o10) {
            this.f20400B = o10;
        }

        @Override // ac.InterfaceC1971f
        public Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            this.f20400B.f43978B = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"ac/q$b", "Lac/f;", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements InterfaceC1971f<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.p f20401B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ O f20402C;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {139}, m = "emit")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            Object f20403B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f20404C;

            /* renamed from: D, reason: collision with root package name */
            int f20405D;

            /* renamed from: F, reason: collision with root package name */
            Object f20407F;

            public a(InterfaceC4588d interfaceC4588d) {
                super(interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f20404C = obj;
                this.f20405D |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(Ba.p pVar, O o10) {
            this.f20401B = pVar;
            this.f20402C = o10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // ac.InterfaceC1971f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(T r5, ta.InterfaceC4588d<? super oa.C4153F> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof ac.q.b.a
                if (r0 == 0) goto L13
                r0 = r6
                ac.q$b$a r0 = (ac.q.b.a) r0
                int r1 = r0.f20405D
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20405D = r1
                goto L18
            L13:
                ac.q$b$a r0 = new ac.q$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f20404C
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f20405D
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f20407F
                java.lang.Object r0 = r0.f20403B
                ac.q$b r0 = (ac.q.b) r0
                oa.C4173r.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                oa.C4173r.b(r6)
                Ba.p r6 = r4.f20401B
                r0.f20403B = r4
                r0.f20407F = r5
                r0.f20405D = r3
                r2 = 6
                kotlin.jvm.internal.r.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.r.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                oa.F r5 = oa.C4153F.f46609a
                return r5
            L5d:
                kotlin.jvm.internal.O r6 = r0.f20402C
                r6.f43978B = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.q.b.a(java.lang.Object, ta.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20408B;

        /* renamed from: C, reason: collision with root package name */
        Object f20409C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f20410D;

        /* renamed from: E, reason: collision with root package name */
        int f20411E;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20410D = obj;
            this.f20411E |= Integer.MIN_VALUE;
            return C1972g.q(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20412B;

        /* renamed from: C, reason: collision with root package name */
        Object f20413C;

        /* renamed from: D, reason: collision with root package name */
        Object f20414D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f20415E;

        /* renamed from: F, reason: collision with root package name */
        int f20416F;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20415E = obj;
            this.f20416F |= Integer.MIN_VALUE;
            return C1972g.p(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(ac.InterfaceC1970e<? extends T> r4, Ba.p<? super T, ? super ta.InterfaceC4588d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, ta.InterfaceC4588d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof ac.q.d
            if (r0 == 0) goto L13
            r0 = r6
            ac.q$d r0 = (ac.q.d) r0
            int r1 = r0.f20416F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20416F = r1
            goto L18
        L13:
            ac.q$d r0 = new ac.q$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f20415E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f20416F
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f20414D
            ac.q$b r4 = (ac.q.b) r4
            java.lang.Object r5 = r0.f20413C
            kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
            java.lang.Object r0 = r0.f20412B
            Ba.p r0 = (Ba.p) r0
            oa.C4173r.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            oa.C4173r.b(r6)
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            cc.F r2 = kotlin.C2298n.f30783a
            r6.f43978B = r2
            ac.q$b r2 = new ac.q$b
            r2.<init>(r5, r6)
            r0.f20412B = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f20413C = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f20414D = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f20416F = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            kotlin.C2294j.a(r6, r4)
        L6a:
            T r4 = r5.f43978B
            cc.F r5 = kotlin.C2298n.f30783a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.q.a(ac.e, Ba.p, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(ac.InterfaceC1970e<? extends T> r4, ta.InterfaceC4588d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof ac.q.c
            if (r0 == 0) goto L13
            r0 = r5
            ac.q$c r0 = (ac.q.c) r0
            int r1 = r0.f20411E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20411E = r1
            goto L18
        L13:
            ac.q$c r0 = new ac.q$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f20410D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f20411E
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f20409C
            ac.q$a r4 = (ac.q.a) r4
            java.lang.Object r0 = r0.f20408B
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            oa.C4173r.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            oa.C4173r.b(r5)
            kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
            r5.<init>()
            cc.F r2 = kotlin.C2298n.f30783a
            r5.f43978B = r2
            ac.q$a r2 = new ac.q$a
            r2.<init>(r5)
            r0.f20408B = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f20409C = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f20411E = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlin.C2294j.a(r5, r4)
        L62:
            T r4 = r0.f43978B
            cc.F r5 = kotlin.C2298n.f30783a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.q.b(ac.e, ta.d):java.lang.Object");
    }
}
