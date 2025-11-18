package kotlin;

import Ba.p;
import Xb.C1837g;
import Xb.I;
import ac.C1972g;
import ac.H;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import androidx.compose.runtime.snapshots.e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import s.C4389K;
import ta.InterfaceC4588d;
import ta.g;
import ta.h;
import ua.C4696b;

/* compiled from: SnapshotFlow.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "Lac/H;", "Lta/g;", "context", "LO/x1;", "c", "(Lac/H;Lta/g;LO/l;II)LO/x1;", "R", "Lac/e;", "initial", "b", "(Lac/e;Ljava/lang/Object;Lta/g;LO/l;II)LO/x1;", "Lkotlin/Function0;", "block", "e", "(LBa/a;)Lac/e;", "Ls/K;", "", "", "set", "", "d", "(Ls/K;Ljava/util/Set;)Z", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class p1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SnapshotFlow.kt */
    @f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {68, 69}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LO/E0;", "Loa/F;", "<anonymous>", "(LO/E0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a<R> extends l implements p<InterfaceC1497E0<R>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f12965B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f12966C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ g f12967D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC1970e<T> f12968E;

        /* compiled from: SnapshotFlow.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O.p1$a$a, reason: collision with other inner class name */
        static final class C0197a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC1497E0<R> f12969B;

            C0197a(InterfaceC1497E0<R> interfaceC1497E0) {
                this.f12969B = interfaceC1497E0;
            }

            @Override // ac.InterfaceC1971f
            public final Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                this.f12969B.setValue(t10);
                return C4153F.f46609a;
            }
        }

        /* compiled from: SnapshotFlow.kt */
        @f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {70}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f12970B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ InterfaceC1970e<T> f12971C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ InterfaceC1497E0<R> f12972D;

            /* compiled from: SnapshotFlow.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: O.p1$a$b$a, reason: collision with other inner class name */
            static final class C0198a<T> implements InterfaceC1971f {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ InterfaceC1497E0<R> f12973B;

                C0198a(InterfaceC1497E0<R> interfaceC1497E0) {
                    this.f12973B = interfaceC1497E0;
                }

                @Override // ac.InterfaceC1971f
                public final Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    this.f12973B.setValue(t10);
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC1970e<? extends T> interfaceC1970e, InterfaceC1497E0<R> interfaceC1497E0, InterfaceC4588d<? super b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f12971C = interfaceC1970e;
                this.f12972D = interfaceC1497E0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new b(this.f12971C, this.f12972D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f12970B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    InterfaceC1970e<T> interfaceC1970e = this.f12971C;
                    C0198a c0198a = new C0198a(this.f12972D);
                    this.f12970B = 1;
                    if (interfaceC1970e.b(c0198a, this) == objE) {
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
        a(g gVar, InterfaceC1970e<? extends T> interfaceC1970e, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f12967D = gVar;
            this.f12968E = interfaceC1970e;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1497E0<R> interfaceC1497E0, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(interfaceC1497E0, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f12967D, this.f12968E, interfaceC4588d);
            aVar.f12966C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f12965B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1497E0 interfaceC1497E0 = (InterfaceC1497E0) this.f12966C;
                if (C3862t.b(this.f12967D, h.f50000B)) {
                    InterfaceC1970e<T> interfaceC1970e = this.f12968E;
                    C0197a c0197a = new C0197a(interfaceC1497E0);
                    this.f12965B = 1;
                    if (interfaceC1970e.b(c0197a, this) == objE) {
                        return objE;
                    }
                } else {
                    g gVar = this.f12967D;
                    b bVar = new b(this.f12968E, interfaceC1497E0, null);
                    this.f12965B = 2;
                    if (C1837g.g(gVar, bVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SnapshotFlow.kt */
    @f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {148, 152, 174}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lac/f;", "Loa/F;", "<anonymous>", "(Lac/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b<T> extends l implements p<InterfaceC1971f<? super T>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f12974B;

        /* renamed from: C, reason: collision with root package name */
        Object f12975C;

        /* renamed from: D, reason: collision with root package name */
        Object f12976D;

        /* renamed from: E, reason: collision with root package name */
        Object f12977E;

        /* renamed from: F, reason: collision with root package name */
        Object f12978F;

        /* renamed from: G, reason: collision with root package name */
        int f12979G;

        /* renamed from: H, reason: collision with root package name */
        int f12980H;

        /* renamed from: I, reason: collision with root package name */
        private /* synthetic */ Object f12981I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ Ba.a<T> f12982J;

        /* compiled from: SnapshotFlow.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<Object, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C4389K<Object> f12983B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4389K<Object> c4389k) {
                super(1);
                this.f12983B = c4389k;
            }

            public final void a(Object obj) {
                if (obj instanceof Z.l) {
                    ((Z.l) obj).q(e.a(4));
                }
                this.f12983B.h(obj);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
                a(obj);
                return C4153F.f46609a;
            }
        }

        /* compiled from: SnapshotFlow.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "", "changed", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "Loa/F;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O.p1$b$b, reason: collision with other inner class name */
        static final class C0199b extends AbstractC3864v implements p<Set<? extends Object>, androidx.compose.runtime.snapshots.g, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Zb.g<Set<Object>> f12984B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0199b(Zb.g<Set<Object>> gVar) {
                super(2);
                this.f12984B = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.util.Set<? extends java.lang.Object> r17, androidx.compose.runtime.snapshots.g r18) {
                /*
                    r16 = this;
                    r0 = r17
                    boolean r1 = r0 instanceof Q.d
                    r2 = 4
                    if (r1 == 0) goto L64
                    r1 = r0
                    Q.d r1 = (Q.d) r1
                    s.V r1 = r1.c()
                    java.lang.Object[] r3 = r1.elements
                    long[] r1 = r1.metadata
                    int r4 = r1.length
                    int r4 = r4 + (-2)
                    if (r4 < 0) goto L61
                    r5 = 0
                    r6 = r5
                L19:
                    r7 = r1[r6]
                    long r9 = ~r7
                    r11 = 7
                    long r9 = r9 << r11
                    long r9 = r9 & r7
                    r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r9 = r9 & r11
                    int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r9 == 0) goto L5c
                    int r9 = r6 - r4
                    int r9 = ~r9
                    int r9 = r9 >>> 31
                    r10 = 8
                    int r9 = 8 - r9
                    r11 = r5
                L33:
                    if (r11 >= r9) goto L5a
                    r12 = 255(0xff, double:1.26E-321)
                    long r12 = r12 & r7
                    r14 = 128(0x80, double:6.32E-322)
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 >= 0) goto L56
                    int r12 = r6 << 3
                    int r12 = r12 + r11
                    r12 = r3[r12]
                    boolean r13 = r12 instanceof Z.l
                    if (r13 == 0) goto L53
                    Z.l r12 = (Z.l) r12
                    int r13 = androidx.compose.runtime.snapshots.e.a(r2)
                    boolean r12 = r12.p(r13)
                    if (r12 == 0) goto L56
                L53:
                    r1 = r16
                    goto L94
                L56:
                    long r7 = r7 >> r10
                    int r11 = r11 + 1
                    goto L33
                L5a:
                    if (r9 != r10) goto L61
                L5c:
                    if (r6 == r4) goto L61
                    int r6 = r6 + 1
                    goto L19
                L61:
                    r1 = r16
                    goto L99
                L64:
                    r1 = r0
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    boolean r3 = r1 instanceof java.util.Collection
                    if (r3 == 0) goto L75
                    r3 = r1
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto L75
                    goto L61
                L75:
                    java.util.Iterator r1 = r1.iterator()
                L79:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L61
                    java.lang.Object r3 = r1.next()
                    boolean r4 = r3 instanceof Z.l
                    if (r4 == 0) goto L53
                    Z.l r3 = (Z.l) r3
                    int r4 = androidx.compose.runtime.snapshots.e.a(r2)
                    boolean r3 = r3.p(r4)
                    if (r3 == 0) goto L79
                    goto L53
                L94:
                    Zb.g<java.util.Set<java.lang.Object>> r2 = r1.f12984B
                    r2.w(r0)
                L99:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: O.p1.b.C0199b.a(java.util.Set, androidx.compose.runtime.snapshots.g):void");
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                a(set, gVar);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Ba.a<? extends T> aVar, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f12982J = aVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(interfaceC1971f, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f12982J, interfaceC4588d);
            bVar.f12981I = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:34:0x00e1, B:38:0x00ea], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:42:0x00f9, B:58:0x0138], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:58:0x0138, B:42:0x00f9], limit reached: 76 */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r10v1, types: [ac.f, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v1, types: [ac.f, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: O.p1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T extends R, R> x1<R> b(InterfaceC1970e<? extends T> interfaceC1970e, R r10, g gVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            gVar = h.f50000B;
        }
        g gVar2 = gVar;
        if (C1560o.J()) {
            C1560o.S(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zL = interfaceC1554l.l(gVar2) | interfaceC1554l.l(interfaceC1970e);
        Object objF = interfaceC1554l.f();
        if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new a(gVar2, interfaceC1970e, null);
            interfaceC1554l.J(objF);
        }
        x1<R> x1VarK = m1.k(r10, interfaceC1970e, gVar2, (p) objF, interfaceC1554l, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 896));
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarK;
    }

    public static final <T> x1<T> c(H<? extends T> h10, g gVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            gVar = h.f50000B;
        }
        g gVar2 = gVar;
        if (C1560o.J()) {
            C1560o.S(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        x1<T> x1VarA = m1.a(h10, h10.getValue(), gVar2, interfaceC1554l, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C4389K<Object> c4389k, Set<? extends Object> set) {
        Object[] objArr = c4389k.elements;
        long[] jArr = c4389k.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && set.contains(objArr[(i10 << 3) + i12])) {
                        return true;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return false;
                }
            }
            if (i10 == length) {
                return false;
            }
            i10++;
        }
    }

    public static final <T> InterfaceC1970e<T> e(Ba.a<? extends T> aVar) {
        return C1972g.r(new b(aVar, null));
    }
}
