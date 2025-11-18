package io.sentry.android.core;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: AppState.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.r0 */
/* loaded from: classes2.dex */
public final class C9342r0 {

    /* renamed from: a */
    private static C9342r0 f36097a = new C9342r0();

    /* renamed from: b */
    private Boolean f36098b = null;

    private C9342r0() {
    }

    /* renamed from: a */
    public static C9342r0 m30399a() {
        return f36097a;
    }

    /* renamed from: b */
    public Boolean m30400b() {
        return this.f36098b;
    }

    /* renamed from: c */
    synchronized void m30401c(boolean z) {
        this.f36098b = Boolean.valueOf(z);
    }
}
