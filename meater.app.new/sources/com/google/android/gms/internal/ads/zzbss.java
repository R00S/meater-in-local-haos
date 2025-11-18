package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbss extends zzbts<AdMetadataListener> implements zzagv {

    /* renamed from: g */
    private Bundle f23539g;

    public zzbss(Set<zzbuz<AdMetadataListener>> set) {
        super(set);
        this.f23539g = new Bundle();
    }

    /* renamed from: Y */
    public final synchronized Bundle m18317Y() {
        return new Bundle(this.f23539g);
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    /* renamed from: k */
    public final synchronized void mo15747k(String str, Bundle bundle) {
        this.f23539g.putAll(bundle);
        m18330T(C6707ge.f18975a);
    }
}
