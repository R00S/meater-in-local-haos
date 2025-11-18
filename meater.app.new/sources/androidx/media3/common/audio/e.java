package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;

/* compiled from: ToInt16PcmAudioProcessor.java */
/* loaded from: classes.dex */
public final class e extends b {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.audio.e.f(java.nio.ByteBuffer):void");
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a i(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f26043c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.a(aVar.f26041a, aVar.f26042b, 2) : AudioProcessor.a.f26040e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
