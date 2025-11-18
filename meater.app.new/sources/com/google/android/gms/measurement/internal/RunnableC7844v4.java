package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* loaded from: classes2.dex */
final class RunnableC7844v4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f28952f;

    /* renamed from: g */
    private final /* synthetic */ String f28953g;

    /* renamed from: h */
    private final /* synthetic */ long f28954h;

    /* renamed from: i */
    private final /* synthetic */ Bundle f28955i;

    /* renamed from: j */
    private final /* synthetic */ boolean f28956j;

    /* renamed from: k */
    private final /* synthetic */ boolean f28957k;

    /* renamed from: l */
    private final /* synthetic */ boolean f28958l;

    /* renamed from: m */
    private final /* synthetic */ String f28959m;

    /* renamed from: n */
    private final /* synthetic */ zzhc f28960n;

    RunnableC7844v4(zzhc zzhcVar, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f28960n = zzhcVar;
        this.f28952f = str;
        this.f28953g = str2;
        this.f28954h = j2;
        this.f28955i = bundle;
        this.f28956j = z;
        this.f28957k = z2;
        this.f28958l = z3;
        this.f28959m = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f28960n.m23280Q(this.f28952f, this.f28953g, this.f28954h, this.f28955i, this.f28956j, this.f28957k, this.f28958l, this.f28959m);
    }
}
