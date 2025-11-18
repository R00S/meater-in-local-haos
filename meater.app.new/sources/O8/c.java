package O8;

import N8.g;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes2.dex */
public class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    private final e f13297a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13298b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f13299c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f13301e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f13300d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f13302f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f13297a = eVar;
        this.f13298b = i10;
        this.f13299c = timeUnit;
    }

    @Override // O8.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f13300d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f13301e = new CountDownLatch(1);
                this.f13302f = false;
                this.f13297a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f13301e.await(this.f13298b, this.f13299c)) {
                        this.f13302f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f13301e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O8.b
    public void j(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f13301e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
