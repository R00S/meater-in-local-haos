package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhv extends Exception {

    /* renamed from: f */
    private final int f26244f;

    public zzhv(int i2) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i2);
        super(sb.toString());
        this.f26244f = i2;
    }
}
