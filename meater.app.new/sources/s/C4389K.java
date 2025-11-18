package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4148A;
import oa.C4153F;
import t.C4535d;
import ta.InterfaceC4588d;

/* compiled from: ScatterSet.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00011B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0003H\u0001¢\u0006\u0004\b%\u0010\u0006J\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0004\b(\u0010\fJ\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0000¢\u0006\u0004\b*\u0010\u0006J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Ls/K;", "E", "Ls/V;", "", "initialCapacity", "<init>", "(I)V", "Loa/F;", "s", "capacity", "r", "q", "()V", "element", "o", "(Ljava/lang/Object;)I", "hash1", "p", "(I)I", "", "h", "(Ljava/lang/Object;)Z", "v", "(Ljava/lang/Object;)V", "", "elements", "i", "(Ljava/lang/Iterable;)Z", "j", "(Ls/V;)Z", "u", "(Ljava/lang/Iterable;)V", "w", "(Ls/V;)V", "x", "t", "index", "y", "m", "k", "n", "newCapacity", "z", "", "l", "()Ljava/util/Set;", "e", "I", "growthLimit", "a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4389K<E> extends V<E> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    /* compiled from: ScatterSet.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Ls/K$a;", "Ls/V$a;", "Ls/V;", "", "<init>", "(Ls/K;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Loa/F;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s.K$a */
    private final class a extends V<E>.a implements Set<E>, Ca.f {

        /* compiled from: ScatterSet.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"s/K$a$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Loa/F;", "remove", "()V", "", "B", "I", "getCurrent", "()I", "b", "(I)V", "current", "", "C", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: s.K$a$a, reason: collision with other inner class name */
        public static final class C0683a implements Iterator<E>, Ca.a {

            /* renamed from: B, reason: collision with root package name and from kotlin metadata */
            private int current = -1;

            /* renamed from: C, reason: collision with root package name and from kotlin metadata */
            private final Iterator<E> iterator;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C4389K<E> f48623D;

            /* compiled from: ScatterSet.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1057}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "LTb/j;", "Loa/F;", "<anonymous>", "(LTb/j;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: s.K$a$a$a, reason: collision with other inner class name */
            static final class C0684a extends kotlin.coroutines.jvm.internal.k implements Ba.p<Tb.j<? super E>, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: C, reason: collision with root package name */
                Object f48624C;

                /* renamed from: D, reason: collision with root package name */
                Object f48625D;

                /* renamed from: E, reason: collision with root package name */
                Object f48626E;

                /* renamed from: F, reason: collision with root package name */
                int f48627F;

                /* renamed from: G, reason: collision with root package name */
                int f48628G;

                /* renamed from: H, reason: collision with root package name */
                int f48629H;

                /* renamed from: I, reason: collision with root package name */
                int f48630I;

                /* renamed from: J, reason: collision with root package name */
                long f48631J;

                /* renamed from: K, reason: collision with root package name */
                int f48632K;

                /* renamed from: L, reason: collision with root package name */
                private /* synthetic */ Object f48633L;

                /* renamed from: M, reason: collision with root package name */
                final /* synthetic */ C4389K<E> f48634M;

                /* renamed from: N, reason: collision with root package name */
                final /* synthetic */ C0683a f48635N;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0684a(C4389K c4389k, C0683a c0683a, InterfaceC4588d interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f48634M = c4389k;
                    this.f48635N = c0683a;
                }

                @Override // Ba.p
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Tb.j<? super E> jVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0684a) create(jVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    C0684a c0684a = new C0684a(this.f48634M, this.f48635N, interfaceC4588d);
                    c0684a.f48633L = obj;
                    return c0684a;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x00ad). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:20:0x009f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009c -> B:20:0x009f). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                    /*
                        r22 = this;
                        r0 = r22
                        java.lang.Object r1 = ua.C4696b.e()
                        int r2 = r0.f48632K
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L36
                        if (r2 != r5) goto L2e
                        int r2 = r0.f48630I
                        int r6 = r0.f48629H
                        long r7 = r0.f48631J
                        int r9 = r0.f48628G
                        int r10 = r0.f48627F
                        java.lang.Object r11 = r0.f48626E
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f48625D
                        s.K r12 = (s.C4389K) r12
                        java.lang.Object r13 = r0.f48624C
                        s.K$a$a r13 = (s.C4389K.a.C0683a) r13
                        java.lang.Object r14 = r0.f48633L
                        Tb.j r14 = (Tb.j) r14
                        oa.C4173r.b(r23)
                        goto L9f
                    L2e:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L36:
                        oa.C4173r.b(r23)
                        java.lang.Object r2 = r0.f48633L
                        Tb.j r2 = (Tb.j) r2
                        s.K<E> r6 = r0.f48634M
                        s.K$a$a r7 = r0.f48635N
                        long[] r8 = r6.metadata
                        int r9 = r8.length
                        int r9 = r9 + (-2)
                        if (r9 < 0) goto Lb2
                        r10 = 0
                    L49:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto Lad
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                        r21 = r10
                        r10 = r9
                        r9 = r21
                    L6f:
                        if (r2 >= r6) goto La2
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.32E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L9f
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.b(r15)
                        java.lang.Object[] r3 = r12.elements
                        r3 = r3[r15]
                        r0.f48633L = r14
                        r0.f48624C = r13
                        r0.f48625D = r12
                        r0.f48626E = r11
                        r0.f48627F = r10
                        r0.f48628G = r9
                        r0.f48631J = r7
                        r0.f48629H = r6
                        r0.f48630I = r2
                        r0.f48632K = r5
                        java.lang.Object r3 = r14.b(r3, r0)
                        if (r3 != r1) goto L9f
                        return r1
                    L9f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L6f
                    La2:
                        if (r6 != r4) goto Lb2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                        r19 = r10
                        r10 = r9
                        r9 = r19
                    Lad:
                        if (r10 == r9) goto Lb2
                        int r10 = r10 + 1
                        goto L49
                    Lb2:
                        oa.F r1 = oa.C4153F.f46609a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: s.C4389K.a.C0683a.C0684a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0683a(C4389K<E> c4389k) {
                this.f48623D = c4389k;
                this.iterator = Tb.k.a(new C0684a(c4389k, this, null));
            }

            public final void b(int i10) {
                this.current = i10;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i10 = this.current;
                if (i10 != -1) {
                    this.f48623D.y(i10);
                    this.current = -1;
                }
            }
        }

        public a() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E element) {
            return C4389K.this.h(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> elements) {
            C3862t.g(elements, "elements");
            return C4389K.this.i(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C4389K.this.m();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return new C0683a(C4389K.this);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object element) {
            return C4389K.this.x(element);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            C3862t.g(elements, "elements");
            int iC = C4389K.this.get_size();
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                C4389K.this.t(it.next());
            }
            return iC != C4389K.this.get_size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            C3862t.g(elements, "elements");
            C4389K<E> c4389k = C4389K.this;
            long[] jArr = c4389k.metadata;
            int length = jArr.length - 2;
            boolean z10 = false;
            if (length >= 0) {
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                if (!elements.contains(c4389k.elements[i13])) {
                                    c4389k.y(i13);
                                    z11 = true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return z11;
                        }
                    }
                    if (i10 == length) {
                        z10 = z11;
                        break;
                    }
                    i10++;
                }
            }
            return z10;
        }
    }

    public C4389K() {
        this(0, 1, null);
    }

    private final int o(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (C3862t.b(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iP = p(i11);
                if (this.growthLimit == 0 && ((this.metadata[iP >> 3] >> ((iP & 7) << 3)) & 255) != 254) {
                    k();
                    iP = p(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iP >> 3;
                long j14 = jArr2[i20];
                int i21 = (iP & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iP - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iP;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int p(int hash1) {
        int i10 = this._capacity;
        int i11 = hash1 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final void q() {
        this.growthLimit = U.c(get_capacity()) - this._size;
    }

    private final void r(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = U.f48663a;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            C3831l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i10 = capacity >> 3;
        long j10 = 255 << ((capacity & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        q();
    }

    private final void s(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, U.f(initialCapacity)) : 0;
        this._capacity = iMax;
        r(iMax);
        this.elements = new Object[iMax];
    }

    public final boolean h(E element) {
        int iC = get_size();
        this.elements[o(element)] = element;
        return get_size() != iC;
    }

    public final boolean i(Iterable<? extends E> elements) {
        C3862t.g(elements, "elements");
        int iC = get_size();
        u(elements);
        return iC != get_size();
    }

    public final boolean j(V<E> elements) {
        C3862t.g(elements, "elements");
        int iC = get_size();
        w(elements);
        return iC != get_size();
    }

    public final void k() {
        if (this._capacity <= 8 || Long.compareUnsigned(C4148A.j(C4148A.j(this._size) * 32), C4148A.j(C4148A.j(this._capacity) * 25)) > 0) {
            z(U.e(this._capacity));
        } else {
            n();
        }
    }

    public final Set<E> l() {
        return new a();
    }

    public final void m() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != U.f48663a) {
            C3831l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C3831l.u(this.elements, null, 0, this._capacity);
        q();
    }

    public final void n() {
        int i10;
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        Object[] objArr = this.elements;
        U.a(jArr, i11);
        int i12 = 0;
        int i13 = 0;
        int iB = -1;
        while (i13 != i11) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j10 = (jArr[i14] >> i15) & 255;
            if (j10 == 128) {
                iB = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr[i13];
                    int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                    int i16 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                    int iP = p(i16);
                    int i17 = i16 & i11;
                    if (((iP - i17) & i11) / 8 == ((i13 - i17) & i11) / 8) {
                        jArr[i14] = ((r9 & 127) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[C3831l.b0(jArr)] = (jArr[i12] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iP >> 3;
                        long j11 = jArr[i18];
                        int i19 = (iP & 7) << 3;
                        if (((j11 >> i19) & 255) == 128) {
                            int i20 = i13;
                            jArr[i18] = ((r9 & 127) << i19) | (j11 & (~(255 << i19)));
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            objArr[iP] = objArr[i20];
                            objArr[i20] = null;
                            i10 = i20;
                            iB = i10;
                        } else {
                            int i21 = i13;
                            jArr[i18] = ((r9 & 127) << i19) | (j11 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = U.b(jArr, i21 + 1, i11);
                            }
                            objArr[iB] = objArr[iP];
                            objArr[iP] = objArr[i21];
                            objArr[i21] = objArr[iB];
                            i10 = i21 - 1;
                        }
                        jArr[C3831l.b0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i12 = 0;
                    }
                }
                i13++;
            }
        }
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.C3862t.b(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.y(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C4389K.t(java.lang.Object):void");
    }

    public final void u(Iterable<? extends E> elements) {
        C3862t.g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public final void v(E element) {
        this.elements[o(element)] = element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(V<E> elements) {
        C3862t.g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        v(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.C3862t.b(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.y(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C4389K.x(java.lang.Object):boolean");
    }

    public final void y(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.elements[index] = null;
    }

    public final void z(int newCapacity) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i10 = this._capacity;
        s(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i11 = this._capacity;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i13 = iHashCode ^ (iHashCode << 16);
                int iP = p(i13 >>> 7);
                long j10 = i13 & 127;
                int i14 = iP >> 3;
                int i15 = (iP & 7) << 3;
                long j11 = (jArr2[i14] & (~(255 << i15))) | (j10 << i15);
                jArr2[i14] = j11;
                jArr2[(((iP - 7) & i11) + (i11 & 7)) >> 3] = j11;
                objArr2[iP] = obj;
            }
        }
    }

    public C4389K(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            C4535d.a("Capacity must be a positive value.");
        }
        s(U.g(i10));
    }

    public /* synthetic */ C4389K(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
