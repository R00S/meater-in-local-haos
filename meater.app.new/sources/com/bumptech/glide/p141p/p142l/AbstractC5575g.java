package com.bumptech.glide.p141p.p142l;

import com.bumptech.glide.p145r.C5597k;

/* compiled from: SimpleTarget.java */
@Deprecated
/* renamed from: com.bumptech.glide.p.l.g */
/* loaded from: classes.dex */
public abstract class AbstractC5575g<Z> extends AbstractC5569a<Z> {
    private final int height;
    private final int width;

    public AbstractC5575g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public final void getSize(InterfaceC5576h interfaceC5576h) {
        if (C5597k.m11063t(this.width, this.height)) {
            interfaceC5576h.mo10970g(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void removeCallback(InterfaceC5576h interfaceC5576h) {
    }

    public AbstractC5575g(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }
}
