package io.sentry.android.core;

import android.content.Context;
import io.sentry.Integration;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AnrIntegrationFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.o0 */
/* loaded from: classes2.dex */
public final class C9336o0 {
    /* renamed from: a */
    public static Integration m30353a(Context context, C9344s0 c9344s0) {
        return c9344s0.m30406d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
