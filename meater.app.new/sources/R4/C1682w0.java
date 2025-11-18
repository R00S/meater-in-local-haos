package R4;

import M4.h;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ProbeSensorBottomSheet.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 02\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\"¨\u00063"}, d2 = {"LR4/w0;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "", "id", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "color", "Loa/F;", "d3", "(ILcom/airbnb/lottie/LottieAnimationView;I)V", "", "input", "LL3/H;", "textViewDelegate", "lottieAnimationView", "sensorValues", "f3", "(Ljava/lang/String;LL3/H;Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V", "g3", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "x1", "LR4/w0$a;", "buttonListener", "b3", "(LR4/w0$a;)V", "X0", "Ljava/lang/String;", "selectedSensorValue", "", "Y0", "Z", "darkTheme", "Z0", "LR4/w0$a;", "getListener", "()LR4/w0$a;", "setListener", "listener", "a1", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: R4.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1682w0 extends com.google.android.material.bottomsheet.b {

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b1, reason: collision with root package name */
    public static final int f15011b1 = 8;

    /* renamed from: c1, reason: collision with root package name */
    private static long f15012c1;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private String selectedSensorValue = "";

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    private boolean darkTheme;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private a listener;

    /* compiled from: ProbeSensorBottomSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR4/w0$a;", "", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.w0$a */
    public interface a {
    }

    /* compiled from: ProbeSensorBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LR4/w0$b;", "", "<init>", "()V", "", "deviceId", "LR4/w0;", "a", "(J)LR4/w0;", "probeId", "J", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.w0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C1682w0 a(long deviceId) {
            C1682w0 c1682w0 = new C1682w0();
            Bundle bundle = new Bundle();
            C1682w0.f15012c1 = deviceId;
            c1682w0.k2(bundle);
            return c1682w0;
        }

        private Companion() {
        }
    }

    /* compiled from: ProbeSensorBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R4/w0$c", "LM4/h$a;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.w0$c */
    public static final class c implements h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L3.H f15017b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f15018c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f15019d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f15020e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f15021f;

        c(L3.H h10, LottieAnimationView lottieAnimationView, Integer num, Integer num2, Integer num3) {
            this.f15017b = h10;
            this.f15018c = lottieAnimationView;
            this.f15019d = num;
            this.f15020e = num2;
            this.f15021f = num3;
        }

        @Override // M4.h.a
        public void a(MEATERDevice device) {
            C3862t.g(device, "device");
            if (device.isMEATERProbe()) {
                Probe probe = (Probe) device;
                C1682w0.this.selectedSensorValue = Temperature.displayTemperatureFloatValues(probe.getInternalTemperature());
                C1682w0 c1682w0 = C1682w0.this;
                L3.H h10 = this.f15017b;
                LottieAnimationView lottieAnimationView = this.f15018c;
                C3862t.d(lottieAnimationView);
                String strDisplayTemperature = Temperature.displayTemperature(probe.getTemperatures().ambientTemperature);
                C3862t.f(strDisplayTemperature, "displayTemperature(...)");
                c1682w0.f3("a0", h10, lottieAnimationView, strDisplayTemperature);
                int[] internalTemperatures = probe.getTemperatures().internalTemperatures;
                C3862t.f(internalTemperatures, "internalTemperatures");
                int length = internalTemperatures.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String strDisplayTemperatureFloatValues = Temperature.displayTemperatureFloatValues(internalTemperatures[i10]);
                    C3862t.f(strDisplayTemperatureFloatValues, "displayTemperatureFloatValues(...)");
                    if (C3862t.b(C1682w0.this.selectedSensorValue, strDisplayTemperatureFloatValues)) {
                        C1682w0 c1682w02 = C1682w0.this;
                        LottieAnimationView lottieAnimationView2 = this.f15018c;
                        C3862t.d(lottieAnimationView2);
                        Integer num = this.f15019d;
                        C3862t.d(num);
                        c1682w02.d3(i10, lottieAnimationView2, num.intValue());
                        C1682w0 c1682w03 = C1682w0.this;
                        LottieAnimationView lottieAnimationView3 = this.f15018c;
                        C3862t.d(lottieAnimationView3);
                        c1682w03.g3(i10, lottieAnimationView3, -1);
                    } else {
                        C1682w0 c1682w04 = C1682w0.this;
                        LottieAnimationView lottieAnimationView4 = this.f15018c;
                        C3862t.d(lottieAnimationView4);
                        Integer num2 = this.f15020e;
                        C3862t.d(num2);
                        c1682w04.d3(i10, lottieAnimationView4, num2.intValue());
                        C1682w0 c1682w05 = C1682w0.this;
                        LottieAnimationView lottieAnimationView5 = this.f15018c;
                        C3862t.d(lottieAnimationView5);
                        Integer num3 = this.f15021f;
                        C3862t.d(num3);
                        c1682w05.g3(i10, lottieAnimationView5, num3.intValue());
                    }
                    L3.H h11 = this.f15017b;
                    LottieAnimationView lottieAnimationView6 = this.f15018c;
                    C3862t.d(lottieAnimationView6);
                    C1682w0.this.f3("i" + i10, h11, lottieAnimationView6, strDisplayTemperatureFloatValues);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(C1682w0 c1682w0, View view) {
        P5.Q.G(c1682w0.Z(), "http://support.meater.com/faqs/multiple-sensors");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3(int id2, LottieAnimationView lottieView, final int color) {
        lottieView.j(new Q3.e("i" + id2 + "_background", "**"), L3.y.f9222a, new Y3.e() { // from class: R4.v0
            @Override // Y3.e
            public final Object a(Y3.b bVar) {
                return C1682w0.e3(color, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer e3(int i10, Y3.b bVar) {
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3(String input, L3.H textViewDelegate, LottieAnimationView lottieAnimationView, String sensorValues) {
        textViewDelegate.e(input, sensorValues);
        lottieAnimationView.setTextDelegate(textViewDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(int id2, LottieAnimationView lottieView, final int color) {
        lottieView.j(new Q3.e("i" + id2, "**"), L3.y.f9222a, new Y3.e() { // from class: R4.u0
            @Override // Y3.e
            public final Object a(Y3.b bVar) {
                return C1682w0.h3(color, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer h3(int i10, Y3.b bVar) {
        return Integer.valueOf(i10);
    }

    public final void b3(a buttonListener) {
        C3862t.g(buttonListener, "buttonListener");
        this.listener = buttonListener;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.probe_sensor_views, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        TextView textView = (TextView) viewInflate.findViewById(R.id.moreInfo);
        SpannableString spannableString = new SpannableString(A0(R.string.more_information));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: R4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1682w0.c3(this.f15004B, view);
            }
        });
        textView.setText(spannableString);
        this.darkTheme = P5.Q.v(Z());
        Context contextZ = Z();
        Integer numValueOf = contextZ != null ? Integer.valueOf(contextZ.getColor(R.color.meater_pink)) : null;
        Context contextZ2 = Z();
        Integer numValueOf2 = contextZ2 != null ? Integer.valueOf(contextZ2.getColor(R.color.white)) : null;
        Context contextZ3 = Z();
        Integer numValueOf3 = contextZ3 != null ? Integer.valueOf(contextZ3.getColor(R.color.black_color)) : null;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate.findViewById(R.id.animationView);
        lottieAnimationView.setAnimation(R.raw.six_sensors);
        M4.h.f11978a.A(this, f15012c1, new c(new L3.H(lottieAnimationView), lottieAnimationView, numValueOf, numValueOf2, numValueOf3));
        lottieAnimationView.v();
        return viewInflate;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        Object parent = f2().getParent();
        C3862t.e(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0((View) parent);
        C3862t.f(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.W0(3);
    }
}
