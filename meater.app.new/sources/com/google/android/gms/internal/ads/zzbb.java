package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzbb extends zzdsu implements Closeable {

    /* renamed from: o */
    private static zzdtc f22755o = zzdtc.m19860b(zzbb.class);

    public zzbb(zzdsw zzdswVar, zzba zzbaVar) throws IOException {
        mo19853d(zzdswVar, zzdswVar.size(), zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsu, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25959i.close();
    }

    @Override // com.google.android.gms.internal.ads.zzdsu
    public String toString() {
        String string = this.f25959i.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
