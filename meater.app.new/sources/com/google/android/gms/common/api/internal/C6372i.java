package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes2.dex */
final class C6372i extends AbstractRunnableC6386p {

    /* renamed from: g */
    private final Map<Api.Client, C6370h> f17416g;

    /* renamed from: h */
    final /* synthetic */ zaak f17417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6372i(zaak zaakVar, Map<Api.Client, C6370h> map) {
        super(zaakVar, null);
        this.f17417h = zaakVar;
        this.f17416g = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC6386p
    /* renamed from: a */
    public final void mo14062a() {
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(this.f17417h.f17488d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f17416g.keySet()) {
            if (!client.requiresGooglePlayServices() || this.f17416g.get(client).f17413c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int iM14346b = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                iM14346b = googleApiAvailabilityCache.m14346b(this.f17417h.f17487c, (Api.Client) obj);
                if (iM14346b != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                iM14346b = googleApiAvailabilityCache.m14346b(this.f17417h.f17487c, (Api.Client) obj2);
                if (iM14346b == 0) {
                    break;
                }
            }
        }
        if (iM14346b != 0) {
            this.f17417h.f17485a.m14177h(new C6374j(this, this.f17417h, new ConnectionResult(iM14346b, null)));
            return;
        }
        if (this.f17417h.f17497m && this.f17417h.f17495k != null) {
            this.f17417h.f17495k.mo23614a();
        }
        for (Api.Client client2 : this.f17416g.keySet()) {
            C6370h c6370h = this.f17416g.get(client2);
            if (!client2.requiresGooglePlayServices() || googleApiAvailabilityCache.m14346b(this.f17417h.f17487c, client2) == 0) {
                client2.connect(c6370h);
            } else {
                this.f17417h.f17485a.m14177h(new C6376k(this, this.f17417h, c6370h));
            }
        }
    }
}
