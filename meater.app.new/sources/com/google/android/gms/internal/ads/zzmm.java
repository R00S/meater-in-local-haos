package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzmm extends Exception {

    /* renamed from: f */
    private final int f26581f;

    public zzmm(int i2, int i3, int i4, int i5) {
        StringBuilder sb = new StringBuilder(82);
        sb.append("AudioTrack init failed: ");
        sb.append(i2);
        sb.append(", Config(");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(")");
        super(sb.toString());
        this.f26581f = i2;
    }
}
