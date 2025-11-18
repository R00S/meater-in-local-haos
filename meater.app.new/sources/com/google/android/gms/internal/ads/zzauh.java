package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

@zzard
/* loaded from: classes2.dex */
public final class zzauh implements RewardItem {

    /* renamed from: a */
    private final zzatq f22520a;

    public zzauh(zzatq zzatqVar) {
        this.f22520a = zzatqVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzatq zzatqVar = this.f22520a;
        if (zzatqVar == null) {
            return 0;
        }
        try {
            return zzatqVar.getAmount();
        } catch (RemoteException e2) {
            zzbad.m17348d("Could not forward getAmount to RewardItem", e2);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzatq zzatqVar = this.f22520a;
        if (zzatqVar == null) {
            return null;
        }
        try {
            return zzatqVar.getType();
        } catch (RemoteException e2) {
            zzbad.m17348d("Could not forward getType to RewardItem", e2);
            return null;
        }
    }
}
