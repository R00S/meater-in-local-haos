package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class I3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f34877B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f34878C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ long f34879D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ Bundle f34880E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ boolean f34881F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ boolean f34882G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ boolean f34883H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ String f34884I;

    /* renamed from: J, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f34885J;

    I3(C2843t3 c2843t3, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f34877B = str;
        this.f34878C = str2;
        this.f34879D = j10;
        this.f34880E = bundle;
        this.f34881F = z10;
        this.f34882G = z11;
        this.f34883H = z12;
        this.f34884I = str3;
        this.f34885J = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f34885J.j0(this.f34877B, this.f34878C, this.f34879D, this.f34880E, this.f34881F, this.f34882G, this.f34883H, this.f34884I);
    }
}
