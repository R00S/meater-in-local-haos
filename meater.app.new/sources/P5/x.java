package P5;

import android.app.Activity;
import android.content.IntentSender;
import com.apptionlabs.meater_app.data.Log;
import d8.C3057a;
import d8.C3059c;
import d8.InterfaceC3058b;
import g8.InterfaceC3455a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import z7.AbstractC5208j;
import z7.InterfaceC5205g;

/* compiled from: MEATERAppUpdateManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"LP5/x;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Loa/F;", "c", "a", "Landroid/app/Activity;", "Ld8/b;", "b", "Ld8/b;", "appUpdateManager", "Lg8/a;", "Lg8/a;", "installStateUpdatedListener", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3058b appUpdateManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3455a installStateUpdatedListener;

    public x(Activity activity) {
        this.activity = activity;
        c(activity);
    }

    private final void c(final Activity activity) {
        C3862t.d(activity);
        this.appUpdateManager = C3059c.a(activity);
        this.installStateUpdatedListener = new InterfaceC3455a() { // from class: P5.u
        };
        InterfaceC3058b interfaceC3058b = this.appUpdateManager;
        C3862t.d(interfaceC3058b);
        AbstractC5208j<C3057a> abstractC5208jA = interfaceC3058b.a();
        C3862t.f(abstractC5208jA, "getAppUpdateInfo(...)");
        final Ba.l lVar = new Ba.l() { // from class: P5.v
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return x.d(this.f14078B, activity, (C3057a) obj);
            }
        };
        abstractC5208jA.g(new InterfaceC5205g() { // from class: P5.w
            @Override // z7.InterfaceC5205g
            public final void a(Object obj) {
                x.e(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F d(x xVar, Activity activity, C3057a appUpdateInfo) {
        C3862t.g(appUpdateInfo, "appUpdateInfo");
        if (appUpdateInfo.c() == 2 && appUpdateInfo.a(1)) {
            Log.info("app_update ", "App needs to update ");
            try {
                InterfaceC3058b interfaceC3058b = xVar.appUpdateManager;
                C3862t.d(interfaceC3058b);
                interfaceC3058b.b(appUpdateInfo, 0, activity, 4488);
            } catch (IntentSender.SendIntentException e10) {
                e10.printStackTrace();
                C4153F c4153f = C4153F.f46609a;
            }
        } else {
            Log.info("app_update ", "App is already updated ");
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Ba.l lVar, Object obj) {
        lVar.invoke(obj);
    }
}
