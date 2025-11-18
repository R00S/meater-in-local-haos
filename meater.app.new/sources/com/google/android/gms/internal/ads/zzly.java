package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzly extends Exception {
    public zzly(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(78);
        sb.append("Unhandled format: ");
        sb.append(i2);
        sb.append(" Hz, ");
        sb.append(i3);
        sb.append(" channels in encoding ");
        sb.append(i4);
        super(sb.toString());
    }
}
