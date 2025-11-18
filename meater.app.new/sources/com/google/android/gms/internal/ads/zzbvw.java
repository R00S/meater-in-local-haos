package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbvw implements zzdti<zzbvq> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> f23609a;

    private zzbvw(zzdtu<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> zzdtuVar) {
        this.f23609a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbvw m18399a(zzdtu<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> zzdtuVar) {
        return new zzbvw(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbvq(this.f23609a.get());
    }
}
