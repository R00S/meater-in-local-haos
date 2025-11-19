package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f26016a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f26017b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f26018c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f26019d = -1;

    public int a() {
        return this.f26017b;
    }

    public int b() {
        int i10 = this.f26018c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f26019d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f26018c, this.f26016a);
    }

    public int d() {
        return this.f26016a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f26017b == audioAttributesImplBase.a() && this.f26018c == audioAttributesImplBase.b() && this.f26016a == audioAttributesImplBase.d() && this.f26019d == audioAttributesImplBase.f26019d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26017b), Integer.valueOf(this.f26018c), Integer.valueOf(this.f26016a), Integer.valueOf(this.f26019d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f26019d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f26019d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f26016a));
        sb2.append(" content=");
        sb2.append(this.f26017b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f26018c).toUpperCase());
        return sb2.toString();
    }
}
