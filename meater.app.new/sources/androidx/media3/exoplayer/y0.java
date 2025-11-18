package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLockManager.java */
/* loaded from: classes.dex */
final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28027a;

    /* renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f28028b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28029c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28030d;

    public y0(Context context) {
        this.f28027a = context.getApplicationContext();
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f28028b;
        if (wakeLock == null) {
            return;
        }
        if (this.f28029c && this.f28030d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f28028b == null) {
            PowerManager powerManager = (PowerManager) this.f28027a.getSystemService("power");
            if (powerManager == null) {
                X1.n.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f28028b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f28029c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f28030d = z10;
        c();
    }
}
