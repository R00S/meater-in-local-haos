package com.apptionlabs.meater_app.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.Toast;
import b6.w;
import com.apptionlabs.meater_app.activities.MEATERPlusFirmwareUpdateActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.DevicesType;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MEATERPlus;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.versions.FirmwareInfo;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import f8.c0;
import f8.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import lm.b;
import t5.w0;
import t5.y0;
import y5.d;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERPlusFirmwareUpdateActivity extends j {

    /* renamed from: a0, reason: collision with root package name */
    w f9424a0;

    /* renamed from: b0, reason: collision with root package name */
    private MEATERPlus f9425b0;

    /* renamed from: c0, reason: collision with root package name */
    private long f9426c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f9427d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f9428e0;

    /* renamed from: f0, reason: collision with root package name */
    private String f9429f0;

    /* renamed from: g0, reason: collision with root package name */
    y0 f9430g0;

    /* renamed from: h0, reason: collision with root package name */
    AlertDialog f9431h0;

    /* renamed from: i0, reason: collision with root package name */
    private String f9432i0;

    /* renamed from: j0, reason: collision with root package name */
    private String f9433j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f9434k0;

    /* renamed from: l0, reason: collision with root package name */
    String f9435l0 = "";

    /* renamed from: m0, reason: collision with root package name */
    boolean f9436m0 = false;

    /* renamed from: n0, reason: collision with root package name */
    android.view.o f9437n0 = new c(true);

    /* renamed from: o0, reason: collision with root package name */
    private final y0.d f9438o0 = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements d.b {
        a() {
        }

        @Override // y5.d.b
        public void a() {
            MEATERPlusFirmwareUpdateActivity.this.I2();
        }

        @Override // y5.d.b
        public void b(ByteBuffer byteBuffer) {
            MEATERPlusFirmwareUpdateActivity.this.O2(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b implements d.b {
        b() {
        }

        @Override // y5.d.b
        public void a() {
            MEATERPlusFirmwareUpdateActivity mEATERPlusFirmwareUpdateActivity = MEATERPlusFirmwareUpdateActivity.this;
            mEATERPlusFirmwareUpdateActivity.L2(mEATERPlusFirmwareUpdateActivity.getString(2132018832), MEATERPlusFirmwareUpdateActivity.this.getString(2132017683), true);
        }

        @Override // y5.d.b
        public void b(ByteBuffer byteBuffer) {
            MEATERPlusFirmwareUpdateActivity.this.O2(byteBuffer);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class c extends android.view.o {
        c(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            MEATERPlusFirmwareUpdateActivity mEATERPlusFirmwareUpdateActivity = MEATERPlusFirmwareUpdateActivity.this;
            if (mEATERPlusFirmwareUpdateActivity.f9430g0 == null) {
                mEATERPlusFirmwareUpdateActivity.finish();
            } else {
                Toast.makeText(com.apptionlabs.meater_app.app.a.i(), "System in process , Please wait", 1).show();
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class d implements y0.d {
        d() {
        }

        @Override // t5.y0.d
        public void a(String str) {
            if (MEATERPlusFirmwareUpdateActivity.this.f9433j0 != null) {
                if (str.equals(MEATERPlusFirmwareUpdateActivity.this.getResources().getString(2132018818))) {
                    if (l0.d(MEATERPlusFirmwareUpdateActivity.this.f9435l0, "2.0") == -1) {
                        lm.b.g(b.EnumC0292b.E.title, b.a.f17304x.title, MEATERPlusFirmwareUpdateActivity.this.f9435l0);
                    } else {
                        lm.b.g(b.EnumC0292b.E.title, b.a.f17303w.title, MEATERPlusFirmwareUpdateActivity.this.f9435l0);
                    }
                } else {
                    lm.b.g(b.EnumC0292b.E.title, b.a.f17306z.title, str);
                }
            }
            MEATERPlusFirmwareUpdateActivity.this.x2();
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.S.setVisibility(4);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.U.setVisibility(0);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.R.setVisibility(8);
            if (Config.getInstance().FetchMEATERPlusFirmwareFromCloud) {
                MEATERPlusFirmwareUpdateActivity.this.M2("FAIL");
            } else if (MEATERPlusFirmwareUpdateActivity.this.f9428e0) {
                MEATERPlusFirmwareUpdateActivity.this.K2(str);
            } else {
                MEATERPlusFirmwareUpdateActivity.this.f9429f0 = str;
            }
        }

        @Override // t5.y0.d
        public void b() {
            MEATERPlusFirmwareUpdateActivity.this.A2();
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.S.setVisibility(4);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.U.setVisibility(0);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.R.setVisibility(8);
        }

        @Override // t5.y0.d
        public void c() {
            if (MEATERPlusFirmwareUpdateActivity.this.f9433j0 != null) {
                lm.b.g(b.EnumC0292b.E.title, b.a.f17300t.title, MEATERPlusFirmwareUpdateActivity.this.f9433j0);
            }
            MEATERPlusFirmwareUpdateActivity.this.x2();
            if (Config.getInstance().FetchMEATERPlusFirmwareFromCloud) {
                MEATERPlusFirmwareUpdateActivity.this.M2("SUCCESS");
            }
            MEATERPlusFirmwareUpdateActivity.this.z2();
        }

        @Override // t5.y0.d
        public void d() {
            MEATERPlusFirmwareUpdateActivity.this.w2();
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.S.setVisibility(4);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.U.setVisibility(0);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.R.setVisibility(8);
        }

        @Override // t5.y0.d
        public void e() {
            MEATERPlusFirmwareUpdateActivity.this.f9427d0++;
            MEATERPlusFirmwareUpdateActivity.this.v2();
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.S.setVisibility(4);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.U.setVisibility(0);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.R.setVisibility(8);
        }

        @Override // t5.y0.d
        public void f(double d10) {
            MEATERPlusFirmwareUpdateActivity.this.A2();
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.S.setVisibility(4);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.U.setVisibility(0);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.R.setVisibility(8);
            MEATERPlusFirmwareUpdateActivity.this.f9424a0.U.setProgress((int) (d10 * 100.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A2() {
        SpannableString spannableString = new SpannableString(getApplicationContext().getString(2132018903) + "\n\n");
        spannableString.setSpan(new RelativeSizeSpan(1.3f), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(getApplicationContext().getString(2132018132) + "\n");
        spannableString2.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString2.length(), 0);
        this.f9424a0.X.setText(TextUtils.concat(spannableString, spannableString2));
        this.f9424a0.X.setVisibility(0);
        this.f9424a0.Y.setVisibility(8);
    }

    private void B2(MEATERPlus mEATERPlus) {
        DevicesType devicesType;
        MEATERDeviceType mEATERDeviceType = mEATERPlus.getMEATERDeviceType();
        if (mEATERDeviceType == MEATERDeviceType.PLUS) {
            devicesType = DevicesType.MEATER_PLUS;
        } else if (mEATERDeviceType == MEATERDeviceType.PLUS_SE) {
            devicesType = DevicesType.MEATER_PLUS_SE;
        } else if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_PLUS) {
            devicesType = DevicesType.MEATER_PLUSV2;
        } else {
            devicesType = DevicesType.MEATER_PLUS;
        }
        this.f9434k0 = l0.e(FirmwareVersion.sharedInstance().getUpdateCrc(devicesType));
        this.f9433j0 = FirmwareVersion.sharedInstance().getVersion(devicesType);
        ByteBuffer firmware = FirmwareVersion.sharedInstance().getFirmware(devicesType);
        if (firmware != null) {
            lm.b.g(b.EnumC0292b.E.title, b.a.f17302v.title, this.f9433j0);
            O2(firmware);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C2() {
        if (!isFinishing()) {
            y5.d.INSTANCE.c(this.f9432i0, new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D2() {
        x2();
        if (!isFinishing()) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E2(boolean z10) {
        if (z10) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F2() {
        if (!isFinishing()) {
            finish();
        }
    }

    private void G2() {
        H2();
        MEATERDevice o10 = c6.h.f8879a.o(getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L));
        if (o10 != null && o10.isMEATERPlus()) {
            this.f9425b0 = (MEATERPlus) o10;
            N2();
            J2(o10);
            if (((w0) this.f9425b0.getBleConnection()) != null && this.f9425b0.getOtaUpdateInProgress() != null) {
                y0 otaUpdateInProgress = this.f9425b0.getOtaUpdateInProgress();
                this.f9430g0 = otaUpdateInProgress;
                otaUpdateInProgress.r(this.f9425b0, this.f9438o0);
                this.f9438o0.b();
                return;
            }
            return;
        }
        finish();
    }

    private void H2() {
        this.f9432i0 = getIntent().getStringExtra(FirmwareInfo.Key.URL.name());
        this.f9434k0 = l0.e(getIntent().getStringExtra(FirmwareInfo.Key.CRC.name()));
        this.f9433j0 = getIntent().getStringExtra(FirmwareInfo.Key.VERSION.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.d3
            @Override // java.lang.Runnable
            public final void run() {
                MEATERPlusFirmwareUpdateActivity.this.C2();
            }
        }, 300L);
    }

    private void J2(MEATERDevice mEATERDevice) {
        if (mEATERDevice != null && mEATERDevice.mustFirmwareUpdate()) {
            this.f9424a0.Z.setClickable(false);
            this.f9424a0.Z.setFocusable(false);
            this.f9424a0.Z.setBackground(l0.j(this, 2131231530));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2(String str) {
        if (!isFinishing() && this.f9428e0 && this.f9436m0) {
            if (str == null) {
                str = l0.r(this, "\n", 2132018891, 2132018892);
            }
            AlertDialog e10 = e0.INSTANCE.e(this, getString(2132018890), str, false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.c3
                @Override // j6.e
                public final void a() {
                    MEATERPlusFirmwareUpdateActivity.this.D2();
                }
            }), null, null);
            this.f9431h0 = e10;
            e10.show();
            return;
        }
        this.f9430g0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2(String str, String str2, final boolean z10) {
        AlertDialog alertDialog = this.f9431h0;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f9431h0.dismiss();
        }
        AlertDialog e10 = e0.INSTANCE.e(this, str, str2, false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.f3
            @Override // j6.e
            public final void a() {
                MEATERPlusFirmwareUpdateActivity.this.E2(z10);
            }
        }), null, null);
        this.f9431h0 = e10;
        e10.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2(String str) {
        String str2 = " (Time: " + c0.f((System.currentTimeMillis() / 1000) - this.f9426c0) + " Disconnects: " + this.f9427d0 + ")";
        if (isFinishing()) {
            return;
        }
        e0.INSTANCE.e(this, str, str2, false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.e3
            @Override // j6.e
            public final void a() {
                MEATERPlusFirmwareUpdateActivity.this.F2();
            }
        }), null, null).show();
        k6.b.m("MEATER+ OTA " + str + str2, new Object[0]);
    }

    private void N2() {
        Context applicationContext;
        int i10;
        DevicesType devicesType;
        SpannableString spannableString = new SpannableString(getApplicationContext().getString(2132017509) + "\n\n");
        spannableString.setSpan(new RelativeSizeSpan(1.3f), 0, spannableString.length(), 0);
        boolean z10 = getApplicationContext().getResources().getBoolean(2131034115);
        StringBuilder sb = new StringBuilder();
        String string = getApplicationContext().getString(2132017780);
        Object[] objArr = new Object[1];
        if (z10) {
            applicationContext = getApplicationContext();
            i10 = 2132018182;
        } else {
            applicationContext = getApplicationContext();
            i10 = 2132018180;
        }
        objArr[0] = applicationContext.getString(i10);
        sb.append(String.format(string, objArr));
        sb.append("\n\n");
        SpannableString spannableString2 = new SpannableString(sb.toString());
        spannableString2.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString2.length(), 0);
        String firmwareRevision = this.f9425b0.getFirmwareRevision();
        String str = this.f9433j0;
        if (str == null) {
            MEATERDeviceType mEATERDeviceType = this.f9425b0.getMEATERDeviceType();
            if (mEATERDeviceType == MEATERDeviceType.PLUS) {
                devicesType = DevicesType.MEATER_PLUS;
            } else if (mEATERDeviceType == MEATERDeviceType.PLUS_SE) {
                devicesType = DevicesType.MEATER_PLUS_SE;
            } else if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_PLUS) {
                devicesType = DevicesType.MEATER_PLUSV2;
            } else {
                devicesType = DevicesType.MEATER_PLUS;
            }
            str = FirmwareVersion.sharedInstance().getVersion(devicesType);
        }
        SpannableString spannableString3 = new SpannableString(firmwareRevision + " -> " + str);
        spannableString3.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString3.length(), 0);
        this.f9424a0.Y.setText(TextUtils.concat(spannableString, spannableString2, spannableString3));
        if (this.f9425b0.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS) {
            this.f9424a0.Q.setAnimation(2131951706);
        } else if (this.f9425b0.getMEATERDeviceType() == MEATERDeviceType.PLUS_SE) {
            this.f9424a0.Q.setAnimation(2131951708);
        } else {
            this.f9424a0.Q.setAnimation(2131951707);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v2() {
        SpannableString spannableString = new SpannableString(getApplicationContext().getString(2132017528) + "\n\n");
        spannableString.setSpan(new RelativeSizeSpan(1.3f), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(getApplicationContext().getString(2132018113) + "\n");
        spannableString2.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString2.length(), 0);
        this.f9424a0.X.setText(TextUtils.concat(spannableString, spannableString2));
        this.f9424a0.X.setVisibility(0);
        this.f9424a0.Y.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w2() {
        SpannableString spannableString = new SpannableString(getApplicationContext().getString(2132018126) + "\n\n");
        spannableString.setSpan(new RelativeSizeSpan(1.3f), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(getApplicationContext().getString(2132018114) + "\n");
        spannableString2.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString2.length(), 0);
        this.f9424a0.X.setText(TextUtils.concat(spannableString, spannableString2));
        this.f9424a0.X.setVisibility(0);
        this.f9424a0.Y.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2() {
        if (this.f9425b0.relatedProbe() != null) {
            this.f9425b0.relatedProbe().setFirstSeenAdvertising(System.currentTimeMillis() + 20000);
        }
        this.f9425b0.setOtaUpdateInProgress(null);
        if (this.f9425b0.getBleConnection() != null) {
            this.f9425b0.getBleConnection().n();
        }
        this.f9430g0 = null;
    }

    private void y2() {
        String str = this.f9433j0;
        if (str != null) {
            lm.b.g(b.EnumC0292b.E.title, b.a.f17302v.title, str);
        }
        y5.d.INSTANCE.c(this.f9432i0, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z2() {
        this.f9424a0.S.setVisibility(4);
        this.f9424a0.U.setVisibility(8);
        this.f9424a0.R.setVisibility(0);
        this.f9436m0 = false;
        SpannableString spannableString = new SpannableString(getApplicationContext().getString(2132018125) + "\n");
        spannableString.setSpan(new RelativeSizeSpan(1.3f), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(getApplicationContext().getString(2132018121));
        spannableString2.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString2.length(), 0);
        this.f9424a0.X.setText(TextUtils.concat(spannableString, spannableString2));
        this.f9424a0.X.setVisibility(0);
        this.f9424a0.Y.setVisibility(8);
    }

    public void O2(ByteBuffer byteBuffer) {
        this.f9426c0 = System.currentTimeMillis() / 1000;
        if (((w0) this.f9425b0.getBleConnection()) != null) {
            this.f9425b0.setBatteryLevel(0);
            this.f9425b0.setFirmwareRevision(null);
            y0 y0Var = new y0(this.f9425b0, byteBuffer, this.f9434k0, this.f9438o0);
            this.f9430g0 = y0Var;
            y0Var.v();
            this.f9438o0.f(0.0d);
            if (this.f9425b0.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS) {
                this.f9424a0.Q.setAnimation(2131951713);
            } else if (this.f9425b0.getMEATERDeviceType() == MEATERDeviceType.PLUS_SE) {
                this.f9424a0.Q.setAnimation(2131951715);
            } else {
                this.f9424a0.Q.setAnimation(2131951714);
            }
            this.f9424a0.Q.v();
            return;
        }
        K2(null);
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected List<String> c1() {
        return new ArrayList();
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9424a0 = (w) androidx.databinding.g.j(this, 2131558447);
        G2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9424a0 = (w) androidx.databinding.g.j(this, 2131558447);
        x0().m();
        G2();
        getOnBackPressedDispatcher().h(this, this.f9437n0);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        long j10;
        super.onDestroy();
        b1.f10481u = false;
        c6.h hVar = c6.h.f8879a;
        MEATERDevice o10 = hVar.o(this.f9425b0.getDeviceID());
        if (o10 != null && o10.isOnline()) {
            MEATERPlus mEATERPlus = this.f9425b0;
            DeviceConnectionState deviceConnectionState = DeviceConnectionState.CONNECTED;
            mEATERPlus.setConnectionState(deviceConnectionState);
            Probe relatedProbe = this.f9425b0.relatedProbe();
            if (relatedProbe != null) {
                j10 = relatedProbe.getDeviceID();
            } else {
                j10 = 0;
            }
            MEATERDevice o11 = hVar.o(j10);
            if (o11 != null && o11.isOnline()) {
                o11.setConnectionState(deviceConnectionState);
                o11.notifyStateUpdated();
            }
        }
        getWindow().clearFlags(128);
    }

    public void onGotItClick(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f9428e0 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        b1.f10481u = true;
        this.f9428e0 = true;
        getWindow().addFlags(128);
        String str = this.f9429f0;
        if (str != null) {
            k6.b.m("Update failed while we were in the background: %s", str);
            this.f9438o0.a(this.f9429f0);
        }
    }

    public void onStartUpdateClick(View view) {
        if (this.f9436m0) {
            return;
        }
        this.f9436m0 = true;
        MEATERPlus mEATERPlus = this.f9425b0;
        if (mEATERPlus != null) {
            mEATERPlus.setConnectionState(DeviceConnectionState.OFFLINE);
        }
        this.f9424a0.S.setVisibility(4);
        this.f9424a0.U.setVisibility(0);
        A2();
        if (this.f9432i0 == null) {
            B2(this.f9425b0);
        } else {
            y2();
        }
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        AlertDialog alertDialog = this.f9431h0;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void onUpdateLaterClick(View view) {
        lm.b.g(b.EnumC0292b.E.title, b.a.f17301u.title, "");
        finish();
    }
}
