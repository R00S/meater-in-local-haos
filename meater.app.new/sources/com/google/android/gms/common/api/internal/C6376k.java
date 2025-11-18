package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes2.dex */
final class C6376k extends AbstractC6400w {

    /* renamed from: b */
    private final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f17421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6376k(C6372i c6372i, zabd zabdVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabdVar);
        this.f17421b = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC6400w
    /* renamed from: a */
    public final void mo14060a() {
        this.f17421b.mo13980a(new ConnectionResult(16, null));
    }
}
