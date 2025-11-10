package com.apptionlabs.meater_app.views;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CustomLinearLayoutManager extends LinearLayoutManager {
    private boolean I;

    public CustomLinearLayoutManager(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.I;
    }

    public CustomLinearLayoutManager(Context context, int i10, boolean z10, boolean z11) {
        super(context, i10, z10);
        this.I = z11;
    }
}
