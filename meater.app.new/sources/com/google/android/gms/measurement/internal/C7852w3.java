package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* loaded from: classes2.dex */
final class C7852w3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private final String f28970f;

    /* renamed from: g */
    private final /* synthetic */ zzfu f28971g;

    public C7852w3(zzfu zzfuVar, String str) {
        this.f28971g = zzfuVar;
        Preconditions.m14372k(str);
        this.f28970f = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f28971g.mo22836h().m23137H().m23148b(this.f28970f, th);
    }
}
