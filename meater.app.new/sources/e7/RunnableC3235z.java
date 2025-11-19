package e7;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3235z implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ C3208A f40742B;

    RunnableC3235z(C3208A c3208a) {
        this.f40742B = c3208a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3209B c3209b = this.f40742B.f40589a;
        c3209b.f40591C.c(c3209b.f40591C.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
