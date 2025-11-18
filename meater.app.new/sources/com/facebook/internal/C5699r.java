package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.p157o0.C5825g0;
import java.util.Set;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import p024c.p076q.p077a.C0997a;

/* compiled from: BoltsMeasurementEventListener.kt */
/* renamed from: com.facebook.internal.r */
/* loaded from: classes2.dex */
public final class C5699r extends BroadcastReceiver {

    /* renamed from: b */
    private static C5699r f14503b;

    /* renamed from: d */
    private final Context f14505d;

    /* renamed from: a */
    public static final a f14502a = new a(null);

    /* renamed from: c */
    private static final String f14504c = "com.parse.bolts.measurement_event";

    /* compiled from: BoltsMeasurementEventListener.kt */
    /* renamed from: com.facebook.internal.r$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C5699r m11650a(Context context) {
            C9801m.m32346f(context, "context");
            if (C5699r.f14503b != null) {
                return C5699r.f14503b;
            }
            C5699r c5699r = new C5699r(context, null);
            c5699r.m11649e();
            C5699r.f14503b = c5699r;
            return C5699r.f14503b;
        }
    }

    private C5699r(Context context) {
        Context applicationContext = context.getApplicationContext();
        C9801m.m32345e(applicationContext, "context.applicationContext");
        this.f14505d = applicationContext;
    }

    public /* synthetic */ C5699r(Context context, C9789g c9789g) {
        this(context);
    }

    /* renamed from: d */
    private final void m11648d() {
        C0997a c0997aM6341b = C0997a.m6341b(this.f14505d);
        C9801m.m32345e(c0997aM6341b, "getInstance(applicationContext)");
        c0997aM6341b.m6345e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m11649e() {
        C0997a c0997aM6341b = C0997a.m6341b(this.f14505d);
        C9801m.m32345e(c0997aM6341b, "getInstance(applicationContext)");
        c0997aM6341b.m6343c(this, new IntentFilter(f14504c));
    }

    public final void finalize() throws Throwable {
        m11648d();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C5825g0 c5825g0 = new C5825g0(context);
        String strM32354n = C9801m.m32354n("bf_", intent == null ? null : intent.getStringExtra("event_name"));
        Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
        if (setKeySet != null) {
            for (String str : setKeySet) {
                C9801m.m32345e(str, RoomNotification.KEY);
                bundle.putString(new Regex("[ -]*$").m37439c(new Regex("^[ -]*").m37439c(new Regex("[^0-9a-zA-Z _-]").m37439c(str, "-"), HttpUrl.FRAGMENT_ENCODE_SET), HttpUrl.FRAGMENT_ENCODE_SET), (String) bundleExtra.get(str));
            }
        }
        c5825g0.m12242d(strM32354n, bundle);
    }
}
