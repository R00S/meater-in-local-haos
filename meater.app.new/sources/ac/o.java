package ac;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Limit.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Lac/e;", "Lkotlin/Function2;", "Lta/d;", "", "", "predicate", "a", "(Lac/e;LBa/p;)Lac/e;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ac/o$a", "Lac/e;", "Lac/f;", "collector", "Loa/F;", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements InterfaceC1970e<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1970e f20385B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.p f20386C;

        public a(InterfaceC1970e interfaceC1970e, Ba.p pVar) {
            this.f20385B = interfaceC1970e;
            this.f20386C = pVar;
        }

        @Override // ac.InterfaceC1970e
        public Object b(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            Object objB = this.f20385B.b(new b(new kotlin.jvm.internal.K(), interfaceC1971f, this.f20386C), interfaceC4588d);
            return objB == C4696b.e() ? objB : C4153F.f46609a;
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class b<T> implements InterfaceC1971f {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f20387B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC1971f<T> f20388C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.p<T, InterfaceC4588d<? super Boolean>, Object> f20389D;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {33, 34, 36}, m = "emit")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            Object f20390B;

            /* renamed from: C, reason: collision with root package name */
            Object f20391C;

            /* renamed from: D, reason: collision with root package name */
            /* synthetic */ Object f20392D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ b<T> f20393E;

            /* renamed from: F, reason: collision with root package name */
            int f20394F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(interfaceC4588d);
                this.f20393E = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f20392D = obj;
                this.f20394F |= Integer.MIN_VALUE;
                return this.f20393E.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.jvm.internal.K k10, InterfaceC1971f<? super T> interfaceC1971f, Ba.p<? super T, ? super InterfaceC4588d<? super Boolean>, ? extends Object> pVar) {
            this.f20387B = k10;
            this.f20388C = interfaceC1971f;
            this.f20389D = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // ac.InterfaceC1971f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(T r7, ta.InterfaceC4588d<? super oa.C4153F> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof ac.o.b.a
                if (r0 == 0) goto L13
                r0 = r8
                ac.o$b$a r0 = (ac.o.b.a) r0
                int r1 = r0.f20394F
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20394F = r1
                goto L18
            L13:
                ac.o$b$a r0 = new ac.o$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f20392D
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f20394F
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                oa.C4173r.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f20391C
                java.lang.Object r2 = r0.f20390B
                ac.o$b r2 = (ac.o.b) r2
                oa.C4173r.b(r8)
                goto L6c
            L41:
                oa.C4173r.b(r8)
                goto L59
            L45:
                oa.C4173r.b(r8)
                kotlin.jvm.internal.K r8 = r6.f20387B
                boolean r8 = r8.f43974B
                if (r8 == 0) goto L5c
                ac.f<T> r8 = r6.f20388C
                r0.f20394F = r5
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                oa.F r7 = oa.C4153F.f46609a
                return r7
            L5c:
                Ba.p<T, ta.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f20389D
                r0.f20390B = r6
                r0.f20391C = r7
                r0.f20394F = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.K r8 = r2.f20387B
                r8.f43974B = r5
                ac.f<T> r8 = r2.f20388C
                r2 = 0
                r0.f20390B = r2
                r0.f20391C = r2
                r0.f20394F = r3
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                oa.F r7 = oa.C4153F.f46609a
                return r7
            L8b:
                oa.F r7 = oa.C4153F.f46609a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.o.b.a(java.lang.Object, ta.d):java.lang.Object");
        }
    }

    public static final <T> InterfaceC1970e<T> a(InterfaceC1970e<? extends T> interfaceC1970e, Ba.p<? super T, ? super InterfaceC4588d<? super Boolean>, ? extends Object> pVar) {
        return new a(interfaceC1970e, pVar);
    }
}
