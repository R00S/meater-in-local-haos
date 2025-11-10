package com.apptionlabs.meater_app.data;

import android.view.View;
import b6.t0;
import q5.y0;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* loaded from: /tmp/meat/meat/classes.dex */
public class AlertViewHolder extends y0.a {
    public t0 adapterBinding;

    public AlertViewHolder(View view, t0 t0Var) {
        super(view);
        this.adapterBinding = t0Var;
    }

    @Override // q5.y0.a
    public SwipeLayout getSwipeLayout() {
        return this.itemView.findViewById(2131363385);
    }
}
