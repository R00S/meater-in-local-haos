package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.dynamite.g */
/* loaded from: classes2.dex */
final class C6462g implements DynamiteModule.VersionPolicy {
    C6462g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo14724a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iMo14725a = iVersions.mo14725a(context, str, false);
        selectionResult.f18057b = iMo14725a;
        if (iMo14725a == 0) {
            selectionResult.f18058c = 0;
        } else {
            selectionResult.f18058c = 1;
        }
        return selectionResult;
    }
}
