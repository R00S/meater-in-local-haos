package androidx.media3.exoplayer;

import X1.C1804a;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import androidx.media3.exoplayer.x0;
import java.util.Iterator;
import java.util.concurrent.Executor;
import m8.AbstractC4009y;

/* compiled from: DefaultSuitableOutputChecker.java */
/* renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2127i implements x0 {

    /* renamed from: f, reason: collision with root package name */
    private static final RouteDiscoveryPreference f27218f;

    /* renamed from: a, reason: collision with root package name */
    private final MediaRouter2 f27219a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaRouter2$RouteCallback f27220b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f27221c;

    /* renamed from: d, reason: collision with root package name */
    private MediaRouter2$ControllerCallback f27222d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27223e;

    /* compiled from: DefaultSuitableOutputChecker.java */
    /* renamed from: androidx.media3.exoplayer.i$a */
    class a extends MediaRouter2$RouteCallback {
        a() {
        }
    }

    /* compiled from: DefaultSuitableOutputChecker.java */
    /* renamed from: androidx.media3.exoplayer.i$b */
    class b implements Executor {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Handler f27225B;

        b(Handler handler) {
            this.f27225B = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            X1.L.Z0(this.f27225B, runnable);
        }
    }

    /* compiled from: DefaultSuitableOutputChecker.java */
    /* renamed from: androidx.media3.exoplayer.i$c */
    class c extends MediaRouter2$ControllerCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.a f27227a;

        c(x0.a aVar) {
            this.f27227a = aVar;
        }

        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            boolean zB = C2127i.this.b();
            if (C2127i.this.f27223e != zB) {
                C2127i.this.f27223e = zB;
                this.f27227a.a(zB);
            }
        }
    }

    static {
        d2.s.a();
        f27218f = d2.r.a(AbstractC4009y.G(), false).build();
    }

    public C2127i(Context context, Handler handler) {
        this.f27219a = MediaRouter2.getInstance(context);
        this.f27221c = new b(handler);
    }

    private static boolean e(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
        int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
        return suitabilityStatus == 1 ? (i10 == 1 || i10 == 2) && z10 : suitabilityStatus == 0;
    }

    @Override // androidx.media3.exoplayer.x0
    public void a(x0.a aVar) {
        this.f27219a.registerRouteCallback(this.f27221c, this.f27220b, f27218f);
        c cVar = new c(aVar);
        this.f27222d = cVar;
        this.f27219a.registerControllerCallback(this.f27221c, cVar);
        this.f27223e = b();
    }

    @Override // androidx.media3.exoplayer.x0
    public boolean b() {
        C1804a.j(this.f27222d, "SuitableOutputChecker is not enabled");
        int transferReason = this.f27219a.getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean zWasTransferInitiatedBySelf = this.f27219a.getSystemController().wasTransferInitiatedBySelf();
        Iterator it = this.f27219a.getSystemController().getSelectedRoutes().iterator();
        while (it.hasNext()) {
            if (e(d2.p.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.x0
    public void g() {
        C1804a.j(this.f27222d, "SuitableOutputChecker is not enabled");
        this.f27219a.unregisterControllerCallback(this.f27222d);
        this.f27222d = null;
        this.f27219a.unregisterRouteCallback(this.f27220b);
    }
}
