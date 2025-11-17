package com.apptionlabs.meater_app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import b6.u;
import c6.h;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.activities.MEATERAlertActivity;
import com.apptionlabs.meater_app.activities.MeaterDetailsActivity;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MenuOptionProbe;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.v3protobuf.CloudConnectionState;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.versions.AppVersion;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.versions.VersionNodeApp;
import com.apptionlabs.meater_app.versions.Versions;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.d1;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.e1;
import com.apptionlabs.meater_app.views.r;
import com.rd.PageIndicatorView;
import f8.l0;
import h6.x2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lm.b;
import rk.C0450b;
import rk.C0459k;
import rk.C0464p;
import y5.k;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeaterDetailsActivity extends j implements b.g, r.b {

    /* renamed from: a0, reason: collision with root package name */
    q5.h f9443a0;

    /* renamed from: e0, reason: collision with root package name */
    u f9447e0;

    /* renamed from: f0, reason: collision with root package name */
    MEATERCloudAccount f9448f0;

    /* renamed from: g0, reason: collision with root package name */
    d1 f9449g0;

    /* renamed from: h0, reason: collision with root package name */
    private e1 f9450h0;

    /* renamed from: b0, reason: collision with root package name */
    long f9444b0 = -1;

    /* renamed from: c0, reason: collision with root package name */
    int f9445c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    ArrayList<Probe> f9446d0 = new ArrayList<>();

    /* renamed from: i0, reason: collision with root package name */
    private final ih.g<C0459k> f9451i0 = zm.a.c(C0459k.class);

    /* renamed from: j0, reason: collision with root package name */
    android.view.o f9452j0 = new c(true);

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends ViewPager2.i {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void b(int i10, float f10, int i11) {
            super.b(i10, f10, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            MeaterDetailsActivity.this.G2();
            MeaterDetailsActivity.this.f9447e0.Q.setSelection(i10);
            super.c(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b implements k.b {
        b() {
        }

        @Override // y5.k.b
        public void a(Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) {
            VersionNodeApp versionNodeApp;
            String str;
            if (!MeaterDetailsActivity.this.isFinishing() && versions != null && (versionNodeApp = versions.app) != null && (str = versionNodeApp.version) != null) {
                AppVersion.appVersionCheck(MeaterDetailsActivity.this, str, versionNodeApp.permittedSkips);
                if (byteBuffer != null && byteBuffer4 != null) {
                    FirmwareVersion.sharedInstance().setVersions(versions, byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5);
                    f8.j.j(MeaterDetailsActivity.this, versions, byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5);
                }
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class c extends android.view.o {
        c(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            if (MeaterDetailsActivity.this.f9449g0.b()) {
                MeaterDetailsActivity.this.f9449g0.k();
                return;
            }
            MeaterDetailsActivity.this.f9444b0 = -1L;
            if (b1.f10471k) {
                b1.f10471k = false;
                Intent intent = new Intent(MeaterDetailsActivity.this, (Class<?>) MainActivity.class);
                intent.addFlags(67108864);
                MeaterDetailsActivity.this.startActivity(intent);
            }
            MeaterDetailsActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9456a;

        static {
            int[] iArr = new int[MenuOptionProbe.values().length];
            f9456a = iArr;
            try {
                iArr[MenuOptionProbe.PROBE_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9456a[MenuOptionProbe.CONNECTION_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9456a[MenuOptionProbe.VIEW_ALERTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9456a[MenuOptionProbe.SHARE_COOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9456a[MenuOptionProbe.WEB_CONNECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9456a[MenuOptionProbe.COOK_GRAPH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9456a[MenuOptionProbe.PREVIOUS_COOKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9456a[MenuOptionProbe.ADJUST_COOK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9456a[MenuOptionProbe.CANCEL_COOK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private void B2(MenuOptionProbe menuOptionProbe) {
        switch (d.f9456a[menuOptionProbe.ordinal()]) {
            case 2:
                ConnectionsControllerActivity.k3(this, p2());
                return;
            case 3:
                Intent intent = new Intent(this, (Class<?>) MEATERAlertActivity.class);
                Bundle bundle = new Bundle();
                if (p2() != null) {
                    bundle.putLong("SN", p2().getDeviceID());
                }
                bundle.putParcelable(MEATERIntent.EXTRA_PROBE, p2());
                bundle.putSerializable("AT", MEATERAlertActivity.c.ALERT_ONLY);
                bundle.putSerializable("AS", MEATERAlertActivity.d.ALERT_TYPE_LIST);
                intent.putExtra("bundle", bundle);
                startActivity(intent);
                return;
            case 4:
                F2(true, C0464p.a.Graph.ordinal());
                return;
            case 5:
                C2();
                return;
            case 6:
                F2(false, -1);
                return;
            case 7:
                E2();
                return;
            case 8:
                k2();
                return;
            case 9:
                n2();
                return;
            default:
                return;
        }
    }

    private void D2(Probe probe) {
        this.f9449g0.h(MenuOptionProbe.VIEW_ALERTS, String.format(Locale.US, "(%d)", Integer.valueOf(probe.getAlerts().size())));
    }

    private void E2() {
        Intent intent = new Intent(this, (Class<?>) CookHistory.class);
        intent.putExtra("PC", true);
        intent.putExtra(MEATERIntent.EXTRA_PREVIOUS_COOK_CONTEXT, CookHistory.b.setUp.ordinal());
        intent.putExtra(MEATERIntent.EXTRA_PROBE, p2());
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2() {
        Probe p22 = p2();
        if (p22 != null) {
            this.f9444b0 = p22.getDeviceID();
            m2(p22);
        }
    }

    private void k2() {
        Bundle bundle = new Bundle();
        Probe p22 = p2();
        if (p22 == null) {
            return;
        }
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, p22);
        if (p22.getmCut() != null) {
            bundle.putInt(MEATERIntent.EXTRA_CUT_ID, p22.getmCut().id.intValue());
        }
        Intent intent = new Intent(this, (Class<?>) MeaterTargetSetupActivity.class);
        intent.putExtra("bundle", bundle);
        intent.putExtra(MEATERIntent.EXTRA_MODE_ADJUST_COOK, true);
        startActivity(intent);
    }

    private void m2(Probe probe) {
        if (probe == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (MenuOptionProbe menuOptionProbe : MenuOptionProbe.values()) {
            if (o2(menuOptionProbe, probe)) {
                arrayList.add(menuOptionProbe);
            }
        }
        d1 d1Var = this.f9449g0;
        if (d1Var != null) {
            d1Var.g(MenuOptionProbe.PROBE_INFO, C0450b.u(probe), f8.a.c(probe));
            this.f9449g0.f(true, arrayList);
            D2(probe);
        }
    }

    private boolean o2(MenuOptionProbe menuOptionProbe, Probe probe) {
        switch (d.f9456a[menuOptionProbe.ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
                return probe.shouldEnableAlertsButton();
            case 4:
            case 5:
            case 6:
                if (probe.isOnline() && probe.appearsToHaveCookInProgress()) {
                    return true;
                }
                return false;
            case 7:
                if (!probe.appearsToHaveCookInProgress() && t2()) {
                    return true;
                }
                return false;
            case 8:
                if (probe.isOnline() && probe.appearsToHaveCookInProgress() && probe.getCookState().getValue() < DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue()) {
                    return true;
                }
                return false;
            case 9:
                if (probe.isOnline() && probe.appearsToHaveCookInProgress()) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private Probe p2() {
        int currentItem = this.f9447e0.T.getCurrentItem();
        if (currentItem >= 0 && currentItem < this.f9446d0.size()) {
            return this.f9446d0.get(currentItem);
        }
        return null;
    }

    private int q2(long j10) {
        for (int i10 = 0; i10 < this.f9446d0.size(); i10++) {
            if (j10 == this.f9446d0.get(i10).getDeviceID()) {
                return i10;
            }
        }
        return -1;
    }

    private void s2() {
        y5.k.INSTANCE.k(new b());
    }

    private boolean t2() {
        if (LocalStorage.sharedStorage().savedCookDAO().a().size() > 0) {
            return true;
        }
        return false;
    }

    private boolean u2(MEATERDevice mEATERDevice) {
        if (((C0459k) this.f9451i0.getValue()).i() == mEATERDevice.getDeviceID()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(View view) {
        this.f9450h0.b(i6.c.W, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(List list) {
        ArrayList<Probe> arrayList = new ArrayList<>();
        for (MEATERDevice mEATERDevice : c6.h.f8879a.U(false)) {
            if (mEATERDevice.isMEATERProbe() && !u2(mEATERDevice)) {
                arrayList.add((Probe) mEATERDevice);
            }
        }
        if (!arrayList.equals(this.f9446d0)) {
            this.f9446d0 = arrayList;
            this.f9443a0.c0(arrayList);
            this.f9443a0.n();
        }
        G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(View view, Object obj) {
        lm.b.i(b.EnumC0292b.f17342r, b.a.f17298r, b.c.f17371s);
        if (obj instanceof MenuOptionProbe) {
            B2((MenuOptionProbe) obj);
        }
    }

    public void C2() {
        String r10;
        int currentItem = this.f9447e0.T.getCurrentItem();
        if (currentItem >= 0 && currentItem < this.f9446d0.size()) {
            Probe probe = this.f9446d0.get(currentItem);
            if (!probe.getShouldShowAsConnected()) {
                return;
            }
            MEATERCloudAccount mEATERCloudAccount = this.f9448f0;
            if (mEATERCloudAccount != null && mEATERCloudAccount.email != null) {
                if (!com.apptionlabs.meater_app.app.a.u().d0()) {
                    r10 = getString(2132018683);
                } else if (probe.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK && probe.getCloudConnectionState() == CloudConnectionState.CLOUD_CONNECTION_STATE_DISABLED) {
                    r10 = getString(2132018682);
                } else {
                    Intent intent = new Intent(this, (Class<?>) ShareCookActivity.class);
                    intent.putExtra("c_i", probe.getCookID());
                    startActivity(intent);
                    return;
                }
            } else {
                r10 = l0.r(this, "\n", 2132017452, 2132017453);
            }
            String str = r10;
            e0.INSTANCE.e(this, getString(2132018680), str, true, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.l3
                @Override // j6.e
                public final void a() {
                    MeaterDetailsActivity.A2();
                }
            }), null, null).show();
        }
    }

    public void F2(boolean z10, int i10) {
        int currentItem = this.f9447e0.T.getCurrentItem();
        if (currentItem > -1 && currentItem < this.f9446d0.size()) {
            Probe probe = this.f9446d0.get(currentItem);
            Intent intent = new Intent(this, (Class<?>) CookHistory.class);
            intent.putExtra(MEATERIntent.INTENT_FRAGMENT_TYPE, CookHistory.c.TemperatureGraphFragment.ordinal());
            intent.putExtra(MEATERIntent.INTENT_FRAGMENT_CONTEXT, CookHistory.b.history.ordinal());
            intent.putExtra(MEATERIntent.EXTRA_GRAPH_CONTEXT, x2.d.COOK_IN_PROGRESS.ordinal());
            intent.putExtra(MEATERIntent.EXTRA_COOK_ID, probe.getCookID());
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
            if (z10) {
                intent.putExtra(MEATERIntent.EXTRA_ONLY_FOR_SHARE_COOK, true);
                intent.putExtra(MEATERIntent.EXTRA_SHARE_COOK_TYPE, i10);
            }
            startActivity(intent);
        }
    }

    @Override // com.apptionlabs.meater_app.views.r.b
    public void G() {
        if (b1.f10471k) {
            b1.f10471k = false;
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(67108864);
            startActivity(intent);
        }
        finish();
    }

    @Override // androidx.viewpager.widget.b.g
    public void H(int i10) {
        G2();
    }

    @Override // com.apptionlabs.meater_app.views.r.b
    public void J() {
        this.f9449g0.k();
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected View i1() {
        return this.f9447e0.V.f7796b;
    }

    public boolean l2(long j10) {
        if (this.f9446d0 != null) {
            for (int i10 = 0; i10 < this.f9446d0.size(); i10++) {
                if (this.f9446d0.get(i10).getDeviceID() == j10 && l0.z(i10, this.f9443a0.h())) {
                    this.f9447e0.T.setCurrentItem(i10);
                    return true;
                }
            }
        }
        return false;
    }

    public void n2() {
        final Probe p22 = p2();
        String string = getString(2132017661);
        if (p22 != null && p22.getSavedCook() != null && p22.getSavedCook().getRecipeID() != -1) {
            string = getString(2132017403);
        }
        e0.INSTANCE.e(this, getString(2132017662), string, true, new e0.AlertPair(getString(2132018978), new j6.e() { // from class: p5.j3
            @Override // j6.e
            public final void a() {
                Probe.this.cancelCook(true);
            }
        }), new e0.AlertPair(getString(2132018306), new j6.e() { // from class: p5.k3
            @Override // j6.e
            public final void a() {
                MeaterDetailsActivity.w2();
            }
        }), null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        e1 e1Var;
        if (i10 == 101 && (e1Var = this.f9450h0) != null) {
            e1Var.c(i1());
            i1().setOnClickListener(new View.OnClickListener() { // from class: p5.i3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MeaterDetailsActivity.this.x2(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        this.f9447e0 = (u) androidx.databinding.g.j(this, 2131558446);
        this.f9450h0 = new e1(getApplicationContext(), h1());
        this.f9443a0 = new q5.h(m0(), getLifecycle());
        this.f9447e0.T.g(new a());
        new r(this, x0(), r.c.MEATER_DETAIL).l(this);
        this.f9446d0 = new ArrayList<>();
        for (MEATERDevice mEATERDevice : c6.h.f8879a.U(false)) {
            if (mEATERDevice.isMEATERProbe() && !u2(mEATERDevice)) {
                this.f9446d0.add((Probe) mEATERDevice);
                k6.b.t("Probe " + mEATERDevice.getDeviceID() + " added to the list as NOT associated with Recipe", new Object[0]);
            }
        }
        long longExtra = getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
        this.f9447e0.T.setAdapter(this.f9443a0);
        if (this.f9446d0.size() > 0) {
            this.f9447e0.T.setOffscreenPageLimit(Math.min(this.f9446d0.size(), 5));
        }
        this.f9443a0.c0(this.f9446d0);
        int q22 = q2(longExtra);
        this.f9445c0 = q22;
        if (q22 != -1) {
            try {
                this.f9447e0.T.j(q22, false);
                this.f9443a0.o(this.f9445c0);
            } catch (IllegalStateException unused) {
            }
        }
        ArrayList<Probe> arrayList = this.f9446d0;
        if (arrayList != null && arrayList.size() < 2) {
            this.f9447e0.Q.setVisibility(4);
        } else {
            PageIndicatorView pageIndicatorView = this.f9447e0.Q;
            ArrayList<Probe> arrayList2 = this.f9446d0;
            if (arrayList2 != null) {
                i10 = arrayList2.size();
            } else {
                i10 = 0;
            }
            pageIndicatorView.setCount(i10);
        }
        this.f9447e0.Q.setSelection(this.f9445c0);
        if (x0() != null) {
            x0().B(0.0f);
        }
        this.f9448f0 = com.apptionlabs.meater_app.app.a.u().k();
        c6.h.f8879a.C(this, false, new h.b() { // from class: p5.g3
            @Override // c6.h.b
            public final void a(List list) {
                MeaterDetailsActivity.this.y2(list);
            }
        });
        if (!FirmwareVersion.sharedInstance().isFirmwaresExternallySet()) {
            try {
                s2();
            } catch (Exception unused2) {
                lm.b.i(b.EnumC0292b.G1, b.a.B, b.c.B);
            }
        }
        u uVar = this.f9447e0;
        d1 d1Var = new d1(this, uVar.S, uVar.W);
        this.f9449g0 = d1Var;
        d1Var.e(MenuOptionProbe.getOptions());
        this.f9449g0.d(new j6.b() { // from class: p5.h3
            @Override // j6.b
            public final void r(View view, Object obj) {
                MeaterDetailsActivity.this.z2(view, obj);
            }
        });
        getOnBackPressedDispatcher().h(this, this.f9452j0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9448f0 = com.apptionlabs.meater_app.app.a.u().k();
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public long r2() {
        return this.f9444b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w2() {
    }

    @Override // com.apptionlabs.meater_app.views.r.b
    public void z() {
    }

    @Override // androidx.viewpager.widget.b.g
    public void E(int i10) {
    }

    @Override // androidx.viewpager.widget.b.g
    public void e(int i10, float f10, int i11) {
    }
}
