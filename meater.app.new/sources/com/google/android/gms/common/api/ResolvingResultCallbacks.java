package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* renamed from: a */
    private final Activity f17285a;

    /* renamed from: b */
    private final int f17286b;

    @Override // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    /* renamed from: b */
    public final void mo13904b(Status status) {
        if (!status.m13914Y()) {
            m13905d(status);
            return;
        }
        try {
            status.m13916i0(this.f17285a, this.f17286b);
        } catch (IntentSender.SendIntentException e2) {
            Log.e("ResolvingResultCallback", "Failed to start resolution", e2);
            m13905d(new Status(8));
        }
    }

    /* renamed from: d */
    public abstract void m13905d(Status status);
}
