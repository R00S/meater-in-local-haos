package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uy */
/* loaded from: classes2.dex */
final class C7245uy implements o30 {

    /* renamed from: a */
    private final Map<String, List<zzr<?>>> f20658a = new HashMap();

    /* renamed from: b */
    private final zzd f20659b;

    C7245uy(zzd zzdVar) {
        this.f20659b = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized boolean m15945d(zzr<?> zzrVar) {
        String strM20421M = zzrVar.m20421M();
        if (!this.f20658a.containsKey(strM20421M)) {
            this.f20658a.put(strM20421M, null);
            zzrVar.m20414D(this);
            if (zzag.f21996b) {
                zzag.m16526a("new request, sending to network %s", strM20421M);
            }
            return false;
        }
        List<zzr<?>> arrayList = this.f20658a.get(strM20421M);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        zzrVar.m20418I("waiting-for-response");
        arrayList.add(zzrVar);
        this.f20658a.put(strM20421M, arrayList);
        if (zzag.f21996b) {
            zzag.m16526a("Request for cacheKey=%s is in flight, putting on hold.", strM20421M);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o30
    /* renamed from: a */
    public final synchronized void mo15671a(zzr<?> zzrVar) {
        String strM20421M = zzrVar.m20421M();
        List<zzr<?>> listRemove = this.f20658a.remove(strM20421M);
        if (listRemove != null && !listRemove.isEmpty()) {
            if (zzag.f21996b) {
                zzag.m16528c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strM20421M);
            }
            zzr<?> zzrVarRemove = listRemove.remove(0);
            this.f20658a.put(strM20421M, listRemove);
            zzrVarRemove.m20414D(this);
            try {
                this.f20659b.f25404h.put(zzrVarRemove);
            } catch (InterruptedException e2) {
                zzag.m16527b("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f20659b.m19121b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o30
    /* renamed from: b */
    public final void mo15672b(zzr<?> zzrVar, zzy<?> zzyVar) {
        List<zzr<?>> listRemove;
        zzc zzcVar = zzyVar.f27424b;
        if (zzcVar == null || zzcVar.m18612a()) {
            mo15671a(zzrVar);
            return;
        }
        String strM20421M = zzrVar.m20421M();
        synchronized (this) {
            listRemove = this.f20658a.remove(strM20421M);
        }
        if (listRemove != null) {
            if (zzag.f21996b) {
                zzag.m16528c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strM20421M);
            }
            Iterator<zzr<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f20659b.f25406j.mo16227c(it.next(), zzyVar);
            }
        }
    }
}
