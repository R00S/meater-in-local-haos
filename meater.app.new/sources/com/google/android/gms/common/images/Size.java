package com.google.android.gms.common.images;

/* loaded from: classes2.dex */
public final class Size {

    /* renamed from: a */
    private final int f17681a;

    /* renamed from: b */
    private final int f17682b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f17681a == size.f17681a && this.f17682b == size.f17682b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f17682b;
        int i3 = this.f17681a;
        return i2 ^ ((i3 >>> 16) | (i3 << 16));
    }

    public final String toString() {
        int i2 = this.f17681a;
        int i3 = this.f17682b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        return sb.toString();
    }
}
