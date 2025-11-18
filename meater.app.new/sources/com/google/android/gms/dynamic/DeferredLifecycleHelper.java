package com.google.android.gms.dynamic;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.LifecycleDelegate;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {

    /* renamed from: a */
    private final OnDelegateCreatedListener<T> f18031a = new C6455a(this);

    @KeepForSdk
    public DeferredLifecycleHelper() {
    }
}
