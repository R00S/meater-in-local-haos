package androidx.media3.exoplayer;

import X1.C1804a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: StreamVolumeManager.java */
/* loaded from: classes.dex */
final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27878a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f27879b;

    /* renamed from: c, reason: collision with root package name */
    private final b f27880c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f27881d;

    /* renamed from: e, reason: collision with root package name */
    private c f27882e;

    /* renamed from: f, reason: collision with root package name */
    private int f27883f;

    /* renamed from: g, reason: collision with root package name */
    private int f27884g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27885h;

    /* compiled from: StreamVolumeManager.java */
    public interface b {
        void F(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StreamVolumeManager.java */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = v0.this.f27879b;
            final v0 v0Var = v0.this;
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.w0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.b(v0Var);
                }
            });
        }
    }

    public v0(Context context, Handler handler, b bVar, int i10) {
        Context applicationContext = context.getApplicationContext();
        this.f27878a = applicationContext;
        this.f27879b = handler;
        this.f27880c = bVar;
        AudioManager audioManager = (AudioManager) C1804a.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f27881d = audioManager;
        this.f27883f = i10;
        this.f27884g = f(audioManager, i10);
        this.f27885h = e(audioManager, i10);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f27882e = cVar;
        } catch (RuntimeException e10) {
            X1.n.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(v0 v0Var) {
        v0Var.h();
    }

    private static boolean e(AudioManager audioManager, int i10) {
        return X1.L.f18626a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            X1.n.i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int iF = f(this.f27881d, this.f27883f);
        boolean zE = e(this.f27881d, this.f27883f);
        if (this.f27884g == iF && this.f27885h == zE) {
            return;
        }
        this.f27884g = iF;
        this.f27885h = zE;
        this.f27880c.F(iF, zE);
    }

    public int c() {
        return this.f27881d.getStreamMaxVolume(this.f27883f);
    }

    public int d() {
        if (X1.L.f18626a >= 28) {
            return this.f27881d.getStreamMinVolume(this.f27883f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f27882e;
        if (cVar != null) {
            try {
                this.f27878a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                X1.n.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f27882e = null;
        }
    }
}
