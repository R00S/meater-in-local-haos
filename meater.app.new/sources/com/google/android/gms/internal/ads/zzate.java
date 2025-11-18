package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

@zzard
/* loaded from: classes2.dex */
public final class zzate implements RewardItem {

    /* renamed from: a */
    private final zzasr f22505a;

    public zzate(zzasr zzasrVar) {
        this.f22505a = zzasrVar;
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final int getAmount() {
        zzasr zzasrVar = this.f22505a;
        if (zzasrVar == null) {
            return 0;
        }
        try {
            return zzasrVar.getAmount();
        } catch (RemoteException e2) {
            zzbad.m17348d("Could not forward getAmount to RewardItem", e2);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final String getType() {
        zzasr zzasrVar = this.f22505a;
        if (zzasrVar == null) {
            return null;
        }
        try {
            return zzasrVar.getType();
        } catch (RemoteException e2) {
            zzbad.m17348d("Could not forward getType to RewardItem", e2);
            return null;
        }
    }
}
