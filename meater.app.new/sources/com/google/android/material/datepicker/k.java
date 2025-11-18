package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import j.C3699a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s1.C4469y0;
import s1.I;
import s1.X;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class k<S> extends androidx.fragment.app.n {

    /* renamed from: A1, reason: collision with root package name */
    static final Object f36446A1 = "CONFIRM_BUTTON_TAG";

    /* renamed from: B1, reason: collision with root package name */
    static final Object f36447B1 = "CANCEL_BUTTON_TAG";

    /* renamed from: C1, reason: collision with root package name */
    static final Object f36448C1 = "TOGGLE_BUTTON_TAG";

    /* renamed from: W0, reason: collision with root package name */
    private final LinkedHashSet<l<? super S>> f36449W0 = new LinkedHashSet<>();

    /* renamed from: X0, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f36450X0 = new LinkedHashSet<>();

    /* renamed from: Y0, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f36451Y0 = new LinkedHashSet<>();

    /* renamed from: Z0, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f36452Z0 = new LinkedHashSet<>();

    /* renamed from: a1, reason: collision with root package name */
    private int f36453a1;

    /* renamed from: b1, reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f36454b1;

    /* renamed from: c1, reason: collision with root package name */
    private r<S> f36455c1;

    /* renamed from: d1, reason: collision with root package name */
    private com.google.android.material.datepicker.a f36456d1;

    /* renamed from: e1, reason: collision with root package name */
    private g f36457e1;

    /* renamed from: f1, reason: collision with root package name */
    private i<S> f36458f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f36459g1;

    /* renamed from: h1, reason: collision with root package name */
    private CharSequence f36460h1;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f36461i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f36462j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f36463k1;

    /* renamed from: l1, reason: collision with root package name */
    private CharSequence f36464l1;

    /* renamed from: m1, reason: collision with root package name */
    private int f36465m1;

    /* renamed from: n1, reason: collision with root package name */
    private CharSequence f36466n1;

    /* renamed from: o1, reason: collision with root package name */
    private int f36467o1;

    /* renamed from: p1, reason: collision with root package name */
    private CharSequence f36468p1;

    /* renamed from: q1, reason: collision with root package name */
    private int f36469q1;

    /* renamed from: r1, reason: collision with root package name */
    private CharSequence f36470r1;

    /* renamed from: s1, reason: collision with root package name */
    private TextView f36471s1;

    /* renamed from: t1, reason: collision with root package name */
    private TextView f36472t1;

    /* renamed from: u1, reason: collision with root package name */
    private CheckableImageButton f36473u1;

    /* renamed from: v1, reason: collision with root package name */
    private X7.g f36474v1;

    /* renamed from: w1, reason: collision with root package name */
    private Button f36475w1;

    /* renamed from: x1, reason: collision with root package name */
    private boolean f36476x1;

    /* renamed from: y1, reason: collision with root package name */
    private CharSequence f36477y1;

    /* renamed from: z1, reason: collision with root package name */
    private CharSequence f36478z1;

    /* compiled from: MaterialDatePicker.java */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = k.this.f36449W0.iterator();
            while (it.hasNext()) {
                ((l) it.next()).a(k.this.a3());
            }
            k.this.A2();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = k.this.f36450X0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            k.this.A2();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class c implements I {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f36481B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ View f36482C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f36483D;

        c(int i10, View view, int i11) {
            this.f36481B = i10;
            this.f36482C = view;
            this.f36483D = i11;
        }

        @Override // s1.I
        public C4469y0 a(View view, C4469y0 c4469y0) {
            int i10 = c4469y0.f(C4469y0.l.h()).f43451b;
            if (this.f36481B >= 0) {
                this.f36482C.getLayoutParams().height = this.f36481B + i10;
                View view2 = this.f36482C;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f36482C;
            view3.setPadding(view3.getPaddingLeft(), this.f36483D + i10, this.f36482C.getPaddingRight(), this.f36482C.getPaddingBottom());
            return c4469y0;
        }
    }

    /* compiled from: MaterialDatePicker.java */
    class d extends q<S> {
        d() {
        }

        @Override // com.google.android.material.datepicker.q
        public void a(S s10) {
            k kVar = k.this;
            kVar.j3(kVar.Y2());
            k.this.f36475w1.setEnabled(k.this.V2().X0());
        }
    }

    private static Drawable T2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C3699a.b(context, C7.f.f2434d));
        stateListDrawable.addState(new int[0], C3699a.b(context, C7.f.f2435e));
        return stateListDrawable;
    }

    private void U2(Window window) {
        if (this.f36476x1) {
            return;
        }
        View viewFindViewById = f2().findViewById(C7.g.f2482i);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.u.d(viewFindViewById), null);
        X.B0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f36476x1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.d<S> V2() {
        if (this.f36454b1 == null) {
            this.f36454b1 = (com.google.android.material.datepicker.d) X().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f36454b1;
    }

    private static CharSequence W2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String X2() {
        return V2().M0(e2());
    }

    private static int Z2(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7.e.f2386d0);
        int i10 = n.p().f36493E;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C7.e.f2390f0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C7.e.f2396i0));
    }

    private int b3(Context context) {
        int i10 = this.f36453a1;
        return i10 != 0 ? i10 : V2().P0(context);
    }

    private void c3(Context context) {
        this.f36473u1.setTag(f36448C1);
        this.f36473u1.setImageDrawable(T2(context));
        this.f36473u1.setChecked(this.f36462j1 != 0);
        X.n0(this.f36473u1, null);
        l3(this.f36473u1);
        this.f36473u1.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36445B.g3(view);
            }
        });
    }

    static boolean d3(Context context) {
        return h3(context, R.attr.windowFullscreen);
    }

    private boolean e3() {
        return u0().getConfiguration().orientation == 2;
    }

    static boolean f3(Context context) {
        return h3(context, C7.c.f2297U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g3(View view) {
        this.f36475w1.setEnabled(V2().X0());
        this.f36473u1.toggle();
        this.f36462j1 = this.f36462j1 == 1 ? 0 : 1;
        l3(this.f36473u1);
        i3();
    }

    static boolean h3(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(U7.b.d(context, C7.c.f2278B, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void i3() {
        int iB3 = b3(e2());
        m mVarP2 = i.P2(V2(), iB3, this.f36456d1, this.f36457e1);
        this.f36458f1 = mVarP2;
        if (this.f36462j1 == 1) {
            mVarP2 = m.z2(V2(), iB3, this.f36456d1);
        }
        this.f36455c1 = mVarP2;
        k3();
        j3(Y2());
        C cR = Y().r();
        cR.t(C7.g.f2444A, this.f36455c1);
        cR.l();
        this.f36455c1.x2(new d());
    }

    private void k3() {
        this.f36471s1.setText((this.f36462j1 == 1 && e3()) ? this.f36478z1 : this.f36477y1);
    }

    private void l3(CheckableImageButton checkableImageButton) {
        this.f36473u1.setContentDescription(this.f36462j1 == 1 ? checkableImageButton.getContext().getString(C7.k.f2554w) : checkableImageButton.getContext().getString(C7.k.f2556y));
    }

    @Override // androidx.fragment.app.n
    public final Dialog F2(Bundle bundle) {
        Dialog dialog = new Dialog(e2(), b3(e2()));
        Context context = dialog.getContext();
        this.f36461i1 = d3(context);
        int i10 = C7.c.f2278B;
        int i11 = C7.l.f2560C;
        this.f36474v1 = new X7.g(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C7.m.f2774S3, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(C7.m.f2784T3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f36474v1.Q(context);
        this.f36474v1.b0(ColorStateList.valueOf(color));
        this.f36474v1.a0(X.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String Y2() {
        return V2().L(Z());
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void a1(Bundle bundle) throws Resources.NotFoundException {
        super.a1(bundle);
        if (bundle == null) {
            bundle = X();
        }
        this.f36453a1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f36454b1 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f36456d1 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f36457e1 = (g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f36459g1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f36460h1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f36462j1 = bundle.getInt("INPUT_MODE_KEY");
        this.f36463k1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36464l1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f36465m1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36466n1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f36467o1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36468p1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f36469q1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36470r1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f36460h1;
        if (text == null) {
            text = e2().getResources().getText(this.f36459g1);
        }
        this.f36477y1 = text;
        this.f36478z1 = W2(text);
    }

    public final S a3() {
        return V2().k1();
    }

    @Override // androidx.fragment.app.Fragment
    public final View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f36461i1 ? C7.i.f2528z : C7.i.f2527y, viewGroup);
        Context context = viewInflate.getContext();
        g gVar = this.f36457e1;
        if (gVar != null) {
            gVar.h(context);
        }
        if (this.f36461i1) {
            viewInflate.findViewById(C7.g.f2444A).setLayoutParams(new LinearLayout.LayoutParams(Z2(context), -2));
        } else {
            viewInflate.findViewById(C7.g.f2445B).setLayoutParams(new LinearLayout.LayoutParams(Z2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(C7.g.f2451H);
        this.f36472t1 = textView;
        X.p0(textView, 1);
        this.f36473u1 = (CheckableImageButton) viewInflate.findViewById(C7.g.f2452I);
        this.f36471s1 = (TextView) viewInflate.findViewById(C7.g.f2453J);
        c3(context);
        this.f36475w1 = (Button) viewInflate.findViewById(C7.g.f2476d);
        if (V2().X0()) {
            this.f36475w1.setEnabled(true);
        } else {
            this.f36475w1.setEnabled(false);
        }
        this.f36475w1.setTag(f36446A1);
        CharSequence charSequence = this.f36464l1;
        if (charSequence != null) {
            this.f36475w1.setText(charSequence);
        } else {
            int i10 = this.f36463k1;
            if (i10 != 0) {
                this.f36475w1.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f36466n1;
        if (charSequence2 != null) {
            this.f36475w1.setContentDescription(charSequence2);
        } else if (this.f36465m1 != 0) {
            this.f36475w1.setContentDescription(Z().getResources().getText(this.f36465m1));
        }
        this.f36475w1.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(C7.g.f2470a);
        button.setTag(f36447B1);
        CharSequence charSequence3 = this.f36468p1;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f36467o1;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f36470r1;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f36469q1 != 0) {
            button.setContentDescription(Z().getResources().getText(this.f36469q1));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    void j3(String str) {
        this.f36472t1.setContentDescription(X2());
        this.f36472t1.setText(str);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f36451Y0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f36452Z0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) E0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void w1(Bundle bundle) {
        super.w1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f36453a1);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f36454b1);
        a.b bVar = new a.b(this.f36456d1);
        i<S> iVar = this.f36458f1;
        n nVarK2 = iVar == null ? null : iVar.K2();
        if (nVarK2 != null) {
            bVar.b(nVarK2.f36495G);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f36457e1);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f36459g1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f36460h1);
        bundle.putInt("INPUT_MODE_KEY", this.f36462j1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f36463k1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f36464l1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36465m1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36466n1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f36467o1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f36468p1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36469q1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36470r1);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() throws Resources.NotFoundException {
        super.x1();
        Window window = J2().getWindow();
        if (this.f36461i1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f36474v1);
            U2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = u0().getDimensionPixelOffset(C7.e.f2394h0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f36474v1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new N7.a(J2(), rect));
        }
        i3();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void y1() {
        this.f36455c1.y2();
        super.y1();
    }
}
