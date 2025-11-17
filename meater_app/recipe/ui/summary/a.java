package com.apptionlabs.meater_app.recipe.ui.summary;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import b6.h4;
import i5.Recipe;
import i5.e;
import i5.r;
import kotlin.Metadata;
import n7.h;
import wh.g;
import wh.m;

/* compiled from: RecipeDescriptionFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/summary/a;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "view", "Lih/u;", "z2", "", "A2", "B2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lb6/h4;", "t0", "Lb6/h4;", "binding", "Landroid/widget/FrameLayout;", "u0", "Landroid/widget/FrameLayout;", "frameLayout", "<init>", "()V", "v0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class a extends Fragment {

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w0, reason: collision with root package name */
    private static Recipe f10008w0;

    /* renamed from: x0, reason: collision with root package name */
    private static h f10009x0;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private h4 binding;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* compiled from: RecipeDescriptionFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/summary/a$a;", "", "Li5/o;", "recipe", "Ln7/h;", "screenType", "Lcom/apptionlabs/meater_app/recipe/ui/summary/a;", "a", "Li5/o;", "Ln7/h;", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.recipe.ui.summary.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a a(Recipe recipe, h screenType) {
            m.f(recipe, "recipe");
            m.f(screenType, "screenType");
            a aVar = new a();
            a.f10008w0 = recipe;
            a.f10009x0 = screenType;
            return aVar;
        }
    }

    /* compiled from: RecipeDescriptionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10012a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10013b;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f14056t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f14057u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.f14058v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.f14059w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.f14060x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10012a = iArr;
            int[] iArr2 = new int[e.values().length];
            try {
                iArr2[e.f13977t.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[e.f13978u.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f10013b = iArr2;
        }
    }

    private final boolean A2() {
        return u0().getBoolean(2131034115);
    }

    private final boolean B2() {
        if (A2() && u0().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z2(android.view.View r13) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.recipe.ui.summary.a.z2(android.view.View):void");
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        h4 c10 = h4.c(inflater, frameLayout, false);
        m.e(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            m.t("binding");
            c10 = null;
        }
        ConstraintLayout b10 = c10.b();
        m.e(b10, "getRoot(...)");
        z2(b10);
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
        FrameLayout frameLayout = this.frameLayout;
        h4 h4Var = null;
        if (frameLayout == null) {
            m.t("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        m.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        h4 c10 = h4.c((LayoutInflater) systemService, null, false);
        m.e(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            m.t("binding");
        } else {
            h4Var = c10;
        }
        ConstraintLayout b10 = h4Var.b();
        m.e(b10, "getRoot(...)");
        z2(b10);
    }
}
