package kotlin;

import W.IntRef;
import Z.k;
import Z.l;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.j;
import androidx.compose.runtime.snapshots.n;
import kotlin.InterfaceC1502H;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4385G;
import s.M;
import s.N;

/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"LO/G;", "T", "LZ/l;", "LO/H;", "Lkotlin/Function0;", "calculation", "LO/l1;", "policy", "<init>", "(LBa/a;LO/l1;)V", "LO/G$a;", "readable", "Landroidx/compose/runtime/snapshots/g;", "snapshot", "", "forceDependencyReads", "s", "(LO/G$a;Landroidx/compose/runtime/snapshots/g;ZLBa/a;)LO/G$a;", "", "t", "()Ljava/lang/String;", "Landroidx/compose/runtime/snapshots/n;", "r", "(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;", "value", "Loa/F;", "h", "(Landroidx/compose/runtime/snapshots/n;)V", "toString", "C", "LBa/a;", "D", "LO/l1;", "c", "()LO/l1;", "E", "LO/G$a;", "first", "i", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "LO/H$a;", "o", "()LO/H$a;", "currentRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.G, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final class DerivedState<T> extends l implements InterfaceC1502H<T> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<T> calculation;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final l1<T> policy;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private a<T> first = new a<>();

    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 6*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u0014\u00105\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,¨\u00067"}, d2 = {"LO/G$a;", "T", "Landroidx/compose/runtime/snapshots/n;", "LO/H$a;", "<init>", "()V", "value", "Loa/F;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", "d", "()Landroidx/compose/runtime/snapshots/n;", "LO/H;", "derivedState", "Landroidx/compose/runtime/snapshots/g;", "snapshot", "", "k", "(LO/H;Landroidx/compose/runtime/snapshots/g;)Z", "", "l", "(LO/H;Landroidx/compose/runtime/snapshots/g;)I", "I", "getValidSnapshotId", "()I", "p", "(I)V", "validSnapshotId", "getValidSnapshotWriteCount", "q", "validSnapshotWriteCount", "Ls/M;", "LZ/k;", "e", "Ls/M;", "b", "()Ls/M;", "m", "(Ls/M;)V", "dependencies", "", "f", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "o", "resultHash", "a", "currentValue", "h", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.G$a */
    public static final class a<T> extends n implements InterfaceC1502H.a<T> {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f12615i = 8;

        /* renamed from: j, reason: collision with root package name */
        private static final Object f12616j = new Object();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotWriteCount;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private M<k> dependencies = N.a();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Object result = f12616j;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int resultHash;

        /* compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LO/G$a$a;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O.G$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final Object a() {
                return a.f12616j;
            }

            private Companion() {
            }
        }

        @Override // kotlin.InterfaceC1502H.a
        public T a() {
            return (T) this.result;
        }

        @Override // kotlin.InterfaceC1502H.a
        public M<k> b() {
            return this.dependencies;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) value;
            m(aVar.b());
            this.result = aVar.result;
            this.resultHash = aVar.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a();
        }

        /* renamed from: j, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean k(kotlin.InterfaceC1502H<?> r6, androidx.compose.runtime.snapshots.g r7) {
            /*
                r5 = this;
                java.lang.Object r0 = androidx.compose.runtime.snapshots.j.I()
                monitor-enter(r0)
                int r1 = r5.validSnapshotId     // Catch: java.lang.Throwable -> L1a
                int r2 = r7.getId()     // Catch: java.lang.Throwable -> L1a
                r3 = 1
                r4 = 0
                if (r1 != r2) goto L1c
                int r1 = r5.validSnapshotWriteCount     // Catch: java.lang.Throwable -> L1a
                int r2 = r7.getWriteCount()     // Catch: java.lang.Throwable -> L1a
                if (r1 == r2) goto L18
                goto L1c
            L18:
                r1 = r4
                goto L1d
            L1a:
                r6 = move-exception
                goto L4d
            L1c:
                r1 = r3
            L1d:
                monitor-exit(r0)
                java.lang.Object r0 = r5.result
                java.lang.Object r2 = kotlin.DerivedState.a.f12616j
                if (r0 == r2) goto L2f
                if (r1 == 0) goto L30
                int r0 = r5.resultHash
                int r6 = r5.l(r6, r7)
                if (r0 != r6) goto L2f
                goto L30
            L2f:
                r3 = r4
            L30:
                if (r3 == 0) goto L4c
                if (r1 == 0) goto L4c
                java.lang.Object r6 = androidx.compose.runtime.snapshots.j.I()
                monitor-enter(r6)
                int r0 = r7.getId()     // Catch: java.lang.Throwable -> L49
                r5.validSnapshotId = r0     // Catch: java.lang.Throwable -> L49
                int r7 = r7.getWriteCount()     // Catch: java.lang.Throwable -> L49
                r5.validSnapshotWriteCount = r7     // Catch: java.lang.Throwable -> L49
                oa.F r7 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L49
                monitor-exit(r6)
                goto L4c
            L49:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L4c:
                return r3
            L4d:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.DerivedState.a.k(O.H, androidx.compose.runtime.snapshots.g):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[Catch: all -> 0x007c, LOOP:1: B:16:0x003c->B:40:0x00a4, LOOP_END, TryCatch #1 {all -> 0x007c, blocks: (B:13:0x002f, B:16:0x003c, B:18:0x004c, B:20:0x0058, B:22:0x0062, B:34:0x0098, B:25:0x0071, B:27:0x0075, B:31:0x0086, B:30:0x007e, B:42:0x00a8, B:40:0x00a4), top: B:64:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00a0 A[EDGE_INSN: B:68:0x00a0->B:38:0x00a0 BREAK  A[LOOP:1: B:16:0x003c->B:40:0x00a4], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int l(kotlin.InterfaceC1502H<?> r22, androidx.compose.runtime.snapshots.g r23) {
            /*
                Method dump skipped, instructions count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.DerivedState.a.l(O.H, androidx.compose.runtime.snapshots.g):int");
        }

        public void m(M<k> m10) {
            this.dependencies = m10;
        }

        public final void n(Object obj) {
            this.result = obj;
        }

        public final void o(int i10) {
            this.resultHash = i10;
        }

        public final void p(int i10) {
            this.validSnapshotId = i10;
        }

        public final void q(int i10) {
            this.validSnapshotWriteCount = i10;
        }
    }

    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.G$b */
    static final class b extends AbstractC3864v implements Ba.l<Object, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ DerivedState<T> f12622B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ IntRef f12623C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C4385G<k> f12624D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f12625E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DerivedState<T> derivedState, IntRef intRef, C4385G<k> c4385g, int i10) {
            super(1);
            this.f12622B = derivedState;
            this.f12623C = intRef;
            this.f12624D = c4385g;
            this.f12625E = i10;
        }

        public final void a(Object obj) {
            if (obj == this.f12622B) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof k) {
                int element = this.f12623C.getElement();
                C4385G<k> c4385g = this.f12624D;
                c4385g.s(obj, Math.min(element - this.f12625E, c4385g.e(obj, Integer.MAX_VALUE)));
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(Ba.a<? extends T> aVar, l1<T> l1Var) {
        this.calculation = aVar;
        this.policy = l1Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> s(a<T> readable, g snapshot, boolean forceDependencyReads, Ba.a<? extends T> calculation) {
        g.Companion companion;
        l1<T> l1VarC;
        int i10;
        int i11;
        a<T> aVar = readable;
        int i12 = 1;
        if (!aVar.k(this, snapshot)) {
            int i13 = 0;
            C4385G c4385g = new C4385G(0, 1, null);
            IntRef intRef = (IntRef) n1.f12947a.a();
            if (intRef == null) {
                intRef = new IntRef(0);
                n1.f12947a.b(intRef);
            }
            int element = intRef.getElement();
            Q.b<InterfaceC1504I> bVarC = m1.c();
            int size = bVarC.getSize();
            if (size > 0) {
                InterfaceC1504I[] interfaceC1504IArrT = bVarC.t();
                int i14 = 0;
                while (true) {
                    interfaceC1504IArrT[i14].a(this);
                    int i15 = i14 + 1;
                    if (i15 >= size) {
                        break;
                    }
                    i14 = i15;
                }
            }
            try {
                intRef.b(element + 1);
                Object objH = g.INSTANCE.h(new b(this, intRef, c4385g, element), null, calculation);
                intRef.b(element);
                int size2 = bVarC.getSize();
                if (size2 > 0) {
                    InterfaceC1504I[] interfaceC1504IArrT2 = bVarC.t();
                    do {
                        interfaceC1504IArrT2[i13].b(this);
                        i13++;
                    } while (i13 < size2);
                }
                synchronized (j.I()) {
                    try {
                        companion = g.INSTANCE;
                        g gVarC = companion.c();
                        if (readable.getResult() == a.INSTANCE.a() || (l1VarC = c()) == 0 || !l1VarC.a(objH, readable.getResult())) {
                            aVar = (a) j.O(this.first, this, gVarC);
                            aVar.m(c4385g);
                            aVar.o(aVar.l(this, gVarC));
                            aVar.n(objH);
                        } else {
                            aVar.m(c4385g);
                            aVar.o(aVar.l(this, gVarC));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                IntRef intRef2 = (IntRef) n1.f12947a.a();
                if (intRef2 != null && intRef2.getElement() == 0) {
                    companion.g();
                    synchronized (j.I()) {
                        g gVarC2 = companion.c();
                        aVar.p(gVarC2.getId());
                        aVar.q(gVarC2.getWriteCount());
                        C4153F c4153f = C4153F.f46609a;
                    }
                }
                return aVar;
            } catch (Throwable th2) {
                int size3 = bVarC.getSize();
                if (size3 > 0) {
                    InterfaceC1504I[] interfaceC1504IArrT3 = bVarC.t();
                    do {
                        interfaceC1504IArrT3[i13].b(this);
                        i13++;
                    } while (i13 < size3);
                }
                throw th2;
            }
        }
        if (forceDependencyReads) {
            Q.b<InterfaceC1504I> bVarC2 = m1.c();
            int size4 = bVarC2.getSize();
            if (size4 > 0) {
                InterfaceC1504I[] interfaceC1504IArrT4 = bVarC2.t();
                int i16 = 0;
                do {
                    interfaceC1504IArrT4[i16].a(this);
                    i16++;
                } while (i16 < size4);
            }
            try {
                M<k> mB = readable.b();
                IntRef intRef3 = (IntRef) n1.f12947a.a();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    n1.f12947a.b(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = mB.keys;
                int[] iArr = mB.values;
                long[] jArr = mB.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j10 = jArr[i17];
                        long[] jArr2 = jArr;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            int i20 = 0;
                            while (i20 < i19) {
                                if ((j10 & 255) < 128) {
                                    int i21 = (i17 << 3) + i20;
                                    k kVar = (k) objArr[i21];
                                    intRef3.b(element2 + iArr[i21]);
                                    Ba.l<Object, C4153F> lVarH = snapshot.h();
                                    if (lVarH != null) {
                                        lVarH.invoke(kVar);
                                    }
                                    i11 = 8;
                                } else {
                                    i11 = i18;
                                }
                                j10 >>= i11;
                                i20++;
                                i18 = i11;
                                i12 = 1;
                            }
                            int i22 = i18;
                            i10 = i12;
                            if (i19 != i22) {
                                break;
                            }
                        } else {
                            i10 = i12;
                        }
                        if (i17 == length) {
                            break;
                        }
                        i17 += i10;
                        i12 = i10;
                        jArr = jArr2;
                    }
                }
                intRef3.b(element2);
                C4153F c4153f2 = C4153F.f46609a;
                int size5 = bVarC2.getSize();
                if (size5 > 0) {
                    InterfaceC1504I[] interfaceC1504IArrT5 = bVarC2.t();
                    int i23 = 0;
                    do {
                        interfaceC1504IArrT5[i23].b(this);
                        i23++;
                    } while (i23 < size5);
                }
            } catch (Throwable th3) {
                int size6 = bVarC2.getSize();
                if (size6 > 0) {
                    InterfaceC1504I[] interfaceC1504IArrT6 = bVarC2.t();
                    int i24 = 0;
                    do {
                        interfaceC1504IArrT6[i24].b(this);
                        i24++;
                    } while (i24 < size6);
                }
                throw th3;
            }
        }
        return aVar;
    }

    private final String t() {
        a aVar = (a) j.F(this.first);
        return aVar.k(this, g.INSTANCE.c()) ? String.valueOf(aVar.getResult()) : "<Not calculated>";
    }

    @Override // kotlin.InterfaceC1502H
    public l1<T> c() {
        return this.policy;
    }

    @Override // kotlin.x1
    public T getValue() {
        g.Companion companion = g.INSTANCE;
        Ba.l<Object, C4153F> lVarH = companion.c().h();
        if (lVarH != null) {
            lVarH.invoke(this);
        }
        g gVarC = companion.c();
        return (T) s((a) j.G(this.first, gVarC), gVarC, true, this.calculation).getResult();
    }

    @Override // Z.k
    public void h(n value) {
        C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (a) value;
    }

    @Override // Z.k
    /* renamed from: i */
    public n getFirstStateRecord() {
        return this.first;
    }

    @Override // kotlin.InterfaceC1502H
    public InterfaceC1502H.a<T> o() {
        g gVarC = g.INSTANCE.c();
        return s((a) j.G(this.first, gVarC), gVarC, false, this.calculation);
    }

    public final n r(g snapshot) {
        return s((a) j.G(this.first, snapshot), snapshot, false, this.calculation);
    }

    public String toString() {
        return "DerivedState(value=" + t() + ")@" + hashCode();
    }
}
