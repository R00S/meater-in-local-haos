package com.apptionlabs.meater_app.activities;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n0;
import com.apptionlabs.meater_app.activities.BlockWiFiSetupActivity;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.WiFiSSID;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.views.b0;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import f8.l0;
import h6.c3;
import h6.e1;
import h6.s0;
import h6.u;
import h6.v;
import h6.y2;
import j6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t5.q0;
import t5.t0;

/* loaded from: /tmp/meat/meat/classes.dex */
public class BlockWiFiSetupActivity extends j {

    /* renamed from: a0, reason: collision with root package name */
    private MEATERBlock f9264a0;

    /* renamed from: b0, reason: collision with root package name */
    t0 f9265b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f9266c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f9267d0;

    /* renamed from: e0, reason: collision with root package name */
    public w f9268e0;

    /* renamed from: j0, reason: collision with root package name */
    AlertDialog f9273j0;

    /* renamed from: k0, reason: collision with root package name */
    private com.apptionlabs.meater_app.qsg.ui.wifisetup.c f9274k0;

    /* renamed from: f0, reason: collision with root package name */
    public String f9269f0 = null;

    /* renamed from: g0, reason: collision with root package name */
    public String f9270g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    private ArrayList<WiFiSSID> f9271h0 = new ArrayList<>();

    /* renamed from: i0, reason: collision with root package name */
    private ArrayList<WiFiSSID> f9272i0 = new ArrayList<>();

    /* renamed from: l0, reason: collision with root package name */
    private final BlockWiFiSetupActivity f9275l0 = this;

    /* renamed from: m0, reason: collision with root package name */
    public String f9276m0 = "";

    /* renamed from: n0, reason: collision with root package name */
    private WiFiSSID f9277n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    boolean f9278o0 = false;

    /* renamed from: p0, reason: collision with root package name */
    android.view.o f9279p0 = new a(true);

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends android.view.o {
        a(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            Fragment i02 = BlockWiFiSetupActivity.this.m0().i0(2131362018);
            if (i02 instanceof c3) {
                BlockWiFiSetupActivity.this.o2();
                return;
            }
            if (i02 instanceof v) {
                Log.info("BlockWiFiSetup", "ignore ");
            } else if (!(i02 instanceof s0)) {
                BlockWiFiSetupActivity.this.w2();
            } else {
                BlockWiFiSetupActivity.this.h2(false);
            }
        }
    }

    private void i2(String str, String str2) {
        e0.INSTANCE.e(this, str, str2, false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.d0
            @Override // j6.e
            public final void a() {
                BlockWiFiSetupActivity.this.k2();
            }
        }), null, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2() {
        h2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l2() {
        h2(false);
    }

    private int n2() {
        return this.f9265b0.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w2() {
        if (isFinishing()) {
            return;
        }
        AlertDialog e10 = e0.INSTANCE.e(this, getString(2132017407), getString(2132017406), false, new e0.AlertPair(getString(2132018978), new j6.e() { // from class: p5.b0
            @Override // j6.e
            public final void a() {
                BlockWiFiSetupActivity.this.l2();
            }
        }), new e0.AlertPair(getString(2132018306), new j6.e() { // from class: p5.c0
            @Override // j6.e
            public final void a() {
                BlockWiFiSetupActivity.m2();
            }
        }), null);
        this.f9273j0 = e10;
        e10.show();
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected List<String> c1() {
        return Arrays.asList(MEATERIntent.BLOCK_WIFI_SETUP_CONNECTED, MEATERIntent.BLOCK_WIFI_SETUP_NETWORK_LIST_UPDATED, MEATERIntent.BLOCK_WIFI_SETUP_CONNECT_FAILED, MEATERIntent.BLOCK_WIFI_SETUP_FAILED, MEATERIntent.BLOCK_WIFI_SETUP_COMPLETE, MEATERIntent.BLOCK_WIFI_SETUP_STARTING_CONNECTIVITY_TEST, MEATERIntent.BLOCK_WIFI_SETUP_CONNECTIVITY_TEST_FAILED);
    }

    public void h2(boolean z10) {
        t0.w();
        Intent intent = new Intent();
        intent.setPackage(com.apptionlabs.meater_app.app.a.i().getPackageName());
        setResult(-1, intent);
        intent.putExtra(MEATERIntent.EXTRA_BLOCK_SET_UP_COMPLETE, z10);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, this.f9264a0.getDeviceID());
        finish();
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected void j1(Intent intent) {
        ArrayList<WiFiSSID> arrayList;
        String action = intent.getAction();
        if (action != null && this == com.apptionlabs.meater_app.app.a.l()) {
            char c10 = 65535;
            switch (action.hashCode()) {
                case -1345133407:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_CONNECTIVITY_TEST_FAILED)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -767684644:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_FAILED)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -294912838:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_STARTING_CONNECTIVITY_TEST)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -285458152:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_COMPLETE)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -23497430:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_NETWORK_LIST_UPDATED)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 564453130:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_CONNECTED)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1429468959:
                    if (action.equals(MEATERIntent.BLOCK_WIFI_SETUP_CONNECT_FAILED)) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    x2(h6.m.D2(l6.a.i(intent.getIntExtra(MEATERIntent.EXTRA_TAG, 0))));
                    return;
                case 1:
                    i2(intent.getStringExtra(MEATERIntent.EXTRA_TITLE), intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE));
                    return;
                case 2:
                    x2(y2.y2(this.f9276m0, ""));
                    return;
                case 3:
                    x2(new s0());
                    return;
                case 4:
                    this.f9272i0 = l0.l(intent.getExtras(), MEATERIntent.EXTRA_RECOMMENDED_NETWORKS, WiFiSSID.class);
                    ArrayList<WiFiSSID> l10 = l0.l(intent.getExtras(), MEATERIntent.EXTRA_AVAILABLE_NETWORKS, WiFiSSID.class);
                    this.f9271h0 = l10;
                    w wVar = this.f9268e0;
                    if (wVar != null && (arrayList = this.f9272i0) != null && l10 != null) {
                        wVar.v(arrayList, l10);
                        return;
                    }
                    return;
                case 5:
                    if (this.f9268e0 != null) {
                        this.f9266c0 = intent.getStringExtra(MEATERIntent.EXTRA_BLOCK_MAC_ADDRESS);
                        this.f9267d0 = intent.getStringExtra(MEATERIntent.EXTRA_BLOCK_FW_VERSION);
                        this.f9268e0.i(intent.getStringExtra(MEATERIntent.EXTRA_CURRENT_BLOCK_SSID));
                        return;
                    }
                    return;
                case 6:
                    if (!(m0().i0(2131362018) instanceof c3)) {
                        String str = this.f9269f0;
                        if ((str == null || !str.equalsIgnoreCase(intent.getStringExtra(MEATERIntent.EXTRA_TITLE))) && this.f9277n0 != null) {
                            this.f9269f0 = intent.getStringExtra(MEATERIntent.EXTRA_TITLE);
                            this.f9270g0 = intent.getStringExtra(MEATERIntent.EXTRA_MESSAGE);
                            p2(this.f9277n0);
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

    public String j2() {
        return t0.x();
    }

    public void o2() {
        AlertDialog alertDialog = this.f9273j0;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f9278o0 = false;
        e1 e1Var = new e1();
        e1Var.f13371y0 = this.f9271h0;
        e1Var.f13372z0 = this.f9272i0;
        x2(e1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        q0 q0Var;
        super.onCreate(bundle);
        setContentView(2131558470);
        this.f9274k0 = (com.apptionlabs.meater_app.qsg.ui.wifisetup.c) new android.view.t0(this).a(com.apptionlabs.meater_app.qsg.ui.wifisetup.c.class);
        MEATERDevice o10 = c6.h.f8879a.o(getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
        MEATERBlock mEATERBlock = (MEATERBlock) o10;
        this.f9264a0 = mEATERBlock;
        if (mEATERBlock.isSupportsBLEKeepAlive()) {
            q0Var = (q0) o10.getBleConnection();
        } else {
            q0Var = null;
        }
        this.f9265b0 = t0.G(this.f9264a0, q0Var);
        if (!isFinishing()) {
            n0 p10 = m0().p();
            p10.b(2131362018, new u());
            p10.j();
        }
        getOnBackPressedDispatcher().h(this, this.f9279p0);
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
        super.onResume();
        b1.f10481u = true;
        this.f9265b0.J();
    }

    public void p2(WiFiSSID wiFiSSID) {
        this.f9278o0 = true;
        String N = q0.N(wiFiSSID.getName().L());
        this.f9276m0 = N;
        this.f9277n0 = wiFiSSID;
        x2(c3.D2(N, "", wiFiSSID.getEncryptionType(), n2()));
    }

    public void q2(String str, String str2) {
        this.f9269f0 = null;
        this.f9276m0 = str;
        this.f9265b0.s(str, str2);
        x2(v.y2(str, ""));
    }

    public void r2() {
        this.f9265b0.D();
    }

    public void s2() {
        this.f9265b0.E();
    }

    public void t2() {
        b0.h(this.f9275l0, "Error", getString(2132017365), 2132018340, new b(this));
    }

    public void u2() {
        if (!isFinishing()) {
            WebViewActivity.D2(this, null, i6.c.A, null, Boolean.TRUE, Boolean.FALSE, null);
        }
    }

    public void v2() {
        if (!isFinishing()) {
            Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", "https://support.meater.com/faqs/app-block-communication");
            startActivity(intent);
        }
    }

    public void x2(Fragment fragment) {
        if (fragment != null && !isFinishing()) {
            m0().p().t(2131362018, fragment).k();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b implements b0.a {
        b(BlockWiFiSetupActivity blockWiFiSetupActivity) {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void a() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m2() {
    }
}
