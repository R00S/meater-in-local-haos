package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f26014a;

    /* renamed from: b, reason: collision with root package name */
    public int f26015b;

    public AudioAttributesImplApi21() {
        this.f26015b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f26014a.equals(((AudioAttributesImplApi21) obj).f26014a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26014a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f26014a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f26014a = audioAttributes;
        this.f26015b = i10;
    }
}
