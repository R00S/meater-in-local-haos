package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbfp implements zzaho<zzbdf> {
    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbdf zzbdfVar, Map map) throws NumberFormatException {
        zzbdf zzbdfVar2 = zzbdfVar;
        zzbhq zzbhqVarMo14911h = zzbdfVar2.mo14911h();
        if (zzbhqVarMo14911h == null) {
            try {
                zzbhq zzbhqVar = new zzbhq(zzbdfVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzbdfVar2.mo14905e(zzbhqVar);
                zzbhqVarMo14911h = zzbhqVar;
            } catch (NullPointerException | NumberFormatException e2) {
                zzbad.m17347c("Unable to parse videoMeta message.", e2);
                zzk.zzlk().m17052e(e2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f2 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f3 = Float.parseFloat((String) map.get("currentTime"));
        int i2 = Integer.parseInt((String) map.get("playbackState"));
        int i3 = (i2 < 0 || 3 < i2) ? 0 : i2;
        String str = (String) map.get("aspectRatio");
        float f4 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzbad.m17345a(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f3);
            sb.append(" , duration : ");
            sb.append(f2);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i3);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            zzbad.m17349e(sb.toString());
        }
        zzbhqVarMo14911h.m17707i7(f3, f2, i3, zEquals, f4);
    }
}
