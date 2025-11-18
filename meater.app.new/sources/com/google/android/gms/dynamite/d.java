package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class d implements DynamiteModule.a {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0461a interfaceC0461a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iA = interfaceC0461a.a(context, str, true);
        bVar.f33560b = iA;
        if (iA != 0) {
            bVar.f33561c = 1;
        } else {
            int iB = interfaceC0461a.b(context, str);
            bVar.f33559a = iB;
            if (iB != 0) {
                bVar.f33561c = -1;
            }
        }
        return bVar;
    }
}
