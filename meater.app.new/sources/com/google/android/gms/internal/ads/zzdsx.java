package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes2.dex */
public final class zzdsx extends zzdtc {

    /* renamed from: a */
    private String f25965a;

    public zzdsx(String str) {
        this.f25965a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdtc
    /* renamed from: a */
    public final void mo19858a(String str) {
        String str2 = this.f25965a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
