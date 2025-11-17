package com.apptionlabs.meater_app;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.AbstractC0397k;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.a0;
import android.view.o;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b6.s;
import c6.h;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.BlockFirmwareUpdateActivity;
import com.apptionlabs.meater_app.activities.ConnectionsControllerActivity;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.activities.CustomSettingActivity;
import com.apptionlabs.meater_app.activities.DebugActivity;
import com.apptionlabs.meater_app.activities.MEATERPlusFirmwareUpdateActivity;
import com.apptionlabs.meater_app.activities.MeaterDetailsActivity;
import com.apptionlabs.meater_app.activities.j;
import com.apptionlabs.meater_app.app.MEATERAPPLifeCycleObserver;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.cloud.MEATERFirebaseMessagingService;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.JuicyVideoList;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.CloudMQTTConnectionState;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.versions.AppVersion;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.versions.VersionNodeApp;
import com.apptionlabs.meater_app.versions.Versions;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import com.apptionlabs.meater_app.views.CloudConnectionButton;
import com.apptionlabs.meater_app.views.ProbeConnectionStatusView;
import com.apptionlabs.meater_app.views.ToolTipView;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.e1;
import com.apptionlabs.meater_app.views.l1;
import com.apptionlabs.meater_app.views.m0;
import com.apptionlabs.meater_app.views.q1;
import com.apptionlabs.meater_app.views.r;
import com.apptionlabs.meater_app.wear.MeaterWearListenerServices;
import com.google.android.material.navigation.e;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.messaging.FirebaseMessaging;
import f8.h;
import f8.l;
import f8.l0;
import f8.q0;
import h6.x0;
import ih.g;
import j6.u;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import lm.b;
import o5.z;
import org.json.JSONObject;
import q5.c0;
import q5.y0;
import q6.VideoData;
import rk.C0458j;
import rk.C0496g;
import rk.C0525p;
import rk.C0527r;
import s6.i;
import t5.x;
import y5.e;
import y5.k;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MainActivity extends j implements MEATERAPPLifeCycleObserver.a, r.b {
    private static boolean E0 = false;

    /* renamed from: a0, reason: collision with root package name */
    s f9171a0;

    /* renamed from: c0, reason: collision with root package name */
    private c0 f9173c0;

    /* renamed from: i0, reason: collision with root package name */
    private AlertDialog f9179i0;

    /* renamed from: j0, reason: collision with root package name */
    private com.apptionlabs.meater_app.views.j f9180j0;

    /* renamed from: k0, reason: collision with root package name */
    PopupWindow f9181k0;

    /* renamed from: s0, reason: collision with root package name */
    private C0496g f9189s0;

    /* renamed from: t0, reason: collision with root package name */
    private C0525p f9190t0;

    /* renamed from: u0, reason: collision with root package name */
    private x0 f9191u0;

    /* renamed from: v0, reason: collision with root package name */
    private Menu f9192v0;

    /* renamed from: b0, reason: collision with root package name */
    private List<? extends MEATERDevice> f9172b0 = new ArrayList();

    /* renamed from: d0, reason: collision with root package name */
    private final x5.b f9174d0 = new x5.b();

    /* renamed from: e0, reason: collision with root package name */
    private final s5.b f9175e0 = new s5.b();

    /* renamed from: f0, reason: collision with root package name */
    private final Handler f9176f0 = new Handler(Looper.getMainLooper());

    /* renamed from: g0, reason: collision with root package name */
    private boolean f9177g0 = true;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f9178h0 = true;

    /* renamed from: l0, reason: collision with root package name */
    private final Handler f9182l0 = new Handler(Looper.getMainLooper());

    /* renamed from: m0, reason: collision with root package name */
    private e1 f9183m0 = null;

    /* renamed from: n0, reason: collision with root package name */
    private final h f9184n0 = new h();

    /* renamed from: o0, reason: collision with root package name */
    private MEATERAPPLifeCycleObserver f9185o0 = null;

    /* renamed from: p0, reason: collision with root package name */
    private g<NetworkConstant> f9186p0 = zm.a.c(NetworkConstant.class);

    /* renamed from: q0, reason: collision with root package name */
    private g<C0458j> f9187q0 = zm.a.c(C0458j.class);

    /* renamed from: r0, reason: collision with root package name */
    private g<C0527r> f9188r0 = zm.a.c(C0527r.class);

    /* renamed from: w0, reason: collision with root package name */
    o f9193w0 = new b(true);

    /* renamed from: x0, reason: collision with root package name */
    private final u f9194x0 = new c();

    /* renamed from: y0, reason: collision with root package name */
    boolean f9195y0 = false;

    /* renamed from: z0, reason: collision with root package name */
    int f9196z0 = 0;
    private final BroadcastReceiver A0 = new d();
    android.view.result.c<Intent> B0 = f0(new e.d(), new android.view.result.b() { // from class: o5.c
        @Override // android.view.result.b
        public final void a(Object obj) {
            Log.info("MainActivity", "Coming from QSG ");
        }
    });
    android.view.result.c<Intent> C0 = f0(new e.d(), new android.view.result.b() { // from class: o5.d
        @Override // android.view.result.b
        public final void a(Object obj) {
            MainActivity.this.c3((android.view.result.a) obj);
        }
    });
    android.view.result.c<Intent> D0 = f0(new e.d(), new android.view.result.b() { // from class: o5.e
        @Override // android.view.result.b
        public final void a(Object obj) {
            MainActivity.this.d3((android.view.result.a) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements k.b {
        a() {
        }

        @Override // y5.k.b
        public void a(Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) {
            VersionNodeApp versionNodeApp;
            String str;
            if (versions != null && (versionNodeApp = versions.app) != null && (str = versionNodeApp.version) != null) {
                AppVersion.appVersionCheck(MainActivity.this, str, versionNodeApp.permittedSkips);
                k6.b.x("[versions] Main onFetchVersionInformation", versions.toString());
                FirmwareVersion.sharedInstance().setVersions(versions, byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5);
                f8.j.j(MainActivity.this, versions, byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5);
                return;
            }
            k6.b.x("[versions] Main onFetchVersionInformation, versions or lastestAppVersion was null from server", new Object[0]);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends o {
        b(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            if (MainActivity.this.f9171a0.T.getVisibility() == 0) {
                if (MainActivity.this.f9171a0.R.getSelectedItemId() == 2131362931 && MainActivity.this.f9191u0.I2()) {
                    return;
                }
                MainActivity.this.f9171a0.R.setSelectedItemId(2131362929);
                return;
            }
            MainActivity.this.moveTaskToBack(true);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null && intent.getAction().equals(MEATERIntent.INTENT_REFRESH_PREVIOUS_COOKS)) {
                MainActivity.this.P3();
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9201a;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            f9201a = iArr;
            try {
                iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9201a[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9201a[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9201a[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9201a[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9201a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9201a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9201a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9201a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private boolean A3() {
        com.apptionlabs.meater_app.app.a.u().q1(true);
        return false;
    }

    private void B3() {
        Probe probe;
        if (Config.getInstance().SKIP_DASHBOARD_IF_ONLY_A_PROBE_PAIRED) {
            List<Probe> M = c6.h.f8879a.M();
            if (M.size() == 1 && (probe = M.get(0)) != null) {
                O3(probe.getCookID());
            }
        }
    }

    private void C3() {
        ((C0458j) this.f9187q0.getValue()).j();
        ((C0458j) this.f9187q0.getValue()).v().g(this, new a0() { // from class: o5.o
            @Override // android.view.a0
            public final void d(Object obj) {
                MainActivity.this.l3((ArrayList) obj);
            }
        });
    }

    private void D3() {
        if (this.f9177g0) {
            this.f9176f0.postDelayed(new Runnable() { // from class: o5.p
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.m3();
                }
            }, 1500L);
        }
    }

    private void E3() {
        this.f9171a0.W.J1(this.f9173c0, true);
        this.f9171a0.W.removeAllViews();
        this.f9171a0.W.getRecycledViewPool().c();
        RecyclerView recyclerView = this.f9171a0.W;
        recyclerView.setLayoutManager(recyclerView.getLayoutManager());
        this.f9173c0.n();
    }

    private void F3() {
        Iterator<MEATERDevice> it = c6.h.f8879a.L().iterator();
        while (it.hasNext()) {
            this.f9175e0.e(it.next());
        }
    }

    private void G3(List<? extends MEATERDevice> list) {
        int measuredHeight = this.f9171a0.W.getMeasuredHeight();
        if (measuredHeight > 0) {
            int T = this.f9173c0.T(measuredHeight);
            this.f9173c0.e0(list);
            if (T != this.f9173c0.T(measuredHeight)) {
                this.f9171a0.W.J1(this.f9173c0, true);
                this.f9171a0.W.getRecycledViewPool().c();
            }
        } else {
            this.f9173c0.e0(list);
        }
        this.f9172b0 = list;
    }

    private void H3(int i10) {
        this.f9171a0.T.setVisibility(0);
        this.f9171a0.Z.setVisibility(8);
        if (i10 == 2131362933) {
            this.f9171a0.R.f(2131362933);
            com.apptionlabs.meater_app.app.a.u().w1(Long.valueOf(System.currentTimeMillis()));
            J3(this.f9189s0);
        } else if (i10 == 2131362932) {
            this.f9171a0.R.f(2131362932);
            J3(this.f9190t0);
        } else if (i10 == 2131362931) {
            J3(this.f9191u0);
        }
    }

    private void I3() {
        Iterator<Probe> it = b1.f10461a.iterator();
        while (it.hasNext()) {
            final Probe next = it.next();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.l
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.n3(next);
                }
            }, 300L);
        }
        b1.f10461a.clear();
    }

    private void J3(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        try {
            FragmentManager m02 = m0();
            n0 p10 = m02.p();
            Iterator<Fragment> it = m02.y0().iterator();
            while (it.hasNext()) {
                p10.q(it.next());
            }
            Fragment j02 = m02.j0(fragment.getClass().getSimpleName());
            if (j02 != null && fragment.K0()) {
                p10.B(j02);
            } else {
                p10.c(2131362206, fragment, fragment.getClass().getSimpleName());
            }
            p10.l();
        } catch (Exception unused) {
        }
    }

    private void L2(final s5.a aVar) {
        if (MeaterLinkService.e() == null) {
            return;
        }
        MeaterLinkService.e().k();
        String format = String.format(Locale.US, getString(2132017266), aVar.f17814b.getDeviceName());
        AlertDialog alertDialog = this.f9179i0;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f9179i0.dismiss();
        }
        AlertDialog e10 = e0.INSTANCE.e(this, getString(2132017267), format, true, new e0.AlertPair(getString(2132018374), new j6.e() { // from class: o5.r
            @Override // j6.e
            public final void a() {
                MainActivity.this.V2(aVar);
            }
        }), new e0.AlertPair(getString(2132018328), new j6.e() { // from class: o5.s
            @Override // j6.e
            public final void a() {
                MainActivity.this.W2(aVar);
            }
        }), null);
        this.f9179i0 = e10;
        e10.show();
    }

    private void M2() {
        y5.e.INSTANCE.a(new e.b() { // from class: o5.k
            @Override // y5.e.b
            public final void a(JSONObject jSONObject) {
                MainActivity.this.X2(jSONObject);
            }
        });
    }

    private void M3(ArrayList<String> arrayList) {
        if (((C0458j) this.f9187q0.getValue()).l()) {
            Intent intent = new Intent(this, (Class<?>) VideoTutorialSummaryActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_WATCH_VIDEOS, arrayList);
            startActivity(intent);
        }
    }

    private boolean N2(Intent intent) {
        Uri parse = Uri.parse("meater://resetbookmark");
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            if (data.equals(parse)) {
                z5.h hVar = z5.h.f20309a;
                hVar.b();
                hVar.b();
                return false;
            }
            if (!com.apptionlabs.meater_app.app.a.u().H1()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.this.Y2();
                    }
                }, 100L);
            } else {
                startActivity(new Intent(this, (Class<?>) QSGActivity.class));
                finish();
            }
        }
        return false;
    }

    private void N3() {
        int I = com.apptionlabs.meater_app.app.a.u().I();
        w6.d dVar = w6.d.N;
        if (I != dVar.getProgress()) {
            com.apptionlabs.meater_app.app.a.u().A0(dVar.getProgress());
        }
        b1.f10486z = true;
        Intent intent = new Intent(this, (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
        this.B0.a(intent);
    }

    private void O2() {
        k.INSTANCE.k(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(long j10) {
        Intent intent = new Intent(this, (Class<?>) MeaterDetailsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, j10);
        startActivity(intent);
    }

    private void P2() {
        if (!ih.a.f268a.a(this)) {
            d1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3() {
        this.f9171a0.R.setOnItemSelectedListener(new e.c() { // from class: o5.f
            public final boolean a(MenuItem menuItem) {
                boolean s32;
                s32 = MainActivity.this.s3(menuItem);
                return s32;
            }
        });
    }

    private boolean Q2() {
        for (MEATERDevice mEATERDevice : this.f9172b0) {
            if (mEATERDevice.isMEATERPlus() && mEATERDevice.getConnectionState() != DeviceConnectionState.CONNECTED) {
                return true;
            }
        }
        return false;
    }

    private void Q3() {
        ((C0458j) this.f9187q0.getValue()).A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2() {
        this.f9171a0.T.setVisibility(8);
        this.f9171a0.Z.setVisibility(0);
        H0(this.f9171a0.Z);
        invalidateOptionsMenu();
    }

    private void R3() {
        final boolean z10;
        int i10;
        int i11;
        if (c6.h.f8879a.L().size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView textView = this.f9171a0.V;
        if (z10) {
            i10 = 2132017577;
        } else {
            i10 = 2132017576;
        }
        textView.setText(getString(i10));
        TextView textView2 = this.f9171a0.U;
        if (z10) {
            i11 = 2132017522;
        } else {
            i11 = 2132018154;
        }
        textView2.setText(getString(i11));
        this.f9171a0.U.setOnClickListener(new View.OnClickListener() { // from class: o5.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.t3(z10, view);
            }
        });
    }

    private void S2(Bundle bundle) {
        if (Config.getInstance().SHOULD_SHOW_RECIPE) {
            C0496g c0496g = (C0496g) m0().j0(C0496g.class.getSimpleName());
            this.f9189s0 = c0496g;
            if (bundle == null || c0496g == null) {
                this.f9189s0 = C0496g.INSTANCE.a();
                ((C0458j) this.f9187q0.getValue()).m();
            }
        } else if (this.f9171a0.R.getMenu().findItem(2131362933) != null) {
            this.f9171a0.R.getMenu().removeItem(2131362933);
        }
        C0525p c0525p = (C0525p) m0().j0(C0525p.class.getSimpleName());
        this.f9190t0 = c0525p;
        if (bundle == null || c0525p == null) {
            this.f9190t0 = C0525p.b3("https://meater.com");
        }
        x0 x0Var = (x0) m0().j0(x0.class.getSimpleName());
        this.f9191u0 = x0Var;
        if (bundle == null || x0Var == null) {
            this.f9191u0 = x0.G2();
        }
        if (bundle != null) {
            if (bundle.getInt(MEATERIntent.EXTRA_IS_CONTAINER_VISIBLE) == 0) {
                this.f9171a0.T.setVisibility(0);
                this.f9171a0.Z.setVisibility(8);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.this.R2();
                    }
                }, 50L);
            }
            invalidateOptionsMenu();
        }
    }

    private void S3() {
        if (getResources().getConfiguration().orientation == 2 && getResources().getBoolean(2131034115)) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            this.f9171a0.W.j(new l1());
            this.f9171a0.W.setLayoutManager(gridLayoutManager);
        } else {
            this.f9171a0.W.setLayoutManager(new LinearLayoutManager(this));
            if (l0.w(this)) {
                this.f9171a0.W.j(new q1(2));
            } else {
                this.f9171a0.W.j(new l1());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T2() {
        return getLifecycle().getState().i(AbstractC0397k.b.STARTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U2() {
        if (!isFinishing() && MeaterLinkService.f9590s) {
            Z1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V2(s5.a aVar) {
        k6.b.a("[scan] pair yes", aVar.f17814b.getMacAddress(), Long.valueOf(aVar.f17814b.getDeviceID()));
        aVar.a();
        this.f9177g0 = false;
        N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W2(s5.a aVar) {
        k6.b.a("[scan] pair no", aVar.f17814b.getMacAddress(), Long.valueOf(aVar.f17814b.getDeviceID()));
        aVar.a();
        this.f9177g0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X2(JSONObject jSONObject) {
        if (E0 && jSONObject.length() > 0) {
            JuicyVideoList c10 = l.c(jSONObject);
            if (c10 != null) {
                c10.parentList.add(new VideoData("MEATER 2", c10.meater2));
                c10.parentList.add(new VideoData("Pro Know", c10.instructional));
                c10.parentList.add(new VideoData(getString(2132017861), c10.guest));
            }
            if (c10 != null) {
                q6.a.f16817a.d(c10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y2() {
        b1.f10475o = false;
        Intent intent = new Intent(this, (Class<?>) CustomSettingActivity.class);
        intent.putExtra("reset_password", true);
        startActivity(intent);
    }

    private void Z1() {
        this.f9182l0.removeCallbacksAndMessages(null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.g
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.q3();
            }
        }, 3000L);
        k6.b.a("[scan] start autoPair scan", new Object[0]);
        if (MeaterLinkService.e() != null) {
            MeaterLinkService.e().h(false);
            if (!b1.A && this.f9173c0.h() > 0 && !x.l()) {
                b1.A = true;
                s6.d.G();
            }
        }
        c6.h.f8879a.y(this, new h.b() { // from class: o5.h
            @Override // c6.h.b
            public final void a(List list) {
                MainActivity.this.r3(list);
            }
        });
        D3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z2(CloudMQTTConnectionState cloudMQTTConnectionState) {
        this.f9171a0.S.setConnectionState(cloudMQTTConnectionState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a3(View view) {
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c3(android.view.result.a aVar) {
        E3();
    }

    private void d1() {
        this.f9182l0.removeCallbacksAndMessages(null);
        if (MeaterLinkService.f9590s) {
            Z1();
        } else {
            this.f9182l0.postDelayed(new Runnable() { // from class: o5.b
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.U2();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d3(android.view.result.a aVar) {
        if (aVar.a() != null) {
            this.f9171a0.R.setSelectedItemId(aVar.a().getIntExtra(MEATERIntent.EXTRA_TAG, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e3(List list) {
        boolean z10;
        int size = this.f9172b0.size();
        int size2 = list.size();
        G3(list);
        if (this.f9173c0.h() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        q0.g(z10, this.f9171a0.U);
        q0.g(z10, this.f9171a0.V);
        if (z10) {
            R3();
        }
        if (size <= 0 && size2 > 0) {
            Q3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f3(View view) {
        this.f9183m0.b(i6.c.Q, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g3(qb.h hVar) {
        if (!hVar.o()) {
            k6.b.j("MainAct getInstanceId failed", hVar.j());
        } else {
            MEATERFirebaseMessagingService.INSTANCE.b((String) hVar.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h3(List list) {
        int u10 = ((C0527r) this.f9188r0.getValue()).u();
        if (u10 > 0 && this.f9171a0.R.getSelectedItemId() != 2131362932) {
            this.f9171a0.R.d(2131362932).P(u10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i3(Boolean bool) {
        int z10 = ((C0458j) this.f9187q0.getValue()).z();
        if (z10 > 0) {
            this.f9171a0.R.d(2131362933).P(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j3() {
        if (this.f9178h0) {
            E3();
            this.f9178h0 = false;
        }
        G3(this.f9172b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k3() {
        if (!isFinishing() && E0) {
            this.f9174d0.a(this, false, this.f9172b0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l3(ArrayList arrayList) {
        if (arrayList.size() < ((C0458j) this.f9187q0.getValue()).t()) {
            M3(((C0458j) this.f9187q0.getValue()).q());
        } else if (((C0458j) this.f9187q0.getValue()).t() < arrayList.size()) {
            ((C0458j) this.f9187q0.getValue()).x(arrayList);
        }
        ((C0458j) this.f9187q0.getValue()).v().m(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m3() {
        if (!isFinishing() && this.f9177g0) {
            s5.a d10 = this.f9175e0.d();
            if (d10 != null) {
                if (Q2() && d10.f17814b.isMEATERProbe() && !d10.f17814b.isBlockProbe()) {
                    return;
                }
                L2(d10);
                return;
            }
            D3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n3(Probe probe) {
        if (com.apptionlabs.meater_app.app.a.z()) {
            SavedCook f10 = LocalStorage.sharedStorage().savedCookDAO().f(probe.getCookID());
            if (probe.getCookID() != 0 && f10 != null) {
                Q1(probe, f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o3(View view) {
        this.f9183m0.b(i6.c.U, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p3() {
        if (!isFinishing()) {
            boolean z10 = false;
            boolean z11 = false;
            for (MEATERDevice mEATERDevice : this.f9172b0) {
                if (!mEATERDevice.getShouldShowAsConnected()) {
                    z10 = true;
                }
                if (mEATERDevice.isMEATERProbe() && ((Probe) mEATERDevice).appearsToHaveCookInProgress()) {
                    z11 = true;
                }
                if (z10 && z11) {
                    break;
                }
            }
            if (!isFinishing() && z10 && !z11) {
                this.f9183m0.c(i1());
                i1().setOnClickListener(new View.OnClickListener() { // from class: o5.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.this.o3(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q3() {
        Iterator<? extends MEATERDevice> it = this.f9172b0.iterator();
        while (it.hasNext()) {
            if (!it.next().getShouldShowAsConnected()) {
                this.f9184n0.b(new h.a() { // from class: o5.q
                    @Override // f8.h.a
                    public final void a() {
                        MainActivity.this.p3();
                    }
                });
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MEATERDevice mEATERDevice = (MEATERDevice) it.next();
            if (!mEATERDevice.isPaired() && c6.h.f8879a.T(mEATERDevice)) {
                this.f9175e0.a(mEATERDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean s3(MenuItem menuItem) {
        y0.I();
        if (menuItem.getItemId() == 2131362929) {
            R2();
            return true;
        }
        if (menuItem.getItemId() == 2131362933) {
            if (((C0458j) this.f9187q0.getValue()).k()) {
                this.f9171a0.R.setSelectedItemId(2131362929);
                L3(((C0458j) this.f9187q0.getValue()).r());
            }
            H3(menuItem.getItemId());
            return true;
        }
        H3(menuItem.getItemId());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t3(boolean z10, View view) {
        if (z10) {
            ConnectionsControllerActivity.k3(this, ThisDevice.INSTANCE);
        } else {
            N3();
        }
    }

    private void u3() {
        ((C0458j) this.f9187q0.getValue()).o().g(this, new a0() { // from class: o5.m
            @Override // android.view.a0
            public final void d(Object obj) {
                MainActivity.this.Z2((CloudMQTTConnectionState) obj);
            }
        });
        this.f9171a0.S.setOnClickListener(new View.OnClickListener() { // from class: o5.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.a3(view);
            }
        });
    }

    private void v3(int i10) {
        y0.I();
        if (i10 == 2131362197) {
            lm.b.g(b.EnumC0292b.T.title, "", "");
            ConnectionsControllerActivity.k3(this, ThisDevice.INSTANCE);
            return;
        }
        if (i10 == 2131361910) {
            lm.b.g(b.EnumC0292b.S.title, "", "");
            N3();
            return;
        }
        if (i10 == 2131362239) {
            lm.b.g(b.EnumC0292b.R.title, "", "");
            x3();
            return;
        }
        if (i10 == 2131363280) {
            lm.b.g(b.EnumC0292b.Q.title, "", "");
            y3();
        } else if (i10 == 2131363142) {
            ((C0458j) this.f9187q0.getValue()).w();
        } else if (i10 == 2131362292) {
            w3();
        } else if (i10 == 2131362371) {
            this.f9191u0.H2();
        }
    }

    private void z3() {
        if (Config.getInstance().DEBUG_UI_ENABLED) {
            k6.c.g();
        }
        this.f9173c0 = new c0(this.f9194x0, false);
        S3();
        this.f9171a0.W.setAdapter(this.f9173c0);
        this.f9171a0.W.setItemAnimator(null);
        if (b1.f10475o) {
            b1.f10475o = false;
            Intent intent = new Intent(this, (Class<?>) CustomSettingActivity.class);
            intent.putExtra("reset_password", true);
            startActivity(intent);
        }
        this.f9181k0 = new PopupWindow(this);
    }

    @Override // com.apptionlabs.meater_app.views.r.b
    public void G() {
        this.f9181k0.setBackgroundDrawable(new ColorDrawable(0));
        View inflate = getLayoutInflater().inflate(2131558477, (ViewGroup) null);
        this.f9181k0.setContentView(inflate);
        this.f9181k0.setHeight(-2);
        this.f9181k0.setWidth(-2);
        this.f9181k0.setOutsideTouchable(true);
        this.f9181k0.setFocusable(true);
        ToolTipView toolTipView = (ToolTipView) inflate.findViewById(2131363512);
        toolTipView.getLayoutParams().width = (int) (b1.f10467g / 1.56f);
        this.f9180j0.i(toolTipView);
        new TypedValue();
        PopupWindow popupWindow = this.f9181k0;
        CloudConnectionButton cloudConnectionButton = this.f9171a0.S;
        popupWindow.showAsDropDown(cloudConnectionButton, (cloudConnectionButton.getMaxWidth() / 2) * (-1), 0);
        lm.b.g(b.EnumC0292b.f17367z0.title, "", "");
    }

    @Override // com.apptionlabs.meater_app.views.r.b
    public void J() {
        lm.b.i(b.EnumC0292b.f17342r, b.a.f17298r, b.c.f17370r);
    }

    public void K3() {
        this.f9192v0.findItem(2131362371).setVisible(this.f9191u0.J2());
    }

    void L3(int i10) {
        Intent intent = new Intent(this, (Class<?>) RecipeStepsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, i10);
        startActivity(intent);
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected void f1(CloudMQTTConnectionState cloudMQTTConnectionState) {
        Q3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j
    public View h1() {
        return null;
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected View i1() {
        return this.f9171a0.f8235b0.f7796b;
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getResources().getBoolean(2131034115)) {
            this.f9195y0 = true;
            E3();
            S3();
            P3();
        }
        if (this.f9196z0 != (configuration.uiMode & 48)) {
            MeaterLinkService.d();
            new Handler(Looper.getMainLooper()).postDelayed(new z(), 1200L);
            this.f9195y0 = true;
            recreate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9196z0 = getResources().getConfiguration().uiMode & 48;
        this.f9185o0 = new MEATERAPPLifeCycleObserver(new WeakReference(this));
        if (!getIntent().getBooleanExtra("fromQsgScreen", false)) {
            c6.h.f8879a.O();
        }
        m0.a(this);
        s sVar = (s) androidx.databinding.g.j(this, 2131558445);
        this.f9171a0 = sVar;
        H0(sVar.Z);
        this.f9183m0 = new e1(this, h1());
        this.f9180j0 = new com.apptionlabs.meater_app.views.j(this);
        N2(getIntent());
        z3();
        c6.h.f8879a.C(this, false, new h.b() { // from class: o5.u
            @Override // c6.h.b
            public final void a(List list) {
                MainActivity.this.e3(list);
            }
        });
        i1().setOnClickListener(new View.OnClickListener() { // from class: o5.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.f3(view);
            }
        });
        FirebaseMessaging.l().o().c(new qb.d() { // from class: o5.w
            public final void a(qb.h hVar) {
                MainActivity.g3(hVar);
            }
        });
        if (!A3()) {
            B3();
        }
        S2(bundle);
        u3();
        C3();
        if (Config.getInstance().CAN_D0_INAPP_UPDATE) {
            new f8.r(this);
        }
        ((C0527r) this.f9188r0.getValue()).A();
        ((C0527r) this.f9188r0.getValue()).q().g(this, new a0() { // from class: o5.x
            @Override // android.view.a0
            public final void d(Object obj) {
                MainActivity.this.h3((List) obj);
            }
        });
        ((C0458j) this.f9187q0.getValue()).s().g(this, new a0() { // from class: o5.y
            @Override // android.view.a0
            public final void d(Object obj) {
                MainActivity.this.i3((Boolean) obj);
            }
        });
        if (l0.x(this)) {
            Snackbar l02 = Snackbar.l0(this.f9171a0.X, getString(2132017597), 0);
            ((TextView) l02.G().findViewById(2131363327)).setTextSize(1, 14.0f);
            l02.W();
        }
        getOnBackPressedDispatcher().h(this, this.f9193w0);
        MeaterWearListenerServices.INSTANCE.a(this, "1000");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z10;
        getMenuInflater().inflate(2131689479, menu);
        this.f9192v0 = menu;
        if (this.f9171a0.R.getSelectedItemId() == 2131362929) {
            z10 = true;
        } else {
            z10 = false;
        }
        menu.findItem(2131362807).setVisible(z10);
        menu.findItem(2131362371).setVisible(false);
        return true;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        Log.info("MainActivity", "onDestroy");
        MeaterLinkService e10 = MeaterLinkService.e();
        if (e10 != null) {
            e10.c();
        }
        for (Probe probe : c6.h.f8879a.M()) {
            probe.setStopUpdateLiveNotification(true);
            i iVar = probe.localNotification;
            if (iVar != null) {
                iVar.o();
            }
        }
        AppVersion.resetAppVersion();
        this.f9175e0.f();
        b1.a();
        f8.z.i();
        if (!this.f9195y0) {
            System.exit(0);
        }
        super.onDestroy();
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Alert alertWithID;
        Bundle extras;
        String stringExtra;
        super.onNewIntent(intent);
        if (N2(intent) || A3()) {
            return;
        }
        B3();
        if (!intent.getBooleanExtra(ProtocolParameters.FOREGROUND_NOTIFICATION, false)) {
            long longExtra = intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
            if (longExtra == 0 && (extras = intent.getExtras()) != null && extras.containsKey("ProbeID") && (stringExtra = intent.getStringExtra("ProbeID")) != null && !stringExtra.isEmpty()) {
                try {
                    longExtra = new BigInteger(stringExtra, 16).longValue();
                } catch (NumberFormatException e10) {
                    Log.error("MainActivity", android.util.Log.getStackTraceString(e10));
                }
            }
            MEATERDevice o10 = c6.h.f8879a.o(longExtra);
            if (o10 != null && o10.isMEATERProbe()) {
                Probe probe = (Probe) o10;
                String stringExtra2 = intent.getStringExtra(MEATERIntent.EXTRA_ALERT_ID);
                if (stringExtra2 != null && o10.isMEATERProbe() && (alertWithID = probe.alertWithID(UUID.fromString(stringExtra2))) != null) {
                    alertWithID.setState(AlarmState.ALARM_STATE_DISMISSED);
                    probe.setSetupSeqNum(probe.getSetupSeqNum() + 1);
                    l6.k.e0().N(probe);
                }
                k6.b.t("Notification Tapped: Device: " + o10.getDeviceID(), new Object[0]);
                k6.b.t("Current Associated Probe: " + ((C0458j) this.f9187q0.getValue()).p(), new Object[0]);
                if (((C0458j) this.f9187q0.getValue()).p() == o10.getDeviceID()) {
                    k6.b.t("Notification Probe is associated with Recipe : " + ((C0458j) this.f9187q0.getValue()).r(), new Object[0]);
                    k6.b.t("Starting Recipe screen", new Object[0]);
                    s1(o10, Integer.valueOf(((C0458j) this.f9187q0.getValue()).r()));
                } else {
                    r1(probe);
                }
            }
        }
        j l10 = com.apptionlabs.meater_app.app.a.l();
        if (com.apptionlabs.meater_app.app.a.v()) {
            long longExtra2 = l10.getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
            Intent intent2 = new Intent(this, (Class<?>) BlockFirmwareUpdateActivity.class);
            intent2.putExtra(MEATERIntent.EXTRA_DEVICE_ID, longExtra2);
            startActivity(intent2);
        } else if (com.apptionlabs.meater_app.app.a.x()) {
            long longExtra3 = l10.getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
            Intent intent3 = new Intent(this, (Class<?>) MEATERPlusFirmwareUpdateActivity.class);
            intent3.putExtra(MEATERIntent.EXTRA_DEVICE_ID, longExtra3);
            startActivity(intent3);
        }
        if (intent.getBooleanExtra(MEATERIntent.EXTRA_SHOW_COOK_TAB, false)) {
            this.f9171a0.R.setSelectedItemId(2131362929);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v3(menuItem.getItemId());
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        E0 = false;
        ProbeConnectionStatusView.f();
    }

    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    @TargetApi(23)
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        ih.a.f268a.c(this, strArr, iArr);
        d1();
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        F3();
        E0 = true;
        ProbeConnectionStatusView.e();
        Q3();
        y5.g.E().C0();
        if (!this.f9174d0.getHaveWarnedUserAboutLocationServicesDisabled()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.a0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.k3();
                }
            }, 10000L);
        }
        P3();
        if (q6.a.f16817a.b().e() == null) {
            M2();
        }
        this.f9172b0 = c6.h.f8879a.U(false);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.b0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.j3();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(MEATERIntent.EXTRA_IS_CONTAINER_VISIBLE, this.f9171a0.T.getVisibility());
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        FirmwareVersion.sharedInstance().initFromCache(this);
        i1().setVisibility(8);
        this.f9177g0 = true;
        P2();
        try {
            O2();
        } catch (Exception unused) {
            lm.b.i(b.EnumC0292b.G1, b.a.B, b.c.B);
        }
        MeaterLinkService.g();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(MEATERIntent.INTENT_REFRESH_PREVIOUS_COOKS);
        l0.E(this, this.A0, intentFilter);
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f9176f0.removeCallbacksAndMessages(null);
        AlertDialog alertDialog = this.f9179i0;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        PopupWindow popupWindow = this.f9181k0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        unregisterReceiver(this.A0);
    }

    @Override // com.apptionlabs.meater_app.app.MEATERAPPLifeCycleObserver.a
    public void s(boolean z10) {
        if (!z10) {
            I3();
        }
    }

    public void w3() {
        startActivity(new Intent(this, (Class<?>) DebugActivity.class));
    }

    public void x3() {
        Intent intent = new Intent(this, (Class<?>) CookHistory.class);
        intent.putExtra("PC", true);
        intent.putExtra(MEATERIntent.INTENT_FRAGMENT_TYPE, CookHistory.c.PreviousCookFragment.ordinal());
        intent.putExtra(MEATERIntent.INTENT_FRAGMENT_CONTEXT, CookHistory.b.history.ordinal());
        startActivity(intent);
    }

    public void y3() {
        if (!l0.L()) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) CustomSettingActivity.class);
        intent.putExtra("MA", true);
        this.C0.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class c implements u {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Probe probe) {
            if (probe.getDeviceID() == ((C0458j) MainActivity.this.f9187q0.getValue()).p()) {
                ((C0458j) MainActivity.this.f9187q0.getValue()).y();
            }
            probe.cancelCook(true);
            y0.I();
            MainActivity.this.f9173c0.o(MainActivity.this.f9172b0.indexOf(probe));
        }

        private void h(Probe probe) {
            Intent intent = new Intent(MainActivity.this, (Class<?>) RecipeStepsActivity.class);
            k6.b.t("Dashboard Probe Item Clicked : Probe = " + probe.getDeviceID() + ", Associated Recipe = " + ((C0458j) MainActivity.this.f9187q0.getValue()).r(), new Object[0]);
            intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, ((C0458j) MainActivity.this.f9187q0.getValue()).r());
            MainActivity.this.startActivity(intent);
        }

        @Override // j6.u
        public void a(final Probe probe) {
            String string = MainActivity.this.getString(2132017661);
            if (probe.getDeviceID() == ((C0458j) MainActivity.this.f9187q0.getValue()).p()) {
                string = MainActivity.this.getString(2132017404);
            }
            e0.Companion companion = e0.INSTANCE;
            MainActivity mainActivity = MainActivity.this;
            companion.e(mainActivity, mainActivity.getString(2132017662), string, true, new e0.AlertPair(MainActivity.this.getString(2132018978), new j6.e() { // from class: com.apptionlabs.meater_app.a
                @Override // j6.e
                public final void a() {
                    MainActivity.c.this.f(probe);
                }
            }), new e0.AlertPair(MainActivity.this.getString(2132018306), new j6.e() { // from class: com.apptionlabs.meater_app.b
                @Override // j6.e
                public final void a() {
                    MainActivity.c.g();
                }
            }), null).show();
        }

        @Override // j6.u
        public void b(Probe probe) {
            if (!MainActivity.this.T2()) {
                return;
            }
            if (probe.getDeviceID() != ((C0458j) MainActivity.this.f9187q0.getValue()).p()) {
                MainActivity.this.O3(probe.getDeviceID());
            } else {
                h(probe);
            }
        }

        @Override // j6.u
        public void c(MEATERDevice mEATERDevice) {
            if (mEATERDevice != null) {
                lm.b.g(b.EnumC0292b.O.title, "", "");
                switch (e.f9201a[mEATERDevice.getMEATERDeviceType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        MainActivity mainActivity = MainActivity.this;
                        if (mEATERDevice.getParentDevice() != null) {
                            mEATERDevice = mEATERDevice.getParentDevice();
                        }
                        ConnectionsControllerActivity.k3(mainActivity, mEATERDevice);
                        return;
                    default:
                        ConnectionsControllerActivity.k3(MainActivity.this, mEATERDevice);
                        return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void g() {
        }
    }

    @Override // com.apptionlabs.meater_app.views.r.b
    public void z() {
    }
}
