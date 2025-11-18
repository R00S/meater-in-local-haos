package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.dynamite.i */
/* loaded from: classes2.dex */
final class C6464i implements DynamiteModule.VersionPolicy {
    C6464i() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo14724a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int iMo14725a;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iMo14726b = iVersions.mo14726b(context, str);
        selectionResult.f18056a = iMo14726b;
        int i2 = 0;
        if (iMo14726b != 0) {
            iMo14725a = iVersions.mo14725a(context, str, false);
            selectionResult.f18057b = iMo14725a;
        } else {
            iMo14725a = iVersions.mo14725a(context, str, true);
            selectionResult.f18057b = iMo14725a;
        }
        int i3 = selectionResult.f18056a;
        if (i3 == 0) {
            if (iMo14725a == 0) {
                selectionResult.f18058c = 0;
            }
            return selectionResult;
        }
        i2 = i3;
        if (i2 >= iMo14725a) {
            selectionResult.f18058c = -1;
        } else {
            selectionResult.f18058c = 1;
        }
        return selectionResult;
    }
}
