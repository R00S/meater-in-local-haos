package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes2.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    final int f33439a;

    /* renamed from: b, reason: collision with root package name */
    final C5209k f33440b = new C5209k();

    /* renamed from: c, reason: collision with root package name */
    final int f33441c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f33442d;

    j(int i10, int i11, Bundle bundle) {
        this.f33439a = i10;
        this.f33441c = i11;
        this.f33442d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f33440b.b(zztVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f33440b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f33441c + " id=" + this.f33439a + " oneWay=" + b() + "}";
    }
}
