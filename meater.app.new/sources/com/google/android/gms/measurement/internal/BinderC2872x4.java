package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import v7.AbstractBinderC4909k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2872x4 extends AbstractBinderC4909k {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35714B;

    BinderC2872x4(C2837s4 c2837s4, AtomicReference atomicReference) {
        this.f35714B = atomicReference;
    }

    @Override // v7.InterfaceC4907i
    public final void c0(List<C2797m5> list) {
        synchronized (this.f35714B) {
            this.f35714B.set(list);
            this.f35714B.notifyAll();
        }
    }
}
