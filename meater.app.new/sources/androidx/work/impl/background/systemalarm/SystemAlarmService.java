package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.ServiceC0518n;
import androidx.work.AbstractC0807n;
import androidx.work.impl.background.systemalarm.C0721e;
import androidx.work.impl.utils.C0791j;

/* loaded from: classes.dex */
public class SystemAlarmService extends ServiceC0518n implements C0721e.c {

    /* renamed from: g */
    private static final String f4543g = AbstractC0807n.m5223f("SystemAlarmService");

    /* renamed from: h */
    private C0721e f4544h;

    /* renamed from: i */
    private boolean f4545i;

    /* renamed from: e */
    private void m4872e() {
        C0721e c0721e = new C0721e(this);
        this.f4544h = c0721e;
        c0721e.m4911m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.C0721e.c
    /* renamed from: a */
    public void mo4873a() {
        this.f4545i = true;
        AbstractC0807n.m5221c().mo5224a(f4543g, "All commands completed in dispatcher", new Throwable[0]);
        C0791j.m5170a();
        stopSelf();
    }

    @Override // androidx.lifecycle.ServiceC0518n, android.app.Service
    public void onCreate() {
        super.onCreate();
        m4872e();
        this.f4545i = false;
    }

    @Override // androidx.lifecycle.ServiceC0518n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4545i = true;
        this.f4544h.m4909j();
    }

    @Override // androidx.lifecycle.ServiceC0518n, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f4545i) {
            AbstractC0807n.m5221c().mo5226d(f4543g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f4544h.m4909j();
            m4872e();
            this.f4545i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4544h.m4903a(intent, i3);
        return 3;
    }
}
