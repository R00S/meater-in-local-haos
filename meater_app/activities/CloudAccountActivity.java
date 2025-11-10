package com.apptionlabs.meater_app.activities;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import f8.z;
import ih.u;
import kotlin.Metadata;

/* compiled from: CloudAccountActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/apptionlabs/meater_app/activities/CloudAccountActivity;", "Lcom/apptionlabs/meater_app/activities/OrientationActivity;", "Lih/u;", "L0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "Lh3/o;", "S", "Lh3/o;", "navController", "Landroidx/navigation/fragment/NavHostFragment;", "T", "Landroidx/navigation/fragment/NavHostFragment;", "navHost", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class CloudAccountActivity extends OrientationActivity {

    /* renamed from: S, reason: from kotlin metadata */
    private ih.o navController;

    /* renamed from: T, reason: from kotlin metadata */
    private NavHostFragment navHost;

    private final void L0() {
        View findViewById = findViewById(2131362547);
        wh.m.e(findViewById, "findViewById(...)");
        g6.d.g(findViewById);
        View findViewById2 = findViewById(2131363113);
        wh.m.e(findViewById2, "findViewById(...)");
        g6.d.j(findViewById2);
        Fragment i02 = m0().i0(2131363113);
        wh.m.d(i02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) i02;
        this.navHost = navHostFragment;
        if (navHostFragment == null) {
            wh.m.t("navHost");
            navHostFragment = null;
        }
        ih.o B2 = navHostFragment.B2();
        this.navController = B2;
        if (B2 == null) {
            wh.m.t("navController");
            B2 = null;
        }
        u b10 = B2.G().b(2131820545);
        ih.o oVar = this.navController;
        if (oVar == null) {
            wh.m.t("navController");
            oVar = null;
        }
        oVar.n0(b10, null);
    }

    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558449);
        setRequestedOrientation(14);
        H0((Toolbar) findViewById(2131363515));
        L0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        z.d(null);
    }
}
