package com.apptionlabs.meater_app.recipe.ui.summary;

import android.content.Intent;
import android.os.Bundle;
import android.view.ComponentActivity;
import android.view.View;
import android.view.s0;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import androidx.fragment.app.n0;
import b6.b0;
import com.apptionlabs.meater_app.activities.j;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import i5.Recipe;
import ih.g;
import kotlin.Metadata;
import n7.h;
import rk.C0567g;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: RecipeSummaryActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\r\u001a\u00020\u0006H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/summary/RecipeSummaryActivity;", "Lcom/apptionlabs/meater_app/activities/j;", "Landroid/os/Bundle;", "savedInstanceState", "Li5/o;", "recipe", "Lih/u;", "f2", "d2", "h2", "", "g2", "onCreate", "onBackPressed", "Lb6/b0;", "a0", "Lb6/b0;", "binding", "", "b0", "I", "recipeId", "Lt7/g;", "c0", "Lih/g;", "e2", "()Lt7/g;", "viewModel", "Lcom/apptionlabs/meater_app/recipe/ui/summary/c;", "d0", "Lcom/apptionlabs/meater_app/recipe/ui/summary/c;", "summaryFragment", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class RecipeSummaryActivity extends j {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private b0 binding;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private int recipeId = -1;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final g viewModel = new s0(d0.b(C0567g.class), new b(this), new a(this, null, null, bm.a.a(this)));

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private c summaryFragment;

    /* compiled from: ActivityVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w0 f10002q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f10003r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f10004s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f10005t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, tm.a aVar, vh.a aVar2, vm.a aVar3) {
            super(0);
            this.f10002q = w0Var;
            this.f10003r = aVar;
            this.f10004s = aVar2;
            this.f10005t = aVar3;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a(this.f10002q, d0.b(C0567g.class), this.f10003r, this.f10004s, (vh.a) null, this.f10005t);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f10006q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f10006q = componentActivity;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = this.f10006q.y();
            m.e(y10, "viewModelStore");
            return y10;
        }
    }

    private final void d2() {
        if (e2().w() != -1) {
            h2();
        } else {
            e2().b0();
        }
    }

    private final C0567g e2() {
        return (C0567g) this.viewModel.getValue();
    }

    private final void f2(Bundle bundle, Recipe recipe) {
        b0 b0Var = null;
        if (bundle == null) {
            this.summaryFragment = c.INSTANCE.a(recipe, h.f15794s);
            n0 p10 = m0().p();
            m.e(p10, "beginTransaction(...)");
            b0 b0Var2 = this.binding;
            if (b0Var2 == null) {
                m.t("binding");
                b0Var2 = null;
            }
            int id = b0Var2.f7546d.getId();
            c cVar = this.summaryFragment;
            if (cVar == null) {
                m.t("summaryFragment");
                cVar = null;
            }
            p10.b(id, cVar);
            p10.j();
        }
        if (g2()) {
            b0 b0Var3 = this.binding;
            if (b0Var3 == null) {
                m.t("binding");
            } else {
                b0Var = b0Var3;
            }
            View view = b0Var.f7545c;
            m.e(view, "bottomGradientView");
            g6.d.g(view);
        }
        d2();
    }

    private final boolean g2() {
        return getResources().getBoolean(2131034115);
    }

    private final void h2() {
        Intent intent = new Intent(this, (Class<?>) RecipeStepsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, this.recipeId);
        startActivity(intent);
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        int i11;
        super.onCreate(bundle);
        b0 c10 = b0.c(getLayoutInflater());
        m.e(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            m.t("binding");
            c10 = null;
        }
        setContentView(c10.b());
        if (getIntent().hasExtra(MEATERIntent.EXTRA_RECIPE_ID)) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                i11 = extras.getInt(MEATERIntent.EXTRA_RECIPE_ID);
            } else {
                i11 = -1;
            }
            this.recipeId = i11;
        }
        if (getIntent().hasExtra(MEATERIntent.EXTRA_RECIPE_ID)) {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                i10 = extras2.getInt(MEATERIntent.EXTRA_RECIPE_ID);
            } else {
                i10 = -1;
            }
            this.recipeId = i10;
        }
        int i12 = this.recipeId;
        if (i12 == -1) {
            k6.b.t("Recipe ID was not provided in Extra. Closing the screen", new Object[0]);
            finish();
            return;
        }
        if (n7.g.f15786a.b(i12) != null) {
            e2().k(this.recipeId);
        }
        if (e2().E()) {
            f2(bundle, e2().A());
        } else {
            k6.b.t("Recipe ID was not provided in Extra. Closing the screen", new Object[0]);
            finish();
        }
    }
}
