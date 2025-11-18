package L5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import x4.g;

/* compiled from: SoundManager.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static AudioManager f10822h = null;

    /* renamed from: i, reason: collision with root package name */
    private static c f10823i = null;

    /* renamed from: j, reason: collision with root package name */
    public static int f10824j = 100;

    /* renamed from: k, reason: collision with root package name */
    public static AudioAttributes f10825k = new AudioAttributes.Builder().setUsage(1).setContentType(4).build();

    /* renamed from: a, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f10826a;

    /* renamed from: b, reason: collision with root package name */
    private final Vibrator f10827b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10828c;

    /* renamed from: d, reason: collision with root package name */
    private AudioFocusRequest f10829d;

    /* renamed from: g, reason: collision with root package name */
    private MediaPlayer f10832g;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<b> f10831f = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<b> f10830e = new ArrayList<>();

    /* compiled from: SoundManager.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10833a;

        static {
            int[] iArr = new int[MCNotificationType.values().length];
            f10833a = iArr;
            try {
                iArr[MCNotificationType.NOTIFICATION_TYPE_READY_FOR_RESTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10833a[MCNotificationType.NOTIFICATION_TYPE_COOK_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10833a[MCNotificationType.NOTIFICATION_TYPE_OVERCOOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10833a[MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SoundManager.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public G5.c f10834a;

        /* compiled from: SoundManager.java */
        class a implements MediaPlayer.OnErrorListener {
            a(b bVar) {
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                Log.error("MediaPlayer", "error: " + i10 + " " + i11);
                return true;
            }
        }

        /* compiled from: SoundManager.java */
        /* renamed from: L5.c$b$b, reason: collision with other inner class name */
        class C0179b implements MediaPlayer.OnCompletionListener {
            C0179b() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                c.this.n();
            }
        }

        /* compiled from: SoundManager.java */
        /* renamed from: L5.c$b$c, reason: collision with other inner class name */
        class C0180c implements AudioManager.OnAudioFocusChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f10837a;

            C0180c(boolean z10) {
                this.f10837a = z10;
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i10) throws IllegalStateException {
                if (i10 == -2 || i10 == -1) {
                    b.this.i();
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    b.this.f(this.f10837a);
                }
            }
        }

        /* compiled from: SoundManager.java */
        class d implements MediaPlayer.OnErrorListener {
            d(b bVar) {
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                Log.error("MediaPlayer", "error: " + i10 + " " + i11);
                return true;
            }
        }

        /* compiled from: SoundManager.java */
        class e implements MediaPlayer.OnCompletionListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AudioManager f10839a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f10840b;

            e(AudioManager audioManager, int i10) {
                this.f10839a = audioManager;
                this.f10840b = i10;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                c.this.n();
                this.f10839a.setStreamVolume(3, this.f10840b, 0);
            }
        }

        /* compiled from: SoundManager.java */
        class f implements AudioManager.OnAudioFocusChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f10842a;

            f(boolean z10) {
                this.f10842a = z10;
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i10) throws IllegalStateException {
                if (i10 == -2 || i10 == -1) {
                    b.this.i();
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    b.this.f(this.f10842a);
                }
            }
        }

        b(G5.c cVar) {
            this.f10834a = cVar;
        }

        public String b(Context context) {
            return context.getString(this.f10834a.f4975C);
        }

        public int c() {
            return this.f10834a.n();
        }

        public G5.c d() {
            return this.f10834a;
        }

        public Uri e(Context context) {
            return this.f10834a.p(context);
        }

        public void g(boolean z10) throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
            k();
            c.this.f10832g = new MediaPlayer();
            try {
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = c.this.f10828c.getResources().openRawResourceFd(c());
                if (assetFileDescriptorOpenRawResourceFd == null) {
                    return;
                }
                c.this.f10832g.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                c.this.f10832g.setAudioAttributes(c.f10825k);
                c.this.f10832g.setOnErrorListener(new a(this));
                c.this.f10832g.setOnCompletionListener(new C0179b());
                c.this.f10832g.prepare();
                c.this.f10826a = new C0180c(z10);
                f(z10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void h(final boolean z10) throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
            k();
            c.this.f10832g = new MediaPlayer();
            try {
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = c.this.f10828c.getResources().openRawResourceFd(c());
                if (assetFileDescriptorOpenRawResourceFd == null) {
                    return;
                }
                c.this.f10832g.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                c.this.f10832g.setAudioAttributes(c.f10825k);
                AudioManager audioManager = (AudioManager) g.h().getSystemService("audio");
                int streamVolume = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, g.t().o() * 10, 0);
                c.this.f10832g.setOnErrorListener(new d(this));
                c.this.f10832g.setOnCompletionListener(new e(audioManager, streamVolume));
                c.this.f10832g.prepare();
                c.this.f10826a = new f(z10);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: L5.d
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalStateException {
                        this.f10849B.f(z10);
                    }
                }, 1000L);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void i() throws IllegalStateException {
            if (c.this.o() && c.this.f10832g.isPlaying()) {
                c.this.f10832g.pause();
            }
        }

        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void f(boolean z10) throws IllegalStateException {
            if (c.this.f10832g != null) {
                c.this.o();
                c.this.f10832g.start();
                if (z10) {
                    c.this.f10827b.vibrate(VibrationEffect.createOneShot(1000L, -1));
                }
            }
        }

        public void k() throws IllegalStateException {
            if (c.this.f10832g != null) {
                c.this.n();
                c.this.f10832g.stop();
                c.this.f10832g.release();
                c.this.f10832g = null;
            }
        }

        public String toString() {
            return this.f10834a.toString();
        }
    }

    /* compiled from: SoundManager.java */
    /* renamed from: L5.c$c, reason: collision with other inner class name */
    public enum EnumC0181c {
        COOK_READY_FOR_RESTING_SOUND,
        COOK_READY_SOUND,
        COOK_OVERCOOK_SOUND,
        ALERT_SOUND
    }

    private c(Context context) {
        this.f10828c = context;
        this.f10827b = m(context);
        f10822h = (AudioManager) context.getSystemService("audio");
        for (int i10 = 0; i10 < G5.c.values().length; i10++) {
            b bVar = new b(G5.c.values()[i10]);
            this.f10831f.add(bVar);
            this.f10830e.add(bVar);
        }
    }

    private Vibrator m(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? L5.a.a(context.getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) context.getSystemService("vibrator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        AudioFocusRequest audioFocusRequest = this.f10829d;
        if (audioFocusRequest != null) {
            f10822h.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.f10829d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        if (this.f10826a == null) {
            return false;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(this.f10826a).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).build();
        this.f10829d = audioFocusRequestBuild;
        return f10822h.requestAudioFocus(audioFocusRequestBuild) == 1;
    }

    public static c p(Context context) {
        if (f10823i == null) {
            f10823i = new c(context);
        }
        return f10823i;
    }

    public static Uri q(Context context, G5.c cVar) {
        return cVar.p(context);
    }

    public static G5.c r(MCNotificationType mCNotificationType) {
        int i10 = a.f10833a[mCNotificationType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? g.t().f() : g.t().u() : g.t().u() : g.t().B() : g.t().A();
    }

    public b h(G5.c cVar) {
        Iterator<b> it = this.f10830e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f10834a == cVar) {
                return next;
            }
        }
        return null;
    }

    public b i(EnumC0181c enumC0181c) {
        G5.c cVarL = l(enumC0181c);
        Iterator<b> it = this.f10831f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f10834a == cVarL) {
                return next;
            }
        }
        return null;
    }

    public b j(Uri uri) {
        Iterator<b> it = this.f10830e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.e(this.f10828c).equals(uri)) {
                return next;
            }
        }
        return null;
    }

    public ArrayList<b> k() {
        return this.f10831f;
    }

    public G5.c l(EnumC0181c enumC0181c) {
        int iOrdinal = enumC0181c.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? g.t().f() : g.t().f() : g.t().u() : g.t().B() : g.t().A();
    }
}
