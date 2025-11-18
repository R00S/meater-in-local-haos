package androidx.compose.foundation.lazy.layout;

import A0.A0;
import A0.z0;
import Ba.l;
import android.os.Trace;
import androidx.compose.foundation.lazy.layout.d;
import java.util.List;
import kotlin.C0976o;
import kotlin.K;
import kotlin.L;
import kotlin.M;
import kotlin.Metadata;
import kotlin.N;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import kotlin.q;
import oa.C4153F;
import y0.k0;

/* compiled from: LazyLayoutPrefetchState.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h;", "", "LC/o;", "itemContentFactory", "Ly0/k0;", "subcomposeLayoutState", "LC/N;", "executor", "<init>", "(LC/o;Ly0/k0;LC/N;)V", "", "index", "LU0/b;", "constraints", "LC/K;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/d$b;", "d", "(IJLC/K;)Landroidx/compose/foundation/lazy/layout/d$b;", "LC/L;", "c", "(IJLC/K;)LC/L;", "a", "LC/o;", "b", "Ly0/k0;", "LC/N;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C0976o itemContentFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k0 subcomposeLayoutState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final N executor;

    /* compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0013\u0010\u001c\u001a\u00020\u000e*\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R \u0010/\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u00102\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u00101R\u0014\u00103\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a;", "Landroidx/compose/foundation/lazy/layout/d$b;", "LC/L;", "", "index", "LU0/b;", "constraints", "LC/K;", "prefetchMetrics", "<init>", "(Landroidx/compose/foundation/lazy/layout/h;IJLC/K;Lkotlin/jvm/internal/k;)V", "LC/M;", "", "average", "", "i", "(LC/M;J)Z", "Loa/F;", "f", "()V", "g", "(J)V", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "Landroidx/compose/foundation/lazy/layout/h;", "h", "()Landroidx/compose/foundation/lazy/layout/h$a$a;", "cancel", "a", "b", "(LC/M;)Z", "", "toString", "()Ljava/lang/String;", "I", "J", "c", "LC/K;", "Ly0/k0$a;", "d", "Ly0/k0$a;", "precomposeHandle", "e", "Z", "isMeasured", "isCanceled", "hasResolvedNestedPrefetches", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "nestedPrefetchController", "isUrgent", "()Z", "isComposed", "isValid", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements d.b, L {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long constraints;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final K prefetchMetrics;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private k0.a precomposeHandle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isMeasured;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean hasResolvedNestedPrefetches;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private C0319a nestedPrefetchController;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isUrgent;

        /* compiled from: LazyLayoutPrefetchState.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a$a;", "", "", "Landroidx/compose/foundation/lazy/layout/d;", "states", "<init>", "(Landroidx/compose/foundation/lazy/layout/h$a;Ljava/util/List;)V", "LC/M;", "", "a", "(LC/M;)Z", "Ljava/util/List;", "", "LC/L;", "b", "[Ljava/util/List;", "requestsByState", "", "c", "I", "stateIndex", "d", "requestIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.lazy.layout.h$a$a, reason: collision with other inner class name */
        private final class C0319a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<d> states;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final List<L>[] requestsByState;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int stateIndex;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int requestIndex;

            public C0319a(List<d> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(M m10) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (a.this.isCanceled) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.stateIndex < this.states.size()) {
                    try {
                        if (this.requestsByState[this.stateIndex] == null) {
                            if (m10.a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List<L>[] listArr = this.requestsByState;
                            int i10 = this.stateIndex;
                            listArr[i10] = this.states.get(i10).b();
                        }
                        List<L> list = this.requestsByState[this.stateIndex];
                        C3862t.d(list);
                        while (this.requestIndex < list.size()) {
                            if (list.get(this.requestIndex).b(m10)) {
                                Trace.endSection();
                                return true;
                            }
                            this.requestIndex++;
                        }
                        this.requestIndex = 0;
                        this.stateIndex++;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                C4153F c4153f = C4153F.f46609a;
                Trace.endSection();
                return false;
            }
        }

        /* compiled from: LazyLayoutPrefetchState.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/A0;", "it", "LA0/z0;", "a", "(LA0/A0;)LA0/z0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends AbstractC3864v implements l<A0, z0> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ O<List<d>> f22466B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O<List<d>> o10) {
                super(1);
                this.f22466B = o10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final z0 invoke(A0 a02) {
                T tS;
                C3862t.e(a02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d dVarJ2 = ((i) a02).getPrefetchState();
                O<List<d>> o10 = this.f22466B;
                List<d> list = o10.f43978B;
                if (list != null) {
                    list.add(dVarJ2);
                    tS = list;
                } else {
                    tS = r.s(dVarJ2);
                }
                o10.f43978B = tS;
                return z0.SkipSubtreeAndContinueTraversal;
            }
        }

        public /* synthetic */ a(h hVar, int i10, long j10, K k10, C3854k c3854k) {
            this(i10, j10, k10);
        }

        private final boolean d() {
            return this.precomposeHandle != null;
        }

        private final boolean e() {
            if (!this.isCanceled) {
                int iA = h.this.itemContentFactory.d().invoke().a();
                int i10 = this.index;
                if (i10 >= 0 && i10 < iA) {
                    return true;
                }
            }
            return false;
        }

        private final void f() {
            if (!e()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            }
            if (this.precomposeHandle != null) {
                throw new IllegalArgumentException("Request was already composed!");
            }
            q qVarInvoke = h.this.itemContentFactory.d().invoke();
            Object objB = qVarInvoke.b(this.index);
            this.precomposeHandle = h.this.subcomposeLayoutState.i(objB, h.this.itemContentFactory.b(this.index, objB, qVarInvoke.d(this.index)));
        }

        private final void g(long constraints) {
            if (this.isCanceled) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                throw new IllegalArgumentException("Request was already measured!");
            }
            this.isMeasured = true;
            k0.a aVar = this.precomposeHandle;
            if (aVar == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            }
            int iB = aVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                aVar.d(i10, constraints);
            }
        }

        private final C0319a h() {
            k0.a aVar = this.precomposeHandle;
            if (aVar == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
            }
            O o10 = new O();
            aVar.a("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new b(o10));
            List list = (List) o10.f43978B;
            if (list != null) {
                return new C0319a(list);
            }
            return null;
        }

        private final boolean i(M m10, long j10) {
            long jA = m10.a();
            return (this.isUrgent && jA > 0) || j10 < jA;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void a() {
            this.isUrgent = true;
        }

        @Override // kotlin.L
        public boolean b(M m10) {
            if (!e()) {
                return false;
            }
            Object objD = h.this.itemContentFactory.d().invoke().d(this.index);
            if (!d()) {
                if (!i(m10, (objD == null || !this.prefetchMetrics.f().a(objD)) ? this.prefetchMetrics.getAverageCompositionTimeNanos() : this.prefetchMetrics.f().c(objD))) {
                    return true;
                }
                K k10 = this.prefetchMetrics;
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    f();
                    C4153F c4153f = C4153F.f46609a;
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (objD != null) {
                        k10.f().p(objD, k10.d(jNanoTime2, k10.f().e(objD, 0L)));
                    }
                    k10.averageCompositionTimeNanos = k10.d(jNanoTime2, k10.getAverageCompositionTimeNanos());
                } finally {
                }
            }
            if (!this.isUrgent) {
                if (!this.hasResolvedNestedPrefetches) {
                    if (m10.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.nestedPrefetchController = h();
                        this.hasResolvedNestedPrefetches = true;
                        C4153F c4153f2 = C4153F.f46609a;
                    } finally {
                    }
                }
                C0319a c0319a = this.nestedPrefetchController;
                if (c0319a != null ? c0319a.a(m10) : false) {
                    return true;
                }
            }
            if (!this.isMeasured && !U0.b.p(this.constraints)) {
                if (!i(m10, (objD == null || !this.prefetchMetrics.h().a(objD)) ? this.prefetchMetrics.getAverageMeasureTimeNanos() : this.prefetchMetrics.h().c(objD))) {
                    return true;
                }
                K k11 = this.prefetchMetrics;
                long jNanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    g(this.constraints);
                    C4153F c4153f3 = C4153F.f46609a;
                    Trace.endSection();
                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                    if (objD != null) {
                        k11.h().p(objD, k11.d(jNanoTime4, k11.h().e(objD, 0L)));
                    }
                    k11.averageMeasureTimeNanos = k11.d(jNanoTime4, k11.getAverageMeasureTimeNanos());
                } finally {
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            k0.a aVar = this.precomposeHandle;
            if (aVar != null) {
                aVar.c();
            }
            this.precomposeHandle = null;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) U0.b.q(this.constraints)) + ", isComposed = " + d() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        private a(int i10, long j10, K k10) {
            this.index = i10;
            this.constraints = j10;
            this.prefetchMetrics = k10;
        }
    }

    public h(C0976o c0976o, k0 k0Var, N n10) {
        this.itemContentFactory = c0976o;
        this.subcomposeLayoutState = k0Var;
        this.executor = n10;
    }

    public final L c(int index, long constraints, K prefetchMetrics) {
        return new a(this, index, constraints, prefetchMetrics, null);
    }

    public final d.b d(int index, long constraints, K prefetchMetrics) {
        a aVar = new a(this, index, constraints, prefetchMetrics, null);
        this.executor.a(aVar);
        return aVar;
    }
}
