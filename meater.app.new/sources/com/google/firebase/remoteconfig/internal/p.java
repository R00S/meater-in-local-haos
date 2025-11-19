package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import k9.InterfaceC3810e;

/* compiled from: ConfigRealtimeHandler.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Set<E9.c> f38728a;

    /* renamed from: b, reason: collision with root package name */
    private final s f38729b;

    /* renamed from: c, reason: collision with root package name */
    private final m f38730c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.f f38731d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3810e f38732e;

    /* renamed from: f, reason: collision with root package name */
    private final f f38733f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f38734g;

    /* renamed from: h, reason: collision with root package name */
    private final String f38735h;

    /* renamed from: i, reason: collision with root package name */
    private final t f38736i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f38737j;

    public p(com.google.firebase.f fVar, InterfaceC3810e interfaceC3810e, m mVar, f fVar2, Context context, String str, t tVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f38728a = linkedHashSet;
        this.f38729b = new s(fVar, interfaceC3810e, mVar, fVar2, context, str, linkedHashSet, tVar, scheduledExecutorService);
        this.f38731d = fVar;
        this.f38730c = mVar;
        this.f38732e = interfaceC3810e;
        this.f38733f = fVar2;
        this.f38734g = context;
        this.f38735h = str;
        this.f38736i = tVar;
        this.f38737j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.f38728a.isEmpty()) {
            this.f38729b.C();
        }
    }

    public synchronized void b(boolean z10) {
        this.f38729b.z(z10);
        if (!z10) {
            a();
        }
    }
}
