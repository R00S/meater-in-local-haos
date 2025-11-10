package com.apptionlabs.meater_app.targets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.AbstractC0397k;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.RecyclerView;
import b6.i7;
import b6.p4;
import c8.f0;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.meatCutStructure.SearchableMeatCut;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.targets.f;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.views.ArrowView;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.MEATERScalesView;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import f8.q0;
import java.util.ArrayList;
import java.util.List;
import rk.C0449a;
import rk.C0531a0;
import rk.C0535c0;
import rk.C0536d;

/* compiled from: ConfirmCookSetupFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class f extends Fragment implements MEATERScalesView.k {
    private static final C0449a I0 = new C0449a();
    private TextView A0;
    private MeatCut B0;
    private int C0;
    private FrameLayout G0;
    private boolean H0;

    /* renamed from: t0, reason: collision with root package name */
    private Probe f10114t0;

    /* renamed from: u0, reason: collision with root package name */
    private MEATERScalesView f10115u0;

    /* renamed from: v0, reason: collision with root package name */
    private c f10116v0;

    /* renamed from: w0, reason: collision with root package name */
    private j6.h f10117w0;

    /* renamed from: x0, reason: collision with root package name */
    private p4 f10118x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f10119y0 = -1;

    /* renamed from: z0, reason: collision with root package name */
    private int f10120z0 = 0;
    private boolean D0 = false;
    private boolean E0 = true;
    private boolean F0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmCookSetupFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements w {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            if (!f.this.D0) {
                f.this.m3();
                if (f.this.f10117w0 != null) {
                    f.this.f10117w0.K(f.this.f10114t0, MeaterTargetSetupActivity.c.TEMPERATURE_SELECTION, null, -1);
                }
            }
        }

        @Override // androidx.core.view.w
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override // androidx.core.view.w
        public void c(Menu menu, MenuInflater menuInflater) {
            int i10;
            menuInflater.inflate(2131689483, menu);
            View inflate = f.this.S().getLayoutInflater().inflate(2131558434, (ViewGroup) new LinearLayout(f.this.S()), false);
            menu.findItem(2131362862).setActionView(inflate);
            f.this.A0 = (TextView) inflate.findViewById(2131361903);
            f.this.A0.setTextColor(l0.h(2131100472));
            TextView textView = f.this.A0;
            f fVar = f.this;
            if (fVar.f10114t0.appearsToHaveCookInProgress()) {
                i10 = 2132018165;
            } else {
                i10 = 2132018171;
            }
            textView.setText(fVar.A0(i10));
            f.this.A0.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.targets.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.a.this.f(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmCookSetupFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (f.this.S() != null && !f.this.S().isFinishing()) {
                if (f.this.A0 != null) {
                    f.this.A0.setEnabled(true);
                }
                if (Config.getInstance().SHOW_ARROW_IN_TEMP_RANGE_ANIMATION || !MeatCutsHelper.getInstance().hasRecommends(f.this.B0)) {
                    f.this.f10115u0.X();
                }
            }
            f.this.D0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConfirmCookSetupFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class c extends RecyclerView.h<d> {

        /* renamed from: t, reason: collision with root package name */
        private final List<MeatCookingTemperature> f10123t;

        /* renamed from: u, reason: collision with root package name */
        private int f10124u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f10125v;

        /* renamed from: w, reason: collision with root package name */
        private MeatCookingTemperature f10126w;

        c(List<MeatCookingTemperature> list) {
            ArrayList arrayList = new ArrayList();
            this.f10123t = arrayList;
            this.f10124u = 0;
            this.f10125v = false;
            arrayList.addAll(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void M(d dVar, View view) {
            int fromCelsius;
            int bindingAdapterPosition = dVar.getBindingAdapterPosition();
            if (!l0.z(bindingAdapterPosition, f.this.B0.temperatureRanges.size())) {
                return;
            }
            MeatCookingTemperature meatCookingTemperature = f.this.B0.temperatureRanges.get(bindingAdapterPosition);
            if (f.this.H0) {
                fromCelsius = Temperature.fromFahrenheit(meatCookingTemperature.targetTempF.intValue());
            } else {
                fromCelsius = Temperature.fromCelsius(meatCookingTemperature.targetTempC.intValue());
            }
            f.this.f10115u0.z(fromCelsius);
            P(bindingAdapterPosition);
            Q(meatCookingTemperature);
            n();
        }

        boolean L(MeatCookingTemperature meatCookingTemperature, int i10) {
            if (f.this.H0) {
                if (Temperature.toFahrenheit(i10) != meatCookingTemperature.targetTempF.intValue()) {
                    return false;
                }
            } else if (Temperature.toCelsius(i10) != meatCookingTemperature.targetTempC.intValue()) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public void w(final d dVar, int i10) {
            int i11;
            int i12;
            Integer num;
            int i13;
            MeatCookingTemperature meatCookingTemperature;
            int i14;
            if (i10 >= f.this.B0.temperatureRanges.size()) {
                return;
            }
            MeatCookingTemperature meatCookingTemperature2 = f.this.B0.temperatureRanges.get(i10);
            ImageView imageView = dVar.f10128q.Z;
            int i15 = 8;
            if (MeatCutsHelper.getInstance().rangeIsUSDA(f.this.B0, meatCookingTemperature2)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            dVar.f10128q.U.setText(meatCookingTemperature2.getName());
            Typeface g10 = androidx.core.content.res.h.g(com.apptionlabs.meater_app.app.a.i(), 2131296273);
            Typeface g11 = androidx.core.content.res.h.g(com.apptionlabs.meater_app.app.a.i(), 2131296259);
            AppCompatTextView appCompatTextView = dVar.f10128q.U;
            if (this.f10124u == i10) {
                g10 = g11;
            }
            appCompatTextView.setTypeface(g10);
            dVar.f10128q.T.setText(MeatCutsHelper.getInstance().getTemperatureString(meatCookingTemperature2));
            dVar.f10128q.Y.b(meatCookingTemperature2.startHex, meatCookingTemperature2.endHex, true);
            ImageView imageView2 = dVar.f10128q.R;
            if (!meatCookingTemperature2.isNormalRange()) {
                i15 = 0;
            }
            imageView2.setVisibility(i15);
            int b10 = q0.b(f.this.S(), meatCookingTemperature2.imageName);
            if (b10 <= 0) {
                if (i10 == 0) {
                    i14 = 2131231437;
                } else {
                    i14 = 2131231511;
                }
                b10 = i14;
            }
            dVar.f10128q.R.setImageResource(b10);
            ArrowView arrowView = dVar.f10128q.f7880a0;
            if (meatCookingTemperature2.isNormalRange()) {
                i12 = f.this.C0;
            } else {
                i12 = -1;
            }
            arrowView.c(i12, MeatCutsHelper.getInstance().getMinTemperature(meatCookingTemperature2), MeatCutsHelper.getInstance().getMaxTemperature(meatCookingTemperature2));
            if (!this.f10125v && ((meatCookingTemperature = this.f10126w) == null || meatCookingTemperature.isNormalRange() || !L(this.f10126w, f.this.f10115u0.getScrollToValue()))) {
                Q(null);
                dVar.f10128q.f7880a0.setVisibility(0);
            } else {
                dVar.f10128q.f7880a0.setVisibility(4);
            }
            if (Config.getInstance().MOST_POPULAR_PRESET_ENABLED && (num = meatCookingTemperature2.id) != null) {
                TextView textView = dVar.f10128q.T;
                if (num.equals(f.this.B0.mostPopularTempRangeId)) {
                    i13 = 2131099784;
                } else {
                    i13 = 2131100529;
                }
                textView.setBackgroundResource(i13);
            }
            dVar.f10128q.V.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.targets.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.c.this.M(dVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public d y(ViewGroup viewGroup, int i10) {
            i7 i7Var = (i7) androidx.databinding.g.h(LayoutInflater.from(viewGroup.getContext()), 2131558673, viewGroup, false);
            return new d(i7Var.v(), i7Var);
        }

        void P(int i10) {
            boolean z10;
            this.f10124u = i10;
            if (l0.z(i10, this.f10123t.size()) && this.f10123t.get(i10).isMeaterRecommendRange()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10125v = z10;
        }

        void Q(MeatCookingTemperature meatCookingTemperature) {
            boolean z10;
            this.f10126w = meatCookingTemperature;
            if (meatCookingTemperature != null && meatCookingTemperature.isMeaterRecommendRange()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10125v = z10;
        }

        void R(int i10) {
            P(MeatCutsHelper.getInstance().indexOfCurrentRange(i10, this.f10125v, this.f10123t));
            n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f10123t.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmCookSetupFragment.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class d extends RecyclerView.f0 {

        /* renamed from: q, reason: collision with root package name */
        i7 f10128q;

        d(View view, i7 i7Var) {
            super(view);
            this.f10128q = i7Var;
        }
    }

    private void R2(int i10) {
        float f10;
        if (Config.getInstance().SHOW_ARROW_IN_TEMP_RANGE_ANIMATION) {
            f10 = MeatCutsHelper.getInstance().getAnimationScale(this.B0);
        } else {
            f10 = 2.0f;
        }
        this.D0 = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        ofInt.setDuration(750L);
        ofInt.setInterpolator(new OvershootInterpolator(f10));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c8.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.apptionlabs.meater_app.targets.f.this.a3(valueAnimator);
            }
        });
        ofInt.addListener(new b());
        ofInt.start();
    }

    private void S2(int i10) {
        this.f10116v0.R(i10);
    }

    private void T2(String str) {
        String str2 = str + " " + A0(2132018780);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(l0.h(2131099779)), 0, str2.indexOf(40), 18);
        this.f10118x0.W.setHint(spannableStringBuilder);
    }

    private MEATERScalesView.j V2() {
        MEATERDeviceType typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(this.f10114t0.getProbeNumber());
        if (typeFromProbeNumber != null && typeFromProbeNumber.isG2Probe()) {
            if (this.H0) {
                return MEATERScalesView.j.G2_COOK_FAHRENHEIT_SCALE;
            }
            return MEATERScalesView.j.G2_COOK_CELSIUS_SCALE;
        }
        if (this.H0) {
            return MEATERScalesView.j.COOK_FAHRENHEIT_SCALE;
        }
        return MEATERScalesView.j.COOK_CELSIUS_SCALE;
    }

    private void W2() {
        if (S() == null) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) S().getSystemService("input_method");
            if (S().getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(S().getCurrentFocus().getWindowToken(), 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X2(View view) {
        int fromCelsius;
        Bundle W = W();
        if (W != null && S() != null) {
            final s c22 = c2();
            this.H0 = com.apptionlabs.meater_app.app.a.u().T1();
            if (c22 instanceof MeaterTargetSetupActivity) {
                this.f10117w0 = (j6.h) c22;
            }
            MEATERScalesView mEATERScalesView = (MEATERScalesView) view.findViewById(2131363419);
            this.f10115u0 = mEATERScalesView;
            mEATERScalesView.setActivity(S());
            this.f10115u0.setListener(this);
            this.f10114t0 = (Probe) l0.k(W, MEATERIntent.EXTRA_PROBE, Probe.class);
            this.B0 = MeatCutsHelper.getInstance().getMeatCut(W().getInt(MEATERIntent.EXTRA_CUT_ID));
            if (W().getInt(MEATERIntent.EXTRA_PRESET_ID) != -1) {
                this.f10120z0 = W().getInt(MEATERIntent.EXTRA_PRESET_ID);
            }
            this.F0 = W.getBoolean(MEATERIntent.EXTRA_IS_FOR_RECIPE, false);
            this.f10118x0.W.setSaveFromParentEnabled(false);
            this.f10118x0.W.setSaveEnabled(true);
            String cookName = this.f10114t0.getCookName();
            if (cookName != null && !cookName.isEmpty() && this.f10114t0.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
                this.f10118x0.W.setText(cookName);
                this.f10118x0.W.setTempCookName(cookName);
                this.f10118x0.W.setSelection(cookName.trim().length());
            } else {
                SearchableMeatCut searchableMeatCut = (SearchableMeatCut) this.B0;
                if (searchableMeatCut != null) {
                    T2(searchableMeatCut.getNameLong());
                }
            }
            RecyclerView recyclerView = (RecyclerView) view.findViewById(2131363077);
            if (Y() != null && l0.w(Y())) {
                q0.i(this.f10118x0.f8140g0, 2131099784, true);
                this.f10118x0.V.setColorFilter(androidx.core.content.a.c(Y(), 2131099784), PorterDuff.Mode.SRC_IN);
            }
            q0.f(this.f10118x0.f8140g0, MeatCutsHelper.getInstance().getMeatIcon(this.B0.id.intValue()));
            q0.d(this.f10118x0.f8140g0.getBackground(), Color.parseColor(MeatCutsHelper.getInstance().getMeatColor(this.B0.id.intValue())), false);
            recyclerView.setLayoutManager(new CustomLinearLayoutManager(S(), 1, false));
            c cVar = new c(this.B0.temperatureRanges);
            this.f10116v0 = cVar;
            recyclerView.setAdapter(cVar);
            recyclerView.j(new l1());
            this.f10116v0.P(this.f10120z0);
            if (this.f10119y0 == -1) {
                if (this.f10114t0.appearsToHaveCookInProgress()) {
                    this.f10119y0 = this.f10114t0.getTargetInternalTemperature();
                } else {
                    if (this.H0) {
                        fromCelsius = Temperature.fromFahrenheit(this.B0.temperatureRanges.get(0).targetTempF.intValue());
                    } else {
                        fromCelsius = Temperature.fromCelsius(this.B0.temperatureRanges.get(0).targetTempC.intValue());
                    }
                    this.f10119y0 = fromCelsius;
                }
            }
            this.f10115u0.setInitialTextValue(this.f10119y0);
            this.f10118x0.W.clearFocus();
            this.f10118x0.W.setCursorVisible(false);
            this.f10118x0.Y.setOnClickListener(new View.OnClickListener() { // from class: c8.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.apptionlabs.meater_app.targets.f.this.b3(view2);
                }
            });
            if (!Config.getInstance().SHOW_USDA_SAFE_SCREEN_FOR_ALL_MEAT && !MeatCutsHelper.getInstance().containsCategoryUSDA(this.B0)) {
                this.f10118x0.f8142i0.setVisibility(8);
                this.f10118x0.f8143j0.setVisibility(8);
            }
            p4 p4Var = this.f10118x0;
            C0449a c0449a = I0;
            p4Var.U(c0449a);
            this.f10118x0.T().n(this.f10114t0);
            this.f10118x0.T().r(C0449a.b.i(c0449a.j()));
            this.f10118x0.Q.setOnClickListener(new View.OnClickListener() { // from class: c8.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.apptionlabs.meater_app.targets.f.this.c3(view2);
                }
            });
            this.f10118x0.R.setOnClickListener(new View.OnClickListener() { // from class: c8.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.apptionlabs.meater_app.targets.f.this.d3(view2);
                }
            });
            this.f10118x0.S.setOnClickListener(new View.OnClickListener() { // from class: c8.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.apptionlabs.meater_app.targets.f.this.e3(view2);
                }
            });
            this.f10118x0.T.setOnClickListener(new View.OnClickListener() { // from class: c8.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.apptionlabs.meater_app.targets.f.this.f3(view2);
                }
            });
            this.f10118x0.U.setOnClickListener(new View.OnClickListener() { // from class: c8.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.apptionlabs.meater_app.targets.f.this.g3(view2);
                }
            });
            this.f10118x0.V.setOnClickListener(new View.OnClickListener() { // from class: c8.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.apptionlabs.meater_app.targets.f.this.h3(c22, view2);
                }
            });
            this.G0.addView(view);
        }
    }

    private boolean Y2() {
        if (this.f10118x0.W.getText() != null && this.f10118x0.W.getText().toString().contains(A0(2132018780))) {
            return true;
        }
        return false;
    }

    private boolean Z2(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a3(ValueAnimator valueAnimator) {
        if (S() != null && !S().isFinishing()) {
            this.f10115u0.z(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b3(View view) {
        if (!this.F0) {
            S().m0().p().t(2131362016, f0.A2(this.B0)).h("cut_type").j();
        } else if (e2().getResources().getBoolean(2131034115)) {
            C0535c0.INSTANCE.a(this.B0).N2(S().m0(), "USDADialog");
        } else {
            C0531a0.INSTANCE.a(this.B0, n7.a.f15732t).N2(S().m0(), "USDADialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c3(View view) {
        this.f10118x0.T().o();
        if (this.f10118x0.T().k()) {
            this.f10118x0.f8135b0.setVisibility(0);
        } else {
            this.f10118x0.f8135b0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d3(View view) {
        this.f10118x0.T().r(C0449a.b.ICON_ONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e3(View view) {
        this.f10118x0.T().r(C0449a.b.ICON_TWO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f3(View view) {
        this.f10118x0.T().r(C0449a.b.ICON_THREE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g3(View view) {
        this.f10118x0.T().r(C0449a.b.ICON_FOUR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h3(Activity activity, View view) {
        boolean z10 = activity instanceof MeaterTargetSetupActivity;
        if (!this.F0) {
            S().m0().p().t(2131362016, c8.f.A2(I0.j())).h("clip_info").j();
        } else {
            C0536d.INSTANCE.a(I0.j()).N2(S().m0(), "clipInfoDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i3() {
        this.f10115u0.z(this.f10114t0.getTargetInternalTemperature());
    }

    public static f j3(MeatModel meatModel, int i10, Probe probe) {
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putInt(MEATERIntent.EXTRA_CUT_ID, meatModel.id.intValue());
        bundle.putInt(MEATERIntent.EXTRA_PRESET_ID, i10);
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, probe);
        fVar.k2(bundle);
        I0.m(C0449a.b.i(probe.getClipNumber()));
        return fVar;
    }

    private void k3() {
        String str;
        String str2;
        if (Z2(this.f10120z0, this.B0.temperatureRanges.size())) {
            str = this.B0.temperatureRanges.get(this.f10120z0).name;
        } else {
            str = "";
        }
        String nameLong = ((SearchableMeatCut) this.B0).getNameLong();
        if (this.f10114t0.appearsToHaveCookInProgress()) {
            str2 = "Adjust";
        } else {
            str2 = "Setup";
        }
        lm.b.m(S(), str2 + " Cook (Smart) > " + nameLong + " > " + str + " > Select MeaterCook");
    }

    private void l3() {
        if (this.f10114t0.appearsToHaveCookInProgress() && this.H0 && this.f10114t0.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PROBE) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: c8.n
                @Override // java.lang.Runnable
                public final void run() {
                    com.apptionlabs.meater_app.targets.f.this.i3();
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        String str;
        int i10;
        int fromCelsius;
        W2();
        this.f10120z0 = this.f10116v0.f10124u;
        S2(this.f10115u0.getPickerEditTextValue());
        String str2 = "";
        if (this.f10118x0.W.getText() == null || this.f10118x0.W.getText().length() <= 0) {
            str = "";
        } else {
            str = this.f10118x0.W.getText().toString();
        }
        if (!Y2() && this.f10118x0.W.j()) {
            str2 = str;
        }
        this.f10114t0.setmCut(this.B0);
        if (Config.getInstance().MOST_POPULAR_PRESET_ENABLED) {
            k3();
        }
        this.f10114t0.setCookName(str2);
        if (this.H0) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        if (this.f10115u0.getScrollToValue() > i10) {
            this.f10114t0.setTargetInternalTemperature(this.f10115u0.getScrollToValue());
        } else {
            if (this.H0) {
                fromCelsius = Temperature.fromFahrenheit(this.B0.temperatureRanges.get(0).targetTempF.intValue());
            } else {
                fromCelsius = Temperature.fromCelsius(this.B0.temperatureRanges.get(0).targetTempC.intValue());
            }
            this.f10114t0.setTargetInternalTemperature(fromCelsius);
        }
        C0449a c0449a = I0;
        if (c0449a.j() > 0) {
            this.f10114t0.setClipNumber(c0449a.j());
        }
        if (l0.z(this.f10120z0, this.B0.temperatureRanges.size())) {
            this.f10114t0.setCookPreset(this.B0.temperatureRanges.get(this.f10120z0));
        }
    }

    @Override // com.apptionlabs.meater_app.views.MEATERScalesView.k
    public void J(int i10) {
        if (!this.D0 || this.f10116v0.h() >= 3) {
            this.C0 = i10;
            if (Config.getInstance().SHOW_ARROW_IN_TEMP_RANGE_ANIMATION || !this.D0) {
                S2(i10);
            }
        }
    }

    public Probe U2() {
        m3();
        return this.f10114t0;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (c2() instanceof MeaterTargetSetupActivity) {
            c2().U(new a(), F0(), AbstractC0397k.b.RESUMED);
        }
        MeatCutsHelper.getInstance().init(S());
        FrameLayout frameLayout = new FrameLayout(Y());
        this.G0 = frameLayout;
        p4 p4Var = (p4) androidx.databinding.g.h(layoutInflater, 2131558549, frameLayout, false);
        this.f10118x0 = p4Var;
        X2(p4Var.v());
        return this.G0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G0.removeAllViews();
        if (S() == null) {
            return;
        }
        p4 p4Var = (p4) androidx.databinding.g.h((LayoutInflater) S().getSystemService("layout_inflater"), 2131558549, null, false);
        this.f10118x0 = p4Var;
        X2(p4Var.v());
        v1();
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        this.f10119y0 = this.f10115u0.getScrollToValue();
        super.q1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (S() == null) {
            return;
        }
        int i10 = this.f10119y0;
        if (this.f10116v0 == null) {
            S().finish();
        }
        this.f10115u0.C();
        this.f10115u0.setScrollToValue(i10);
        this.f10115u0.S(V2());
        this.f10115u0.setScrollToValue(i10);
        S().getWindow().setSoftInputMode(3);
        if (this.E0 && !this.f10114t0.appearsToHaveCookInProgress()) {
            R2(i10);
        } else if (!this.f10116v0.f10125v) {
            this.f10115u0.X();
        }
        l3();
        this.E0 = false;
    }
}
