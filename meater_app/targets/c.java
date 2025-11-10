package com.apptionlabs.meater_app.targets;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.data.Appliance;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: ApplianceSafetyDialog.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/apptionlabs/meater_app/targets/c;", "Lcom/google/android/material/bottomsheet/b;", "", "U2", "Lj6/d;", "selectionListener", "Lih/u;", "X2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "K0", "Lj6/d;", "<init>", "()V", "L0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class c extends com.google.android.material.bottomsheet.b {

    /* renamed from: L0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static Appliance M0;

    /* renamed from: K0, reason: from kotlin metadata */
    private j6.d selectionListener;

    /* compiled from: ApplianceSafetyDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/apptionlabs/meater_app/targets/c$a;", "", "Lcom/apptionlabs/meater_app/data/Appliance;", "appliance", "Lcom/apptionlabs/meater_app/targets/c;", "b", "Lcom/apptionlabs/meater_app/data/Appliance;", "a", "()Lcom/apptionlabs/meater_app/data/Appliance;", "c", "(Lcom/apptionlabs/meater_app/data/Appliance;)V", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.targets.c$a, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public final Appliance a() {
            Appliance appliance = c.M0;
            if (appliance != null) {
                return appliance;
            }
            wh.m.t("appliance");
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.apptionlabs.meater_app.targets.c] */
        public final c b(Appliance appliance) {
            wh.m.f(appliance, "appliance");
            ?? cVar = new c();
            Bundle bundle = new Bundle();
            c(appliance);
            cVar.k2(bundle);
            return cVar;
        }

        public final void c(Appliance appliance) {
            wh.m.f(appliance, "<set-?>");
            c.M0 = appliance;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int U2() {
        return u0().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void V2(c cVar, View view) {
        wh.m.f(cVar, "this$0");
        Dialog D2 = cVar.D2();
        if (D2 != null) {
            D2.cancel();
        }
        j6.d dVar = cVar.selectionListener;
        if (dVar != null) {
            dVar.z(false, INSTANCE.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(c cVar, DialogInterface dialogInterface) {
        wh.m.f(cVar, "this$0");
        wh.m.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        View findViewById = aVar.findViewById(2131362313);
        if (findViewById != null) {
            int U2 = cVar.U2() - 150;
            aVar.r().R0(U2);
            findViewById.getLayoutParams().height = U2;
            BottomSheetBehavior q02 = BottomSheetBehavior.q0(findViewById);
            wh.m.e(q02, "from(...)");
            q02.J0(false);
            findViewById.getParent().getParent().requestLayout();
            findViewById.invalidate();
        }
    }

    public final void X2(j6.d dVar) {
        wh.m.f(dVar, "selectionListener");
        this.selectionListener = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        wh.m.f(inflater, "inflater");
        View inflate = inflater.inflate(2131558463, container, false);
        TextView textView = (TextView) inflate.findViewById(2131361914);
        ((TextView) inflate.findViewById(2131363220)).setText(Html.fromHtml(A0(2132018576), 0));
        if (c2() instanceof RecipeStepsActivity) {
            ((ConstraintLayout) inflate.findViewById(2131363192)).setBackgroundColor(androidx.core.content.a.c(e2(), 2131100530));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: c8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.apptionlabs.meater_app.targets.c.V2(com.apptionlabs.meater_app.targets.c.this, view);
            }
        });
        ((LottieAnimationView) inflate.findViewById(2131361988)).setAnimation(2131951623);
        Dialog D2 = D2();
        if (D2 != null) {
            D2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: c8.c
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    com.apptionlabs.meater_app.targets.c.W2(com.apptionlabs.meater_app.targets.c.this, dialogInterface);
                }
            });
        }
        lm.b.m(S(), "Charcoal Grill Safety");
        return inflate;
    }
}
