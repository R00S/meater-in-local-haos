package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzkd extends IOException {
    public zzkd(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String strValueOf = String.valueOf(exc.getMessage());
        StringBuilder sb = new StringBuilder(simpleName.length() + 13 + strValueOf.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(": ");
        sb.append(strValueOf);
        super(sb.toString(), exc);
    }
}
