package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzard
@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.c4 */
/* loaded from: classes2.dex */
final class C6549c4 {

    /* renamed from: a */
    private static final Map<String, String> f18402a;

    /* renamed from: b */
    private final Context f18403b;

    /* renamed from: c */
    private final List<String> f18404c;

    /* renamed from: d */
    private final zzauq f18405d;

    static {
        HashMap map = new HashMap();
        if (PlatformVersion.m14644h()) {
            map.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            map.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f18402a = map;
    }

    C6549c4(Context context, List<String> list, zzauq zzauqVar) {
        this.f18403b = context;
        this.f18404c = list;
        this.f18405d = zzauqVar;
    }

    /* renamed from: a */
    final List<String> m14963a(String[] strArr) {
        boolean z;
        boolean z2;
        String next;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = this.f18404c.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                next = it.next();
                if (next.equals(str)) {
                    break;
                }
            } while (!(next.length() != 0 ? "android.webkit.resource.".concat(next) : new String("android.webkit.resource.")).equals(str));
            z2 = true;
            if (z2) {
                Map<String, String> map = f18402a;
                if (map.containsKey(str)) {
                    zzk.zzlg();
                    if (!zzaxi.m17152f0(this.f18403b, map.get(str))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                } else {
                    this.f18405d.m16978l(str);
                }
            } else {
                this.f18405d.m16977k(str);
            }
        }
        return arrayList;
    }
}
