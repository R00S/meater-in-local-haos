package androidx.media3.exoplayer.audio;

import U1.C1727c;
import X1.C1804a;
import X1.L;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* compiled from: AudioCapabilitiesReceiver.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26746a;

    /* renamed from: b, reason: collision with root package name */
    private final f f26747b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f26748c;

    /* renamed from: d, reason: collision with root package name */
    private final c f26749d;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f26750e;

    /* renamed from: f, reason: collision with root package name */
    private final d f26751f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f26752g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f26753h;

    /* renamed from: i, reason: collision with root package name */
    private C1727c f26754i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26755j;

    /* compiled from: AudioCapabilitiesReceiver.java */
    /* renamed from: androidx.media3.exoplayer.audio.b$b, reason: collision with other inner class name */
    private static final class C0376b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) C1804a.e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) C1804a.e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.f(bVar.f26746a, b.this.f26754i, b.this.f26753h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (L.s(audioDeviceInfoArr, b.this.f26753h)) {
                b.this.f26753h = null;
            }
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.f(bVar.f26746a, b.this.f26754i, b.this.f26753h));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    private final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f26757a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f26758b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f26757a = contentResolver;
            this.f26758b = uri;
        }

        public void a() {
            this.f26757a.registerContentObserver(this.f26758b, false, this);
        }

        public void b() {
            this.f26757a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.f(bVar.f26746a, b.this.f26754i, b.this.f26753h));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.g(context, intent, bVar.f26754i, b.this.f26753h));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public interface f {
        void a(androidx.media3.exoplayer.audio.a aVar);
    }

    b(Context context, f fVar, C1727c c1727c, androidx.media3.exoplayer.audio.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f26746a = applicationContext;
        this.f26747b = (f) C1804a.e(fVar);
        this.f26754i = c1727c;
        this.f26753h = cVar;
        Handler handlerC = L.C();
        this.f26748c = handlerC;
        byte b10 = 0;
        this.f26749d = L.f18626a >= 23 ? new c() : null;
        this.f26750e = new e();
        Uri uriJ = androidx.media3.exoplayer.audio.a.j();
        this.f26751f = uriJ != null ? new d(handlerC, applicationContext.getContentResolver(), uriJ) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(androidx.media3.exoplayer.audio.a aVar) {
        if (!this.f26755j || aVar.equals(this.f26752g)) {
            return;
        }
        this.f26752g = aVar;
        this.f26747b.a(aVar);
    }

    public androidx.media3.exoplayer.audio.a g() {
        c cVar;
        if (this.f26755j) {
            return (androidx.media3.exoplayer.audio.a) C1804a.e(this.f26752g);
        }
        this.f26755j = true;
        d dVar = this.f26751f;
        if (dVar != null) {
            dVar.a();
        }
        if (L.f18626a >= 23 && (cVar = this.f26749d) != null) {
            C0376b.a(this.f26746a, cVar, this.f26748c);
        }
        androidx.media3.exoplayer.audio.a aVarG = androidx.media3.exoplayer.audio.a.g(this.f26746a, this.f26746a.registerReceiver(this.f26750e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f26748c), this.f26754i, this.f26753h);
        this.f26752g = aVarG;
        return aVarG;
    }

    public void h(C1727c c1727c) {
        this.f26754i = c1727c;
        f(androidx.media3.exoplayer.audio.a.f(this.f26746a, c1727c, this.f26753h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.c cVar = this.f26753h;
        if (L.d(audioDeviceInfo, cVar == null ? null : cVar.f26761a)) {
            return;
        }
        androidx.media3.exoplayer.audio.c cVar2 = audioDeviceInfo != null ? new androidx.media3.exoplayer.audio.c(audioDeviceInfo) : null;
        this.f26753h = cVar2;
        f(androidx.media3.exoplayer.audio.a.f(this.f26746a, this.f26754i, cVar2));
    }

    public void j() {
        c cVar;
        if (this.f26755j) {
            this.f26752g = null;
            if (L.f18626a >= 23 && (cVar = this.f26749d) != null) {
                C0376b.b(this.f26746a, cVar);
            }
            this.f26746a.unregisterReceiver(this.f26750e);
            d dVar = this.f26751f;
            if (dVar != null) {
                dVar.b();
            }
            this.f26755j = false;
        }
    }
}
