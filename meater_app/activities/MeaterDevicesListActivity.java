package com.apptionlabs.meater_app.activities;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.a0;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import b6.j2;
import c6.h;
import com.apptionlabs.meater_app.activities.MeaterDevicesListActivity;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.DeviceViewHolder;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.versions.AppVersion;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lm.b;
import q5.l;
import q5.y0;
import rk.C0453e;
import t5.x;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeaterDevicesListActivity extends j implements j6.j, AdapterView.OnItemClickListener {

    /* renamed from: c0, reason: collision with root package name */
    TextView f9459c0;

    /* renamed from: d0, reason: collision with root package name */
    q5.l f9460d0;

    /* renamed from: e0, reason: collision with root package name */
    q5.l f9461e0;

    /* renamed from: k0, reason: collision with root package name */
    j2 f9467k0;

    /* renamed from: m0, reason: collision with root package name */
    private int f9469m0;

    /* renamed from: a0, reason: collision with root package name */
    private final x5.b f9457a0 = new x5.b();

    /* renamed from: b0, reason: collision with root package name */
    boolean f9458b0 = false;

    /* renamed from: f0, reason: collision with root package name */
    final ArrayList<MEATERDevice> f9462f0 = new ArrayList<>();

    /* renamed from: g0, reason: collision with root package name */
    final ArrayList<MEATERDevice> f9463g0 = new ArrayList<>();

    /* renamed from: h0, reason: collision with root package name */
    final ArrayList<MEATERDevice> f9464h0 = new ArrayList<>();

    /* renamed from: i0, reason: collision with root package name */
    Handler f9465i0 = new Handler(Looper.getMainLooper());

    /* renamed from: j0, reason: collision with root package name */
    Runnable f9466j0 = new a();

    /* renamed from: l0, reason: collision with root package name */
    boolean f9468l0 = false;

    /* renamed from: n0, reason: collision with root package name */
    private final x5.a f9470n0 = new x5.a();

    /* renamed from: o0, reason: collision with root package name */
    private ih.g<C0453e> f9471o0 = zm.a.c(C0453e.class);

    /* renamed from: p0, reason: collision with root package name */
    android.view.o f9472p0 = new c(true);

    /* renamed from: q0, reason: collision with root package name */
    android.view.result.c<Intent> f9473q0 = f0(new e.d(), new android.view.result.b() { // from class: p5.p3
        @Override // android.view.result.b
        public final void a(Object obj) {
            MeaterDevicesListActivity.this.t2((android.view.result.a) obj);
        }
    });

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < MeaterDevicesListActivity.this.f9462f0.size(); i10++) {
                try {
                    DeviceViewHolder deviceViewHolder = (DeviceViewHolder) MeaterDevicesListActivity.this.f9467k0.Z.d0(i10);
                    if (deviceViewHolder != null) {
                        deviceViewHolder.adapterBinding.T(MeaterDevicesListActivity.this.f9462f0.get(i10));
                    }
                } catch (Throwable th) {
                    MeaterDevicesListActivity meaterDevicesListActivity = MeaterDevicesListActivity.this;
                    meaterDevicesListActivity.f9465i0.postDelayed(meaterDevicesListActivity.f9466j0, 1000L);
                    throw th;
                }
            }
            for (int i11 = 0; i11 < MeaterDevicesListActivity.this.f9463g0.size(); i11++) {
                DeviceViewHolder deviceViewHolder2 = (DeviceViewHolder) MeaterDevicesListActivity.this.f9467k0.f7893i0.d0(i11);
                if (deviceViewHolder2 != null) {
                    deviceViewHolder2.adapterBinding.T(MeaterDevicesListActivity.this.f9463g0.get(i11));
                }
            }
            MeaterDevicesListActivity meaterDevicesListActivity2 = MeaterDevicesListActivity.this;
            meaterDevicesListActivity2.f9465i0.postDelayed(meaterDevicesListActivity2.f9466j0, 1000L);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends RecyclerView.u {
        b(MeaterDevicesListActivity meaterDevicesListActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            super.b(recyclerView, i10, i11);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class c extends android.view.o {
        c(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            boolean z10;
            MeaterDevicesListActivity.this.f9470n0.d();
            MeaterDevicesListActivity meaterDevicesListActivity = MeaterDevicesListActivity.this;
            meaterDevicesListActivity.f9465i0.removeCallbacks(meaterDevicesListActivity.f9466j0);
            if (c6.h.f8879a.M().size() != MeaterDevicesListActivity.this.f9469m0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Intent intent = new Intent();
            intent.putExtra("list_change", z10);
            MeaterDevicesListActivity.this.setResult(-1, intent);
            if (z10) {
                MeaterDevicesListActivity.this.F2();
            }
            MeaterDevicesListActivity.this.finish();
        }
    }

    private void E2(MEATERDevice mEATERDevice) {
        ConnectionsControllerActivity.k3(this, mEATERDevice);
    }

    private void G2() {
        this.f9463g0.clear();
        for (MEATERDevice mEATERDevice : c6.h.f8879a.U(true)) {
            this.f9463g0.add(mEATERDevice);
            this.f9462f0.remove(mEATERDevice);
        }
        U2();
    }

    private void H2(MEATERDevice mEATERDevice) {
        boolean z10;
        if (this.f9463g0.contains(mEATERDevice)) {
            this.f9463g0.remove(mEATERDevice);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9462f0.contains(mEATERDevice)) {
            this.f9462f0.remove(mEATERDevice);
        } else if (!z10) {
            return;
        }
        U2();
    }

    private void I2() {
        U2();
    }

    private boolean J2(MEATERDevice mEATERDevice) {
        if (mEATERDevice.isPaired()) {
            return true;
        }
        if (mEATERDevice.getParentDevice() != null) {
            return false;
        }
        return c6.h.f8879a.T(mEATERDevice);
    }

    private void K2() {
        e0.Companion companion = e0.INSTANCE;
        String string = getString(2132017899);
        Config.getInstance();
        companion.e(this, string, getString(2132018069, 5), false, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.v3
            @Override // j6.e
            public final void a() {
                MeaterDevicesListActivity.A2();
            }
        }), null, null).show();
    }

    private void L2(MEATERDevice mEATERDevice) {
        if (J2(mEATERDevice)) {
            if (mEATERDevice.isPaired()) {
                if (!this.f9463g0.contains(mEATERDevice)) {
                    r2(mEATERDevice);
                    return;
                }
                return;
            } else {
                if (!this.f9462f0.contains(mEATERDevice)) {
                    q2(mEATERDevice);
                    return;
                }
                return;
            }
        }
        H2(mEATERDevice);
    }

    private void M2(MEATERDevice mEATERDevice) {
        Intent intent = new Intent(this, (Class<?>) BlockFirmwareUpdateActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        startActivity(intent);
    }

    private void N2(MEATERDevice mEATERDevice) {
        Intent intent = new Intent(this, (Class<?>) MEATERPlusFirmwareUpdateActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        startActivity(intent);
    }

    private void O2(final int i10) {
        e0.INSTANCE.e(this, getString(2132018870), getString(2132018869), false, new e0.AlertPair(getString(2132018978), new j6.e() { // from class: p5.n3
            @Override // j6.e
            public final void a() {
                MeaterDevicesListActivity.this.B2(i10);
            }
        }), new e0.AlertPair(getString(2132018306), new j6.e() { // from class: p5.o3
            @Override // j6.e
            public final void a() {
                q5.y0.I();
            }
        }), null).show();
    }

    private void P2(ArrayList<String> arrayList) {
        if (((C0453e) this.f9471o0.getValue()).j()) {
            Intent intent = new Intent(this, (Class<?>) VideoTutorialSummaryActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_WATCH_VIDEOS, arrayList);
            startActivity(intent);
        }
    }

    private void Q2(MEATERDevice mEATERDevice) {
        Intent intent = new Intent(this, (Class<?>) BlockWiFiSetupActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        this.f9473q0.a(intent);
    }

    private void R2(String str, String str2) {
        if (this.f9458b0) {
            return;
        }
        this.f9458b0 = true;
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S2, reason: merged with bridge method [inline-methods] */
    public void B2(int i10) {
        if (i10 >= 0 && i10 < this.f9463g0.size()) {
            lm.b.g(b.EnumC0292b.H1.title, "", "");
            c6.h.f8879a.e0(this.f9463g0.get(i10));
            this.f9468l0 = true;
            y0.I();
            U2();
        }
    }

    private void T2() {
        c6.h.f8879a.f0();
        this.f9462f0.clear();
        this.f9463g0.clear();
        U2();
    }

    private void U2() {
        int i10;
        Resources resources = getResources();
        int i11 = 8;
        int i12 = 0;
        if (this.f9463g0.isEmpty()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        int size = this.f9463g0.size();
        this.f9467k0.f7891g0.setVisibility(i10);
        this.f9467k0.f7890f0.b(resources.getQuantityString(2131886085, size, Integer.valueOf(size)));
        if (!this.f9462f0.isEmpty()) {
            i11 = 0;
        }
        int size2 = this.f9462f0.size();
        this.f9467k0.Y.setVisibility(i11);
        this.f9467k0.f7888d0.b(resources.getQuantityString(2131886084, size2, Integer.valueOf(size2)));
        if (i10 != 0) {
            i12 = i11;
        }
        this.f9467k0.f7889e0.setVisibility(i12);
        this.f9460d0.n();
        this.f9461e0.n();
    }

    private void V2(View view) {
        int f10;
        ConstraintLayout.b bVar = (ConstraintLayout.b) view.getLayoutParams();
        if (getResources().getConfiguration().orientation == 2) {
            f10 = (int) getResources().getDimension(2131165827);
        } else {
            f10 = l0.f(com.apptionlabs.meater_app.app.a.i().getResources().getDisplayMetrics().widthPixels);
        }
        bVar.T = f10;
    }

    private void W2() {
        e0.INSTANCE.e(this, getString(2132017348), getString(2132017347), true, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.t3
            @Override // j6.e
            public final void a() {
                MeaterDevicesListActivity.C2();
            }
        }), null, null).show();
    }

    private void X2() {
        e0.INSTANCE.e(this, getString(2132018123), getString(2132018122), true, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.u3
            @Override // j6.e
            public final void a() {
                MeaterDevicesListActivity.D2();
            }
        }), null, null).show();
    }

    private void q2(MEATERDevice mEATERDevice) {
        boolean z10;
        if (this.f9463g0.contains(mEATERDevice)) {
            this.f9463g0.remove(mEATERDevice);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f9462f0.contains(mEATERDevice)) {
            this.f9462f0.add(mEATERDevice);
        } else if (!z10) {
            return;
        }
        U2();
    }

    private void r2(MEATERDevice mEATERDevice) {
        boolean z10;
        if (this.f9462f0.contains(mEATERDevice)) {
            this.f9462f0.remove(mEATERDevice);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f9463g0.contains(mEATERDevice)) {
            this.f9463g0.add(mEATERDevice);
        } else if (!z10) {
            return;
        }
        U2();
    }

    private void s2() {
        ih.a.f268a.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(android.view.result.a aVar) {
        if (aVar.a() == null) {
            return;
        }
        long longExtra = aVar.a().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
        int i10 = 0;
        while (true) {
            if (i10 >= this.f9462f0.size()) {
                break;
            }
            if (this.f9462f0.get(i10).getDeviceID() == longExtra) {
                this.f9460d0.L(i10);
                break;
            }
            i10++;
        }
        U2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MEATERDevice mEATERDevice = (MEATERDevice) it.next();
            if (!mEATERDevice.isPaired() && mEATERDevice.isOnline()) {
                c6.h hVar = c6.h.f8879a;
                if (hVar.T(mEATERDevice) && hVar.d0(mEATERDevice) == 0.0d && !mEATERDevice.needsAppUpdate()) {
                    L2(mEATERDevice);
                }
            }
        }
        G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v2(View view) {
        T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w2() {
        if (!isFinishing() && com.apptionlabs.meater_app.app.a.l() == this) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f9462f0);
            arrayList.addAll(this.f9463g0);
            this.f9457a0.a(this, true, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2() {
        Iterator<MEATERDevice> it = this.f9463g0.iterator();
        while (it.hasNext()) {
            it.next().isOnline();
        }
        this.f9462f0.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(String str) {
        P2(((C0453e) this.f9471o0.getValue()).k());
        ((C0453e) this.f9471o0.getValue()).m().m(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(ArrayList arrayList) {
        if (arrayList.size() < ((C0453e) this.f9471o0.getValue()).l()) {
            P2(((C0453e) this.f9471o0.getValue()).k());
        } else if (((C0453e) this.f9471o0.getValue()).l() < arrayList.size()) {
            ((C0453e) this.f9471o0.getValue()).o(arrayList);
        }
        ((C0453e) this.f9471o0.getValue()).n().m(this);
    }

    public void F2() {
        ((C0453e) this.f9471o0.getValue()).i();
        ((C0453e) this.f9471o0.getValue()).n().g(this, new a0() { // from class: p5.w3
            @Override // android.view.a0
            public final void d(Object obj) {
                MeaterDevicesListActivity.this.z2((ArrayList) obj);
            }
        });
        ((C0453e) this.f9471o0.getValue()).m().g(this, new a0() { // from class: p5.x3
            @Override // android.view.a0
            public final void d(Object obj) {
                MeaterDevicesListActivity.this.y2((String) obj);
            }
        });
    }

    @Override // j6.j
    public void a(int i10) {
        O2(i10);
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected View i1() {
        return this.f9467k0.f7897m0.f7796b;
    }

    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 199) {
            if (i11 == -1) {
                setResult(-1, new Intent());
                finish();
                return;
            }
            return;
        }
        if (i11 == 8000) {
            finish();
        }
    }

    public void onBleLinkClick(View view) {
        R2("Connecting to a probe", "file:///android_asset/connection-help.html");
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        V2(this.f9467k0.f7894j0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    @TargetApi(23)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9467k0 = (j2) androidx.databinding.g.j(this, 2131558503);
        c6.h hVar = c6.h.f8879a;
        hVar.R();
        this.f9467k0.Z.setLayoutManager(new CustomLinearLayoutManager(this, 1, false));
        this.f9467k0.Z.j(new l1());
        q5.l lVar = new q5.l(this.f9462f0, l.a.NEARBY_DEVICES_LIST, false);
        this.f9460d0 = lVar;
        this.f9467k0.Z.setAdapter(lVar);
        this.f9460d0.Q(this);
        this.f9469m0 = hVar.M().size();
        hVar.y(this, new h.b() { // from class: p5.q3
            @Override // c6.h.b
            public final void a(List list) {
                MeaterDevicesListActivity.this.u2(list);
            }
        });
        this.f9467k0.f7893i0.setLayoutManager(new CustomLinearLayoutManager(this, 1, false));
        this.f9467k0.f7893i0.j(new l1());
        q5.l lVar2 = new q5.l(this.f9463g0, l.a.PAIRED_DEVICES_LIST, false);
        this.f9461e0 = lVar2;
        this.f9467k0.f7893i0.setAdapter(lVar2);
        this.f9461e0.Q(this);
        this.f9467k0.f7893i0.n(new b(this));
        I2();
        G2();
        s2();
        getOnBackPressedDispatcher().h(this, this.f9472p0);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131689476, menu);
        menu.findItem(2131362857);
        View inflate = getLayoutInflater().inflate(2131558434, (ViewGroup) null);
        menu.findItem(2131362857).setActionView(inflate);
        this.f9459c0 = (TextView) inflate.findViewById(2131361903);
        if (Config.getInstance().DEBUG_UI_ENABLED) {
            this.f9459c0.setText("Unpair All");
            this.f9459c0.setTextColor(l0.i(this, 2131100486));
            this.f9459c0.setVisibility(0);
            this.f9459c0.setOnClickListener(new View.OnClickListener() { // from class: p5.m3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MeaterDevicesListActivity.this.v2(view);
                }
            });
            return true;
        }
        this.f9459c0.setVisibility(4);
        return true;
    }

    public void onMeaterLinkVideoClick(View view) {
        l0.H(this, "https://youtu.be/7uT1Si5ygGY");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.f9470n0.d();
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f9465i0.removeCallbacksAndMessages(null);
        this.f9470n0.d();
    }

    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    @TargetApi(23)
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        ih.a.f268a.c(this, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9470n0.b();
        this.f9458b0 = false;
        if (!x.l()) {
            s6.d.G();
        }
        this.f9465i0.postDelayed(this.f9466j0, 1000L);
        if (!this.f9457a0.getHaveWarnedUserAboutLocationServicesDisabled()) {
            this.f9465i0.postDelayed(new Runnable() { // from class: p5.r3
                @Override // java.lang.Runnable
                public final void run() {
                    MeaterDevicesListActivity.this.w2();
                }
            }, 20000L);
        }
        this.f9465i0.postDelayed(new Runnable() { // from class: p5.s3
            @Override // java.lang.Runnable
            public final void run() {
                MeaterDevicesListActivity.this.x2();
            }
        }, Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        i1().setVisibility(8);
    }

    public void onWifiLinkClick(View view) {
        R2("Using MEATER Link", "file:///android_asset/meater-link-help.html");
    }

    @Override // j6.j
    public void q(l.a aVar, int i10) {
        MEATERDevice mEATERDevice;
        if (MeaterLinkService.e() == null) {
            return;
        }
        if (aVar == l.a.PAIRED_DEVICES_LIST) {
            if (i10 >= 0 && i10 < this.f9463g0.size()) {
                mEATERDevice = this.f9463g0.get(i10);
            } else {
                return;
            }
        } else if (i10 >= 0 && i10 < this.f9462f0.size()) {
            mEATERDevice = this.f9462f0.get(i10);
        } else {
            return;
        }
        if (mEATERDevice.needsAppUpdate()) {
            AppVersion.promptToUpdateApp(this);
            return;
        }
        if (mEATERDevice.isInWiFiSetupMode()) {
            if (!mEATERDevice.isPaired()) {
                mEATERDevice.setConnectionState(DeviceConnectionState.ATTEMPTING_RECONNECT);
                c6.h.f8879a.K(mEATERDevice);
                this.f9464h0.add(mEATERDevice);
                r2(mEATERDevice);
                U2();
            }
            this.f9470n0.d();
            Q2(mEATERDevice);
            return;
        }
        if (!mEATERDevice.isPaired()) {
            DeviceConnectionState deviceConnectionState = DeviceConnectionState.ATTEMPTING_RECONNECT;
            mEATERDevice.setConnectionState(deviceConnectionState);
            if (mEATERDevice.isMEATERBlock() && ((j6.x) mEATERDevice).supportKeepAliveFeature()) {
                Log.info("KeepAlive_block", "keep alive block we do not set connection state ");
            } else {
                mEATERDevice.setConnectionState(deviceConnectionState);
            }
            if (c6.h.f8879a.K(mEATERDevice)) {
                K2();
            }
            this.f9464h0.add(mEATERDevice);
            r2(mEATERDevice);
            U2();
            return;
        }
        if (mEATERDevice.needsFirmwareUpdate()) {
            if (mEATERDevice.batteryLevelTooLowForFirmwareUpdate()) {
                if (mEATERDevice.isMEATERPlus()) {
                    X2();
                    return;
                } else {
                    W2();
                    return;
                }
            }
            this.f9470n0.d();
            if (mEATERDevice.isMEATERPlus()) {
                N2(mEATERDevice);
                return;
            } else {
                if (mEATERDevice.isMEATERBlock()) {
                    M2(mEATERDevice);
                    return;
                }
                return;
            }
        }
        if (mEATERDevice.isPaired()) {
            E2(mEATERDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D2() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
    }
}
