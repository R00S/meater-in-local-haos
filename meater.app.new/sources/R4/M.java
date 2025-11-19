package R4;

import L4.C1414z0;
import R4.T0;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.GraphSelectedData;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.NoteType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.views.NoteCookGraph;

/* compiled from: GraphSelectorFragment.java */
/* loaded from: classes2.dex */
public class M extends Fragment implements NoteCookGraph.a {

    /* renamed from: G0, reason: collision with root package name */
    private FrameLayout f14848G0;

    /* renamed from: H0, reason: collision with root package name */
    C1414z0 f14849H0;

    private void A2(Bundle bundle) {
        NoteType noteType = NoteType.values()[bundle.getInt("selectedTab")];
        NoteType noteType2 = NoteType.INTERNAL;
        if (noteType == noteType2) {
            this.f14849H0.f10818c.setNoteGraphType(noteType2.getValue());
            return;
        }
        NoteType noteType3 = NoteType.AMBIENT;
        if (noteType == noteType3) {
            this.f14849H0.f10818c.setNoteGraphType(noteType3.getValue());
        } else {
            this.f14849H0.f10818c.setNoteGraphType(NoteType.TIME.getValue());
        }
    }

    private void y2(View view) {
        final Bundle bundleX = X();
        SavedCook savedCookF = LocalStorage.sharedStorage().savedCookDAO().f(bundleX.getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
        long j10 = bundleX.getLong("selectedTimeStamp", 0L);
        if (T0.d.values()[bundleX.getInt(MEATERIntent.EXTRA_GRAPH_CONTEXT)] == T0.d.COOK_IN_PROGRESS) {
            Probe probe = (Probe) P5.Q.k(bundleX, MEATERIntent.EXTRA_PROBE, Probe.class);
            if (probe != null && probe.getSavedCook() != null && probe.getSavedCook().getCookTime() > 0) {
                savedCookF = probe.getSavedCook();
            }
            j10 = probe != null ? probe.cookTimeElapsed() : savedCookF.getCookTime();
        }
        A2(bundleX);
        this.f14849H0.f10818c.setListener(this);
        this.f14849H0.f10818c.setTargetTemp(savedCookF.getTargetTemperature());
        if (j10 > 0) {
            this.f14849H0.f10818c.setHoverTime(j10);
        }
        this.f14849H0.f10818c.setTemperatureLog(savedCookF.getTemperatureLog());
        this.f14849H0.f10819d.setOnClickListener(new View.OnClickListener() { // from class: R4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14832B.z2(bundleX, view2);
            }
        });
        this.f14848G0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(Bundle bundle, View view) {
        GraphSelectedData currentSelectData = this.f14849H0.f10818c.getCurrentSelectData();
        if (currentSelectData.timeStamp <= 0) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("internal", currentSelectData.internalTemperature);
        bundle2.putString("ambient", currentSelectData.ambientTemperature);
        bundle2.putString("time", currentSelectData.timeTemperature);
        bundle2.putLong("timeStamp", currentSelectData.timeStamp);
        bundle2.putInt("selectedTab", bundle.getInt("selectedTab"));
        o0().H1("requestKey", bundle2);
        if (T() != null) {
            T().getOnBackPressedDispatcher().l();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f14848G0 = frameLayout;
        C1414z0 c1414z0C = C1414z0.c(layoutInflater, frameLayout, false);
        this.f14849H0 = c1414z0C;
        y2(c1414z0C.b());
        return this.f14848G0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14848G0.removeAllViews();
        if (T() == null) {
            return;
        }
        C1414z0 c1414z0C = C1414z0.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f14849H0 = c1414z0C;
        y2(c1414z0C.b());
    }

    @Override // com.apptionlabs.meater_app.views.NoteCookGraph.a
    public void s() {
        this.f14849H0.f10819d.setBackgroundResource(R.drawable.rounder_red_border_background);
        this.f14849H0.f10819d.setTextColor(P5.Q.j(Z(), R.color.primary_white_toggle_color));
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        this.f14849H0.f10818c.invalidate();
    }
}
