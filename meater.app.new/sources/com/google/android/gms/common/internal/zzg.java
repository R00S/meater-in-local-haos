package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzg extends AbstractC6426i {

    /* renamed from: g */
    final /* synthetic */ BaseGmsClient f17856g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i2, Bundle bundle) {
        super(baseGmsClient, i2, null);
        this.f17856g = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6426i
    /* renamed from: f */
    protected final void mo14404f(ConnectionResult connectionResult) {
        if (this.f17856g.enableLocalFallback() && BaseGmsClient.zzo(this.f17856g)) {
            BaseGmsClient.zzk(this.f17856g, 16);
        } else {
            this.f17856g.zzc.mo13980a(connectionResult);
            this.f17856g.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6426i
    /* renamed from: g */
    protected final boolean mo14405g() {
        this.f17856g.zzc.mo13980a(ConnectionResult.f17198f);
        return true;
    }
}
