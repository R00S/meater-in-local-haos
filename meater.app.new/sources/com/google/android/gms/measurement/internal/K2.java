package com.google.android.gms.measurement.internal;

import g7.C3445p;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class K2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f35017a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ J2 f35018b;

    public K2(J2 j22, String str) {
        this.f35018b = j22;
        C3445p.k(str);
        this.f35017a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f35018b.k().H().b(this.f35017a, th);
    }
}
