package com.apptionlabs.meater_app.activities;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.CloudMQTTConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.e1;
import com.apptionlabs.meater_app.views.m0;
import f8.l0;
import f8.q0;
import f8.y;
import f8.z;
import h6.x2;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lm.b;
import t5.x;
import v5.l;

/* compiled from: MEATERActivity.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class j extends OrientationActivity {
    private e1 U;
    AlertDialog Y;
    private AlertDialog S = null;
    private final Handler T = new Handler(Looper.getMainLooper());
    private final BroadcastReceiver V = new a();
    boolean W = false;
    android.view.result.c<Intent> X = f0(new e.d(), new android.view.result.b() { // from class: p5.s2
        @Override // android.view.result.b
        public final void a(Object obj) {
            com.apptionlabs.meater_app.activities.j.this.z1((android.view.result.a) obj);
        }
    });
    public s6.g Z = null;

    /* compiled from: MEATERActivity.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j.this.j1(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1() {
        l0.H(this, "https://support.meater.com/helper?how-can-we-help=product-support&which-product-type=gen-two&meater-2-plus-help=my-meater-2-plus-not-working&meater-2-plus-help=meater-2-plus-damaged&webform");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(MEATERDevice mEATERDevice) {
        Intent intent;
        if (mEATERDevice.batteryLevelTooLowForFirmwareUpdate()) {
            c2(mEATERDevice);
            return;
        }
        if (mEATERDevice.isMEATERBlock()) {
            intent = new Intent(this, (Class<?>) BlockFirmwareUpdateActivity.class);
        } else {
            intent = new Intent(this, (Class<?>) MEATERPlusFirmwareUpdateActivity.class);
        }
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(i6.c cVar, View view) {
        this.U.b(cVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(i6.c cVar, View view) {
        this.U.b(cVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1() {
        String str = i6.c.f14113t;
        Boolean bool = Boolean.TRUE;
        WebViewActivity.D2(this, null, str, null, bool, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1() {
        String str = i6.c.f14113t;
        Boolean bool = Boolean.TRUE;
        WebViewActivity.D2(this, null, str, null, bool, bool, null);
    }

    private void U1() {
        if (b1.f10480t) {
            return;
        }
        b1.f10480t = true;
        e0.INSTANCE.e(this, getString(2132018832), getString(2132017344), true, new e0.AlertPair(getString(2132017538), new j6.e() { // from class: p5.t2
            @Override // j6.e
            public final void a() {
                com.apptionlabs.meater_app.activities.j.this.G1();
            }
        }), new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.u2
            @Override // j6.e
            public final void a() {
                com.apptionlabs.meater_app.activities.j.H1();
            }
        }), null).show();
    }

    private void V1() {
        lm.b.i(b.EnumC0292b.H, b.a.A, b.c.B);
        if (this.S == null) {
            this.S = e0.INSTANCE.e(this, getString(2132018832), getString(2132017353), true, new e0.AlertPair(getString(2132017538), new j6.e() { // from class: p5.l2
                @Override // j6.e
                public final void a() {
                    com.apptionlabs.meater_app.activities.j.this.I1();
                }
            }), new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.m2
                @Override // j6.e
                public final void a() {
                    com.apptionlabs.meater_app.activities.j.J1();
                }
            }), null);
            this.Y.show();
        }
    }

    private void W1(String str) {
        if (str != null && !str.isEmpty()) {
            lm.b.g(b.EnumC0292b.f17361x0.title, "", "");
            Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
            intent.putExtra("title", "");
            intent.putExtra("isNewsItem", true);
            intent.putExtra("url", str);
            startActivity(intent);
        }
    }

    private void Z1() {
        MeaterLinkService e10 = MeaterLinkService.e();
        if (e10 != null) {
            e10.h(false);
        }
    }

    private void c2(MEATERDevice mEATERDevice) {
        int i10;
        int i11;
        AlertDialog alertDialog = this.Y;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.Y.dismiss();
        }
        if (mEATERDevice.isMEATERBlock()) {
            i10 = 2132017348;
        } else {
            i10 = 2132018123;
        }
        String string = getString(i10);
        if (mEATERDevice.isMEATERBlock()) {
            i11 = 2132017347;
        } else {
            i11 = 2132018122;
        }
        AlertDialog e10 = e0.INSTANCE.e(this, string, getString(i11), true, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.p2
            @Override // j6.e
            public final void a() {
                com.apptionlabs.meater_app.activities.j.K1();
            }
        }), null, null);
        this.Y = e10;
        e10.show();
    }

    private void d1() {
        this.T.removeCallbacksAndMessages(null);
        k6.b.a(" >>>>>>>>>scanning was stopped lets start again  ", new Object[0]);
        if (MeaterLinkService.f9590s) {
            Z1();
        } else {
            this.T.postDelayed(new Runnable() { // from class: p5.r2
                @Override // java.lang.Runnable
                public final void run() {
                    com.apptionlabs.meater_app.activities.j.this.u1();
                }
            }, 2000L);
        }
    }

    private void k1() {
        if (!ih.a.f268a.a(this)) {
            d1();
        }
    }

    private void m1(UUID uuid) {
        s6.g gVar = this.Z;
        if (gVar != null && gVar.i() != null && this.Z.i().getId().equals(uuid)) {
            this.Z.cancel();
            this.Z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1() {
        if (!isFinishing() && MeaterLinkService.f9590s) {
            Z1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(String str) {
        long longValue = new BigInteger(str, 16).longValue();
        MEATERDevice o10 = c6.h.f8879a.o(longValue);
        if (o10 != null && o10.isPaired() && o10.isMEATERProbe()) {
            Intent intent = new Intent(this, (Class<?>) MeaterDetailsActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, longValue);
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1(Intent intent) {
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(Intent intent) {
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y1() {
        this.W = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(android.view.result.a aVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.n2
            @Override // java.lang.Runnable
            public final void run() {
                com.apptionlabs.meater_app.activities.j.this.y1();
            }
        }, 7000L);
    }

    protected void L1(String str, String str2) {
        e0.INSTANCE.e(this, "", str2, false, new e0.AlertPair("Contact Customer Support", new j6.e() { // from class: p5.o2
            @Override // j6.e
            public final void a() {
                com.apptionlabs.meater_app.activities.j.this.A1();
            }
        }), null, null).show();
    }

    public void M1(s6.g gVar) {
        if (!com.apptionlabs.meater_app.app.a.u().i0()) {
            return;
        }
        o1();
        this.Z = gVar;
        gVar.show();
    }

    protected void N1(final MEATERDevice mEATERDevice, boolean z10) {
        String string;
        String string2;
        e0.AlertPair alertPair;
        if (com.apptionlabs.meater_app.app.a.v()) {
            return;
        }
        AlertDialog alertDialog = this.Y;
        if (alertDialog != null && alertDialog.isShowing() && z10) {
            return;
        }
        AlertDialog alertDialog2 = this.Y;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.Y.dismiss();
        }
        if (z10) {
            string = getString(2132018735);
        } else {
            string = getString(2132018899, mEATERDevice.getDeviceName());
        }
        String str = string;
        if (z10) {
            string2 = getString(2132018734, mEATERDevice.getDeviceName());
        } else {
            string2 = getString(2132018900);
        }
        String str2 = string2;
        e0.Companion companion = e0.INSTANCE;
        e0.AlertPair alertPair2 = new e0.AlertPair(getString(2132018893), new j6.e() { // from class: p5.j2
            @Override // j6.e
            public final void a() {
                com.apptionlabs.meater_app.activities.j.this.B1(mEATERDevice);
            }
        });
        if (z10) {
            alertPair = null;
        } else {
            alertPair = new e0.AlertPair(getString(2132017977), new j6.e() { // from class: p5.k2
                @Override // j6.e
                public final void a() {
                    com.apptionlabs.meater_app.activities.j.C1();
                }
            });
        }
        AlertDialog e10 = companion.e(this, str, str2, false, alertPair2, alertPair, null);
        this.Y = e10;
        e10.show();
    }

    protected void O1() {
        List<String> c12 = c1();
        if (c12.isEmpty()) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator<String> it = c12.iterator();
        while (it.hasNext()) {
            intentFilter.addAction(it.next());
        }
        l0.E(this, this.V, intentFilter);
    }

    protected void P1(final i6.c cVar) {
        View i12 = i1();
        if (i12 != null && this.U != null) {
            i12.setOnClickListener(new View.OnClickListener() { // from class: p5.w2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.apptionlabs.meater_app.activities.j.this.D1(cVar, view);
                }
            });
            if (h1() != null) {
                h1().setOnClickListener(new View.OnClickListener() { // from class: p5.x2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.apptionlabs.meater_app.activities.j.this.E1(cVar, view);
                    }
                });
            }
            this.U.c(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q1(Probe probe, SavedCook savedCook) {
        o1();
        j l10 = com.apptionlabs.meater_app.app.a.l();
        if (l10 != null && (l10 instanceof CookHistory) && ((CookHistory) l10).k2() == probe.getDeviceID()) {
            l10.finish();
        }
        Intent intent = new Intent(this, (Class<?>) CookHistory.class);
        intent.putExtra(MEATERIntent.INTENT_FRAGMENT_TYPE, CookHistory.c.TemperatureGraphFragment.ordinal());
        intent.putExtra(MEATERIntent.INTENT_FRAGMENT_CONTEXT, CookHistory.b.history.ordinal());
        intent.putExtra(MEATERIntent.EXTRA_GRAPH_CONTEXT, x2.d.COOK_SUMMARY.ordinal());
        intent.putExtra(MEATERIntent.EXTRA_SAVED_COOK_ID, savedCook.getCookID());
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        startActivity(intent);
    }

    protected void R1(Intent intent) {
        S1(intent.getStringExtra(MEATERIntent.EXTRA_TITLE), intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE));
    }

    protected void S1(String str, String str2) {
        e0.INSTANCE.e(this, str, str2, false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.v2
            @Override // j6.e
            public final void a() {
                com.apptionlabs.meater_app.activities.j.F1();
            }
        }), null, null).show();
    }

    protected void T1(MEATERDevice mEATERDevice) {
        o1();
        if (ProbeHighTemperatureWarningActivity.p2() == null) {
            if (mEATERDevice.isMEATERProbe()) {
                lm.b.h(b.EnumC0292b.J.title, b.a.C.title, lm.b.b((Probe) mEATERDevice), Long.valueOf(r0.getInternalTemperature()));
            }
            Intent intent = new Intent(this, (Class<?>) ProbeHighTemperatureWarningActivity.class);
            intent.putExtra("probe_serial", mEATERDevice.getDeviceID());
            startActivityForResult(intent, 101);
        }
    }

    protected void X1(Intent intent) {
        Alert alert;
        MCNotificationType mCNotificationType;
        int intValue;
        if (!com.apptionlabs.meater_app.app.a.u().i0()) {
            return;
        }
        int intExtra = intent.getIntExtra(MEATERIntent.EXTRA_IMAGE_ID, -1);
        long longExtra = intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
        String stringExtra = intent.getStringExtra(MEATERIntent.EXTRA_TITLE);
        String stringExtra2 = intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE);
        String stringExtra3 = intent.getStringExtra(MEATERIntent.EXTRA_TAG);
        Probe probe = null;
        Alert alert2 = null;
        if (longExtra != 0) {
            mCNotificationType = MCNotificationType.fromValue(intent.getIntExtra(MEATERIntent.EXTRA_TYPE, -1));
            MEATERDevice o10 = c6.h.f8879a.o(longExtra);
            if (o10 != null && o10.isMEATERProbe()) {
                Probe probe2 = (Probe) o10;
                if (probe2.getmCut() == null) {
                    intValue = 0;
                } else {
                    intValue = probe2.getmCut().id.intValue();
                }
                if (intExtra == -1) {
                    intExtra = q0.b(getApplicationContext(), MeatCutsHelper.getInstance().getMeatIcon(intValue));
                }
                String stringExtra4 = intent.getStringExtra(MEATERIntent.EXTRA_ALERT_ID);
                if (stringExtra4 != null && (alert2 = probe2.alertWithID(UUID.fromString(stringExtra4))) != null) {
                    mCNotificationType = MCNotificationType.NOTIFICATION_TYPE_ALERT;
                }
                alert = alert2;
                probe = probe2;
            } else {
                return;
            }
        } else {
            alert = null;
            mCNotificationType = null;
        }
        if (stringExtra != null && stringExtra2 != null) {
            s6.g x10 = s6.g.x(this, stringExtra, stringExtra2, intExtra);
            x10.o(probe);
            x10.n(alert);
            x10.p(stringExtra3);
            x10.m(mCNotificationType);
            M1(x10);
        }
    }

    protected void Y1(String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        s6.g w10 = s6.g.w(this, str, str2);
        w10.p(str3);
        M1(w10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a2(l.f fVar, long j10) {
        if (fVar == l.f.eBlockStatusModeConfiguring && !this.W) {
            Intent intent = new Intent(this, (Class<?>) BlockWiFiSetupActivity.class);
            if (j10 != 0) {
                this.W = true;
                intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, j10);
                this.X.a(intent);
            }
        }
    }

    protected void b2() {
        try {
            unregisterReceiver(this.V);
        } catch (Exception unused) {
        }
    }

    protected List<String> c1() {
        return Arrays.asList(MEATERIntent.ENABLE_OR_DISABLE_SCREEN_DIMMING, MEATERIntent.SHOW_NOTIFICATION_MESSAGE, MEATERIntent.SHOW_DIALOG_MESSAGE, MEATERIntent.HIDE_CONNECTION_WARNINGS_FOR_PROBE, MEATERIntent.HIDE_ALERT, MEATERIntent.SHOW_COOK_SUMMARY, MEATERIntent.NEED_HELP_MANY_DISCONNECTS, MEATERIntent.NEED_HELP_PROBE_LOW_BATTERY, MEATERIntent.HIDE_COOK_STATE_NOTIFICATIONS_FOR_PROBE, MEATERIntent.SHOW_HIGH_TEMPERATURE_WARNING, MEATERIntent.HIDE_HIGH_TEMPERATURE_WARNING, MEATERIntent.CLOUD_CONNECTION_STATE_CHANGED, MEATERIntent.DEVICE_FIRMWARE_UPDATE_AVAILABLE, MEATERIntent.HIDE_NOTIFICATION_MESSAGE_WITH_TAG, MEATERIntent.SHOW_NOTIFICATION_MESSAGE_FOR_BLOCK_BATTERY, MEATERIntent.INVALID_IP_ADDRESS, MEATERIntent.DEVICE_NOT_REACHABLE, MEATERIntent.EXTRA_RESTART_PHONE, MEATERIntent.EXTRA_PREVIOUS_COOK_RELATED, MEATERIntent.INTENT_BLOCK_MODE, MEATERIntent.INTENT_UNSUPPORTED_DEVICE, MEATERIntent.INTENT_NEWS_FROM_SERVER);
    }

    public void e1(Probe probe) {
        s6.g gVar = this.Z;
        if (gVar != null && gVar.j() == probe && this.Z.h() == MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST) {
            this.Z.cancel();
            this.Z = null;
        }
    }

    protected void g1() {
        if (com.apptionlabs.meater_app.app.a.u().j0() && c6.h.f8879a.x()) {
            getWindow().addFlags(128);
            k6.b.q("--Keep screen on--", new Object[0]);
        } else {
            getWindow().clearFlags(128);
            k6.b.q("--Allow screen to turn off--", new Object[0]);
        }
        y.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View h1() {
        return null;
    }

    protected View i1() {
        return null;
    }

    protected void j1(Intent intent) {
        String action = intent.getAction();
        if (action != null && this == com.apptionlabs.meater_app.app.a.l()) {
            char c10 = 65535;
            switch (action.hashCode()) {
                case -1779575992:
                    if (action.equals(MEATERIntent.SHOW_NOTIFICATION_MESSAGE_FOR_BLOCK_BATTERY)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1510435338:
                    if (action.equals(MEATERIntent.NEED_HELP_PROBE_LOW_BATTERY)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1458678585:
                    if (action.equals(MEATERIntent.NEED_HELP_MANY_DISCONNECTS)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1041785051:
                    if (action.equals(MEATERIntent.DEVICE_NOT_REACHABLE)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -615412993:
                    if (action.equals(MEATERIntent.SHOW_HIGH_TEMPERATURE_WARNING)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -352281588:
                    if (action.equals(MEATERIntent.SHOW_NOTIFICATION_MESSAGE)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -327993659:
                    if (action.equals(MEATERIntent.ENABLE_OR_DISABLE_SCREEN_DIMMING)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -310089656:
                    if (action.equals(MEATERIntent.HIDE_COOK_STATE_NOTIFICATIONS_FOR_PROBE)) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -135074327:
                    if (action.equals(MEATERIntent.DEVICE_FIRMWARE_UPDATE_AVAILABLE)) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 11393517:
                    if (action.equals(MEATERIntent.INVALID_IP_ADDRESS)) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 142813146:
                    if (action.equals(MEATERIntent.HIDE_ALERT)) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 205033929:
                    if (action.equals(MEATERIntent.INTENT_BLOCK_MODE)) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 206389817:
                    if (action.equals(MEATERIntent.HIDE_NOTIFICATION_MESSAGE_WITH_TAG)) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 307729416:
                    if (action.equals(MEATERIntent.SHOW_COOK_SUMMARY)) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 309877929:
                    if (action.equals(MEATERIntent.SHOW_DIALOG_MESSAGE)) {
                        c10 = 14;
                        break;
                    }
                    break;
                case 609158570:
                    if (action.equals(MEATERIntent.CLOUD_CONNECTION_STATE_CHANGED)) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 791883651:
                    if (action.equals(MEATERIntent.HIDE_CONNECTION_WARNINGS_FOR_PROBE)) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 915531638:
                    if (action.equals(MEATERIntent.EXTRA_PREVIOUS_COOK_RELATED)) {
                        c10 = 17;
                        break;
                    }
                    break;
                case 1219513240:
                    if (action.equals(MEATERIntent.EXTRA_RESTART_PHONE)) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 1527429849:
                    if (action.equals(MEATERIntent.INTENT_NEWS_FROM_SERVER)) {
                        c10 = 19;
                        break;
                    }
                    break;
                case 1844457562:
                    if (action.equals(MEATERIntent.HIDE_HIGH_TEMPERATURE_WARNING)) {
                        c10 = 20;
                        break;
                    }
                    break;
                case 1883562501:
                    if (action.equals(MEATERIntent.INTENT_UNSUPPORTED_DEVICE)) {
                        c10 = 21;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    X1(intent);
                    return;
                case 1:
                    MEATERDevice o10 = c6.h.f8879a.o(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
                    if (o10 != null && o10.isMEATERProbe()) {
                        P1(i6.c.T);
                        return;
                    }
                    return;
                case 2:
                    if (c6.h.f8879a.o(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L)) != null) {
                        P1(i6.c.X);
                        return;
                    }
                    return;
                case 3:
                    V1();
                    return;
                case 4:
                    MEATERDevice o11 = c6.h.f8879a.o(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
                    if (o11 != null) {
                        T1(o11);
                        return;
                    }
                    return;
                case 5:
                    X1(intent);
                    return;
                case 6:
                    g1();
                    return;
                case 7:
                    MEATERDevice o12 = c6.h.f8879a.o(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
                    if (o12 != null && o12.isMEATERProbe()) {
                        n1((Probe) o12);
                        return;
                    }
                    return;
                case '\b':
                    long longExtra = intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
                    boolean booleanExtra = intent.getBooleanExtra(MEATERIntent.EXTRA_MUST_UPDATE, false);
                    MEATERDevice o13 = c6.h.f8879a.o(longExtra);
                    if (o13 != null) {
                        if (o13.isMEATERBlock() || o13.isMEATERPlus()) {
                            N1(o13, booleanExtra);
                            return;
                        }
                        return;
                    }
                    return;
                case '\t':
                    U1();
                    return;
                case '\n':
                    String stringExtra = intent.getStringExtra(MEATERIntent.EXTRA_ALERT_ID);
                    if (stringExtra != null) {
                        m1(UUID.fromString(stringExtra));
                        return;
                    }
                    return;
                case 11:
                    if (com.apptionlabs.meater_app.app.a.d()) {
                        a2(l.f.values()[intent.getIntExtra(MEATERIntent.EXTRA_BLOCK_MODE, 0)], intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
                        return;
                    }
                    return;
                case '\f':
                    q1(intent.getStringExtra(MEATERIntent.EXTRA_TAG));
                    return;
                case '\r':
                    MEATERDevice o14 = c6.h.f8879a.o(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
                    SavedCook f10 = LocalStorage.sharedStorage().savedCookDAO().f(intent.getExtras().getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
                    if (f10 != null && o14 != null && o14.isMEATERProbe()) {
                        Q1((Probe) o14, f10);
                        return;
                    }
                    return;
                case 14:
                    R1(intent);
                    return;
                case 15:
                    f1(y5.g.E().P());
                    break;
                case 16:
                    break;
                case 17:
                    Y1(intent.getStringExtra(MEATERIntent.EXTRA_TITLE), intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE), null);
                    return;
                case 18:
                    Y1(intent.getStringExtra(MEATERIntent.EXTRA_TITLE), intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE), null);
                    return;
                case 19:
                    W1(intent.getStringExtra(MEATERIntent.EXTRA_NEWS_URL));
                    return;
                case 20:
                    MEATERDevice o15 = c6.h.f8879a.o(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
                    if (o15 != null && o15.isMEATERProbe()) {
                        p1((Probe) o15);
                        return;
                    }
                    return;
                case 21:
                    intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
                    if (b1.B) {
                        return;
                    }
                    b1.B = true;
                    L1("Error!", "Failed to connect to device. Please contact MEATER Customer Support, quoting reference 23ACM.");
                    return;
                default:
                    return;
            }
            MEATERDevice o16 = c6.h.f8879a.o(intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
            if (o16 != null && o16.isMEATERProbe()) {
                e1((Probe) o16);
            }
        }
    }

    public void l1() {
        Bundle extras;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("ProbeID")) {
            final String string = extras.getString("ProbeID");
            if (!string.isEmpty()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.apptionlabs.meater_app.activities.j.this.v1(string);
                    }
                }, 150L);
            }
        }
    }

    public void n1(Probe probe) {
        s6.g gVar = this.Z;
        if (gVar != null && gVar.j() == probe) {
            MCNotificationType h10 = this.Z.h();
            if (h10 == MCNotificationType.NOTIFICATION_TYPE_READY_FOR_RESTING || h10 == MCNotificationType.NOTIFICATION_TYPE_COOK_READY || h10 == MCNotificationType.NOTIFICATION_TYPE_SLIGHTLY_OVERCOOKED || h10 == MCNotificationType.NOTIFICATION_TYPE_OVERCOOK) {
                this.Z.cancel();
                this.Z = null;
            }
        }
    }

    public void o1() {
        s6.g gVar = this.Z;
        if (gVar != null) {
            try {
                gVar.cancel();
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
            }
            this.Z = null;
        }
    }

    @Override // androidx.appcompat.app.c, android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m0.a(this);
        MeatCutsHelper.getInstance().clear();
        MeatCutsHelper.getInstance().init(getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        if (com.apptionlabs.meater_app.app.a.l() == this) {
            if (!com.apptionlabs.meater_app.app.a.y()) {
                com.apptionlabs.meater_app.app.a.A(null);
            }
            o1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        g1();
        com.apptionlabs.meater_app.app.a.A(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!b1.f10481u && !com.apptionlabs.meater_app.app.a.y()) {
            com.apptionlabs.meater_app.app.a.A(this);
        }
        this.U = new e1(this, h1());
        O1();
        z.d(null);
        if (com.apptionlabs.meater_app.app.a.b() && !x.E().w()) {
            k1();
        } else {
            k6.b.a(" >>>>>>>>>scanning No need to restart  ????? %s", Boolean.valueOf(x.E().w()));
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        AlertDialog alertDialog = this.Y;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        b2();
    }

    public void q1(String str) {
        s6.g gVar = this.Z;
        if (gVar != null && Objects.equals(gVar.k(), str)) {
            this.Z.cancel();
            this.Z = null;
        }
    }

    public void r1(MEATERDevice mEATERDevice) {
        if (mEATERDevice != null && mEATERDevice.isPaired() && mEATERDevice.isMEATERProbe() && !(this instanceof RecipeStepsActivity)) {
            j l10 = com.apptionlabs.meater_app.app.a.l();
            if (l10 != null && (l10 instanceof MeaterDetailsActivity)) {
                MeaterDetailsActivity meaterDetailsActivity = (MeaterDetailsActivity) l10;
                if (meaterDetailsActivity.l2(mEATERDevice.getDeviceID())) {
                    return;
                }
                if (mEATERDevice.getDeviceID() == meaterDetailsActivity.r2()) {
                    return;
                }
            }
            final Intent intent = new Intent(this, (Class<?>) MeaterDetailsActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
            if (getResources().getConfiguration().orientation == 2) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.apptionlabs.meater_app.activities.j.this.w1(intent);
                    }
                }, 2000L);
            } else {
                startActivity(intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s1(MEATERDevice mEATERDevice, Integer num) {
        Intent intent = new Intent(this, (Class<?>) RecipeStepsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, num);
        startActivity(intent);
    }

    public void t1(Integer num) {
        j l10 = com.apptionlabs.meater_app.app.a.l();
        if (l10 != null && (l10 instanceof RecipeStepsActivity)) {
            return;
        }
        final Intent intent = new Intent(this, (Class<?>) RecipeStepsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, num);
        if (getResources().getConfiguration().orientation == 2) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.y2
                @Override // java.lang.Runnable
                public final void run() {
                    com.apptionlabs.meater_app.activities.j.this.x1(intent);
                }
            }, 2000L);
        } else {
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K1() {
    }

    protected void f1(CloudMQTTConnectionState cloudMQTTConnectionState) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p1(Probe probe) {
    }
}
