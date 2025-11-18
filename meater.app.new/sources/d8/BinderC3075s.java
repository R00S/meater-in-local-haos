package d8;

import android.os.Bundle;
import e8.AbstractBinderC3249l;
import e8.C3253p;
import z7.C5209k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class BinderC3075s extends AbstractBinderC3249l {

    /* renamed from: B, reason: collision with root package name */
    final C3253p f39777B;

    /* renamed from: C, reason: collision with root package name */
    final C5209k f39778C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ C3077u f39779D;

    BinderC3075s(C3077u c3077u, C3253p c3253p, C5209k c5209k) {
        this.f39779D = c3077u;
        this.f39777B = c3253p;
        this.f39778C = c5209k;
    }

    @Override // e8.InterfaceC3250m
    public void i(Bundle bundle) {
        this.f39779D.f39784a.u(this.f39778C);
        this.f39777B.c("onCompleteUpdate", new Object[0]);
    }

    @Override // e8.InterfaceC3250m
    public void t0(Bundle bundle) {
        this.f39779D.f39784a.u(this.f39778C);
        this.f39777B.c("onRequestInfo", new Object[0]);
    }
}
