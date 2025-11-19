package e8;

import z7.C5209k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC3254q implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final C5209k f40775B;

    AbstractRunnableC3254q() {
        this.f40775B = null;
    }

    protected abstract void a();

    final C5209k b() {
        return this.f40775B;
    }

    public final void c(Exception exc) {
        C5209k c5209k = this.f40775B;
        if (c5209k != null) {
            c5209k.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public AbstractRunnableC3254q(C5209k c5209k) {
        this.f40775B = c5209k;
    }
}
