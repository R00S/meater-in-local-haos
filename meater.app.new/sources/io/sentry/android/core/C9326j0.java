package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C9498k3;
import io.sentry.C9671w2;
import io.sentry.InterfaceC9577r1;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidMemoryCollector.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.j0 */
/* loaded from: classes2.dex */
public class C9326j0 implements InterfaceC9577r1 {
    @Override // io.sentry.InterfaceC9577r1
    /* renamed from: a */
    public void mo30203a(C9498k3 c9498k3) {
        c9498k3.m30915b(new C9671w2(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize()));
    }

    @Override // io.sentry.InterfaceC9577r1
    public void setup() {
    }
}
