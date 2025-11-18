package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2733d4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ boolean f35324B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ Uri f35325C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35326D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ String f35327E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2726c4 f35328F;

    RunnableC2733d4(C2726c4 c2726c4, boolean z10, Uri uri, String str, String str2) {
        this.f35324B = z10;
        this.f35325C = uri;
        this.f35326D = str;
        this.f35327E = str2;
        this.f35328F = c2726c4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2726c4.f(this.f35328F, this.f35324B, this.f35325C, this.f35326D, this.f35327E);
    }
}
