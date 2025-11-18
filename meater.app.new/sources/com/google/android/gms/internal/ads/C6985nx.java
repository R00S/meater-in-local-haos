package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nx */
/* loaded from: classes2.dex */
final class C6985nx extends IllegalArgumentException {
    C6985nx(int i2, int i3) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i2);
        sb.append(" of ");
        sb.append(i3);
        super(sb.toString());
    }
}
