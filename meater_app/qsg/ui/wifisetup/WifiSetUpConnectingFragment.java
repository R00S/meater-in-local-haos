package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.t0;
import android.view.v0;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.WiFiSSID;
import com.apptionlabs.meater_app.qsg.ui.wifisetup.WifiSetUpConnectingFragment;
import com.apptionlabs.meater_app.v3protobuf.MEATERSSIDEncryptionType;
import com.apptionlabs.meater_app.views.e0;
import com.google.android.material.button.MaterialButton;
import f8.l0;
import f8.v;
import ih.g;
import j6.e;
import j6.s;
import j6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import q5.x0;
import t5.q0;
import wh.d0;
import wh.h0;
import wh.m;
import wh.o;

/* compiled from: WifiSetUpConnectingFragment.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001IB\u0007¢\u0006\u0004\bG\u0010HJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J4\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bH\u0002J4\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\rH\u0016J$\u0010$\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0!H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\b0!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010>\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006J"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetUpConnectingFragment;", "Le7/b;", "Lj6/w;", "Lj6/s;", "Lih/u;", "a3", "Y2", "h3", "Lcom/apptionlabs/meater_app/data/WiFiSSID;", "ssid", "", "alreadyConnectedConditionChecked", "V2", "", "title", "detail", "", "positiveBtnText", "negativeBtnText", "selectedSSID", "e3", "b3", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "v1", "K", "WifiName", "i", "Ljava/util/ArrayList;", "recommendedNetworks", "foundNetworks", "v", "x1", "y1", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetUpConnectingFragment$a;", "v0", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetUpConnectingFragment$a;", "screenState", "Lq5/x0;", "w0", "Lq5/x0;", "networkListAdapter", "x0", "Ljava/util/ArrayList;", "wifiNetworkList", "Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/c;", "y0", "Lih/g;", "W2", "()Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/c;", "wifiSetUpViewModel", "z0", "Z", "getCurrentScreenVisible", "()Z", "setCurrentScreenVisible", "(Z)V", "currentScreenVisible", "Landroid/os/Handler;", "A0", "Landroid/os/Handler;", "getNoNetworkListHandler", "()Landroid/os/Handler;", "setNoNetworkListHandler", "(Landroid/os/Handler;)V", "noNetworkListHandler", "<init>", "()V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class WifiSetUpConnectingFragment extends e7.b implements w, s {

    /* renamed from: A0, reason: from kotlin metadata */
    private Handler noNetworkListHandler;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private x0 networkListAdapter;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private ArrayList<WiFiSSID> wifiNetworkList;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private boolean currentScreenVisible;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private a screenState = a.f9889q;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private final g wifiSetUpViewModel = s0.b(this, d0.b(com.apptionlabs.meater_app.qsg.ui.wifisetup.c.class), new b(this), new c(null, this), new d(this));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WifiSetUpConnectingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/wifisetup/WifiSetUpConnectingFragment$a;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a {

        /* renamed from: q, reason: collision with root package name */
        public static final a f9889q = new a("SCANNING", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final a f9890r = new a("SCANNED", 1);

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ a[] f9891s;

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ ph.a f9892t;

        static {
            a[] g10 = g();
            f9891s = g10;
            f9892t = ph.b.a(g10);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] g() {
            return new a[]{f9889q, f9890r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9891s.clone();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "b", "()Landroidx/lifecycle/v0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9893q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f9893q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = this.f9893q.c2().y();
            m.e(y10, "requireActivity().viewModelStore");
            return y10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Lv0/a;", "b", "()Lv0/a;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<v0.a> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9894q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fragment f9895r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vh.a aVar, Fragment fragment) {
            super(0);
            this.f9894q = aVar;
            this.f9895r = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0.a a() {
            v0.a aVar;
            vh.a aVar2 = this.f9894q;
            if (aVar2 == null || (aVar = (v0.a) aVar2.a()) == null) {
                v0.a n10 = this.f9895r.c2().n();
                m.e(n10, "requireActivity().defaultViewModelCreationExtras");
                return n10;
            }
            return aVar;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9896q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f9896q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            t0.b defaultViewModelProviderFactory = this.f9896q.c2().getDefaultViewModelProviderFactory();
            m.e(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    private final void V2(WiFiSSID wiFiSSID, boolean z10) {
        WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) c2();
        m.c(wifiSetupHostActivity);
        String k22 = wifiSetupHostActivity.k2();
        String N = q0.N(wiFiSSID.getName().L());
        if (!z10 && !m.a(k22, N)) {
            h0 h0Var = h0.a;
            Locale locale = Locale.US;
            String A0 = A0(2132017623);
            m.e(A0, "getString(...)");
            String format = String.format(locale, A0, Arrays.copyOf(new Object[]{k22}, 1));
            m.e(format, "format(locale, format, *args)");
            String A02 = A0(2132017624);
            m.e(A02, "getString(...)");
            e3(A02, format, 2132017539, 2132018611, wiFiSSID);
            return;
        }
        String N2 = q0.N(wiFiSSID.getName().L());
        m.d(N2, "null cannot be cast to non-null type kotlin.String");
        if (wiFiSSID.getEncryptionType() == MEATERSSIDEncryptionType.MEATER_SSID_ENCRYPTION_TYPE_NONE) {
            WifiSetupHostActivity wifiSetupHostActivity2 = (WifiSetupHostActivity) c2();
            m.c(wifiSetupHostActivity2);
            wifiSetupHostActivity2.q2(N2, "");
            ProgressBar progressBar = A2().f8503a0;
            m.e(progressBar, "mainProgress");
            g6.d.j(progressBar);
            return;
        }
        WifiSetupHostActivity wifiSetupHostActivity3 = (WifiSetupHostActivity) c2();
        m.c(wifiSetupHostActivity3);
        wifiSetupHostActivity3.o2(wiFiSSID);
    }

    private final com.apptionlabs.meater_app.qsg.ui.wifisetup.c W2() {
        return (com.apptionlabs.meater_app.qsg.ui.wifisetup.c) this.wifiSetUpViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(WifiSetUpConnectingFragment wifiSetUpConnectingFragment, View view) {
        m.f(wifiSetUpConnectingFragment, "this$0");
        l0.H(wifiSetUpConnectingFragment.Y(), i6.c.INSTANCE.j());
    }

    private final void Y2() {
        A2().f8513k0.setText(A0(2132018956));
        A2().f8512j0.setText(A0(2132018955));
        LottieAnimationView lottieAnimationView = A2().Q;
        WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) S();
        m.c(wifiSetupHostActivity);
        lottieAnimationView.setAnimation(wifiSetupHostActivity.w2());
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        g6.d.j(materialButton);
        AppCompatTextView appCompatTextView = A2().f8516n0;
        m.e(appCompatTextView, "whyDoINeed");
        g6.d.j(appCompatTextView);
        A2().f8516n0.setText(A0(2132018954));
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: k7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetUpConnectingFragment.Z2(WifiSetUpConnectingFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(WifiSetUpConnectingFragment wifiSetUpConnectingFragment, View view) {
        m.f(wifiSetUpConnectingFragment, "this$0");
        l0.H(wifiSetUpConnectingFragment.Y(), i6.c.INSTANCE.j());
    }

    private final void a3() {
        A2().f8513k0.setText(A0(2132018831));
        A2().f8512j0.setText(A0(2132018601));
        LottieAnimationView lottieAnimationView = A2().Q;
        WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) S();
        m.c(wifiSetupHostActivity);
        lottieAnimationView.setAnimation(wifiSetupHostActivity.w2());
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.j(progressBar);
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        g6.d.g(materialButton);
        AppCompatTextView appCompatTextView = A2().f8516n0;
        m.e(appCompatTextView, "whyDoINeed");
        g6.d.g(appCompatTextView);
    }

    private final void b3(String str, String str2, int i10, int i11, final WiFiSSID wiFiSSID) {
        e0.Companion companion = e0.INSTANCE;
        androidx.fragment.app.s c22 = c2();
        m.e(c22, "requireActivity(...)");
        String A0 = A0(i10);
        m.e(A0, "getString(...)");
        e0.AlertPair alertPair = new e0.AlertPair(A0, new e() { // from class: k7.h
            @Override // j6.e
            public final void a() {
                WifiSetUpConnectingFragment.c3(WifiSetUpConnectingFragment.this, wiFiSSID);
            }
        });
        String A02 = A0(i11);
        m.e(A02, "getString(...)");
        companion.e(c22, str, str2, false, alertPair, new e0.AlertPair(A02, new e() { // from class: k7.i
            @Override // j6.e
            public final void a() {
                WifiSetUpConnectingFragment.d3();
            }
        }), null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(WifiSetUpConnectingFragment wifiSetUpConnectingFragment, WiFiSSID wiFiSSID) {
        m.f(wifiSetUpConnectingFragment, "this$0");
        m.f(wiFiSSID, "$selectedSSID");
        wifiSetUpConnectingFragment.V2(wiFiSSID, true);
    }

    private final void e3(String str, String str2, int i10, int i11, final WiFiSSID wiFiSSID) {
        e0.Companion companion = e0.INSTANCE;
        androidx.fragment.app.s c22 = c2();
        m.e(c22, "requireActivity(...)");
        String A0 = A0(i10);
        m.e(A0, "getString(...)");
        e0.AlertPair alertPair = new e0.AlertPair(A0, new e() { // from class: k7.k
            @Override // j6.e
            public final void a() {
                WifiSetUpConnectingFragment.f3(WifiSetUpConnectingFragment.this, wiFiSSID);
            }
        });
        String A02 = A0(i11);
        m.e(A02, "getString(...)");
        companion.e(c22, str, str2, false, alertPair, new e0.AlertPair(A02, new e() { // from class: k7.l
            @Override // j6.e
            public final void a() {
                WifiSetUpConnectingFragment.g3();
            }
        }), null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(WifiSetUpConnectingFragment wifiSetUpConnectingFragment, WiFiSSID wiFiSSID) {
        m.f(wifiSetUpConnectingFragment, "this$0");
        m.f(wiFiSSID, "$selectedSSID");
        wifiSetUpConnectingFragment.V2(wiFiSSID, true);
    }

    private final void h3() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.noNetworkListHandler = handler;
        handler.postDelayed(new Runnable() { // from class: k7.f
            @Override // java.lang.Runnable
            public final void run() {
                WifiSetUpConnectingFragment.i3(WifiSetUpConnectingFragment.this);
            }
        }, Config.MC_STATS_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(WifiSetUpConnectingFragment wifiSetUpConnectingFragment) {
        m.f(wifiSetUpConnectingFragment, "this$0");
        wifiSetUpConnectingFragment.Y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(WifiSetUpConnectingFragment wifiSetUpConnectingFragment, View view) {
        m.f(wifiSetUpConnectingFragment, "this$0");
        Handler handler = wifiSetUpConnectingFragment.noNetworkListHandler;
        if (handler != null && handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        wifiSetUpConnectingFragment.a3();
        wifiSetUpConnectingFragment.h3();
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
        A2().f8508f0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        LottieAnimationView lottieAnimationView = A2().Q;
        WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) S();
        m.c(wifiSetupHostActivity);
        lottieAnimationView.setAnimation(wifiSetupHostActivity.w2());
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.j(progressBar);
        AppCompatTextView appCompatTextView = A2().f8516n0;
        m.e(appCompatTextView, "whyDoINeed");
        g6.d.g(appCompatTextView);
        A2().f8504b0.setLayoutManager(new LinearLayoutManager(e2()));
        this.wifiNetworkList = new ArrayList<>();
        this.networkListAdapter = new x0(e2());
        RecyclerView recyclerView = A2().f8504b0;
        x0 x0Var = this.networkListAdapter;
        x0 x0Var2 = null;
        if (x0Var == null) {
            m.t("networkListAdapter");
            x0Var = null;
        }
        recyclerView.setAdapter(x0Var);
        x0 x0Var3 = this.networkListAdapter;
        if (x0Var3 == null) {
            m.t("networkListAdapter");
            x0Var3 = null;
        }
        ArrayList<WiFiSSID> arrayList = this.wifiNetworkList;
        if (arrayList == null) {
            m.t("wifiNetworkList");
            arrayList = null;
        }
        x0Var3.N(arrayList);
        x0 x0Var4 = this.networkListAdapter;
        if (x0Var4 == null) {
            m.t("networkListAdapter");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.M(this);
    }

    @Override // e7.b
    public void H2() {
        A2().f8512j0.setText(A0(2132018601));
    }

    @Override // e7.b
    public void I2() {
        a3();
        h3();
    }

    @Override // j6.s
    public void K(WiFiSSID wiFiSSID) {
        m.f(wiFiSSID, "selectedSSID");
        Object systemService = com.apptionlabs.meater_app.app.a.i().getApplicationContext().getSystemService("wifi");
        m.d(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        if (!((WifiManager) systemService).isWifiEnabled()) {
            String A0 = A0(2132018327);
            m.e(A0, "getString(...)");
            String A02 = A0(2132018326);
            m.e(A02, "getString(...)");
            e3(A0, A02, 2132017539, 2132018611, wiFiSSID);
            return;
        }
        Integer rssi = wiFiSSID.getRSSI();
        m.e(rssi, "getRSSI(...)");
        if (rssi.intValue() < v.a.AVERAGE.r()) {
            String A03 = A0(2132018962);
            m.e(A03, "getString(...)");
            String r10 = l0.r(S(), "\n", 2132018960, 2132018961);
            m.e(r10, "getStrings(...)");
            e3(A03, r10, 2132017488, 2132017405, wiFiSSID);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            h0 h0Var = h0.a;
            Locale locale = Locale.US;
            String A04 = A0(2132018836);
            m.e(A04, "getString(...)");
            String format = String.format(locale, A04, Arrays.copyOf(new Object[]{q0.N(wiFiSSID.getName().L())}, 1));
            m.e(format, "format(locale, format, *args)");
            b3("", format, 2132018978, 2132018306, wiFiSSID);
            return;
        }
        V2(wiFiSSID, false);
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132018850));
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        g6.d.g(materialButton);
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: k7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetUpConnectingFragment.j3(WifiSetUpConnectingFragment.this, view);
            }
        });
    }

    @Override // j6.w
    public void i(String str) {
        m.f(str, "WifiName");
        if (this.screenState == a.f9889q) {
            WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) c2();
            if (wifiSetupHostActivity != null) {
                wifiSetupHostActivity.r2();
            }
            if (K0()) {
                W2().f9923g = null;
            }
        }
    }

    @Override // j6.w
    public void v(ArrayList<WiFiSSID> arrayList, ArrayList<WiFiSSID> arrayList2) {
        m.f(arrayList, "recommendedNetworks");
        m.f(arrayList2, "foundNetworks");
        if (arrayList2.isEmpty()) {
            return;
        }
        Handler handler = this.noNetworkListHandler;
        x0 x0Var = null;
        if (handler != null && handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        A2().f8513k0.setText(A0(2132018296));
        A2().f8512j0.setText(A0(2132018297));
        ProgressBar progressBar = A2().f8503a0;
        m.e(progressBar, "mainProgress");
        g6.d.g(progressBar);
        RecyclerView recyclerView = A2().f8504b0;
        m.e(recyclerView, "nearByDevices");
        g6.d.j(recyclerView);
        LottieAnimationView lottieAnimationView = A2().Q;
        m.e(lottieAnimationView, "animationView");
        g6.d.g(lottieAnimationView);
        ProgressBar progressBar2 = A2().Z;
        m.e(progressBar2, "loading");
        g6.d.g(progressBar2);
        AppCompatTextView appCompatTextView = A2().f8516n0;
        m.e(appCompatTextView, "whyDoINeed");
        g6.d.j(appCompatTextView);
        A2().f8516n0.setText(A0(2132018952));
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: k7.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiSetUpConnectingFragment.X2(WifiSetUpConnectingFragment.this, view);
            }
        });
        this.wifiNetworkList = arrayList2;
        x0 x0Var2 = this.networkListAdapter;
        if (x0Var2 == null) {
            m.t("networkListAdapter");
            x0Var2 = null;
        }
        ArrayList<WiFiSSID> arrayList3 = this.wifiNetworkList;
        if (arrayList3 == null) {
            m.t("wifiNetworkList");
            arrayList3 = null;
        }
        x0Var2.N(arrayList3);
        x0 x0Var3 = this.networkListAdapter;
        if (x0Var3 == null) {
            m.t("networkListAdapter");
        } else {
            x0Var = x0Var3;
        }
        x0Var.n();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (this.screenState == a.f9889q) {
            WifiSetupHostActivity wifiSetupHostActivity = (WifiSetupHostActivity) c2();
            if (wifiSetupHostActivity != null) {
                wifiSetupHostActivity.setupScreenCallBack = this;
            }
            if (K0()) {
                W2().f9923g = null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        this.currentScreenVisible = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        this.currentScreenVisible = true;
        Handler handler = this.noNetworkListHandler;
        if (handler != null && handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3() {
    }

    @Override // e7.b
    public void M2() {
    }

    @Override // e7.b
    public void y2() {
    }
}
