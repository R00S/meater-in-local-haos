package com.apptionlabs.meater_app.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.t0;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import c6.h;
import com.apptionlabs.meater_app.activities.ConnectionsControllerActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.WebLink;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.DeviceType;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MasterDevice;
import com.apptionlabs.meater_app.model.OptionDeviceInfo;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.views.CloudConnectionDetailView;
import com.apptionlabs.meater_app.views.DeviceConnectionView;
import com.apptionlabs.meater_app.views.MarchingAntsView;
import com.apptionlabs.meater_app.views.RoundCircleImage;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import f8.q0;
import h6.r;
import j6.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import lm.b;
import q5.u;
import q5.x;
import q5.y0;
import rk.C0450b;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ConnectionsControllerActivity extends j {

    /* renamed from: a0, reason: collision with root package name */
    private b6.e f9281a0;

    /* renamed from: b0, reason: collision with root package name */
    private x f9282b0;

    /* renamed from: c0, reason: collision with root package name */
    private g f9283c0;

    /* renamed from: d0, reason: collision with root package name */
    private g f9284d0;

    /* renamed from: e0, reason: collision with root package name */
    private j6.o f9285e0;

    /* renamed from: f0, reason: collision with root package name */
    private C0450b f9286f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Handler f9287g0 = new Handler(Looper.getMainLooper());

    /* renamed from: h0, reason: collision with root package name */
    private final Handler f9288h0 = new Handler(Looper.getMainLooper());

    /* renamed from: i0, reason: collision with root package name */
    private boolean f9289i0 = true;

    /* renamed from: j0, reason: collision with root package name */
    private long f9290j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    private final ArrayList<MEATERDevice> f9291k0 = new ArrayList<>();

    /* renamed from: l0, reason: collision with root package name */
    private boolean f9292l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    private int f9293m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    private final View.OnClickListener f9294n0 = new a();

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object tag = view.getTag();
            if ((tag instanceof j6.o) && !ConnectionsControllerActivity.this.f9285e0.equals(tag) && ConnectionsControllerActivity.this.u3()) {
                ConnectionsControllerActivity.k3(ConnectionsControllerActivity.this, (j6.o) tag);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b implements j6.a {
        b() {
        }

        @Override // j6.a
        public void a(View view, int i10) {
            MEATERDevice P = ConnectionsControllerActivity.this.f9284d0.P(i10);
            if (P != null && ConnectionsControllerActivity.this.u3()) {
                ConnectionsControllerActivity.k3(ConnectionsControllerActivity.this, P);
            }
        }

        @Override // j6.a
        public void b(View view, int i10) {
            MEATERDevice P = ConnectionsControllerActivity.this.f9284d0.P(i10);
            if (P != null && ConnectionsControllerActivity.this.u3()) {
                ConnectionsControllerActivity.this.j3(P, i10, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class c implements j6.a {
        c() {
        }

        @Override // j6.a
        public void a(View view, int i10) {
            MEATERDevice P = ConnectionsControllerActivity.this.f9283c0.P(i10);
            if (P != null && ConnectionsControllerActivity.this.u3()) {
                ConnectionsControllerActivity.k3(ConnectionsControllerActivity.this, P);
            }
        }

        @Override // j6.a
        public void b(View view, int i10) {
            MEATERDevice P = ConnectionsControllerActivity.this.f9283c0.P(i10);
            if (P != null && ConnectionsControllerActivity.this.u3()) {
                ConnectionsControllerActivity.this.j3(P, i10, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9299a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9300b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f9301c;

        static {
            int[] iArr = new int[OptionDeviceInfo.values().length];
            f9301c = iArr;
            try {
                iArr[OptionDeviceInfo.APP_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9301c[OptionDeviceInfo.WIFI_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9301c[OptionDeviceInfo.FIRMWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9301c[OptionDeviceInfo.FIRMWARE_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[h.values().length];
            f9300b = iArr2;
            try {
                iArr2[h.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9300b[h.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9300b[h.NO_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[DeviceType.values().length];
            f9299a = iArr3;
            try {
                iArr3[DeviceType.MEATER_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9299a[DeviceType.THIS_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9299a[DeviceType.MASTER_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum f {
        ID,
        TYPE_NAME
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class g extends y0<a> {
        private final Context A;

        /* renamed from: u, reason: collision with root package name */
        private final List<MEATERDevice> f9305u = new ArrayList();

        /* renamed from: v, reason: collision with root package name */
        private final LayoutInflater f9306v;

        /* renamed from: w, reason: collision with root package name */
        private j6.a f9307w;

        /* renamed from: x, reason: collision with root package name */
        private final List<WeakReference<MarchingAntsView>> f9308x;

        /* renamed from: y, reason: collision with root package name */
        private h f9309y;

        /* renamed from: z, reason: collision with root package name */
        private final View.OnClickListener f9310z;

        /* loaded from: /tmp/meat/meat/classes.dex */
        public class a extends y0.a implements View.OnClickListener {

            /* renamed from: q, reason: collision with root package name */
            RoundCircleImage f9311q;

            /* renamed from: r, reason: collision with root package name */
            ImageView f9312r;

            /* renamed from: s, reason: collision with root package name */
            TextView f9313s;

            /* renamed from: t, reason: collision with root package name */
            TextView f9314t;

            /* renamed from: u, reason: collision with root package name */
            DeviceConnectionView f9315u;

            /* renamed from: v, reason: collision with root package name */
            View f9316v;

            /* renamed from: w, reason: collision with root package name */
            View f9317w;

            /* renamed from: x, reason: collision with root package name */
            RelativeLayout f9318x;

            a(View view) {
                super(view);
                this.f9311q = (RoundCircleImage) view.findViewById(2131363198);
                this.f9312r = (ImageView) view.findViewById(2131362673);
                this.f9313s = (TextView) view.findViewById(2131363586);
                this.f9314t = (TextView) view.findViewById(2131363559);
                this.f9317w = view.findViewById(2131362306);
                this.f9318x = (RelativeLayout) view.findViewById(2131362015);
                this.f9315u = (DeviceConnectionView) view.findViewById(2131362735);
                this.f9316v = view.findViewById(2131362736);
                g.this.f9308x.addAll(this.f9315u.getMarchingAnts());
                view.setOnClickListener(this);
            }

            @Override // q5.y0.a
            public SwipeLayout getSwipeLayout() {
                return this.itemView.findViewById(2131363385);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (g.this.f9307w != null) {
                    g.this.f9307w.a(view, getBindingAdapterPosition());
                }
            }
        }

        g(Context context, View.OnClickListener onClickListener) {
            ArrayList arrayList = new ArrayList();
            this.f9308x = arrayList;
            this.f9309y = h.ALL;
            this.A = context;
            this.f9310z = onClickListener;
            F(true);
            this.f9306v = LayoutInflater.from(context);
            arrayList.clear();
        }

        private boolean O(MEATERDevice mEATERDevice) {
            if (mEATERDevice != null && (mEATERDevice.getParentDevice() == null || mEATERDevice.getParentDevice().canBeToldToUnpairChildProbes())) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Q(a aVar, View view) {
            y0.I();
            j6.a aVar2 = this.f9307w;
            if (aVar2 != null) {
                aVar2.a(view, aVar.getBindingAdapterPosition());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void R(a aVar, View view) {
            j6.a aVar2 = this.f9307w;
            if (aVar2 != null) {
                aVar2.b(view, aVar.getBindingAdapterPosition());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean S(MEATERDevice mEATERDevice, int i10, View view) {
            ConnectionsControllerActivity.this.j3(mEATERDevice, i10, false);
            return false;
        }

        public MEATERDevice P(int i10) {
            if (ConnectionsControllerActivity.this.H2(i10, this.f9305u.size())) {
                return this.f9305u.get(i10);
            }
            return null;
        }

        public void T() {
            for (WeakReference<MarchingAntsView> weakReference : this.f9308x) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().b();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void w(y0.a aVar, final int i10) {
            h hVar;
            int intValue;
            boolean z10;
            boolean z11;
            final a aVar2 = (a) aVar;
            final MEATERDevice mEATERDevice = this.f9305u.get(i10);
            if (mEATERDevice == null) {
                return;
            }
            if (O(mEATERDevice)) {
                hVar = h.ALL;
            } else {
                hVar = h.NONE;
            }
            this.f9309y = hVar;
            if (!mEATERDevice.isMEATERProbe()) {
                aVar2.f9313s.setText(mEATERDevice.getDeviceName());
                if (mEATERDevice.getShouldShowAsConnected()) {
                    aVar2.f9314t.setText(ConnectionsControllerActivity.this.getResources().getQuantityString(2131886080, mEATERDevice.getChildDevices().size(), Integer.valueOf(mEATERDevice.getChildDevices().size())));
                } else {
                    aVar2.f9314t.setText(2132018964);
                }
                aVar2.f9311q.setVisibility(4);
                aVar2.f9312r.setImageResource(ConnectionsControllerActivity.this.D2(mEATERDevice, true));
                if (l0.w(this.A)) {
                    aVar2.f9312r.setColorFilter(l0.i(this.A, 2131099682));
                }
            } else {
                aVar2.f9314t.setText(ConnectionsControllerActivity.this.getString(2132017492, mEATERDevice.getParentOrMasterOrThisDevice().getDeviceName()));
                aVar2.f9311q.setVisibility(0);
                if (mEATERDevice.appearsToHaveCookInProgress() && ((mEATERDevice.isMEATERProbe() || mEATERDevice.isBlockProbe()) && mEATERDevice.relatedProbe().appearsToHaveCookInProgress())) {
                    aVar2.f9313s.setText(mEATERDevice.relatedProbe().cookNameForDisplay());
                    if (mEATERDevice.relatedProbe().getmCut() == null) {
                        intValue = 0;
                    } else {
                        intValue = mEATERDevice.relatedProbe().getmCut().id.intValue();
                    }
                    aVar2.f9311q.setColor(Color.parseColor(MeatCutsHelper.getInstance().getMeatColor(intValue)));
                    aVar2.f9311q.setIcon(MeatCutsHelper.getInstance().getMeatIcon(intValue));
                } else if (mEATERDevice.getShouldShowAsConnected()) {
                    aVar2.f9313s.setText(2132017518);
                    aVar2.f9311q.setColor(androidx.core.content.a.c(ConnectionsControllerActivity.this, 2131099677));
                    aVar2.f9311q.setIcon(2131231549);
                } else {
                    aVar2.f9314t.setText(2132018964);
                    aVar2.f9313s.setText(mEATERDevice.getDeviceName());
                    aVar2.f9311q.setColor(androidx.core.content.a.c(ConnectionsControllerActivity.this, 2131099783));
                    aVar2.f9311q.setIcon(2131231371);
                }
            }
            int i11 = e.f9300b[this.f9309y.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        SwipeLayout swipeLayout = aVar2.swipeLayout;
                        if (mEATERDevice.getParentDevice() == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        swipeLayout.setSwipeEnabled(z11);
                    }
                } else {
                    aVar2.swipeLayout.setSwipeEnabled(false);
                }
            } else {
                aVar2.swipeLayout.setSwipeEnabled(true);
            }
            List<j6.o> n10 = C0450b.n(mEATERDevice);
            aVar2.f9315u.setGraphStyle(DeviceConnectionView.b.BASIC);
            aVar2.f9315u.setDeviceClickListener(this.f9310z);
            ConnectionsControllerActivity.this.Y2(aVar2.f9315u, n10);
            if (!aVar2.f9315u.H() && ConnectionsControllerActivity.this.f9285e0 != null && ConnectionsControllerActivity.this.f9285e0.getDeviceType() != DeviceType.THIS_DEVICE) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar2.f9315u.setVisible(z10);
            q0.g(z10, aVar2.f9316v);
            aVar2.f9318x.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.activities.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConnectionsControllerActivity.g.this.Q(aVar2, view);
                }
            });
            aVar2.f9317w.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.activities.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConnectionsControllerActivity.g.this.R(aVar2, view);
                }
            });
            if (this.f9309y != h.NONE) {
                aVar2.f9318x.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.apptionlabs.meater_app.activities.i
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean S;
                        S = ConnectionsControllerActivity.g.this.S(mEATERDevice, i10, view);
                        return S;
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public a y(ViewGroup viewGroup, int i10) {
            return new a(this.f9306v.inflate(2131558573, viewGroup, false));
        }

        public void W(MEATERDevice mEATERDevice) {
            if (mEATERDevice != null) {
                Iterator it = new ArrayList(this.f9305u).iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (mEATERDevice.equals((MEATERDevice) it.next())) {
                        X(i10);
                    }
                    i10++;
                }
            }
        }

        public void X(int i10) {
            if (!l0.z(i10, this.f9305u.size())) {
                return;
            }
            this.f9305u.remove(i10);
            u(i10);
            q(i10, this.f9305u.size());
        }

        public void Y(j6.a aVar) {
            this.f9307w = aVar;
        }

        public void Z(List<MEATERDevice> list) {
            this.f9305u.clear();
            this.f9305u.addAll(list);
            if (this.f9305u.size() == 0) {
                this.f9308x.clear();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f9305u.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long i(int i10) {
            MEATERDevice mEATERDevice = this.f9305u.get(i10);
            if (mEATERDevice != null) {
                return mEATERDevice.getDeviceID();
            }
            return 0L;
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum h {
        ALL,
        NONE,
        NO_PARENT
    }

    private void A2() {
        if (this.f9285e0.getDeviceType() == DeviceType.MEATER_DEVICE) {
            Intent intent = new Intent(this, (Class<?>) WifiSettingsActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, this.f9285e0.getDeviceID());
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B2, reason: merged with bridge method [inline-methods] */
    public void S2(MEATERDevice mEATERDevice, int i10, boolean z10) {
        lm.b.g(b.EnumC0292b.H1.title, "", "");
        if (!z10) {
            Iterator<MEATERDevice> it = mEATERDevice.getChildDevices().iterator();
            while (it.hasNext()) {
                this.f9283c0.W(it.next());
            }
        }
        c6.h.f8879a.e0(mEATERDevice);
        if (z10) {
            this.f9283c0.X(i10);
        } else {
            this.f9284d0.X(i10);
        }
    }

    private void C2(boolean z10) {
        if (z10 || this.f9293m0 < 4) {
            l3();
        }
        this.f9287g0.removeCallbacksAndMessages(null);
        this.f9287g0.postDelayed(new Runnable() { // from class: p5.k0
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionsControllerActivity.this.I2();
            }
        }, 1200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D2(j6.o oVar, boolean z10) {
        if (oVar == null) {
            oVar = ThisDevice.INSTANCE;
        }
        if (z10) {
            return oVar.getSmallImage();
        }
        return oVar.getMediumImage();
    }

    private void E2() {
        g gVar = new g(this, this.f9294n0);
        this.f9284d0 = gVar;
        this.f9281a0.f7668b0.setAdapter(gVar);
        this.f9281a0.f7668b0.setLayoutManager(new LinearLayoutManager(this));
        this.f9281a0.f7668b0.j(new l1());
        this.f9281a0.f7668b0.setItemAnimator(null);
        this.f9281a0.f7668b0.setNestedScrollingEnabled(false);
        j6.o oVar = this.f9285e0;
        if (oVar != null && oVar.getDeviceType() != DeviceType.THIS_DEVICE) {
            this.f9281a0.G0.setVisibility(8);
            this.f9281a0.H0.setVisibility(8);
            this.f9281a0.f7669c0.setVisibility(8);
        } else {
            this.f9281a0.G0.setVisibility(0);
        }
        this.f9284d0.Y(new b());
    }

    private void G2() {
        g gVar = new g(this, this.f9294n0);
        this.f9283c0 = gVar;
        this.f9281a0.f7673g0.setAdapter(gVar);
        this.f9281a0.f7673g0.setLayoutManager(new LinearLayoutManager(this));
        this.f9281a0.f7673g0.j(new l1());
        this.f9281a0.f7673g0.setItemAnimator(null);
        this.f9281a0.f7673g0.setNestedScrollingEnabled(false);
        if (this.f9286f0.B()) {
            this.f9281a0.N0.setVisibility(0);
            this.f9281a0.O0.setVisibility(0);
        } else {
            this.f9281a0.N0.setVisibility(8);
            this.f9281a0.O0.setVisibility(8);
        }
        this.f9283c0.Y(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H2(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2() {
        if (this.f9292l0) {
            l3();
            this.f9292l0 = false;
        }
        C2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J2() {
        if (!isFinishing()) {
            this.f9281a0.V.L();
            g gVar = this.f9283c0;
            if (gVar != null) {
                gVar.T();
            }
            g gVar2 = this.f9284d0;
            if (gVar2 != null) {
                gVar2.T();
            }
            W2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L2(View view) {
        if (u3()) {
            Intent intent = new Intent();
            intent.putExtra("CONT_SCREEN", true);
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(MEATERBlock mEATERBlock, View view) {
        new r(mEATERBlock).N2(m0(), "bottomSheetDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N2(MEATERDevice mEATERDevice) {
        MEATERBlock mEATERBlock = (MEATERBlock) mEATERDevice;
        if (mEATERDevice.isOnline() && mEATERBlock.hasBLEKeepAlive() && mEATERBlock.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
            m3(0);
            this.f9281a0.D0.setText(getString(2132017619));
        } else {
            m3(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O2(View view) {
        if (u3()) {
            int I = com.apptionlabs.meater_app.app.a.u().I();
            w6.d dVar = w6.d.N;
            if (I != dVar.getProgress()) {
                com.apptionlabs.meater_app.app.a.u().A0(dVar.getProgress());
            }
            b1.f10486z = true;
            Intent intent = new Intent(this, (Class<?>) QSGActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2(View view, Object obj) {
        if (u3()) {
            int i10 = e.f9301c[((OptionDeviceInfo) obj).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 || i10 == 4) {
                        p3();
                        return;
                    }
                    return;
                }
                A2();
                return;
            }
            l0.C(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q2() {
        if (!isFinishing()) {
            h3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U2() {
        this.f9284d0.n();
        this.f9283c0.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V2(List list) {
        Handler handler = new Handler(Looper.getMainLooper());
        o3(list);
        r3(list);
        handler.post(new Runnable() { // from class: p5.f0
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionsControllerActivity.this.U2();
            }
        });
    }

    private void W2() {
        this.f9288h0.postDelayed(new Runnable() { // from class: p5.j0
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionsControllerActivity.this.J2();
            }
        }, 135L);
    }

    private void X2(long j10) {
        MasterDevice q10 = l6.k.e0().q(j10);
        if (q10 != null) {
            l6.k.e0().U(q10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2(DeviceConnectionView deviceConnectionView, List<j6.o> list) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        deviceConnectionView.N(list.size());
        deviceConnectionView.setSelectedDevice(-1);
        deviceConnectionView.setSelectionColour(androidx.core.content.a.c(this, 2131099716));
        Iterator<j6.o> it = list.iterator();
        int i12 = 0;
        boolean z12 = false;
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            j6.o next = it.next();
            if (deviceConnectionView.getGraphStyle() == DeviceConnectionView.b.BASIC) {
                z11 = true;
            } else {
                z11 = false;
            }
            deviceConnectionView.Q(i12, D2(next, z11), next);
            if (next.equals(this.f9285e0)) {
                deviceConnectionView.setSelectedDevice(i12);
            }
            if (deviceConnectionView.O(i12, this.f9286f0.l(next, next.getShouldShowAsConnected(), z12)) && !next.getShouldShowAsConnected() && !z12) {
                z12 = true;
            }
            int i13 = i12 * 2;
            deviceConnectionView.S(C0450b.z(next), i13 - 1, i13 - 2);
            if (next.getDeviceType() == DeviceType.MEATER_DEVICE) {
                MEATERDevice mEATERDevice = (MEATERDevice) next;
                if (mEATERDevice.isBlockProbe()) {
                    int displayProbeNumber = mEATERDevice.displayProbeNumber();
                    if (next.equals(this.f9285e0)) {
                        i10 = 2131099716;
                    } else if (l0.w(this)) {
                        i10 = 2131099682;
                    } else {
                        i10 = 2131099778;
                    }
                    int c10 = androidx.core.content.a.c(this, i10);
                    if (next.equals(this.f9285e0)) {
                        i11 = 2131231528;
                    } else {
                        i11 = 2131231527;
                    }
                    deviceConnectionView.T(displayProbeNumber, c10, i11);
                    i12++;
                }
            }
            deviceConnectionView.I();
            i12++;
        }
        DeviceConnectionView.b graphStyle = deviceConnectionView.getGraphStyle();
        DeviceConnectionView.b bVar = DeviceConnectionView.b.DETAILED;
        if (graphStyle == bVar) {
            deviceConnectionView.D();
        }
        boolean z13 = this.f9289i0;
        if (deviceConnectionView.getGraphStyle() != bVar) {
            z10 = false;
        }
        deviceConnectionView.G(z13, z10);
        this.f9289i0 = false;
    }

    private void Z2() {
        j6.o oVar = this.f9285e0;
        if (!(oVar instanceof MEATERBlock)) {
            m3(8);
            return;
        }
        final MEATERBlock mEATERBlock = (MEATERBlock) oVar;
        if (mEATERBlock.isSupportsBLEKeepAlive()) {
            this.f9281a0.D0.setOnClickListener(new View.OnClickListener() { // from class: p5.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConnectionsControllerActivity.this.M2(mEATERBlock, view);
                }
            });
            c6.h.f8879a.A(this, this.f9285e0.getDeviceID(), new h.a() { // from class: p5.o0
                @Override // c6.h.a
                public final void a(MEATERDevice mEATERDevice) {
                    ConnectionsControllerActivity.this.N2(mEATERDevice);
                }
            });
        } else {
            m3(8);
        }
    }

    private void a3() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        j6.o oVar = this.f9285e0;
        boolean z11 = true;
        int i13 = 0;
        if (oVar != null && oVar.getDeviceType() != DeviceType.THIS_DEVICE) {
            z10 = false;
        } else {
            z10 = true;
        }
        TextView textView = this.f9281a0.E0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        View view = this.f9281a0.F0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        j6.o oVar2 = this.f9285e0;
        if (oVar2 != null && oVar2.getDeviceType() != DeviceType.THIS_DEVICE) {
            z11 = false;
        }
        TextView textView2 = this.f9281a0.A0;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView2.setVisibility(i12);
        View view2 = this.f9281a0.B0;
        if (!z11) {
            i13 = 8;
        }
        view2.setVisibility(i13);
        this.f9281a0.A0.setOnClickListener(new View.OnClickListener() { // from class: p5.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ConnectionsControllerActivity.this.O2(view3);
            }
        });
    }

    private void b3() {
        boolean z10;
        boolean z11;
        this.f9281a0.I0.setText(this.f9286f0.p(this));
        d3();
        j6.o oVar = this.f9285e0;
        if (oVar instanceof y) {
            z10 = ((y) oVar).supportsNetworkSettingsMessage();
        } else {
            z10 = false;
        }
        if (Config.getInstance().DEBUG_UI_ENABLED) {
            j6.o oVar2 = this.f9285e0;
            if (oVar2 instanceof j6.x) {
                z11 = ((j6.x) oVar2).supportKeepAliveFeature();
                ArrayList arrayList = new ArrayList(this.f9286f0.q(this, z10, z11));
                u uVar = new u(this);
                uVar.N(new j6.b() { // from class: p5.p0
                    @Override // j6.b
                    public final void r(View view, Object obj) {
                        ConnectionsControllerActivity.this.P2(view, obj);
                    }
                });
                uVar.O(arrayList);
                this.f9281a0.f7670d0.setAdapter(uVar);
                this.f9281a0.f7670d0.setLayoutManager(new LinearLayoutManager(this));
                this.f9281a0.f7670d0.j(new l1());
                this.f9281a0.f7670d0.setItemAnimator(null);
                this.f9281a0.f7670d0.setNestedScrollingEnabled(false);
                this.f9281a0.f7670d0.setHasFixedSize(true);
                uVar.n();
            }
        }
        z11 = false;
        ArrayList arrayList2 = new ArrayList(this.f9286f0.q(this, z10, z11));
        u uVar2 = new u(this);
        uVar2.N(new j6.b() { // from class: p5.p0
            @Override // j6.b
            public final void r(View view, Object obj) {
                ConnectionsControllerActivity.this.P2(view, obj);
            }
        });
        uVar2.O(arrayList2);
        this.f9281a0.f7670d0.setAdapter(uVar2);
        this.f9281a0.f7670d0.setLayoutManager(new LinearLayoutManager(this));
        this.f9281a0.f7670d0.j(new l1());
        this.f9281a0.f7670d0.setItemAnimator(null);
        this.f9281a0.f7670d0.setNestedScrollingEnabled(false);
        this.f9281a0.f7670d0.setHasFixedSize(true);
        uVar2.n();
    }

    private void c3() {
        List<WebLink> r10 = this.f9286f0.r();
        int s10 = this.f9286f0.s();
        if (s10 > 0 && r10.size() > 0) {
            this.f9281a0.J0.setText(s10);
            this.f9281a0.J0.setVisibility(0);
            this.f9281a0.K0.setVisibility(0);
        } else {
            this.f9281a0.J0.setVisibility(8);
            this.f9281a0.K0.setVisibility(8);
        }
        x xVar = new x(this);
        this.f9282b0 = xVar;
        xVar.N(r10);
        this.f9282b0.M(new d());
        this.f9281a0.f7672f0.setAdapter(this.f9282b0);
        this.f9281a0.f7672f0.setLayoutManager(new LinearLayoutManager(this));
        this.f9281a0.f7672f0.setItemAnimator(null);
        this.f9281a0.f7672f0.setNestedScrollingEnabled(false);
        this.f9281a0.f7672f0.setHasFixedSize(true);
        this.f9282b0.n();
    }

    private void d3() {
        int i10 = 8;
        this.f9281a0.W.setVisibility(8);
        this.f9281a0.X.setVisibility(8);
        this.f9281a0.Y.setVisibility(8);
        j6.o oVar = this.f9285e0;
        if (oVar != null) {
            if (oVar.getDeviceType() == DeviceType.MEATER_DEVICE || this.f9285e0.getDeviceType() == DeviceType.MASTER_DEVICE) {
                this.f9281a0.W.setImageResource(f8.a.c(this.f9285e0));
                this.f9281a0.X.setImageResource(this.f9286f0.t());
                this.f9281a0.Y.setImageResource(this.f9286f0.t());
                this.f9281a0.W.setVisibility(0);
                if (l0.w(this)) {
                    this.f9281a0.W.setColorFilter(l0.i(this, 2131099682));
                    this.f9281a0.X.setColorFilter(l0.i(this, 2131099682));
                    this.f9281a0.Y.setColorFilter(l0.i(this, 2131099682));
                }
                j6.o oVar2 = this.f9285e0;
                if (oVar2 instanceof MEATERBlock) {
                    ImageView imageView = this.f9281a0.Y;
                    if (oVar2.getDeviceType() != DeviceType.MASTER_DEVICE) {
                        i10 = 0;
                    }
                    imageView.setVisibility(i10);
                    return;
                }
                ImageView imageView2 = this.f9281a0.X;
                if (oVar2.getDeviceType() != DeviceType.MASTER_DEVICE) {
                    i10 = 0;
                }
                imageView2.setVisibility(i10);
            }
        }
    }

    private void e3() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.m0
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionsControllerActivity.this.Q2();
            }
        }, 100L);
    }

    private void f3() {
        if (this.f9286f0.A()) {
            this.f9281a0.L0.setText(this.f9286f0.j(this));
            this.f9281a0.L0.setVisibility(0);
            this.f9281a0.f7667a0.setVisibility(0);
            this.f9281a0.M0.setVisibility(0);
            this.f9281a0.V.setGraphStyle(DeviceConnectionView.b.DETAILED);
            Y2(this.f9281a0.V, C0450b.n(this.f9285e0));
            return;
        }
        this.f9281a0.L0.setVisibility(8);
        this.f9281a0.M0.setVisibility(8);
        this.f9281a0.f7667a0.setVisibility(8);
    }

    private void g3() {
        x0().F(this.f9286f0.w());
    }

    private void h3() {
        int i10;
        j6.o oVar = this.f9285e0;
        boolean z10 = oVar instanceof j6.g;
        int i11 = 0;
        if ((oVar instanceof MEATERBlock) && ((MEATERBlock) oVar).getChildDevices().size() == 0) {
            z10 = false;
        }
        CloudConnectionDetailView cloudConnectionDetailView = this.f9281a0.P0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        cloudConnectionDetailView.setVisibility(i10);
        View view = this.f9281a0.Q0;
        if (!z10) {
            i11 = 8;
        }
        view.setVisibility(i11);
        if (z10) {
            this.f9281a0.P0.o((j6.g) this.f9285e0);
        }
    }

    private void i3(int i10, int i11) {
        e0.INSTANCE.e(this, getString(i10), getString(i11), true, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.g0
            @Override // j6.e
            public final void a() {
                ConnectionsControllerActivity.R2();
            }
        }), null, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(final MEATERDevice mEATERDevice, final int i10, final boolean z10) {
        e0.INSTANCE.e(this, getString(2132018870), getString(2132018869), false, new e0.AlertPair(getString(2132018978), new j6.e() { // from class: p5.h0
            @Override // j6.e
            public final void a() {
                ConnectionsControllerActivity.this.S2(mEATERDevice, i10, z10);
            }
        }), new e0.AlertPair(getString(2132018306), new j6.e() { // from class: p5.i0
            @Override // j6.e
            public final void a() {
                ConnectionsControllerActivity.T2();
            }
        }), null).show();
    }

    public static void k3(Activity activity, j6.o oVar) {
        Intent intent = new Intent(activity, (Class<?>) ConnectionsControllerActivity.class);
        if (oVar != null) {
            intent.putExtra(f.ID.name(), oVar.getDeviceID());
            intent.putExtra(f.TYPE_NAME.name(), oVar.getDeviceType().name());
        }
        activity.startActivityForResult(intent, lm.a.DEVICE_CONNECTIONS.i());
    }

    private synchronized void l3() {
        this.f9293m0++;
        d3();
        e3();
        f3();
        b3();
        t3(this.f9291k0);
        n3();
    }

    private void m3(int i10) {
        this.f9281a0.S.setVisibility(i10);
        this.f9281a0.C0.setVisibility(i10);
        this.f9281a0.D0.setVisibility(i10);
    }

    private void o3(List<MEATERDevice> list) {
        j6.o oVar = this.f9285e0;
        if (oVar == null || oVar.getDeviceType() == DeviceType.THIS_DEVICE) {
            ArrayList arrayList = new ArrayList();
            for (MEATERDevice mEATERDevice : list) {
                if (mEATERDevice.isPaired() && !mEATERDevice.isMEATERProbe()) {
                    arrayList.add(mEATERDevice);
                }
            }
            this.f9284d0.Z(arrayList);
        }
    }

    private void p3() {
        if (this.f9285e0.getDeviceType() == DeviceType.MEATER_DEVICE) {
            MEATERDevice mEATERDevice = (MEATERDevice) this.f9285e0;
            Class<?> o10 = this.f9286f0.o();
            if (!mEATERDevice.isOnline()) {
                i3(2132018323, 2132017600);
            } else if (o10 != null && mEATERDevice.needsFirmwareUpdate()) {
                Intent intent = new Intent(this, o10);
                intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
                startActivity(intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public synchronized void K2(List<? extends MEATERDevice> list) {
        this.f9291k0.clear();
        this.f9291k0.addAll(list);
        this.f9292l0 = true;
        if (this.f9293m0 < 4) {
            C2(true);
        }
    }

    private void r3(List<MEATERDevice> list) {
        if (this.f9286f0.B()) {
            ArrayList arrayList = new ArrayList();
            for (MEATERDevice mEATERDevice : list) {
                if (mEATERDevice.isPaired() && mEATERDevice.isMEATERProbe()) {
                    arrayList.add(mEATERDevice);
                }
            }
            this.f9283c0.Z(arrayList);
        }
    }

    private void s3() {
        int i10;
        TextView textView = this.f9281a0.N0;
        int i11 = 8;
        if (this.f9286f0.B()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        View view = this.f9281a0.O0;
        if (this.f9286f0.B()) {
            i11 = 0;
        }
        view.setVisibility(i11);
    }

    private void t3(List<MEATERDevice> list) {
        final ArrayList arrayList = new ArrayList(list);
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: p5.r0
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionsControllerActivity.this.V2(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u3() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > this.f9290j0 + 250) {
            this.f9290j0 = currentTimeMillis;
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.s, android.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (lm.a.DEVICE_CONNECTIONS.n(i10, i11)) {
            boolean booleanExtra = intent.getBooleanExtra("CONT_SCREEN", false);
            if (u3() && booleanExtra) {
                Intent intent2 = new Intent();
                intent2.setPackage(com.apptionlabs.meater_app.app.a.i().getPackageName());
                intent2.putExtra("CONT_SCREEN", true);
                setResult(-1, intent2);
                finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9281a0 = (b6.e) androidx.databinding.g.j(this, 2131558437);
        long longExtra = getIntent().getLongExtra(f.ID.name(), 0L);
        DeviceType deviceType = DeviceType.getDeviceType(getIntent().getStringExtra(f.TYPE_NAME.name()));
        if (deviceType == null) {
            finish();
            return;
        }
        int i10 = e.f9299a[deviceType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f9285e0 = l6.k.e0().q(longExtra);
                }
            } else {
                this.f9285e0 = ThisDevice.INSTANCE;
            }
        } else {
            this.f9285e0 = c6.h.f8879a.o(longExtra);
        }
        X2(longExtra);
        C0450b c0450b = (C0450b) new t0(this).a(C0450b.class);
        this.f9286f0 = c0450b;
        c0450b.x(this.f9285e0);
        this.f9281a0.V.setDeviceClickListener(this.f9294n0);
        g3();
        b3();
        E2();
        G2();
        s3();
        n3();
        a3();
        c3();
        e3();
        F2();
        Z2();
        c6.h.f8879a.C(this, true, new h.b() { // from class: p5.l0
            @Override // c6.h.b
            public final void a(List list) {
                ConnectionsControllerActivity.this.K2(list);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131689477, menu);
        View inflate = getLayoutInflater().inflate(2131558434, (ViewGroup) null);
        menu.findItem(2131362858).setActionView(inflate);
        TextView textView = (TextView) inflate.findViewById(2131361903);
        textView.setText(getString(2132018166));
        textView.setOnClickListener(new View.OnClickListener() { // from class: p5.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConnectionsControllerActivity.this.L2(view);
            }
        });
        return true;
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f9293m0 = 0;
        C2(true);
        W2();
        e3();
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f9287g0.removeCallbacksAndMessages(null);
        this.f9288h0.removeCallbacksAndMessages(null);
    }

    private void F2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T2() {
    }

    private void n3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class d implements j6.a {
        d() {
        }

        @Override // j6.a
        public void a(View view, int i10) {
            WebLink J = ConnectionsControllerActivity.this.f9282b0.J(i10);
            if (J != null && ConnectionsControllerActivity.this.u3()) {
                WebViewActivity.C2(ConnectionsControllerActivity.this, J.title, J.url);
            }
        }

        @Override // j6.a
        public void b(View view, int i10) {
        }
    }
}
