package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzaup extends zzatr {

    /* renamed from: f */
    private final String f22526f;

    /* renamed from: g */
    private final int f22527g;

    public zzaup(zzato zzatoVar) {
        this(zzatoVar != null ? zzatoVar.f22516f : HttpUrl.FRAGMENT_ENCODE_SET, zzatoVar != null ? zzatoVar.f22517g : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final int getAmount() throws RemoteException {
        return this.f22527g;
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final String getType() throws RemoteException {
        return this.f22526f;
    }

    public zzaup(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : HttpUrl.FRAGMENT_ENCODE_SET, rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzaup(String str, int i2) {
        this.f22526f = str;
        this.f22527g = i2;
    }
}
