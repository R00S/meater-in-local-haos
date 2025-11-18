package C5;

import B5.m;
import L4.C1395p0;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;
import d.ActivityC3006j;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import o4.Setup;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import w5.InterfaceC4998b;

/* compiled from: PresetStepView.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"LC5/j;", "LC5/d;", "<init>", "()V", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;", "meatCut", "Lo4/w;", "setup", "Loa/F;", "U2", "(Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;Lo4/w;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "S2", "(Landroid/view/View;)V", "LB5/m;", "M0", "LB5/m;", "presetSelectionDialog", "LL4/p0;", "N0", "LL4/p0;", "binding", "LA5/m;", "O0", "Loa/i;", "C2", "()LA5/m;", "viewModel", "Landroid/widget/FrameLayout;", "P0", "Landroid/widget/FrameLayout;", "frameLayout", "Lw5/b;", "Q0", "Lw5/b;", "presetSelectionListener", "R0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j extends C5.d {

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: S0, reason: collision with root package name */
    public static final int f2199S0 = 8;

    /* renamed from: T0, reason: collision with root package name */
    private static int f2200T0 = -1;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private B5.m presetSelectionDialog;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private C1395p0 binding;

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new d(this, null, new c(this), null, null));

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4998b presetSelectionListener = new b();

    /* compiled from: PresetStepView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"LC5/j$a;", "", "<init>", "()V", "", "recipeId", "Lw5/g;", "setupCookConfirmedListener", "LC5/j;", "a", "(ILw5/g;)LC5/j;", "I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C5.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final j a(int recipeId, w5.g setupCookConfirmedListener) {
            C3862t.g(setupCookConfirmedListener, "setupCookConfirmedListener");
            j jVar = new j();
            j.f2200T0 = recipeId;
            C5.d.INSTANCE.b(setupCookConfirmedListener);
            return jVar;
        }

        private Companion() {
        }
    }

    /* compiled from: PresetStepView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"C5/j$b", "Lw5/b;", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements InterfaceC4998b {
        b() {
        }

        @Override // w5.InterfaceC4998b
        public void a(Probe probe) {
            C3862t.g(probe, "probe");
            C5.d.L2(j.this, probe, false, 2, null);
            if (probe.getmCut() != null) {
                A5.m mVarC2 = j.this.C2();
                MeatCut meatCut = probe.getmCut();
                C3862t.d(meatCut);
                mVarC2.Q1(meatCut);
            }
            B5.m mVar = j.this.presetSelectionDialog;
            if (mVar != null) {
                mVar.A2();
            }
            j.this.presetSelectionDialog = null;
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Ba.a<androidx.fragment.app.o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2207B;

        public c(Fragment fragment) {
            this.f2207B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o invoke() {
            return this.f2207B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements Ba.a<A5.m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2208B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f2209C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f2210D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f2211E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f2212F;

        public d(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f2208B = fragment;
            this.f2209C = aVar;
            this.f2210D = aVar2;
            this.f2211E = aVar3;
            this.f2212F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [A5.m, androidx.lifecycle.Y] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A5.m invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f2208B;
            dd.a aVar3 = this.f2209C;
            Ba.a aVar4 = this.f2210D;
            Ba.a aVar5 = this.f2211E;
            Ba.a aVar6 = this.f2212F;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final A5.m C2() {
        return (A5.m) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(j jVar, View view) {
        B5.m mVar = jVar.presetSelectionDialog;
        if (mVar != null) {
            if (mVar != null) {
                mVar.A2();
            }
            jVar.presetSelectionDialog = null;
        }
        Probe probe = jVar.getProbe();
        C3862t.d(probe);
        if (probe.isOnline()) {
            m.Companion aVar = B5.m.INSTANCE;
            Probe probe2 = jVar.getProbe();
            C3862t.d(probe2);
            MeatCut meatCut = jVar.C2().getMeatCut();
            C3862t.d(meatCut);
            String recommendedTemperature = jVar.C2().getRecommendedTemperature();
            C3862t.d(recommendedTemperature);
            B5.m mVarA = aVar.a(probe2, meatCut, recommendedTemperature, jVar.presetSelectionListener);
            jVar.presetSelectionDialog = mVarA;
            if (mVarA != null) {
                mVarA.N2(jVar.Y(), "presetSelectionDialog");
            }
        }
    }

    private final void U2(MeatCut meatCut, Setup setup) {
        String lowerCase;
        if (meatCut != null) {
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            ArrayList<MeatCookingTemperature> arrayList = meatCut.temperatureRanges;
            String recommendedTemperature = setup.getRecommendedTemperature();
            C1395p0 c1395p0 = null;
            if (recommendedTemperature != null) {
                lowerCase = recommendedTemperature.toLowerCase(Locale.ROOT);
                C3862t.f(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            int targetTemperature = MeatCutsHelper.getInstance().getTargetTemperature(meatCutsHelper.searchForRecipeRecommendedTemperature(arrayList, lowerCase));
            C1395p0 c1395p02 = this.binding;
            if (c1395p02 == null) {
                C3862t.u("binding");
                c1395p02 = null;
            }
            c1395p02.f10321h.setText(targetTemperature + "°");
            try {
                MeatCookingTemperature meatCookingTemperature = meatCut.temperatureRanges.get(MeatCutsHelper.getInstance().indexOfCurrentRange(targetTemperature, meatCut.temperatureRanges));
                C1395p0 c1395p03 = this.binding;
                if (c1395p03 == null) {
                    C3862t.u("binding");
                    c1395p03 = null;
                }
                c1395p03.f10316c.setText(meatCookingTemperature.getName());
                C1395p0 c1395p04 = this.binding;
                if (c1395p04 == null) {
                    C3862t.u("binding");
                    c1395p04 = null;
                }
                TextStepView cutText = c1395p04.f10316c;
                C3862t.f(cutText, "cutText");
                Q4.l.j(cutText);
            } catch (Exception unused) {
                C1395p0 c1395p05 = this.binding;
                if (c1395p05 == null) {
                    C3862t.u("binding");
                } else {
                    c1395p0 = c1395p05;
                }
                TextStepView cutText2 = c1395p0.f10316c;
                C3862t.f(cutText2, "cutText");
                Q4.l.g(cutText2);
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void S2(View view) {
        MeatModel meatModelF;
        C3862t.g(view, "view");
        D2((Probe) M4.h.f11978a.o(C2().getProbeID()));
        Setup recipeSetup = C2().getRecipeSetup();
        FrameLayout frameLayout = null;
        if (recipeSetup != null && (meatModelF = x5.g.f52863a.f(recipeSetup)) != null) {
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            Integer id2 = meatModelF.f31705id;
            C3862t.f(id2, "id");
            MeatCut meatCut = meatCutsHelper.getMeatCut(id2.intValue());
            if (meatCut != null) {
                U2(meatCut, recipeSetup);
                if (getProbe() != null) {
                    C1395p0 c1395p0 = this.binding;
                    if (c1395p0 == null) {
                        C3862t.u("binding");
                        c1395p0 = null;
                    }
                    c1395p0.f10315b.setOnClickListener(new View.OnClickListener() { // from class: C5.i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            j.T2(this.f2197B, view2);
                        }
                    });
                }
            }
        }
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            C3862t.u("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        C1395p0 c1395p0C = C1395p0.c(inflater, frameLayout, false);
        this.binding = c1395p0C;
        if (c1395p0C == null) {
            C3862t.u("binding");
            c1395p0C = null;
        }
        ConstraintLayout constraintLayoutB = c1395p0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        S2(constraintLayoutB);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        C3862t.u("frameLayout");
        return null;
    }
}
