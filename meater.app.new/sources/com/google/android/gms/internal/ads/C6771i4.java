package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.i4 */
/* loaded from: classes2.dex */
final /* synthetic */ class C6771i4 implements InterfaceC7104r4 {

    /* renamed from: a */
    static final InterfaceC7104r4 f19290a = new C6771i4();

    private C6771i4() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7104r4
    /* renamed from: a */
    public final Object mo15334a(zzbjf zzbjfVar) throws RemoteException {
        String strMo16674J2 = zzbjfVar.mo16674J2();
        if (strMo16674J2 != null) {
            return strMo16674J2;
        }
        String strMo16677O4 = zzbjfVar.mo16677O4();
        return strMo16677O4 != null ? strMo16677O4 : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
