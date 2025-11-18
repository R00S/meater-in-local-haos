package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzsb extends IOException {

    /* renamed from: f */
    private final int f26980f;

    /* renamed from: g */
    private final zzry f26981g;

    public zzsb(String str, zzry zzryVar, int i2) {
        super(str);
        this.f26981g = zzryVar;
        this.f26980f = 1;
    }

    public zzsb(IOException iOException, zzry zzryVar, int i2) {
        super(iOException);
        this.f26981g = zzryVar;
        this.f26980f = i2;
    }

    public zzsb(String str, IOException iOException, zzry zzryVar, int i2) {
        super(str, iOException);
        this.f26981g = zzryVar;
        this.f26980f = 1;
    }
}
