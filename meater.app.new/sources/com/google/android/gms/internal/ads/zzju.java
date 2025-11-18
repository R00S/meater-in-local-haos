package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzju extends IOException {

    /* renamed from: f */
    private final String f26402f;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzju(String str) {
        String strValueOf = String.valueOf(str);
        super(strValueOf.length() != 0 ? "Unsupported URI scheme: ".concat(strValueOf) : new String("Unsupported URI scheme: "));
        this.f26402f = str;
    }
}
