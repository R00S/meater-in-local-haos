package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdrq extends IOException {
    zzdrq(int i2, int i3) {
        StringBuilder sb = new StringBuilder(108);
        sb.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb.append(i2);
        sb.append(" limit ");
        sb.append(i3);
        sb.append(").");
        super(sb.toString());
    }
}
