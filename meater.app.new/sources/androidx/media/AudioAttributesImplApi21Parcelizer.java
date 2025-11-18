package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3525a = (AudioAttributes) versionedParcel.m4736r(audioAttributesImplApi21.f3525a, 1);
        audioAttributesImplApi21.f3526b = versionedParcel.m4734p(audioAttributesImplApi21.f3526b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.m4742x(false, false);
        versionedParcel.m4716H(audioAttributesImplApi21.f3525a, 1);
        versionedParcel.m4714F(audioAttributesImplApi21.f3526b, 2);
    }
}
