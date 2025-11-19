package androidx.room;

import android.annotation.SuppressLint;
import androidx.room.q;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: RoomTrackingLiveData.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0017\u00103\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010;\u001a\u0002048\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b.\u00108R\u0011\u0010>\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b1\u0010=¨\u0006?"}, d2 = {"Landroidx/room/C;", "T", "Landroidx/lifecycle/B;", "Landroidx/room/w;", "database", "Landroidx/room/o;", "container", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "", "", "tableNames", "<init>", "(Landroidx/room/w;Landroidx/room/o;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "Loa/F;", "j", "()V", "k", "l", "Landroidx/room/w;", "getDatabase", "()Landroidx/room/w;", "m", "Landroidx/room/o;", "n", "Z", "getInTransaction", "()Z", "o", "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "Landroidx/room/q$c;", "p", "Landroidx/room/q$c;", "getObserver", "()Landroidx/room/q$c;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "q", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "r", "getComputing", "computing", "s", "getRegisteredObserver", "registeredObserver", "Ljava/lang/Runnable;", "t", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "refreshRunnable", "u", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "queryExecutor", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class C<T> extends android.view.B<T> {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final w database;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final o container;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean inTransaction;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Callable<T> computeFunction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final q.c observer;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean invalid;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean computing;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean registeredObserver;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Runnable refreshRunnable;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Runnable invalidationRunnable;

    /* compiled from: RoomTrackingLiveData.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/C$a", "Landroidx/room/q$c;", "", "", "tables", "Loa/F;", "c", "(Ljava/util/Set;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends q.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C<T> f29065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, C<T> c10) {
            super(strArr);
            this.f29065b = c10;
        }

        @Override // androidx.room.q.c
        public void c(Set<String> tables) {
            C3862t.g(tables, "tables");
            o.c.h().b(this.f29065b.getInvalidationRunnable());
        }
    }

    public C(w database, o container, boolean z10, Callable<T> computeFunction, String[] tableNames) {
        C3862t.g(database, "database");
        C3862t.g(container, "container");
        C3862t.g(computeFunction, "computeFunction");
        C3862t.g(tableNames, "tableNames");
        this.database = database;
        this.container = container;
        this.inTransaction = z10;
        this.computeFunction = computeFunction;
        this.observer = new a(tableNames, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.room.A
            @Override // java.lang.Runnable
            public final void run() {
                C.u(this.f29053B);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.room.B
            @Override // java.lang.Runnable
            public final void run() {
                C.t(this.f29054B);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(C this$0) {
        C3862t.g(this$0, "this$0");
        boolean zF = this$0.f();
        if (this$0.invalid.compareAndSet(false, true) && zF) {
            this$0.s().execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(C this$0) {
        boolean z10;
        C3862t.g(this$0, "this$0");
        if (this$0.registeredObserver.compareAndSet(false, true)) {
            this$0.database.getInvalidationTracker().d(this$0.observer);
        }
        do {
            if (this$0.computing.compareAndSet(false, true)) {
                T tCall = null;
                z10 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        try {
                            tCall = this$0.computeFunction.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } finally {
                        this$0.computing.set(false);
                    }
                }
                if (z10) {
                    this$0.l(tCall);
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } while (this$0.invalid.get());
    }

    @Override // android.view.B
    protected void j() {
        super.j();
        o oVar = this.container;
        C3862t.e(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        oVar.b(this);
        s().execute(this.refreshRunnable);
    }

    @Override // android.view.B
    protected void k() {
        super.k();
        o oVar = this.container;
        C3862t.e(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        oVar.c(this);
    }

    /* renamed from: r, reason: from getter */
    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }

    public final Executor s() {
        return this.inTransaction ? this.database.getTransactionExecutor() : this.database.getQueryExecutor();
    }
}
