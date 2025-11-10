package com.apptionlabs.meater_app.qsg.ui.info;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.qsg.ui.info.PermissionsDisabledFragment;
import e7.b;
import f8.l0;
import g6.d;
import i6.c;
import ih.t;
import kotlin.Metadata;
import rk.b0;
import wh.m;

/* compiled from: PermissionsDisabledFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/PermissionsDisabledFragment;", "Le7/b;", "", "P2", "Lih/u;", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "v1", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class PermissionsDisabledFragment extends b {
    private final boolean P2() {
        ih.a aVar = ih.a.f268a;
        Context e22 = e2();
        m.e(e22, "requireContext(...)");
        return aVar.d(e22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(PermissionsDisabledFragment permissionsDisabledFragment, View view) {
        m.f(permissionsDisabledFragment, "this$0");
        if (!permissionsDisabledFragment.P2()) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", permissionsDisabledFragment.c2().getPackageName(), null));
            permissionsDisabledFragment.t2(intent);
            return;
        }
        t a10 = b0.a();
        m.e(a10, "actionToImportantAlertScreen(...)");
        androidx.navigation.fragment.a.a(permissionsDisabledFragment).S(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(PermissionsDisabledFragment permissionsDisabledFragment, View view) {
        m.f(permissionsDisabledFragment, "this$0");
        if (ih.a.f268a.b()) {
            l0.H(permissionsDisabledFragment.Y(), c.INSTANCE.m());
        } else {
            l0.H(permissionsDisabledFragment.Y(), c.INSTANCE.l());
        }
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        if (ih.a.f268a.b()) {
            A2().Q.setAnimation(2131951687);
        } else {
            A2().Q.setAnimation(2131951721);
        }
    }

    @Override // e7.b
    public void H2() {
        if (ih.a.f268a.b()) {
            A2().f8512j0.setText(A0(2132018282));
        } else {
            A2().f8512j0.setText(A0(2132018002));
        }
    }

    @Override // e7.b
    public void I2() {
        if (ih.a.f268a.b()) {
            A2().f8513k0.setText(A0(2132018283));
        } else {
            A2().f8513k0.setText(A0(2132018003));
        }
    }

    @Override // e7.b
    public void L2() {
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: g7.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionsDisabledFragment.Q2(PermissionsDisabledFragment.this, view);
            }
        });
    }

    @Override // e7.b
    public void M2() {
        if (ih.a.f268a.b()) {
            A2().f8516n0.setText(A0(2132018285));
        } else {
            A2().f8516n0.setText(A0(2132018008));
        }
        A2().f8516n0.setVisibility(0);
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: g7.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionsDisabledFragment.R2(PermissionsDisabledFragment.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (!P2()) {
            A2().S.setText(A0(2132017818));
            return;
        }
        A2().S.setText(A0(2132017539));
        TextView textView = A2().f8512j0;
        m.e(textView, "screenSubTitle");
        d.i(textView);
        LottieAnimationView lottieAnimationView = A2().Y;
        m.e(lottieAnimationView, "greenTick");
        d.j(lottieAnimationView);
        A2().Y.setAnimation(2131951716);
    }

    @Override // e7.b
    public void y2() {
        w6.d B2 = B2();
        ih.a aVar = ih.a.f268a;
        Context e22 = e2();
        m.e(e22, "requireContext(...)");
        if (aVar.d(e22) && B2.compareTo(w6.d.E) > 0) {
            t a10 = b0.a();
            m.e(a10, "actionToImportantAlertScreen(...)");
            androidx.navigation.fragment.a.a(this).S(a10);
            return;
        }
        D2().I(w6.d.E);
    }
}
