package p7;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f47660a;

    public j(Looper looper) {
        super(looper);
        this.f47660a = Looper.getMainLooper();
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f47660a = Looper.getMainLooper();
    }
}
