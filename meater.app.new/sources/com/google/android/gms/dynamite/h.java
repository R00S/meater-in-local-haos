package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class h implements DynamiteModule.a {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0461a interfaceC0461a) {
        int iA;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC0461a.b(context, str);
        bVar.f33559a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = interfaceC0461a.a(context, str, false);
            bVar.f33560b = iA;
        } else {
            iA = interfaceC0461a.a(context, str, true);
            bVar.f33560b = iA;
        }
        int i12 = bVar.f33559a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            bVar.f33561c = i10;
            return bVar;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        bVar.f33561c = i10;
        return bVar;
    }
}
