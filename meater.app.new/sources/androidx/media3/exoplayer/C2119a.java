package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: AudioBecomingNoisyManager.java */
/* renamed from: androidx.media3.exoplayer.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2119a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26589a;

    /* renamed from: b, reason: collision with root package name */
    private final RunnableC0374a f26590b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26591c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: androidx.media3.exoplayer.a$a, reason: collision with other inner class name */
    private final class RunnableC0374a extends BroadcastReceiver implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final b f26592B;

        /* renamed from: C, reason: collision with root package name */
        private final Handler f26593C;

        public RunnableC0374a(Handler handler, b bVar) {
            this.f26593C = handler;
            this.f26592B = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f26593C.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2119a.this.f26591c) {
                this.f26592B.c();
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: androidx.media3.exoplayer.a$b */
    public interface b {
        void c();
    }

    public C2119a(Context context, Handler handler, b bVar) {
        this.f26589a = context.getApplicationContext();
        this.f26590b = new RunnableC0374a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f26591c) {
            this.f26589a.registerReceiver(this.f26590b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f26591c = true;
        } else {
            if (z10 || !this.f26591c) {
                return;
            }
            this.f26589a.unregisterReceiver(this.f26590b);
            this.f26591c = false;
        }
    }
}
