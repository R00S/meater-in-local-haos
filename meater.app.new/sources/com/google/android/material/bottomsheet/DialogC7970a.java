package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0071h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0280a;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8914h;
import p241e.p254e.p256b.p271c.C8917k;

/* compiled from: BottomSheetDialog.java */
/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes2.dex */
public class DialogC7970a extends DialogC0071h {

    /* renamed from: h */
    private BottomSheetBehavior<FrameLayout> f29887h;

    /* renamed from: i */
    private FrameLayout f29888i;

    /* renamed from: j */
    boolean f29889j;

    /* renamed from: k */
    boolean f29890k;

    /* renamed from: l */
    private boolean f29891l;

    /* renamed from: m */
    private boolean f29892m;

    /* renamed from: n */
    private BottomSheetBehavior.AbstractC7968e f29893n;

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC7970a dialogC7970a = DialogC7970a.this;
            if (dialogC7970a.f29890k && dialogC7970a.isShowing() && DialogC7970a.this.m24021g()) {
                DialogC7970a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$b */
    class b extends C0280a {
        b() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            if (!DialogC7970a.this.f29890k) {
                c0289c.m1978d0(false);
            } else {
                c0289c.m1972a(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
                c0289c.m1978d0(true);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: j */
        public boolean mo1861j(View view, int i2, Bundle bundle) {
            if (i2 == 1048576) {
                DialogC7970a dialogC7970a = DialogC7970a.this;
                if (dialogC7970a.f29890k) {
                    dialogC7970a.cancel();
                    return true;
                }
            }
            return super.mo1861j(view, i2, bundle);
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$c */
    class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$d */
    class d extends BottomSheetBehavior.AbstractC7968e {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC7968e
        public void onSlide(View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC7968e
        public void onStateChanged(View view, int i2) {
            if (i2 == 5) {
                DialogC7970a.this.cancel();
            }
        }
    }

    public DialogC7970a(Context context, int i2) {
        super(context, m24017b(context, i2));
        this.f29890k = true;
        this.f29891l = true;
        this.f29893n = new d();
        m390d(1);
    }

    /* renamed from: b */
    private static int m24017b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C8908b.f33815e, typedValue, true) ? typedValue.resourceId : C8917k.f33980e;
    }

    /* renamed from: e */
    private FrameLayout m24018e() {
        if (this.f29888i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C8914h.f33940b, null);
            this.f29888i = frameLayout;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM23980T = BottomSheetBehavior.m23980T((FrameLayout) frameLayout.findViewById(C8912f.f33914d));
            this.f29887h = bottomSheetBehaviorM23980T;
            bottomSheetBehaviorM23980T.m23989K(this.f29893n);
            this.f29887h.m24001g0(this.f29890k);
        }
        return this.f29888i;
    }

    /* renamed from: h */
    private View m24019h(int i2, View view, ViewGroup.LayoutParams layoutParams) {
        m24018e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f29888i.findViewById(C8912f.f33913c);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f29888i.findViewById(C8912f.f33914d);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C8912f.f33909J).setOnClickListener(new a());
        C0311u.m2131i0(frameLayout, new b());
        frameLayout.setOnTouchListener(new c());
        return this.f29888i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM24020f = m24020f();
        if (!this.f29889j || bottomSheetBehaviorM24020f.m23993V() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorM24020f.m24006l0(5);
        }
    }

    /* renamed from: f */
    public BottomSheetBehavior<FrameLayout> m24020f() {
        if (this.f29887h == null) {
            m24018e();
        }
        return this.f29887h;
    }

    /* renamed from: g */
    boolean m24021g() {
        if (!this.f29892m) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f29891l = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f29892m = true;
        }
        return this.f29891l;
    }

    @Override // androidx.appcompat.app.DialogC0071h, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f29887h;
        if (bottomSheetBehavior == null || bottomSheetBehavior.m23993V() != 5) {
            return;
        }
        this.f29887h.m24006l0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f29890k != z) {
            this.f29890k = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f29887h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m24001g0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f29890k) {
            this.f29890k = true;
        }
        this.f29891l = z;
        this.f29892m = true;
    }

    @Override // androidx.appcompat.app.DialogC0071h, android.app.Dialog
    public void setContentView(int i2) {
        super.setContentView(m24019h(i2, null, null));
    }

    @Override // androidx.appcompat.app.DialogC0071h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m24019h(0, view, null));
    }

    @Override // androidx.appcompat.app.DialogC0071h, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m24019h(0, view, layoutParams));
    }
}
