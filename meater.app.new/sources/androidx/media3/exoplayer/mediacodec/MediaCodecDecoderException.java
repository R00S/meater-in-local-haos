package androidx.media3.exoplayer.mediacodec;

import X1.L;
import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: B, reason: collision with root package name */
    public final j f27253B;

    /* renamed from: C, reason: collision with root package name */
    public final String f27254C;

    /* renamed from: D, reason: collision with root package name */
    public final int f27255D;

    public MediaCodecDecoderException(Throwable th, j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(jVar == null ? null : jVar.f27394a);
        super(sb2.toString(), th);
        this.f27253B = jVar;
        String diagnosticInfo = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.f27254C = diagnosticInfo;
        this.f27255D = L.f18626a >= 23 ? a(th) : L.a0(diagnosticInfo);
    }

    private static int a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
