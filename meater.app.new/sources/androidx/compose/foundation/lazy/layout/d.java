package androidx.compose.foundation.lazy.layout;

import Ba.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.I;
import kotlin.K;
import kotlin.L;
import kotlin.Metadata;
import kotlin.N;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: LazyLayoutPrefetchState.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0013B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001b\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d;", "", "LC/N;", "prefetchScheduler", "Lkotlin/Function1;", "LC/I;", "Loa/F;", "onNestedPrefetch", "<init>", "(LC/N;LBa/l;)V", "", "index", "LU0/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/d$b;", "e", "(IJ)Landroidx/compose/foundation/lazy/layout/d$b;", "", "LC/L;", "b", "()Ljava/util/List;", "a", "LC/N;", "d", "()LC/N;", "LBa/l;", "LC/K;", "c", "LC/K;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/h;", "Landroidx/compose/foundation/lazy/layout/h;", "()Landroidx/compose/foundation/lazy/layout/h;", "f", "(Landroidx/compose/foundation/lazy/layout/h;)V", "prefetchHandleProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final N prefetchScheduler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<I, C4153F> onNestedPrefetch;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final K prefetchMetrics;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private h prefetchHandleProvider;

    /* compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$a;", "LC/I;", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "", "index", "Loa/F;", "a", "(I)V", "LU0/b;", "constraints", "c", "(IJ)V", "", "LC/L;", "Ljava/util/List;", "_requests", "", "b", "()Ljava/util/List;", "requests", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements I {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<L> _requests = new ArrayList();

        public a() {
        }

        @Override // kotlin.I
        public void a(int index) {
            c(index, e.f22431a);
        }

        public final List<L> b() {
            return this._requests;
        }

        public void c(int index, long constraints) {
            h prefetchHandleProvider = d.this.getPrefetchHandleProvider();
            if (prefetchHandleProvider == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider.c(index, constraints, d.this.prefetchMetrics));
        }
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$b;", "", "Loa/F;", "cancel", "()V", "a", "Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/h$a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void a();

        void cancel();
    }

    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<L> b() {
        l<I, C4153F> lVar = this.onNestedPrefetch;
        if (lVar == null) {
            return r.m();
        }
        a aVar = new a();
        lVar.invoke(aVar);
        return aVar.b();
    }

    /* renamed from: c, reason: from getter */
    public final h getPrefetchHandleProvider() {
        return this.prefetchHandleProvider;
    }

    /* renamed from: d, reason: from getter */
    public final N getPrefetchScheduler() {
        return this.prefetchScheduler;
    }

    public final b e(int index, long constraints) {
        b bVarD;
        h hVar = this.prefetchHandleProvider;
        return (hVar == null || (bVarD = hVar.d(index, constraints, this.prefetchMetrics)) == null) ? androidx.compose.foundation.lazy.layout.a.f22371a : bVarD;
    }

    public final void f(h hVar) {
        this.prefetchHandleProvider = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(N n10, l<? super I, C4153F> lVar) {
        this.prefetchScheduler = n10;
        this.onNestedPrefetch = lVar;
        this.prefetchMetrics = new K();
    }

    public /* synthetic */ d(N n10, l lVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : n10, (i10 & 2) != 0 ? null : lVar);
    }
}
