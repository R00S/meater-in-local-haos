package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3527a = versionedParcel.m4734p(audioAttributesImplBase.f3527a, 1);
        audioAttributesImplBase.f3528b = versionedParcel.m4734p(audioAttributesImplBase.f3528b, 2);
        audioAttributesImplBase.f3529c = versionedParcel.m4734p(audioAttributesImplBase.f3529c, 3);
        audioAttributesImplBase.f3530d = versionedParcel.m4734p(audioAttributesImplBase.f3530d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.m4742x(false, false);
        versionedParcel.m4714F(audioAttributesImplBase.f3527a, 1);
        versionedParcel.m4714F(audioAttributesImplBase.f3528b, 2);
        versionedParcel.m4714F(audioAttributesImplBase.f3529c, 3);
        versionedParcel.m4714F(audioAttributesImplBase.f3530d, 4);
    }
}
