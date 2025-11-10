package com.apptionlabs.meater_app.recipe.ui.summary;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n0;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.q;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.y;
import androidx.media3.ui.PlayerView;
import b6.m4;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import com.apptionlabs.meater_app.recipe.ui.summary.c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import i5.Preparation;
import i5.Recipe;
import ih.u;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import rk.C0565e;
import rk.C0580a;
import rk.j0;
import rk.l0;
import rk.l1;
import rk.s1;
import rk.y0;
import vh.p;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: RecipeSummaryFragment.kt */
@Metadata(d1 = {"\u0000Ã\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\t*\u0001f\u0018\u0000 l2\u00020\u0001:\u0001mB\u0007¢\u0006\u0004\bj\u0010kJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0003J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0003J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\tH\u0003J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002J$\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006n"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/summary/c;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "view", "Lih/u;", "J2", "", "recipeId", "U2", "", "isCalledAfterRotation", "L2", "Landroidx/media3/ui/PlayerView;", "playerView", "Landroid/widget/ImageView;", "thumbnail", "T2", "Q2", "Landroidx/media3/exoplayer/g$b;", "playerBuilder", "Landroid/content/Context;", "context", "R2", "preferExtensionRenderer", "Lh1/u;", "F2", "O2", "P2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "y1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "v1", "Lcom/apptionlabs/meater_app/recipe/ui/summary/d;", "t0", "Lcom/apptionlabs/meater_app/recipe/ui/summary/d;", "toolsFragment", "Lcom/apptionlabs/meater_app/recipe/ui/summary/b;", "u0", "Lcom/apptionlabs/meater_app/recipe/ui/summary/b;", "ingredientsFragment", "Lcom/apptionlabs/meater_app/recipe/ui/summary/a;", "v0", "Lcom/apptionlabs/meater_app/recipe/ui/summary/a;", "descriptionFragment", "w0", "Landroid/os/Bundle;", "", "x0", "Ljava/lang/String;", "videoURL", "Lb6/m4;", "y0", "Lb6/m4;", "binding", "Landroidx/media3/exoplayer/g;", "z0", "Landroidx/media3/exoplayer/g;", "player", "Ly7/a;", "A0", "Ly7/a;", "cacheManager", "Lt7/e;", "B0", "Lih/g;", "I2", "()Lt7/e;", "viewModel", "Ln7/h;", "C0", "Ln7/h;", "H2", "()Ln7/h;", "S2", "(Ln7/h;)V", "screenType", "Lrk/s1;", "D0", "Lrk/s1;", "playerJob", "Landroid/widget/FrameLayout;", "E0", "Landroid/widget/FrameLayout;", "frameLayout", "F0", "I", "selectedTabPosition", "G0", "Z", "N2", "()Z", "setDialog", "(Z)V", "isDialog", "com/apptionlabs/meater_app/recipe/ui/summary/c$g", "H0", "Lcom/apptionlabs/meater_app/recipe/ui/summary/c$g;", "onTabSelectedListener", "<init>", "()V", "I0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class c extends Fragment {

    /* renamed from: I0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Recipe J0;

    /* renamed from: A0, reason: from kotlin metadata */
    private C0580a cacheManager;

    /* renamed from: B0, reason: from kotlin metadata */
    private final ih.g viewModel;

    /* renamed from: C0, reason: from kotlin metadata */
    public n7.h screenType;

    /* renamed from: D0, reason: from kotlin metadata */
    private s1 playerJob;

    /* renamed from: E0, reason: from kotlin metadata */
    private FrameLayout frameLayout;

    /* renamed from: F0, reason: from kotlin metadata */
    private int selectedTabPosition;

    /* renamed from: G0, reason: from kotlin metadata */
    private boolean isDialog;

    /* renamed from: H0, reason: from kotlin metadata */
    private final g onTabSelectedListener;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private com.apptionlabs.meater_app.recipe.ui.summary.d toolsFragment;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private com.apptionlabs.meater_app.recipe.ui.summary.b ingredientsFragment;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private a descriptionFragment;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private Bundle savedInstanceState;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private String videoURL;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private m4 binding;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private androidx.media3.exoplayer.g player;

    /* compiled from: RecipeSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/summary/c$a;", "", "Li5/o;", "recipe", "Ln7/h;", "screenType", "Lcom/apptionlabs/meater_app/recipe/ui/summary/c;", "a", "Li5/o;", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.recipe.ui.summary.c$a, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public final c a(Recipe recipe, n7.h screenType) {
            m.f(recipe, "recipe");
            m.f(screenType, "screenType");
            c cVar = new c();
            c.J0 = recipe;
            Bundle bundle = new Bundle();
            bundle.putInt("SummaryScreenType", screenType.getIndex());
            cVar.k2(bundle);
            return cVar;
        }
    }

    /* compiled from: RecipeSummaryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10035a;

        static {
            int[] iArr = new int[n7.h.values().length];
            try {
                iArr[n7.h.f15794s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n7.h.f15795t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n7.h.f15796u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10035a = iArr;
        }
    }

    /* compiled from: RecipeSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/summary/c$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lih/u;", "onGlobalLayout", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.recipe.ui.summary.c$c, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0145c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0145c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m4 m4Var = c.this.binding;
            m4 m4Var2 = null;
            if (m4Var == null) {
                m.t("binding");
                m4Var = null;
            }
            m4Var.f8021i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            m4 m4Var3 = c.this.binding;
            if (m4Var3 == null) {
                m.t("binding");
                m4Var3 = null;
            }
            float height = (m4Var3.f8022j.getHeight() * 9) / 13;
            m4 m4Var4 = c.this.binding;
            if (m4Var4 == null) {
                m.t("binding");
            } else {
                m4Var2 = m4Var4;
            }
            m4Var2.f8021i.getLayoutParams().width = (int) height;
        }
    }

    /* compiled from: RecipeSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/summary/c$d", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lih/u;", "onGlobalLayout", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d4.b a10 = d4.b.INSTANCE.a();
            s c22 = c.this.c2();
            m.e(c22, "requireActivity(...)");
            int height = a10.a(c22).a().height();
            m4 m4Var = c.this.binding;
            m4 m4Var2 = null;
            if (m4Var == null) {
                m.t("binding");
                m4Var = null;
            }
            m4Var.f8021i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            m4 m4Var3 = c.this.binding;
            if (m4Var3 == null) {
                m.t("binding");
            } else {
                m4Var2 = m4Var3;
            }
            m4Var2.f8021i.getLayoutParams().height = (int) (height * 0.67d);
        }
    }

    /* compiled from: RecipeSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/summary/c$e", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lih/u;", "getOutline", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends ViewOutlineProvider {
        e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            m.f(view, "view");
            m.f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 15.0f);
        }
    }

    /* compiled from: RecipeSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/summary/c$f", "Landroidx/media3/common/q$d;", "Landroidx/media3/common/PlaybackException;", "error", "Lih/u;", "i0", "", "playbackState", "K", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class f implements q.d {
        f() {
        }

        @Override // androidx.media3.common.q.d
        public void K(int i10) {
            if (i10 != 1) {
                m4 m4Var = null;
                if (i10 == 2) {
                    m4 m4Var2 = c.this.binding;
                    if (m4Var2 == null) {
                        m.t("binding");
                        m4Var2 = null;
                    }
                    ImageView imageView = m4Var2.f8027o;
                    m.e(imageView, "thumbnail");
                    g6.d.j(imageView);
                    m4 m4Var3 = c.this.binding;
                    if (m4Var3 == null) {
                        m.t("binding");
                    } else {
                        m4Var = m4Var3;
                    }
                    PlayerView playerView = m4Var.f8022j;
                    m.e(playerView, "playerView");
                    g6.d.i(playerView);
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        m4 m4Var4 = c.this.binding;
                        if (m4Var4 == null) {
                            m.t("binding");
                        } else {
                            m4Var = m4Var4;
                        }
                        ImageView imageView2 = m4Var.f8027o;
                        m.e(imageView2, "thumbnail");
                        g6.d.j(imageView2);
                        return;
                    }
                    return;
                }
                c cVar = c.this;
                m4 m4Var5 = cVar.binding;
                if (m4Var5 == null) {
                    m.t("binding");
                    m4Var5 = null;
                }
                PlayerView playerView2 = m4Var5.f8022j;
                m.e(playerView2, "playerView");
                m4 m4Var6 = c.this.binding;
                if (m4Var6 == null) {
                    m.t("binding");
                } else {
                    m4Var = m4Var6;
                }
                ImageView imageView3 = m4Var.f8027o;
                m.e(imageView3, "thumbnail");
                cVar.T2(playerView2, imageView3);
            }
        }

        @Override // androidx.media3.common.q.d
        public void i0(PlaybackException playbackException) {
            m.f(playbackException, "error");
            super.i0(playbackException);
            k6.b.t("Player has issue playing", new Object[0]);
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/Fragment;", "b", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class h extends o implements vh.a<Fragment> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f10040q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f10040q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment a() {
            return this.f10040q;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class i extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f10041q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f10042r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f10043s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f10044t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f10041q = aVar;
            this.f10042r = aVar2;
            this.f10043s = aVar3;
            this.f10044t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f10041q.a(), d0.b(C0565e.class), this.f10042r, this.f10043s, (vh.a) null, this.f10044t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class j extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f10045q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(vh.a aVar) {
            super(0);
            this.f10045q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f10045q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecipeSummaryFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.summary.RecipeSummaryFragment$startJobToPlayVideo$1", f = "RecipeSummaryFragment.kt", l = {346, 347, 351, 352}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class k extends l implements p<j0, nh.d<? super u>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f10046q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ PlayerView f10047r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ImageView f10048s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RecipeSummaryFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.summary.RecipeSummaryFragment$startJobToPlayVideo$1$1", f = "RecipeSummaryFragment.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static final class a extends l implements p<j0, nh.d<? super u>, Object> {

            /* renamed from: q, reason: collision with root package name */
            int f10049q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ PlayerView f10050r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PlayerView playerView, nh.d<? super a> dVar) {
                super(2, dVar);
                this.f10050r = playerView;
            }

            public final nh.d<u> create(Object obj, nh.d<?> dVar) {
                return new a(this.f10050r, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                oh.b.c();
                if (this.f10049q == 0) {
                    ih.o.b(obj);
                    g6.d.j(this.f10050r);
                    return u.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(j0 j0Var, nh.d<? super u> dVar) {
                return create(j0Var, dVar).invokeSuspend(u.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RecipeSummaryFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.summary.RecipeSummaryFragment$startJobToPlayVideo$1$2", f = "RecipeSummaryFragment.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static final class b extends l implements p<j0, nh.d<? super u>, Object> {

            /* renamed from: q, reason: collision with root package name */
            int f10051q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ ImageView f10052r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ImageView imageView, nh.d<? super b> dVar) {
                super(2, dVar);
                this.f10052r = imageView;
            }

            public final nh.d<u> create(Object obj, nh.d<?> dVar) {
                return new b(this.f10052r, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                oh.b.c();
                if (this.f10051q == 0) {
                    ih.o.b(obj);
                    g6.d.i(this.f10052r);
                    return u.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(j0 j0Var, nh.d<? super u> dVar) {
                return create(j0Var, dVar).invokeSuspend(u.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(PlayerView playerView, ImageView imageView, nh.d<? super k> dVar) {
            super(2, dVar);
            this.f10047r = playerView;
            this.f10048s = imageView;
        }

        public final nh.d<u> create(Object obj, nh.d<?> dVar) {
            return new k(this.f10047r, this.f10048s, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = oh.b.c()
                int r1 = r8.f10046q
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L2d
                if (r1 == r6) goto L29
                if (r1 == r5) goto L25
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                ih.o.b(r9)
                goto L6e
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                ih.o.b(r9)
                goto L5a
            L25:
                ih.o.b(r9)
                goto L4f
            L29:
                ih.o.b(r9)
                goto L3b
            L2d:
                ih.o.b(r9)
                r8.f10046q = r6
                r6 = 200(0xc8, double:9.9E-322)
                java.lang.Object r9 = rk.t0.a(r6, r8)
                if (r9 != r0) goto L3b
                return r0
            L3b:
                rk.d2 r9 = rk.y0.c()
                com.apptionlabs.meater_app.recipe.ui.summary.c$k$a r1 = new com.apptionlabs.meater_app.recipe.ui.summary.c$k$a
                androidx.media3.ui.PlayerView r6 = r8.f10047r
                r1.<init>(r6, r2)
                r8.f10046q = r5
                java.lang.Object r9 = rk.g.g(r9, r1, r8)
                if (r9 != r0) goto L4f
                return r0
            L4f:
                r8.f10046q = r4
                r4 = 100
                java.lang.Object r9 = rk.t0.a(r4, r8)
                if (r9 != r0) goto L5a
                return r0
            L5a:
                rk.d2 r9 = rk.y0.c()
                com.apptionlabs.meater_app.recipe.ui.summary.c$k$b r1 = new com.apptionlabs.meater_app.recipe.ui.summary.c$k$b
                android.widget.ImageView r4 = r8.f10048s
                r1.<init>(r4, r2)
                r8.f10046q = r3
                java.lang.Object r9 = rk.g.g(r9, r1, r8)
                if (r9 != r0) goto L6e
                return r0
            L6e:
                ih.u r9 = ih.u.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.recipe.ui.summary.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(j0 j0Var, nh.d<? super u> dVar) {
            return create(j0Var, dVar).invokeSuspend(u.a);
        }
    }

    public c() {
        h hVar = new h(this);
        this.viewModel = s0.a(this, d0.b(C0565e.class), new j(hVar), new i(hVar, null, null, bm.a.a(this)));
        this.onTabSelectedListener = new g();
    }

    private final h1.u F2(Context context, boolean preferExtensionRenderer) {
        int i10;
        if (preferExtensionRenderer) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        h1.e j10 = new h1.e(context.getApplicationContext()).k(i10).j(true);
        m.e(j10, "setEnableDecoderFallback(...)");
        return j10;
    }

    static /* synthetic */ h1.u G2(c cVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return cVar.F2(context, z10);
    }

    private final C0565e I2() {
        return (C0565e) this.viewModel.getValue();
    }

    private final void J2(View view) {
        this.cacheManager = I2().getCacheManager();
        Recipe recipe = J0;
        FrameLayout frameLayout = null;
        if (recipe != null) {
            m4 m4Var = this.binding;
            if (m4Var == null) {
                m.t("binding");
                m4Var = null;
            }
            m4Var.f8028p.setText(recipe.p());
            m4 m4Var2 = this.binding;
            if (m4Var2 == null) {
                m.t("binding");
                m4Var2 = null;
            }
            m4Var2.f8025m.setText(recipe.getSubtitle());
        }
        Bundle W = W();
        if (W != null) {
            S2(n7.h.INSTANCE.a(W.getInt("SummaryScreenType", n7.h.f15794s.getIndex())));
        }
        m4 m4Var3 = this.binding;
        if (m4Var3 == null) {
            m.t("binding");
            m4Var3 = null;
        }
        View childAt = m4Var3.f8026n.getChildAt(0);
        m.e(childAt, "getChildAt(...)");
        if (childAt instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) childAt;
            linearLayout.setShowDividers(2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(e2().getColor(2131100492));
            gradientDrawable.setSize(2, 1);
            linearLayout.setDividerPadding(10);
            linearLayout.setDividerDrawable(gradientDrawable);
        }
        if (H2() != n7.h.f15794s) {
            this.isDialog = true;
        }
        Recipe recipe2 = J0;
        if (recipe2 != null) {
            this.descriptionFragment = a.INSTANCE.a(recipe2, H2());
            this.ingredientsFragment = com.apptionlabs.meater_app.recipe.ui.summary.b.INSTANCE.a(recipe2, RecipeStepsActivity.a.f9948q, H2());
            this.toolsFragment = com.apptionlabs.meater_app.recipe.ui.summary.d.INSTANCE.a(recipe2, RecipeStepsActivity.a.f9949r, H2());
            n0 p10 = X().p();
            m.e(p10, "beginTransaction(...)");
            int i10 = b.f10035a[H2().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        m4 m4Var4 = this.binding;
                        if (m4Var4 == null) {
                            m.t("binding");
                            m4Var4 = null;
                        }
                        m4Var4.f8026n.K(0);
                        if (this.selectedTabPosition == 0) {
                            m4 m4Var5 = this.binding;
                            if (m4Var5 == null) {
                                m.t("binding");
                                m4Var5 = null;
                            }
                            int id = m4Var5.f8014b.getId();
                            com.apptionlabs.meater_app.recipe.ui.summary.b bVar = this.ingredientsFragment;
                            if (bVar == null) {
                                m.t("ingredientsFragment");
                                bVar = null;
                            }
                            p10.t(id, bVar);
                        } else {
                            m4 m4Var6 = this.binding;
                            if (m4Var6 == null) {
                                m.t("binding");
                                m4Var6 = null;
                            }
                            int id2 = m4Var6.f8014b.getId();
                            com.apptionlabs.meater_app.recipe.ui.summary.d dVar = this.toolsFragment;
                            if (dVar == null) {
                                m.t("toolsFragment");
                                dVar = null;
                            }
                            p10.t(id2, dVar);
                        }
                    }
                } else {
                    m4 m4Var7 = this.binding;
                    if (m4Var7 == null) {
                        m.t("binding");
                        m4Var7 = null;
                    }
                    TabLayout tabLayout = m4Var7.f8026n;
                    m.e(tabLayout, "tabs");
                    g6.d.g(tabLayout);
                    m4 m4Var8 = this.binding;
                    if (m4Var8 == null) {
                        m.t("binding");
                        m4Var8 = null;
                    }
                    int id3 = m4Var8.f8014b.getId();
                    a aVar = this.descriptionFragment;
                    if (aVar == null) {
                        m.t("descriptionFragment");
                        aVar = null;
                    }
                    p10.t(id3, aVar);
                }
            } else {
                m4 m4Var9 = this.binding;
                if (m4Var9 == null) {
                    m.t("binding");
                    m4Var9 = null;
                }
                TabLayout tabLayout2 = m4Var9.f8026n;
                m.e(tabLayout2, "tabs");
                g6.d.j(tabLayout2);
                int i11 = this.selectedTabPosition;
                if (i11 != 0) {
                    if (i11 != 1) {
                        m4 m4Var10 = this.binding;
                        if (m4Var10 == null) {
                            m.t("binding");
                            m4Var10 = null;
                        }
                        int id4 = m4Var10.f8014b.getId();
                        com.apptionlabs.meater_app.recipe.ui.summary.d dVar2 = this.toolsFragment;
                        if (dVar2 == null) {
                            m.t("toolsFragment");
                            dVar2 = null;
                        }
                        p10.t(id4, dVar2);
                    } else {
                        m4 m4Var11 = this.binding;
                        if (m4Var11 == null) {
                            m.t("binding");
                            m4Var11 = null;
                        }
                        int id5 = m4Var11.f8014b.getId();
                        com.apptionlabs.meater_app.recipe.ui.summary.b bVar2 = this.ingredientsFragment;
                        if (bVar2 == null) {
                            m.t("ingredientsFragment");
                            bVar2 = null;
                        }
                        p10.t(id5, bVar2);
                    }
                } else {
                    m4 m4Var12 = this.binding;
                    if (m4Var12 == null) {
                        m.t("binding");
                        m4Var12 = null;
                    }
                    int id6 = m4Var12.f8014b.getId();
                    a aVar2 = this.descriptionFragment;
                    if (aVar2 == null) {
                        m.t("descriptionFragment");
                        aVar2 = null;
                    }
                    p10.t(id6, aVar2);
                }
            }
            p10.j();
            m4 m4Var13 = this.binding;
            if (m4Var13 == null) {
                m.t("binding");
                m4Var13 = null;
            }
            TabLayout tabLayout3 = m4Var13.f8026n;
            m4 m4Var14 = this.binding;
            if (m4Var14 == null) {
                m.t("binding");
                m4Var14 = null;
            }
            tabLayout3.M(m4Var14.f8026n.B(this.selectedTabPosition));
            m4 m4Var15 = this.binding;
            if (m4Var15 == null) {
                m.t("binding");
                m4Var15 = null;
            }
            m4Var15.f8026n.h(this.onTabSelectedListener);
        }
        L2(true);
        if (P2()) {
            m4 m4Var16 = this.binding;
            if (m4Var16 == null) {
                m.t("binding");
                m4Var16 = null;
            }
            m4Var16.f8021i.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0145c());
        } else {
            m4 m4Var17 = this.binding;
            if (m4Var17 == null) {
                m.t("binding");
                m4Var17 = null;
            }
            m4Var17.f8021i.getViewTreeObserver().addOnGlobalLayoutListener(new d());
        }
        m4 m4Var18 = this.binding;
        if (m4Var18 == null) {
            m.t("binding");
            m4Var18 = null;
        }
        m4Var18.f8024l.setOnClickListener(new View.OnClickListener() { // from class: t7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.K2(c.this, view2);
            }
        });
        if (this.isDialog) {
            m4 m4Var19 = this.binding;
            if (m4Var19 == null) {
                m.t("binding");
                m4Var19 = null;
            }
            MaterialButton materialButton = m4Var19.f8024l;
            m.e(materialButton, "startButton");
            g6.d.g(materialButton);
        }
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            m.t("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(c cVar, View view) {
        m.f(cVar, "this$0");
        Recipe recipe = J0;
        if (recipe != null) {
            cVar.I2().q(recipe.getId());
            cVar.U2(recipe.getId());
        }
    }

    private final void L2(boolean z10) {
        String str;
        boolean z11;
        String str2;
        Recipe recipe;
        Preparation preparation;
        k6.b.t("(RecipeSummaryFragment) initializePlayer", new Object[0]);
        Recipe recipe2 = J0;
        m4 m4Var = null;
        if (recipe2 != null) {
            str = recipe2.getVideo();
        } else {
            str = null;
        }
        m4 m4Var2 = this.binding;
        if (m4Var2 == null) {
            m.t("binding");
            m4Var2 = null;
        }
        if (((m4Var2.f8026n.getSelectedTabPosition() != 0 && H2() == n7.h.f15794s) || H2() == n7.h.f15796u) && (recipe = J0) != null && (preparation = recipe.getPreparation()) != null) {
            str = preparation.getVideo();
            z11 = true;
        } else {
            z11 = false;
        }
        if (pk.m.t(str, this.videoURL, false, 2, (Object) null) && !z10) {
            return;
        }
        this.videoURL = str;
        if (!z11) {
            m4 m4Var3 = this.binding;
            if (m4Var3 == null) {
                m.t("binding");
                m4Var3 = null;
            }
            ImageView imageView = m4Var3.f8027o;
            m.e(imageView, "thumbnail");
            g6.d.j(imageView);
            com.bumptech.glide.k t10 = com.bumptech.glide.b.t(com.apptionlabs.meater_app.app.a.i());
            Recipe recipe3 = J0;
            if (recipe3 != null) {
                str2 = recipe3.getImage();
            } else {
                str2 = null;
            }
            com.bumptech.glide.j<Drawable> u10 = t10.u(str2);
            m4 m4Var4 = this.binding;
            if (m4Var4 == null) {
                m.t("binding");
                m4Var4 = null;
            }
            u10.C0(m4Var4.f8027o);
        } else {
            m4 m4Var5 = this.binding;
            if (m4Var5 == null) {
                m.t("binding");
                m4Var5 = null;
            }
            ImageView imageView2 = m4Var5.f8027o;
            m.e(imageView2, "thumbnail");
            g6.d.i(imageView2);
        }
        androidx.media3.exoplayer.g gVar = this.player;
        if (gVar != null) {
            if (gVar != null) {
                gVar.a();
            }
            this.player = null;
        }
        g.b bVar = new g.b(e2());
        Context e22 = e2();
        m.e(e22, "requireContext(...)");
        R2(bVar, e22);
        androidx.media3.exoplayer.g f10 = bVar.f();
        this.player = f10;
        if (f10 != null) {
            f10.Q(2);
        }
        androidx.media3.exoplayer.g gVar2 = this.player;
        if (gVar2 != null) {
            gVar2.C(true);
        }
        androidx.media3.common.k d10 = androidx.media3.common.k.d(Uri.parse(this.videoURL));
        m.e(d10, "fromUri(...)");
        C0580a c0580a = this.cacheManager;
        if (c0580a == null) {
            m.t("cacheManager");
            c0580a = null;
        }
        y a10 = new y.b(c0580a.getCacheDataSourceFactory()).a(d10);
        m.e(a10, "createMediaSource(...)");
        androidx.media3.exoplayer.g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.c(a10);
        }
        androidx.media3.exoplayer.g gVar4 = this.player;
        if (gVar4 != null) {
            gVar4.h();
        }
        if (P2()) {
            m4 m4Var6 = this.binding;
            if (m4Var6 == null) {
                m.t("binding");
                m4Var6 = null;
            }
            m4Var6.f8022j.setOutlineProvider(new e());
            m4 m4Var7 = this.binding;
            if (m4Var7 == null) {
                m.t("binding");
                m4Var7 = null;
            }
            m4Var7.f8022j.setClipToOutline(true);
        }
        m4 m4Var8 = this.binding;
        if (m4Var8 == null) {
            m.t("binding");
            m4Var8 = null;
        }
        m4Var8.f8022j.setPlayer(this.player);
        m4 m4Var9 = this.binding;
        if (m4Var9 == null) {
            m.t("binding");
            m4Var9 = null;
        }
        m4Var9.f8022j.setControllerAutoShow(false);
        m4 m4Var10 = this.binding;
        if (m4Var10 == null) {
            m.t("binding");
            m4Var10 = null;
        }
        m4Var10.f8022j.w();
        m4 m4Var11 = this.binding;
        if (m4Var11 == null) {
            m.t("binding");
            m4Var11 = null;
        }
        m4Var11.f8022j.setUseController(false);
        m4 m4Var12 = this.binding;
        if (m4Var12 == null) {
            m.t("binding");
        } else {
            m4Var = m4Var12;
        }
        q player = m4Var.f8022j.getPlayer();
        m.c(player);
        player.U(new f());
    }

    static /* synthetic */ void M2(c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        cVar.L2(z10);
    }

    private final boolean O2() {
        return u0().getBoolean(2131034115);
    }

    private final boolean P2() {
        if (O2() && u0().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private final void Q2() {
        m4 m4Var = this.binding;
        if (m4Var == null) {
            m.t("binding");
            m4Var = null;
        }
        m4Var.f8022j.B();
        androidx.media3.exoplayer.g gVar = this.player;
        if (gVar != null) {
            gVar.C(false);
        }
        androidx.media3.exoplayer.g gVar2 = this.player;
        if (gVar2 != null) {
            gVar2.stop();
        }
        androidx.media3.exoplayer.g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.player = null;
        this.videoURL = null;
        System.gc();
    }

    private final void R2(g.b bVar, Context context) {
        bVar.l(G2(this, context, false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2(PlayerView playerView, ImageView imageView) {
        s1 s1Var = this.playerJob;
        if (s1Var != null) {
            if (s1Var != null) {
                s1.a.a(s1Var, (CancellationException) null, 1, (Object) null);
            }
            this.playerJob = null;
        }
        this.playerJob = rk.g.d(l1.q, y0.b(), (l0) null, new k(playerView, imageView, null), 2, (Object) null);
    }

    private final void U2(int i10) {
        Intent intent = new Intent(e2(), (Class<?>) RecipeStepsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, i10);
        t2(intent);
    }

    public final n7.h H2() {
        n7.h hVar = this.screenType;
        if (hVar != null) {
            return hVar;
        }
        m.t("screenType");
        return null;
    }

    /* renamed from: N2, reason: from getter */
    public final boolean getIsDialog() {
        return this.isDialog;
    }

    public final void S2(n7.h hVar) {
        m.f(hVar, "<set-?>");
        this.screenType = hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        m4 c10 = m4.c(inflater, frameLayout, false);
        m.e(c10, "inflate(...)");
        this.binding = c10;
        this.savedInstanceState = savedInstanceState;
        if (c10 == null) {
            m.t("binding");
            c10 = null;
        }
        ConstraintLayout b10 = c10.b();
        m.e(b10, "getRoot(...)");
        J2(b10);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            m.t("frameLayout");
            return null;
        }
        return frameLayout2;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        m.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        k6.b.t("(RecipeSummaryFragment) onConfigurationChanged", new Object[0]);
        Q2();
        m4 m4Var = this.binding;
        m4 m4Var2 = null;
        if (m4Var == null) {
            m.t("binding");
            m4Var = null;
        }
        m4Var.f8026n.J(this.onTabSelectedListener);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            m.t("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        m.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        m4 c10 = m4.c((LayoutInflater) systemService, null, false);
        m.e(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            m.t("binding");
        } else {
            m4Var2 = c10;
        }
        ConstraintLayout b10 = m4Var2.b();
        m.e(b10, "getRoot(...)");
        J2(b10);
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (this.savedInstanceState == null) {
            M2(this, false, 1, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        Q2();
    }

    /* compiled from: RecipeSummaryFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/summary/c$g", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$f;", "tab", "Lih/u;", "b", "c", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class g implements TabLayout.d {
        g() {
        }

        public void b(TabLayout.f fVar) {
            m.f(fVar, "tab");
            c cVar = c.this;
            m4 m4Var = cVar.binding;
            if (m4Var == null) {
                m.t("binding");
                m4Var = null;
            }
            cVar.selectedTabPosition = m4Var.f8026n.getSelectedTabPosition();
            m4 m4Var2 = c.this.binding;
            if (m4Var2 == null) {
                m.t("binding");
                m4Var2 = null;
            }
            int selectedTabPosition = m4Var2.f8026n.getSelectedTabPosition();
            if (selectedTabPosition != 0) {
                if (selectedTabPosition != 1) {
                    n0 p10 = c.this.X().p();
                    m.e(p10, "beginTransaction(...)");
                    m4 m4Var3 = c.this.binding;
                    if (m4Var3 == null) {
                        m.t("binding");
                        m4Var3 = null;
                    }
                    int id = m4Var3.f8014b.getId();
                    com.apptionlabs.meater_app.recipe.ui.summary.d dVar = c.this.toolsFragment;
                    if (dVar == null) {
                        m.t("toolsFragment");
                        dVar = null;
                    }
                    p10.t(id, dVar);
                    p10.j();
                } else {
                    n0 p11 = c.this.X().p();
                    m.e(p11, "beginTransaction(...)");
                    if (c.this.getIsDialog()) {
                        m4 m4Var4 = c.this.binding;
                        if (m4Var4 == null) {
                            m.t("binding");
                            m4Var4 = null;
                        }
                        int id2 = m4Var4.f8014b.getId();
                        com.apptionlabs.meater_app.recipe.ui.summary.d dVar2 = c.this.toolsFragment;
                        if (dVar2 == null) {
                            m.t("toolsFragment");
                            dVar2 = null;
                        }
                        p11.t(id2, dVar2);
                    } else {
                        m4 m4Var5 = c.this.binding;
                        if (m4Var5 == null) {
                            m.t("binding");
                            m4Var5 = null;
                        }
                        int id3 = m4Var5.f8014b.getId();
                        com.apptionlabs.meater_app.recipe.ui.summary.b bVar = c.this.ingredientsFragment;
                        if (bVar == null) {
                            m.t("ingredientsFragment");
                            bVar = null;
                        }
                        p11.t(id3, bVar);
                    }
                    p11.j();
                }
            } else {
                n0 p12 = c.this.X().p();
                m.e(p12, "beginTransaction(...)");
                if (c.this.getIsDialog()) {
                    m4 m4Var6 = c.this.binding;
                    if (m4Var6 == null) {
                        m.t("binding");
                        m4Var6 = null;
                    }
                    int id4 = m4Var6.f8014b.getId();
                    com.apptionlabs.meater_app.recipe.ui.summary.b bVar2 = c.this.ingredientsFragment;
                    if (bVar2 == null) {
                        m.t("ingredientsFragment");
                        bVar2 = null;
                    }
                    p12.t(id4, bVar2);
                } else {
                    m4 m4Var7 = c.this.binding;
                    if (m4Var7 == null) {
                        m.t("binding");
                        m4Var7 = null;
                    }
                    int id5 = m4Var7.f8014b.getId();
                    a aVar = c.this.descriptionFragment;
                    if (aVar == null) {
                        m.t("descriptionFragment");
                        aVar = null;
                    }
                    p12.t(id5, aVar);
                }
                p12.j();
            }
            c.M2(c.this, false, 1, null);
        }

        public void c(TabLayout.f fVar) {
            m.f(fVar, "tab");
        }

        public void a(TabLayout.f fVar) {
        }
    }
}
