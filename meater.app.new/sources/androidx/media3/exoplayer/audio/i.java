package androidx.media3.exoplayer.audio;

import U1.C1727c;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.d;

/* compiled from: DefaultAudioOffloadSupportProvider.java */
/* loaded from: classes.dex */
public final class i implements DefaultAudioSink.d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26822a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f26823b;

    /* compiled from: DefaultAudioOffloadSupportProvider.java */
    private static final class a {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? d.f26762d : new d.b().e(true).g(z10).d();
        }
    }

    /* compiled from: DefaultAudioOffloadSupportProvider.java */
    private static final class b {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return d.f26762d;
            }
            return new d.b().e(true).f(L.f18626a > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public i(Context context) {
        this.f26822a = context;
    }

    private boolean b(Context context) {
        AudioManager audioManager;
        Boolean bool = this.f26823b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            this.f26823b = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters("offloadVariableRateSupported");
            this.f26823b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        return this.f26823b.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.d
    public d a(s sVar, C1727c c1727c) {
        C1804a.e(sVar);
        C1804a.e(c1727c);
        int i10 = L.f18626a;
        if (i10 < 29 || sVar.f17138E == -1) {
            return d.f26762d;
        }
        boolean zB = b(this.f26822a);
        int iF = z.f((String) C1804a.e(sVar.f17162o), sVar.f17158k);
        if (iF == 0 || i10 < L.K(iF)) {
            return d.f26762d;
        }
        int iM = L.M(sVar.f17137D);
        if (iM == 0) {
            return d.f26762d;
        }
        try {
            AudioFormat audioFormatL = L.L(sVar.f17138E, iM, iF);
            return i10 >= 31 ? b.a(audioFormatL, c1727c.a().f17038a, zB) : a.a(audioFormatL, c1727c.a().f17038a, zB);
        } catch (IllegalArgumentException unused) {
            return d.f26762d;
        }
    }
}
