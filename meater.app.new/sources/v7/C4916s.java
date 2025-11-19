package v7;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2759h2;
import com.google.android.gms.measurement.internal.P2;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: v7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4916s {

    /* renamed from: a, reason: collision with root package name */
    private final a f51572a;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: v7.s$a */
    public interface a {
        void a(Context context, Intent intent);
    }

    public C4916s(a aVar) {
        C3445p.k(aVar);
        this.f51572a = aVar;
    }

    public final void a(Context context, Intent intent) {
        C2759h2 c2759h2K = P2.c(context, null, null).k();
        if (intent == null) {
            c2759h2K.M().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c2759h2K.L().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c2759h2K.M().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c2759h2K.L().a("Starting wakeful intent.");
            this.f51572a.a(context, className);
        }
    }
}
