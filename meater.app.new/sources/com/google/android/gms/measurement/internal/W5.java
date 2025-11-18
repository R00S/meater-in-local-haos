package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class W5 {

    /* renamed from: a, reason: collision with root package name */
    private final P2 f35203a;

    public W5(P2 p22) {
        this.f35203a = p22;
    }

    private final boolean d() {
        return this.f35203a.H().f35620z.a() > 0;
    }

    private final boolean e() {
        return d() && this.f35203a.b().a() - this.f35203a.H().f35620z.a() > this.f35203a.B().D(null, K.f34972e0);
    }

    final void a() {
        this.f35203a.o().n();
        if (d()) {
            if (e()) {
                this.f35203a.H().f35619y.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f35203a.J().h1("auto", "_cmpx", bundle);
            } else {
                String strA = this.f35203a.H().f35619y.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f35203a.k().J().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f35203a.H().f35620z.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    Object obj = pair.first;
                    this.f35203a.J().h1(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f35203a.H().f35619y.b(null);
            }
            this.f35203a.H().f35620z.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        this.f35203a.o().n();
        if (this.f35203a.s()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f35203a.H().f35619y.b(string);
        this.f35203a.H().f35620z.b(this.f35203a.b().a());
    }

    final void c() {
        if (d() && e()) {
            this.f35203a.H().f35619y.b(null);
        }
    }
}
