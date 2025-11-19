package k7;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3804b implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f43820B;

    public RunnableC3804b(Runnable runnable, int i10) {
        this.f43820B = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f43820B.run();
    }
}
