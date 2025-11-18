package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.g;
import java.util.Set;
import kotlin.C1489A0;
import kotlin.C1533c;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import s.C4389K;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 /2\u00020\u0001:\u0001\"B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0000H ¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0000H ¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H ¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH ¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001d\u0010\nJ\u000f\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001f\u0010\nJ\u000f\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,R\"\u00103\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010)\u0012\u0004\b4\u0010\nR$\u00109\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b7\u0010!\"\u0004\b8\u0010,R\u0014\u0010;\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u00100R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X¡\u0004¢\u0006\f\u0012\u0004\b>\u0010\n\u001a\u0004\b<\u0010=R\"\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b?\u0010=\u0082\u0001\u0004ABCD¨\u0006E"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/i;)V", "Loa/F;", "d", "()V", "Lkotlin/Function1;", "readObserver", "x", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "l", "()Landroidx/compose/runtime/snapshots/g;", "snapshot", "s", "(Landroidx/compose/runtime/snapshots/g;)V", "m", "n", "LZ/k;", "state", "p", "(LZ/k;)V", "o", "b", "c", "r", "z", "q", "y", "()I", "a", "Landroidx/compose/runtime/snapshots/i;", "g", "()Landroidx/compose/runtime/snapshots/i;", "v", "(Landroidx/compose/runtime/snapshots/i;)V", "<set-?>", "I", "f", "u", "(I)V", "", "Z", "e", "()Z", "t", "(Z)V", "disposed", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "value", "j", "w", "writeCount", "i", "readOnly", "h", "()LBa/l;", "getReadObserver$annotations", "k", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/d;", "Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/q;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f22591f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private i invalid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinningTrackingHandle;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u001c2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001c2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u0003R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010$¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/g$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Loa/F;", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "p", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "o", "(LBa/l;LBa/l;)Landroidx/compose/runtime/snapshots/b;", "T", "Lkotlin/Function0;", "block", "h", "(LBa/l;LBa/l;LBa/a;)Ljava/lang/Object;", "previous", "f", "(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;", "nonObservable", "observer", "m", "(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;LBa/l;)V", "Lkotlin/Function2;", "", "LZ/b;", "i", "(LBa/p;)LZ/b;", "k", "(LBa/l;)LZ/b;", "g", "n", "c", "()Landroidx/compose/runtime/snapshots/g;", "current", "", "e", "()Z", "isInSnapshot", "d", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(Ba.p pVar) {
            synchronized (j.I()) {
                j.f22617h = r.C0(j.f22617h, pVar);
                C4153F c4153f = C4153F.f46609a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(Ba.l lVar) {
            synchronized (j.I()) {
                j.f22618i = r.C0(j.f22618i, lVar);
                C4153F c4153f = C4153F.f46609a;
            }
            j.B();
        }

        public final g c() {
            return j.H();
        }

        public final g d() {
            return (g) j.f22611b.a();
        }

        public final boolean e() {
            return j.f22611b.a() != null;
        }

        public final g f(g previous) {
            if (previous instanceof p) {
                p pVar = (p) previous;
                if (pVar.getThreadId() == C1533c.a()) {
                    pVar.X(null);
                    return previous;
                }
            }
            if (previous instanceof q) {
                q qVar = (q) previous;
                if (qVar.C() == C1533c.a()) {
                    qVar.F(null);
                    return previous;
                }
            }
            g gVarE = j.E(previous, null, false, 6, null);
            gVarE.l();
            return gVarE;
        }

        public final void g() {
            j.H().o();
        }

        public final <T> T h(Ba.l<Object, C4153F> readObserver, Ba.l<Object, C4153F> writeObserver, Ba.a<? extends T> block) {
            g pVar;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            g gVar = (g) j.f22611b.a();
            if (gVar instanceof p) {
                p pVar2 = (p) gVar;
                if (pVar2.getThreadId() == C1533c.a()) {
                    Ba.l<Object, C4153F> lVarH = pVar2.h();
                    Ba.l<Object, C4153F> lVarK = pVar2.k();
                    try {
                        ((p) gVar).X(j.L(readObserver, lVarH, false, 4, null));
                        ((p) gVar).Y(j.M(writeObserver, lVarK));
                        return block.invoke();
                    } finally {
                        pVar2.X(lVarH);
                        pVar2.Y(lVarK);
                    }
                }
            }
            if (gVar == null || (gVar instanceof b)) {
                pVar = new p(gVar instanceof b ? (b) gVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                pVar = gVar.x(readObserver);
            }
            try {
                g gVarL = pVar.l();
                try {
                    return block.invoke();
                } finally {
                    pVar.s(gVarL);
                }
            } finally {
                pVar.d();
            }
        }

        public final Z.b i(final Ba.p<? super Set<? extends Object>, ? super g, C4153F> observer) {
            j.A(j.f22610a);
            synchronized (j.I()) {
                j.f22617h = r.G0(j.f22617h, observer);
                C4153F c4153f = C4153F.f46609a;
            }
            return new Z.b() { // from class: Z.c
                @Override // Z.b
                public final void c() {
                    g.Companion.j(observer);
                }
            };
        }

        public final Z.b k(final Ba.l<Object, C4153F> observer) {
            synchronized (j.I()) {
                j.f22618i = r.G0(j.f22618i, observer);
                C4153F c4153f = C4153F.f46609a;
            }
            j.B();
            return new Z.b() { // from class: Z.d
                @Override // Z.b
                public final void c() {
                    g.Companion.l(observer);
                }
            };
        }

        public final void m(g previous, g nonObservable, Ba.l<Object, C4153F> observer) {
            if (previous != nonObservable) {
                nonObservable.s(previous);
                nonObservable.d();
            } else if (previous instanceof p) {
                ((p) previous).X(observer);
            } else {
                if (previous instanceof q) {
                    ((q) previous).F(observer);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final void n() {
            boolean z10;
            synchronized (j.I()) {
                C4389K<Z.k> c4389kE = ((a) j.f22619j.get()).E();
                z10 = false;
                if (c4389kE != null) {
                    if (c4389kE.e()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                j.B();
            }
        }

        public final b o(Ba.l<Object, C4153F> readObserver, Ba.l<Object, C4153F> writeObserver) {
            b bVarQ;
            g gVarH = j.H();
            b bVar = gVarH instanceof b ? (b) gVarH : null;
            if (bVar == null || (bVarQ = bVar.Q(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return bVarQ;
        }

        public final g p(Ba.l<Object, C4153F> readObserver) {
            return j.H().x(readObserver);
        }

        private Companion() {
        }
    }

    public /* synthetic */ g(int i10, i iVar, C3854k c3854k) {
        this(i10, iVar);
    }

    public final void b() {
        synchronized (j.I()) {
            c();
            r();
            C4153F c4153f = C4153F.f46609a;
        }
    }

    public void c() {
        j.f22613d = j.f22613d.y(getId());
    }

    public void d() {
        this.disposed = true;
        synchronized (j.I()) {
            q();
            C4153F c4153f = C4153F.f46609a;
        }
    }

    /* renamed from: e, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    /* renamed from: f, reason: from getter */
    public int getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public i getInvalid() {
        return this.invalid;
    }

    public abstract Ba.l<Object, C4153F> h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract Ba.l<Object, C4153F> k();

    public g l() {
        g gVar = (g) j.f22611b.a();
        j.f22611b.b(this);
        return gVar;
    }

    public abstract void m(g snapshot);

    public abstract void n(g snapshot);

    public abstract void o();

    public abstract void p(Z.k state);

    public final void q() {
        int i10 = this.pinningTrackingHandle;
        if (i10 >= 0) {
            j.Y(i10);
            this.pinningTrackingHandle = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(g snapshot) {
        j.f22611b.b(snapshot);
    }

    public final void t(boolean z10) {
        this.disposed = z10;
    }

    public void u(int i10) {
        this.id = i10;
    }

    public void v(i iVar) {
        this.invalid = iVar;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g x(Ba.l<Object, C4153F> readObserver);

    public final int y() {
        int i10 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i10;
    }

    public final void z() {
        if (this.disposed) {
            C1489A0.a("Cannot use a disposed snapshot");
        }
    }

    private g(int i10, i iVar) {
        this.invalid = iVar;
        this.id = i10;
        this.pinningTrackingHandle = i10 != 0 ? j.c0(i10, getInvalid()) : -1;
    }
}
