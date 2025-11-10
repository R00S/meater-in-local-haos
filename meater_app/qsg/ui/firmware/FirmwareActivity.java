package com.apptionlabs.meater_app.qsg.ui.firmware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.apptionlabs.meater_app.activities.OrientationActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.views.b1;
import f8.z;
import g6.d;
import ih.l;
import ih.o;
import ih.s;
import ih.u;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import wh.m;

/* compiled from: FirmwareActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/firmware/FirmwareActivity;", "Lcom/apptionlabs/meater_app/activities/OrientationActivity;", "Lih/u;", "M0", "N0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onResume", "onDestroy", "Lh3/o;", "S", "Lh3/o;", "navController", "Landroidx/navigation/fragment/NavHostFragment;", "T", "Landroidx/navigation/fragment/NavHostFragment;", "navHost", "Landroidx/activity/o;", "U", "Landroidx/activity/o;", "getOnBackPressedCallback", "()Landroidx/activity/o;", "setOnBackPressedCallback", "(Landroidx/activity/o;)V", "onBackPressedCallback", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class FirmwareActivity extends OrientationActivity {

    /* renamed from: S, reason: from kotlin metadata */
    private o navController;

    /* renamed from: T, reason: from kotlin metadata */
    private NavHostFragment navHost;

    /* renamed from: U, reason: from kotlin metadata */
    private android.view.o onBackPressedCallback = new a();

    /* compiled from: FirmwareActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/firmware/FirmwareActivity$a", "Landroidx/activity/o;", "Lih/u;", "d", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a extends android.view.o {
        a() {
            super(true);
        }

        @Override // android.view.o
        public void d() {
            o oVar = FirmwareActivity.this.navController;
            o oVar2 = null;
            if (oVar == null) {
                m.t("navController");
                oVar = null;
            }
            if (!((Collection) oVar.A().getValue()).isEmpty()) {
                o oVar3 = FirmwareActivity.this.navController;
                if (oVar3 == null) {
                    m.t("navController");
                } else {
                    oVar2 = oVar3;
                }
                if (((l) jh.o.p0((List) oVar2.A().getValue())).getDestination().getId() == 2131362515) {
                    Toast.makeText(com.apptionlabs.meater_app.app.a.i(), "System in process , Please wait", 1).show();
                    return;
                } else {
                    FirmwareActivity.this.finish();
                    return;
                }
            }
            FirmwareActivity.this.finish();
        }
    }

    private final void M0() {
        View findViewById = findViewById(2131362547);
        m.e(findViewById, "findViewById(...)");
        d.g(findViewById);
        View findViewById2 = findViewById(2131363113);
        m.e(findViewById2, "findViewById(...)");
        d.j(findViewById2);
        Fragment i02 = m0().i0(2131363113);
        m.d(i02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) i02;
        this.navHost = navHostFragment;
        if (navHostFragment == null) {
            m.t("navHost");
            navHostFragment = null;
        }
        o B2 = navHostFragment.B2();
        this.navController = B2;
        if (B2 == null) {
            m.t("navController");
            B2 = null;
        }
        u b10 = B2.G().b(2131820544);
        b10.d0(2131362222);
        o oVar = this.navController;
        if (oVar == null) {
            m.t("navController");
            oVar = null;
        }
        oVar.n0(b10, null);
    }

    private final void N0() {
        Long l10;
        View findViewById = findViewById(2131362547);
        m.e(findViewById, "findViewById(...)");
        d.g(findViewById);
        View findViewById2 = findViewById(2131363113);
        m.e(findViewById2, "findViewById(...)");
        d.j(findViewById2);
        Fragment i02 = m0().i0(2131363113);
        m.d(i02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) i02;
        this.navHost = navHostFragment;
        if (navHostFragment == null) {
            m.t("navHost");
            navHostFragment = null;
        }
        o B2 = navHostFragment.B2();
        this.navController = B2;
        if (B2 == null) {
            m.t("navController");
            B2 = null;
        }
        u b10 = B2.G().b(2131820544);
        s a10 = u.INSTANCE.a(b10);
        ih.m[] mVarArr = new ih.m[1];
        Intent intent = getIntent();
        if (intent != null) {
            l10 = Long.valueOf(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
        } else {
            l10 = null;
        }
        mVarArr[0] = ih.s.a("deviceId", l10);
        a10.t(androidx.core.os.d.a(mVarArr));
        o oVar = this.navController;
        if (oVar == null) {
            m.t("navController");
            oVar = null;
        }
        oVar.n0(b10, null);
        getWindow().addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131558449);
        setRequestedOrientation(14);
        H0((Toolbar) findViewById(2131363515));
        Intent intent = getIntent();
        Boolean bool = null;
        if (intent != null) {
            str = intent.getStringExtra(MEATERIntent.EXTRA_TAG);
        } else {
            str = null;
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bool = Boolean.valueOf(intent2.getBooleanExtra(MEATERIntent.QSG_SHOW_LOW_BATTERY, false));
        }
        if (str != null && m.a(str, MEATERIntent.QSG_SHOW_FIRMWARE_UPDATE)) {
            N0();
        } else if (m.a(bool, Boolean.FALSE)) {
            Intent intent3 = new Intent(this, (Class<?>) QSGActivity.class);
            intent3.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.QSG_SHOW_SETUP_COMPLETE);
            startActivity(intent3);
            finish();
        } else {
            M0();
        }
        getOnBackPressedDispatcher().h(this, this.onBackPressedCallback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b1.f10481u = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        b1.f10481u = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        z.d(null);
    }
}
