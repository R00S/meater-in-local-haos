package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzbzq implements View.OnClickListener {

    /* renamed from: f */
    private final zzccj f23903f;

    /* renamed from: g */
    private final Clock f23904g;

    /* renamed from: h */
    private zzagd f23905h;

    /* renamed from: i */
    private zzaho f23906i;

    /* renamed from: j */
    String f23907j;

    /* renamed from: k */
    Long f23908k;

    /* renamed from: l */
    WeakReference<View> f23909l;

    public zzbzq(zzccj zzccjVar, Clock clock) {
        this.f23903f = zzccjVar;
        this.f23904g = clock;
    }

    /* renamed from: d */
    private final void m18602d() {
        View view;
        this.f23907j = null;
        this.f23908k = null;
        WeakReference<View> weakReference = this.f23909l;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f23909l = null;
    }

    /* renamed from: a */
    public final void m18603a() {
        if (this.f23905h == null || this.f23908k == null) {
            return;
        }
        m18602d();
        try {
            this.f23905h.onUnconfirmedClickCancelled();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: b */
    public final void m18604b(zzagd zzagdVar) {
        this.f23905h = zzagdVar;
        zzaho<Object> zzahoVar = this.f23906i;
        if (zzahoVar != null) {
            this.f23903f.m18669h("/unconfirmedClick", zzahoVar);
        }
        C6561cg c6561cg = new C6561cg(this, zzagdVar);
        this.f23906i = c6561cg;
        this.f23903f.m18665d("/unconfirmedClick", c6561cg);
    }

    /* renamed from: c */
    public final zzagd m18605c() {
        return this.f23905h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f23909l;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f23907j != null && this.f23908k != null) {
            HashMap map = new HashMap();
            map.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, this.f23907j);
            map.put("time_interval", String.valueOf(this.f23904g.mo14608a() - this.f23908k.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f23903f.m18666e("sendMessageToNativeJs", map);
        }
        m18602d();
    }
}
