package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* loaded from: classes2.dex */
final class RunnableC7773n5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f28794f;

    /* renamed from: g */
    private final /* synthetic */ Uri f28795g;

    /* renamed from: h */
    private final /* synthetic */ String f28796h;

    /* renamed from: i */
    private final /* synthetic */ String f28797i;

    /* renamed from: j */
    private final /* synthetic */ C7755l5 f28798j;

    RunnableC7773n5(C7755l5 c7755l5, boolean z, Uri uri, String str, String str2) {
        this.f28798j = c7755l5;
        this.f28794f = z;
        this.f28795g = uri;
        this.f28796h = str;
        this.f28797i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28798j.m22801b(this.f28794f, this.f28795g, this.f28796h, this.f28797i);
    }
}
