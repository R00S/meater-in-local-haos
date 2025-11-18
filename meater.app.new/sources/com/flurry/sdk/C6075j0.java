package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.TimeZone;

/* renamed from: com.flurry.sdk.j0 */
/* loaded from: classes2.dex */
public final class C6075j0 extends C6027d7<String> {

    /* renamed from: p */
    protected BroadcastReceiver f16006p;

    /* renamed from: com.flurry.sdk.j0$a */
    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C6075j0.this.m13048t(TimeZone.getDefault().getID());
        }
    }

    /* renamed from: com.flurry.sdk.j0$b */
    final class b extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6046f7 f16008h;

        b(InterfaceC6046f7 interfaceC6046f7) {
            this.f16008h = interfaceC6046f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            this.f16008h.mo12962a(TimeZone.getDefault().getID());
        }
    }

    public C6075j0() {
        super("TimeZoneProvider");
        this.f16006p = new a();
        Context contextM12964a = C6002b0.m12964a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        if (contextM12964a != null) {
            contextM12964a.registerReceiver(this.f16006p, intentFilter);
        } else {
            C6021d1.m13030c(6, "TimeZoneProvider", "Context is null when initializing.");
        }
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6046f7<String> interfaceC6046f7) {
        super.mo13050v(interfaceC6046f7);
        mo13007m(new b(interfaceC6046f7));
    }
}
