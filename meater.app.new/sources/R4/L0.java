package R4;

import L4.g1;
import P5.C1609q;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.utils.ShareBroadcastReceiver;
import com.apptionlabs.meater_app.views.C2421z;
import com.apptionlabs.meater_app.views.CookGraph;
import g.AbstractC3371c;
import g.C3369a;
import g.InterfaceC3370b;
import h.C3469d;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x4.b;

/* compiled from: SocialShareFragment.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J-\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\u0003R\u0014\u00106\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u0016\u0010S\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010NR\u0016\u0010U\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u0016\u0010W\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010NR0\u0010a\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010Y0Y0X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R0\u0010e\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010Y0Y0X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`¨\u0006f"}, d2 = {"LR4/L0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "N2", "(Landroid/view/View;)V", "", "isChecked", "V2", "(Z)V", "Lcom/apptionlabs/meater_app/model/SavedCook;", "savedCook", "W2", "(Lcom/apptionlabs/meater_app/model/SavedCook;)V", "Landroid/net/Uri;", "photoUri", "g3", "(Landroid/net/Uri;)V", "K2", "Z2", "combinedUri", "Y2", "M2", "()Z", "f3", "e3", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "d1", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "a1", "(Landroid/os/Bundle;)V", "x1", "y1", "f1", "", "G0", "I", "CHOOSER_REQUEST_CODE", "LL4/g1;", "H0", "LL4/g1;", "binding", "LT5/r;", "I0", "LT5/r;", "viewModel", "Landroid/widget/TextView;", "J0", "Landroid/widget/TextView;", "menuTitle", "Landroid/widget/FrameLayout;", "K0", "Landroid/widget/FrameLayout;", "mFrameLayout", "", "L0", "Ljava/lang/String;", "screenTitle", "M0", "Landroid/net/Uri;", "N0", "Z", "ignoreListener", "O0", "hasShared", "P0", "showPhotoEnabled", "Q0", "showGraphEnabled", "R0", "showCookDetail", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "S0", "Lg/c;", "getTakePhotoLauncher", "()Lg/c;", "setTakePhotoLauncher", "(Lg/c;)V", "takePhotoLauncher", "T0", "getChoosePhotoLauncher", "setChoosePhotoLauncher", "choosePhotoLauncher", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class L0 extends Fragment {

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private g1 binding;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private T5.r viewModel;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private TextView menuTitle;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout mFrameLayout;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    private String screenTitle;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private Uri photoUri;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreListener;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private boolean hasShared;

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata */
    private boolean showPhotoEnabled;

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata */
    private AbstractC3371c<Intent> takePhotoLauncher;

    /* renamed from: T0, reason: collision with root package name and from kotlin metadata */
    private AbstractC3371c<Intent> choosePhotoLauncher;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private final int CHOOSER_REQUEST_CODE = 7576;

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata */
    private boolean showGraphEnabled = true;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    private boolean showCookDetail = true;

    public L0() {
        AbstractC3371c<Intent> abstractC3371cA2 = a2(new C3469d(), new InterfaceC3370b() { // from class: R4.C0
            @Override // g.InterfaceC3370b
            public final void a(Object obj) throws Resources.NotFoundException {
                L0.d3(this.f14804a, (C3369a) obj);
            }
        });
        C3862t.f(abstractC3371cA2, "registerForActivityResult(...)");
        this.takePhotoLauncher = abstractC3371cA2;
        AbstractC3371c<Intent> abstractC3371cA22 = a2(new C3469d(), new InterfaceC3370b() { // from class: R4.D0
            @Override // g.InterfaceC3370b
            public final void a(Object obj) throws Resources.NotFoundException {
                L0.L2(this.f14805a, (C3369a) obj);
            }
        });
        C3862t.f(abstractC3371cA22, "registerForActivityResult(...)");
        this.choosePhotoLauncher = abstractC3371cA22;
    }

    private final void K2() {
        int dimension = x4.g.h().getResources().getConfiguration().orientation == 2 ? (int) u0().getDimension(R.dimen.max_screen_width) : u0().getDisplayMetrics().widthPixels;
        g1 g1Var = this.binding;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        g1Var.f10067j.getLayoutParams().height = (dimension / 4) * 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(L0 l02, C3369a result) throws Resources.NotFoundException {
        C3862t.g(result, "result");
        if (result.getResultCode() != -1 || result.getData() == null) {
            l02.g3(null);
        } else {
            Intent data = result.getData();
            l02.g3(data != null ? data.getData() : null);
        }
    }

    private final boolean M2() {
        g1 g1Var = this.binding;
        g1 g1Var2 = null;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        if (!g1Var.f10074q.isChecked()) {
            g1 g1Var3 = this.binding;
            if (g1Var3 == null) {
                C3862t.u("binding");
            } else {
                g1Var2 = g1Var3;
            }
            if (!g1Var2.f10073p.isChecked()) {
                return false;
            }
        }
        return true;
    }

    private final void N2(View view) throws Resources.NotFoundException {
        m2(true);
        K2();
        g1 g1Var = null;
        if (P5.Q.v(Z())) {
            g1 g1Var2 = this.binding;
            if (g1Var2 == null) {
                C3862t.u("binding");
                g1Var2 = null;
            }
            P5.S.h(g1Var2.f10064g, R.color.grey_f6, true);
        }
        this.viewModel = (T5.r) new android.view.a0(this).b(T5.r.class);
        Bundle bundleX = X();
        Long lValueOf = bundleX != null ? Long.valueOf(bundleX.getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L)) : null;
        C3862t.e(lValueOf, "null cannot be cast to non-null type kotlin.Long");
        SavedCook savedCookF = LocalStorage.sharedStorage().savedCookDAO().f(lValueOf.longValue());
        if (savedCookF == null) {
            savedCookF = null;
        }
        g1 g1Var3 = this.binding;
        if (g1Var3 == null) {
            C3862t.u("binding");
            g1Var3 = null;
        }
        g1Var3.f10073p.setChecked(this.showGraphEnabled);
        g1 g1Var4 = this.binding;
        if (g1Var4 == null) {
            C3862t.u("binding");
            g1Var4 = null;
        }
        g1Var4.f10074q.setChecked(this.showPhotoEnabled);
        g1 g1Var5 = this.binding;
        if (g1Var5 == null) {
            C3862t.u("binding");
            g1Var5 = null;
        }
        g1Var5.f10072o.setChecked(this.showCookDetail);
        if (this.showPhotoEnabled) {
            V2(true);
            g1 g1Var6 = this.binding;
            if (g1Var6 == null) {
                C3862t.u("binding");
                g1Var6 = null;
            }
            g1Var6.f10073p.setChecked(false);
        }
        g1 g1Var7 = this.binding;
        if (g1Var7 == null) {
            C3862t.u("binding");
            g1Var7 = null;
        }
        CookGraph cookGraph = g1Var7.f10065h;
        g1 g1Var8 = this.binding;
        if (g1Var8 == null) {
            C3862t.u("binding");
            g1Var8 = null;
        }
        cookGraph.setVisibility(g1Var8.f10073p.isChecked() ? 0 : 8);
        g1 g1Var9 = this.binding;
        if (g1Var9 == null) {
            C3862t.u("binding");
            g1Var9 = null;
        }
        LinearLayout linearLayout = g1Var9.f10068k;
        g1 g1Var10 = this.binding;
        if (g1Var10 == null) {
            C3862t.u("binding");
            g1Var10 = null;
        }
        linearLayout.setVisibility(g1Var10.f10072o.isChecked() ? 0 : 8);
        f3();
        if (savedCookF != null) {
            W2(savedCookF);
        }
        g1 g1Var11 = this.binding;
        if (g1Var11 == null) {
            C3862t.u("binding");
            g1Var11 = null;
        }
        g1Var11.f10059b.setOnClickListener(new View.OnClickListener() { // from class: R4.E0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                L0.O2(this.f14815B, view2);
            }
        });
        g1 g1Var12 = this.binding;
        if (g1Var12 == null) {
            C3862t.u("binding");
            g1Var12 = null;
        }
        g1Var12.f10074q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: R4.F0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                L0.P2(this.f14817a, compoundButton, z10);
            }
        });
        g1 g1Var13 = this.binding;
        if (g1Var13 == null) {
            C3862t.u("binding");
            g1Var13 = null;
        }
        g1Var13.f10072o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: R4.G0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                L0.Q2(this.f14821a, compoundButton, z10);
            }
        });
        g1 g1Var14 = this.binding;
        if (g1Var14 == null) {
            C3862t.u("binding");
        } else {
            g1Var = g1Var14;
        }
        g1Var.f10073p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: R4.H0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                L0.R2(this.f14822a, compoundButton, z10);
            }
        });
        FrameLayout frameLayout = this.mFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(L0 l02, View view) {
        l02.Z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(L0 l02, CompoundButton compoundButton, boolean z10) {
        l02.V2(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(L0 l02, CompoundButton compoundButton, boolean z10) {
        g1 g1Var = l02.binding;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        g1Var.f10068k.setVisibility(z10 ? 0 : 8);
        l02.f3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(L0 l02, CompoundButton compoundButton, boolean z10) {
        g1 g1Var = l02.binding;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        g1Var.f10065h.setVisibility(z10 ? 0 : 8);
        l02.f3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(final L0 l02, View view) {
        if (l02.M2()) {
            T5.r rVar = l02.viewModel;
            g1 g1Var = null;
            if (rVar == null) {
                C3862t.u("viewModel");
                rVar = null;
            }
            g1 g1Var2 = l02.binding;
            if (g1Var2 == null) {
                C3862t.u("binding");
            } else {
                g1Var = g1Var2;
            }
            rVar.j(g1Var.f10067j, new C1609q.a() { // from class: R4.A0
                @Override // P5.C1609q.a
                public final void a(Uri uri) {
                    L0.T2(this.f14796a, uri);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(L0 l02, Uri it) {
        C3862t.g(it, "it");
        l02.Y2(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(L0 l02) {
        T5.r rVar = l02.viewModel;
        if (rVar == null) {
            C3862t.u("viewModel");
            rVar = null;
        }
        rVar.i();
    }

    private final void V2(boolean isChecked) {
        if (this.ignoreListener) {
            this.ignoreListener = false;
            return;
        }
        if (this.photoUri == null) {
            Z2();
            return;
        }
        g1 g1Var = null;
        if (isChecked) {
            com.bumptech.glide.j<Drawable> jVarB = com.bumptech.glide.b.t(x4.g.h()).t(this.photoUri).b(new D6.g().Y(600, 480));
            g1 g1Var2 = this.binding;
            if (g1Var2 == null) {
                C3862t.u("binding");
                g1Var2 = null;
            }
            jVarB.H0(g1Var2.f10070m);
        }
        e3();
        g1 g1Var3 = this.binding;
        if (g1Var3 == null) {
            C3862t.u("binding");
        } else {
            g1Var = g1Var3;
        }
        g1Var.f10070m.setVisibility(isChecked ? 0 : 8);
        f3();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void W2(SavedCook savedCook) {
        g1 g1Var = this.binding;
        g1 g1Var2 = null;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        g1Var.f10065h.setLabelTextSize(16);
        g1 g1Var3 = this.binding;
        if (g1Var3 == null) {
            C3862t.u("binding");
            g1Var3 = null;
        }
        g1Var3.f10065h.setTemperatureLog(savedCook.getTemperatureLog());
        g1 g1Var4 = this.binding;
        if (g1Var4 == null) {
            C3862t.u("binding");
            g1Var4 = null;
        }
        g1Var4.f10065h.setTargetTemp(savedCook.getTargetTemperature());
        g1 g1Var5 = this.binding;
        if (g1Var5 == null) {
            C3862t.u("binding");
            g1Var5 = null;
        }
        P5.S.e(g1Var5.f10064g, MeatCutsHelper.getInstance().getMeatIcon(savedCook.getCutId()));
        g1 g1Var6 = this.binding;
        if (g1Var6 == null) {
            C3862t.u("binding");
            g1Var6 = null;
        }
        P5.S.d(g1Var6.f10064g.getBackground(), Color.parseColor(MeatCutsHelper.getInstance().getMeatColor(savedCook.getCutId())), true);
        g1 g1Var7 = this.binding;
        if (g1Var7 == null) {
            C3862t.u("binding");
            g1Var7 = null;
        }
        g1Var7.f10062e.setText(savedCook.textDetailCookDescription());
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(savedCook.getCutId());
        Bundle bundleX = X();
        int i10 = bundleX != null ? bundleX.getInt(MEATERIntent.EXTRA_COOK_SUMMARY_BAR_VISIBILITY, 8) : 8;
        if (i10 != 0) {
            g1 g1Var8 = this.binding;
            if (g1Var8 == null) {
                C3862t.u("binding");
                g1Var8 = null;
            }
            g1Var8.f10069l.setVisibility(i10);
            g1 g1Var9 = this.binding;
            if (g1Var9 == null) {
                C3862t.u("binding");
                g1Var9 = null;
            }
            g1Var9.f10069l.h(meatCut, Temperature.convertToUserScale(savedCook.getPeakTemperature()), false, null);
        }
        g1 g1Var10 = this.binding;
        if (g1Var10 == null) {
            C3862t.u("binding");
        } else {
            g1Var2 = g1Var10;
        }
        g1Var2.f10065h.setOnTouchListener(new View.OnTouchListener() { // from class: R4.B0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return L0.X2(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X2(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void Y2(Uri combinedUri) {
        this.hasShared = true;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", combinedUri);
        intent.putExtra("android.intent.extra.TEXT", A0(R.string.hash_tag_meatermade));
        intent.setType("image/jpeg");
        String strA0 = A0(R.string.meater_label);
        C3862t.f(strA0, "getString(...)");
        t2(Intent.createChooser(intent, strA0, PendingIntent.getBroadcast(x4.g.h(), this.CHOOSER_REQUEST_CODE, new Intent(x4.g.h(), (Class<?>) ShareBroadcastReceiver.class), new D4.d(134217728, false, 2, null).getFlags()).getIntentSender()));
    }

    private final void Z2() {
        androidx.fragment.app.o oVarT = T();
        if (oVarT != null) {
            androidx.fragment.app.o oVar = !oVarT.isFinishing() ? oVarT : null;
            if (oVar == null) {
                return;
            }
            C2421z.Companion companion = C2421z.INSTANCE;
            String strA0 = A0(R.string.share_your_cook);
            C3862t.f(strA0, "getString(...)");
            String strA02 = A0(R.string.would_you_like_include_photo);
            C3862t.f(strA02, "getString(...)");
            String strA03 = A0(R.string.take_a_photo);
            C3862t.f(strA03, "getString(...)");
            C2421z.AlertPair alertPair = new C2421z.AlertPair(strA03, new T4.e() { // from class: R4.J0
                @Override // T4.e
                public final void a() {
                    L0.a3(this.f14825a);
                }
            });
            String strA04 = A0(R.string.select_a_previous_photo);
            C3862t.f(strA04, "getString(...)");
            C2421z.AlertPair alertPair2 = new C2421z.AlertPair(strA04, new T4.e() { // from class: R4.K0
                @Override // T4.e
                public final void a() {
                    L0.b3(this.f14831a);
                }
            });
            String strA05 = A0(R.string.cancel_label);
            C3862t.f(strA05, "getString(...)");
            AlertDialog alertDialogE = companion.e(oVar, strA0, strA02, false, alertPair, alertPair2, new C2421z.AlertPair(strA05, null, 2, null));
            alertDialogE.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: R4.z0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) throws Resources.NotFoundException {
                    L0.c3(this.f15027B, dialogInterface);
                }
            });
            alertDialogE.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(L0 l02) {
        T5.r rVar = l02.viewModel;
        if (rVar == null) {
            C3862t.u("viewModel");
            rVar = null;
        }
        Intent intentK = rVar.k();
        if (intentK != null) {
            l02.takePhotoLauncher.a(intentK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b3(L0 l02) {
        T5.r rVar = l02.viewModel;
        if (rVar == null) {
            C3862t.u("viewModel");
            rVar = null;
        }
        Intent intentL = rVar.l();
        if (intentL != null) {
            l02.choosePhotoLauncher.a(intentL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(L0 l02, DialogInterface dialogInterface) throws Resources.NotFoundException {
        if (l02.photoUri == null) {
            g1 g1Var = l02.binding;
            g1 g1Var2 = null;
            if (g1Var == null) {
                C3862t.u("binding");
                g1Var = null;
            }
            if (g1Var.f10074q.isChecked()) {
                l02.ignoreListener = true;
                g1 g1Var3 = l02.binding;
                if (g1Var3 == null) {
                    C3862t.u("binding");
                } else {
                    g1Var2 = g1Var3;
                }
                g1Var2.f10074q.setChecked(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(L0 l02, C3369a result) throws Resources.NotFoundException {
        C3862t.g(result, "result");
        T5.r rVar = null;
        if (result.getResultCode() != -1) {
            l02.g3(null);
            return;
        }
        T5.r rVar2 = l02.viewModel;
        if (rVar2 == null) {
            C3862t.u("viewModel");
        } else {
            rVar = rVar2;
        }
        l02.g3(rVar.m());
    }

    private final void e3() {
        g1 g1Var = this.binding;
        g1 g1Var2 = null;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        if (!g1Var.f10074q.isChecked() || this.photoUri == null) {
            g1 g1Var3 = this.binding;
            if (g1Var3 == null) {
                C3862t.u("binding");
            } else {
                g1Var2 = g1Var3;
            }
            g1Var2.f10059b.setText(A0(R.string.add_photo));
            return;
        }
        g1 g1Var4 = this.binding;
        if (g1Var4 == null) {
            C3862t.u("binding");
        } else {
            g1Var2 = g1Var4;
        }
        g1Var2.f10059b.setText(A0(R.string.edit_photo));
    }

    private final void f3() {
        boolean zM2 = M2();
        g1 g1Var = this.binding;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        g1Var.f10067j.setVisibility(!zM2 ? 8 : 0);
        TextView textView = this.menuTitle;
        if (textView != null) {
            textView.setTextColor(zM2 ? P5.Q.j(Z(), R.color.primary_color) : -12303292);
        }
    }

    private final void g3(Uri photoUri) throws Resources.NotFoundException {
        if (photoUri == null) {
            return;
        }
        this.photoUri = photoUri;
        g1 g1Var = this.binding;
        g1 g1Var2 = null;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        g1Var.f10070m.setImageURI(null);
        com.bumptech.glide.j<Drawable> jVarB = com.bumptech.glide.b.t(x4.g.h()).t(photoUri).b(new D6.g().Y(600, 480));
        g1 g1Var3 = this.binding;
        if (g1Var3 == null) {
            C3862t.u("binding");
            g1Var3 = null;
        }
        jVarB.H0(g1Var3.f10070m);
        g1 g1Var4 = this.binding;
        if (g1Var4 == null) {
            C3862t.u("binding");
            g1Var4 = null;
        }
        g1Var4.f10070m.setVisibility(0);
        g1 g1Var5 = this.binding;
        if (g1Var5 == null) {
            C3862t.u("binding");
            g1Var5 = null;
        }
        g1Var5.f10065h.setVisibility(8);
        g1 g1Var6 = this.binding;
        if (g1Var6 == null) {
            C3862t.u("binding");
            g1Var6 = null;
        }
        g1Var6.f10073p.setChecked(false);
        g1 g1Var7 = this.binding;
        if (g1Var7 == null) {
            C3862t.u("binding");
        } else {
            g1Var2 = g1Var7;
        }
        g1Var2.f10074q.setChecked(true);
        f3();
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle savedInstanceState) {
        super.a1(savedInstanceState);
        x4.b.j(b.EnumC0768b.f52639H.title, "", "", null, 8, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void d1(Menu menu, MenuInflater inflater) {
        C3862t.g(menu, "menu");
        C3862t.g(inflater, "inflater");
        super.d1(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_target_setup, menu);
        androidx.fragment.app.o oVarT = T();
        if (oVarT == null) {
            return;
        }
        View viewInflate = oVarT.getLayoutInflater().inflate(R.layout.action_bar_menu_layout, (ViewGroup) new LinearLayout(oVarT), false);
        menu.findItem(R.id.menu_target_setup_text).setActionView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.actionbar_menu);
        this.menuTitle = textView;
        if (textView != null) {
            textView.setText(A0(R.string.share));
        }
        TextView textView2 = this.menuTitle;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: R4.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.S2(this.f15026B, view);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) throws Resources.NotFoundException {
        C3862t.g(inflater, "inflater");
        Context contextZ = Z();
        g1 g1Var = null;
        FrameLayout frameLayout = contextZ != null ? new FrameLayout(contextZ) : null;
        this.mFrameLayout = frameLayout;
        this.binding = g1.c(inflater, frameLayout, false);
        androidx.fragment.app.o oVarC2 = c2();
        C3862t.e(oVarC2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) oVarC2;
        g1 g1Var2 = this.binding;
        if (g1Var2 == null) {
            C3862t.u("binding");
            g1Var2 = null;
        }
        cVar.R0(g1Var2.f10075r);
        g1 g1Var3 = this.binding;
        if (g1Var3 == null) {
            C3862t.u("binding");
        } else {
            g1Var = g1Var3;
        }
        ConstraintLayout constraintLayoutB = g1Var.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        N2(constraintLayoutB);
        return this.mFrameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void f1() {
        super.f1();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: R4.I0
            @Override // java.lang.Runnable
            public final void run() {
                L0.U2(this.f14824B);
            }
        }, 1L);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) throws Resources.NotFoundException {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        g1 g1Var = this.binding;
        g1 g1Var2 = null;
        if (g1Var == null) {
            C3862t.u("binding");
            g1Var = null;
        }
        this.showGraphEnabled = g1Var.f10073p.isChecked();
        g1 g1Var3 = this.binding;
        if (g1Var3 == null) {
            C3862t.u("binding");
            g1Var3 = null;
        }
        this.showPhotoEnabled = g1Var3.f10074q.isChecked();
        g1 g1Var4 = this.binding;
        if (g1Var4 == null) {
            C3862t.u("binding");
            g1Var4 = null;
        }
        this.showCookDetail = g1Var4.f10072o.isChecked();
        FrameLayout frameLayout = this.mFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        androidx.fragment.app.o oVarT = T();
        if (oVarT == null) {
            return;
        }
        Object systemService = oVarT.getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        g1 g1VarC = g1.c((LayoutInflater) systemService, null, false);
        this.binding = g1VarC;
        if (g1VarC == null) {
            C3862t.u("binding");
        } else {
            g1Var2 = g1VarC;
        }
        ConstraintLayout constraintLayoutB = g1Var2.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        N2(constraintLayoutB);
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        androidx.fragment.app.o oVarT = T();
        CookHistory cookHistory = oVarT instanceof CookHistory ? (CookHistory) oVarT : null;
        if (cookHistory == null) {
            return;
        }
        this.screenTitle = cookHistory.getTitle().toString();
        cookHistory.m2(8);
        cookHistory.setTitle(R.string.preview);
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        androidx.fragment.app.o oVarT = T();
        CookHistory cookHistory = oVarT instanceof CookHistory ? (CookHistory) oVarT : null;
        if (cookHistory == null) {
            return;
        }
        cookHistory.m2(0);
        cookHistory.setTitle(this.screenTitle);
        if (!this.hasShared) {
            x4.b.j(b.EnumC0768b.f52645J.title, "", "", null, 8, null);
        }
        e3();
    }
}
