package z7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import t7.HandlerC4574a;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class M implements Executor {

    /* renamed from: B, reason: collision with root package name */
    private final Handler f53809B = new HandlerC4574a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f53809B.post(runnable);
    }
}
