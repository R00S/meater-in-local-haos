package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzadu extends RelativeLayout {

    /* renamed from: f */
    private static final float[] f21954f = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: g */
    private AnimationDrawable f21955g;

    public zzadu(Context context, zzadt zzadtVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.m14372k(zzadtVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f21954f, null, null));
        shapeDrawable.getPaint().setColor(zzadtVar.m16460i7());
        setLayoutParams(layoutParams);
        zzk.zzli().mo17192c(this, shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzadtVar.mo16464m1())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzadtVar.mo16464m1());
            textView.setTextColor(zzadtVar.m16461j7());
            textView.setTextSize(zzadtVar.m16462k7());
            zzyt.m20844a();
            int iM17300a = zzazt.m17300a(context, 4);
            zzyt.m20844a();
            textView.setPadding(iM17300a, 0, zzazt.m17300a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzadw> listM16463l7 = zzadtVar.m16463l7();
        if (listM16463l7 != null && listM16463l7.size() > 1) {
            this.f21955g = new AnimationDrawable();
            Iterator<zzadw> it = listM16463l7.iterator();
            while (it.hasNext()) {
                try {
                    this.f21955g.addFrame((Drawable) ObjectWrapper.m14709k0(it.next().mo16470t4()), zzadtVar.m16465m7());
                } catch (Exception e2) {
                    zzbad.m17347c("Error while getting drawable.", e2);
                }
            }
            zzk.zzli().mo17192c(imageView, this.f21955g);
        } else if (listM16463l7.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.m14709k0(listM16463l7.get(0).mo16470t4()));
            } catch (Exception e3) {
                zzbad.m17347c("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f21955g;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
