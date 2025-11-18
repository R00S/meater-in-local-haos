package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdha;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class zzdca<P> {

    /* renamed from: a */
    private static final Charset f25465a = Charset.forName("UTF-8");

    /* renamed from: b */
    private ConcurrentMap<String, List<zzdcb<P>>> f25466b = new ConcurrentHashMap();

    /* renamed from: c */
    private zzdcb<P> f25467c;

    /* renamed from: d */
    private final Class<P> f25468d;

    private zzdca(Class<P> cls) {
        this.f25468d = cls;
    }

    /* renamed from: a */
    public static <P> zzdca<P> m19196a(Class<P> cls) {
        return new zzdca<>(cls);
    }

    /* renamed from: b */
    public final zzdcb<P> m19197b(P p, zzdha.zzb zzbVar) throws GeneralSecurityException {
        byte[] bArrArray;
        int i2 = C6535br.f18353a[zzbVar.m19465x().ordinal()];
        if (i2 == 1 || i2 == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzbVar.m19464B()).array();
        } else if (i2 == 3) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzbVar.m19464B()).array();
        } else {
            if (i2 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = zzdbm.f25457a;
        }
        zzdcb<P> zzdcbVar = new zzdcb<>(p, bArrArray, zzbVar.m19463A(), zzbVar.m19465x());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzdcbVar);
        String str = new String(zzdcbVar.m19203c(), f25465a);
        List<zzdcb<P>> listPut = this.f25466b.put(str, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(zzdcbVar);
            this.f25466b.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zzdcbVar;
    }

    /* renamed from: c */
    public final void m19198c(zzdcb<P> zzdcbVar) {
        this.f25467c = zzdcbVar;
    }

    /* renamed from: d */
    public final Class<P> m19199d() {
        return this.f25468d;
    }

    /* renamed from: e */
    public final zzdcb<P> m19200e() {
        return this.f25467c;
    }
}
