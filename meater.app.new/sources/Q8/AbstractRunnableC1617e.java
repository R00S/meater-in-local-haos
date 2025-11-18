package Q8;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable.java */
/* renamed from: Q8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC1617e implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        a();
    }
}
