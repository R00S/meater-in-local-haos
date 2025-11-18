package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes2.dex */
final class C6378l extends AbstractRunnableC6386p {

    /* renamed from: g */
    private final ArrayList<Api.Client> f17425g;

    /* renamed from: h */
    private final /* synthetic */ zaak f17426h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6378l(zaak zaakVar, ArrayList<Api.Client> arrayList) {
        super(zaakVar, null);
        this.f17426h = zaakVar;
        this.f17425g = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC6386p
    /* renamed from: a */
    public final void mo14062a() {
        this.f17426h.f17485a.f17546s.f17522q = this.f17426h.m14144n();
        ArrayList<Api.Client> arrayList = this.f17425g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Api.Client client = arrayList.get(i2);
            i2++;
            client.getRemoteService(this.f17426h.f17499o, this.f17426h.f17485a.f17546s.f17522q);
        }
    }
}
