package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* loaded from: classes2.dex */
class GetAction extends Action<Void> {
    GetAction(Picasso picasso, Request request, int i2, int i3, Object obj, String str) {
        super(picasso, null, request, i2, i3, 0, null, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }

    @Override // com.squareup.picasso.Action
    public void error() {
    }
}
