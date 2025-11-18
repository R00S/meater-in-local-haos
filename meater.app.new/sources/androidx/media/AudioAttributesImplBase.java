package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f3527a = 0;

    /* renamed from: b */
    int f3528b = 0;

    /* renamed from: c */
    int f3529c = 0;

    /* renamed from: d */
    int f3530d = -1;

    AudioAttributesImplBase() {
    }

    /* renamed from: a */
    public int m3925a() {
        return this.f3528b;
    }

    /* renamed from: b */
    public int m3926b() {
        int i2 = this.f3529c;
        int iM3927c = m3927c();
        if (iM3927c == 6) {
            i2 |= 4;
        } else if (iM3927c == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    /* renamed from: c */
    public int m3927c() {
        int i2 = this.f3530d;
        return i2 != -1 ? i2 : AudioAttributesCompat.m3923a(false, this.f3529c, this.f3527a);
    }

    /* renamed from: d */
    public int m3928d() {
        return this.f3527a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3528b == audioAttributesImplBase.m3925a() && this.f3529c == audioAttributesImplBase.m3926b() && this.f3527a == audioAttributesImplBase.m3928d() && this.f3530d == audioAttributesImplBase.f3530d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3528b), Integer.valueOf(this.f3529c), Integer.valueOf(this.f3527a), Integer.valueOf(this.f3530d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3530d != -1) {
            sb.append(" stream=");
            sb.append(this.f3530d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m3924b(this.f3527a));
        sb.append(" content=");
        sb.append(this.f3528b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3529c).toUpperCase());
        return sb.toString();
    }
}
