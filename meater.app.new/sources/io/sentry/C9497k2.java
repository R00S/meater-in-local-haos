package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: JavaMemoryCollector.java */
@ApiStatus.Internal
/* renamed from: io.sentry.k2 */
/* loaded from: classes2.dex */
public final class C9497k2 implements InterfaceC9577r1 {

    /* renamed from: a */
    private final Runtime f36399a = Runtime.getRuntime();

    @Override // io.sentry.InterfaceC9577r1
    /* renamed from: a */
    public void mo30203a(C9498k3 c9498k3) {
        c9498k3.m30915b(new C9671w2(System.currentTimeMillis(), this.f36399a.totalMemory() - this.f36399a.freeMemory()));
    }

    @Override // io.sentry.InterfaceC9577r1
    public void setup() {
    }
}
