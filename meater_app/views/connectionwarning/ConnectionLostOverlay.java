package com.apptionlabs.meater_app.views.connectionwarning;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.g;
import b6.s1;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.views.b1;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ConnectionLostOverlay extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    private final s1 f10497q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f10498r;

    public ConnectionLostOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(17);
        setWeightSum(1.0f);
        this.f10498r = context;
        s1 s1Var = (s1) g.h(LayoutInflater.from(context), 2131558480, this, true);
        this.f10497q = s1Var;
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            Drawable background = s1Var.R.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(androidx.core.graphics.a.k(-12303292, 204));
            }
        }
    }

    public void a(MEATERDevice mEATERDevice) {
        String format;
        if (mEATERDevice.getParentDevice() != null && mEATERDevice.getParentDevice().isMEATERPlus()) {
            format = String.format(Locale.US, "%s\n\n%s", this.f10498r.getString(2132017530), this.f10498r.getString(2132017894));
        } else {
            format = String.format(Locale.US, "%s\n\n%s", this.f10498r.getString(2132017529), this.f10498r.getString(2132017894));
        }
        int i10 = (int) (b1.f10467g / 28.0f);
        SpannableString spannableString = new SpannableString(format);
        Matcher matcher = Pattern.compile("\n\n").matcher(format);
        while (matcher.find()) {
            spannableString.setSpan(new AbsoluteSizeSpan(9, true), matcher.start() + 1, matcher.end(), 33);
        }
        int indexOf = spannableString.toString().indexOf("@");
        Drawable e10 = androidx.core.content.a.e(getContext(), 2131231065);
        e10.setBounds(0, 0, i10, i10);
        spannableString.setSpan(new ImageSpan(e10, 1), indexOf, indexOf + 1, 33);
        this.f10497q.U.setText(spannableString);
    }
}
