package com.google.android.gms.ads.mediation;

/* loaded from: classes2.dex */
public final class VersionInfo {
    private final int zzenq;
    private final int zzenr;
    private final int zzens;

    public VersionInfo(int i2, int i3, int i4) {
        this.zzenq = i2;
        this.zzenr = i3;
        this.zzens = i4;
    }

    public final int getMajorVersion() {
        return this.zzenq;
    }

    public final int getMicroVersion() {
        return this.zzens;
    }

    public final int getMinorVersion() {
        return this.zzenr;
    }
}
