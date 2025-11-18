package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbcd extends zzbco implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: h */
    private static final Map<Integer, String> f22770h;

    /* renamed from: i */
    private final zzbdg f22771i;

    /* renamed from: j */
    private final boolean f22772j;

    /* renamed from: k */
    private int f22773k;

    /* renamed from: l */
    private int f22774l;

    /* renamed from: m */
    private MediaPlayer f22775m;

    /* renamed from: n */
    private Uri f22776n;

    /* renamed from: o */
    private int f22777o;

    /* renamed from: p */
    private int f22778p;

    /* renamed from: q */
    private int f22779q;

    /* renamed from: r */
    private int f22780r;

    /* renamed from: s */
    private int f22781s;

    /* renamed from: t */
    private zzbdd f22782t;

    /* renamed from: u */
    private boolean f22783u;

    /* renamed from: v */
    private int f22784v;

    /* renamed from: w */
    private zzbcn f22785w;

    static {
        HashMap map = new HashMap();
        f22770h = map;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            map.put(-1004, "MEDIA_ERROR_IO");
            map.put(-1007, "MEDIA_ERROR_MALFORMED");
            map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            map.put(-110, "MEDIA_ERROR_TIMED_OUT");
            map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i2 >= 19) {
            map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzbcd(Context context, boolean z, boolean z2, zzbde zzbdeVar, zzbdg zzbdgVar) {
        super(context);
        this.f22773k = 0;
        this.f22774l = 0;
        setSurfaceTextureListener(this);
        this.f22771i = zzbdgVar;
        this.f22783u = z;
        this.f22772j = z2;
        zzbdgVar.m17484b(this);
    }

    /* renamed from: t */
    private final void m17402t(boolean z) {
        zzawz.m17082m("AdMediaPlayerView release");
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17477j();
            this.f22782t = null;
        }
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f22775m.release();
            this.f22775m = null;
            m17403u(0);
            if (z) {
                this.f22774l = 0;
                this.f22774l = 0;
            }
        }
    }

    /* renamed from: u */
    private final void m17403u(int i2) {
        if (i2 == 3) {
            this.f22771i.m17487e();
            this.f22787g.m17493d();
        } else if (this.f22773k == 3) {
            this.f22771i.m17488f();
            this.f22787g.m17494e();
        }
        this.f22773k = i2;
    }

    /* renamed from: w */
    private final void m17404w(float f2) {
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer == null) {
            zzbad.m17353i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: x */
    private final void m17405x() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        zzawz.m17082m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f22776n == null || surfaceTexture == null) {
            return;
        }
        m17402t(false);
        try {
            zzk.zzlw();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f22775m = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f22775m.setOnCompletionListener(this);
            this.f22775m.setOnErrorListener(this);
            this.f22775m.setOnInfoListener(this);
            this.f22775m.setOnPreparedListener(this);
            this.f22775m.setOnVideoSizeChangedListener(this);
            this.f22779q = 0;
            if (this.f22783u) {
                zzbdd zzbddVar = new zzbdd(getContext());
                this.f22782t = zzbddVar;
                zzbddVar.m17474b(surfaceTexture, getWidth(), getHeight());
                this.f22782t.start();
                SurfaceTexture surfaceTextureM17478k = this.f22782t.m17478k();
                if (surfaceTextureM17478k != null) {
                    surfaceTexture = surfaceTextureM17478k;
                } else {
                    this.f22782t.m17477j();
                    this.f22782t = null;
                }
            }
            this.f22775m.setDataSource(getContext(), this.f22776n);
            zzk.zzlx();
            this.f22775m.setSurface(new Surface(surfaceTexture));
            this.f22775m.setAudioStreamType(3);
            this.f22775m.setScreenOnWhilePlaying(true);
            this.f22775m.prepareAsync();
            m17403u(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            String strValueOf = String.valueOf(this.f22776n);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(strValueOf);
            zzbad.m17348d(sb.toString(), e2);
            onError(this.f22775m, 1, 0);
        }
    }

    /* renamed from: y */
    private final void m17406y() throws IllegalStateException {
        if (this.f22772j && m17407z() && this.f22775m.getCurrentPosition() > 0 && this.f22774l != 3) {
            zzawz.m17082m("AdMediaPlayerView nudging MediaPlayer");
            m17404w(0.0f);
            this.f22775m.start();
            int currentPosition = this.f22775m.getCurrentPosition();
            long jMo14608a = zzk.zzln().mo14608a();
            while (m17407z() && this.f22775m.getCurrentPosition() == currentPosition && zzk.zzln().mo14608a() - jMo14608a <= 250) {
            }
            this.f22775m.pause();
            mo15161b();
        }
    }

    /* renamed from: z */
    private final boolean m17407z() {
        int i2;
        return (this.f22775m == null || (i2 = this.f22773k) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbco, com.google.android.gms.internal.ads.InterfaceC6701g8
    /* renamed from: b */
    public final void mo15161b() {
        m17404w(this.f22787g.m17490a());
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: c */
    public final void mo17408c() throws IllegalStateException {
        zzawz.m17082m("AdMediaPlayerView pause");
        if (m17407z() && this.f22775m.isPlaying()) {
            this.f22775m.pause();
            m17403u(4);
            zzaxi.f22654a.post(new RunnableC7255v7(this));
        }
        this.f22774l = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: d */
    public final void mo17409d() throws IllegalStateException {
        zzawz.m17082m("AdMediaPlayerView play");
        if (m17407z()) {
            this.f22775m.start();
            m17403u(3);
            this.f22786f.m17465b();
            zzaxi.f22654a.post(new RunnableC7218u7(this));
        }
        this.f22774l = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getCurrentPosition() {
        if (m17407z()) {
            return this.f22775m.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getDuration() {
        if (m17407z()) {
            return this.f22775m.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: h */
    public final void mo17410h(int i2) throws IllegalStateException {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        zzawz.m17082m(sb.toString());
        if (!m17407z()) {
            this.f22784v = i2;
        } else {
            this.f22775m.seekTo(i2);
            this.f22784v = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: i */
    public final void mo17411i() throws IllegalStateException {
        zzawz.m17082m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f22775m.release();
            this.f22775m = null;
            m17403u(0);
            this.f22774l = 0;
        }
        this.f22771i.m17483a();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: j */
    public final void mo17412j(float f2, float f3) {
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17475e(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: k */
    public final void mo17413k(zzbcn zzbcnVar) {
        this.f22785w = zzbcnVar;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.f22779q = i2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzawz.m17082m("AdMediaPlayerView completion");
        m17403u(5);
        this.f22774l = 5;
        zzaxi.f22654a.post(new RunnableC7033p7(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f22770h;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzbad.m17353i(sb.toString());
        m17403u(-1);
        this.f22774l = -1;
        zzaxi.f22654a.post(new RunnableC7070q7(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f22770h;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawz.m17082m(sb.toString());
        return true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) throws IllegalStateException {
        int i4;
        int i5;
        int defaultSize = TextureView.getDefaultSize(this.f22777o, i2);
        int defaultSize2 = TextureView.getDefaultSize(this.f22778p, i3);
        if (this.f22777o > 0 && this.f22778p > 0 && this.f22782t == null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i6 = this.f22777o;
                int i7 = i6 * size2;
                int i8 = this.f22778p;
                if (i7 < size * i8) {
                    defaultSize = (i6 * size2) / i8;
                    defaultSize2 = size2;
                } else {
                    if (i6 * size2 > size * i8) {
                        defaultSize2 = (i8 * size) / i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i9 = (this.f22778p * size) / this.f22777o;
                if (mode2 != Integer.MIN_VALUE || i9 <= size2) {
                    defaultSize2 = i9;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i5 = (this.f22777o * size2) / this.f22778p;
                    if (mode == Integer.MIN_VALUE && i5 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i10 = this.f22777o;
                    int i11 = this.f22778p;
                    if (mode2 != Integer.MIN_VALUE || i11 <= size2) {
                        i5 = i10;
                        size2 = i11;
                    } else {
                        i5 = (size2 * i10) / i11;
                    }
                    if (mode == Integer.MIN_VALUE && i5 > size) {
                        defaultSize2 = (i11 * size) / i10;
                        defaultSize = size;
                    }
                }
                defaultSize = i5;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17476i(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i12 = this.f22780r;
            if ((i12 > 0 && i12 != defaultSize) || ((i4 = this.f22781s) > 0 && i4 != defaultSize2)) {
                m17406y();
            }
            this.f22780r = defaultSize;
            this.f22781s = defaultSize2;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        zzawz.m17082m("AdMediaPlayerView prepared");
        m17403u(2);
        this.f22771i.m17486d();
        zzaxi.f22654a.post(new RunnableC6996o7(this));
        this.f22777o = mediaPlayer.getVideoWidth();
        this.f22778p = mediaPlayer.getVideoHeight();
        int i2 = this.f22784v;
        if (i2 != 0) {
            mo17410h(i2);
        }
        m17406y();
        int i3 = this.f22777o;
        int i4 = this.f22778p;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        zzbad.m17352h(sb.toString());
        if (this.f22774l == 3) {
            mo17409d();
        }
        mo15161b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        zzawz.m17082m("AdMediaPlayerView surface created");
        m17405x();
        zzaxi.f22654a.post(new RunnableC7107r7(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawz.m17082m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null && this.f22784v == 0) {
            this.f22784v = mediaPlayer.getCurrentPosition();
        }
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17477j();
        }
        zzaxi.f22654a.post(new RunnableC7181t7(this));
        m17402t(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzawz.m17082m("AdMediaPlayerView surface changed");
        boolean z = this.f22774l == 3;
        boolean z2 = this.f22777o == i2 && this.f22778p == i3;
        if (this.f22775m != null && z && z2) {
            int i4 = this.f22784v;
            if (i4 != 0) {
                mo17410h(i4);
            }
            mo17409d();
        }
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17476i(i2, i3);
        }
        zzaxi.f22654a.post(new RunnableC7144s7(this, i2, i3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f22771i.m17485c(this);
        this.f22786f.m17464a(surfaceTexture, this.f22785w);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzawz.m17082m(sb.toString());
        this.f22777o = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f22778p = videoHeight;
        if (this.f22777o == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        zzawz.m17082m(sb.toString());
        zzaxi.f22654a.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.n7

            /* renamed from: f */
            private final zzbcd f19992f;

            /* renamed from: g */
            private final int f19993g;

            {
                this.f19992f = this;
                this.f19993g = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19992f.m17415v(this.f19993g);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: r */
    public final String mo17414r() {
        String str = this.f22783u ? " spherical" : HttpUrl.FRAGMENT_ENCODE_SET;
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void setVideoPath(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        zzvv zzvvVarM20679z = zzvv.m20679z(uri);
        if (zzvvVarM20679z == null || zzvvVarM20679z.f27230f != null) {
            if (zzvvVarM20679z != null) {
                uri = Uri.parse(zzvvVarM20679z.f27230f);
            }
            this.f22776n = uri;
            this.f22784v = 0;
            m17405x();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzbcd.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: v */
    final /* synthetic */ void m17415v(int i2) {
        zzbcn zzbcnVar = this.f22785w;
        if (zzbcnVar != null) {
            zzbcnVar.onWindowVisibilityChanged(i2);
        }
    }
}
