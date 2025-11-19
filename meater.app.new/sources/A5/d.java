package A5;

import C5.r;
import L4.C1398r0;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.HTMLStepView;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.StepProgressView;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView;
import com.apptionlabs.meater_app.views.C2419x;
import com.google.android.material.button.MaterialButton;
import d.ActivityC3006j;
import g1.C3377a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import o4.EnumC4125A;
import o4.StepContent;
import o4.StepContentMeta;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import w5.InterfaceC4999c;
import x5.C5060e;
import x5.EnumC5057b;

/* compiled from: RecipeStepFragment.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 s2\u00020\u0001:\u0001tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ#\u0010\u001a\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0003J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b.\u0010-J+\u00103\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0003J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010MR\u0016\u0010`\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010MR\u0016\u0010b\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010MR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006u"}, d2 = {"LA5/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "L2", "(Landroid/view/View;)V", "c3", "d3", "Lo4/y;", "content", "O2", "(Lo4/y;)V", "a3", "Y2", "S2", "T2", "Z2", "P2", "f3", "b3", "R2", "U2", "Landroid/view/ViewGroup;", "X2", "(Lo4/y;Landroid/view/ViewGroup;)V", "Q2", "container", "V2", "I2", "", "stepNumber", "", "G2", "(I)Ljava/lang/String;", "e3", "message", "", "shouldSkip", "g3", "(Ljava/lang/String;Z)V", "F2", "M2", "()Z", "N2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "v1", "q1", "y1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "G0", "Landroid/view/View;", "compactContainer", "LC5/j;", "H0", "LC5/j;", "presetStepView", "LC5/r;", "I0", "LC5/r;", "probeSelectionStepView", "J0", "Lo4/y;", "videoContent", "K0", "I", "L0", "Z", "isForPreview", "", "M0", "Ljava/util/List;", "stepContents", "LL4/r0;", "N0", "LL4/r0;", "binding", "LA5/m;", "O0", "Loa/i;", "H2", "()LA5/m;", "viewModel", "P0", "isCurrentStepDeviceSelection", "Q0", "isCurrentStepSetupCook", "R0", "isCurrentStepDeviceMonitor", "Landroid/widget/FrameLayout;", "S0", "Landroid/widget/FrameLayout;", "frameLayout", "Lw5/c;", "T0", "Lw5/c;", "probeSelectionListener", "Lw5/d;", "U0", "Lw5/d;", "recipeDeviceViewSelectionListener", "Lw5/g;", "V0", "Lw5/g;", "setupCookConfirmedListener", "W0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends Fragment {

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: X0, reason: collision with root package name */
    public static final int f770X0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private View compactContainer;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private C5.j presetStepView;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private r probeSelectionStepView;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private StepContent videoContent;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private int stepNumber;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    private boolean isForPreview;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private List<StepContent> stepContents;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private C1398r0 binding;

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata */
    private boolean isCurrentStepDeviceSelection;

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata */
    private boolean isCurrentStepSetupCook;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    private boolean isCurrentStepDeviceMonitor;

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new i(this, null, new h(this), null, null));

    /* renamed from: T0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4999c probeSelectionListener = new c();

    /* renamed from: U0, reason: collision with root package name and from kotlin metadata */
    private final w5.d recipeDeviceViewSelectionListener = new C0015d();

    /* renamed from: V0, reason: collision with root package name and from kotlin metadata */
    private final w5.g setupCookConfirmedListener = new e();

    /* compiled from: RecipeStepFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LA5/d$a;", "", "<init>", "()V", "", "stepNumber", "", "isForPreview", "LA5/d;", "a", "(IZ)LA5/d;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: A5.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ d b(Companion companion, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z10 = false;
            }
            return companion.a(i10, z10);
        }

        public final d a(int stepNumber, boolean isForPreview) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putInt(MEATERIntent.EXTRA_RECIPE_STEP_NUMBER, stepNumber);
            bundle.putBoolean(MEATERIntent.EXTRA_IS_RECIPE_FOR_PREVIEW, isForPreview);
            dVar.k2(bundle);
            return dVar;
        }

        private Companion() {
        }
    }

    /* compiled from: RecipeStepFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f787a;

        static {
            int[] iArr = new int[EnumC4125A.values().length];
            try {
                iArr[EnumC4125A.f46407D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4125A.f46408E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4125A.f46409F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4125A.f46410G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4125A.f46411H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC4125A.f46412I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC4125A.f46413J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC4125A.f46414K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC4125A.f46415L.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC4125A.f46416M.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC4125A.f46417N.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC4125A.f46418O.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f787a = iArr;
        }
    }

    /* compiled from: RecipeStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"A5/d$c", "Lw5/c;", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements InterfaceC4999c {
        c() {
        }

        @Override // w5.InterfaceC4999c
        public void a(Probe probe) {
            C3862t.g(probe, "probe");
            d.this.H2().Q(probe.getDeviceID());
            d.this.H2().G1();
            U4.b.t("Probe Selected | Probe Id => " + probe.getDeviceID() + " for Recipe ID => " + d.this.H2().z().getId(), new Object[0]);
            U4.b.t("(RecipeStepFragment) #5.0 calculateAndPopulateStepListSize Executed", new Object[0]);
            m.C0(d.this.H2(), d.this.stepNumber, true, false, 4, null);
            androidx.fragment.app.o oVarT = d.this.T();
            C3862t.e(oVarT, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity");
            ((RecipeStepsActivity) oVarT).F2();
        }
    }

    /* compiled from: RecipeStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"A5/d$d", "Lw5/d;", "Loa/F;", "a", "()V", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: A5.d$d, reason: collision with other inner class name */
    public static final class C0015d implements w5.d {
        C0015d() {
        }

        @Override // w5.d
        public void a() {
            if (d.this.K0() && d.this.Z() != null && d.this.M2()) {
                C1398r0 c1398r0 = d.this.binding;
                if (c1398r0 == null) {
                    C3862t.u("binding");
                    c1398r0 = null;
                }
                FrameLayout frameLayout = c1398r0.f10511p;
                if (frameLayout == null || frameLayout.getVisibility() != 0) {
                    return;
                }
                C1398r0 c1398r02 = d.this.binding;
                if (c1398r02 == null) {
                    C3862t.u("binding");
                    c1398r02 = null;
                }
                FrameLayout container = c1398r02.f10503h;
                C3862t.f(container, "container");
                Q4.l.j(container);
                C1398r0 c1398r03 = d.this.binding;
                if (c1398r03 == null) {
                    C3862t.u("binding");
                    c1398r03 = null;
                }
                FrameLayout frameLayout2 = c1398r03.f10511p;
                if (frameLayout2 != null) {
                    Q4.l.g(frameLayout2);
                }
                Fragment fragmentN0 = d.this.Y().n0("probeSelectionStepView");
                if (fragmentN0 != null) {
                    C cR = d.this.Y().r();
                    C3862t.f(cR, "beginTransaction(...)");
                    cR.s(fragmentN0);
                    cR.j();
                }
                d dVar = d.this;
                C1398r0 c1398r04 = dVar.binding;
                if (c1398r04 == null) {
                    C3862t.u("binding");
                    c1398r04 = null;
                }
                dVar.X2(null, c1398r04.f10503h);
            }
        }

        @Override // w5.d
        public void b() {
            if (d.this.K0() && d.this.Z() != null && d.this.M2()) {
                C1398r0 c1398r0 = d.this.binding;
                if (c1398r0 == null) {
                    C3862t.u("binding");
                    c1398r0 = null;
                }
                FrameLayout frameLayout = c1398r0.f10511p;
                if (frameLayout == null || frameLayout.getVisibility() != 8) {
                    return;
                }
                C1398r0 c1398r02 = d.this.binding;
                if (c1398r02 == null) {
                    C3862t.u("binding");
                    c1398r02 = null;
                }
                FrameLayout container = c1398r02.f10503h;
                C3862t.f(container, "container");
                Q4.l.g(container);
                C1398r0 c1398r03 = d.this.binding;
                if (c1398r03 == null) {
                    C3862t.u("binding");
                    c1398r03 = null;
                }
                FrameLayout frameLayout2 = c1398r03.f10511p;
                if (frameLayout2 != null) {
                    Q4.l.j(frameLayout2);
                }
                Fragment fragmentN0 = d.this.Y().n0("probeSelectionStepView");
                if (fragmentN0 != null) {
                    C cR = d.this.Y().r();
                    C3862t.f(cR, "beginTransaction(...)");
                    cR.s(fragmentN0);
                    cR.j();
                }
                d dVar = d.this;
                C1398r0 c1398r04 = dVar.binding;
                if (c1398r04 == null) {
                    C3862t.u("binding");
                    c1398r04 = null;
                }
                FrameLayout frameLayout3 = c1398r04.f10511p;
                C3862t.d(frameLayout3);
                dVar.X2(null, frameLayout3);
            }
        }
    }

    /* compiled from: RecipeStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"A5/d$e", "Lw5/g;", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements w5.g {
        e() {
        }

        @Override // w5.g
        public void a(Probe probe) {
            C3862t.g(probe, "probe");
            d.this.H2().w1(0);
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class h implements Ba.a<androidx.fragment.app.o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f793B;

        public h(Fragment fragment) {
            this.f793B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o invoke() {
            return this.f793B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class i implements Ba.a<m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f794B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f795C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f796D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f797E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f798F;

        public i(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f794B = fragment;
            this.f795C = aVar;
            this.f796D = aVar2;
            this.f797E = aVar3;
            this.f798F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [A5.m, androidx.lifecycle.Y] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f794B;
            dd.a aVar3 = this.f795C;
            Ba.a aVar4 = this.f796D;
            Ba.a aVar5 = this.f797E;
            Ba.a aVar6 = this.f798F;
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
            return ld.b.b(P.b(m.class), b0VarV, (4 & 4) != 0 ? null : null, aVar, (4 & 16) != 0 ? null : aVar3, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar6);
        }
    }

    private final void F2() {
        if (this.isForPreview) {
            C1398r0 c1398r0 = this.binding;
            C1398r0 c1398r02 = null;
            if (c1398r0 == null) {
                C3862t.u("binding");
                c1398r0 = null;
            }
            MaterialButton buttonNext = c1398r0.f10501f;
            C3862t.f(buttonNext, "buttonNext");
            Q4.l.g(buttonNext);
            C1398r0 c1398r03 = this.binding;
            if (c1398r03 == null) {
                C3862t.u("binding");
                c1398r03 = null;
            }
            MaterialButton buttonSkip = c1398r03.f10502g;
            C3862t.f(buttonSkip, "buttonSkip");
            Q4.l.g(buttonSkip);
            C1398r0 c1398r04 = this.binding;
            if (c1398r04 == null) {
                C3862t.u("binding");
            } else {
                c1398r02 = c1398r04;
            }
            StepProgressView stepProgress = c1398r02.f10514s;
            C3862t.f(stepProgress, "stepProgress");
            Q4.l.g(stepProgress);
            View view = this.compactContainer;
            if (view != null) {
                Q4.l.g(view);
            }
        }
    }

    private final String G2(int stepNumber) {
        StepContentMeta stepContentMeta = H2().l().get(Integer.valueOf(stepNumber));
        if ((stepContentMeta != null ? stepContentMeta.getToState() : null) == null) {
            String strA0 = A0(R.string.cook_not_finish_alert_message);
            C3862t.f(strA0, "getString(...)");
            return strA0;
        }
        String toState = stepContentMeta.getToState();
        C5060e c5060e = C5060e.f52836a;
        String strA02 = C3862t.b(toState, c5060e.o()) ? A0(R.string.remove_from_heat_label) : C3862t.b(toState, c5060e.n()) ? A0(R.string.ready_label) : "";
        C3862t.d(strA02);
        if (H2().getPreferences().D().booleanValue()) {
            String strA03 = A0(R.string.cook_not_finish_alert_message);
            C3862t.f(strA03, "getString(...)");
            return strA03;
        }
        V v10 = V.f43983a;
        String str = String.format("Your food is still cooking. Please wait until you get the \"%s\" alert.", Arrays.copyOf(new Object[]{strA02}, 1));
        C3862t.f(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m H2() {
        return (m) this.viewModel.getValue();
    }

    private final void I2() {
        C1398r0 c1398r0 = this.binding;
        C1398r0 c1398r02 = null;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10501f.setOnClickListener(new View.OnClickListener() { // from class: A5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.J2(this.f767B, view);
            }
        });
        C1398r0 c1398r03 = this.binding;
        if (c1398r03 == null) {
            C3862t.u("binding");
        } else {
            c1398r02 = c1398r03;
        }
        c1398r02.f10502g.setOnClickListener(new View.OnClickListener() { // from class: A5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.K2(this.f768B, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(d dVar, View view) {
        U4.b.t("Next Button Clicked Start", new Object[0]);
        if (dVar.isCurrentStepDeviceSelection && dVar.H2().getProbeID() == -1) {
            dVar.e3();
            return;
        }
        if (!dVar.H2().l().containsKey(Integer.valueOf(dVar.stepNumber)) || dVar.H2().O0(dVar.stepNumber) == EnumC5057b.f52809D) {
            dVar.H2().v1();
            dVar.H2().w1(0);
            U4.b.t("Next Button Clicked End", new Object[0]);
        } else {
            String strG2 = dVar.G2(dVar.stepNumber);
            Boolean boolD = dVar.H2().getPreferences().D();
            C3862t.f(boolD, "getRecipeSkipBlockingSteps(...)");
            dVar.g3(strG2, boolD.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(d dVar, View view) {
        dVar.H2().w1(1);
    }

    private final void L2(View view) {
        String title = H2().z().n().get(this.stepNumber).getTitle();
        FrameLayout frameLayout = null;
        if (title != null) {
            C1398r0 c1398r0 = this.binding;
            if (c1398r0 == null) {
                C3862t.u("binding");
                c1398r0 = null;
            }
            c1398r0.f10516u.D(this.stepNumber, title);
        }
        String strA0 = A0(H2().U0(this.stepNumber));
        C3862t.f(strA0, "getString(...)");
        U4.b.t("(RecipeStepFragment) Step : " + this.stepNumber + " | Next Button Text : \"" + strA0 + "\"", new Object[0]);
        C1398r0 c1398r02 = this.binding;
        if (c1398r02 == null) {
            C3862t.u("binding");
            c1398r02 = null;
        }
        c1398r02.f10501f.setText(strA0);
        C1398r0 c1398r03 = this.binding;
        if (c1398r03 == null) {
            C3862t.u("binding");
            c1398r03 = null;
        }
        c1398r03.f10502g.setVisibility(H2().s1(this.stepNumber) ? 0 : 8);
        c3();
        List<StepContent> listC1 = H2().c1(this.stepNumber);
        this.stepContents = listC1;
        if (listC1 == null) {
            return;
        }
        C3862t.d(listC1);
        for (StepContent stepContent : listC1) {
            switch (b.f787a[stepContent.getType().ordinal()]) {
                case 1:
                    O2(stepContent);
                    break;
                case 2:
                    a3(stepContent);
                    break;
                case 3:
                    Y2(stepContent);
                    break;
                case 4:
                    S2(stepContent);
                    break;
                case 5:
                    T2(stepContent);
                    break;
                case 6:
                    Z2(stepContent);
                    break;
                case 7:
                    P2(stepContent);
                    break;
                case 8:
                    R2(stepContent);
                    break;
                case 9:
                    U2(stepContent);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (N2()) {
                        C1398r0 c1398r04 = this.binding;
                        if (c1398r04 == null) {
                            C3862t.u("binding");
                            c1398r04 = null;
                        }
                        X2(stepContent, c1398r04.f10503h);
                        break;
                    } else {
                        C1398r0 c1398r05 = this.binding;
                        if (c1398r05 == null) {
                            C3862t.u("binding");
                            c1398r05 = null;
                        }
                        X2(stepContent, c1398r05.f10513r);
                        break;
                    }
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    C1398r0 c1398r06 = this.binding;
                    if (c1398r06 == null) {
                        C3862t.u("binding");
                        c1398r06 = null;
                    }
                    FrameLayout container = c1398r06.f10503h;
                    C3862t.f(container, "container");
                    Q2(stepContent, container);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (N2()) {
                        C1398r0 c1398r07 = this.binding;
                        if (c1398r07 == null) {
                            C3862t.u("binding");
                            c1398r07 = null;
                        }
                        FrameLayout frameLayout2 = c1398r07.f10511p;
                        C3862t.d(frameLayout2);
                        V2(stepContent, frameLayout2);
                        break;
                    } else {
                        C1398r0 c1398r08 = this.binding;
                        if (c1398r08 == null) {
                            C3862t.u("binding");
                            c1398r08 = null;
                        }
                        FrameLayout container2 = c1398r08.f10503h;
                        C3862t.f(container2, "container");
                        V2(stepContent, container2);
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        F2();
        I2();
        FrameLayout frameLayout3 = this.frameLayout;
        if (frameLayout3 == null) {
            C3862t.u("frameLayout");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M2() {
        return u0().getBoolean(R.bool.is_tablet);
    }

    private final boolean N2() {
        return M2() && u0().getConfiguration().orientation == 2;
    }

    private final void P2(StepContent content) {
        this.videoContent = content;
        C1398r0 c1398r0 = this.binding;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        VideoViewStepView videoView = c1398r0.f10518w;
        C3862t.f(videoView, "videoView");
        f3(videoView);
        StepContent stepContent = this.videoContent;
        C3862t.d(stepContent);
        b3(stepContent);
    }

    private final void Q2(StepContent content, ViewGroup view) {
        C1398r0 c1398r0 = this.binding;
        C1398r0 c1398r02 = null;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10516u.setColor(C3377a.c(e2(), R.color.black_color));
        this.isCurrentStepSetupCook = true;
        f3(view);
        this.presetStepView = C5.j.INSTANCE.a(H2().z().getId(), this.setupCookConfirmedListener);
        C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        int id2 = view.getId();
        C5.j jVar = this.presetStepView;
        if (jVar == null) {
            C3862t.u("presetStepView");
            jVar = null;
        }
        cR.u(id2, jVar, "presetStepView");
        cR.j();
        d3();
        if (N2()) {
            C1398r0 c1398r03 = this.binding;
            if (c1398r03 == null) {
                C3862t.u("binding");
                c1398r03 = null;
            }
            ViewGroup.LayoutParams layoutParams = c1398r03.f10499d.getLayoutParams();
            C3862t.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            C1398r0 c1398r04 = this.binding;
            if (c1398r04 == null) {
                C3862t.u("binding");
                c1398r04 = null;
            }
            bVar.f23994l = c1398r04.f10503h.getId();
            C1398r0 c1398r05 = this.binding;
            if (c1398r05 == null) {
                C3862t.u("binding");
            } else {
                c1398r02 = c1398r05;
            }
            c1398r02.f10499d.requestLayout();
        }
    }

    private final void R2(StepContent content) {
        this.videoContent = content;
        C1398r0 c1398r0 = this.binding;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        VideoViewStepView videoView = c1398r0.f10518w;
        C3862t.f(videoView, "videoView");
        f3(videoView);
    }

    private final void S2(StepContent content) {
        C1398r0 c1398r0 = null;
        View viewInflate = j0().inflate(R.layout.item_flavour_text_step_view, (ViewGroup) null);
        C1398r0 c1398r02 = this.binding;
        if (c1398r02 == null) {
            C3862t.u("binding");
        } else {
            c1398r0 = c1398r02;
        }
        c1398r0.f10497b.addView(viewInflate);
        C3862t.e(viewInflate, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView");
        ((TextStepView) viewInflate).setData(content);
    }

    private final void T2(StepContent content) {
        C1398r0 c1398r0 = null;
        View viewInflate = j0().inflate(R.layout.item_html_step_view, (ViewGroup) null);
        C1398r0 c1398r02 = this.binding;
        if (c1398r02 == null) {
            C3862t.u("binding");
        } else {
            c1398r0 = c1398r02;
        }
        c1398r0.f10497b.addView(viewInflate);
        C3862t.e(viewInflate, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.HTMLStepView");
        ((HTMLStepView) viewInflate).setData(content);
    }

    private final void V2(StepContent content, ViewGroup container) {
        C1398r0 c1398r0 = this.binding;
        C1398r0 c1398r02 = null;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10516u.setColor(C3377a.c(e2(), R.color.black_color));
        this.isCurrentStepDeviceMonitor = true;
        MEATERDevice mEATERDeviceO = M4.h.f11978a.o(H2().getProbeID());
        if ((mEATERDeviceO instanceof Probe ? (Probe) mEATERDeviceO : null) == null) {
            d3();
            Q4.l.i(container);
            return;
        }
        C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        StepContentMeta meta = content.getMeta();
        if (meta != null ? C3862t.b(meta.getCompact(), Boolean.TRUE) : false) {
            this.compactContainer = j0().inflate(R.layout.item_compact_conatiner, (ViewGroup) null);
            C1398r0 c1398r03 = this.binding;
            if (c1398r03 == null) {
                C3862t.u("binding");
            } else {
                c1398r02 = c1398r03;
            }
            c1398r02.f10497b.addView(this.compactContainer);
            View view = this.compactContainer;
            C3862t.d(view);
            cR.t(view.getId(), C5.e.INSTANCE.a());
            cR.j();
            return;
        }
        cR.t(container.getId(), C5.h.INSTANCE.a(this.stepNumber, H2().getProbeID(), content));
        cR.j();
        if (N2()) {
            C1398r0 c1398r04 = this.binding;
            if (c1398r04 == null) {
                C3862t.u("binding");
                c1398r04 = null;
            }
            LinearLayoutCompat buttonHolder = c1398r04.f10499d;
            C3862t.f(buttonHolder, "buttonHolder");
            Q4.l.g(buttonHolder);
            C1398r0 c1398r05 = this.binding;
            if (c1398r05 == null) {
                C3862t.u("binding");
                c1398r05 = null;
            }
            MaterialButton materialButton = c1398r05.f10500e;
            if (materialButton != null) {
                Q4.l.j(materialButton);
            }
            C1398r0 c1398r06 = this.binding;
            if (c1398r06 == null) {
                C3862t.u("binding");
                c1398r06 = null;
            }
            MaterialButton materialButton2 = c1398r06.f10500e;
            if (materialButton2 != null) {
                C1398r0 c1398r07 = this.binding;
                if (c1398r07 == null) {
                    C3862t.u("binding");
                    c1398r07 = null;
                }
                materialButton2.setText(c1398r07.f10501f.getText());
            }
            C1398r0 c1398r08 = this.binding;
            if (c1398r08 == null) {
                C3862t.u("binding");
                c1398r08 = null;
            }
            MaterialButton materialButton3 = c1398r08.f10500e;
            if (materialButton3 != null) {
                materialButton3.setOnClickListener(new View.OnClickListener() { // from class: A5.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        d.W2(this.f766B, view2);
                    }
                });
            }
            C1398r0 c1398r09 = this.binding;
            if (c1398r09 == null) {
                C3862t.u("binding");
                c1398r09 = null;
            }
            FrameLayout frameLayout = c1398r09.f10511p;
            ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
            C3862t.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.setMarginEnd(150);
            C1398r0 c1398r010 = this.binding;
            if (c1398r010 == null) {
                C3862t.u("binding");
            } else {
                c1398r02 = c1398r010;
            }
            FrameLayout frameLayout2 = c1398r02.f10511p;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(bVar);
            }
        } else {
            d3();
        }
        f3(container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(d dVar, View view) {
        C1398r0 c1398r0 = dVar.binding;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10501f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(StepContent content, ViewGroup view) {
        C1398r0 c1398r0 = this.binding;
        C1398r0 c1398r02 = null;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10516u.setColor(C3377a.c(e2(), R.color.black_color));
        this.isCurrentStepDeviceSelection = true;
        if (view != null) {
            f3(view);
            C cR = Y().r();
            C3862t.f(cR, "beginTransaction(...)");
            this.probeSelectionStepView = r.INSTANCE.a(this.probeSelectionListener, this.recipeDeviceViewSelectionListener);
            int id2 = view.getId();
            r rVar = this.probeSelectionStepView;
            if (rVar == null) {
                C3862t.u("probeSelectionStepView");
                rVar = null;
            }
            cR.u(id2, rVar, "probeSelectionStepView");
            cR.j();
        }
        if (!N2()) {
            C1398r0 c1398r03 = this.binding;
            if (c1398r03 == null) {
                C3862t.u("binding");
                c1398r03 = null;
            }
            StepProgressView stepProgress = c1398r03.f10514s;
            C3862t.f(stepProgress, "stepProgress");
            Q4.l.g(stepProgress);
            d3();
        }
        C1398r0 c1398r04 = this.binding;
        if (c1398r04 == null) {
            C3862t.u("binding");
            c1398r04 = null;
        }
        View view2 = c1398r04.f10517v;
        if (view2 != null) {
            Q4.l.g(view2);
        }
        C1398r0 c1398r05 = this.binding;
        if (c1398r05 == null) {
            C3862t.u("binding");
            c1398r05 = null;
        }
        View view3 = c1398r05.f10498c;
        if (view3 != null) {
            Q4.l.g(view3);
        }
        C1398r0 c1398r06 = this.binding;
        if (c1398r06 == null) {
            C3862t.u("binding");
            c1398r06 = null;
        }
        StepProgressView stepProgressView = c1398r06.f10515t;
        if (stepProgressView != null) {
            Q4.l.j(stepProgressView);
        }
        C1398r0 c1398r07 = this.binding;
        if (c1398r07 == null) {
            C3862t.u("binding");
            c1398r07 = null;
        }
        StepProgressView stepProgressView2 = c1398r07.f10515t;
        if (stepProgressView2 != null) {
            stepProgressView2.b(H2().n1(), this.stepNumber);
        }
        C1398r0 c1398r08 = this.binding;
        if (c1398r08 == null) {
            C3862t.u("binding");
        } else {
            c1398r02 = c1398r08;
        }
        MaterialButton buttonNext = c1398r02.f10501f;
        C3862t.f(buttonNext, "buttonNext");
        Q4.l.g(buttonNext);
    }

    private final void Y2(StepContent content) {
        C1398r0 c1398r0 = null;
        View viewInflate = j0().inflate(R.layout.item_title_text_step_view, (ViewGroup) null);
        C1398r0 c1398r02 = this.binding;
        if (c1398r02 == null) {
            C3862t.u("binding");
        } else {
            c1398r0 = c1398r02;
        }
        c1398r0.f10497b.addView(viewInflate);
        C3862t.e(viewInflate, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView");
        ((TextStepView) viewInflate).setData(content);
    }

    private final void a3(StepContent content) {
        C1398r0 c1398r0 = this.binding;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10516u.setColor(C3377a.c(e2(), R.color.black_color));
    }

    private final void b3(StepContent content) {
        C1398r0 c1398r0 = this.binding;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        VideoViewStepView videoViewStepView = c1398r0.f10518w;
        int i10 = this.stepNumber;
        v vVarY = Y();
        C3862t.f(vVarY, "getChildFragmentManager(...)");
        videoViewStepView.T(i10, content, vVarY, H2().getCacheManager());
    }

    private final void c3() {
        C1398r0 c1398r0 = this.binding;
        C1398r0 c1398r02 = null;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        StepProgressView stepProgress = c1398r0.f10514s;
        C3862t.f(stepProgress, "stepProgress");
        Q4.l.j(stepProgress);
        C1398r0 c1398r03 = this.binding;
        if (c1398r03 == null) {
            C3862t.u("binding");
        } else {
            c1398r02 = c1398r03;
        }
        c1398r02.f10514s.b(H2().n1(), this.stepNumber);
    }

    private final void d3() {
        if (N2()) {
            return;
        }
        C1398r0 c1398r0 = this.binding;
        C1398r0 c1398r02 = null;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        ViewGroup.LayoutParams layoutParams = c1398r0.f10514s.getLayoutParams();
        C3862t.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        C1398r0 c1398r03 = this.binding;
        if (c1398r03 == null) {
            C3862t.u("binding");
            c1398r03 = null;
        }
        bVar.f23990j = c1398r03.f10503h.getId();
        C1398r0 c1398r04 = this.binding;
        if (c1398r04 == null) {
            C3862t.u("binding");
        } else {
            c1398r02 = c1398r04;
        }
        c1398r02.f10514s.requestLayout();
    }

    private final void e3() {
        C2419x.i(c2(), A0(R.string.alert_text), A0(R.string.currently_no_paired_devices), A0(R.string.set_up_device), new f());
    }

    private final void f3(View view) {
        Q4.l.j(view);
        if (N2()) {
            view.setClipToOutline(true);
            return;
        }
        F3.l lVarA = F3.l.INSTANCE.a();
        C3862t.f(c2(), "requireActivity(...)");
        view.getLayoutParams().height = (int) (lVarA.a(r1).a().height() * 0.66d);
    }

    private final void g3(String message, boolean shouldSkip) {
        g gVar = new g(shouldSkip, this);
        if (!shouldSkip) {
            C2419x.i(c2(), A0(R.string.cancel_cook_alert_title), message, A0(R.string.cook_not_finish_button_positive_text), gVar);
            return;
        }
        androidx.fragment.app.o oVarC2 = c2();
        String strA0 = A0(R.string.cancel_cook_alert_title);
        String strA02 = A0(R.string.continue_button);
        C3862t.f(strA02, "getString(...)");
        String upperCase = strA02.toUpperCase(Locale.ROOT);
        C3862t.f(upperCase, "toUpperCase(...)");
        C2419x.j(oVarC2, strA0, message, upperCase, A0(R.string.wait_text), gVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        this.frameLayout = new FrameLayout(e2());
        if (d2().containsKey(MEATERIntent.EXTRA_RECIPE_STEP_NUMBER)) {
            this.stepNumber = d2().getInt(MEATERIntent.EXTRA_RECIPE_STEP_NUMBER);
            this.isForPreview = d2().getBoolean(MEATERIntent.EXTRA_IS_RECIPE_FOR_PREVIEW);
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        C1398r0 c1398r0C = C1398r0.c(inflater, frameLayout, false);
        this.binding = c1398r0C;
        if (c1398r0C == null) {
            C3862t.u("binding");
            c1398r0C = null;
        }
        ConstraintLayout constraintLayoutB = c1398r0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        L2(constraintLayoutB);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        C3862t.u("frameLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C1398r0 c1398r0 = this.binding;
        C1398r0 c1398r02 = null;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10518w.R();
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        C1398r0 c1398r0C = C1398r0.c((LayoutInflater) systemService, null, false);
        this.binding = c1398r0C;
        if (c1398r0C == null) {
            C3862t.u("binding");
            c1398r0C = null;
        }
        ConstraintLayout constraintLayoutB = c1398r0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        L2(constraintLayoutB);
        C1398r0 c1398r03 = this.binding;
        if (c1398r03 == null) {
            C3862t.u("binding");
        } else {
            c1398r02 = c1398r03;
        }
        c1398r02.f10518w.Y();
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        if (K4.a.f8678a.e(H2().getOnGoingRecipeId()) == null || this.isForPreview) {
            return;
        }
        H2().D0(Integer.valueOf(this.stepNumber), false);
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.v1();
        C1398r0 c1398r0 = null;
        if (!this.isForPreview) {
            m mVarH2 = H2();
            int i10 = this.stepNumber;
            C1398r0 c1398r02 = this.binding;
            if (c1398r02 == null) {
                C3862t.u("binding");
                c1398r02 = null;
            }
            mVarH2.N1(i10, c1398r02.f10516u.getStepTitle());
        }
        if (this.isCurrentStepDeviceMonitor && H2().getCookFinished()) {
            FrameLayout frameLayout = this.frameLayout;
            if (frameLayout == null) {
                C3862t.u("frameLayout");
                frameLayout = null;
            }
            frameLayout.removeAllViews();
            C1398r0 c1398r03 = this.binding;
            if (c1398r03 == null) {
                C3862t.u("binding");
                c1398r03 = null;
            }
            ConstraintLayout constraintLayoutB = c1398r03.b();
            C3862t.f(constraintLayoutB, "getRoot(...)");
            L2(constraintLayoutB);
        }
        StepContent stepContent = this.videoContent;
        if (stepContent != null) {
            C3862t.d(stepContent);
            b3(stepContent);
        }
        C1398r0 c1398r04 = this.binding;
        if (c1398r04 == null) {
            C3862t.u("binding");
        } else {
            c1398r0 = c1398r04;
        }
        c1398r0.f10518w.Y();
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        C1398r0 c1398r0 = this.binding;
        if (c1398r0 == null) {
            C3862t.u("binding");
            c1398r0 = null;
        }
        c1398r0.f10518w.R();
    }

    /* compiled from: RecipeStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"A5/d$f", "Lcom/apptionlabs/meater_app/views/x$a;", "Loa/F;", "a", "()V", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements C2419x.a {
        f() {
        }

        @Override // com.apptionlabs.meater_app.views.C2419x.a
        public void a() {
        }

        @Override // com.apptionlabs.meater_app.views.C2419x.a
        public void b() {
        }
    }

    /* compiled from: RecipeStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"A5/d$g", "Lcom/apptionlabs/meater_app/views/x$a;", "Loa/F;", "a", "()V", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements C2419x.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f792b;

        g(boolean z10, d dVar) {
            this.f791a = z10;
            this.f792b = dVar;
        }

        @Override // com.apptionlabs.meater_app.views.C2419x.a
        public void a() {
            if (this.f791a) {
                U4.b.t("(RecipeStepFragment) Continue button clicked for Blocking Step Number : " + this.f792b.stepNumber, new Object[0]);
                U4.b.t("(RecipeFragment) #2.0 calculateAndPopulateStepListSize Executed", new Object[0]);
                this.f792b.H2().B0(this.f792b.stepNumber, true, true);
                this.f792b.H2().w1(0);
            }
        }

        @Override // com.apptionlabs.meater_app.views.C2419x.a
        public void b() {
        }
    }

    private final void O2(StepContent content) {
    }

    private final void U2(StepContent content) {
    }

    private final void Z2(StepContent content) {
    }
}
