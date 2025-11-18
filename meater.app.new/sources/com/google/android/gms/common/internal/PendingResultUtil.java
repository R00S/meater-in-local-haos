package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* loaded from: classes2.dex */
public class PendingResultUtil {

    /* renamed from: a */
    private static final zaa f17774a = new C6423f();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        /* renamed from: a */
        T mo13664a(R r);
    }

    public interface zaa {
        /* renamed from: a */
        ApiException mo14361a(Status status);
    }

    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result, T extends Response<R>> Task<T> m14359a(PendingResult<R> pendingResult, T t) {
        return m14360b(pendingResult, new C6425h(t));
    }

    @KeepForSdk
    /* renamed from: b */
    public static <R extends Result, T> Task<T> m14360b(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zaa zaaVar = f17774a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.mo13896b(new C6424g(pendingResult, taskCompletionSource, resultConverter, zaaVar));
        return taskCompletionSource.m23654a();
    }
}
