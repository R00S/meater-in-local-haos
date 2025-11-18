package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zacc {

    /* renamed from: a */
    private static final ExecutorService f17558a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NumberedThreadFactory("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m14187a() {
        return f17558a;
    }
}
