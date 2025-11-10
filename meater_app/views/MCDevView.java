package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.data.NetworkConstant;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MCDevView extends AppCompatImageView {

    /* renamed from: t, reason: collision with root package name */
    private ih.g<NetworkConstant> f10320t;

    public MCDevView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10320t = zm.a.c(NetworkConstant.class);
        if (!isInEditMode()) {
            c(context);
        }
    }

    private void c(Context context) {
        setVisibility(8);
    }
}
