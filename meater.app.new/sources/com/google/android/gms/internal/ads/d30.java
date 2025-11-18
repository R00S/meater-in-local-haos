package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
final class d30 {

    /* renamed from: a */
    private final zznn[] f18484a;

    /* renamed from: b */
    private final zznp f18485b;

    /* renamed from: c */
    private zznn f18486c;

    public d30(zznn[] zznnVarArr, zznp zznpVar) {
        this.f18484a = zznnVarArr;
        this.f18485b = zznpVar;
    }

    /* renamed from: a */
    public final void m15025a() {
        zznn zznnVar = this.f18486c;
        if (zznnVar != null) {
            zznnVar.mo20329c();
            this.f18486c = null;
        }
    }

    /* renamed from: b */
    public final zznn m15026b(zzno zznoVar, Uri uri) throws InterruptedException, IOException {
        zznn zznnVar = this.f18486c;
        if (zznnVar != null) {
            return zznnVar;
        }
        zznn[] zznnVarArr = this.f18484a;
        int length = zznnVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            zznn zznnVar2 = zznnVarArr[i2];
            try {
            } catch (EOFException unused) {
            } finally {
                zznoVar.mo20324c();
            }
            if (zznnVar2.mo20332g(zznoVar)) {
                this.f18486c = zznnVar2;
                break;
            }
            i2++;
        }
        zznn zznnVar3 = this.f18486c;
        if (zznnVar3 != null) {
            zznnVar3.mo20331e(this.f18485b);
            return this.f18486c;
        }
        String strM20540d = zzsy.m20540d(this.f18484a);
        StringBuilder sb = new StringBuilder(String.valueOf(strM20540d).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(strM20540d);
        sb.append(") could read the stream.");
        throw new zzrc(sb.toString(), uri);
    }
}
