package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class H5 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f34869B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f34870C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ Bundle f34871D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ I5 f34872E;

    H5(I5 i52, String str, String str2, Bundle bundle) {
        this.f34869B = str;
        this.f34870C = str2;
        this.f34871D = bundle;
        this.f34872E = i52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34872E.f34888a.z((J) C3445p.k(this.f34872E.f34888a.L0().I(this.f34869B, this.f34870C, this.f34871D, "auto", this.f34872E.f34888a.b().a(), false, true)), this.f34869B);
    }
}
