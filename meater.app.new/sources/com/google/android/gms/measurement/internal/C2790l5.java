package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2790l5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2727c5 f35444a;

    C2790l5(C2727c5 c2727c5) {
        this.f35444a = c2727c5;
    }

    private final void c(long j10, boolean z10) {
        this.f35444a.n();
        if (this.f35444a.f35457a.s()) {
            this.f35444a.h().f35612r.b(j10);
            this.f35444a.k().L().b("Session started, time", Long.valueOf(this.f35444a.b().c()));
            long j11 = j10 / 1000;
            this.f35444a.s().o0("auto", "_sid", Long.valueOf(j11), j10);
            this.f35444a.h().f35613s.b(j11);
            this.f35444a.h().f35608n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            this.f35444a.s().i0("auto", "_s", j10, bundle);
            String strA = this.f35444a.h().f35618x.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            this.f35444a.s().i0("auto", "_ssr", j10, bundle2);
        }
    }

    final void a() {
        this.f35444a.n();
        if (this.f35444a.h().z(this.f35444a.b().a())) {
            this.f35444a.h().f35608n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f35444a.k().L().a("Detected application was in foreground");
                c(this.f35444a.b().a(), false);
            }
        }
    }

    final void b(long j10, boolean z10) {
        this.f35444a.n();
        this.f35444a.I();
        if (this.f35444a.h().z(j10)) {
            this.f35444a.h().f35608n.a(true);
            this.f35444a.q().L();
        }
        this.f35444a.h().f35612r.b(j10);
        if (this.f35444a.h().f35608n.b()) {
            c(j10, z10);
        }
    }
}
