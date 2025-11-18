package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f3525a;

    /* renamed from: b */
    int f3526b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f3525a.equals(((AudioAttributesImplApi21) obj).f3525a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3525a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3525a;
    }
}
