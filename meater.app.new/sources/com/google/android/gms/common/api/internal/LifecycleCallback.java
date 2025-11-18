package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleCallback {

    /* renamed from: f */
    @KeepForSdk
    protected final LifecycleFragment f17375f;

    @KeepForSdk
    protected LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f17375f = lifecycleFragment;
    }

    @KeepForSdk
    /* renamed from: c */
    protected static LifecycleFragment m14030c(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.m14029d()) {
            return zzd.m14254f(lifecycleActivity.m14027b());
        }
        if (lifecycleActivity.m14028c()) {
            return zzb.m14251f(lifecycleActivity.m14026a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo14031a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @KeepForSdk
    /* renamed from: b */
    public Activity m14032b() {
        Activity activityMo14042c = this.f17375f.mo14042c();
        Preconditions.m14372k(activityMo14042c);
        return activityMo14042c;
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo14033d(int i2, int i3, Intent intent) {
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo14034e(Bundle bundle) {
    }

    @KeepForSdk
    /* renamed from: f */
    public void mo14035f() {
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo14036g() {
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo14037h(Bundle bundle) {
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo14038i() {
    }

    @KeepForSdk
    /* renamed from: j */
    public void mo14039j() {
    }
}
