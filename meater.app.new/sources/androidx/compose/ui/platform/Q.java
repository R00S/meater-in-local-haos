package androidx.compose.ui.platform;

import Xb.C1837g;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC1545g0;
import kotlin.Metadata;
import kotlin.collections.C3830k;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import oa.C4165j;
import oa.C4173r;
import oa.InterfaceC4164i;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: AndroidUiDispatcher.android.kt */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/compose/ui/platform/Q;", "LXb/E;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "h1", "()Ljava/lang/Runnable;", "Loa/F;", "n1", "()V", "", "frameTimeNanos", "k1", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "q1", "(Landroid/view/Choreographer$FrameCallback;)V", "s1", "Lta/g;", "context", "block", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "D", "Landroid/view/Choreographer;", "a1", "()Landroid/view/Choreographer;", "E", "Landroid/os/Handler;", "", "F", "Ljava/lang/Object;", "lock", "Lkotlin/collections/k;", "G", "Lkotlin/collections/k;", "toRunTrampolined", "", "H", "Ljava/util/List;", "toRunOnFrame", "I", "spareToRunOnFrame", "", "J", "Z", "scheduledTrampolineDispatch", "K", "scheduledFrameDispatch", "androidx/compose/ui/platform/Q$d", "L", "Landroidx/compose/ui/platform/Q$d;", "dispatchCallback", "LO/g0;", "M", "LO/g0;", "g1", "()LO/g0;", "frameClock", "N", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q extends Xb.E {

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: O, reason: collision with root package name */
    public static final int f22967O = 8;

    /* renamed from: P, reason: collision with root package name */
    private static final InterfaceC4164i<ta.g> f22968P = C4165j.a(a.f22980B);

    /* renamed from: Q, reason: collision with root package name */
    private static final ThreadLocal<ta.g> f22969Q = new b();

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final C3830k<Runnable> toRunTrampolined;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> toRunOnFrame;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledTrampolineDispatch;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledFrameDispatch;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final d dispatchCallback;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1545g0 frameClock;

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lta/g;", "a", "()Lta/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<ta.g> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22980B = new a();

        /* compiled from: AndroidUiDispatcher.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXb/I;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(LXb/I;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.Q$a$a, reason: collision with other inner class name */
        static final class C0324a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super Choreographer>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f22981B;

            C0324a(InterfaceC4588d<? super C0324a> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0324a(interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super Choreographer> interfaceC4588d) {
                return ((C0324a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f22981B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                return Choreographer.getInstance();
            }
        }

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ta.g invoke() {
            Q q10 = new Q(S.b() ? Choreographer.getInstance() : (Choreographer) C1837g.e(Xb.Z.c(), new C0324a(null)), n1.i.a(Looper.getMainLooper()), null);
            return q10.s(q10.getFrameClock());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/Q$b", "Ljava/lang/ThreadLocal;", "Lta/g;", "a", "()Lta/g;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends ThreadLocal<ta.g> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ta.g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            Q q10 = new Q(choreographer, n1.i.a(looperMyLooper), null);
            return q10.s(q10.getFrameClock());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/Q$c;", "", "<init>", "()V", "Lta/g;", "Main$delegate", "Loa/i;", "b", "()Lta/g;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.Q$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final ta.g a() {
            if (S.b()) {
                return b();
            }
            ta.g gVar = (ta.g) Q.f22969Q.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final ta.g b() {
            return (ta.g) Q.f22968P.getValue();
        }

        private Companion() {
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/Q$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Loa/F;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            Q.this.handler.removeCallbacks(this);
            Q.this.n1();
            Q.this.k1(frameTimeNanos);
        }

        @Override // java.lang.Runnable
        public void run() {
            Q.this.n1();
            Object obj = Q.this.lock;
            Q q10 = Q.this;
            synchronized (obj) {
                try {
                    if (q10.toRunOnFrame.isEmpty()) {
                        q10.getChoreographer().removeFrameCallback(this);
                        q10.scheduledFrameDispatch = false;
                    }
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ Q(Choreographer choreographer, Handler handler, C3854k c3854k) {
        this(choreographer, handler);
    }

    private final Runnable h1() {
        Runnable runnableE;
        synchronized (this.lock) {
            runnableE = this.toRunTrampolined.E();
        }
        return runnableE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1() {
        boolean z10;
        do {
            Runnable runnableH1 = h1();
            while (runnableH1 != null) {
                runnableH1.run();
                runnableH1 = h1();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z10 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    /* renamed from: a1, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    /* renamed from: g1, reason: from getter */
    public final InterfaceC1545g0 getFrameClock() {
        return this.frameClock;
    }

    @Override // Xb.E
    public void p0(ta.g context, Runnable block) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(block);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q1(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(callback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s1(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    private Q(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new C3830k<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new d();
        this.frameClock = new T(choreographer, this);
    }
}
