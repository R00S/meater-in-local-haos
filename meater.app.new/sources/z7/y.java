package z7;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class y implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ z f53844B;

    y(z zVar) {
        this.f53844B = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f53844B.f53846b) {
            try {
                z zVar = this.f53844B;
                if (zVar.f53847c != null) {
                    zVar.f53847c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
