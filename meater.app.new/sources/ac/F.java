package ac;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lac/F;", "Lac/D;", "<init>", "()V", "Lac/H;", "", "subscriptionCount", "Lac/e;", "Lac/B;", "a", "(Lac/H;)Lac/e;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class F implements D {

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lac/f;", "Lac/B;", "Loa/F;", "<anonymous>", "(Lac/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC1971f<? super B>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f20302B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f20303C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ H<Integer> f20304D;

        /* compiled from: SharingStarted.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Loa/F;", "b", "(ILta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ac.F$a$a, reason: collision with other inner class name */
        static final class C0289a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.K f20305B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ InterfaceC1971f<B> f20306C;

            /* compiled from: SharingStarted.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ac.F$a$a$a, reason: collision with other inner class name */
            static final class C0290a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: B, reason: collision with root package name */
                /* synthetic */ Object f20307B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C0289a<T> f20308C;

                /* renamed from: D, reason: collision with root package name */
                int f20309D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0290a(C0289a<? super T> c0289a, InterfaceC4588d<? super C0290a> interfaceC4588d) {
                    super(interfaceC4588d);
                    this.f20308C = c0289a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f20307B = obj;
                    this.f20309D |= Integer.MIN_VALUE;
                    return this.f20308C.b(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0289a(kotlin.jvm.internal.K k10, InterfaceC1971f<? super B> interfaceC1971f) {
                this.f20305B = k10;
                this.f20306C = interfaceC1971f;
            }

            @Override // ac.InterfaceC1971f
            public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC4588d interfaceC4588d) {
                return b(((Number) obj).intValue(), interfaceC4588d);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(int r5, ta.InterfaceC4588d<? super oa.C4153F> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ac.F.a.C0289a.C0290a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ac.F$a$a$a r0 = (ac.F.a.C0289a.C0290a) r0
                    int r1 = r0.f20309D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f20309D = r1
                    goto L18
                L13:
                    ac.F$a$a$a r0 = new ac.F$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f20307B
                    java.lang.Object r1 = ua.C4696b.e()
                    int r2 = r0.f20309D
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    oa.C4173r.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    oa.C4173r.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.K r5 = r4.f20305B
                    boolean r6 = r5.f43974B
                    if (r6 != 0) goto L4e
                    r5.f43974B = r3
                    ac.f<ac.B> r5 = r4.f20306C
                    ac.B r6 = ac.B.f20289B
                    r0.f20309D = r3
                    java.lang.Object r5 = r5.a(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    oa.F r5 = oa.C4153F.f46609a
                    return r5
                L4e:
                    oa.F r5 = oa.C4153F.f46609a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ac.F.a.C0289a.b(int, ta.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H<Integer> h10, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f20304D = h10;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1971f<? super B> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(interfaceC1971f, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f20304D, interfaceC4588d);
            aVar.f20303C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f20302B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1971f interfaceC1971f = (InterfaceC1971f) this.f20303C;
                kotlin.jvm.internal.K k10 = new kotlin.jvm.internal.K();
                H<Integer> h10 = this.f20304D;
                C0289a c0289a = new C0289a(k10, interfaceC1971f);
                this.f20302B = 1;
                if (h10.b(c0289a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // ac.D
    public InterfaceC1970e<B> a(H<Integer> subscriptionCount) {
        return C1972g.r(new a(subscriptionCount, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
