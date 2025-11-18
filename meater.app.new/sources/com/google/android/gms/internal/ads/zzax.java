package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class zzax extends zzr<String> {

    /* renamed from: u */
    private final Object f22624u;

    /* renamed from: v */
    private zzaa<String> f22625v;

    public zzax(int i2, String str, zzaa<String> zzaaVar, zzz zzzVar) {
        super(i2, str, zzzVar);
        this.f22624u = new Object();
        this.f22625v = zzaaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo16035F(String str) {
        zzaa<String> zzaaVar;
        synchronized (this.f22624u) {
            zzaaVar = this.f22625v;
        }
        if (zzaaVar != null) {
            zzaaVar.mo16053b(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: y */
    protected final zzy<String> mo17084y(zzp zzpVar) {
        String str;
        try {
            byte[] bArr = zzpVar.f26740b;
            String str2 = "ISO-8859-1";
            String str3 = zzpVar.f26741c.get("Content-Type");
            if (str3 != null) {
                String[] strArrSplit = str3.split(";", 0);
                int i2 = 1;
                while (true) {
                    if (i2 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str2 = strArrSplit2[1];
                        break;
                    }
                    i2++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzpVar.f26740b);
        }
        return zzy.m20817a(str, zzaq.m16857a(zzpVar));
    }
}
