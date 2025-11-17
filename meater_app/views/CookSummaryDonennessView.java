package com.apptionlabs.meater_app.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b6.r2;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.Meat;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import java.util.ArrayList;
import lm.b;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CookSummaryDonennessView extends RelativeLayout {

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f10262w = {2131362551, 2131362552, 2131362553, 2131362554, 2131362555, 2131362556, 2131362557};

    /* renamed from: q, reason: collision with root package name */
    MeatCut f10263q;

    /* renamed from: r, reason: collision with root package name */
    int f10264r;

    /* renamed from: s, reason: collision with root package name */
    int f10265s;

    /* renamed from: t, reason: collision with root package name */
    MeatCutsHelper.TemperatureSateInRanges f10266t;

    /* renamed from: u, reason: collision with root package name */
    r2 f10267u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.appcompat.app.c f10268v;

    public CookSummaryDonennessView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10264r = -1;
        this.f10265s = -1;
        d(context);
    }

    private void c(ArrayList<MeatCookingTemperature> arrayList, MeatCutsHelper.TemperatureSateInRanges temperatureSateInRanges) {
        MeatCookingTemperature rangeFromTemperature;
        GradientView gradientView;
        int minTemperature;
        int maxTemperature;
        if (temperatureSateInRanges == MeatCutsHelper.TemperatureSateInRanges.BELOW) {
            this.f10264r = 1;
            gradientView = (GradientView) findViewById(f10262w[0]);
            rangeFromTemperature = MeatCutsHelper.getInstance().findMinimumOrMaximumRangeInGivenRanges(arrayList, true);
            minTemperature = Temperature.convertToUserScale(16);
            maxTemperature = MeatCutsHelper.getInstance().getMaxTemperature(rangeFromTemperature);
        } else if (temperatureSateInRanges == MeatCutsHelper.TemperatureSateInRanges.ABOVE) {
            this.f10264r = arrayList.size();
            rangeFromTemperature = MeatCutsHelper.getInstance().findMinimumOrMaximumRangeInGivenRanges(arrayList, false);
            gradientView = (GradientView) findViewById(f10262w[6]);
            minTemperature = MeatCutsHelper.getInstance().getMaxTemperature(rangeFromTemperature);
            maxTemperature = this.f10265s;
        } else {
            this.f10264r = MeatCutsHelper.getInstance().indexOfCurrentRange(this.f10265s, arrayList) + 1;
            rangeFromTemperature = MeatCutsHelper.getInstance().getRangeFromTemperature(this.f10265s, arrayList);
            gradientView = (GradientView) findViewById(f10262w[this.f10264r]);
            minTemperature = MeatCutsHelper.getInstance().getMinTemperature(rangeFromTemperature);
            maxTemperature = MeatCutsHelper.getInstance().getMaxTemperature(rangeFromTemperature);
        }
        final MeatCookingTemperature meatCookingTemperature = rangeFromTemperature;
        final GradientView gradientView2 = gradientView;
        final int i10 = minTemperature;
        final int i11 = maxTemperature;
        if (meatCookingTemperature != null) {
            final GradientView gradientView3 = (GradientView) findViewById(f10262w[this.f10264r]);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.views.l
                @Override // java.lang.Runnable
                public final void run() {
                    CookSummaryDonennessView.this.e(gradientView3, gradientView2, meatCookingTemperature, i10, i11);
                }
            }, 50L);
        }
    }

    @SuppressLint({"RestrictedApi"})
    private void d(Context context) {
        this.f10267u = (r2) androidx.databinding.g.h(LayoutInflater.from(context), 2131558508, this, true);
        MeatCutsHelper.getInstance().init(context);
        this.f10263q = MeatCutsHelper.getInstance().getMeatCut(1);
        j();
        this.f10267u.f8199a0.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CookSummaryDonennessView.this.f(view);
            }
        });
        this.f10267u.f8199a0.setAutoSizeTextTypeUniformWithConfiguration((int) (m0.d() * 0.45f), (int) (m0.d() * 0.95f), 1, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(GradientView gradientView, GradientView gradientView2, MeatCookingTemperature meatCookingTemperature, int i10, int i11) {
        int i12;
        this.f10267u.Y.setX(gradientView.getLeft());
        this.f10267u.Y.getLayoutParams().width = gradientView.getMeasuredWidth();
        this.f10267u.f8200b0.setX(gradientView2.getLeft());
        this.f10267u.f8200b0.getLayoutParams().width = gradientView2.getMeasuredWidth();
        this.f10267u.Z.setX(gradientView.getLeft());
        this.f10267u.Z.getLayoutParams().width = this.f10267u.X.getMeasuredWidth() - ((int) this.f10267u.Z.getX());
        this.f10267u.Z.setText(meatCookingTemperature.getName());
        this.f10267u.Y.requestLayout();
        this.f10267u.Z.requestLayout();
        this.f10267u.Y.setVisibility(0);
        this.f10267u.Z.setVisibility(0);
        this.f10267u.f8200b0.setVisibility(0);
        ArrowView arrowView = this.f10267u.f8200b0;
        if (meatCookingTemperature.isNormalRange()) {
            i12 = this.f10265s;
        } else {
            i12 = -1;
        }
        arrowView.b(i12, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        if (this.f10263q != null && this.f10268v != null) {
            lm.b.g(b.EnumC0292b.L0.title, "", "");
            this.f10268v.m0().p().t(2131362016, c8.f0.A2(this.f10263q)).h("usda").j();
        }
    }

    private void g(float f10, View... viewArr) {
        for (View view : viewArr) {
            ((LinearLayout.LayoutParams) view.getLayoutParams()).weight = f10;
        }
    }

    private void i(ArrayList<MeatCookingTemperature> arrayList) {
        if (this.f10266t != MeatCutsHelper.TemperatureSateInRanges.IN_RANGE) {
            MeatCookingTemperature meatCookingTemperature = arrayList.get(arrayList.size() - 1);
            this.f10267u.Q.setVisibility(0);
            GradientView gradientView = this.f10267u.Q;
            Meat meat = this.f10263q.cutType.meat;
            gradientView.b(meat.underStartHex, meat.underEndHex, false);
            this.f10267u.W.setVisibility(0);
            if (meatCookingTemperature != null) {
                this.f10267u.W.b(meatCookingTemperature.endHex, this.f10263q.cutType.meat.overEndHex, false);
            } else {
                GradientView gradientView2 = this.f10267u.W;
                Meat meat2 = this.f10263q.cutType.meat;
                gradientView2.b(meat2.overStartHex, meat2.overEndHex, false);
            }
            k(arrayList.size() + 2);
            return;
        }
        k(arrayList.size());
    }

    private void j() {
        if (this.f10265s < 0) {
            return;
        }
        ArrayList<MeatCookingTemperature> temperatureRangesHavingGradient = MeatCutsHelper.getInstance().getTemperatureRangesHavingGradient(this.f10263q.temperatureRanges);
        this.f10266t = MeatCutsHelper.getInstance().getTemperaturePositionInCurrentRange(this.f10265s, temperatureRangesHavingGradient);
        this.f10264r = MeatCutsHelper.getInstance().indexOfCurrentRange(this.f10265s, temperatureRangesHavingGradient);
        int i10 = 0;
        while (i10 < temperatureRangesHavingGradient.size()) {
            int i11 = i10 + 1;
            GradientView gradientView = (GradientView) findViewById(f10262w[i11]);
            gradientView.setVisibility(0);
            gradientView.b(temperatureRangesHavingGradient.get(i10).startHex, temperatureRangesHavingGradient.get(i10).endHex, false);
            i10 = i11;
        }
        i(temperatureRangesHavingGradient);
        c(temperatureRangesHavingGradient, this.f10266t);
    }

    private void k(int i10) {
        this.f10267u.X.setWeightSum(i10);
        r2 r2Var = this.f10267u;
        g(1.0f, r2Var.Q, r2Var.R, r2Var.S, r2Var.T, r2Var.U, r2Var.V, r2Var.W);
    }

    public MeatCut getCut() {
        return this.f10263q;
    }

    public int getPeakTemperature() {
        return this.f10265s;
    }

    public boolean h(MeatCut meatCut, int i10, boolean z10, androidx.appcompat.app.c cVar) {
        this.f10263q = meatCut;
        this.f10268v = cVar;
        this.f10265s = i10;
        if (meatCut != null && meatCut.temperatureRanges.size() > 0) {
            j();
            if (z10) {
                if (this.f10267u.f8199a0.getVisibility() != 0) {
                    this.f10267u.f8199a0.setVisibility(0);
                    invalidate();
                    requestLayout();
                    return true;
                }
            } else if (this.f10267u.f8199a0.getVisibility() != 8) {
                this.f10267u.f8199a0.setVisibility(8);
                invalidate();
                requestLayout();
                return true;
            }
        }
        return false;
    }
}
