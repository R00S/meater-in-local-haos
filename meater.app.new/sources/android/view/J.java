package android.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.AbstractC2106m;
import android.view.L;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ProcessLifecycleOwner.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002/0B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/lifecycle/J;", "Landroidx/lifecycle/v;", "<init>", "()V", "Loa/F;", "g", "f", "e", "h", "k", "l", "Landroid/content/Context;", "context", "i", "(Landroid/content/Context;)V", "", "B", "I", "startedCounter", "C", "resumedCounter", "", "D", "Z", "pauseSent", "E", "stopSent", "Landroid/os/Handler;", "F", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/x;", "G", "Landroidx/lifecycle/x;", "registry", "Ljava/lang/Runnable;", "H", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/L$a;", "Landroidx/lifecycle/L$a;", "initializationListener", "Landroidx/lifecycle/m;", "getLifecycle", "()Landroidx/lifecycle/m;", "lifecycle", "J", "a", "b", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J implements InterfaceC2114v {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: K, reason: collision with root package name */
    private static final J f25875K = new J();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int startedCounter;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int resumedCounter;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean pauseSent = true;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean stopSent = true;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final C2116x registry = new C2116x(this);

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.I
        @Override // java.lang.Runnable
        public final void run() {
            J.j(this.f25873B);
        }
    };

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final L.a initializationListener = new d();

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/J$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "Loa/F;", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25884a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            C3862t.g(activity, "activity");
            C3862t.g(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/J$b;", "", "<init>", "()V", "Landroidx/lifecycle/v;", "a", "()Landroidx/lifecycle/v;", "Landroid/content/Context;", "context", "Loa/F;", "b", "(Landroid/content/Context;)V", "Landroidx/lifecycle/J;", "newInstance", "Landroidx/lifecycle/J;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.J$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final InterfaceC2114v a() {
            return J.f25875K;
        }

        public final void b(Context context) {
            C3862t.g(context, "context");
            J.f25875K.i(context);
        }

        private Companion() {
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/J$c", "Landroidx/lifecycle/i;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Loa/F;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends C2102i {

        /* compiled from: ProcessLifecycleOwner.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/J$c$a", "Landroidx/lifecycle/i;", "Landroid/app/Activity;", "activity", "Loa/F;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends C2102i {
            final /* synthetic */ J this$0;

            a(J j10) {
                this.this$0 = j10;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C3862t.g(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C3862t.g(activity, "activity");
                this.this$0.g();
            }
        }

        c() {
        }

        @Override // android.view.C2102i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            C3862t.g(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                L.INSTANCE.b(activity).e(J.this.initializationListener);
            }
        }

        @Override // android.view.C2102i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C3862t.g(activity, "activity");
            J.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            C3862t.g(activity, "activity");
            a.a(activity, new a(J.this));
        }

        @Override // android.view.C2102i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C3862t.g(activity, "activity");
            J.this.h();
        }
    }

    private J() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(J this$0) {
        C3862t.g(this$0, "this$0");
        this$0.k();
        this$0.l();
    }

    public static final InterfaceC2114v m() {
        return INSTANCE.a();
    }

    public final void e() {
        int i10 = this.resumedCounter - 1;
        this.resumedCounter = i10;
        if (i10 == 0) {
            Handler handler = this.handler;
            C3862t.d(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void f() {
        int i10 = this.resumedCounter + 1;
        this.resumedCounter = i10;
        if (i10 == 1) {
            if (this.pauseSent) {
                this.registry.i(AbstractC2106m.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                C3862t.d(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void g() {
        int i10 = this.startedCounter + 1;
        this.startedCounter = i10;
        if (i10 == 1 && this.stopSent) {
            this.registry.i(AbstractC2106m.a.ON_START);
            this.stopSent = false;
        }
    }

    @Override // android.view.InterfaceC2114v
    public AbstractC2106m getLifecycle() {
        return this.registry;
    }

    public final void h() {
        this.startedCounter--;
        l();
    }

    public final void i(Context context) {
        C3862t.g(context, "context");
        this.handler = new Handler();
        this.registry.i(AbstractC2106m.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C3862t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.i(AbstractC2106m.a.ON_PAUSE);
        }
    }

    public final void l() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.i(AbstractC2106m.a.ON_STOP);
            this.stopSent = true;
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"androidx/lifecycle/J$d", "Landroidx/lifecycle/L$a;", "Loa/F;", "a", "()V", "b", "c", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements L.a {
        d() {
        }

        @Override // androidx.lifecycle.L.a
        public void b() {
            J.this.g();
        }

        @Override // androidx.lifecycle.L.a
        public void c() {
            J.this.f();
        }

        @Override // androidx.lifecycle.L.a
        public void a() {
        }
    }
}
