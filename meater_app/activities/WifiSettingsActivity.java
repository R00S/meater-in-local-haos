package com.apptionlabs.meater_app.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import b6.l0;
import c6.h;
import com.apptionlabs.meater_app.activities.WifiSettingsActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.InfoPair;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.NetworkSettingsObject;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.l1;
import f8.r0;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import q5.u;

/* loaded from: /tmp/meat/meat/classes.dex */
public class WifiSettingsActivity extends j implements j6.b {

    /* renamed from: a0, reason: collision with root package name */
    private l0 f9548a0;

    /* renamed from: b0, reason: collision with root package name */
    private u f9549b0;

    /* renamed from: c0, reason: collision with root package name */
    NetworkSettingsObject f9550c0;

    /* renamed from: d0, reason: collision with root package name */
    MEATERDevice f9551d0;

    /* renamed from: e0, reason: collision with root package name */
    boolean f9552e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    private final BroadcastReceiver f9553f0 = new a();

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null && intent.getAction() != null && intent.getAction().equals(ProtocolParameters.NETWORK_SETTING_NOTIF)) {
                WifiSettingsActivity.this.f9548a0.R.setVisibility(8);
                WifiSettingsActivity.this.f9550c0 = (NetworkSettingsObject) f8.l0.k(intent.getExtras(), MEATERIntent.EXTRA_NETWORK_SETTING_OBJECT, NetworkSettingsObject.class);
                WifiSettingsActivity.this.s2();
                WifiSettingsActivity.this.t2();
                Log.info("WifiSettingsActivity", "mlBroadcastReceiver received");
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum b {
        ipAddress,
        netWorkMask,
        gateway,
        dns
    }

    private boolean k2() {
        NetworkSettingsObject networkSettingsObject;
        if (l2() != null && (networkSettingsObject = this.f9550c0) != null) {
            return !r0.equals(networkSettingsObject.networkMask);
        }
        return false;
    }

    private String l2() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!nextElement.isLoopback()) {
                    for (InterfaceAddress interfaceAddress : nextElement.getInterfaceAddresses()) {
                        if (interfaceAddress.getBroadcast() != null) {
                            return n2(interfaceAddress.getNetworkPrefixLength());
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void m2() {
        u uVar = new u(this);
        this.f9549b0 = uVar;
        this.f9548a0.Q.setAdapter(uVar);
        this.f9548a0.Q.setLayoutManager(new LinearLayoutManager(this));
        this.f9548a0.Q.j(new l1());
        this.f9548a0.Q.setItemAnimator(null);
        this.f9548a0.Q.setNestedScrollingEnabled(false);
        this.f9548a0.Q.setHasFixedSize(true);
        this.f9549b0.N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o2() {
        if (this.f9550c0 == null) {
            v2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(View view) {
        Intent intent;
        if (this.f9552e0) {
            intent = new Intent(this, (Class<?>) BlockWiFiSetupActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, this.f9551d0.getDeviceID());
        } else {
            intent = new Intent(this, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", "https://support.meater.com/faqs/change-wifi-meater-block");
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2(MEATERBlock mEATERBlock, MEATERDevice mEATERDevice) {
        boolean z10;
        t5.j bleConnection = mEATERDevice.getBleConnection();
        boolean z11 = false;
        if (bleConnection != null) {
            z10 = bleConnection.E();
        } else {
            z10 = false;
        }
        if (mEATERBlock.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK && z10) {
            z11 = true;
        }
        this.f9552e0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2() {
        String string;
        int i10;
        this.f9548a0.W.Q.setCompoundDrawablesRelativeWithIntrinsicBounds(w2(), 0, 0, 0);
        TextView textView = this.f9548a0.W.Q;
        NetworkSettingsObject networkSettingsObject = this.f9550c0;
        if (networkSettingsObject != null) {
            string = networkSettingsObject.ssid;
        } else {
            string = getString(2132018882);
        }
        textView.setText(string);
        AppCompatTextView appCompatTextView = this.f9548a0.W.R;
        if (this.f9550c0 != null) {
            i10 = x2();
        } else {
            i10 = 2132017269;
        }
        appCompatTextView.setText(getString(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t2() {
        String string;
        String string2;
        String string3;
        String string4;
        ArrayList arrayList = new ArrayList();
        String string5 = getString(2132018947);
        NetworkSettingsObject networkSettingsObject = this.f9550c0;
        if (networkSettingsObject != null) {
            string = networkSettingsObject.ipAddress;
        } else {
            string = getString(2132018882);
        }
        arrayList.add(new InfoPair(string5, string, false, b.ipAddress));
        String string6 = getString(2132018953);
        NetworkSettingsObject networkSettingsObject2 = this.f9550c0;
        if (networkSettingsObject2 == null || (string2 = networkSettingsObject2.networkMask) == null) {
            string2 = getString(2132018882);
        }
        arrayList.add(new InfoPair(string6, string2, k2(), b.netWorkMask));
        String string7 = getString(2132018946);
        NetworkSettingsObject networkSettingsObject3 = this.f9550c0;
        if (networkSettingsObject3 == null || (string3 = networkSettingsObject3.gateway) == null) {
            string3 = getString(2132018882);
        }
        arrayList.add(new InfoPair(string7, string3, false, b.gateway));
        String string8 = getString(2132018945);
        NetworkSettingsObject networkSettingsObject4 = this.f9550c0;
        if (networkSettingsObject4 == null || (string4 = networkSettingsObject4.dns) == null) {
            string4 = getString(2132018882);
        }
        arrayList.add(new InfoPair(string8, string4, false, b.dns));
        this.f9549b0.O(arrayList);
        this.f9549b0.n();
    }

    private void u2() {
        final MEATERBlock mEATERBlock = (MEATERBlock) this.f9551d0;
        this.f9548a0.V.setOnClickListener(new View.OnClickListener() { // from class: p5.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSettingsActivity.this.p2(view);
            }
        });
        c6.h.f8879a.A(this, mEATERBlock.getDeviceID(), new h.a() { // from class: p5.v4
            @Override // c6.h.a
            public final void a(MEATERDevice mEATERDevice) {
                WifiSettingsActivity.this.q2(mEATERBlock, mEATERDevice);
            }
        });
    }

    private void v2() {
        if (isFinishing()) {
            return;
        }
        this.f9548a0.R.setVisibility(8);
        e0.INSTANCE.e(this, getString(2132018832), getString(2132017528), false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.w4
            @Override // j6.e
            public final void a() {
                WifiSettingsActivity.this.r2();
            }
        }), null, null).show();
    }

    public String n2(int i10) {
        long j10 = -(1 << (32 - i10));
        return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((4278190080L & j10) >> 24), Long.valueOf((16711680 & j10) >> 16), Long.valueOf((65280 & j10) >> 8), Long.valueOf(j10 & 255));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9548a0 = (l0) androidx.databinding.g.j(this, 2131558457);
        long j10 = 0;
        if (getIntent() != null) {
            j10 = getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
        } else {
            finish();
        }
        MEATERDevice o10 = c6.h.f8879a.o(j10);
        this.f9551d0 = o10;
        if (o10 != null && o10.isMEATERBlock()) {
            l6.k.e0().X(l6.k.e0().q(j10), ((MEATERBlock) this.f9551d0).isLegacy());
        }
        m2();
        s2();
        t2();
        this.f9548a0.R.setVisibility(0);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.t4
            @Override // java.lang.Runnable
            public final void run() {
                WifiSettingsActivity.this.o2();
            }
        }, Config.MC_BROADCAST_INTERVAL_WIFI);
        u2();
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ProtocolParameters.NETWORK_SETTING_NOTIF);
        f8.l0.E(this, this.f9553f0, intentFilter);
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        unregisterReceiver(this.f9553f0);
    }

    @Override // j6.b
    public void r(View view, Object obj) {
        if (obj == b.netWorkMask && !isFinishing() && k2()) {
            f8.l0.H(this, "https://support.meater.com/faqs/block-subne");
        }
    }

    int w2() {
        return r0.c(this.f9551d0);
    }

    int x2() {
        return r0.e(this.f9551d0.getSignalLevel());
    }
}
