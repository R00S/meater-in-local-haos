package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zacp {

    /* renamed from: a */
    public static final Status f17574a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b */
    private static final BasePendingResult<?>[] f17575b = new BasePendingResult[0];

    /* renamed from: c */
    @VisibleForTesting
    final Set<BasePendingResult<?>> f17576c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final InterfaceC6379l0 f17577d = new C6375j0(this);

    /* renamed from: e */
    private final Map<Api.AnyClientKey<?>, Api.Client> f17578e;

    public zacp(Map<Api.AnyClientKey<?>, Api.Client> map) {
        this.f17578e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m14203a() throws RemoteException {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f17576c.toArray(f17575b)) {
            com.google.android.gms.common.api.zac zacVar = null;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            basePendingResult.m13941n(null);
            if (basePendingResult.mo13900g() != null) {
                basePendingResult.mo13899f(null);
                IBinder serviceBrokerBinder = this.f17578e.get(((BaseImplementation.ApiMethodImpl) basePendingResult).m13931u()).getServiceBrokerBinder();
                if (basePendingResult.m13939j()) {
                    basePendingResult.m13941n(new C6377k0(basePendingResult, zacVar, serviceBrokerBinder, b4 == true ? 1 : 0));
                } else {
                    if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                        basePendingResult.m13941n(null);
                        basePendingResult.mo13846d();
                        basePendingResult.mo13900g().intValue();
                        throw null;
                    }
                    C6377k0 c6377k0 = new C6377k0(basePendingResult, b3 == true ? 1 : 0, serviceBrokerBinder, b2 == true ? 1 : 0);
                    basePendingResult.m13941n(c6377k0);
                    try {
                        serviceBrokerBinder.linkToDeath(c6377k0, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.mo13846d();
                        basePendingResult.mo13900g().intValue();
                        throw null;
                    }
                }
                this.f17576c.remove(basePendingResult);
            } else if (basePendingResult.m13943q()) {
                this.f17576c.remove(basePendingResult);
            }
        }
    }

    /* renamed from: b */
    final void m14204b(BasePendingResult<? extends Result> basePendingResult) {
        this.f17576c.add(basePendingResult);
        basePendingResult.m13941n(this.f17577d);
    }

    /* renamed from: c */
    public final void m14205c() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f17576c.toArray(f17575b)) {
            basePendingResult.m13942p(f17574a);
        }
    }
}
