package j8;

import z7.C5209k;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
public abstract class j implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final C5209k f43541B;

    j() {
        this.f43541B = null;
    }

    protected abstract void a();

    final C5209k b() {
        return this.f43541B;
    }

    public final void c(Exception exc) {
        C5209k c5209k = this.f43541B;
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

    public j(C5209k c5209k) {
        this.f43541B = c5209k;
    }
}
