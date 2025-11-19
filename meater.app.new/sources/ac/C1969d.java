package ac;

import kotlin.C2298n;
import kotlin.Metadata;
import kotlin.jvm.internal.O;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lac/d;", "T", "Lac/e;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(Lac/e;LBa/l;LBa/p;)V", "Lac/f;", "collector", "Loa/F;", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "B", "Lac/e;", "C", "LBa/l;", "D", "LBa/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ac.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1969d<T> implements InterfaceC1970e<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1970e<T> upstream;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final Ba.l<T, Object> keySelector;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final Ba.p<Object, Object, Boolean> areEquivalent;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ac.d$a */
    static final class a<T> implements InterfaceC1971f {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1969d<T> f20352B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ O<Object> f20353C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1971f<T> f20354D;

        /* compiled from: Distinct.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ac.d$a$a, reason: collision with other inner class name */
        static final class C0292a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            /* synthetic */ Object f20355B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ a<T> f20356C;

            /* renamed from: D, reason: collision with root package name */
            int f20357D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0292a(a<? super T> aVar, InterfaceC4588d<? super C0292a> interfaceC4588d) {
                super(interfaceC4588d);
                this.f20356C = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f20355B = obj;
                this.f20357D |= Integer.MIN_VALUE;
                return this.f20356C.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(C1969d<T> c1969d, O<Object> o10, InterfaceC1971f<? super T> interfaceC1971f) {
            this.f20352B = c1969d;
            this.f20353C = o10;
            this.f20354D = interfaceC1971f;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // ac.InterfaceC1971f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(T r6, ta.InterfaceC4588d<? super oa.C4153F> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ac.C1969d.a.C0292a
                if (r0 == 0) goto L13
                r0 = r7
                ac.d$a$a r0 = (ac.C1969d.a.C0292a) r0
                int r1 = r0.f20357D
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20357D = r1
                goto L18
            L13:
                ac.d$a$a r0 = new ac.d$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f20355B
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f20357D
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                oa.C4173r.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                oa.C4173r.b(r7)
                ac.d<T> r7 = r5.f20352B
                Ba.l<T, java.lang.Object> r7 = r7.keySelector
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.O<java.lang.Object> r2 = r5.f20353C
                T r2 = r2.f43978B
                cc.F r4 = kotlin.C2298n.f30783a
                if (r2 == r4) goto L58
                ac.d<T> r4 = r5.f20352B
                Ba.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.areEquivalent
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                oa.F r6 = oa.C4153F.f46609a
                return r6
            L58:
                kotlin.jvm.internal.O<java.lang.Object> r2 = r5.f20353C
                r2.f43978B = r7
                ac.f<T> r7 = r5.f20354D
                r0.f20357D = r3
                java.lang.Object r6 = r7.a(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                oa.F r6 = oa.C4153F.f46609a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.C1969d.a.a(java.lang.Object, ta.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1969d(InterfaceC1970e<? extends T> interfaceC1970e, Ba.l<? super T, ? extends Object> lVar, Ba.p<Object, Object, Boolean> pVar) {
        this.upstream = interfaceC1970e;
        this.keySelector = lVar;
        this.areEquivalent = pVar;
    }

    @Override // ac.InterfaceC1970e
    public Object b(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        O o10 = new O();
        o10.f43978B = (T) C2298n.f30783a;
        Object objB = this.upstream.b(new a(this, o10, interfaceC1971f), interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }
}
