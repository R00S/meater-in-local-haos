package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p024c.p041e.C0867a;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes2.dex */
final class C6356a implements OnCompleteListener<Map<zai<?>, String>> {

    /* renamed from: a */
    private SignInConnectionListener f17390a;

    /* renamed from: b */
    private final /* synthetic */ zax f17391b;

    C6356a(zax zaxVar, SignInConnectionListener signInConnectionListener) {
        this.f17391b = zaxVar;
        this.f17390a = signInConnectionListener;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    /* renamed from: a */
    public final void mo7019a(Task<Map<zai<?>, String>> task) {
        this.f17391b.f17616k.lock();
        try {
            if (!this.f17391b.f17624s) {
                this.f17390a.mo13725a();
                return;
            }
            if (task.mo23651n()) {
                zax zaxVar = this.f17391b;
                zaxVar.f17626u = new C0867a(zaxVar.f17612g.size());
                Iterator it = this.f17391b.f17612g.values().iterator();
                while (it.hasNext()) {
                    this.f17391b.f17626u.put(((zaw) it.next()).m13861l(), ConnectionResult.f17198f);
                }
            } else if (task.mo23646i() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) task.mo23646i();
                if (this.f17391b.f17622q) {
                    zax zaxVar2 = this.f17391b;
                    zaxVar2.f17626u = new C0867a(zaxVar2.f17612g.size());
                    for (zaw zawVar : this.f17391b.f17612g.values()) {
                        Object objM13861l = zawVar.m13861l();
                        ConnectionResult connectionResultM13844a = availabilityException.m13844a(zawVar);
                        if (this.f17391b.m14232l(zawVar, connectionResultM13844a)) {
                            this.f17391b.f17626u.put(objM13861l, new ConnectionResult(16));
                        } else {
                            this.f17391b.f17626u.put(objM13861l, connectionResultM13844a);
                        }
                    }
                } else {
                    this.f17391b.f17626u = availabilityException.m13845b();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo23646i());
                this.f17391b.f17626u = Collections.emptyMap();
            }
            if (this.f17391b.isConnected()) {
                this.f17391b.f17625t.putAll(this.f17391b.f17626u);
                if (this.f17391b.m14238r() == null) {
                    this.f17391b.m14236p();
                    this.f17391b.m14237q();
                    this.f17391b.f17619n.signalAll();
                }
            }
            this.f17390a.mo13725a();
        } finally {
            this.f17391b.f17616k.unlock();
        }
    }

    /* renamed from: b */
    final void m14056b() {
        this.f17390a.mo13725a();
    }
}
