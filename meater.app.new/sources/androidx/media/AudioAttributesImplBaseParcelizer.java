package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f26016a = versionedParcel.p(audioAttributesImplBase.f26016a, 1);
        audioAttributesImplBase.f26017b = versionedParcel.p(audioAttributesImplBase.f26017b, 2);
        audioAttributesImplBase.f26018c = versionedParcel.p(audioAttributesImplBase.f26018c, 3);
        audioAttributesImplBase.f26019d = versionedParcel.p(audioAttributesImplBase.f26019d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f26016a, 1);
        versionedParcel.F(audioAttributesImplBase.f26017b, 2);
        versionedParcel.F(audioAttributesImplBase.f26018c, 3);
        versionedParcel.F(audioAttributesImplBase.f26019d, 4);
    }
}
