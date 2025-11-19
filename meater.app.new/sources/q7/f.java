package q7;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes2.dex */
public class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f48118a;

    public f(Looper looper) {
        super(looper);
        this.f48118a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f48118a = Looper.getMainLooper();
    }
}
