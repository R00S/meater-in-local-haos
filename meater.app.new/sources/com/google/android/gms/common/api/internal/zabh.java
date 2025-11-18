package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zam;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zabh {

    /* renamed from: a */
    private static final ExecutorService f17548a = zam.m20898a().mo20888a(2, new NumberedThreadFactory("GAC_Executor"), 9);

    /* renamed from: a */
    public static ExecutorService m14182a() {
        return f17548a;
    }
}
