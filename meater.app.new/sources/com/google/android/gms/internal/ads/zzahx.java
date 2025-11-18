package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzahx implements zzaho<Object> {

    /* renamed from: a */
    private final zzahy f22047a;

    private zzahx(zzahy zzahyVar) {
        this.f22047a = zzahyVar;
    }

    /* renamed from: b */
    public static void m16579b(zzbgz zzbgzVar, zzahy zzahyVar) {
        zzbgzVar.mo14907f("/reward", new zzahx(zzahyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) throws NumberFormatException {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f22047a.mo16582r();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f22047a.mo16581j();
                    return;
                }
                return;
            }
        }
        zzato zzatoVar = null;
        try {
            int i2 = Integer.parseInt(map.get("amount"));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzatoVar = new zzato(str2, i2);
            }
        } catch (NumberFormatException e2) {
            zzbad.m17348d("Unable to parse reward amount.", e2);
        }
        this.f22047a.mo16580P(zzatoVar);
    }
}
