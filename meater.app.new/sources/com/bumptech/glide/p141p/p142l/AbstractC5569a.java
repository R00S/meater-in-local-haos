package com.bumptech.glide.p141p.p142l;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p141p.InterfaceC5561d;

/* compiled from: BaseTarget.java */
@Deprecated
/* renamed from: com.bumptech.glide.p.l.a */
/* loaded from: classes.dex */
public abstract class AbstractC5569a<Z> implements InterfaceC5577i<Z> {
    private InterfaceC5561d request;

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public InterfaceC5561d getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStart() {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStop() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void setRequest(InterfaceC5561d interfaceC5561d) {
        this.request = interfaceC5561d;
    }
}
