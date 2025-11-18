package d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: FullyDrawnReporter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000e\u0010#¨\u0006%"}, d2 = {"Ld/D;", "", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "Loa/F;", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;LBa/a;)V", "b", "()V", "a", "Ljava/util/concurrent/Executor;", "LBa/a;", "c", "Ljava/lang/Object;", "lock", "", "d", "I", "reporterCount", "", "e", "Z", "reportPosted", "f", "reportedFullyDrawn", "", "g", "Ljava/util/List;", "onReportCallbacks", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "reportRunnable", "()Z", "isFullyDrawnReported", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2992D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> reportFullyDrawn;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int reporterCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean reportPosted;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean reportedFullyDrawn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Ba.a<C4153F>> onReportCallbacks;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Runnable reportRunnable;

    public C2992D(Executor executor, Ba.a<C4153F> reportFullyDrawn) {
        C3862t.g(executor, "executor");
        C3862t.g(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: d.C
            @Override // java.lang.Runnable
            public final void run() {
                C2992D.d(this.f39507B);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2992D this$0) {
        C3862t.g(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                this$0.reportPosted = false;
                if (this$0.reporterCount == 0 && !this$0.reportedFullyDrawn) {
                    this$0.reportFullyDrawn.invoke();
                    this$0.b();
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((Ba.a) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.reportedFullyDrawn;
        }
        return z10;
    }
}
