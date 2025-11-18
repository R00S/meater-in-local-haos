package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.dynamite.m */
/* loaded from: classes2.dex */
final class C6468m implements DynamiteModule.VersionPolicy.IVersions {

    /* renamed from: a */
    private final int f18060a;

    public C6468m(int i2, int i3) {
        this.f18060a = i2;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: a */
    public final int mo14725a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: b */
    public final int mo14726b(Context context, String str) {
        return this.f18060a;
    }
}
