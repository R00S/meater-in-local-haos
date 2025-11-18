package com.bumptech.glide.p141p.p142l;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p138m.InterfaceC5540i;
import com.bumptech.glide.p141p.InterfaceC5561d;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;

/* compiled from: Target.java */
/* renamed from: com.bumptech.glide.p.l.i */
/* loaded from: classes.dex */
public interface InterfaceC5577i<R> extends InterfaceC5540i {
    InterfaceC5561d getRequest();

    void getSize(InterfaceC5576h interfaceC5576h);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, InterfaceC5582d<? super R> interfaceC5582d);

    void removeCallback(InterfaceC5576h interfaceC5576h);

    void setRequest(InterfaceC5561d interfaceC5561d);
}
