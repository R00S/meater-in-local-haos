package androidx.media3.exoplayer;

import U1.C1727c;
import X1.C1804a;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: AudioFocusManager.java */
/* renamed from: androidx.media3.exoplayer.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2122d {

    /* renamed from: a, reason: collision with root package name */
    private final l8.s<AudioManager> f26868a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26869b;

    /* renamed from: c, reason: collision with root package name */
    private b f26870c;

    /* renamed from: d, reason: collision with root package name */
    private C1727c f26871d;

    /* renamed from: f, reason: collision with root package name */
    private int f26873f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f26875h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26876i;

    /* renamed from: g, reason: collision with root package name */
    private float f26874g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f26872e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioFocusManager.java */
    /* renamed from: androidx.media3.exoplayer.d$a */
    class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f26877a;

        public a(Handler handler) {
            this.f26877a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            C2122d.this.i(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f26877a.post(new Runnable() { // from class: androidx.media3.exoplayer.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26865B.b(i10);
                }
            });
        }
    }

    /* compiled from: AudioFocusManager.java */
    /* renamed from: androidx.media3.exoplayer.d$b */
    public interface b {
        void q(float f10);

        void x(int i10);
    }

    public C2122d(final Context context, Handler handler, b bVar) {
        this.f26868a = l8.t.a(new l8.s() { // from class: androidx.media3.exoplayer.b
            @Override // l8.s
            public final Object get() {
                return C2122d.j(context);
            }
        });
        this.f26870c = bVar;
        this.f26869b = new a(handler);
    }

    private void b() {
        this.f26868a.get().abandonAudioFocus(this.f26869b);
    }

    private void c() {
        int i10 = this.f26872e;
        if (i10 == 1 || i10 == 0) {
            return;
        }
        if (X1.L.f18626a >= 26) {
            d();
        } else {
            b();
        }
    }

    private void d() {
        if (this.f26875h != null) {
            this.f26868a.get().abandonAudioFocusRequest(this.f26875h);
        }
    }

    private static int f(C1727c c1727c) {
        if (c1727c == null) {
            return 0;
        }
        switch (c1727c.f17034c) {
            case 0:
                X1.n.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (c1727c.f17032a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 3;
            case 15:
            default:
                X1.n.h("AudioFocusManager", "Unidentified audio usage: " + c1727c.f17034c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void g(int i10) {
        b bVar = this.f26870c;
        if (bVar != null) {
            bVar.x(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !s()) {
                p(4);
                return;
            } else {
                g(0);
                p(3);
                return;
            }
        }
        if (i10 == -1) {
            g(-1);
            c();
            p(1);
        } else if (i10 == 1) {
            p(2);
            g(1);
        } else {
            X1.n.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AudioManager j(Context context) {
        return (AudioManager) C1804a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
    }

    private int l() {
        if (this.f26872e == 2) {
            return 1;
        }
        if ((X1.L.f18626a >= 26 ? n() : m()) == 1) {
            p(2);
            return 1;
        }
        p(1);
        return -1;
    }

    private int m() {
        return this.f26868a.get().requestAudioFocus(this.f26869b, X1.L.m0(((C1727c) C1804a.e(this.f26871d)).f17034c), this.f26873f);
    }

    private int n() {
        AudioFocusRequest audioFocusRequest = this.f26875h;
        if (audioFocusRequest == null || this.f26876i) {
            this.f26875h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f26873f) : new AudioFocusRequest.Builder(this.f26875h)).setAudioAttributes(((C1727c) C1804a.e(this.f26871d)).a().f17038a).setWillPauseWhenDucked(s()).setOnAudioFocusChangeListener(this.f26869b).build();
            this.f26876i = false;
        }
        return this.f26868a.get().requestAudioFocus(this.f26875h);
    }

    private void p(int i10) {
        if (this.f26872e == i10) {
            return;
        }
        this.f26872e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f26874g == f10) {
            return;
        }
        this.f26874g = f10;
        b bVar = this.f26870c;
        if (bVar != null) {
            bVar.q(f10);
        }
    }

    private boolean q(int i10) {
        return i10 != 1 && this.f26873f == 1;
    }

    private boolean s() {
        C1727c c1727c = this.f26871d;
        return c1727c != null && c1727c.f17032a == 1;
    }

    public float h() {
        return this.f26874g;
    }

    public void k() {
        this.f26870c = null;
        c();
        p(0);
    }

    public void o(C1727c c1727c) {
        if (X1.L.d(this.f26871d, c1727c)) {
            return;
        }
        this.f26871d = c1727c;
        int iF = f(c1727c);
        this.f26873f = iF;
        boolean z10 = true;
        if (iF != 1 && iF != 0) {
            z10 = false;
        }
        C1804a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int r(boolean z10, int i10) {
        if (!q(i10)) {
            c();
            p(0);
            return 1;
        }
        if (z10) {
            return l();
        }
        int i11 = this.f26872e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }
}
