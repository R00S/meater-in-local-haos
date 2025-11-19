package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
import v7.AbstractBinderC4910l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2886z4 extends AbstractBinderC4910l {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35784B;

    BinderC2886z4(C2837s4 c2837s4, AtomicReference atomicReference) {
        this.f35784B = atomicReference;
    }

    @Override // v7.InterfaceC4911m
    public final void m(C2859v5 c2859v5) {
        synchronized (this.f35784B) {
            this.f35784B.set(c2859v5);
            this.f35784B.notifyAll();
        }
    }
}
