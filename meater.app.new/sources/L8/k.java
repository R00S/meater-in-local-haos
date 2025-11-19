package L8;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: UiExecutor.java */
/* loaded from: classes2.dex */
public enum k implements Executor {
    INSTANCE;


    /* renamed from: C, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler f11061C = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f11061C.post(runnable);
    }
}
