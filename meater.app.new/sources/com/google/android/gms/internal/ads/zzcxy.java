package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcxy {
    /* renamed from: a */
    public static zzyd m19058a(Context context, List<zzcxn> list) {
        ArrayList arrayList = new ArrayList();
        for (zzcxn zzcxnVar : list) {
            if (zzcxnVar.f25271c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzcxnVar.f25269a, zzcxnVar.f25270b));
            }
        }
        return new zzyd(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }
}
