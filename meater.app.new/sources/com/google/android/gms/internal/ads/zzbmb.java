package com.google.android.gms.internal.ads;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbmb implements zzbls {

    /* renamed from: a */
    private final zzaxb f23217a;

    public zzbmb(zzaxb zzaxbVar) {
        this.f23217a = zzaxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    /* renamed from: a */
    public final void mo17873a(Map<String, String> map) {
        String str = map.get(RoomNotification.KEY);
        String str2 = map.get("value");
        if ("auto_collect_location".equals(str)) {
            this.f23217a.mo17100n(Boolean.parseBoolean(str2));
        }
    }
}
