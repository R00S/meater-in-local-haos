package B5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.Probe;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import w5.InterfaceC4998b;

/* compiled from: PresetSelectionDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"LB5/m;", "LB5/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Loa/F;", "c3", "(Landroid/view/View;)V", "Z0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m extends AbstractC0884b {

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a1, reason: collision with root package name */
    private static Probe f1648a1;

    /* renamed from: b1, reason: collision with root package name */
    private static MeatCut f1649b1;

    /* renamed from: c1, reason: collision with root package name */
    private static String f1650c1;

    /* renamed from: d1, reason: collision with root package name */
    private static InterfaceC4998b f1651d1;

    /* compiled from: PresetSelectionDialog.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"LB5/m$a;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;", "cut", "", "recommendedTemperature", "Lw5/b;", "presetSelectionListener", "LB5/m;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;Ljava/lang/String;Lw5/b;)LB5/m;", "Lcom/apptionlabs/meater_app/model/Probe;", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;", "Ljava/lang/String;", "Lw5/b;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.m$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final m a(Probe probe, MeatCut cut, String recommendedTemperature, InterfaceC4998b presetSelectionListener) {
            C3862t.g(probe, "probe");
            C3862t.g(cut, "cut");
            C3862t.g(recommendedTemperature, "recommendedTemperature");
            C3862t.g(presetSelectionListener, "presetSelectionListener");
            m mVar = new m();
            Bundle bundle = new Bundle();
            m.f1648a1 = probe;
            m.f1649b1 = cut;
            m.f1650c1 = recommendedTemperature;
            m.f1651d1 = presetSelectionListener;
            mVar.k2(bundle);
            return mVar;
        }

        private Companion() {
        }
    }

    public m() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(m mVar, View view) {
        mVar.A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(com.apptionlabs.meater_app.targets.f fVar, View view) {
        InterfaceC4998b interfaceC4998b = f1651d1;
        if (interfaceC4998b == null) {
            C3862t.u("presetSelectionListener");
            interfaceC4998b = null;
        }
        Probe probeU2 = fVar.U2();
        C3862t.f(probeU2, "getAssignedProbe(...)");
        interfaceC4998b.a(probeU2);
    }

    public void c3(View view) {
        C3862t.g(view, "view");
        MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
        MeatCut meatCut = f1649b1;
        Probe probe = null;
        if (meatCut == null) {
            C3862t.u("cut");
            meatCut = null;
        }
        ArrayList<MeatCookingTemperature> arrayList = meatCut.temperatureRanges;
        String str = f1650c1;
        if (str == null) {
            C3862t.u("recommendedTemperature");
            str = null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C3862t.f(lowerCase, "toLowerCase(...)");
        MeatCookingTemperature meatCookingTemperatureSearchForRecipeRecommendedTemperature = meatCutsHelper.searchForRecipeRecommendedTemperature(arrayList, lowerCase);
        MeatCut meatCut2 = f1649b1;
        if (meatCut2 == null) {
            C3862t.u("cut");
            meatCut2 = null;
        }
        Integer id2 = meatCookingTemperatureSearchForRecipeRecommendedTemperature.f31705id;
        C3862t.f(id2, "id");
        int iIntValue = id2.intValue();
        Probe probe2 = f1648a1;
        if (probe2 == null) {
            C3862t.u("probe");
        } else {
            probe = probe2;
        }
        final com.apptionlabs.meater_app.targets.f fVarJ3 = com.apptionlabs.meater_app.targets.f.j3(meatCut2, iIntValue, probe);
        C3862t.f(fVarJ3, "newInstance(...)");
        Bundle bundleX = fVarJ3.X();
        if (bundleX != null) {
            bundleX.putBoolean(MEATERIntent.EXTRA_IS_FOR_RECIPE, true);
        }
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        cR.b(R.id.container, fVarJ3);
        cR.j();
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.d3(this.f1645B, view2);
            }
        });
        ((Button) view.findViewById(R.id.nextButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.e3(fVarJ3, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_preset_selection_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        c3(viewInflate);
        return viewInflate;
    }
}
