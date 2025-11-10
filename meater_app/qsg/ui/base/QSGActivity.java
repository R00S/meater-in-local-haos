package com.apptionlabs.meater_app.qsg.ui.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.ComponentActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.a0;
import android.view.s0;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.OrientationActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.versions.AppVersion;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.versions.VersionNodeApp;
import com.apptionlabs.meater_app.versions.Versions;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import f8.j;
import f8.z;
import ih.o;
import ih.u;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import rk.l0;
import rk.o0;
import vh.l;
import wh.d0;
import wh.m;
import y5.k;

/* compiled from: QSGActivity.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/base/QSGActivity;", "Lcom/apptionlabs/meater_app/activities/OrientationActivity;", "Lih/u;", "O0", "", "flagToChangePreference", "R0", "U0", "T0", "S0", "P0", "M0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Q0", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onResume", "onStart", "onStop", "Lh3/o;", "S", "Lh3/o;", "navController", "Landroidx/navigation/fragment/NavHostFragment;", "T", "Landroidx/navigation/fragment/NavHostFragment;", "navHost", "Lg7/l0;", "U", "Lih/g;", "N0", "()Lg7/l0;", "viewModel", "Landroid/content/BroadcastReceiver;", "V", "Landroid/content/BroadcastReceiver;", "mlBroadcastReceiver", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class QSGActivity extends OrientationActivity {

    /* renamed from: S, reason: from kotlin metadata */
    private o navController;

    /* renamed from: T, reason: from kotlin metadata */
    private NavHostFragment navHost;

    /* renamed from: U, reason: from kotlin metadata */
    private final ih.g viewModel = new s0(d0.b(l0.class), new h(this), new g(this, null, null, bm.a.a(this)));

    /* renamed from: V, reason: from kotlin metadata */
    private final BroadcastReceiver mlBroadcastReceiver = new d();

    /* compiled from: QSGActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9763a;

        static {
            int[] iArr = new int[w6.d.values().length];
            try {
                iArr[w6.d.N.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.d.L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.d.f19373s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.d.f19374t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9763a = iArr;
        }
    }

    /* compiled from: QSGActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/base/QSGActivity$b", "Ly5/k$b;", "Lcom/apptionlabs/meater_app/versions/Versions;", "versions", "Ljava/nio/ByteBuffer;", "firmwarePlus", "firmwarePlusSE", "firmwarePlusV2", "firmwareBlock", "firmwareBlockV2", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements k.b {
        b() {
        }

        @Override // y5.k.b
        public void a(Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) {
            VersionNodeApp versionNodeApp;
            VersionNodeApp versionNodeApp2;
            String str;
            if (versions != null) {
                versionNodeApp = versions.app;
            } else {
                versionNodeApp = null;
            }
            if (versionNodeApp != null && (str = (versionNodeApp2 = versions.app).version) != null) {
                AppVersion.appVersionCheck(QSGActivity.this, str, versionNodeApp2.permittedSkips);
                k6.b.x("[versions] Main onFetchVersionInformation", versions.toString());
                FirmwareVersion.sharedInstance().setVersions(versions, byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5);
                j.j(QSGActivity.this, versions, byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5);
                return;
            }
            k6.b.x("[versions] Main onFetchVersionInformation, versions or lastestAppVersion was null from server", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QSGActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "flag", "Lih/u;", "b", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends wh.o implements l<Boolean, u> {
        c() {
            super(1);
        }

        public final void b(Boolean bool) {
            m.c(bool);
            if (bool.booleanValue()) {
                QSGActivity.this.S0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Boolean) obj);
            return u.a;
        }
    }

    /* compiled from: QSGActivity.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/base/QSGActivity$d", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lih/u;", "onReceive", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends BroadcastReceiver {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(QSGActivity qSGActivity) {
            m.f(qSGActivity, "this$0");
            f8.l0.H(qSGActivity, "https://support.meater.com/helper?how-can-we-help=product-support&which-product-type=gen-two&meater-2-plus-help=my-meater-2-plus-not-working&meater-2-plus-help=meater-2-plus-damaged&webform");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            m.f(context, "context");
            m.f(intent, "intent");
            if (!m.a(intent.getAction(), MEATERIntent.INTENT_UNSUPPORTED_DEVICE) || b1.B || QSGActivity.this.isFinishing()) {
                return;
            }
            b1.B = true;
            e0.Companion companion = e0.INSTANCE;
            final QSGActivity qSGActivity = QSGActivity.this;
            companion.e(qSGActivity, "", "Failed to connect to device. Please contact MEATER Customer Support, quoting reference 23ACM.", false, new e0.AlertPair("Contact Customer Support", new j6.e() { // from class: e7.c
                @Override // j6.e
                public final void a() {
                    QSGActivity.d.b(QSGActivity.this);
                }
            }), null, null).show();
        }
    }

    /* compiled from: QSGActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/base/QSGActivity$e", "Landroidx/activity/o;", "Lih/u;", "d", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends android.view.o {
        e() {
            super(true);
        }

        @Override // android.view.o
        public void d() {
            QSGActivity.this.Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QSGActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class f implements a0, wh.h {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f9768a;

        f(l lVar) {
            m.f(lVar, "function");
            this.f9768a = lVar;
        }

        public final ih.c<?> a() {
            return this.f9768a;
        }

        @Override // android.view.a0
        public final /* synthetic */ void d(Object obj) {
            this.f9768a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a0) || !(obj instanceof wh.h)) {
                return false;
            }
            return m.a(a(), ((wh.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* compiled from: ActivityVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class g extends wh.o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w0 f9769q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9770r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9771s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9772t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w0 w0Var, tm.a aVar, vh.a aVar2, vm.a aVar3) {
            super(0);
            this.f9769q = w0Var;
            this.f9770r = aVar;
            this.f9771s = aVar2;
            this.f9772t = aVar3;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a(this.f9769q, d0.b(l0.class), this.f9770r, this.f9771s, (vh.a) null, this.f9772t);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class h extends wh.o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f9773q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f9773q = componentActivity;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = this.f9773q.y();
            m.e(y10, "viewModelStore");
            return y10;
        }
    }

    private final void M0() {
        k.INSTANCE.k(new b());
    }

    private final l0 N0() {
        return (l0) this.viewModel.getValue();
    }

    private final void O0() {
        String str;
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra(MEATERIntent.EXTRA_TAG);
        } else {
            str = null;
        }
        if (str != null && m.a(str, MEATERIntent.QSG_SHOW_SETUP_COMPLETE)) {
            U0();
        } else {
            if (!com.apptionlabs.meater_app.app.a.u().H1()) {
                R0(false);
                return;
            }
            int i10 = a.f9763a[N0().s().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    if (P0()) {
                        R0(true);
                    } else {
                        S0();
                    }
                } else {
                    T0();
                }
            } else {
                R0(true);
            }
        }
        N0().q().g(this, new f(new c()));
    }

    private final boolean P0() {
        return N0().y();
    }

    private final void R0(boolean z10) {
        if (z10) {
            com.apptionlabs.meater_app.app.a.u().A1(false);
        } else if (N0().s() == w6.d.f19373s) {
            N0().F();
        }
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0() {
        View findViewById = findViewById(2131362547);
        m.e(findViewById, "findViewById(...)");
        g6.d.g(findViewById);
        View findViewById2 = findViewById(2131363113);
        m.e(findViewById2, "findViewById(...)");
        g6.d.j(findViewById2);
        Fragment i02 = m0().i0(2131363113);
        m.d(i02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) i02;
        this.navHost = navHostFragment;
        if (navHostFragment == null) {
            m.t("navHost");
            navHostFragment = null;
        }
        o B2 = navHostFragment.B2();
        this.navController = B2;
        if (B2 == null) {
            m.t("navController");
            B2 = null;
        }
        ih.u b10 = B2.G().b(2131820545);
        b10.d0(2131362127);
        o oVar = this.navController;
        if (oVar == null) {
            m.t("navController");
            oVar = null;
        }
        oVar.n0(b10, null);
    }

    private final void T0() {
        View findViewById = findViewById(2131362547);
        m.e(findViewById, "findViewById(...)");
        g6.d.g(findViewById);
        View findViewById2 = findViewById(2131363113);
        m.e(findViewById2, "findViewById(...)");
        g6.d.j(findViewById2);
        Fragment i02 = m0().i0(2131363113);
        m.d(i02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) i02;
        this.navHost = navHostFragment;
        if (navHostFragment == null) {
            m.t("navHost");
            navHostFragment = null;
        }
        o B2 = navHostFragment.B2();
        this.navController = B2;
        if (B2 == null) {
            m.t("navController");
            B2 = null;
        }
        ih.u b10 = B2.G().b(2131820545);
        o oVar = this.navController;
        if (oVar == null) {
            m.t("navController");
            oVar = null;
        }
        oVar.n0(b10, null);
    }

    private final void U0() {
        View findViewById = findViewById(2131363113);
        m.e(findViewById, "findViewById(...)");
        g6.d.g(findViewById);
        View findViewById2 = findViewById(2131362547);
        m.e(findViewById2, "findViewById(...)");
        g6.d.j(findViewById2);
        m0().p().v(2130772025, 2130772027).t(2131362547, o0.INSTANCE.a()).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (((ih.l) jh.o.p0((java.util.List) r0.A().getValue())).getDestination().getId() == 2131362335) goto L33;
     */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.qsg.ui.base.QSGActivity.Q0():void");
    }

    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Boolean bool;
        z.c.INSTANCE.a(this);
        super.onCreate(bundle);
        setContentView(2131558449);
        H0((Toolbar) findViewById(2131363515));
        Intent intent = getIntent();
        if (intent != null) {
            bool = Boolean.valueOf(intent.getBooleanExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, false));
        } else {
            bool = null;
        }
        if (m.a(bool, Boolean.TRUE)) {
            c6.h.f8879a.R();
            N0().C(false);
            S0();
        } else {
            O0();
        }
        getOnBackPressedDispatcher().h(this, new e());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        m.f(item, "item");
        if (item.getItemId() == 16908332) {
            Q0();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStart() {
        super.onStart();
        o oVar = this.navController;
        if (oVar != null) {
            if (oVar == null) {
                m.t("navController");
                oVar = null;
            }
            if (((List) oVar.A().getValue()).isEmpty()) {
                O0();
            }
        }
        FirmwareVersion.sharedInstance().initFromCache(this);
        z.d(null);
        M0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(MEATERIntent.INTENT_UNSUPPORTED_DEVICE);
        f8.l0.E(this, this.mlBroadcastReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        unregisterReceiver(this.mlBroadcastReceiver);
    }
}
