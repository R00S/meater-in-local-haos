package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzyt;

@zzard
/* loaded from: classes2.dex */
public final class zzp extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdku;
    private final zzx zzdkv;

    public zzp(Context context, zzq zzqVar, zzx zzxVar) {
        super(context);
        this.zzdkv = zzxVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzdku = imageButton;
        imageButton.setImageResource(R.drawable.btn_dialog);
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzyt.m20844a();
        int iM17300a = zzazt.m17300a(context, zzqVar.paddingLeft);
        zzyt.m20844a();
        int iM17300a2 = zzazt.m17300a(context, 0);
        zzyt.m20844a();
        int iM17300a3 = zzazt.m17300a(context, zzqVar.paddingRight);
        zzyt.m20844a();
        imageButton.setPadding(iM17300a, iM17300a2, iM17300a3, zzazt.m17300a(context, zzqVar.paddingBottom));
        imageButton.setContentDescription("Interstitial close button");
        zzyt.m20844a();
        int iM17300a4 = zzazt.m17300a(context, zzqVar.size + zzqVar.paddingLeft + zzqVar.paddingRight);
        zzyt.m20844a();
        addView(imageButton, new FrameLayout.LayoutParams(iM17300a4, zzazt.m17300a(context, zzqVar.size + zzqVar.paddingBottom), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzx zzxVar = this.zzdkv;
        if (zzxVar != null) {
            zzxVar.zztf();
        }
    }

    public final void zzaf(boolean z) {
        if (z) {
            this.zzdku.setVisibility(8);
        } else {
            this.zzdku.setVisibility(0);
        }
    }
}
