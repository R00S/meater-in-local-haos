package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;

/* loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* renamed from: E, reason: collision with root package name */
    public final int f27887E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f27888F;

    public MediaCodecVideoDecoderException(Throwable th, androidx.media3.exoplayer.mediacodec.j jVar, Surface surface) {
        super(th, jVar);
        this.f27887E = System.identityHashCode(surface);
        this.f27888F = surface == null || surface.isValid();
    }
}
