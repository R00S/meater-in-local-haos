package androidx.media3.exoplayer.audio;

import U1.C1727c;
import X1.L;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

/* compiled from: DefaultAudioTrackProvider.java */
/* loaded from: classes.dex */
public class l implements DefaultAudioSink.f {
    private AudioTrack b(AudioSink.a aVar, C1727c c1727c, int i10) {
        return new AudioTrack(e(c1727c, aVar.f26624d), L.L(aVar.f26622b, aVar.f26623c, aVar.f26621a), aVar.f26626f, 1, i10);
    }

    private AudioTrack c(AudioSink.a aVar, C1727c c1727c, int i10) throws IllegalArgumentException {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(c1727c, aVar.f26624d)).setAudioFormat(L.L(aVar.f26622b, aVar.f26623c, aVar.f26621a)).setTransferMode(1).setBufferSizeInBytes(aVar.f26626f).setSessionId(i10);
        if (L.f18626a >= 29) {
            g(sessionId, aVar.f26625e);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(C1727c c1727c, boolean z10) {
        return z10 ? f() : c1727c.a().f17038a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.f
    public final AudioTrack a(AudioSink.a aVar, C1727c c1727c, int i10) {
        return L.f18626a >= 23 ? c(aVar, c1727c, i10) : b(aVar, c1727c, i10);
    }

    protected AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}
