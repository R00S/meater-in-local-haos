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

/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* loaded from: classes2.dex */
final class C6401w0 implements OnCompleteListener<Map<zai<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ zax f17468a;

    private C6401w0(zax zaxVar) {
        this.f17468a = zaxVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    /* renamed from: a */
    public final void mo7019a(Task<Map<zai<?>, String>> task) {
        this.f17468a.f17616k.lock();
        try {
            if (this.f17468a.f17624s) {
                if (task.mo23651n()) {
                    zax zaxVar = this.f17468a;
                    zaxVar.f17625t = new C0867a(zaxVar.f17611f.size());
                    Iterator it = this.f17468a.f17611f.values().iterator();
                    while (it.hasNext()) {
                        this.f17468a.f17625t.put(((zaw) it.next()).m13861l(), ConnectionResult.f17198f);
                    }
                } else if (task.mo23646i() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.mo23646i();
                    if (this.f17468a.f17622q) {
                        zax zaxVar2 = this.f17468a;
                        zaxVar2.f17625t = new C0867a(zaxVar2.f17611f.size());
                        for (zaw zawVar : this.f17468a.f17611f.values()) {
                            Object objM13861l = zawVar.m13861l();
                            ConnectionResult connectionResultM13844a = availabilityException.m13844a(zawVar);
                            if (this.f17468a.m14232l(zawVar, connectionResultM13844a)) {
                                this.f17468a.f17625t.put(objM13861l, new ConnectionResult(16));
                            } else {
                                this.f17468a.f17625t.put(objM13861l, connectionResultM13844a);
                            }
                        }
                    } else {
                        this.f17468a.f17625t = availabilityException.m13845b();
                    }
                    zax zaxVar3 = this.f17468a;
                    zaxVar3.f17628w = zaxVar3.m14238r();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo23646i());
                    this.f17468a.f17625t = Collections.emptyMap();
                    this.f17468a.f17628w = new ConnectionResult(8);
                }
                if (this.f17468a.f17626u != null) {
                    this.f17468a.f17625t.putAll(this.f17468a.f17626u);
                    zax zaxVar4 = this.f17468a;
                    zaxVar4.f17628w = zaxVar4.m14238r();
                }
                if (this.f17468a.f17628w == null) {
                    this.f17468a.m14236p();
                    this.f17468a.m14237q();
                } else {
                    zax.m14234n(this.f17468a, false);
                    this.f17468a.f17615j.mo14102a(this.f17468a.f17628w);
                }
                this.f17468a.f17619n.signalAll();
            }
        } finally {
            this.f17468a.f17616k.unlock();
        }
    }
}
