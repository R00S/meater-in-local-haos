package io.sentry.android.core.internal.util;

import io.sentry.C9657v0;
import io.sentry.EnumC9587s4;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: BreadcrumbFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.i */
/* loaded from: classes2.dex */
public class C9312i {
    /* renamed from: a */
    public static C9657v0 m30278a(String str) {
        C9657v0 c9657v0 = new C9657v0();
        c9657v0.m31844p("session");
        c9657v0.m31841m("state", str);
        c9657v0.m31840l("app.lifecycle");
        c9657v0.m31842n(EnumC9587s4.INFO);
        return c9657v0;
    }
}
