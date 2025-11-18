package v7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.measurement.internal.P2;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class n0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final P2 f51568a;

    public n0(P2 p22) {
        this.f51568a = p22;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f51568a.k().M().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f51568a.k().M().a("App receiver called with null action");
            return;
        }
        if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final P2 p22 = this.f51568a;
            if (W6.a() && p22.B().K(null, com.google.android.gms.measurement.internal.K.f34942R0)) {
                p22.k().L().a("App receiver notified triggers are available");
                p22.o().E(new Runnable() { // from class: com.google.android.gms.measurement.internal.U5
                    @Override // java.lang.Runnable
                    public final void run() {
                        P2 p23 = p22;
                        if (!p23.P().V0()) {
                            p23.k().M().a("registerTrigger called but app not eligible");
                            return;
                        }
                        p23.J().I0();
                        final C2843t3 c2843t3J = p23.J();
                        Objects.requireNonNull(c2843t3J);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.V5
                            @Override // java.lang.Runnable
                            public final void run() {
                                c2843t3J.K0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
            this.f51568a.k().M().a("App receiver called with unknown action");
        } else if (this.f51568a.B().K(null, com.google.android.gms.measurement.internal.K.f34932M0)) {
            this.f51568a.k().L().a("[sgtm] App Receiver notified batches are available");
            this.f51568a.o().E(new Runnable() { // from class: v7.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51569B.f51568a.L().D(com.google.android.gms.measurement.internal.K.f35015z.a(null).longValue());
                }
            });
        }
    }
}
