package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes2.dex */
abstract class AbstractC6426i extends zzc {

    /* renamed from: d */
    public final int f17817d;

    /* renamed from: e */
    public final Bundle f17818e;

    /* renamed from: f */
    final /* synthetic */ BaseGmsClient f17819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC6426i(BaseGmsClient baseGmsClient, int i2, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f17819f = baseGmsClient;
        this.f17817d = i2;
        this.f17818e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo14402a(Object obj) {
        if (this.f17817d != 0) {
            this.f17819f.zzp(1, null);
            Bundle bundle = this.f17818e;
            mo14404f(new ConnectionResult(this.f17817d, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else {
            if (mo14405g()) {
                return;
            }
            this.f17819f.zzp(1, null);
            mo14404f(new ConnectionResult(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.zzc
    /* renamed from: b */
    protected final void mo14403b() {
    }

    /* renamed from: f */
    protected abstract void mo14404f(ConnectionResult connectionResult);

    /* renamed from: g */
    protected abstract boolean mo14405g();
}
