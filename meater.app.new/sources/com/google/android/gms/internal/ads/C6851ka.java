package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzard
/* renamed from: com.google.android.gms.internal.ads.ka */
/* loaded from: classes2.dex */
final class C6851ka {

    /* renamed from: a */
    private final ArrayList<zzsa> f19528a = new ArrayList<>();

    /* renamed from: b */
    private long f19529b;

    C6851ka() {
    }

    /* renamed from: a */
    final void m15397a(zzsa zzsaVar) {
        this.f19528a.add(zzsaVar);
    }

    /* renamed from: b */
    final long m15398b() throws NumberFormatException {
        Iterator<zzsa> it = this.f19528a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> mapM20466b = it.next().m20466b();
            if (mapM20466b != null) {
                for (Map.Entry<String, List<String>> entry : mapM20466b.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.f19529b = Math.max(this.f19529b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f19529b;
    }
}
