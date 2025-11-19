package C5;

import B5.w;
import B5.y;
import J4.z0;
import L4.C1397q0;
import N.WindowSizeClass;
import T4.v;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.E;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.Appliance;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareActivity;
import com.apptionlabs.meater_app.targets.c;
import com.apptionlabs.meater_app.views.C2421z;
import com.apptionlabs.meater_app.views.ProbeConnectionStatusView;
import com.apptionlabs.meater_app.views.X;
import d.ActivityC3006j;
import g.AbstractC3371c;
import g.C3369a;
import g.InterfaceC3370b;
import h.C3469d;
import java.util.List;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3857n;
import kotlin.jvm.internal.P;
import kotlin.m1;
import kotlin.x1;
import o4.Setup;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4160e;
import oa.InterfaceC4164i;
import w5.InterfaceC4999c;

/* compiled from: ProbeSelectionStepView.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001_B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0004J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR0\u0010]\u001a\u0010\u0012\f\u0012\n V*\u0004\u0018\u00010U0U0T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006c²\u0006\u0012\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`8\nX\u008a\u0084\u0002"}, d2 = {"LC5/r;", "LC5/d;", "LT4/d;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "e3", "(Landroid/view/View;)V", "l3", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "i3", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "n3", "m3", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "v1", "q1", "", "showDialog", "Lcom/apptionlabs/meater_app/data/Appliance;", "appliance", "z", "(ZLcom/apptionlabs/meater_app/data/Appliance;)V", "Landroidx/fragment/app/n;", "M0", "Landroidx/fragment/app/n;", "dialog", "LL4/q0;", "N0", "LL4/q0;", "binding", "LA5/m;", "O0", "Loa/i;", "C2", "()LA5/m;", "viewModel", "P0", "Z", "isFirstLoad", "Landroid/os/Handler;", "Q0", "Landroid/os/Handler;", "startScanBLEHandler", "Lcom/apptionlabs/meater_app/targets/c;", "R0", "Lcom/apptionlabs/meater_app/targets/c;", "applianceDialog", "Lcom/apptionlabs/meater_app/model/Probe;", "S0", "Lcom/apptionlabs/meater_app/model/Probe;", "applianceProbe", "Landroid/widget/FrameLayout;", "T0", "Landroid/widget/FrameLayout;", "frameLayout", "LT4/k;", "U0", "LT4/k;", "emptyViewListener", "LT4/v;", "V0", "LT4/v;", "probeListClickListener", "Lw5/g;", "W0", "Lw5/g;", "setupCookConfirmedListener", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "X0", "Lg/c;", "getQsgLauncher", "()Lg/c;", "setQsgLauncher", "(Lg/c;)V", "qsgLauncher", "Y0", "a", "", "", "dashboardInfoList", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class r extends C5.d implements T4.d {

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: Z0, reason: collision with root package name */
    public static final int f2220Z0 = 8;

    /* renamed from: a1, reason: collision with root package name */
    private static InterfaceC4999c f2221a1;

    /* renamed from: b1, reason: collision with root package name */
    private static w5.d f2222b1;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private androidx.fragment.app.n dialog;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private C1397q0 binding;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    private com.apptionlabs.meater_app.targets.c applianceDialog;

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata */
    private Probe applianceProbe;

    /* renamed from: T0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private AbstractC3371c<Intent> qsgLauncher;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new h(this, null, new g(this), null, null));

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata */
    private boolean isFirstLoad = true;

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata */
    private final Handler startScanBLEHandler = new Handler(Looper.getMainLooper());

    /* renamed from: U0, reason: collision with root package name and from kotlin metadata */
    private final T4.k emptyViewListener = new b();

    /* renamed from: V0, reason: collision with root package name and from kotlin metadata */
    private final v probeListClickListener = new d();

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    private final w5.g setupCookConfirmedListener = new f();

    /* compiled from: ProbeSelectionStepView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LC5/r$a;", "", "<init>", "()V", "Lw5/c;", "probeSelectionListener", "Lw5/d;", "recipeDeviceViewSelectionListener", "LC5/r;", "a", "(Lw5/c;Lw5/d;)LC5/r;", "superProbeSelectionListener", "Lw5/c;", "superViewSelectionListener", "Lw5/d;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C5.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final r a(InterfaceC4999c probeSelectionListener, w5.d recipeDeviceViewSelectionListener) {
            C3862t.g(probeSelectionListener, "probeSelectionListener");
            C3862t.g(recipeDeviceViewSelectionListener, "recipeDeviceViewSelectionListener");
            r rVar = new r();
            r.f2221a1 = probeSelectionListener;
            r.f2222b1 = recipeDeviceViewSelectionListener;
            return rVar;
        }

        private Companion() {
        }
    }

    /* compiled from: ProbeSelectionStepView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"C5/r$b", "LT4/k;", "", "shouldShow", "Loa/F;", "a", "(Z)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements T4.k {
        b() {
        }

        @Override // T4.k
        public void a(boolean shouldShow) {
            U4.b.t("ShowEmptyView : " + shouldShow, new Object[0]);
            C1397q0 c1397q0 = null;
            if (shouldShow) {
                w5.d dVar = r.f2222b1;
                if (dVar == null) {
                    C3862t.u("superViewSelectionListener");
                    dVar = null;
                }
                dVar.a();
                C1397q0 c1397q02 = r.this.binding;
                if (c1397q02 == null) {
                    C3862t.u("binding");
                    c1397q02 = null;
                }
                ConstraintLayout noPairedDeviceHolder = c1397q02.f10438l;
                C3862t.f(noPairedDeviceHolder, "noPairedDeviceHolder");
                Q4.l.j(noPairedDeviceHolder);
                C1397q0 c1397q03 = r.this.binding;
                if (c1397q03 == null) {
                    C3862t.u("binding");
                } else {
                    c1397q0 = c1397q03;
                }
                ComposeView cardList = c1397q0.f10429c;
                C3862t.f(cardList, "cardList");
                Q4.l.g(cardList);
                return;
            }
            w5.d dVar2 = r.f2222b1;
            if (dVar2 == null) {
                C3862t.u("superViewSelectionListener");
                dVar2 = null;
            }
            dVar2.b();
            C1397q0 c1397q04 = r.this.binding;
            if (c1397q04 == null) {
                C3862t.u("binding");
                c1397q04 = null;
            }
            ConstraintLayout noPairedDeviceHolder2 = c1397q04.f10438l;
            C3862t.f(noPairedDeviceHolder2, "noPairedDeviceHolder");
            Q4.l.g(noPairedDeviceHolder2);
            C1397q0 c1397q05 = r.this.binding;
            if (c1397q05 == null) {
                C3862t.u("binding");
            } else {
                c1397q0 = c1397q05;
            }
            ComposeView cardList2 = c1397q0.f10429c;
            C3862t.f(cardList2, "cardList");
            Q4.l.j(cardList2);
        }
    }

    /* compiled from: ProbeSelectionStepView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Ba.p<InterfaceC1554l, Integer, C4153F> {
        c() {
        }

        private static final List<Object> b(x1<? extends List<? extends Object>> x1Var) {
            return x1Var.getValue();
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1750292567, i10, -1, "com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.ProbeSelectionStepView.initView.<anonymous> (ProbeSelectionStepView.kt:129)");
            }
            androidx.fragment.app.o oVarC2 = r.this.c2();
            C3862t.f(oVarC2, "requireActivity(...)");
            WindowSizeClass windowSizeClassA = N.a.a(oVarC2, interfaceC1554l, 0);
            androidx.fragment.app.o oVarC22 = r.this.c2();
            C3862t.f(oVarC22, "requireActivity(...)");
            z0.i0(windowSizeClassA, J6.a.a(oVarC22, interfaceC1554l, 0), U0.h.u(16), b(m1.b(r.this.C2().Q0(), null, interfaceC1554l, 0, 1)), r.this.C2(), r.this.probeListClickListener, null, interfaceC1554l, 1573248, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: ProbeSelectionStepView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"C5/r$d", "LT4/v;", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements v {
        d() {
        }

        @Override // T4.v
        public void a(Probe probe) {
            C3862t.g(probe, "probe");
            r.this.applianceProbe = probe;
            if (probe.getConnectionState() == DeviceConnectionState.CONNECTED) {
                if (!probe.getMEATERDeviceType().isG2Probe() || r.this.C2().z().getAppliance() != o4.r.f46515F) {
                    r.this.l3();
                    return;
                }
                com.apptionlabs.meater_app.targets.c cVar = r.this.applianceDialog;
                if (cVar == null) {
                    C3862t.u("applianceDialog");
                    cVar = null;
                }
                cVar.N2(r.this.c2().w0(), "safetyDialog");
            }
        }
    }

    /* compiled from: ProbeSelectionStepView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements E, InterfaceC3857n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Ba.l f2238a;

        e(Ba.l function) {
            C3862t.g(function, "function");
            this.f2238a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC3857n
        public final InterfaceC4160e<?> a() {
            return this.f2238a;
        }

        @Override // android.view.E
        public final /* synthetic */ void b(Object obj) {
            this.f2238a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof E) && (obj instanceof InterfaceC3857n)) {
                return C3862t.b(a(), ((InterfaceC3857n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* compiled from: ProbeSelectionStepView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"C5/r$f", "Lw5/g;", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements w5.g {
        f() {
        }

        @Override // w5.g
        public void a(Probe probe) {
            C3862t.g(probe, "probe");
            InterfaceC4999c interfaceC4999c = r.f2221a1;
            if (interfaceC4999c == null) {
                C3862t.u("superProbeSelectionListener");
                interfaceC4999c = null;
            }
            interfaceC4999c.a(probe);
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class g implements Ba.a<androidx.fragment.app.o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2239B;

        public g(Fragment fragment) {
            this.f2239B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o invoke() {
            return this.f2239B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class h implements Ba.a<A5.m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2240B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f2241C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f2242D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f2243E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f2244F;

        public h(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f2240B = fragment;
            this.f2241C = aVar;
            this.f2242D = aVar2;
            this.f2243E = aVar3;
            this.f2244F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [A5.m, androidx.lifecycle.Y] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A5.m invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f2240B;
            dd.a aVar3 = this.f2241C;
            Ba.a aVar4 = this.f2242D;
            Ba.a aVar5 = this.f2243E;
            Ba.a aVar6 = this.f2244F;
            c0 c0Var = (c0) aVar4.invoke();
            b0 b0VarV = c0Var.v();
            if (aVar5 == null || (aVar2 = (Q1.a) aVar5.invoke()) == null) {
                ActivityC3006j activityC3006j = c0Var instanceof ActivityC3006j ? (ActivityC3006j) c0Var : null;
                if (activityC3006j != null) {
                    aVarM = activityC3006j.m();
                } else {
                    aVarM = fragment.m();
                    C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
                }
                aVar = aVarM;
            } else {
                aVar = aVar2;
            }
            return ld.b.b(P.b(A5.m.class), b0VarV, (4 & 4) != 0 ? null : null, aVar, (4 & 16) != 0 ? null : aVar3, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar6);
        }
    }

    public r() {
        AbstractC3371c<Intent> abstractC3371cA2 = a2(new C3469d(), new InterfaceC3370b() { // from class: C5.q
            @Override // g.InterfaceC3370b
            public final void a(Object obj) {
                r.h3((C3369a) obj);
            }
        });
        C3862t.f(abstractC3371cA2, "registerForActivityResult(...)");
        this.qsgLauncher = abstractC3371cA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A5.m C2() {
        return (A5.m) this.viewModel.getValue();
    }

    private final void e3(View view) {
        c.Companion aVar = com.apptionlabs.meater_app.targets.c.INSTANCE;
        String strA0 = A0(R.string.charcoal_grill);
        C3862t.f(strA0, "getString(...)");
        String strA02 = A0(R.string.safety_information_body);
        C3862t.f(strA02, "getString(...)");
        com.apptionlabs.meater_app.targets.c cVarB = aVar.b(new Appliance(R.drawable.charcoal_grill, strA0, strA02, true, o4.r.f46515F));
        this.applianceDialog = cVarB;
        FrameLayout frameLayout = null;
        if (cVarB == null) {
            C3862t.u("applianceDialog");
            cVarB = null;
        }
        cVarB.X2(this);
        n3();
        C1397q0 c1397q0 = this.binding;
        if (c1397q0 == null) {
            C3862t.u("binding");
            c1397q0 = null;
        }
        c1397q0.f10429c.setContent(W.c.b(1750292567, true, new c()));
        C5.d.INSTANCE.b(this.setupCookConfirmedListener);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            C3862t.u("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(r rVar) {
        if (rVar.isFirstLoad) {
            rVar.isFirstLoad = false;
        } else {
            rVar.m3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F g3(r rVar, Boolean bool) {
        T4.k kVar = rVar.emptyViewListener;
        C3862t.d(bool);
        kVar.a(bool.booleanValue());
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(C3369a c3369a) {
        Log.info("ProbeSelectionStepView", "Coming from QSG ");
    }

    private final void i3(final MEATERDevice device) {
        Button button;
        int deviceName = device.getMEATERDeviceType().getDeviceName();
        boolean zMustFirmwareUpdate = device.mustFirmwareUpdate();
        String strA0 = zMustFirmwareUpdate ? A0(R.string.sofware_update_meater_plus_heading) : B0(R.string.update_your_meater, A0(deviceName));
        C3862t.d(strA0);
        String strB0 = zMustFirmwareUpdate ? B0(R.string.software_update_text, A0(deviceName)) : A0(R.string.update_your_meater_block_text);
        C3862t.d(strB0);
        C2421z.Companion companion = C2421z.INSTANCE;
        androidx.fragment.app.o oVarC2 = c2();
        C3862t.f(oVarC2, "requireActivity(...)");
        String strA02 = A0(R.string.update_now);
        C3862t.f(strA02, "getString(...)");
        C2421z.AlertPair alertPair = new C2421z.AlertPair(strA02, new T4.e() { // from class: C5.k
            @Override // T4.e
            public final void a() {
                r.j3(this.f2213a, device);
            }
        });
        String strA03 = A0(R.string.later_label);
        C3862t.f(strA03, "getString(...)");
        AlertDialog alertDialogF = C2421z.Companion.f(companion, oVarC2, strA0, strB0, false, alertPair, new C2421z.AlertPair(strA03, new T4.e() { // from class: C5.l
            @Override // T4.e
            public final void a() {
                r.k3();
            }
        }), null, 64, null);
        if (device.mustFirmwareUpdate() && (button = alertDialogF.getButton(-2)) != null) {
            button.setVisibility(8);
        }
        alertDialogF.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(r rVar, MEATERDevice mEATERDevice) {
        Intent intent = new Intent(rVar.c2(), (Class<?>) FirmwareActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getParentDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.QSG_SHOW_FIRMWARE_UPDATE);
        rVar.t2(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3() {
        C2316d.f31025e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3() {
        String recommendedTemperature;
        A5.m mVarC2 = C2();
        MEATERDevice mEATERDevice = this.applianceProbe;
        Probe probe = null;
        if (mEATERDevice == null) {
            C3862t.u("applianceProbe");
            mEATERDevice = null;
        }
        if (mVarC2.E0(mEATERDevice)) {
            Probe probe2 = this.applianceProbe;
            if (probe2 == null) {
                C3862t.u("applianceProbe");
            } else {
                probe = probe2;
            }
            i3(probe);
            return;
        }
        Probe probe3 = this.applianceProbe;
        if (probe3 == null) {
            C3862t.u("applianceProbe");
        } else {
            probe = probe3;
        }
        Probe probeM4clone = probe.m4clone();
        Setup recipeSetup = C2().getRecipeSetup();
        if (recipeSetup == null || (recommendedTemperature = recipeSetup.getRecommendedTemperature()) == null) {
            return;
        }
        C2().R1(recommendedTemperature);
        C3862t.d(probeM4clone);
        K2(probeM4clone, true);
    }

    private final void m3() {
        this.startScanBLEHandler.removeCallbacksAndMessages(null);
        MeaterLinkService meaterLinkServiceE = MeaterLinkService.e();
        if (meaterLinkServiceE != null) {
            meaterLinkServiceE.i(false);
        }
    }

    private final void n3() {
        U4.b.t("Update No Paired Text", new Object[0]);
        C1397q0 c1397q0 = this.binding;
        C1397q0 c1397q02 = null;
        if (c1397q0 == null) {
            C3862t.u("binding");
            c1397q0 = null;
        }
        c1397q0.f10439m.setText(A0(R.string.select_device_no_device_error_message));
        C1397q0 c1397q03 = this.binding;
        if (c1397q03 == null) {
            C3862t.u("binding");
            c1397q03 = null;
        }
        c1397q03.f10428b.setText(A0(R.string.add_a_device));
        C1397q0 c1397q04 = this.binding;
        if (c1397q04 == null) {
            C3862t.u("binding");
            c1397q04 = null;
        }
        TextView textView = c1397q04.f10440n;
        C1397q0 c1397q05 = this.binding;
        if (c1397q05 == null) {
            C3862t.u("binding");
            c1397q05 = null;
        }
        textView.setPaintFlags(c1397q05.f10440n.getPaintFlags() | 8);
        C1397q0 c1397q06 = this.binding;
        if (c1397q06 == null) {
            C3862t.u("binding");
            c1397q06 = null;
        }
        c1397q06.f10428b.setOnClickListener(new View.OnClickListener() { // from class: C5.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.o3(this.f2217B, view);
            }
        });
        C1397q0 c1397q07 = this.binding;
        if (c1397q07 == null) {
            C3862t.u("binding");
        } else {
            c1397q02 = c1397q07;
        }
        c1397q02.f10440n.setOnClickListener(new View.OnClickListener() { // from class: C5.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.p3(this.f2218B, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(r rVar, View view) {
        X.f32816z = true;
        Intent intent = new Intent(rVar.c2(), (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
        rVar.qsgLauncher.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(r rVar, View view) {
        if (rVar.u0().getBoolean(R.bool.is_tablet)) {
            y yVarB = y.Companion.b(y.INSTANCE, rVar.C2().L0(), K4.a.f8678a.h(rVar.C2().getOnGoingRecipeId()), rVar.C2().z(), rVar.C2().getProbeID(), null, 16, null);
            rVar.dialog = yVarB;
            if (yVarB != null) {
                yVarB.N2(rVar.Y(), "dialog");
                return;
            }
            return;
        }
        w wVarB = w.Companion.b(w.INSTANCE, rVar.C2().L0(), K4.a.f8678a.h(rVar.C2().getOnGoingRecipeId()), rVar.C2().z(), rVar.C2().getProbeID(), null, 16, null);
        rVar.dialog = wVarB;
        if (wVarB != null) {
            wVarB.N2(rVar.Y(), "dialog");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        C1397q0 c1397q0C = C1397q0.c(inflater, frameLayout, false);
        this.binding = c1397q0C;
        if (c1397q0C == null) {
            C3862t.u("binding");
            c1397q0C = null;
        }
        ConstraintLayout constraintLayoutB = c1397q0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        e3(constraintLayoutB);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        C3862t.u("frameLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FrameLayout frameLayout = this.frameLayout;
        C1397q0 c1397q0 = null;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        C1397q0 c1397q0C = C1397q0.c((LayoutInflater) systemService, null, false);
        this.binding = c1397q0C;
        if (c1397q0C == null) {
            C3862t.u("binding");
        } else {
            c1397q0 = c1397q0C;
        }
        ConstraintLayout constraintLayoutB = c1397q0.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        e3(constraintLayoutB);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        ProbeConnectionStatusView.f();
        C2().L1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        C2().J1();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: C5.m
            @Override // java.lang.Runnable
            public final void run() {
                r.f3(this.f2215B);
            }
        }, 50L);
        ProbeConnectionStatusView.e();
    }

    @Override // T4.d
    public void z(boolean showDialog, Appliance appliance) {
        C3862t.g(appliance, "appliance");
        l3();
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        C2().a1().h(F0(), new e(new Ba.l() { // from class: C5.n
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return r.g3(this.f2216B, (Boolean) obj);
            }
        }));
    }
}
