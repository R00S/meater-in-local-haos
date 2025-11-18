package io.sentry.android.core.internal.util;

import io.sentry.protocol.C9546e;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DeviceOrientations.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.o */
/* loaded from: classes2.dex */
public final class C9318o {
    /* renamed from: a */
    public static C9546e.b m30292a(int i2) {
        if (i2 == 1) {
            return C9546e.b.PORTRAIT;
        }
        if (i2 != 2) {
            return null;
        }
        return C9546e.b.LANDSCAPE;
    }
}
