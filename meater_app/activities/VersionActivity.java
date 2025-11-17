package com.apptionlabs.meater_app.activities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import b6.e9;
import com.apptionlabs.meater_app.data.DevicesType;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.versions.AppVersion;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.versions.VersionNodeApp;
import com.apptionlabs.meater_app.versions.Versions;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.MEATERHeaderTextOnly;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import j6.v;
import t5.x;

/* loaded from: /tmp/meat/meat/classes.dex */
public class VersionActivity extends OrientationActivity implements v {
    Context S;
    e9 T;

    private String L0() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
        if (linkProperties != null) {
            return linkProperties.getInterfaceName();
        }
        return "";
    }

    public SpannableStringBuilder M0(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(1.05f), 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannableString spannableString2 = new SpannableString(str2);
        spannableString2.setSpan(new RelativeSizeSpan(0.95f), 0, spannableString2.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString2);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        VersionNodeApp versionNodeApp;
        super.onCreate(bundle);
        this.T = (e9) androidx.databinding.g.j(this, 2131558718);
        this.S = getApplicationContext();
        String version = FirmwareVersion.sharedInstance().getVersion(DevicesType.MEATER_PLUS);
        String version2 = FirmwareVersion.sharedInstance().getVersion(DevicesType.MEATER_PLUS_SE);
        String version3 = FirmwareVersion.sharedInstance().getVersion(DevicesType.MEATER_PLUSV2);
        String version4 = FirmwareVersion.sharedInstance().getVersion(DevicesType.MEATER_BLOCK);
        String version5 = FirmwareVersion.sharedInstance().getVersion(DevicesType.MEATER_BLOCKV2);
        Versions c10 = f8.j.c(this.S);
        int i13 = 0;
        if (c10 != null && (versionNodeApp = c10.app) != null && !AppVersion.hasAppUpdate(versionNodeApp.version)) {
            z10 = true;
        } else {
            z10 = false;
        }
        SpannableStringBuilder M0 = M0(getString(2132017256), "\n4.3.1");
        SpannableStringBuilder M02 = M0(getString(2132018178), "\n" + Build.VERSION.RELEASE);
        SpannableStringBuilder M03 = M0(getString(2132018291), "\n" + L0());
        this.T.R.setText(M02);
        this.T.f7739l0.setText(M03);
        M0.toString();
        this.T.S.setText(M0);
        if (!z10) {
            this.T.S.setTextColor(l0.h(2131100472));
        }
        this.T.f7736i0.setText(M0(getString(2132018112), "\n" + version));
        if (!FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(w6.b.f19362v)) {
            this.T.f7735h0.setText(M0(getString(2132018134), "\n" + version2));
            this.T.X.setVisibility(0);
        }
        if (!FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(w6.b.f19365y)) {
            this.T.f7737j0.setText(M0(getString(2132018142), "\n" + version5));
            this.T.f7744q0.setVisibility(0);
        }
        this.T.f7734g0.setText(M0(getString(2132018403), "\n" + version3));
        this.T.f7733f0.setText(M0(getString(2132018079), "\n" + version4));
        MEATERCloudAccount k10 = com.apptionlabs.meater_app.app.a.u().k();
        if (k10 == null || k10.email == null) {
            this.T.V.setText(getString(2132018329));
        }
        if (y5.g.E().X()) {
            this.T.W.setText(getString(2132017490));
        }
        if (ih.a.f268a.d(this)) {
            i10 = 2132017659;
        } else {
            i10 = 2132017627;
        }
        String string = getString(i10);
        this.T.f7732e0.setText(M0(getString(2132018638), "\n\n" + string));
        if (x.l()) {
            i11 = 2132017321;
        } else {
            i11 = 2132017320;
        }
        this.T.U.setText(getString(i11));
        if (x0() != null) {
            x0().y(true);
            x0().A(false);
            x0().t(LayoutInflater.from(this).inflate(2131558697, (ViewGroup) null));
            androidx.appcompat.app.a x02 = x0();
            View inflate = getLayoutInflater().inflate(2131558697, (ViewGroup) null);
            a.C0017a c0017a = new a.C0017a(-2, -1, 17);
            ((TextView) inflate.findViewById(f.f.L)).setText(getTitle());
            x02.u(inflate, c0017a);
            x02.y(true);
            x02.A(false);
            x02.D(2131100529);
            x02.C(true);
        }
        q5.i iVar = new q5.i(this);
        this.T.f7742o0.setLayoutManager(new LinearLayoutManager(this));
        this.T.f7742o0.setAdapter(iVar);
        this.T.f7742o0.j(new l1());
        this.T.f7742o0.setItemAnimator(null);
        this.T.f7742o0.setLayoutManager(new CustomLinearLayoutManager(this, 1, false));
        iVar.O(c6.h.f8879a.U(true));
        int i14 = Settings.Secure.getInt(getContentResolver(), "development_settings_enabled", 0);
        MEATERHeaderTextOnly mEATERHeaderTextOnly = this.T.f7728a0;
        if (i14 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        mEATERHeaderTextOnly.setVisibility(i12);
        LinearLayout linearLayout = this.T.Y;
        if (i14 != 1) {
            i13 = 8;
        }
        linearLayout.setVisibility(i13);
    }

    @Override // j6.v
    public void A(int i10) {
    }

    @Override // j6.v
    public void a(int i10) {
    }
}
