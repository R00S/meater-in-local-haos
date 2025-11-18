package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.p017o.C0798c;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    C0798c<ListenableWorker.AbstractC0698a> mFuture;

    /* renamed from: androidx.work.Worker$a */
    class RunnableC0699a implements Runnable {
        RunnableC0699a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.mo5193q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.mo5194r(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.AbstractC0698a doWork();

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC8955a<ListenableWorker.AbstractC0698a> startWork() {
        this.mFuture = C0798c.m5203u();
        getBackgroundExecutor().execute(new RunnableC0699a());
        return this.mFuture;
    }
}
