package com.apptionlabs.meater_app.qsg.ui.pairing;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.qsg.ui.pairing.DevicePairingFragment;
import e7.b;
import g6.d;
import i7.e;
import ih.t;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import wh.h0;
import wh.m;

/* compiled from: DevicePairingFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/pairing/DevicePairingFragment;", "Le7/b;", "Lih/u;", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class DevicePairingFragment extends b {

    /* compiled from: DevicePairingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9850a;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19359s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.b.f19360t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.b.f19361u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.b.f19362v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w6.b.f19364x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w6.b.f19363w.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w6.b.f19365y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9850a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(DevicePairingFragment devicePairingFragment, View view) {
        m.f(devicePairingFragment, "this$0");
        t a10 = e.a();
        m.e(a10, "actionToNearByDevicesScreen(...)");
        androidx.navigation.fragment.a.a(devicePairingFragment).S(a10);
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
        A2().f8508f0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        A2().Q.setAnimation(D2().t().E());
    }

    @Override // e7.b
    public void H2() {
        switch (a.f9850a[C2().ordinal()]) {
            case 1:
                A2().f8512j0.setText(A0(2132018110));
                return;
            case 2:
            case 3:
            case 4:
                A2().f8512j0.setText(A0(2132018109));
                return;
            case 5:
            case 6:
            case 7:
                A2().f8512j0.setText(A0(2132017354));
                return;
            default:
                return;
        }
    }

    @Override // e7.b
    public void I2() {
        AppCompatTextView appCompatTextView = A2().f8516n0;
        m.e(appCompatTextView, "whyDoINeed");
        d.g(appCompatTextView);
        if (a.f9850a[C2().ordinal()] == 1) {
            AppCompatTextView appCompatTextView2 = A2().f8513k0;
            h0 h0Var = h0.a;
            Locale locale = Locale.US;
            String A0 = A0(2132018111);
            m.e(A0, "getString(...)");
            String format = String.format(locale, A0, Arrays.copyOf(new Object[]{A0(2132018143)}, 1));
            m.e(format, "format(locale, format, *args)");
            appCompatTextView2.setText(format);
            return;
        }
        A2().f8513k0.setText(z2(2132018111));
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132017539));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: i7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevicePairingFragment.O2(DevicePairingFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void y2() {
        w6.d B2 = B2();
        w6.d dVar = w6.d.J;
        if (B2.compareTo(dVar) > 0) {
            t a10 = e.a();
            m.e(a10, "actionToNearByDevicesScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
        } else {
            D2().I(dVar);
            J2();
        }
    }

    @Override // e7.b
    public void M2() {
    }
}
