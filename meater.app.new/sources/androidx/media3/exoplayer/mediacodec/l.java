package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* compiled from: MediaCodecSelector.java */
/* loaded from: classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f27407a = new l() { // from class: k2.p
        @Override // androidx.media3.exoplayer.mediacodec.l
        public final List a(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.j(str, z10, z11);
        }
    };

    List<j> a(String str, boolean z10, boolean z11);
}
