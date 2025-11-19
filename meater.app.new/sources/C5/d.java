package C5;

import P5.G;
import android.app.AlertDialog;
import android.content.Context;
import android.view.b0;
import android.view.c0;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.views.C2421z;
import com.apptionlabs.meater_app.views.X;
import d.ActivityC3006j;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: BaseCookSetupFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000 12\u00020\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0019R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"LC5/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/apptionlabs/meater_app/model/Probe;", "relatedProbe", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "LP5/G$b;", "soundVolumeType", "", "M2", "(Lcom/apptionlabs/meater_app/model/Probe;Lcom/apptionlabs/meater_app/model/MEATERDevice;LP5/G$b;)Z", "", "alertBody", "Loa/F;", "H2", "(Ljava/lang/String;LP5/G$b;)V", "F2", "(LP5/G$b;)V", "isFirstTimeCook", "A2", "(Z)V", "probeIt", "E2", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "copiedProbe", "K2", "(Lcom/apptionlabs/meater_app/model/Probe;Z)V", "LA5/m;", "G0", "Loa/i;", "C2", "()LA5/m;", "viewModel", "H0", "Lcom/apptionlabs/meater_app/model/Probe;", "B2", "()Lcom/apptionlabs/meater_app/model/Probe;", "D2", "probe", "Landroid/app/AlertDialog;", "I0", "Landroid/app/AlertDialog;", "getMcd", "()Landroid/app/AlertDialog;", "setMcd", "(Landroid/app/AlertDialog;)V", "mcd", "J0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class d extends Fragment {

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: K0, reason: collision with root package name */
    public static final int f2161K0 = 8;

    /* renamed from: L0, reason: collision with root package name */
    public static w5.g f2162L0;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new C0045d(this, null, new c(this), null, null));

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private Probe probe;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private AlertDialog mcd;

    /* compiled from: BaseCookSetupFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LC5/d$a;", "", "<init>", "()V", "Lw5/g;", "setupCookConfirmedListener", "Lw5/g;", "a", "()Lw5/g;", "b", "(Lw5/g;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C5.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final w5.g a() {
            w5.g gVar = d.f2162L0;
            if (gVar != null) {
                return gVar;
            }
            C3862t.u("setupCookConfirmedListener");
            return null;
        }

        public final void b(w5.g gVar) {
            C3862t.g(gVar, "<set-?>");
            d.f2162L0 = gVar;
        }

        private Companion() {
        }
    }

    /* compiled from: BaseCookSetupFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2166a;

        static {
            int[] iArr = new int[DeviceCookState.values().length];
            try {
                iArr[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2166a = iArr;
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Ba.a<androidx.fragment.app.o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2167B;

        public c(Fragment fragment) {
            this.f2167B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o invoke() {
            return this.f2167B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C5.d$d, reason: collision with other inner class name */
    public static final class C0045d implements Ba.a<A5.m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2168B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f2169C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f2170D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f2171E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f2172F;

        public C0045d(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f2168B = fragment;
            this.f2169C = aVar;
            this.f2170D = aVar2;
            this.f2171E = aVar3;
            this.f2172F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [A5.m, androidx.lifecycle.Y] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A5.m invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f2168B;
            dd.a aVar3 = this.f2169C;
            Ba.a aVar4 = this.f2170D;
            Ba.a aVar5 = this.f2171E;
            Ba.a aVar6 = this.f2172F;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A2(boolean r8) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.d.A2(boolean):void");
    }

    private final A5.m C2() {
        return (A5.m) this.viewModel.getValue();
    }

    private final void E2(Probe probeIt) {
        String cookName = C2().z().getCookName();
        if (cookName == null || cookName.length() == 0) {
            probeIt.setCookName(C2().z().l());
        } else {
            probeIt.setCookName(C2().z().getCookName());
        }
    }

    private final void F2(G.b soundVolumeType) {
        C2421z.Companion companion = C2421z.INSTANCE;
        androidx.fragment.app.o oVarC2 = c2();
        C3862t.f(oVarC2, "requireActivity(...)");
        String strA0 = A0(soundVolumeType.n());
        C3862t.f(strA0, "getString(...)");
        String strA02 = A0(soundVolumeType.j());
        C3862t.f(strA02, "getString(...)");
        String strA03 = A0(R.string.ok_label);
        C3862t.f(strA03, "getString(...)");
        companion.e(oVarC2, strA0, strA02, false, new C2421z.AlertPair(strA03, new T4.e() { // from class: C5.a
            @Override // T4.e
            public final void a() {
                d.G2(this.f2157a);
            }
        }), null, null);
        AlertDialog alertDialog = this.mcd;
        if (alertDialog != null) {
            alertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G2(d dVar) {
        X.f32802l = false;
        dVar.A2(true);
    }

    private final void H2(String alertBody, final G.b soundVolumeType) {
        C2421z.Companion companion = C2421z.INSTANCE;
        androidx.fragment.app.o oVarC2 = c2();
        C3862t.f(oVarC2, "requireActivity(...)");
        String strA0 = A0(R.string.low_battery_alert_title);
        C3862t.f(strA0, "getString(...)");
        String strA02 = A0(R.string.yes_alert_button_text);
        C3862t.f(strA02, "getString(...)");
        C2421z.AlertPair alertPair = new C2421z.AlertPair(strA02, new T4.e() { // from class: C5.b
            @Override // T4.e
            public final void a() {
                d.I2(soundVolumeType, this);
            }
        });
        String strA03 = A0(R.string.no_alert_button_text);
        C3862t.f(strA03, "getString(...)");
        AlertDialog alertDialogE = companion.e(oVarC2, strA0, alertBody, false, alertPair, new C2421z.AlertPair(strA03, new T4.e() { // from class: C5.c
            @Override // T4.e
            public final void a() {
                d.J2();
            }
        }), null);
        this.mcd = alertDialogE;
        if (alertDialogE != null) {
            alertDialogE.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(G.b bVar, d dVar) {
        if (bVar != G.b.f14002D) {
            dVar.F2(bVar);
        } else {
            dVar.A2(true);
        }
    }

    public static /* synthetic */ void L2(d dVar, Probe probe, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCook");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        dVar.K2(probe, z10);
    }

    private final boolean M2(Probe relatedProbe, MEATERDevice device, G.b soundVolumeType) {
        while (device != null) {
            if (device.hasLowBattery() && relatedProbe != null && relatedProbe.getCookState() == DeviceCookState.COOK_STATE_NOT_STARTED) {
                String deviceName = device.getDeviceName();
                C3862t.f(deviceName, "<get-deviceName>(...)");
                V v10 = V.f43983a;
                Locale locale = Locale.US;
                String strA0 = A0(R.string.device_is_low_on_battery);
                C3862t.f(strA0, "getString(...)");
                String str = String.format(locale, strA0, Arrays.copyOf(new Object[]{deviceName}, 1));
                C3862t.f(str, "format(...)");
                String strA02 = A0(R.string.are_you_sure_you_want_to_cook);
                C3862t.f(strA02, "getString(...)");
                String str2 = String.format(locale, strA02, Arrays.copyOf(new Object[]{deviceName}, 1));
                C3862t.f(str2, "format(...)");
                H2(Ub.n.f("\n                    " + str + "\n                    " + str2 + "\n                    "), soundVolumeType);
                return true;
            }
            device = device.getParentDevice();
        }
        return false;
    }

    /* renamed from: B2, reason: from getter */
    public final Probe getProbe() {
        return this.probe;
    }

    public final void D2(Probe probe) {
        this.probe = probe;
    }

    public final void K2(Probe copiedProbe, boolean isFirstTimeCook) {
        C3862t.g(copiedProbe, "copiedProbe");
        this.probe = copiedProbe;
        DeviceCookState cookState = copiedProbe.getCookState();
        if ((cookState == null ? -1 : b.f2166a[cookState.ordinal()]) != 1) {
            A2(isFirstTimeCook);
            return;
        }
        G.Companion companion = G.INSTANCE;
        Context contextE2 = e2();
        C3862t.f(contextE2, "requireContext(...)");
        G.b bVarB = companion.b(contextE2);
        Probe probe = this.probe;
        if (probe != null) {
            M4.h hVar = M4.h.f11978a;
            C3862t.d(probe);
            Probe probe2 = (Probe) hVar.o(probe.getDeviceID());
            Probe probe3 = this.probe;
            C3862t.d(probe3);
            if (M2(probe2, probe3, bVarB)) {
                return;
            }
            if (bVarB != G.b.f14002D) {
                F2(bVarB);
            } else {
                A2(isFirstTimeCook);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2() {
    }
}
