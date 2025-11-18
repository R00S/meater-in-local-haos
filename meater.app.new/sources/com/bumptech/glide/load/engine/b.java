package com.bumptech.glide.load.engine;

/* compiled from: CallbackException.java */
/* loaded from: classes2.dex */
final class b extends RuntimeException {
    b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
