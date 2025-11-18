package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public interface LifecycleFragment {
    @KeepForSdk
    /* renamed from: a */
    void mo14040a(String str, LifecycleCallback lifecycleCallback);

    @KeepForSdk
    /* renamed from: b */
    <T extends LifecycleCallback> T mo14041b(String str, Class<T> cls);

    @KeepForSdk
    /* renamed from: c */
    Activity mo14042c();

    @KeepForSdk
    void startActivityForResult(Intent intent, int i2);
}
