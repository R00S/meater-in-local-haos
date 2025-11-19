package M6;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule.java */
/* loaded from: classes2.dex */
abstract class j {
    @SuppressLint({"ThreadPoolCreation"})
    static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
