package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory.java */
/* renamed from: androidx.work.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC0702a0 {
    private static final String TAG = AbstractC0807n.m5223f("WorkerFactory");

    /* compiled from: WorkerFactory.java */
    /* renamed from: androidx.work.a0$a */
    class a extends AbstractC0702a0 {
        a() {
        }

        @Override // androidx.work.AbstractC0702a0
        public ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static AbstractC0702a0 getDefaultWorkerFactory() {
        return new a();
    }

    public abstract ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker createWorkerWithDefaultFallback(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker listenableWorkerCreateWorker = createWorker(context, str, workerParameters);
        if (listenableWorkerCreateWorker == null) {
            Class clsAsSubclass = null;
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                AbstractC0807n.m5221c().mo5225b(TAG, "Invalid class: " + str, th);
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerCreateWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AbstractC0807n.m5221c().mo5225b(TAG, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerCreateWorker == null || !listenableWorkerCreateWorker.isUsed()) {
            return listenableWorkerCreateWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
