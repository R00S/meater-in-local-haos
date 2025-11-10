package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DeviceConnectionView extends ConstraintLayout {
    private final b6.u1 O;
    private final Context P;
    private final List<View> Q;
    private final List<View> R;
    private final List<View> S;
    private final List<View> T;
    private View U;
    private final Animation V;
    private View.OnClickListener W;

    /* renamed from: a0, reason: collision with root package name */
    private b f10269a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f10270b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f10271c0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f10272d0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10273a;

        static {
            int[] iArr = new int[b.values().length];
            f10273a = iArr;
            try {
                iArr[b.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10273a[b.DETAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum b {
        BASIC,
        DETAILED,
        WARNING
    }

    public DeviceConnectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.S = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.T = arrayList3;
        this.f10269a0 = b.DETAILED;
        this.f10270b0 = -1;
        this.f10271c0 = 0;
        this.f10272d0 = false;
        this.P = context;
        b6.u1 u1Var = (b6.u1) androidx.databinding.g.h(LayoutInflater.from(context), 2131558400, this, true);
        this.O = u1Var;
        this.V = AnimationUtils.loadAnimation(context, 2130772026);
        arrayList.add(u1Var.Q);
        arrayList.add(u1Var.R);
        arrayList.add(u1Var.S);
        arrayList.add(u1Var.T);
        arrayList.add(u1Var.U);
        arrayList2.add(null);
        arrayList2.add(u1Var.V);
        arrayList2.add(u1Var.W);
        arrayList2.add(u1Var.X);
        arrayList2.add(u1Var.Y);
        arrayList3.add(u1Var.f8300b0);
        arrayList3.add(u1Var.f8301c0);
        arrayList3.add(u1Var.f8302d0);
        arrayList3.add(u1Var.f8303e0);
        arrayList3.add(u1Var.f8304f0);
        arrayList3.add(u1Var.f8305g0);
        arrayList3.add(u1Var.f8306h0);
        arrayList3.add(u1Var.f8307i0);
        if (f8.l0.w(context)) {
            u1Var.Q.setColorFilter(f8.l0.i(context, 2131099682));
            u1Var.V.setColorFilter(f8.l0.i(context, 2131099682));
            u1Var.W.setColorFilter(f8.l0.i(context, 2131099682));
            u1Var.X.setColorFilter(f8.l0.i(context, 2131099682));
            u1Var.Y.setColorFilter(f8.l0.i(context, 2131099682));
        }
        J();
    }

    private void C(View view) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this.O.f8299a0);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ConstraintLayout.b(F(18), F(18)));
        imageView.setImageResource(2131231355);
        this.O.f8299a0.addView(imageView);
        imageView.setId(View.generateViewId());
        dVar.f(this.O.f8299a0);
        dVar.h(imageView.getId(), 3, view.getId(), 4, 0);
        dVar.h(imageView.getId(), 4, view.getId(), 4, 0);
        dVar.h(imageView.getId(), 6, view.getId(), 7, 0);
        dVar.h(imageView.getId(), 7, view.getId(), 7, 0);
        dVar.c(this.O.f8299a0);
        this.Q.add(imageView);
    }

    private void E(View view) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this.O.f8299a0);
        dVar.h(2131362663, 4, view.getId(), 3, 0);
        dVar.h(2131362663, 6, view.getId(), 6, 0);
        dVar.h(2131362663, 7, view.getId(), 7, 0);
        dVar.c(this.O.f8299a0);
        this.O.Z.setVisibility(0);
        this.O.Z.startAnimation(this.V);
    }

    private void J() {
        this.f10272d0 = true;
        M();
        setGone(this.R);
        setGone(this.S);
        setGone(this.T);
        this.O.f8308j0.setVisibility(8);
        this.O.Z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        Context context = this.P;
        if (context != null) {
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                E(view);
            }
        }
    }

    private void M() {
        Iterator<View> it = this.Q.iterator();
        while (it.hasNext()) {
            this.O.f8299a0.removeView(it.next());
        }
    }

    private boolean R(ImageView imageView, int i10, Object obj, boolean z10) {
        int i11;
        if (imageView == null) {
            return false;
        }
        imageView.setImageResource(i10);
        imageView.setTag(obj);
        if (z10) {
            if (i10 == 2131231389) {
                imageView.setColorFilter(f8.l0.h(2131100472));
            } else {
                Context context = this.P;
                if (f8.l0.w(context)) {
                    i11 = 2131099682;
                } else {
                    i11 = 2131100532;
                }
                imageView.setColorFilter(f8.l0.i(context, i11));
            }
        }
        imageView.setVisibility(0);
        return true;
    }

    private void U(int i10) {
        if (i10 > 0) {
            int i11 = i10 * 2;
            this.T.get(i11 - 1).setVisibility(0);
            this.T.get(i11 - 2).setVisibility(0);
        }
    }

    private View getLastVisibleDeviceView() {
        View view = null;
        for (View view2 : this.R) {
            if (view2 != null && view2.getVisibility() == 0) {
                view = view2;
            }
        }
        return view;
    }

    private void setGone(List<View> list) {
        for (View view : list) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public void D() {
        if (this.U != null) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.f(this.O.f8299a0);
            View view = new View(getContext());
            view.setLayoutParams(new ConstraintLayout.b(F(20), F(2)));
            this.O.f8299a0.addView(view);
            view.setId(View.generateViewId());
            dVar.f(this.O.f8299a0);
            dVar.h(view.getId(), 6, this.U.getId(), 7, 0);
            dVar.c(this.O.f8299a0);
        }
    }

    public int F(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    public void G(boolean z10, boolean z11) {
        int i10 = a.f10273a[this.f10269a0.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.O.f8299a0.setPadding(F(20), 0, 0, 0);
            }
        } else {
            this.O.f8299a0.setPadding(0, 0, 0, 0);
        }
        int i11 = 0;
        for (final View view : this.R) {
            if (view != null && view.getVisibility() == 0) {
                ImageView imageView = (ImageView) view;
                int i12 = 2131099682;
                if (this.f10269a0 == b.WARNING) {
                    Context context = this.P;
                    if (!f8.l0.w(context)) {
                        i12 = 2131100532;
                    }
                    imageView.setColorFilter(f8.l0.i(context, i12));
                } else if (f8.l0.w(this.P)) {
                    imageView.setColorFilter(f8.l0.i(this.P, 2131099682));
                } else {
                    imageView.clearColorFilter();
                }
                if (i11 == this.f10270b0) {
                    imageView.setColorFilter(this.f10271c0);
                    if (this.f10269a0 == b.DETAILED && z10) {
                        this.O.Z.setVisibility(4);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.views.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                DeviceConnectionView.this.K(view);
                            }
                        }, 350L);
                    }
                } else if (this.f10269a0 == b.DETAILED && z11 && this.f10272d0) {
                    C(view);
                }
                U(i11);
                i11++;
            }
        }
        this.f10272d0 = false;
    }

    public boolean H() {
        int i10 = this.f10270b0;
        if (i10 >= 0 && i10 < this.R.size()) {
            return true;
        }
        return false;
    }

    public void I() {
        View lastVisibleDeviceView = getLastVisibleDeviceView();
        if (lastVisibleDeviceView != null) {
            this.O.f8308j0.setVisibility(8);
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.f(this.O.f8299a0);
            dVar.h(2131363585, 6, lastVisibleDeviceView.getId(), 7, 0);
            dVar.c(this.O.f8299a0);
        }
    }

    public void L() {
        for (View view : this.T) {
            if (view != null) {
                ((MarchingAntsView) view).b();
            }
        }
    }

    public void N(int i10) {
        int i11 = 0;
        if (i10 > 0) {
            Iterator<View> it = this.R.iterator();
            while (it.hasNext()) {
                if (it.next().getVisibility() == 0) {
                    i11++;
                }
            }
        }
        if (i10 <= 0 || i10 != i11) {
            J();
        }
    }

    public boolean O(int i10, int i11) {
        boolean z10 = false;
        if (i10 < 0 || i10 >= this.S.size()) {
            return false;
        }
        ImageView imageView = (ImageView) this.S.get(i10);
        if (this.f10269a0 == b.WARNING) {
            z10 = true;
        }
        return R(imageView, i11, null, z10);
    }

    public boolean P(int i10, int i11, boolean z10) {
        if (i10 >= 0 && i10 < this.S.size()) {
            return R((ImageView) this.S.get(i10), i11, null, z10);
        }
        return false;
    }

    public void Q(int i10, int i11, Object obj) {
        View view;
        boolean z10;
        if (i10 >= 0 && i10 < this.R.size() && (view = this.R.get(i10)) != null) {
            this.U = view;
            view.setOnClickListener(this.W);
            ImageView imageView = (ImageView) view;
            if (this.f10269a0 == b.WARNING) {
                z10 = true;
            } else {
                z10 = false;
            }
            R(imageView, i11, obj, z10);
        }
    }

    public void S(boolean z10, int... iArr) {
        View view;
        int i10;
        for (int i11 : iArr) {
            if (i11 >= 0 && i11 < this.T.size() && (view = this.T.get(i11)) != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (z10) {
                    i10 = 13;
                } else {
                    i10 = 30;
                }
                layoutParams.width = F(i10);
            }
        }
    }

    public void T(int i10, int i11, int i12) {
        View lastVisibleDeviceView = getLastVisibleDeviceView();
        if (lastVisibleDeviceView != null) {
            this.O.f8308j0.setText(String.valueOf(i10));
            this.O.f8308j0.setTextColor(i11);
            this.O.f8308j0.setBackgroundResource(i12);
            this.O.f8308j0.setVisibility(0);
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.f(this.O.f8299a0);
            dVar.h(2131363585, 6, lastVisibleDeviceView.getId(), 7, F(4));
            dVar.h(2131363585, 4, lastVisibleDeviceView.getId(), 4, 0);
            dVar.c(this.O.f8299a0);
        }
    }

    public b getGraphStyle() {
        return this.f10269a0;
    }

    public List<WeakReference<MarchingAntsView>> getMarchingAnts() {
        ArrayList arrayList = new ArrayList();
        for (View view : this.T) {
            if (view != null) {
                arrayList.add(new WeakReference((MarchingAntsView) view));
            }
        }
        return arrayList;
    }

    public void setDeviceClickListener(View.OnClickListener onClickListener) {
        this.W = onClickListener;
    }

    public void setGraphStyle(b bVar) {
        this.f10269a0 = bVar;
    }

    public void setSelectedDevice(int i10) {
        this.f10270b0 = -1;
        if (i10 >= 0 && i10 < this.R.size()) {
            this.f10270b0 = i10;
        }
    }

    public void setSelectionColour(int i10) {
        this.f10271c0 = i10;
    }

    public void setVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
    }
}
