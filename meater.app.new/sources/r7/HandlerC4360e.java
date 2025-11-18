package r7;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: r7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class HandlerC4360e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f48432a;

    public HandlerC4360e(Looper looper) {
        super(looper);
        this.f48432a = Looper.getMainLooper();
    }

    public HandlerC4360e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f48432a = Looper.getMainLooper();
    }
}
