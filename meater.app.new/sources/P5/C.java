package P5;

import android.content.Intent;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.LocalStorage;

/* compiled from: ResetManager.java */
/* loaded from: classes2.dex */
public class C {
    public static void a() {
        x4.g.t().j0();
        LocalStorage.sharedStorage().deviceDAO().c();
        LocalStorage.sharedStorage().savedCookDAO().d();
        LocalStorage.sharedStorage().oldCookIDDAO().a();
        LocalStorage.sharedStorage().cookNoteDAO().a();
        LocalStorage.sharedStorage().savedEventLogDAO().b();
        LocalStorage.sharedStorage().pendingRequestDAO().a();
        MeaterLinkService.d();
        x4.g.h().startActivity(Intent.makeRestartActivityTask(x4.g.h().getPackageManager().getLaunchIntentForPackage(x4.g.h().getPackageName()).getComponent()));
        Runtime.getRuntime().exit(0);
    }
}
