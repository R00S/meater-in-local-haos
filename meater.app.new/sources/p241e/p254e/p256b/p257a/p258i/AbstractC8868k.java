package p241e.p254e.p256b.p257a.p258i;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

/* compiled from: ExecutionModule.java */
/* renamed from: e.e.b.a.i.k */
/* loaded from: classes2.dex */
abstract class AbstractC8868k {
    @Singleton
    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    static Executor m28159a() {
        return new ExecutorC8872o(Executors.newSingleThreadExecutor());
    }
}
