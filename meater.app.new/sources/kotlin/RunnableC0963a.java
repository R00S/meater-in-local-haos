package kotlin;

import android.view.Choreographer;
import android.view.View;
import kotlin.Metadata;
import kotlin.R0;
import kotlin.jvm.internal.C3854k;

/* compiled from: PrefetchScheduler.android.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0012\u0016B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"LC/a;", "LC/N;", "LO/R0;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Loa/F;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "LC/L;", "prefetchRequest", "a", "(LC/L;)V", "d", "c", "b", "B", "Landroid/view/View;", "LQ/b;", "C", "LQ/b;", "prefetchRequests", "", "D", "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "E", "Landroid/view/Choreographer;", "choreographer", "F", "isActive", "G", "J", "frameStartTimeNanos", "H", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0963a implements N, R0, Runnable, Choreographer.FrameCallback {

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: I, reason: collision with root package name */
    public static final int f2013I = 8;

    /* renamed from: J, reason: collision with root package name */
    private static long f2014J;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchScheduled;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean isActive;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private long frameStartTimeNanos;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Q.b<L> prefetchRequests = new Q.b<>(new L[16], 0);

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer = Choreographer.getInstance();

    /* compiled from: PrefetchScheduler.android.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LC/a$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "b", "(Landroid/view/View;)V", "", "frameIntervalNs", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = kotlin.RunnableC0963a.e()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                kotlin.RunnableC0963a.f(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.RunnableC0963a.Companion.b(android.view.View):void");
        }

        private Companion() {
        }
    }

    /* compiled from: PrefetchScheduler.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LC/a$b;", "LC/M;", "", "nextFrameTimeNs", "<init>", "(J)V", "a", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.a$b */
    public static final class b implements M {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long nextFrameTimeNs;

        public b(long j10) {
            this.nextFrameTimeNs = j10;
        }

        @Override // kotlin.M
        public long a() {
            return Math.max(0L, this.nextFrameTimeNs - System.nanoTime());
        }
    }

    public RunnableC0963a(View view) {
        this.view = view;
        INSTANCE.b(view);
    }

    @Override // kotlin.N
    public void a(L prefetchRequest) {
        this.prefetchRequests.c(prefetchRequest);
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }

    @Override // kotlin.R0
    public void c() {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // kotlin.R0
    public void d() {
        this.isActive = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isActive) {
            this.frameStartTimeNanos = frameTimeNanos;
            this.view.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.x() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        b bVar = new b(this.frameStartTimeNanos + f2014J);
        boolean z10 = false;
        while (this.prefetchRequests.y() && !z10) {
            if (bVar.a() <= 0 || this.prefetchRequests.t()[0].b(bVar)) {
                z10 = true;
            } else {
                this.prefetchRequests.E(0);
            }
        }
        if (z10) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }

    @Override // kotlin.R0
    public void b() {
    }
}
