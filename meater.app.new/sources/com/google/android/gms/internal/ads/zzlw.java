package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzlw {

    /* renamed from: a */
    private static final zzlw f26519a = new zzlw(new int[]{2}, 2);

    /* renamed from: b */
    private final int[] f26520b;

    /* renamed from: c */
    private final int f26521c;

    private zzlw(int[] iArr, int i2) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f26520b = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.f26521c = 2;
    }

    /* renamed from: a */
    public final boolean m20225a(int i2) {
        return Arrays.binarySearch(this.f26520b, i2) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlw)) {
            return false;
        }
        zzlw zzlwVar = (zzlw) obj;
        return Arrays.equals(this.f26520b, zzlwVar.f26520b) && this.f26521c == zzlwVar.f26521c;
    }

    public final int hashCode() {
        return this.f26521c + (Arrays.hashCode(this.f26520b) * 31);
    }

    public final String toString() {
        int i2 = this.f26521c;
        String string = Arrays.toString(this.f26520b);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i2);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
