package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzcec extends FrameLayout {

    /* renamed from: f */
    private final zzayb f24161f;

    public zzcec(Context context, View view, zzayb zzaybVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f24161f = zzaybVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f24161f.m17224g(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            KeyEvent.Callback childAt = getChildAt(i3);
            if (childAt != null && (childAt instanceof zzbgz)) {
                arrayList.add((zzbgz) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((zzbgz) obj).destroy();
        }
    }
}
