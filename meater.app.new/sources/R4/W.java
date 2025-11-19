package R4;

import L4.C1377g0;
import M4.h;
import P5.G;
import R4.C1682w0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.MEATERAlertActivity;
import com.apptionlabs.meater_app.activities.MeaterDetailsActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import com.apptionlabs.meater_app.views.DialComponent;
import com.apptionlabs.meater_app.views.DialViews;
import com.apptionlabs.meater_app.views.RoundedImageWithLabel;
import com.apptionlabs.meater_app.views.TemperatureView;
import com.apptionlabs.meater_app.views.connectionwarning.ConnectionLostImageOverlay;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3857n;
import oa.C4153F;
import oa.C4165j;
import oa.InterfaceC4160e;
import oa.InterfaceC4164i;
import x4.b;

/* compiled from: MeaterDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001YB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00062\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0005J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Z"}, d2 = {"LR4/W;", "LR4/a;", "Landroid/view/View$OnClickListener;", "Lcom/apptionlabs/meater_app/views/DialViews$a;", "<init>", "()V", "Loa/F;", "N2", "L2", "Lcom/apptionlabs/meater_app/model/Probe;", "updatedProbe", "P2", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "probe", "O2", "", "K2", "()Z", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "strings", "M2", "(Ljava/util/ArrayList;)V", "D2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "v1", "q1", "y1", "v", "onClick", "(Landroid/view/View;)V", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "D", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "LL4/g0;", "G0", "LL4/g0;", "E2", "()LL4/g0;", "J2", "(LL4/g0;)V", "binding", "LT5/c;", "H0", "LT5/c;", "controllerViewModel", "LP5/y;", "I0", "LP5/y;", "popup", "J0", "Lcom/apptionlabs/meater_app/model/Probe;", "LR4/w0;", "K0", "LR4/w0;", "dialog", "LT5/e;", "L0", "LT5/e;", "detailFragmentModel", "", "M0", "J", "getProbeID", "()J", "setProbeID", "(J)V", "probeID", "LT5/m;", "N0", "Loa/i;", "F2", "()LT5/m;", "viewModel", "Landroid/content/BroadcastReceiver;", "O0", "Landroid/content/BroadcastReceiver;", "mlBroadcastReceiver", "P0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class W extends AbstractC1638a implements View.OnClickListener, DialViews.a {

    /* renamed from: Q0, reason: collision with root package name */
    public static final int f14894Q0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    public C1377g0 binding;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private T5.c controllerViewModel;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private P5.y popup;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private Probe probe;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private C1682w0 dialog;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    private T5.e detailFragmentModel;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private long probeID;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.a(new Ba.a() { // from class: R4.S
        @Override // Ba.a
        public final Object invoke() {
            return W.Q2(this.f14864B);
        }
    });

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private final BroadcastReceiver mlBroadcastReceiver = new b();

    /* compiled from: MeaterDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"R4/W$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Loa/F;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C3862t.g(context, "context");
            C3862t.g(intent, "intent");
            if (C3862t.b(intent.getAction(), ProtocolParameters.MEATER_SERVICE_NOTIF_COOK_FINISH)) {
                Probe probe = W.this.probe;
                if (probe == null) {
                    C3862t.u("probe");
                    probe = null;
                }
                probe.setCookState(DeviceCookState.COOK_STATE_NOT_STARTED);
            }
        }
    }

    /* compiled from: MeaterDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R4/W$c", "LM4/h$a;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements h.a {
        c() {
        }

        @Override // M4.h.a
        public void a(MEATERDevice device) {
            C3862t.g(device, "device");
            W.this.P2(device.relatedProbe());
        }
    }

    /* compiled from: MeaterDetailsFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements android.view.E, InterfaceC3857n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Ba.l f14906a;

        d(Ba.l function) {
            C3862t.g(function, "function");
            this.f14906a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC3857n
        public final InterfaceC4160e<?> a() {
            return this.f14906a;
        }

        @Override // android.view.E
        public final /* synthetic */ void b(Object obj) {
            this.f14906a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof android.view.E) && (obj instanceof InterfaceC3857n)) {
                return C3862t.b(a(), ((InterfaceC3857n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* compiled from: MeaterDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"R4/W$e", "LR4/w0$a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements C1682w0.a {
        e() {
        }
    }

    private final void D2() {
        Fragment fragmentN0 = c2().w0().n0("dialog");
        if (fragmentN0 instanceof C1682w0) {
            C1682w0 c1682w0 = (C1682w0) fragmentN0;
            if (c1682w0.R0()) {
                c1682w0.A2();
            }
        }
    }

    private final T5.m F2() {
        return (T5.m) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F G2(W w10, ArrayList strings) {
        C3862t.g(strings, "strings");
        if (strings.size() < w10.F2().w()) {
            w10.M2(w10.F2().t());
        } else if (w10.F2().w() < strings.size()) {
            w10.F2().A(strings);
        }
        w10.F2().y().n(w10);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F H2(W w10, String str) {
        w10.N2();
        w10.F2().x().n(w10);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(W w10, View view) {
        P5.Q.G(w10.Z(), "https://support.meater.com/faqs/ambient-dash");
    }

    private final boolean K2() {
        return F2().n();
    }

    private final void L2() {
        D2();
        Probe probe = this.probe;
        if (probe == null) {
            C3862t.u("probe");
            probe = null;
        }
        if (probe.getMEATERDeviceType().isG2Probe()) {
            C1682w0 c1682w0A = C1682w0.INSTANCE.a(this.probeID);
            this.dialog = c1682w0A;
            if (c1682w0A != null) {
                c1682w0A.b3(new e());
            }
            C1682w0 c1682w0 = this.dialog;
            if (c1682w0 != null) {
                c1682w0.N2(c2().w0(), "dialog");
            }
        }
    }

    private final void M2(ArrayList<String> strings) {
        Intent intent = new Intent(Z(), (Class<?>) VideoTutorialSummaryActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_WATCH_VIDEOS, strings);
        t2(intent);
    }

    private final void N2() {
        Probe probe = this.probe;
        Probe probe2 = null;
        if (probe == null) {
            C3862t.u("probe");
            probe = null;
        }
        MeatCut meatCut = probe.getmCut();
        Bundle bundle = new Bundle();
        if (meatCut != null) {
            Integer id2 = meatCut.f31705id;
            C3862t.f(id2, "id");
            bundle.putInt(MEATERIntent.EXTRA_CUT_ID, id2.intValue());
            Probe probe3 = this.probe;
            if (probe3 == null) {
                C3862t.u("probe");
                probe3 = null;
            }
            MeatCookingTemperature cookPreset = probe3.getCookPreset();
            if (cookPreset != null) {
                Integer id3 = cookPreset.f31705id;
                C3862t.f(id3, "id");
                bundle.putInt(MEATERIntent.EXTRA_PRESET_ID, id3.intValue());
            }
        }
        Probe probe4 = this.probe;
        if (probe4 == null) {
            C3862t.u("probe");
            probe4 = null;
        }
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, probe4);
        Probe probe5 = this.probe;
        if (probe5 == null) {
            C3862t.u("probe");
        } else {
            probe2 = probe5;
        }
        bundle.putLong(MEATERIntent.EXTRA_DEVICE_ID, probe2.getDeviceID());
        Intent intent = new Intent(Z(), (Class<?>) MeaterTargetSetupActivity.class);
        intent.putExtra("bundle", bundle);
        t2(intent);
    }

    private final void O2(Probe probe) {
        ConnectionLostImageOverlay connectionLostImageOverlay = E2().f10037e;
        T5.c cVar = this.controllerViewModel;
        if (cVar == null) {
            C3862t.u("controllerViewModel");
            cVar = null;
        }
        com.apptionlabs.meater_app.views.connectionwarning.a.i(probe, connectionLostImageOverlay, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2(Probe updatedProbe) {
        if (updatedProbe != null) {
            Probe probe = this.probe;
            T5.e eVar = null;
            if (probe == null) {
                C3862t.u("probe");
                probe = null;
            }
            if (probe.getDeviceID() != updatedProbe.getDeviceID()) {
                return;
            }
            this.probe = updatedProbe;
            T5.e eVar2 = this.detailFragmentModel;
            if (eVar2 == null) {
                C3862t.u("detailFragmentModel");
                eVar2 = null;
            }
            Probe probe2 = this.probe;
            if (probe2 == null) {
                C3862t.u("probe");
                probe2 = null;
            }
            eVar2.A(probe2, Z());
            DialComponent dialComponent = E2().f10055w;
            Probe probe3 = this.probe;
            if (probe3 == null) {
                C3862t.u("probe");
                probe3 = null;
            }
            dialComponent.q(probe3);
            TemperatureView temperatureView = E2().f10053u;
            Probe probe4 = this.probe;
            if (probe4 == null) {
                C3862t.u("probe");
                probe4 = null;
            }
            temperatureView.b(probe4, O4.g.f13259B);
            TemperatureView temperatureView2 = E2().f10054v;
            Probe probe5 = this.probe;
            if (probe5 == null) {
                C3862t.u("probe");
                probe5 = null;
            }
            temperatureView2.b(probe5, O4.g.f13260C);
            TemperatureView temperatureView3 = E2().f10052t;
            Probe probe6 = this.probe;
            if (probe6 == null) {
                C3862t.u("probe");
                probe6 = null;
            }
            temperatureView3.b(probe6, O4.g.f13261D);
            RoundedImageWithLabel roundedImageWithLabel = E2().f10043k;
            if (roundedImageWithLabel != null) {
                Probe probe7 = this.probe;
                if (probe7 == null) {
                    C3862t.u("probe");
                    probe7 = null;
                }
                roundedImageWithLabel.b(probe7, RoundedImageWithLabel.a.AlertView);
            }
            RoundedImageWithLabel roundedImageWithLabel2 = E2().f10046n;
            if (roundedImageWithLabel2 != null) {
                Probe probe8 = this.probe;
                if (probe8 == null) {
                    C3862t.u("probe");
                    probe8 = null;
                }
                roundedImageWithLabel2.b(probe8, RoundedImageWithLabel.a.GraphView);
            }
            RoundedImageWithLabel roundedImageWithLabel3 = E2().f10036d;
            if (roundedImageWithLabel3 != null) {
                Probe probe9 = this.probe;
                if (probe9 == null) {
                    C3862t.u("probe");
                    probe9 = null;
                }
                roundedImageWithLabel3.b(probe9, RoundedImageWithLabel.a.CancelCookView);
            }
            Probe probe10 = this.probe;
            if (probe10 == null) {
                C3862t.u("probe");
                probe10 = null;
            }
            O2(probe10);
            Probe probe11 = this.probe;
            if (probe11 == null) {
                C3862t.u("probe");
                probe11 = null;
            }
            if (!probe11.getShouldShowAsConnected()) {
                if (T() instanceof MeaterDetailsActivity) {
                    androidx.fragment.app.o oVarT = T();
                    C3862t.e(oVarT, "null cannot be cast to non-null type com.apptionlabs.meater_app.activities.MeaterDetailsActivity");
                    long jS2 = ((MeaterDetailsActivity) oVarT).s2();
                    Probe probe12 = this.probe;
                    if (probe12 == null) {
                        C3862t.u("probe");
                        probe12 = null;
                    }
                    if (probe12.getDeviceID() == jS2) {
                        D2();
                    }
                } else {
                    D2();
                }
            }
            TemperatureView temperatureView4 = E2().f10053u;
            T5.e eVar3 = this.detailFragmentModel;
            if (eVar3 == null) {
                C3862t.u("detailFragmentModel");
                eVar3 = null;
            }
            temperatureView4.setAlpha(eVar3.h());
            TemperatureView temperatureView5 = E2().f10054v;
            T5.e eVar4 = this.detailFragmentModel;
            if (eVar4 == null) {
                C3862t.u("detailFragmentModel");
                eVar4 = null;
            }
            temperatureView5.setAlpha(eVar4.h());
            TemperatureView temperatureView6 = E2().f10052t;
            T5.e eVar5 = this.detailFragmentModel;
            if (eVar5 == null) {
                C3862t.u("detailFragmentModel");
                eVar5 = null;
            }
            temperatureView6.setAlpha(eVar5.h());
            AppCompatTextView appCompatTextView = E2().f10038f;
            T5.e eVar6 = this.detailFragmentModel;
            if (eVar6 == null) {
                C3862t.u("detailFragmentModel");
                eVar6 = null;
            }
            appCompatTextView.setAlpha(eVar6.h());
            RelativeLayout relativeLayout = E2().f10056x;
            if (relativeLayout != null) {
                T5.e eVar7 = this.detailFragmentModel;
                if (eVar7 == null) {
                    C3862t.u("detailFragmentModel");
                    eVar7 = null;
                }
                relativeLayout.setAlpha(eVar7.h());
            }
            RelativeLayout relativeLayout2 = E2().f10045m;
            if (relativeLayout2 != null) {
                T5.e eVar8 = this.detailFragmentModel;
                if (eVar8 == null) {
                    C3862t.u("detailFragmentModel");
                    eVar8 = null;
                }
                relativeLayout2.setAlpha(eVar8.j());
            }
            TextView textView = E2().f10035c;
            if (textView != null) {
                T5.e eVar9 = this.detailFragmentModel;
                if (eVar9 == null) {
                    C3862t.u("detailFragmentModel");
                    eVar9 = null;
                }
                textView.setAlpha(eVar9.j());
            }
            AppCompatTextView appCompatTextView2 = E2().f10038f;
            T5.e eVar10 = this.detailFragmentModel;
            if (eVar10 == null) {
                C3862t.u("detailFragmentModel");
                eVar10 = null;
            }
            appCompatTextView2.setText(eVar10.i());
            TextView textView2 = E2().f10035c;
            if (textView2 != null) {
                T5.e eVar11 = this.detailFragmentModel;
                if (eVar11 == null) {
                    C3862t.u("detailFragmentModel");
                    eVar11 = null;
                }
                textView2.setText(eVar11.l());
            }
            TextView textView3 = E2().f10035c;
            if (textView3 != null) {
                T5.e eVar12 = this.detailFragmentModel;
                if (eVar12 == null) {
                    C3862t.u("detailFragmentModel");
                    eVar12 = null;
                }
                textView3.setTextColor(eVar12.k());
            }
            AppCompatTextView appCompatTextView3 = E2().f10034b;
            if (appCompatTextView3 != null) {
                T5.e eVar13 = this.detailFragmentModel;
                if (eVar13 == null) {
                    C3862t.u("detailFragmentModel");
                    eVar13 = null;
                }
                appCompatTextView3.setTextColor(eVar13.k());
            }
            T5.e eVar14 = this.detailFragmentModel;
            if (eVar14 == null) {
                C3862t.u("detailFragmentModel");
                eVar14 = null;
            }
            if (eVar14.n()) {
                RelativeLayout relativeLayout3 = E2().f10056x;
                if (relativeLayout3 != null) {
                    relativeLayout3.setVisibility(0);
                }
            } else {
                RelativeLayout relativeLayout4 = E2().f10056x;
                if (relativeLayout4 != null) {
                    relativeLayout4.setVisibility(8);
                }
            }
            T5.e eVar15 = this.detailFragmentModel;
            if (eVar15 == null) {
                C3862t.u("detailFragmentModel");
            } else {
                eVar = eVar15;
            }
            if (eVar.m()) {
                AppCompatTextView appCompatTextView4 = E2().f10034b;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setVisibility(0);
                    return;
                }
                return;
            }
            AppCompatTextView appCompatTextView5 = E2().f10034b;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T5.m Q2(W w10) {
        if (w10.Z() instanceof MeaterDetailsActivity) {
            Context contextZ = w10.Z();
            C3862t.e(contextZ, "null cannot be cast to non-null type com.apptionlabs.meater_app.activities.MeaterDetailsActivity");
            MeaterDetailsActivity meaterDetailsActivity = (MeaterDetailsActivity) contextZ;
            return (T5.m) ld.b.b(kotlin.jvm.internal.P.b(T5.m.class), meaterDetailsActivity.v(), (4 & 4) != 0 ? null : null, meaterDetailsActivity.m(), (4 & 16) != 0 ? null : null, Nc.a.a(meaterDetailsActivity), (4 & 64) != 0 ? null : null);
        }
        Context contextZ2 = w10.Z();
        C3862t.e(contextZ2, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity");
        RecipeStepsActivity recipeStepsActivity = (RecipeStepsActivity) contextZ2;
        return (T5.m) ld.b.b(kotlin.jvm.internal.P.b(T5.m.class), recipeStepsActivity.v(), (4 & 4) != 0 ? null : null, recipeStepsActivity.m(), (4 & 16) != 0 ? null : null, Nc.a.a(recipeStepsActivity), (4 & 64) != 0 ? null : null);
    }

    @Override // com.apptionlabs.meater_app.views.DialViews.a
    public void D(MEATERDevice device) {
        C3862t.g(device, "device");
        com.apptionlabs.meater_app.views.h0.f32858a.d(device, T());
    }

    public final C1377g0 E2() {
        C1377g0 c1377g0 = this.binding;
        if (c1377g0 != null) {
            return c1377g0;
        }
        C3862t.u("binding");
        return null;
    }

    public final void J2(C1377g0 c1377g0) {
        C3862t.g(c1377g0, "<set-?>");
        this.binding = c1377g0;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        J2(C1377g0.c(inflater, container, false));
        View viewB = E2().b();
        C3862t.f(viewB, "getRoot(...)");
        Bundle bundleX = X();
        long j10 = bundleX != null ? bundleX.getLong("SN") : 0L;
        this.probeID = j10;
        M4.h hVar = M4.h.f11978a;
        MEATERDevice mEATERDeviceO = hVar.o(j10);
        Probe probe = null;
        Probe probe2 = mEATERDeviceO instanceof Probe ? (Probe) mEATERDeviceO : null;
        androidx.fragment.app.o oVarT = T();
        if (probe2 == null || oVarT == null) {
            if (oVarT != null) {
                oVarT.finish();
            }
            return viewB;
        }
        this.probe = probe2;
        DialComponent dialComponent = E2().f10055w;
        Probe probe3 = this.probe;
        if (probe3 == null) {
            C3862t.u("probe");
            probe3 = null;
        }
        dialComponent.setTag(Integer.valueOf(probe3.getProbeNumber()));
        this.detailFragmentModel = new T5.e();
        E2().f10054v.setOnClickListener(this);
        E2().f10052t.setOnClickListener(this);
        RelativeLayout relativeLayout = E2().f10045m;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(this);
        }
        E2().f10055w.setOnClickListener(this);
        E2().f10055w.getDialView().setListener(this);
        RoundedImageWithLabel roundedImageWithLabel = E2().f10036d;
        if (roundedImageWithLabel != null) {
            roundedImageWithLabel.setOnClickListener(this);
        }
        RoundedImageWithLabel roundedImageWithLabel2 = E2().f10046n;
        if (roundedImageWithLabel2 != null) {
            roundedImageWithLabel2.setOnClickListener(this);
        }
        RelativeLayout relativeLayout2 = E2().f10056x;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        AppCompatTextView appCompatTextView = E2().f10034b;
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(this);
        }
        RoundedImageWithLabel roundedImageWithLabel3 = E2().f10043k;
        if (roundedImageWithLabel3 != null) {
            roundedImageWithLabel3.setOnClickListener(this);
        }
        DialComponent dialComponent2 = E2().f10055w;
        Probe probe4 = this.probe;
        if (probe4 == null) {
            C3862t.u("probe");
            probe4 = null;
        }
        dialComponent2.q(probe4);
        DialViews dialView = E2().f10055w.getDialView();
        Probe probe5 = this.probe;
        if (probe5 == null) {
            C3862t.u("probe");
            probe5 = null;
        }
        dialView.setupCookingStateTimeMode(probe5);
        E2().f10055w.setUpdateTimeViewEverySecond(true);
        E2().f10053u.setOnClickListener(this);
        T5.c cVar = (T5.c) new android.view.a0(this).b(T5.c.class);
        this.controllerViewModel = cVar;
        if (cVar == null) {
            C3862t.u("controllerViewModel");
            cVar = null;
        }
        Probe probe6 = this.probe;
        if (probe6 == null) {
            C3862t.u("probe");
            probe6 = null;
        }
        cVar.w(probe6);
        Probe probe7 = this.probe;
        if (probe7 == null) {
            C3862t.u("probe");
            probe7 = null;
        }
        hVar.A(this, probe7.getDeviceID(), new c());
        Probe probe8 = this.probe;
        if (probe8 == null) {
            C3862t.u("probe");
        } else {
            probe = probe8;
        }
        P2(probe);
        P5.y yVar = new P5.y(oVarT, R.layout.popup_layout);
        this.popup = yVar;
        yVar.d(A0(R.string.ambient_temp_is_too_low), A0(R.string.more_information), new View.OnClickListener() { // from class: R4.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.I2(this.f14866B, view);
            }
        });
        return viewB;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        C3862t.g(v10, "v");
        Probe probe = this.probe;
        Probe probe2 = null;
        P5.y yVar = null;
        Probe probe3 = null;
        Probe probe4 = null;
        Probe probe5 = null;
        if (probe == null) {
            C3862t.u("probe");
            probe = null;
        }
        if (probe.getShouldShowAsConnected()) {
            if (C3862t.b(v10, E2().f10053u)) {
                MEATERDeviceType.Companion companion = MEATERDeviceType.INSTANCE;
                Probe probe6 = this.probe;
                if (probe6 == null) {
                    C3862t.u("probe");
                    probe6 = null;
                }
                if (companion.MEATERDeviceTypeHasIndependentAmbient(probe6.getMEATERDeviceType())) {
                    L2();
                    return;
                }
            }
            if (C3862t.b(v10, E2().f10045m) || C3862t.b(v10, E2().f10043k)) {
                Probe probe7 = this.probe;
                if (probe7 == null) {
                    C3862t.u("probe");
                    probe7 = null;
                }
                if (probe7.shouldEnableAlertsButton()) {
                    Bundle bundle = new Bundle();
                    Probe probe8 = this.probe;
                    if (probe8 == null) {
                        C3862t.u("probe");
                        probe8 = null;
                    }
                    bundle.putLong("SN", probe8.getDeviceID());
                    bundle.putSerializable("AT", MEATERAlertActivity.c.ALERT_ONLY);
                    bundle.putSerializable("AS", MEATERAlertActivity.d.ALERT_TYPE_LIST);
                    Probe probe9 = this.probe;
                    if (probe9 == null) {
                        C3862t.u("probe");
                        probe9 = null;
                    }
                    bundle.putParcelable(MEATERIntent.EXTRA_PROBE, probe9);
                    Probe probe10 = this.probe;
                    if (probe10 == null) {
                        C3862t.u("probe");
                    } else {
                        probe2 = probe10;
                    }
                    bundle.putLong(MEATERIntent.EXTRA_DEVICE_ID, probe2.getDeviceID());
                    Intent intent = new Intent(Z(), (Class<?>) MEATERAlertActivity.class);
                    intent.putExtra("bundle", bundle);
                    t2(intent);
                    return;
                }
            }
            if (v10 == E2().f10052t) {
                Probe probe11 = this.probe;
                if (probe11 == null) {
                    C3862t.u("probe");
                    probe11 = null;
                }
                if (probe11.canDisplayAmbientTemperature()) {
                    L2();
                } else {
                    P5.y yVar2 = this.popup;
                    if (yVar2 == null) {
                        C3862t.u("popup");
                    } else {
                        yVar = yVar2;
                    }
                    TemperatureView indicatorAmbient = E2().f10052t;
                    C3862t.f(indicatorAmbient, "indicatorAmbient");
                    yVar.c(indicatorAmbient);
                }
                x4.b.j(b.EnumC0768b.f52669R.title, "", "", null, 8, null);
                return;
            }
            Probe probe12 = this.probe;
            if (probe12 == null) {
                C3862t.u("probe");
                probe12 = null;
            }
            if (probe12.getShouldShowAsConnected() && P5.Q.J() && (v10 == E2().f10054v || v10 == E2().f10034b)) {
                Probe probe13 = this.probe;
                if (probe13 == null) {
                    C3862t.u("probe");
                    probe13 = null;
                }
                if (probe13.getCookState().getValue() < DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue()) {
                    Probe probe14 = this.probe;
                    if (probe14 == null) {
                        C3862t.u("probe");
                    } else {
                        probe3 = probe14;
                    }
                    MEATERDevice parentDevice = probe3.getParentDevice();
                    if (Config.INSTANCE.getInstance().needToCheckFirmwareUpdateBeforeCook && parentDevice != null && parentDevice.needsFirmwareUpdate() && !C2316d.f31025e) {
                        com.apptionlabs.meater_app.views.h0.f32858a.d(parentDevice, T());
                        return;
                    }
                    if (!K2() || !(Z() instanceof MeaterDetailsActivity)) {
                        N2();
                        return;
                    }
                    F2().l();
                    F2().y().h(this, new d(new Ba.l() { // from class: R4.U
                        @Override // Ba.l
                        public final Object invoke(Object obj) {
                            return W.G2(this.f14889B, (ArrayList) obj);
                        }
                    }));
                    F2().x().h(this, new d(new Ba.l() { // from class: R4.V
                        @Override // Ba.l
                        public final Object invoke(Object obj) {
                            return W.H2(this.f14891B, (String) obj);
                        }
                    }));
                    return;
                }
            }
            if (C3862t.b(v10, E2().f10036d)) {
                Probe probe15 = this.probe;
                if (probe15 == null) {
                    C3862t.u("probe");
                } else {
                    probe4 = probe15;
                }
                if (probe4.isOnline() && probe4.appearsToHaveCookInProgress()) {
                    if (T() instanceof MeaterDetailsActivity) {
                        androidx.fragment.app.o oVarT = T();
                        C3862t.e(oVarT, "null cannot be cast to non-null type com.apptionlabs.meater_app.activities.MeaterDetailsActivity");
                        ((MeaterDetailsActivity) oVarT).o2();
                        return;
                    } else {
                        if (T() instanceof RecipeStepsActivity) {
                            androidx.fragment.app.o oVarT2 = T();
                            C3862t.e(oVarT2, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity");
                            ((RecipeStepsActivity) oVarT2).I2();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (C3862t.b(v10, E2().f10046n) || C3862t.b(v10, E2().f10056x)) {
                Probe probe16 = this.probe;
                if (probe16 == null) {
                    C3862t.u("probe");
                } else {
                    probe5 = probe16;
                }
                if (probe5.isOnline() && probe5.appearsToHaveCookInProgress()) {
                    if (T() instanceof RecipeStepsActivity) {
                        androidx.fragment.app.o oVarT3 = T();
                        C3862t.e(oVarT3, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity");
                        ((RecipeStepsActivity) oVarT3).K2(probe5);
                    } else {
                        androidx.fragment.app.o oVarT4 = T();
                        C3862t.e(oVarT4, "null cannot be cast to non-null type com.apptionlabs.meater_app.activities.MeaterDetailsActivity");
                        ((MeaterDetailsActivity) oVarT4).F2(false, -1);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        D2();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ProtocolParameters.MEATER_SERVICE_NOTIF_COOK_FINISH);
        P5.Q.D(T(), this.mlBroadcastReceiver, intentFilter);
        T5.e eVar = this.detailFragmentModel;
        T5.e eVar2 = null;
        if (eVar == null) {
            C3862t.u("detailFragmentModel");
            eVar = null;
        }
        G.Companion companion = P5.G.INSTANCE;
        Context contextH = x4.g.h();
        C3862t.f(contextH, "getAppContext(...)");
        eVar.y(companion.c(contextH));
        T5.e eVar3 = this.detailFragmentModel;
        if (eVar3 == null) {
            C3862t.u("detailFragmentModel");
        } else {
            eVar2 = eVar3;
        }
        Context contextH2 = x4.g.h();
        C3862t.f(contextH2, "getAppContext(...)");
        eVar2.z(companion.b(contextH2) != G.b.f14002D);
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        BroadcastReceiver broadcastReceiver = this.mlBroadcastReceiver;
        if (broadcastReceiver != null) {
            try {
                androidx.fragment.app.o oVarT = T();
                if (oVarT != null) {
                    oVarT.unregisterReceiver(broadcastReceiver);
                    C4153F c4153f = C4153F.f46609a;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                C4153F c4153f2 = C4153F.f46609a;
            }
        }
    }
}
