package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class zabu extends zal {

    /* renamed from: k */
    private TaskCompletionSource<Void> f17552k;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public void mo14035f() {
        super.mo14035f();
        this.f17552k.m23657d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.zal
    /* renamed from: l */
    protected final void mo14115l(ConnectionResult connectionResult, int i2) {
        this.f17552k.m23655b(ApiExceptionUtil.m14283a(new Status(connectionResult.m13797y(), connectionResult.m13798z(), connectionResult.m13793W())));
    }

    @Override // com.google.android.gms.common.api.internal.zal
    /* renamed from: n */
    protected final void mo14116n() {
        int iMo13812i = this.f17603j.mo13812i(this.f17375f.mo14042c());
        if (iMo13812i == 0) {
            this.f17552k.m23656c(null);
        } else {
            if (this.f17552k.m23654a().mo23650m()) {
                return;
            }
            m14217m(new ConnectionResult(iMo13812i, null), 0);
        }
    }
}
