package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class DefaultClock implements Clock {

    /* renamed from: a */
    private static final DefaultClock f17979a = new DefaultClock();

    private DefaultClock() {
    }

    @KeepForSdk
    /* renamed from: c */
    public static Clock m14620c() {
        return f17979a;
    }

    @Override // com.google.android.gms.common.util.Clock
    /* renamed from: a */
    public final long mo14608a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    /* renamed from: b */
    public final long mo14609b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long nanoTime() {
        return System.nanoTime();
    }
}
