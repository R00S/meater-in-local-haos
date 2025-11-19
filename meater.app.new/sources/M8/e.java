package M8;

import I8.a;
import android.os.Bundle;
import java.util.Locale;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes2.dex */
class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private O8.b f12129a;

    /* renamed from: b, reason: collision with root package name */
    private O8.b f12130b;

    e() {
    }

    private static void b(O8.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.j(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f12129a : this.f12130b, str, bundle);
    }

    @Override // I8.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        N8.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(O8.b bVar) {
        this.f12130b = bVar;
    }

    public void e(O8.b bVar) {
        this.f12129a = bVar;
    }
}
