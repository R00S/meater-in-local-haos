package com.google.android.gms.internal.ads;

import java.math.BigInteger;

@zzard
/* loaded from: classes2.dex */
public final class zzawt {

    /* renamed from: a */
    private BigInteger f22616a = BigInteger.ONE;

    /* renamed from: b */
    private String f22617b = "0";

    /* renamed from: a */
    public final synchronized String m17071a() {
        String string;
        string = this.f22616a.toString();
        this.f22616a = this.f22616a.add(BigInteger.ONE);
        this.f22617b = string;
        return string;
    }

    /* renamed from: b */
    public final synchronized String m17072b() {
        return this.f22617b;
    }
}
