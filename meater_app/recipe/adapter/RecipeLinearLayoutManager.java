package com.apptionlabs.meater_app.recipe.adapter;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.data.Log;
import kotlin.Metadata;

/* compiled from: RecipeLinearLayoutManager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/adapter/RecipeLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "R1", "Landroidx/recyclerview/widget/RecyclerView$w;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$b0;", "state", "Lih/u;", "d1", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class RecipeLinearLayoutManager extends LinearLayoutManager {
    public RecipeLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean R1() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        try {
            super.d1(wVar, b0Var);
        } catch (IndexOutOfBoundsException unused) {
            Log.error("Error", "meet a index out of bond in RecyclerView");
        }
    }
}
