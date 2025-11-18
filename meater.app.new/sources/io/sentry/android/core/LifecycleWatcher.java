package io.sentry.android.core;

import androidx.lifecycle.C0504c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0515k;
import io.sentry.C9422d5;
import io.sentry.C9586s3;
import io.sentry.C9657v0;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9593t3;
import io.sentry.InterfaceC9658v1;
import io.sentry.android.core.internal.util.C9312i;
import io.sentry.transport.C9611o;
import io.sentry.transport.InterfaceC9613q;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {

    /* renamed from: a */
    private final AtomicLong f35798a;

    /* renamed from: b */
    private final long f35799b;

    /* renamed from: c */
    private TimerTask f35800c;

    /* renamed from: d */
    private final Timer f35801d;

    /* renamed from: e */
    private final Object f35802e;

    /* renamed from: f */
    private final InterfaceC9658v1 f35803f;

    /* renamed from: g */
    private final boolean f35804g;

    /* renamed from: h */
    private final boolean f35805h;

    /* renamed from: i */
    private final InterfaceC9613q f35806i;

    /* renamed from: io.sentry.android.core.LifecycleWatcher$a */
    class C9254a extends TimerTask {
        C9254a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LifecycleWatcher.this.m30125e("end");
            LifecycleWatcher.this.f35803f.endSession();
        }
    }

    LifecycleWatcher(InterfaceC9658v1 interfaceC9658v1, long j2, boolean z, boolean z2) {
        this(interfaceC9658v1, j2, z, z2, C9611o.m31694b());
    }

    /* renamed from: d */
    private void m30124d(String str) {
        if (this.f35805h) {
            C9657v0 c9657v0 = new C9657v0();
            c9657v0.m31844p("navigation");
            c9657v0.m31841m("state", str);
            c9657v0.m31840l("app.lifecycle");
            c9657v0.m31842n(EnumC9587s4.INFO);
            this.f35803f.mo31148i(c9657v0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m30125e(String str) {
        this.f35803f.mo31148i(C9312i.m30278a(str));
    }

    /* renamed from: f */
    private void m30126f() {
        synchronized (this.f35802e) {
            TimerTask timerTask = this.f35800c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f35800c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30130h(C9586s3 c9586s3) {
        C9422d5 c9422d5M31605r;
        if (this.f35798a.get() != 0 || (c9422d5M31605r = c9586s3.m31605r()) == null || c9422d5M31605r.m30747k() == null) {
            return;
        }
        this.f35798a.set(c9422d5M31605r.m30747k().getTime());
    }

    /* renamed from: i */
    private void m30128i() {
        synchronized (this.f35802e) {
            m30126f();
            if (this.f35801d != null) {
                C9254a c9254a = new C9254a();
                this.f35800c = c9254a;
                this.f35801d.schedule(c9254a, this.f35799b);
            }
        }
    }

    /* renamed from: j */
    private void m30129j() {
        if (this.f35804g) {
            m30126f();
            long jMo30147a = this.f35806i.mo30147a();
            this.f35803f.mo31154o(new InterfaceC9593t3() { // from class: io.sentry.android.core.z
                @Override // io.sentry.InterfaceC9593t3
                /* renamed from: a */
                public final void mo30217a(C9586s3 c9586s3) {
                    this.f36138a.m30130h(c9586s3);
                }
            });
            long j2 = this.f35798a.get();
            if (j2 == 0 || j2 + this.f35799b <= jMo30147a) {
                m30125e("start");
                this.f35803f.startSession();
            }
            this.f35798a.set(jMo30147a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC0508e
    public /* synthetic */ void onCreate(InterfaceC0515k interfaceC0515k) {
        C0504c.m3853a(this, interfaceC0515k);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC0508e
    public /* synthetic */ void onDestroy(InterfaceC0515k interfaceC0515k) {
        C0504c.m3854b(this, interfaceC0515k);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC0508e
    public /* synthetic */ void onPause(InterfaceC0515k interfaceC0515k) {
        C0504c.m3855c(this, interfaceC0515k);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC0508e
    public /* synthetic */ void onResume(InterfaceC0515k interfaceC0515k) {
        C0504c.m3856d(this, interfaceC0515k);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC0508e
    public void onStart(InterfaceC0515k interfaceC0515k) {
        m30129j();
        m30124d("foreground");
        C9342r0.m30399a().m30401c(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC0508e
    public void onStop(InterfaceC0515k interfaceC0515k) {
        if (this.f35804g) {
            this.f35798a.set(this.f35806i.mo30147a());
            m30128i();
        }
        C9342r0.m30399a().m30401c(true);
        m30124d("background");
    }

    LifecycleWatcher(InterfaceC9658v1 interfaceC9658v1, long j2, boolean z, boolean z2, InterfaceC9613q interfaceC9613q) {
        this.f35798a = new AtomicLong(0L);
        this.f35802e = new Object();
        this.f35799b = j2;
        this.f35804g = z;
        this.f35805h = z2;
        this.f35803f = interfaceC9658v1;
        this.f35806i = interfaceC9613q;
        if (z) {
            this.f35801d = new Timer(true);
        } else {
            this.f35801d = null;
        }
    }
}
