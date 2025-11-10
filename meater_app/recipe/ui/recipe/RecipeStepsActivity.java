package com.apptionlabs.meater_app.recipe.ui.recipe;

import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.AbstractC0397k;
import android.view.ComponentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.s0;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import b6.a0;
import c6.h;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.apptionlabs.meater_app.recipe.ui.summary.RecipeSummaryActivity;
import com.apptionlabs.meater_app.targets.c;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.views.b0;
import h6.x2;
import i5.Alert;
import i5.Meta;
import i5.OnCompleteAction;
import i5.Recipe;
import ih.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import rk.C0482q;
import rk.C0504g;
import rk.C0540h;
import rk.C0542j;
import rk.C0555w;
import rk.C0557y;
import wh.d0;

/* compiled from: RecipeStepsActivity.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\b*\u0002QU\u0018\u00002\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\bY\u0010ZJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\u0012\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u0004H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0002R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R*\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity;", "Lcom/apptionlabs/meater_app/activities/j;", "Landroid/os/Bundle;", "savedInstanceState", "Lih/u;", "onCreate", "D2", "A2", "onResume", "onStop", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "F2", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Li5/o;", "recipe", "u2", "r2", "x2", "", "stepNumber", "s2", "numberOfStepsToSkip", "w2", "E2", "isRecipeCancelled", "y2", "z2", "C2", "Ln7/h;", "screenType", "B2", "a0", "Landroid/view/Menu;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b0", "Ljava/util/ArrayList;", "stepList", "Landroidx/fragment/app/m;", "c0", "Landroidx/fragment/app/m;", "dialog", "Landroid/hardware/Sensor;", "d0", "Landroid/hardware/Sensor;", "proximitySensor", "Landroid/hardware/SensorManager;", "e0", "Landroid/hardware/SensorManager;", "sensorManager", "Ll7/q;", "f0", "Ll7/q;", "adapter", "Lb6/a0;", "g0", "Lb6/a0;", "binding", "h0", "I", "recipeId", "Lq7/g;", "i0", "Lih/g;", "t2", "()Lq7/g;", "viewModel", "Landroid/hardware/SensorEventListener;", "j0", "Landroid/hardware/SensorEventListener;", "proximitySensorEventListener", "com/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$j", "k0", "Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$j;", "probeUpdateListener", "com/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$i", "l0", "Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$i;", "pageSelectionListener", "<init>", "()V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class RecipeStepsActivity extends com.apptionlabs.meater_app.activities.j {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private Menu menu;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Integer> stepList;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private androidx.fragment.app.m dialog;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private Sensor proximitySensor;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private SensorManager sensorManager;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private C0482q adapter;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private a0 binding;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private int recipeId = -1;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final ih.g viewModel = new s0(d0.b(C0504g.class), new o(this), new n(this, null, null, bm.a.a(this)));

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private SensorEventListener proximitySensorEventListener = new k();

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private final j probeUpdateListener = new j();

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private final i pageSelectionListener = new i();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$a;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a {

        /* renamed from: q, reason: collision with root package name */
        public static final a f9948q = new a("INGREDIENTS", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final a f9949r = new a("TOOLS", 1);

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ a[] f9950s;

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ ph.a f9951t;

        static {
            a[] g10 = g();
            f9950s = g10;
            f9951t = ph.b.a(g10);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] g() {
            return new a[]{f9948q, f9949r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9950s.clone();
        }
    }

    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9952a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9953b;

        static {
            int[] iArr = new int[i5.i.values().length];
            try {
                iArr[i5.i.f13989s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i5.i.f13990t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9952a = iArr;
            int[] iArr2 = new int[n7.h.values().length];
            try {
                iArr2[n7.h.f15795t.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f9953b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "numberOfStepsToSkip", "Lih/u;", "b", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends wh.o implements vh.l<Integer, u> {

        /* compiled from: RecipeStepsActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: /tmp/meat/meat/classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9955a;

            static {
                int[] iArr = new int[n7.b.values().length];
                try {
                    iArr[n7.b.f15744y.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n7.b.f15739t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n7.b.f15738s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n7.b.f15740u.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[n7.b.f15741v.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[n7.b.f15742w.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[n7.b.f15743x.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f9955a = iArr;
            }
        }

        c() {
            super(1);
        }

        public final void b(Integer num) {
            ArrayList arrayList = RecipeStepsActivity.this.stepList;
            if (arrayList != null) {
                RecipeStepsActivity recipeStepsActivity = RecipeStepsActivity.this;
                a0 a0Var = recipeStepsActivity.binding;
                if (a0Var == null) {
                    wh.m.t("binding");
                    a0Var = null;
                }
                Object obj = arrayList.get(a0Var.f7522h.getCurrentItem());
                wh.m.e(obj, "get(...)");
                int intValue = ((Number) obj).intValue();
                n7.b B0 = recipeStepsActivity.t2().B0(intValue);
                k6.b.t("Step Number = " + intValue + " | Action Type = " + B0, new Object[0]);
                switch (a.f9955a[B0.ordinal()]) {
                    case 1:
                        recipeStepsActivity.x2();
                        return;
                    case 2:
                        wh.m.c(num);
                        recipeStepsActivity.w2(num.intValue());
                        return;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        recipeStepsActivity.s2(intValue);
                        wh.m.c(num);
                        recipeStepsActivity.w2(num.intValue());
                        return;
                    default:
                        return;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Integer) obj);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lih/u;", "b", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends wh.o implements vh.l<Integer, u> {
        d() {
            super(1);
        }

        public final void b(Integer num) {
            k6.b.t("(RecipeStepsActivity) Step List Size Observer Received : " + num, new Object[0]);
            a0 a0Var = RecipeStepsActivity.this.binding;
            a0 a0Var2 = null;
            if (a0Var == null) {
                wh.m.t("binding");
                a0Var = null;
            }
            int currentItem = a0Var.f7522h.getCurrentItem();
            RecipeStepsActivity recipeStepsActivity = RecipeStepsActivity.this;
            FragmentManager m02 = recipeStepsActivity.m0();
            wh.m.e(m02, "getSupportFragmentManager(...)");
            AbstractC0397k lifecycle = RecipeStepsActivity.this.getLifecycle();
            wh.m.e(lifecycle, "<get-lifecycle>(...)");
            recipeStepsActivity.adapter = new C0482q(m02, lifecycle, RecipeStepsActivity.this.t2().getDeviceSelectionStepNumber(), RecipeStepsActivity.this.t2().getSetupCookStepNumber());
            a0 a0Var3 = RecipeStepsActivity.this.binding;
            if (a0Var3 == null) {
                wh.m.t("binding");
                a0Var3 = null;
            }
            a0Var3.f7522h.setAdapter(null);
            a0 a0Var4 = RecipeStepsActivity.this.binding;
            if (a0Var4 == null) {
                wh.m.t("binding");
                a0Var4 = null;
            }
            ViewPager2 viewPager2 = a0Var4.f7522h;
            C0482q c0482q = RecipeStepsActivity.this.adapter;
            if (c0482q == null) {
                wh.m.t("adapter");
                c0482q = null;
            }
            viewPager2.setAdapter(c0482q);
            RecipeStepsActivity recipeStepsActivity2 = RecipeStepsActivity.this;
            C0504g t22 = recipeStepsActivity2.t2();
            wh.m.c(num);
            recipeStepsActivity2.stepList = t22.H0(num.intValue());
            ArrayList<Integer> arrayList = RecipeStepsActivity.this.stepList;
            if (arrayList != null) {
                RecipeStepsActivity recipeStepsActivity3 = RecipeStepsActivity.this;
                C0482q c0482q2 = recipeStepsActivity3.adapter;
                if (c0482q2 == null) {
                    wh.m.t("adapter");
                    c0482q2 = null;
                }
                c0482q2.c0(arrayList, recipeStepsActivity3.t2().getProbeID(), recipeStepsActivity3.t2().getCookConfirmed());
            }
            a0 a0Var5 = RecipeStepsActivity.this.binding;
            if (a0Var5 == null) {
                wh.m.t("binding");
            } else {
                a0Var2 = a0Var5;
            }
            a0Var2.f7522h.j(currentItem, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Integer) obj);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lih/u;", "b", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends wh.o implements vh.l<Integer, u> {
        e() {
            super(1);
        }

        public final void b(Integer num) {
            k6.b.t("(RecipeStepsActivity) Last Step to Jump Observer Received : " + num, new Object[0]);
            a0 a0Var = RecipeStepsActivity.this.binding;
            a0 a0Var2 = null;
            if (a0Var == null) {
                wh.m.t("binding");
                a0Var = null;
            }
            int currentItem = a0Var.f7522h.getCurrentItem();
            if ((num == null || currentItem != num.intValue()) && (num == null || num.intValue() != -1)) {
                a0 a0Var3 = RecipeStepsActivity.this.binding;
                if (a0Var3 == null) {
                    wh.m.t("binding");
                    a0Var3 = null;
                }
                ViewPager2 viewPager2 = a0Var3.f7522h;
                wh.m.c(num);
                viewPager2.j(num.intValue(), false);
            }
            a0 a0Var4 = RecipeStepsActivity.this.binding;
            if (a0Var4 == null) {
                wh.m.t("binding");
            } else {
                a0Var2 = a0Var4;
            }
            a0Var2.f7522h.g(RecipeStepsActivity.this.pageSelectionListener);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Integer) obj);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lih/u;", "b", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class f extends wh.o implements vh.l<Integer, u> {
        f() {
            super(1);
        }

        public final void b(Integer num) {
            if (num != null && num.intValue() == 200) {
                RecipeStepsActivity.this.y2(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Integer) obj);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "kotlin.jvm.PlatformType", "it", "Lih/u;", "b", "(Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class g extends wh.o implements vh.l<DeviceCookState, u> {
        g() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(com.apptionlabs.meater_app.v3protobuf.DeviceCookState r6) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity.g.b(com.apptionlabs.meater_app.v3protobuf.DeviceCookState):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DeviceCookState) obj);
            return u.a;
        }
    }

    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$h", "Landroidx/activity/o;", "Lih/u;", "d", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class h extends android.view.o {
        h() {
            super(true);
        }

        @Override // android.view.o
        public void d() {
            RecipeStepsActivity.this.D2();
        }
    }

    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$i", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "Lih/u;", "c", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class i extends ViewPager2.i {
        i() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            k6.b.t("(RecipeStepsActivity) Page Selected : " + i10, new Object[0]);
            RecipeStepsActivity.this.t2().V(i10);
        }
    }

    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$j", "Lc6/h$a;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class j implements h.a {
        j() {
        }

        @Override // c6.h.a
        public void a(MEATERDevice mEATERDevice) {
            wh.m.f(mEATERDevice, "device");
            if (mEATERDevice.relatedProbe() != null && RecipeStepsActivity.this.t2().getProbeID() != -1) {
                C0504g t22 = RecipeStepsActivity.this.t2();
                Probe relatedProbe = mEATERDevice.relatedProbe();
                wh.m.c(relatedProbe);
                t22.q1(relatedProbe);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class l implements android.view.a0, wh.h {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ vh.l f9964a;

        l(vh.l lVar) {
            wh.m.f(lVar, "function");
            this.f9964a = lVar;
        }

        public final ih.c<?> a() {
            return this.f9964a;
        }

        @Override // android.view.a0
        public final /* synthetic */ void d(Object obj) {
            this.f9964a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof android.view.a0) || !(obj instanceof wh.h)) {
                return false;
            }
            return wh.m.a(a(), ((wh.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$m", "Lcom/apptionlabs/meater_app/views/b0$a;", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class m implements b0.a {
        m() {
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void a() {
            k6.b.t("(RecipeStepsActivity) showCancelCookPrompt | Yes Button Clicked to Finish Cook", new Object[0]);
            RecipeStepsActivity.this.y2(true);
        }

        @Override // com.apptionlabs.meater_app.views.b0.a
        public void b() {
            k6.b.t("(RecipeStepsActivity) showCancelCookPrompt | No Button Clicked", new Object[0]);
        }
    }

    /* compiled from: ActivityVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class n extends wh.o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w0 f9966q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9967r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9968s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9969t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(w0 w0Var, tm.a aVar, vh.a aVar2, vm.a aVar3) {
            super(0);
            this.f9966q = w0Var;
            this.f9967r = aVar;
            this.f9968s = aVar2;
            this.f9969t = aVar3;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a(this.f9966q, d0.b(C0504g.class), this.f9967r, this.f9968s, (vh.a) null, this.f9969t);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class o extends wh.o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f9970q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f9970q = componentActivity;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = this.f9970q.y();
            wh.m.e(y10, "viewModelStore");
            return y10;
        }
    }

    private final void B2(n7.h hVar) {
        this.dialog = null;
        if (b.f9953b[hVar.ordinal()] == 1) {
            C0542j a10 = C0542j.INSTANCE.a(t2().A(), n7.h.f15795t, n7.a.f15731s);
            this.dialog = a10;
            if (a10 != null) {
                a10.N2(m0(), "PreparationDescriptionDialog");
                return;
            }
            return;
        }
        C0542j a11 = C0542j.INSTANCE.a(t2().A(), n7.h.f15796u, n7.a.f15731s);
        this.dialog = a11;
        if (a11 != null) {
            a11.N2(m0(), "PreparationIngredientsDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2() {
        Menu menu;
        if (t2().getCookState().compareTo(DeviceCookState.COOK_STATE_RESTING) > 0 && (menu = this.menu) != null) {
            menu.findItem(2131362098).setTitle(getString(2132017662));
        }
    }

    private final void E2() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        intent.putExtra(MEATERIntent.EXTRA_SHOW_COOK_TAB, true);
        startActivity(intent);
    }

    private final void r2() {
        t2().F0().g(this, new l(new c()));
        t2().K0().g(this, new l(new d()));
        t2().D0().g(this, new l(new e()));
        t2().X0().g(this, new l(new f()));
        n7.g.f15786a.c().g(this, new l(new g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(int i10) {
        Meta meta;
        List<Alert> a10;
        List<OnCompleteAction> I0 = t2().I0(i10);
        if (I0 != null) {
            for (OnCompleteAction onCompleteAction : I0) {
                int i11 = b.f9952a[onCompleteAction.getType().ordinal()];
                if (i11 != 1) {
                    if (i11 == 2 && (meta = onCompleteAction.getMeta()) != null && (a10 = meta.a()) != null) {
                        k6.b.t("(RecipeStepsActivity) OnCompleteAction SEND_MESSAGE | Setup Alerts For Probe", new Object[0]);
                        t2().k1(a10);
                    }
                } else {
                    k6.b.t("(RecipeStepsActivity) OnCompleteAction UNKNOWN | Action is Unknown", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0504g t2() {
        return (C0504g) this.viewModel.getValue();
    }

    private final void u2(Bundle bundle, Recipe recipe) {
        Integer num;
        boolean z10;
        a0 a0Var = null;
        if (bundle != null) {
            num = Integer.valueOf(bundle.size());
        } else {
            num = null;
        }
        k6.b.t("(RecipeStepsActivity) Init Views : " + num, new Object[0]);
        a0 a0Var2 = this.binding;
        if (a0Var2 == null) {
            wh.m.t("binding");
            a0Var2 = null;
        }
        a0Var2.f7521g.setText(recipe.getShortTitle());
        FragmentManager m02 = m0();
        wh.m.e(m02, "getSupportFragmentManager(...)");
        AbstractC0397k lifecycle = getLifecycle();
        wh.m.e(lifecycle, "<get-lifecycle>(...)");
        this.adapter = new C0482q(m02, lifecycle, t2().getDeviceSelectionStepNumber(), t2().getSetupCookStepNumber());
        if (t2().getProbeID() == -1 || !t2().getCookConfirmed()) {
            if (bundle == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            k6.b.t("(RecipeStepsActivity) #3.0 calculateAndPopulateStepListSize Executed", new Object[0]);
            ArrayList<Integer> H0 = t2().H0(t2().o0(t2().y(), z10, z10));
            this.stepList = H0;
            if (H0 != null) {
                C0482q c0482q = this.adapter;
                if (c0482q == null) {
                    wh.m.t("adapter");
                    c0482q = null;
                }
                c0482q.c0(H0, t2().getProbeID(), t2().getCookConfirmed());
            }
        }
        a0 a0Var3 = this.binding;
        if (a0Var3 == null) {
            wh.m.t("binding");
            a0Var3 = null;
        }
        ViewPager2 viewPager2 = a0Var3.f7522h;
        C0482q c0482q2 = this.adapter;
        if (c0482q2 == null) {
            wh.m.t("adapter");
            c0482q2 = null;
        }
        viewPager2.setAdapter(c0482q2);
        Object systemService = getSystemService("sensor");
        wh.m.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        if (sensorManager == null) {
            wh.m.t("sensorManager");
            sensorManager = null;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.proximitySensor = defaultSensor;
        if (defaultSensor != null) {
            Boolean S = t2().getPreferences().S();
            wh.m.e(S, "getTouchLessRecipeNextStep(...)");
            if (S.booleanValue()) {
                SensorManager sensorManager2 = this.sensorManager;
                if (sensorManager2 == null) {
                    wh.m.t("sensorManager");
                    sensorManager2 = null;
                }
                sensorManager2.registerListener(this.proximitySensorEventListener, this.proximitySensor, 3);
            }
        }
        getOnBackPressedDispatcher().h(this, new h());
        a0 a0Var4 = this.binding;
        if (a0Var4 == null) {
            wh.m.t("binding");
        } else {
            a0Var = a0Var4;
        }
        a0Var.f7517c.setOnClickListener(new View.OnClickListener() { // from class: q7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecipeStepsActivity.v2(RecipeStepsActivity.this, view);
            }
        });
        r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v2(RecipeStepsActivity recipeStepsActivity, View view) {
        wh.m.f(recipeStepsActivity, "this$0");
        recipeStepsActivity.E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(int i10) {
        a0 a0Var = this.binding;
        a0 a0Var2 = null;
        if (a0Var == null) {
            wh.m.t("binding");
            a0Var = null;
        }
        int currentItem = a0Var.f7522h.getCurrentItem();
        if (i10 > 0) {
            currentItem += i10;
        }
        a0 a0Var3 = this.binding;
        if (a0Var3 == null) {
            wh.m.t("binding");
        } else {
            a0Var2 = a0Var3;
        }
        a0Var2.f7522h.setCurrentItem(currentItem + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2() {
        if (t2().getPreferences().K().isEmpty() && t2().getProbeID() != -1) {
            t2().i1();
        } else {
            y2(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y2(boolean z10) {
        k6.b.t("(RecipeStepActivity) performFinishAnalytics", new Object[0]);
        C0504g t22 = t2();
        ArrayList<Integer> arrayList = this.stepList;
        Integer num = null;
        a0 a0Var = null;
        if (arrayList != null) {
            a0 a0Var2 = this.binding;
            if (a0Var2 == null) {
                wh.m.t("binding");
            } else {
                a0Var = a0Var2;
            }
            num = arrayList.get(a0Var.f7522h.getCurrentItem());
        }
        t22.q0(num, z10);
        z2();
    }

    private final void z2() {
        t2().l();
        Intent intent = new Intent(this, (Class<?>) RecipeSummaryActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, this.recipeId);
        intent.setFlags(131072);
        startActivity(intent);
        finish();
        k6.b.t("(RecipeStepsActivity) performFinishCook | Cook Finished", new Object[0]);
    }

    public final void A2() {
        c6.h.f8879a.A(this, t2().getProbeID(), this.probeUpdateListener);
    }

    public final void D2() {
        b0.j(this, getString(2132017258), getString(2132017403), getString(2132018978), getString(2132018306), new m());
    }

    public final void F2(Probe probe) {
        wh.m.f(probe, "probe");
        Intent intent = new Intent(this, (Class<?>) CookHistory.class);
        intent.putExtra(MEATERIntent.INTENT_FRAGMENT_TYPE, CookHistory.c.TemperatureGraphFragment.ordinal());
        intent.putExtra(MEATERIntent.INTENT_FRAGMENT_CONTEXT, CookHistory.b.history.ordinal());
        intent.putExtra(MEATERIntent.EXTRA_GRAPH_CONTEXT, x2.d.COOK_IN_PROGRESS.ordinal());
        intent.putExtra(MEATERIntent.EXTRA_COOK_ID, probe.getCookID());
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        startActivity(intent);
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        wh.m.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment j02 = m0().j0("PreparationDescriptionDialog");
        Fragment j03 = m0().j0("PreparationIngredientsDialog");
        Object j04 = m0().j0("safetyDialog");
        if (j02 != null && (j02 instanceof androidx.fragment.app.m)) {
            ((androidx.fragment.app.m) j02).A2();
            B2(n7.h.f15795t);
        }
        if (j03 != null && (j03 instanceof androidx.fragment.app.m)) {
            ((androidx.fragment.app.m) j03).A2();
            B2(n7.h.f15796u);
        }
        if (j04 != null && (j04 instanceof com.apptionlabs.meater_app.targets.c)) {
            ((com.apptionlabs.meater_app.targets.c) j04).A2();
            c.Companion companion = com.apptionlabs.meater_app.targets.c.INSTANCE;
            com.google.android.material.bottomsheet.b b10 = companion.b(companion.a());
            this.dialog = b10;
            if (b10 != null) {
                b10.N2(m0(), "safetyDialog");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        a0 c10 = a0.c(getLayoutInflater());
        wh.m.e(c10, "inflate(...)");
        this.binding = c10;
        a0 a0Var = null;
        if (c10 == null) {
            wh.m.t("binding");
            c10 = null;
        }
        setContentView(c10.b());
        a0 a0Var2 = this.binding;
        if (a0Var2 == null) {
            wh.m.t("binding");
        } else {
            a0Var = a0Var2;
        }
        H0(a0Var.f7519e);
        if (getIntent().hasExtra(MEATERIntent.EXTRA_RECIPE_ID)) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                i10 = extras.getInt(MEATERIntent.EXTRA_RECIPE_ID);
            } else {
                i10 = -1;
            }
            this.recipeId = i10;
        }
        if (this.recipeId == -1) {
            k6.b.t("Recipe ID was not provided in Extra. Closing the screen", new Object[0]);
            finish();
            return;
        }
        t2().k(this.recipeId);
        if (t2().E()) {
            t2().Y0(this.recipeId);
            u2(bundle, t2().A());
        } else {
            k6.b.t("Recipe ID was not provided in Extra. Closing the screen", new Object[0]);
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689484, menu);
        this.menu = menu;
        C2();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        wh.m.f(item, "item");
        switch (item.getItemId()) {
            case 2131362098:
                D2();
                break;
            case 2131362246:
                E2();
                break;
            case 2131363073:
                if (getResources().getBoolean(2131034115)) {
                    C0542j a10 = C0542j.INSTANCE.a(t2().A(), n7.h.f15796u, n7.a.f15731s);
                    this.dialog = a10;
                    if (a10 != null) {
                        a10.N2(m0(), "PreparationIngredientsDialog");
                        break;
                    }
                } else {
                    com.google.android.material.bottomsheet.b a11 = C0540h.INSTANCE.a(t2().A(), n7.h.f15796u, n7.a.f15731s);
                    this.dialog = a11;
                    if (a11 != null) {
                        a11.N2(m0(), "dialog");
                        break;
                    }
                }
                break;
            case 2131363366:
                if (getResources().getBoolean(2131034115)) {
                    C0557y.Companion companion = C0557y.INSTANCE;
                    ArrayList<String> y02 = t2().y0();
                    Integer D = t2().getPreferences().D();
                    wh.m.e(D, "getOnGoingRecipeStepNumber(...)");
                    C0557y b10 = C0557y.Companion.b(companion, y02, D.intValue(), t2().A(), t2().getProbeID(), null, 16, null);
                    this.dialog = b10;
                    if (b10 != null) {
                        b10.N2(m0(), "dialog");
                        break;
                    }
                } else {
                    C0555w.Companion companion2 = C0555w.INSTANCE;
                    ArrayList<String> y03 = t2().y0();
                    Integer D2 = t2().getPreferences().D();
                    wh.m.e(D2, "getOnGoingRecipeStepNumber(...)");
                    com.google.android.material.bottomsheet.b b11 = C0555w.Companion.b(companion2, y03, D2.intValue(), t2().A(), t2().getProbeID(), null, 16, null);
                    this.dialog = b11;
                    if (b11 != null) {
                        b11.N2(m0(), "dialog");
                        break;
                    }
                }
                break;
            case 2131363379:
                if (getResources().getBoolean(2131034115)) {
                    C0542j a12 = C0542j.INSTANCE.a(t2().A(), n7.h.f15795t, n7.a.f15731s);
                    this.dialog = a12;
                    if (a12 != null) {
                        a12.N2(m0(), "PreparationDescriptionDialog");
                        break;
                    }
                } else {
                    com.google.android.material.bottomsheet.b a13 = C0540h.INSTANCE.a(t2().A(), n7.h.f15795t, n7.a.f15731s);
                    this.dialog = a13;
                    if (a13 != null) {
                        a13.N2(m0(), "dialog");
                        break;
                    }
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        A2();
        t2().l1();
        t2().a1();
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        k6.b.t("(RecipeStepsActivity) OnStop. Removing Listeners", new Object[0]);
        a0 a0Var = this.binding;
        if (a0Var == null) {
            wh.m.t("binding");
            a0Var = null;
        }
        a0Var.f7522h.n(this.pageSelectionListener);
        c6.h.f8879a.Q(this);
    }

    /* compiled from: RecipeStepsActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/recipe/RecipeStepsActivity$k", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "Lih/u;", "onAccuracyChanged", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class k implements SensorEventListener {
        k() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            wh.m.f(sensorEvent, "event");
            if (RecipeStepsActivity.this.dialog != null) {
                if (RecipeStepsActivity.this.dialog != null) {
                    androidx.fragment.app.m mVar = RecipeStepsActivity.this.dialog;
                    wh.m.c(mVar);
                    if (mVar.R0()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (sensorEvent.sensor.getType() == 8 && sensorEvent.values[0] <= 2.0f) {
                RecipeStepsActivity.this.w2(0);
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    }
}
