package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* loaded from: classes2.dex */
class FetchAction extends Action<Object> {
    private Callback callback;
    private final Object target;

    FetchAction(Picasso picasso, Request request, int i2, int i3, Object obj, String str, Callback callback) {
        super(picasso, null, request, i2, i3, 0, null, str, obj, false);
        this.target = new Object();
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    void cancel() {
        super.cancel();
        this.callback = null;
    }

    @Override // com.squareup.picasso.Action
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    void error() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onError();
        }
    }

    @Override // com.squareup.picasso.Action
    Object getTarget() {
        return this.target;
    }
}
