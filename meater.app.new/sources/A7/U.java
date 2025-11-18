package A7;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.wearable.L1;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class U extends L1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f992a;

    /* renamed from: b, reason: collision with root package name */
    private final T f993b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractServiceC0867v f994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(AbstractServiceC0867v abstractServiceC0867v, Looper looper) {
        super(looper);
        this.f994c = abstractServiceC0867v;
        this.f993b = new T(abstractServiceC0867v, null);
    }

    private final synchronized void c() {
        try {
            if (this.f992a) {
                return;
            }
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.f994c.f1031B)));
            }
            AbstractServiceC0867v abstractServiceC0867v = this.f994c;
            abstractServiceC0867v.bindService(abstractServiceC0867v.f1034E, this.f993b, 1);
            this.f992a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void d(String str) {
        if (this.f992a) {
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.f994c.f1031B));
            }
            try {
                this.f994c.unbindService(this.f993b);
            } catch (RuntimeException e10) {
                Log.e("WearableLS", "Exception when unbinding from local service", e10);
            }
            this.f992a = false;
        }
    }

    @Override // com.google.android.gms.internal.wearable.L1
    protected final void a(Message message) {
        c();
        try {
            super.a(message);
            if (hasMessages(0)) {
                return;
            }
            d("dispatch");
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                d("dispatch");
            }
            throw th;
        }
    }

    final void b() {
        getLooper().quit();
        d("quit");
    }
}
