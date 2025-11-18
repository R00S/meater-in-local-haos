package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Locale;

/* renamed from: com.flurry.sdk.s */
/* loaded from: classes2.dex */
public final class C6154s extends C6027d7<C6146r> {

    /* renamed from: p */
    protected BroadcastReceiver f16311p;

    /* renamed from: com.flurry.sdk.s$a */
    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C6154s.this.m13048t(C6154s.m13301y());
        }
    }

    /* renamed from: com.flurry.sdk.s$b */
    final class b extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6046f7 f16313h;

        b(InterfaceC6046f7 interfaceC6046f7) {
            this.f16313h = interfaceC6046f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            this.f16313h.mo12962a(C6154s.m13301y());
        }
    }

    public C6154s() {
        super("LocaleProvider");
        this.f16311p = new a();
        Context contextM12964a = C6002b0.m12964a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        if (contextM12964a != null) {
            contextM12964a.registerReceiver(this.f16311p, intentFilter);
        } else {
            C6021d1.m13030c(6, "LocaleProvider", "Context is null when initializing.");
        }
    }

    /* renamed from: y */
    public static C6146r m13301y() {
        return new C6146r(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6046f7<C6146r> interfaceC6046f7) {
        super.mo13050v(interfaceC6046f7);
        mo13007m(new b(interfaceC6046f7));
    }
}
