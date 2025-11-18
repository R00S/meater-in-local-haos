package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p024c.p025a.C0826d;
import p024c.p025a.C0828f;
import p024c.p025a.C0829g;
import p024c.p025a.C0831i;

/* compiled from: TooltipPopup.java */
/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
class C0193u0 {

    /* renamed from: a */
    private final Context f1314a;

    /* renamed from: b */
    private final View f1315b;

    /* renamed from: c */
    private final TextView f1316c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1317d;

    /* renamed from: e */
    private final Rect f1318e;

    /* renamed from: f */
    private final int[] f1319f;

    /* renamed from: g */
    private final int[] f1320g;

    C0193u0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1317d = layoutParams;
        this.f1318e = new Rect();
        this.f1319f = new int[2];
        this.f1320g = new int[2];
        this.f1314a = context;
        View viewInflate = LayoutInflater.from(context).inflate(C0829g.f5180s, (ViewGroup) null);
        this.f1315b = viewInflate;
        this.f1316c = (TextView) viewInflate.findViewById(C0828f.f5154s);
        layoutParams.setTitle(C0193u0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0831i.f5194a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1222a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1314a.getResources().getDimensionPixelOffset(C0826d.f5071j);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1314a.getResources().getDimensionPixelOffset(C0826d.f5070i);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1314a.getResources().getDimensionPixelOffset(z ? C0826d.f5073l : C0826d.f5072k);
        View viewM1223b = m1223b(view);
        if (viewM1223b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewM1223b.getWindowVisibleDisplayFrame(this.f1318e);
        Rect rect = this.f1318e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1314a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1318e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM1223b.getLocationOnScreen(this.f1320g);
        view.getLocationOnScreen(this.f1319f);
        int[] iArr = this.f1319f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1320g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i2) - (viewM1223b.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1315b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1315b.getMeasuredHeight();
        int[] iArr3 = this.f1319f;
        int i6 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + height + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
                return;
            } else {
                layoutParams.y = i7;
                return;
            }
        }
        if (measuredHeight + i7 <= this.f1318e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: b */
    private static View m1223b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: c */
    void m1224c() {
        if (m1225d()) {
            ((WindowManager) this.f1314a.getSystemService("window")).removeView(this.f1315b);
        }
    }

    /* renamed from: d */
    boolean m1225d() {
        return this.f1315b.getParent() != null;
    }

    /* renamed from: e */
    void m1226e(View view, int i2, int i3, boolean z, CharSequence charSequence) throws Resources.NotFoundException {
        if (m1225d()) {
            m1224c();
        }
        this.f1316c.setText(charSequence);
        m1222a(view, i2, i3, z, this.f1317d);
        ((WindowManager) this.f1314a.getSystemService("window")).addView(this.f1315b, this.f1317d);
    }
}
