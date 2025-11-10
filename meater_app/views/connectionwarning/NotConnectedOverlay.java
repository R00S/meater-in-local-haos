package com.apptionlabs.meater_app.views.connectionwarning;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.g;
import b6.y6;
import com.apptionlabs.meater_app.model.MEATERDevice;

/* loaded from: /tmp/meat/meat/classes.dex */
public class NotConnectedOverlay extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    private final View f10499q;

    /* renamed from: r, reason: collision with root package name */
    private final TextView f10500r;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f10501s;

    /* renamed from: t, reason: collision with root package name */
    private final TextView f10502t;

    /* renamed from: u, reason: collision with root package name */
    private final TextView f10503u;

    /* renamed from: v, reason: collision with root package name */
    private final y6 f10504v;

    /* renamed from: w, reason: collision with root package name */
    private final Context f10505w;

    public NotConnectedOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(17);
        setWeightSum(1.0f);
        this.f10505w = context;
        y6 y6Var = (y6) g.h(LayoutInflater.from(context), 2131558648, this, true);
        this.f10504v = y6Var;
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            Drawable background = y6Var.Z.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(androidx.core.graphics.a.k(-12303292, 204));
            }
        }
        View v10 = y6Var.v();
        this.f10499q = v10;
        this.f10500r = (TextView) v10.findViewById(2131361953);
        this.f10501s = (TextView) v10.findViewById(2131361955);
        this.f10502t = (TextView) v10.findViewById(2131361957);
        this.f10503u = (TextView) v10.findViewById(2131361959);
    }

    public void a(MEATERDevice mEATERDevice) {
        if (mEATERDevice.getParentDevice() != null && mEATERDevice.getParentDevice().isMEATERPlus()) {
            this.f10500r.setText(this.f10505w.getString(2132017907));
            this.f10501s.setText(this.f10505w.getString(2132018837));
            this.f10502t.setText(this.f10505w.getString(2132017916));
            this.f10503u.setText(this.f10505w.getString(2132018038));
            return;
        }
        this.f10500r.setText(this.f10505w.getString(2132017906));
        this.f10501s.setText(this.f10505w.getString(2132018838));
        this.f10502t.setText(this.f10505w.getString(2132017917));
        this.f10503u.setText(this.f10505w.getString(2132018037));
    }
}
