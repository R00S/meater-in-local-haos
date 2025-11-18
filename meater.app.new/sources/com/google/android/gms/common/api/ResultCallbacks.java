package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    /* renamed from: a */
    public final void mo13908a(R r) {
        Status status = r.getStatus();
        if (status.m13915e0()) {
            m13909c(r);
            return;
        }
        mo13904b(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).mo13849c();
            } catch (RuntimeException e2) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r)), e2);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo13904b(Status status);

    /* renamed from: c */
    public abstract void m13909c(R r);
}
