package com.squareup.picasso;

/* loaded from: classes2.dex */
public interface Callback {

    public static class EmptyCallback implements Callback {
        @Override // com.squareup.picasso.Callback
        public void onError() {
        }

        @Override // com.squareup.picasso.Callback
        public void onSuccess() {
        }
    }

    void onError();

    void onSuccess();
}
