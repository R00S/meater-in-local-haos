package com.apptionlabs.meater_app.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import b6.p9;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import kotlin.Metadata;
import rk.C0465q;

/* compiled from: TemperatureView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/apptionlabs/meater_app/views/TemperatureView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lih/u;", "a", "", "temperatureX", "setTemperature", "", "temperatureText", "setTemperatureSpanAbleValues", "color", "setColor", "label", "setLabel", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Lcom/apptionlabs/meater_app/views/TemperatureView$a;", "viewType", "b", "Lcom/apptionlabs/meater_app/model/SavedCook;", "cook", "c", "Lb6/p9;", "q", "Lb6/p9;", "binding", "Lj8/q;", "r", "Lj8/q;", "indicatorModelViewModel", "s", "I", "lastTemperatureX", "getIndicatorTextValues", "()Ljava/lang/String;", "indicatorTextValues", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class TemperatureView extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private p9 binding;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C0465q indicatorModelViewModel;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int lastTemperatureX;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TemperatureView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/apptionlabs/meater_app/views/TemperatureView$a;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "s", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a {

        /* renamed from: q, reason: collision with root package name */
        public static final a f10427q = new a("Internal", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final a f10428r = new a("Target", 1);

        /* renamed from: s, reason: collision with root package name */
        public static final a f10429s = new a("Ambient", 2);

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ a[] f10430t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ ph.a f10431u;

        static {
            a[] g10 = g();
            f10430t = g10;
            f10431u = ph.b.a(g10);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] g() {
            return new a[]{f10427q, f10428r, f10429s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10430t.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemperatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        wh.m.f(context, "context");
        this.indicatorModelViewModel = new C0465q();
        a(context, attributeSet);
    }

    @SuppressLint({"RestrictedApi"})
    private final void a(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15911g, 0, 0);
        wh.m.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.binding = (p9) androidx.databinding.g.h(LayoutInflater.from(context), 2131558725, this, true);
        try {
            setColor(obtainStyledAttributes.getColor(0, -16777216));
            setLabel(obtainStyledAttributes.getString(5));
            setTemperature(obtainStyledAttributes.getInt(7, ProtocolParameters.PROBE_DEFAULT_TEMPERATURE));
            int i10 = 40;
            if (obtainStyledAttributes.getBoolean(4, false)) {
                if (!getResources().getBoolean(2131034115)) {
                    i10 = 26;
                }
                p9 p9Var = this.binding;
                if (p9Var != null && (appCompatTextView2 = p9Var.S) != null) {
                    appCompatTextView2.setAutoSizeTextTypeUniformWithConfiguration(12, i10, 1, 1);
                }
            } else {
                if (getResources().getBoolean(2131034115)) {
                    i10 = 60;
                }
                p9 p9Var2 = this.binding;
                if (p9Var2 != null && (appCompatTextView = p9Var2.S) != null) {
                    appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(12, i10, 1, 1);
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setTemperature(int i10) {
        String str;
        this.lastTemperatureX = i10;
        if (i10 != ProtocolParameters.PROBE_DEFAULT_TEMPERATURE) {
            str = Temperature.displayTemperature(Temperature.convertToUserScale(i10));
        } else {
            str = "—";
        }
        p9 p9Var = this.binding;
        wh.m.c(p9Var);
        p9Var.S.setText(str);
    }

    private final void setTemperatureSpanAbleValues(String str) {
        if (str.length() < 3) {
            return;
        }
        if (this.indicatorModelViewModel.e() != null && this.indicatorModelViewModel.equals(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(0.5f), str.length() - 3, str.length() - 1, 0);
        p9 p9Var = this.binding;
        wh.m.c(p9Var);
        p9Var.S.setText(spannableString);
    }

    public final void b(Probe probe, a aVar) {
        MEATERDeviceType mEATERDeviceType;
        p9 p9Var = this.binding;
        wh.m.c(p9Var);
        p9Var.T(this.indicatorModelViewModel);
        this.indicatorModelViewModel.l(probe, aVar);
        if (aVar == a.f10427q) {
            MEATERDeviceType.Companion companion = MEATERDeviceType.INSTANCE;
            Integer num = null;
            if (probe != null) {
                mEATERDeviceType = probe.getMEATERDeviceType();
            } else {
                mEATERDeviceType = null;
            }
            if (companion.MEATERDeviceTypeHasIndependentAmbient(mEATERDeviceType)) {
                this.indicatorModelViewModel.i(true);
                if (probe != null) {
                    num = Integer.valueOf(probe.getInternalTemperature());
                }
                wh.m.c(num);
                String displayTemperatureFloatValues = Temperature.displayTemperatureFloatValues(num.intValue());
                wh.m.e(displayTemperatureFloatValues, "displayTemperatureFloatValues(...)");
                setTemperatureSpanAbleValues(displayTemperatureFloatValues);
                return;
            }
        }
        this.indicatorModelViewModel.i(false);
    }

    public final void c(SavedCook savedCook, a aVar) {
        p9 p9Var = this.binding;
        wh.m.c(p9Var);
        p9Var.T(this.indicatorModelViewModel);
        this.indicatorModelViewModel.m(savedCook, aVar);
    }

    public final String getIndicatorTextValues() {
        p9 p9Var = this.binding;
        wh.m.c(p9Var);
        return p9Var.S.getText().toString();
    }

    public final void setColor(int i10) {
        p9 p9Var = this.binding;
        wh.m.c(p9Var);
        f8.q0.d(p9Var.S.getBackground(), i10, false);
    }

    public final void setLabel(String str) {
        p9 p9Var = this.binding;
        wh.m.c(p9Var);
        p9Var.R.setText(str);
    }
}
