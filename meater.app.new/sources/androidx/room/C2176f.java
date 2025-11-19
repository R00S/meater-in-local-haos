package androidx.room;

import Xb.C1841i;
import Xb.J;
import ac.C1972g;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import androidx.room.q;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/f;", "", "a", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2176f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CoroutinesRoom.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/f$a;", "", "<init>", "()V", "R", "Landroidx/room/w;", "db", "", "inTransaction", "", "", "tableNames", "Ljava/util/concurrent/Callable;", "callable", "Lac/e;", "a", "(Landroidx/room/w;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lac/e;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {111}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lac/f;", "Loa/F;", "<anonymous>", "(Lac/f;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        static final class C0398a<R> extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC1971f<R>, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f29135B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f29136C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ boolean f29137D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ w f29138E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String[] f29139F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Callable<R> f29140G;

            /* compiled from: CoroutinesRoom.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {137}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.room.f$a$a$a, reason: collision with other inner class name */
            static final class C0399a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f29141B;

                /* renamed from: C, reason: collision with root package name */
                private /* synthetic */ Object f29142C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ boolean f29143D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ w f29144E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ InterfaceC1971f<R> f29145F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ String[] f29146G;

                /* renamed from: H, reason: collision with root package name */
                final /* synthetic */ Callable<R> f29147H;

                /* compiled from: CoroutinesRoom.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {128, 130}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.room.f$a$a$a$a, reason: collision with other inner class name */
                static final class C0400a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

                    /* renamed from: B, reason: collision with root package name */
                    Object f29148B;

                    /* renamed from: C, reason: collision with root package name */
                    int f29149C;

                    /* renamed from: D, reason: collision with root package name */
                    final /* synthetic */ w f29150D;

                    /* renamed from: E, reason: collision with root package name */
                    final /* synthetic */ b f29151E;

                    /* renamed from: F, reason: collision with root package name */
                    final /* synthetic */ Zb.g<C4153F> f29152F;

                    /* renamed from: G, reason: collision with root package name */
                    final /* synthetic */ Callable<R> f29153G;

                    /* renamed from: H, reason: collision with root package name */
                    final /* synthetic */ Zb.g<R> f29154H;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0400a(w wVar, b bVar, Zb.g gVar, Callable callable, Zb.g gVar2, InterfaceC4588d interfaceC4588d) {
                        super(2, interfaceC4588d);
                        this.f29150D = wVar;
                        this.f29151E = bVar;
                        this.f29152F = gVar;
                        this.f29153G = callable;
                        this.f29154H = gVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                        return new C0400a(this.f29150D, this.f29151E, this.f29152F, this.f29153G, this.f29154H, interfaceC4588d);
                    }

                    @Override // Ba.p
                    public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                        return ((C0400a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x003d, B:22:0x004b, B:24:0x0053, B:14:0x0025, B:17:0x0037), top: B:31:0x0008 }] */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:8:0x0015). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            r6 = this;
                            java.lang.Object r0 = ua.C4696b.e()
                            int r1 = r6.f29149C
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L29
                            if (r1 == r3) goto L21
                            if (r1 != r2) goto L19
                            java.lang.Object r1 = r6.f29148B
                            Zb.i r1 = (Zb.i) r1
                            oa.C4173r.b(r7)     // Catch: java.lang.Throwable -> L17
                        L15:
                            r7 = r1
                            goto L3d
                        L17:
                            r7 = move-exception
                            goto L77
                        L19:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L21:
                            java.lang.Object r1 = r6.f29148B
                            Zb.i r1 = (Zb.i) r1
                            oa.C4173r.b(r7)     // Catch: java.lang.Throwable -> L17
                            goto L4b
                        L29:
                            oa.C4173r.b(r7)
                            androidx.room.w r7 = r6.f29150D
                            androidx.room.q r7 = r7.getInvalidationTracker()
                            androidx.room.f$a$a$a$b r1 = r6.f29151E
                            r7.c(r1)
                            Zb.g<oa.F> r7 = r6.f29152F     // Catch: java.lang.Throwable -> L17
                            Zb.i r7 = r7.iterator()     // Catch: java.lang.Throwable -> L17
                        L3d:
                            r6.f29148B = r7     // Catch: java.lang.Throwable -> L17
                            r6.f29149C = r3     // Catch: java.lang.Throwable -> L17
                            java.lang.Object r1 = r7.a(r6)     // Catch: java.lang.Throwable -> L17
                            if (r1 != r0) goto L48
                            return r0
                        L48:
                            r5 = r1
                            r1 = r7
                            r7 = r5
                        L4b:
                            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L17
                            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L17
                            if (r7 == 0) goto L69
                            r1.next()     // Catch: java.lang.Throwable -> L17
                            java.util.concurrent.Callable<R> r7 = r6.f29153G     // Catch: java.lang.Throwable -> L17
                            java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L17
                            Zb.g<R> r4 = r6.f29154H     // Catch: java.lang.Throwable -> L17
                            r6.f29148B = r1     // Catch: java.lang.Throwable -> L17
                            r6.f29149C = r2     // Catch: java.lang.Throwable -> L17
                            java.lang.Object r7 = r4.v(r7, r6)     // Catch: java.lang.Throwable -> L17
                            if (r7 != r0) goto L15
                            return r0
                        L69:
                            androidx.room.w r7 = r6.f29150D
                            androidx.room.q r7 = r7.getInvalidationTracker()
                            androidx.room.f$a$a$a$b r0 = r6.f29151E
                            r7.p(r0)
                            oa.F r7 = oa.C4153F.f46609a
                            return r7
                        L77:
                            androidx.room.w r0 = r6.f29150D
                            androidx.room.q r0 = r0.getInvalidationTracker()
                            androidx.room.f$a$a$a$b r1 = r6.f29151E
                            r0.p(r1)
                            throw r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C2176f.Companion.C0398a.C0399a.C0400a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* compiled from: CoroutinesRoom.kt */
                @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/f$a$a$a$b", "Landroidx/room/q$c;", "", "", "tables", "Loa/F;", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.room.f$a$a$a$b */
                public static final class b extends q.c {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Zb.g<C4153F> f29155b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(String[] strArr, Zb.g<C4153F> gVar) {
                        super(strArr);
                        this.f29155b = gVar;
                    }

                    @Override // androidx.room.q.c
                    public void c(Set<String> tables) {
                        this.f29155b.w(C4153F.f46609a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0399a(boolean z10, w wVar, InterfaceC1971f<R> interfaceC1971f, String[] strArr, Callable<R> callable, InterfaceC4588d<? super C0399a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f29143D = z10;
                    this.f29144E = wVar;
                    this.f29145F = interfaceC1971f;
                    this.f29146G = strArr;
                    this.f29147H = callable;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    C0399a c0399a = new C0399a(this.f29143D, this.f29144E, this.f29145F, this.f29146G, this.f29147H, interfaceC4588d);
                    c0399a.f29142C = obj;
                    return c0399a;
                }

                @Override // Ba.p
                public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0399a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ta.e eVarB;
                    Object objE = C4696b.e();
                    int i10 = this.f29141B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        Xb.I i11 = (Xb.I) this.f29142C;
                        Zb.g gVarB = Zb.j.b(-1, null, null, 6, null);
                        b bVar = new b(this.f29146G, gVarB);
                        gVarB.w(C4153F.f46609a);
                        G g10 = (G) i11.getCoroutineContext().b(G.INSTANCE);
                        if (g10 == null || (eVarB = g10.getTransactionDispatcher()) == null) {
                            eVarB = this.f29143D ? C2177g.b(this.f29144E) : C2177g.a(this.f29144E);
                        }
                        Zb.g gVarB2 = Zb.j.b(0, null, null, 7, null);
                        C1841i.d(i11, eVarB, null, new C0400a(this.f29144E, bVar, gVarB, this.f29147H, gVarB2, null), 2, null);
                        InterfaceC1971f<R> interfaceC1971f = this.f29145F;
                        this.f29141B = 1;
                        if (C1972g.m(interfaceC1971f, gVarB2, this) == objE) {
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
            C0398a(boolean z10, w wVar, String[] strArr, Callable<R> callable, InterfaceC4588d<? super C0398a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f29137D = z10;
                this.f29138E = wVar;
                this.f29139F = strArr;
                this.f29140G = callable;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1971f<R> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0398a) create(interfaceC1971f, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0398a c0398a = new C0398a(this.f29137D, this.f29138E, this.f29139F, this.f29140G, interfaceC4588d);
                c0398a.f29136C = obj;
                return c0398a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f29135B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C0399a c0399a = new C0399a(this.f29137D, this.f29138E, (InterfaceC1971f) this.f29136C, this.f29139F, this.f29140G, null);
                    this.f29135B = 1;
                    if (J.d(c0399a, this) == objE) {
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

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final <R> InterfaceC1970e<R> a(w db2, boolean inTransaction, String[] tableNames, Callable<R> callable) {
            return C1972g.r(new C0398a(inTransaction, db2, tableNames, callable, null));
        }

        private Companion() {
        }
    }

    public static final <R> InterfaceC1970e<R> a(w wVar, boolean z10, String[] strArr, Callable<R> callable) {
        return INSTANCE.a(wVar, z10, strArr, callable);
    }
}
