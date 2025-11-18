package M5;

import L4.l1;
import L4.o1;
import P5.C1610s;
import P5.Q;
import P5.S;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.GradientView;
import java.util.ArrayList;
import java.util.List;
import oa.InterfaceC4164i;
import x4.b;

/* compiled from: TemperatureRangeUSDAHelp.java */
/* loaded from: classes2.dex */
public class E extends Fragment {

    /* renamed from: G0, reason: collision with root package name */
    l1 f11989G0;

    /* renamed from: H0, reason: collision with root package name */
    private MeatCut f11990H0;

    /* renamed from: I0, reason: collision with root package name */
    private final InterfaceC4164i<NetworkConstant> f11991I0 = jd.b.d(NetworkConstant.class);

    /* renamed from: J0, reason: collision with root package name */
    private FrameLayout f11992J0;

    /* compiled from: TemperatureRangeUSDAHelp.java */
    class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name */
        o1 f11993B;

        a(E e10, View view, o1 o1Var) {
            super(view);
            this.f11993B = o1Var;
            GradientView gradientView = o1Var.f10304j;
            GradientView.a aVar = GradientView.a.OVAL;
            gradientView.setShape(aVar);
            o1Var.f10299e.setShape(aVar);
        }
    }

    /* compiled from: TemperatureRangeUSDAHelp.java */
    private class b extends RecyclerView.h<a> {

        /* renamed from: E, reason: collision with root package name */
        List<MeatCookingTemperature> f11994E;

        /* renamed from: F, reason: collision with root package name */
        int f11995F;

        b(List<MeatCookingTemperature> list) {
            ArrayList arrayList = new ArrayList();
            this.f11994E = arrayList;
            this.f11995F = -1;
            arrayList.addAll(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public void w(a aVar, int i10) {
            MeatCookingTemperature meatCookingTemperature = this.f11994E.get(i10);
            aVar.f11993B.f10300f.setText(meatCookingTemperature.getName());
            aVar.f11993B.f10302h.setText(MeatCutsHelper.getInstance().getTemperatureString(meatCookingTemperature));
            aVar.f11993B.f10298d.setText(C1610s.a().d(E.this.T(), meatCookingTemperature.description));
            S.e(aVar.f11993B.f10301g, meatCookingTemperature.imageName);
            aVar.f11993B.f10304j.b(null, null, true);
            aVar.f11993B.f10299e.b(meatCookingTemperature.startHex, meatCookingTemperature.endHex, true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public a y(ViewGroup viewGroup, int i10) {
            o1 o1VarC = o1.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            return new a(E.this, o1VarC.b(), o1VarC);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f11994E.size();
        }
    }

    public static E A2(MeatModel meatModel) {
        E e10 = new E();
        Bundle bundle = new Bundle();
        bundle.putInt("cid", meatModel.f31705id.intValue());
        e10.k2(bundle);
        return e10;
    }

    private void y2(View view) {
        this.f11990H0 = MeatCutsHelper.getInstance().getMeatCut(X().getInt("cid"));
        List<MeatCookingTemperature> listFilterRangesOnValidNameDescription = MeatCutsHelper.getInstance().filterRangesOnValidNameDescription(MeatCutsHelper.getInstance().getTemperatureRangesHavingGradient(this.f11990H0.temperatureRanges), T());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.preset_recycler_view);
        recyclerView.setLayoutManager(new CustomLinearLayoutManager(T(), 1, false));
        recyclerView.setAdapter(new b(listFilterRangesOnValidNameDescription));
        this.f11989G0.f10226i.setOnClickListener(new View.OnClickListener() { // from class: M5.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11988B.z2(view2);
            }
        });
        if (listFilterRangesOnValidNameDescription.isEmpty()) {
            this.f11989G0.f10222e.setVisibility(8);
        }
        this.f11992J0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(View view) {
        if (T() != null) {
            x4.b.f(b.EnumC0768b.f52682V0.title, "", "");
            Q.G(T(), this.f11991I0.getValue().getNetworkConstant().m());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f11992J0 = frameLayout;
        l1 l1VarC = l1.c(layoutInflater, frameLayout, false);
        this.f11989G0 = l1VarC;
        y2(l1VarC.b());
        return this.f11992J0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11992J0.removeAllViews();
        if (T() == null) {
            return;
        }
        l1 l1VarC = l1.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f11989G0 = l1VarC;
        y2(l1VarC.b());
    }
}
