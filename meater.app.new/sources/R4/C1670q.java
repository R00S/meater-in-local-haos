package R4;

import L4.C1367b0;
import M4.h;
import P5.C1598f;
import R4.T0;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/* compiled from: CookDetailFragment.java */
/* renamed from: R4.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1670q extends Fragment implements T0.e {

    /* renamed from: G0, reason: collision with root package name */
    private SavedCook f14987G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f14988H0;

    /* renamed from: I0, reason: collision with root package name */
    C1367b0 f14989I0;

    /* renamed from: J0, reason: collision with root package name */
    Probe f14990J0;

    /* renamed from: K0, reason: collision with root package name */
    private T0.d f14991K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f14992L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    double f14993M0 = -1.0d;

    /* renamed from: N0, reason: collision with root package name */
    boolean f14994N0 = false;

    private String A2(Probe probe) {
        if (probe == null || this.f14993M0 <= 0.0d) {
            return A0(R.string.n_a);
        }
        int iCookTimeElapsed = probe.cookTimeElapsed();
        if (iCookTimeElapsed < 1 && probe.getCookStartTime() != null) {
            iCookTimeElapsed = ((int) (System.currentTimeMillis() - probe.getCookStartTime().getTime())) / 1000;
        }
        return P5.I.b(iCookTimeElapsed > 0 ? iCookTimeElapsed : this.f14993M0);
    }

    private String B2() {
        SavedCook savedCook = this.f14987G0;
        return savedCook != null ? savedCook.meatNameForDisplay() : A0(R.string.custom_cook_label);
    }

    private SpannableStringBuilder C2(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) new SpannableString(str));
        if (str2 != null && !str2.isEmpty()) {
            SpannableString spannableString = new SpannableString("\n" + str2);
            spannableString.setSpan(new RelativeSizeSpan(0.7f), 0, spannableString.length(), 0);
            spannableString.setSpan(new C1598f(i1.h.g(x4.g.h(), R.font.roboto_medium)), 0, spannableString.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString);
            if (str3 != null && !str3.isEmpty()) {
                SpannableString spannableString2 = new SpannableString(" " + str3);
                spannableString2.setSpan(new RelativeSizeSpan(0.7f), 0, spannableString2.length(), 0);
                spannableString2.setSpan(new ForegroundColorSpan(P5.Q.i(R.color.grey_9)), 0, spannableString2.length(), 0);
                spannableStringBuilder.append((CharSequence) spannableString2);
            }
        }
        return spannableStringBuilder;
    }

    private int D2(MeatCut meatCut) {
        if (meatCut.usdaSafeC == null) {
            return -1;
        }
        return x4.g.t().n1() ? Temperature.fromFahrenheit(meatCut.usdaSafeF.intValue()) : Temperature.fromCelsius(meatCut.usdaSafeC.intValue());
    }

    private void E2() {
        this.f14989I0.f9870i.setVisibility(8);
        this.f14989I0.f9871j.setVisibility(8);
        this.f14989I0.f9869h.setVisibility(8);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void F2(View view) {
        androidx.fragment.app.o oVarT = T();
        Bundle bundleX = X();
        this.f14987G0 = LocalStorage.sharedStorage().savedCookDAO().f(bundleX.getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
        this.f14991K0 = T0.d.values()[bundleX.getInt(MEATERIntent.EXTRA_GRAPH_CONTEXT)];
        long j10 = bundleX.getLong(MEATERIntent.EXTRA_DEVICE_ID);
        Probe probe = (Probe) P5.Q.k(bundleX, MEATERIntent.EXTRA_PROBE, Probe.class);
        this.f14990J0 = probe;
        if (probe == null && j10 != 0) {
            this.f14990J0 = (Probe) M4.h.f11978a.o(j10);
        }
        if (this.f14987G0 == null) {
            if (oVarT != null) {
                oVarT.finish();
                return;
            }
            return;
        }
        T0 t02 = (T0) T().w0().n0("TemperatureGraphFragment");
        if (t02 != null) {
            t02.W2(this);
        }
        TextView textView = (TextView) view.findViewById(R.id.cook_description);
        textView.setSaveFromParentEnabled(false);
        textView.setSaveEnabled(true);
        textView.setText(N2(false));
        long cookTime = this.f14987G0.getCookTime();
        O2();
        if (this.f14991K0 == T0.d.COOK_IN_PROGRESS) {
            this.f14989I0.f9867f.setText(cookTime > 4 ? P5.I.b(cookTime) : A0(R.string.n_a));
            this.f14989I0.f9865d.setVisibility(8);
            this.f14989I0.f9866e.setVisibility(8);
            this.f14989I0.f9873l.setVisibility(8);
            TextView textView2 = this.f14989I0.f9870i;
            Objects.requireNonNull(textView2);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: R4.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14981B.G2(view2);
                }
            });
            TextView textView3 = this.f14989I0.f9871j;
            Objects.requireNonNull(textView3);
            textView3.setOnClickListener(new View.OnClickListener() { // from class: R4.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14983B.H2(view2);
                }
            });
            if (oVarT != null) {
                oVarT.setTitle(R.string.temperature_graph_screen_title);
            }
            M4.h.f11978a.A(this, this.f14990J0.getDeviceID(), new h.a() { // from class: R4.p
                @Override // M4.h.a
                public final void a(MEATERDevice mEATERDevice) {
                    this.f14985a.I2(mEATERDevice);
                }
            });
        } else {
            E2();
            this.f14989I0.f9867f.setText(P5.I.b(cookTime));
            if (oVarT != null) {
                oVarT.setTitle(R.string.cook_summary_screen_title);
            }
            ((TextView) view.findViewById(R.id.cook_started_value)).setText(this.f14987G0.getDateInStringFormat());
            this.f14989I0.f9868g.setText(A0(R.string.total_time_label));
        }
        P5.S.e(this.f14989I0.f9864c, MeatCutsHelper.getInstance().getMeatIcon(this.f14987G0.getCutId()));
        if (this.f14990J0 != null) {
            P2(!r0.getShouldShowAsConnected());
        } else {
            P5.S.d(this.f14989I0.f9864c.getBackground(), Color.parseColor(MeatCutsHelper.getInstance().getMeatColor(this.f14987G0.getCutId())), true);
        }
        if (P5.Q.v(Z())) {
            P5.S.h(this.f14989I0.f9864c, R.color.grey_f6, true);
        }
        this.f14988H0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G2(View view) {
        this.f14994N0 = !this.f14994N0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H2(View view) {
        this.f14994N0 = !this.f14994N0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(MEATERDevice mEATERDevice) {
        Q2();
    }

    private boolean J2(MeatCut meatCut) {
        int iD2 = D2(meatCut);
        return iD2 != -1 && this.f14987G0.getPeakTemperature() < iD2;
    }

    private boolean K2(ArrayList<MeatCookingTemperature> arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return false;
        }
        return !MeatCutsHelper.getInstance().temperatureIsBelowOfFirstRange(i10, arrayList);
    }

    private void L2() {
        this.f14989I0.f9863b.setText(N2(false));
    }

    private void M2(Probe probe) {
        int timeRemaining = probe.getTimeRemaining();
        if (probe.getCookState().getValue() >= DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue()) {
            E2();
            return;
        }
        if (timeRemaining == -1) {
            this.f14989I0.f9870i.setText(A0(R.string.estimated_time_remaining));
            this.f14989I0.f9871j.setText(A0(R.string.n_a));
        } else if (this.f14994N0) {
            this.f14989I0.f9870i.setText(A0(R.string.estimated_finish_time));
            this.f14989I0.f9871j.setText(DateFormat.getDateTimeInstance(2, 3).format(new Date(System.currentTimeMillis() + (timeRemaining * 1000))));
        } else {
            this.f14989I0.f9870i.setText(A0(R.string.estimated_time_remaining));
            this.f14989I0.f9871j.setText(P5.I.b(timeRemaining));
        }
    }

    private SpannableStringBuilder N2(boolean z10) {
        String strCookNameForDisplay;
        String strTemperatureForTargetRangeOfCook;
        String strB2 = B2();
        SavedCook savedCook = this.f14987G0;
        if (savedCook != null) {
            strCookNameForDisplay = savedCook.cookNameForDisplay();
            strTemperatureForTargetRangeOfCook = this.f14987G0.temperatureForTargetRangeOfCook();
            if (z10 && strTemperatureForTargetRangeOfCook.length() > 0) {
                strTemperatureForTargetRangeOfCook = strTemperatureForTargetRangeOfCook + Temperature.getUserUnitString();
            }
        } else {
            strCookNameForDisplay = "";
            strTemperatureForTargetRangeOfCook = "";
        }
        return strCookNameForDisplay.length() == 0 ? new SpannableStringBuilder(strB2) : C2(strB2, strCookNameForDisplay, strTemperatureForTargetRangeOfCook);
    }

    private void O2() {
        Probe probe = this.f14990J0;
        if (probe != null && probe.appearsToHaveCookInProgress()) {
            this.f14989I0.f9867f.setText(A2(this.f14990J0));
            M2(this.f14990J0);
        }
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.f14987G0.getCutId());
        boolean z10 = (Config.getInstance().SHOW_USDA_SAFE_SCREEN_FOR_ALL_MEAT || MeatCutsHelper.getInstance().containsCategoryUSDA(meatCut)) && J2(meatCut);
        if (meatCut == null) {
            this.f14989I0.f9875n.setVisibility(4);
            if (this.f14989I0.f9872k.getVisibility() != 8) {
                this.f14989I0.f9872k.setVisibility(8);
                return;
            }
            return;
        }
        ArrayList<MeatCookingTemperature> temperatureRangesHavingGradient = MeatCutsHelper.getInstance().getTemperatureRangesHavingGradient(meatCut.temperatureRanges);
        if (temperatureRangesHavingGradient.size() < 2 || !K2(temperatureRangesHavingGradient, Temperature.convertToUserScale(this.f14987G0.getPeakTemperature()))) {
            if (this.f14989I0.f9872k.getVisibility() != 8) {
                this.f14989I0.f9872k.setVisibility(8);
            }
            this.f14989I0.f9875n.setVisibility(8);
            return;
        }
        this.f14989I0.f9872k.h(meatCut, Temperature.convertToUserScale(this.f14987G0.getPeakTemperature()), z10, (androidx.appcompat.app.c) T());
        if (this.f14989I0.f9872k.getVisibility() != 0) {
            this.f14989I0.f9872k.setVisibility(0);
        }
        boolean z11 = this.f14987G0.getPeakTemperature() >= D2(meatCut);
        int iD2 = D2(meatCut);
        if (iD2 == -1 || this.f14987G0.getTargetTemperature() < iD2) {
            this.f14989I0.f9875n.setVisibility(4);
        } else {
            this.f14989I0.f9875n.setImageResource(z11 ? R.drawable.usda_safe : R.drawable.ic_usda_not_safe_all_round);
            this.f14989I0.f9875n.setVisibility(0);
        }
    }

    private void P2(boolean z10) {
        if (z10) {
            P5.S.d(this.f14989I0.f9864c.getBackground(), P5.S.c(Color.parseColor(MeatCutsHelper.getInstance().getMeatColor(this.f14987G0.getCutId()))), true);
            this.f14989I0.f9863b.setTextColor(P5.Q.j(Z(), R.color.grey_e));
            this.f14989I0.f9868g.setTextColor(P5.Q.j(Z(), R.color.grey_e));
            this.f14989I0.f9867f.setTextColor(P5.Q.j(Z(), R.color.grey_e));
            this.f14989I0.f9870i.setTextColor(P5.Q.j(Z(), R.color.grey_e));
            this.f14989I0.f9871j.setTextColor(P5.Q.j(Z(), R.color.grey_e));
            return;
        }
        P5.S.d(this.f14989I0.f9864c.getBackground(), Color.parseColor(MeatCutsHelper.getInstance().getMeatColor(this.f14987G0.getCutId())), true);
        this.f14989I0.f9863b.setTextColor(P5.Q.j(Z(), R.color.black_color));
        this.f14989I0.f9867f.setTextColor(P5.Q.j(Z(), R.color.black_color));
        this.f14989I0.f9868g.setTextColor(P5.Q.j(Z(), R.color.black_color));
        this.f14989I0.f9870i.setTextColor(P5.Q.j(Z(), R.color.black_color));
        this.f14989I0.f9871j.setTextColor(P5.Q.j(Z(), R.color.black_color));
    }

    private void Q2() {
        Probe probe;
        if (this.f14991K0 == T0.d.COOK_IN_PROGRESS && (probe = this.f14990J0) != null) {
            if (probe.getShouldShowAsConnected()) {
                if (this.f14992L0) {
                    this.f14992L0 = false;
                    P2(false);
                }
            } else if (!this.f14992L0) {
                this.f14992L0 = true;
                P2(true);
            }
        }
        O2();
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(e2());
        this.f14988H0 = frameLayout;
        C1367b0 c1367b0C = C1367b0.c(layoutInflater, frameLayout, false);
        this.f14989I0 = c1367b0C;
        F2(c1367b0C.b());
        return this.f14988H0;
    }

    @Override // R4.T0.e
    public void k(double d10) {
        this.f14993M0 = d10;
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        if (this.f14991K0 == T0.d.COOK_IN_PROGRESS) {
            Q2();
        }
        if (this.f14987G0 != null) {
            P5.S.e(this.f14989I0.f9864c, MeatCutsHelper.getInstance().getMeatIcon(this.f14987G0.getCutId()));
        }
        L2();
        super.v1();
    }
}
