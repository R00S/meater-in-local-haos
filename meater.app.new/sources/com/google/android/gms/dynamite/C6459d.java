package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes2.dex */
final class C6459d implements DynamiteModule.VersionPolicy.IVersions {
    C6459d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: a */
    public final int mo14725a(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        return DynamiteModule.m14715f(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: b */
    public final int mo14726b(Context context, String str) {
        return DynamiteModule.m14712a(context, str);
    }
}
