package com.apptionlabs.meater_app.data;

import android.view.View;
import androidx.core.widget.j;
import b6.l2;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.m0;
import q5.y0;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DeviceViewHolder extends y0.a {
    public l2 adapterBinding;
    int[] textPreset;

    public DeviceViewHolder(View view, l2 l2Var) {
        super(view);
        this.textPreset = new int[]{(int) (m0.d() * 0.5d), (int) (m0.d() * 0.6f), (int) (m0.d() * 0.67f), (int) (m0.d() * 0.73f), (int) (m0.d() * 0.8f)};
        this.adapterBinding = l2Var;
        l2Var.X.getLayoutParams().width = (int) (b1.f10467g / 1.85d);
        j.h(l2Var.X, this.textPreset, 0);
        j.h(l2Var.U, this.textPreset, 0);
    }

    @Override // q5.y0.a
    public SwipeLayout getSwipeLayout() {
        return this.itemView.findViewById(2131363385);
    }
}
