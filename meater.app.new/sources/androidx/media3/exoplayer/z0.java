package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: WifiLockManager.java */
/* loaded from: classes.dex */
final class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28032a;

    /* renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f28033b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28034c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28035d;

    public z0(Context context) {
        this.f28032a = context.getApplicationContext();
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f28033b;
        if (wifiLock == null) {
            return;
        }
        if (this.f28034c && this.f28035d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f28033b == null) {
            WifiManager wifiManager = (WifiManager) this.f28032a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                X1.n.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f28033b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f28034c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f28035d = z10;
        c();
    }
}
