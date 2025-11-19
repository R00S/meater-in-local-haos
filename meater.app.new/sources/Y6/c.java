package Y6;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class c extends Thread {

    /* renamed from: B, reason: collision with root package name */
    private final WeakReference<a> f19446B;

    /* renamed from: C, reason: collision with root package name */
    private final long f19447C;

    /* renamed from: D, reason: collision with root package name */
    final CountDownLatch f19448D = new CountDownLatch(1);

    /* renamed from: E, reason: collision with root package name */
    boolean f19449E = false;

    public c(a aVar, long j10) {
        this.f19446B = new WeakReference<>(aVar);
        this.f19447C = j10;
        start();
    }

    private final void a() {
        a aVar = this.f19446B.get();
        if (aVar != null) {
            aVar.c();
            this.f19449E = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f19448D.await(this.f19447C, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
