package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzagy implements zzaho<zzbgz> {
    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) throws NumberFormatException {
        zzbgz zzbgzVar2 = zzbgzVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbad.m17353i("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzbad.m17353i("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jMo14609b = zzk.zzln().mo14609b() + (Long.parseLong(str4) - zzk.zzln().mo14608a());
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzbgzVar2.mo14923n().m16446b(str2, str3, jMo14609b);
                return;
            } catch (NumberFormatException e2) {
                zzbad.m17348d("Malformed timestamp for CSI tick.", e2);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbad.m17353i("No value given for CSI experiment.");
                return;
            }
            zzadi zzadiVarM16447c = zzbgzVar2.mo14923n().m16447c();
            if (zzadiVarM16447c == null) {
                zzbad.m17353i("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                zzadiVarM16447c.m16451d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbad.m17353i("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                zzbad.m17353i("No name given for CSI extra.");
                return;
            }
            zzadi zzadiVarM16447c2 = zzbgzVar2.mo14923n().m16447c();
            if (zzadiVarM16447c2 == null) {
                zzbad.m17353i("No ticker for WebView, dropping extra parameter.");
            } else {
                zzadiVarM16447c2.m16451d(str6, str7);
            }
        }
    }
}
