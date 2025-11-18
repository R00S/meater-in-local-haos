package B1;

import Ba.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LB1/d;", "T", "", "a", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJL\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LB1/d$a;", "", "<init>", "()V", "T", "", "LB1/c;", "migrations", "LB1/h;", "api", "Loa/F;", "c", "(Ljava/util/List;LB1/h;Lta/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lta/d;", "b", "(Ljava/util/List;)LBa/p;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: B1.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB1/h;", "api", "Loa/F;", "<anonymous>", "(LB1/h;)V"}, k = 3, mv = {1, 5, 1})
        /* renamed from: B1.d$a$a, reason: collision with other inner class name */
        static final class C0023a extends kotlin.coroutines.jvm.internal.l implements p<h<T>, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f1402B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f1403C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ List<B1.c<T>> f1404D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0023a(List<? extends B1.c<T>> list, InterfaceC4588d<? super C0023a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f1404D = list;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h<T> hVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0023a) create(hVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0023a c0023a = new C0023a(this.f1404D, interfaceC4588d);
                c0023a.f1403C = obj;
                return c0023a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f1402B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    h hVar = (h) this.f1403C;
                    Companion companion = d.INSTANCE;
                    List<B1.c<T>> list = this.f1404D;
                    this.f1402B = 1;
                    if (companion.c(list, hVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        /* compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: B1.d$a$b */
        static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            Object f1405B;

            /* renamed from: C, reason: collision with root package name */
            Object f1406C;

            /* renamed from: D, reason: collision with root package name */
            /* synthetic */ Object f1407D;

            /* renamed from: F, reason: collision with root package name */
            int f1409F;

            b(InterfaceC4588d<? super b> interfaceC4588d) {
                super(interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f1407D = obj;
                this.f1409F |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, this);
            }
        }

        /* compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: B1.d$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements p<T, InterfaceC4588d<? super T>, Object> {

            /* renamed from: B, reason: collision with root package name */
            Object f1410B;

            /* renamed from: C, reason: collision with root package name */
            Object f1411C;

            /* renamed from: D, reason: collision with root package name */
            Object f1412D;

            /* renamed from: E, reason: collision with root package name */
            int f1413E;

            /* renamed from: F, reason: collision with root package name */
            /* synthetic */ Object f1414F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ List<B1.c<T>> f1415G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ List<Ba.l<InterfaceC4588d<? super C4153F>, Object>> f1416H;

            /* compiled from: DataMigrationInitializer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loa/F;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
            /* renamed from: B1.d$a$c$a, reason: collision with other inner class name */
            static final class C0024a extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f1417B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ B1.c<T> f1418C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0024a(B1.c<T> cVar, InterfaceC4588d<? super C0024a> interfaceC4588d) {
                    super(1, interfaceC4588d);
                    this.f1418C = cVar;
                }

                @Override // Ba.l
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0024a) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
                    return new C0024a(this.f1418C, interfaceC4588d);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f1417B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        B1.c<T> cVar = this.f1418C;
                        this.f1417B = 1;
                        if (cVar.c(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends B1.c<T>> list, List<Ba.l<InterfaceC4588d<? super C4153F>, Object>> list2, InterfaceC4588d<? super c> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f1415G = list;
                this.f1416H = list2;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, InterfaceC4588d<? super T> interfaceC4588d) {
                return ((c) create(t10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                c cVar = new c(this.f1415G, this.f1416H, interfaceC4588d);
                cVar.f1414F = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r9.f1413E
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f1410B
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f1414F
                    java.util.List r4 = (java.util.List) r4
                    oa.C4173r.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f1412D
                    java.lang.Object r4 = r9.f1411C
                    B1.c r4 = (B1.c) r4
                    java.lang.Object r5 = r9.f1410B
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f1414F
                    java.util.List r6 = (java.util.List) r6
                    oa.C4173r.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    oa.C4173r.b(r10)
                    java.lang.Object r10 = r9.f1414F
                    java.util.List<B1.c<T>> r1 = r9.f1415G
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<Ba.l<ta.d<? super oa.F>, java.lang.Object>> r4 = r9.f1416H
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    B1.c r5 = (B1.c) r5
                    r9.f1414F = r4
                    r9.f1410B = r1
                    r9.f1411C = r5
                    r9.f1412D = r10
                    r9.f1413E = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L63
                    return r0
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    B1.d$a$c$a r10 = new B1.d$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f1414F = r4
                    r9.f1410B = r5
                    r9.f1411C = r7
                    r9.f1412D = r7
                    r9.f1413E = r2
                    java.lang.Object r10 = r6.b(r1, r9)
                    if (r10 != r0) goto L8a
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: B1.d.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object c(java.util.List<? extends B1.c<T>> r7, B1.h<T> r8, ta.InterfaceC4588d<? super oa.C4153F> r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof B1.d.Companion.b
                if (r0 == 0) goto L13
                r0 = r9
                B1.d$a$b r0 = (B1.d.Companion.b) r0
                int r1 = r0.f1409F
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1409F = r1
                goto L18
            L13:
                B1.d$a$b r0 = new B1.d$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f1407D
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f1409F
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f1406C
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f1405B
                kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
                oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f1405B
                java.util.List r7 = (java.util.List) r7
                oa.C4173r.b(r9)
                goto L60
            L46:
                oa.C4173r.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                B1.d$a$c r2 = new B1.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f1405B = r9
                r0.f1409F = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.O r8 = new kotlin.jvm.internal.O
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                Ba.l r9 = (Ba.l) r9
                r0.f1405B = r8     // Catch: java.lang.Throwable -> L34
                r0.f1406C = r7     // Catch: java.lang.Throwable -> L34
                r0.f1409F = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                T r2 = r8.f43978B
                if (r2 != 0) goto L8b
                r8.f43978B = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.C3862t.d(r2)
                T r2 = r8.f43978B
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                oa.C4158c.a(r2, r9)
                goto L6b
            L96:
                T r7 = r8.f43978B
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                oa.F r7 = oa.C4153F.f46609a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: B1.d.Companion.c(java.util.List, B1.h, ta.d):java.lang.Object");
        }

        public final <T> p<h<T>, InterfaceC4588d<? super C4153F>, Object> b(List<? extends B1.c<T>> migrations) {
            C3862t.g(migrations, "migrations");
            return new C0023a(migrations, null);
        }

        private Companion() {
        }
    }
}
