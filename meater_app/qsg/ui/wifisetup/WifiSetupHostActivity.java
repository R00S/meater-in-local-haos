package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.Toolbar;
import c6.h;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.j;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.WiFiSSID;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.WifiSetupHostActivity;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.a;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.b;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.c;
import com.apptionlabs.meater_app.views.b0;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import h6.e1;
import ih.C0434b;
import ih.l;
import ih.o;
import ih.t;
import j6.e;
import j6.w;
import java.util.ArrayList;
import java.util.List;
import k3.a;
import k7.q;
import k7.v;
import kotlin.Metadata;
import t5.q0;
import t5.t0;
import wh.m;

/* compiled from: WifiSetupHostActivity.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0015\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0006\u0010\u001a\u001a\u00020\u0002J\"\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0014J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001dH\u0014J\b\u0010$\u001a\u00020\u0002H\u0014J\b\u0010%\u001a\u00020\u0002H\u0014J\u0006\u0010&\u001a\u00020\tR\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0011\u0010K\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetupHostActivity;", "Lcom/apptionlabs/meater_app/activities/j;", "Lih/u;", "l2", "", "title", "message", "i2", "n2", "", "m2", "", "setupCompleted", "h2", "t2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "networkName", "password", "q2", "r2", "Lcom/apptionlabs/meater_app/data/WiFiSSID;", "ssid", "o2", "onBackPressed", "s2", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "c1", "intent", "j1", "onDestroy", "onResume", "w2", "Lj6/w;", "a0", "Lj6/w;", "setupScreenCallBack", "Landroid/app/AlertDialog;", "b0", "Landroid/app/AlertDialog;", "endWifiSetupDialog", "c0", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetupHostActivity;", "activity", "d0", "Z", "isOnWifiSignInScreen", "Lh3/o;", "e0", "Lh3/o;", "navController", "Lk3/a;", "f0", "Lk3/a;", "config", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "g0", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "getDevice", "()Lcom/apptionlabs/meater_app/model/MEATERDevice;", "setDevice", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "device", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/c;", "h0", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/c;", "viewModel", "k2", "()Ljava/lang/String;", "currentAndroidSSID", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class WifiSetupHostActivity extends j {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public w setupScreenCallBack;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private AlertDialog endWifiSetupDialog;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final WifiSetupHostActivity activity = this;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private boolean isOnWifiSignInScreen;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private o navController;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private k3.a config;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private MEATERDevice device;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private c viewModel;

    /* compiled from: AppBarConfiguration.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a extends wh.o implements vh.a<Boolean> {

        /* renamed from: q, reason: collision with root package name */
        public static final a f9916q = new a();

        public a() {
            super(0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    private final void h2(boolean z10) {
        t0.w();
        if (b1.f10486z) {
            Intent intent = new Intent();
            intent.setPackage(com.apptionlabs.meater_app.app.a.i().getPackageName());
            setResult(-1, intent);
            b1.f10486z = false;
        } else {
            Intent intent2 = new Intent(this.activity, (Class<?>) MainActivity.class);
            intent2.putExtra("fromQsgScreen", true);
            startActivity(intent2);
            finish();
        }
        finish();
    }

    private final void i2(String str, String str2) {
        e0.Companion companion = e0.INSTANCE;
        m.c(str);
        m.c(str2);
        String string = getString(2132018340);
        m.e(string, "getString(...)");
        companion.e(this, str, str2, false, new e0.AlertPair(string, new e() { // from class: k7.s
            @Override // j6.e
            public final void a() {
                WifiSetupHostActivity.j2(WifiSetupHostActivity.this);
            }
        }), null, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(WifiSetupHostActivity wifiSetupHostActivity) {
        m.f(wifiSetupHostActivity, "this$0");
        wifiSetupHostActivity.h2(false);
    }

    private final void l2() {
        androidx.appcompat.app.a x02 = x0();
        if (x02 != null) {
            x02.m();
            x02.G("");
            x02.w(false);
            x02.z(false);
        }
    }

    private final int m2() {
        t0 t0Var;
        c cVar = this.viewModel;
        if (cVar != null) {
            t0Var = cVar.f9928l;
        } else {
            t0Var = null;
        }
        m.c(t0Var);
        return t0Var.z();
    }

    private final void n2() {
        ArrayList<WiFiSSID> arrayList;
        ArrayList<WiFiSSID> arrayList2;
        AlertDialog alertDialog = this.endWifiSetupDialog;
        if (alertDialog != null) {
            m.c(alertDialog);
            alertDialog.dismiss();
        }
        c cVar = this.viewModel;
        if (cVar != null) {
            cVar.p(c.a.SETUP_CONNECTING_SCREEN);
        }
        this.isOnWifiSignInScreen = false;
        e1 e1Var = new e1();
        c cVar2 = this.viewModel;
        o oVar = null;
        if (cVar2 != null) {
            arrayList = cVar2.n();
        } else {
            arrayList = null;
        }
        e1Var.f13371y0 = arrayList;
        c cVar3 = this.viewModel;
        if (cVar3 != null) {
            arrayList2 = cVar3.m();
        } else {
            arrayList2 = null;
        }
        e1Var.f13372z0 = arrayList2;
        t a10 = q.a();
        m.e(a10, "backToConnectingFragment(...)");
        o oVar2 = this.navController;
        if (oVar2 == null) {
            m.t("navController");
        } else {
            oVar = oVar2;
        }
        oVar.S(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(WifiSetupHostActivity wifiSetupHostActivity) {
        ArrayList<WiFiSSID> arrayList;
        m.f(wifiSetupHostActivity, "this$0");
        w wVar = wifiSetupHostActivity.setupScreenCallBack;
        if (wVar != null) {
            c cVar = wifiSetupHostActivity.viewModel;
            ArrayList<WiFiSSID> arrayList2 = null;
            if (cVar != null) {
                arrayList = cVar.m();
            } else {
                arrayList = null;
            }
            m.c(arrayList);
            c cVar2 = wifiSetupHostActivity.viewModel;
            if (cVar2 != null) {
                arrayList2 = cVar2.n();
            }
            m.c(arrayList2);
            wVar.v(arrayList, arrayList2);
        }
    }

    private final void t2() {
        if (isFinishing()) {
            return;
        }
        e0.Companion companion = e0.INSTANCE;
        String string = getString(2132017407);
        m.e(string, "getString(...)");
        String string2 = getString(2132017406);
        m.e(string2, "getString(...)");
        String string3 = getString(2132018978);
        m.e(string3, "getString(...)");
        e0.AlertPair alertPair = new e0.AlertPair(string3, new e() { // from class: k7.t
            @Override // j6.e
            public final void a() {
                WifiSetupHostActivity.u2(WifiSetupHostActivity.this);
            }
        });
        String string4 = getString(2132018306);
        m.e(string4, "getString(...)");
        AlertDialog e10 = companion.e(this, string, string2, false, alertPair, new e0.AlertPair(string4, new e() { // from class: k7.u
            @Override // j6.e
            public final void a() {
                WifiSetupHostActivity.v2();
            }
        }), null);
        this.endWifiSetupDialog = e10;
        m.c(e10);
        e10.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u2(WifiSetupHostActivity wifiSetupHostActivity) {
        m.f(wifiSetupHostActivity, "this$0");
        wifiSetupHostActivity.h2(false);
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected List<String> c1() {
        return jh.o.m(new String[]{MEATERIntent.BLOCK_WIFI_SETUP_CONNECTED, MEATERIntent.BLOCK_WIFI_SETUP_NETWORK_LIST_UPDATED, MEATERIntent.BLOCK_WIFI_SETUP_CONNECT_FAILED, MEATERIntent.BLOCK_WIFI_SETUP_FAILED, MEATERIntent.BLOCK_WIFI_SETUP_COMPLETE, MEATERIntent.BLOCK_WIFI_SETUP_STARTING_CONNECTIVITY_TEST, MEATERIntent.BLOCK_WIFI_SETUP_CONNECTIVITY_TEST_FAILED});
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected void j1(Intent intent) {
        c.a aVar;
        c.a aVar2;
        ArrayList<WiFiSSID> arrayList;
        ArrayList<WiFiSSID> arrayList2;
        ArrayList<WiFiSSID> arrayList3;
        WiFiSSID wiFiSSID;
        c.a aVar3;
        String str;
        m.f(intent, "intent");
        String action = intent.getAction();
        if (action != null && this == com.apptionlabs.meater_app.app.a.l()) {
            o oVar = null;
            o oVar2 = null;
            ArrayList<WiFiSSID> arrayList4 = null;
            o oVar3 = null;
            switch (action.hashCode()) {
                case -1345133407:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_CONNECTIVITY_TEST_FAILED)) {
                        k6.b.d(" Received BLOCK_WIFI_SETUP_CONNECTIVITY_TEST_FAILED ", new Object[0]);
                        c cVar = this.viewModel;
                        if (cVar != null) {
                            aVar = cVar.j();
                        } else {
                            aVar = null;
                        }
                        c.a aVar4 = c.a.COMPLETE;
                        if (aVar != aVar4) {
                            c cVar2 = this.viewModel;
                            if (cVar2 != null) {
                                cVar2.p(aVar4);
                            }
                            MEATERDevice mEATERDevice = this.device;
                            m.c(mEATERDevice);
                            a.C0140a a10 = com.apptionlabs.meater_app.qsg.ui.wifisetup.a.a(false, mEATERDevice.getDeviceID());
                            m.e(a10, "actionToWifiSetUpConnectivityComplete(...)");
                            o oVar4 = this.navController;
                            if (oVar4 == null) {
                                m.t("navController");
                            } else {
                                oVar = oVar4;
                            }
                            oVar.S(a10);
                            return;
                        }
                        return;
                    }
                    return;
                case -767684644:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_FAILED)) {
                        k6.b.d(" Received BLOCK_WIFI_SETUP_FAILED  ", new Object[0]);
                        i2(intent.getStringExtra(MEATERIntent.EXTRA_TITLE), intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE));
                        return;
                    }
                    return;
                case -294912838:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_STARTING_CONNECTIVITY_TEST)) {
                        k6.b.d(" Received BLOCK_WIFI_SETUP_STARTING_CONNECTIVITY_TEST ", new Object[0]);
                        return;
                    }
                    return;
                case -285458152:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_COMPLETE)) {
                        k6.b.d(" Received BLOCK_WIFI_SETUP_COMPLETE", new Object[0]);
                        c cVar3 = this.viewModel;
                        if (cVar3 != null) {
                            aVar2 = cVar3.j();
                        } else {
                            aVar2 = null;
                        }
                        c.a aVar5 = c.a.COMPLETE;
                        if (aVar2 != aVar5) {
                            c cVar4 = this.viewModel;
                            if (cVar4 != null) {
                                cVar4.p(aVar5);
                            }
                            MEATERDevice mEATERDevice2 = this.device;
                            m.c(mEATERDevice2);
                            a.C0140a a11 = com.apptionlabs.meater_app.qsg.ui.wifisetup.a.a(true, mEATERDevice2.getDeviceID());
                            m.e(a11, "actionToWifiSetUpConnectivityComplete(...)");
                            o oVar5 = this.navController;
                            if (oVar5 == null) {
                                m.t("navController");
                            } else {
                                oVar3 = oVar5;
                            }
                            oVar3.S(a11);
                            return;
                        }
                        return;
                    }
                    return;
                case -23497430:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_NETWORK_LIST_UPDATED)) {
                        c cVar5 = this.viewModel;
                        if (cVar5 != null) {
                            cVar5.q(intent.getParcelableArrayListExtra(MEATERIntent.EXTRA_RECOMMENDED_NETWORKS));
                        }
                        c cVar6 = this.viewModel;
                        if (cVar6 != null) {
                            cVar6.r(intent.getParcelableArrayListExtra(MEATERIntent.EXTRA_AVAILABLE_NETWORKS));
                        }
                        if (this.setupScreenCallBack != null) {
                            c cVar7 = this.viewModel;
                            if (cVar7 != null) {
                                arrayList = cVar7.m();
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                c cVar8 = this.viewModel;
                                if (cVar8 != null) {
                                    arrayList2 = cVar8.n();
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null) {
                                    w wVar = this.setupScreenCallBack;
                                    m.c(wVar);
                                    c cVar9 = this.viewModel;
                                    if (cVar9 != null) {
                                        arrayList3 = cVar9.m();
                                    } else {
                                        arrayList3 = null;
                                    }
                                    m.c(arrayList3);
                                    c cVar10 = this.viewModel;
                                    if (cVar10 != null) {
                                        arrayList4 = cVar10.n();
                                    }
                                    m.c(arrayList4);
                                    wVar.v(arrayList3, arrayList4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 564453130:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_CONNECTED)) {
                        k6.b.d(" Received BLOCK_WIFI_SETUP_CONNECTED", new Object[0]);
                        if (this.setupScreenCallBack != null) {
                            String stringExtra = intent.getStringExtra(MEATERIntent.EXTRA_CURRENT_BLOCK_SSID);
                            w wVar2 = this.setupScreenCallBack;
                            m.c(wVar2);
                            m.c(stringExtra);
                            wVar2.i(stringExtra);
                            c cVar11 = this.viewModel;
                            if (cVar11 != null) {
                                cVar11.f9920d = intent.getStringExtra(MEATERIntent.EXTRA_BLOCK_MAC_ADDRESS);
                            }
                            c cVar12 = this.viewModel;
                            if (cVar12 != null) {
                                cVar12.f9921e = intent.getStringExtra(MEATERIntent.EXTRA_BLOCK_FW_VERSION);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 1429468959:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_CONNECT_FAILED)) {
                        k6.b.d(" Received BLOCK_WIFI_SETUP_CONNECT_FAILED  ", new Object[0]);
                        o oVar6 = this.navController;
                        if (oVar6 != null) {
                            if (oVar6 == null) {
                                m.t("navController");
                                oVar6 = null;
                            }
                            if (((l) jh.o.p0((List) oVar6.A().getValue())).getDestination().getId() == 2131363695) {
                                return;
                            }
                        }
                        c cVar13 = this.viewModel;
                        if (cVar13 != null) {
                            wiFiSSID = cVar13.i();
                        } else {
                            wiFiSSID = null;
                        }
                        if (wiFiSSID != null) {
                            c cVar14 = this.viewModel;
                            if (cVar14 != null) {
                                aVar3 = cVar14.j();
                            } else {
                                aVar3 = null;
                            }
                            c.a aVar6 = c.a.SING_IN_SCREEN;
                            if (aVar3 != aVar6) {
                                c cVar15 = this.viewModel;
                                if (cVar15 != null) {
                                    str = cVar15.f9924h;
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    if (cVar15 != null) {
                                        cVar15.p(aVar6);
                                    }
                                    c cVar16 = this.viewModel;
                                    if (cVar16 != null) {
                                        cVar16.f9922f = intent.getStringExtra(MEATERIntent.EXTRA_TITLE);
                                    }
                                    c cVar17 = this.viewModel;
                                    if (cVar17 != null) {
                                        cVar17.f9923g = intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE);
                                    }
                                    c cVar18 = this.viewModel;
                                    m.c(cVar18);
                                    String str2 = cVar18.f9924h;
                                    c cVar19 = this.viewModel;
                                    m.c(cVar19);
                                    a.b b10 = com.apptionlabs.meater_app.qsg.ui.wifisetup.a.b(str2, "", cVar19.i(), m2());
                                    m.e(b10, "actionToWifiSetupSignInFragment(...)");
                                    o oVar7 = this.navController;
                                    if (oVar7 == null) {
                                        m.t("navController");
                                    } else {
                                        oVar2 = oVar7;
                                    }
                                    oVar2.S(b10);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final String k2() {
        String x10 = t0.x();
        m.e(x10, "getCurrentAndroidSSID(...)");
        return x10;
    }

    public final void o2(WiFiSSID wiFiSSID) {
        m.f(wiFiSSID, "ssid");
        this.isOnWifiSignInScreen = true;
        c cVar = this.viewModel;
        m.c(cVar);
        cVar.f9924h = q0.N(wiFiSSID.getName().L());
        c cVar2 = this.viewModel;
        m.c(cVar2);
        cVar2.o(wiFiSSID);
        c cVar3 = this.viewModel;
        if (cVar3 != null) {
            cVar3.p(c.a.SING_IN_SCREEN);
        }
        c cVar4 = this.viewModel;
        m.c(cVar4);
        String str = cVar4.f9924h;
        c cVar5 = this.viewModel;
        m.c(cVar5);
        b.a a10 = com.apptionlabs.meater_app.qsg.ui.wifisetup.b.a(str, "", cVar5.i(), m2());
        m.e(a10, "actionToWifiSetUpSignInFragment(...)");
        o oVar = this.navController;
        if (oVar == null) {
            m.t("navController");
            oVar = null;
        }
        oVar.S(a10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        finish();
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c.a aVar;
        c.a aVar2;
        c cVar = this.viewModel;
        c.a aVar3 = null;
        if (cVar != null) {
            aVar = cVar.j();
        } else {
            aVar = null;
        }
        if (aVar == c.a.SING_IN_SCREEN) {
            n2();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: k7.r
                @Override // java.lang.Runnable
                public final void run() {
                    WifiSetupHostActivity.p2(WifiSetupHostActivity.this);
                }
            }, 300L);
            return;
        }
        c cVar2 = this.viewModel;
        if (cVar2 != null) {
            aVar2 = cVar2.j();
        } else {
            aVar2 = null;
        }
        if (aVar2 == c.a.NETWORK_CONNECTING_SCREEN) {
            Log.info("BlockWiFiSetup", "ignore ");
            return;
        }
        c cVar3 = this.viewModel;
        if (cVar3 != null) {
            aVar3 = cVar3.j();
        }
        if (aVar3 == c.a.COMPLETE) {
            h2(false);
        } else {
            t2();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MEATERDevice o10 = h.f8879a.o(getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
        m.d(o10, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.MEATERDevice");
        this.device = o10;
        setContentView(2131558458);
        H0((Toolbar) findViewById(2131363515));
        o a10 = C0434b.a(this, 2131363692);
        this.navController = a10;
        q0 q0Var = null;
        if (a10 == null) {
            m.t("navController");
            a10 = null;
        }
        this.config = new a.C0230a(a10.E()).c(null).b(new v(a.f9916q)).a();
        l2();
        MEATERDevice mEATERDevice = this.device;
        if (mEATERDevice != null) {
            m.c(mEATERDevice);
            mEATERDevice.isMEATERBlock();
        }
        MEATERBlock mEATERBlock = (MEATERBlock) this.device;
        m.c(mEATERBlock);
        if (mEATERBlock.isSupportsBLEKeepAlive()) {
            MEATERDevice mEATERDevice2 = this.device;
            m.c(mEATERDevice2);
            q0Var = (q0) mEATERDevice2.getBleConnection();
        }
        t0 G = t0.G(mEATERBlock, q0Var);
        m.e(G, "setupWiFiForBlock(...)");
        c cVar = (c) new android.view.t0(this).a(c.class);
        this.viewModel = cVar;
        if (cVar != null) {
            cVar.f9928l = G;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b1.f10481u = false;
        t0.w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        t0 t0Var;
        super.onResume();
        b1.f10481u = true;
        c cVar = this.viewModel;
        if (cVar != null && (t0Var = cVar.f9928l) != null) {
            t0Var.J();
        }
    }

    public final void q2(String str, String str2) {
        t0 t0Var;
        m.f(str, "networkName");
        c cVar = this.viewModel;
        if (cVar != null) {
            cVar.p(c.a.NETWORK_CONNECTING_SCREEN);
        }
        c cVar2 = this.viewModel;
        o oVar = null;
        if (cVar2 != null) {
            cVar2.f9922f = null;
        }
        if (cVar2 != null) {
            cVar2.f9924h = str;
        }
        if (cVar2 != null && (t0Var = cVar2.f9928l) != null) {
            t0Var.s(str, str2);
        }
        t b10 = q.b();
        m.e(b10, "networkConnectingFragment(...)");
        o oVar2 = this.navController;
        if (oVar2 == null) {
            m.t("navController");
        } else {
            oVar = oVar2;
        }
        oVar.S(b10);
    }

    public final void r2() {
        t0 t0Var;
        c cVar = this.viewModel;
        if (cVar != null) {
            t0Var = cVar.f9928l;
        } else {
            t0Var = null;
        }
        m.c(t0Var);
        t0Var.E();
    }

    public final void s2() {
        b0.h(this.activity, getString(2132018832), getString(2132017365), 2132018340, new b());
    }

    public final int w2() {
        MEATERDevice mEATERDevice = this.device;
        m.c(mEATERDevice);
        MEATERDeviceType mEATERDeviceType = mEATERDevice.getMEATERDeviceType();
        m.e(mEATERDeviceType, "getMEATERDeviceType(...)");
        if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
            return 2131951745;
        }
        return 2131951744;
    }

    /* compiled from: WifiSetupHostActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetupHostActivity$b", "Lcom/apptionlabs/meater_app/views/b0$a;", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements b0.a {
        b() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void a() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v2() {
    }
}
