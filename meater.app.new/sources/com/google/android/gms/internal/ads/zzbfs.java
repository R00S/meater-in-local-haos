package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzbfs implements Iterable<zzbfq> {

    /* renamed from: f */
    private final List<zzbfq> f22969f = new ArrayList();

    /* renamed from: g */
    public static boolean m17619g(zzbdf zzbdfVar) {
        zzbfq zzbfqVarM17620h = m17620h(zzbdfVar);
        if (zzbfqVarM17620h == null) {
            return false;
        }
        zzbfqVarM17620h.f22966b.mo17627b();
        return true;
    }

    /* renamed from: h */
    static zzbfq m17620h(zzbdf zzbdfVar) {
        Iterator<zzbfq> it = zzk.zzmc().iterator();
        while (it.hasNext()) {
            zzbfq next = it.next();
            if (next.f22965a == zzbdfVar) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m17621c(zzbfq zzbfqVar) {
        this.f22969f.add(zzbfqVar);
    }

    /* renamed from: f */
    public final void m17622f(zzbfq zzbfqVar) {
        this.f22969f.remove(zzbfqVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzbfq> iterator() {
        return this.f22969f.iterator();
    }
}
