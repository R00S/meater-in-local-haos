package i8;

import android.os.Bundle;
import j8.t;
import z7.C5209k;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
class j extends j8.g {

    /* renamed from: B, reason: collision with root package name */
    final j8.i f43157B;

    /* renamed from: C, reason: collision with root package name */
    final C5209k f43158C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ l f43159D;

    j(l lVar, j8.i iVar, C5209k c5209k) {
        this.f43159D = lVar;
        this.f43157B = iVar;
        this.f43158C = c5209k;
    }

    @Override // j8.h
    public void i(Bundle bundle) {
        t tVar = this.f43159D.f43161a;
        if (tVar != null) {
            tVar.u(this.f43158C);
        }
        this.f43157B.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
