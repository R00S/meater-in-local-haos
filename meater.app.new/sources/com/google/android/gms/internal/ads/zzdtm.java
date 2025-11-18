package com.google.android.gms.internal.ads;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class zzdtm<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, zzdtu<V>> f25991a;

    private zzdtm(int i2) {
        this.f25991a = zzdtf.m19864c(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final zzdtm<K, V> m19871a(K k2, zzdtu<V> zzdtuVar) {
        this.f25991a.put(zzdto.m19874b(k2, RoomNotification.KEY), (zzdtu) zzdto.m19874b(zzdtuVar, "provider"));
        return this;
    }

    /* renamed from: b */
    public final zzdtk<K, V> m19872b() {
        return new zzdtk<>(this.f25991a);
    }
}
