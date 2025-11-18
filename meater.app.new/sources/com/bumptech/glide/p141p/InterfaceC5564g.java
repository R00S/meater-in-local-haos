package com.bumptech.glide.p141p;

import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;

/* compiled from: RequestListener.java */
/* renamed from: com.bumptech.glide.p.g */
/* loaded from: classes.dex */
public interface InterfaceC5564g<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC5577i<R> interfaceC5577i, boolean z);

    boolean onResourceReady(R r, Object obj, InterfaceC5577i<R> interfaceC5577i, EnumC5365a enumC5365a, boolean z);
}
