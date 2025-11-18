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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0311u;
import androidx.fragment.app.AbstractC0485u;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8911e;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8914h;
import p241e.p254e.p256b.p271c.C8916j;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p279r.ViewOnTouchListenerC8938a;
import p241e.p254e.p256b.p271c.p285x.C8946b;

/* compiled from: MaterialDatePicker.java */
/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes2.dex */
public final class C7996f<S> extends DialogInterfaceOnCancelListenerC0466c {

    /* renamed from: f */
    static final Object f30139f = "CONFIRM_BUTTON_TAG";

    /* renamed from: g */
    static final Object f30140g = "CANCEL_BUTTON_TAG";

    /* renamed from: h */
    static final Object f30141h = "TOGGLE_BUTTON_TAG";

    /* renamed from: i */
    private final LinkedHashSet<InterfaceC7997g<? super S>> f30142i = new LinkedHashSet<>();

    /* renamed from: j */
    private final LinkedHashSet<View.OnClickListener> f30143j = new LinkedHashSet<>();

    /* renamed from: k */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f30144k = new LinkedHashSet<>();

    /* renamed from: l */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f30145l = new LinkedHashSet<>();

    /* renamed from: m */
    private int f30146m;

    /* renamed from: n */
    private DateSelector<S> f30147n;

    /* renamed from: o */
    private AbstractC8002l<S> f30148o;

    /* renamed from: p */
    private CalendarConstraints f30149p;

    /* renamed from: q */
    private C7995e<S> f30150q;

    /* renamed from: r */
    private int f30151r;

    /* renamed from: s */
    private CharSequence f30152s;

    /* renamed from: t */
    private boolean f30153t;

    /* renamed from: u */
    private int f30154u;

    /* renamed from: v */
    private TextView f30155v;

    /* renamed from: w */
    private CheckableImageButton f30156w;

    /* renamed from: x */
    private C8900g f30157x;

    /* renamed from: y */
    private Button f30158y;

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$a */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C7996f.this.f30142i.iterator();
            while (it.hasNext()) {
                ((InterfaceC7997g) it.next()).m24400a(C7996f.this.m24398p());
            }
            C7996f.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C7996f.this.f30143j.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C7996f.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$c */
    class c extends AbstractC8001k<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.AbstractC8001k
        /* renamed from: a */
        public void mo24399a(S s) {
            C7996f.this.m24395v();
            C7996f.this.f30158y.setEnabled(C7996f.this.f30147n.m24324K0());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$d */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7996f.this.f30158y.setEnabled(C7996f.this.f30147n.m24324K0());
            C7996f.this.f30156w.toggle();
            C7996f c7996f = C7996f.this;
            c7996f.m24396w(c7996f.f30156w);
            C7996f.this.m24393t();
        }
    }

    /* renamed from: l */
    private static Drawable m24387l(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C0833a.m5262d(context, C8911e.f33894c));
        stateListDrawable.addState(new int[0], C0833a.m5262d(context, C8911e.f33895d));
        return stateListDrawable;
    }

    /* renamed from: m */
    private static int m24388m(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C8910d.f33852F) + resources.getDimensionPixelOffset(C8910d.f33853G) + resources.getDimensionPixelOffset(C8910d.f33851E);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C8910d.f33847A);
        int i2 = C7999i.f30166f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C8910d.f33890y) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(C8910d.f33850D)) + resources.getDimensionPixelOffset(C8910d.f33888w);
    }

    /* renamed from: o */
    private static int m24389o(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C8910d.f33889x);
        int i2 = Month.m24338u().f30083j;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C8910d.f33891z) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(C8910d.f33849C));
    }

    /* renamed from: q */
    private int m24390q(Context context) {
        int i2 = this.f30146m;
        return i2 != 0 ? i2 : this.f30147n.m24323E0(context);
    }

    /* renamed from: r */
    private void m24391r(Context context) {
        this.f30156w.setTag(f30141h);
        this.f30156w.setImageDrawable(m24387l(context));
        this.f30156w.setChecked(this.f30154u != 0);
        C0311u.m2131i0(this.f30156w, null);
        m24396w(this.f30156w);
        this.f30156w.setOnClickListener(new d());
    }

    /* renamed from: s */
    static boolean m24392s(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C8946b.m28497c(context, C8908b.f33832v, C7995e.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m24393t() {
        this.f30150q = C7995e.m24368u(this.f30147n, m24390q(requireContext()), this.f30149p);
        this.f30148o = this.f30156w.isChecked() ? C7998h.m24401f(this.f30147n, this.f30149p) : this.f30150q;
        m24395v();
        AbstractC0485u abstractC0485uM3493m = getChildFragmentManager().m3493m();
        abstractC0485uM3493m.m3742q(C8912f.f33926p, this.f30148o);
        abstractC0485uM3493m.mo3550k();
        this.f30148o.m24418d(new c());
    }

    /* renamed from: u */
    public static long m24394u() {
        return Month.m24338u().f30085l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m24395v() {
        String strM24397n = m24397n();
        this.f30155v.setContentDescription(String.format(getString(C8916j.f33968l), strM24397n));
        this.f30155v.setText(strM24397n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m24396w(CheckableImageButton checkableImageButton) {
        this.f30156w.setContentDescription(this.f30156w.isChecked() ? checkableImageButton.getContext().getString(C8916j.f33971o) : checkableImageButton.getContext().getString(C8916j.f33973q));
    }

    /* renamed from: n */
    public String m24397n() {
        return this.f30147n.m24321A(getContext());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f30144k.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f30146m = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f30147n = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f30149p = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f30151r = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f30152s = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f30154u = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m24390q(requireContext()));
        Context context = dialog.getContext();
        this.f30153t = m24392s(context);
        int iM28497c = C8946b.m28497c(context, C8908b.f33825o, C7996f.class.getCanonicalName());
        C8900g c8900g = new C8900g(context, null, C8908b.f33832v, C8917k.f33998w);
        this.f30157x = c8900g;
        c8900g.m28278N(context);
        this.f30157x.m28284X(ColorStateList.valueOf(iM28497c));
        this.f30157x.m28283W(C0311u.m2152t(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f30153t ? C8914h.f33955q : C8914h.f33954p, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f30153t) {
            viewInflate.findViewById(C8912f.f33926p).setLayoutParams(new LinearLayout.LayoutParams(m24389o(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(C8912f.f33927q);
            View viewFindViewById2 = viewInflate.findViewById(C8912f.f33926p);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(m24389o(context), -1));
            viewFindViewById2.setMinimumHeight(m24388m(requireContext()));
        }
        TextView textView = (TextView) viewInflate.findViewById(C8912f.f33933w);
        this.f30155v = textView;
        C0311u.m2135k0(textView, 1);
        this.f30156w = (CheckableImageButton) viewInflate.findViewById(C8912f.f33934x);
        TextView textView2 = (TextView) viewInflate.findViewById(C8912f.f33935y);
        CharSequence charSequence = this.f30152s;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f30151r);
        }
        m24391r(context);
        this.f30158y = (Button) viewInflate.findViewById(C8912f.f33912b);
        if (this.f30147n.m24324K0()) {
            this.f30158y.setEnabled(true);
        } else {
            this.f30158y.setEnabled(false);
        }
        this.f30158y.setTag(f30139f);
        this.f30158y.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(C8912f.f33911a);
        button.setTag(f30140g);
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f30145l.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f30146m);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f30147n);
        CalendarConstraints.C7987b c7987b = new CalendarConstraints.C7987b(this.f30149p);
        if (this.f30150q.m24372q() != null) {
            c7987b.m24320b(this.f30150q.m24372q().f30085l);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c7987b.m24319a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f30151r);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f30152s);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f30153t) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f30157x);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C8910d.f33848B);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f30157x, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC8938a(requireDialog(), rect));
        }
        m24393t();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onStop() {
        this.f30148o.m24419e();
        super.onStop();
    }

    /* renamed from: p */
    public final S m24398p() {
        return this.f30147n.m24326V0();
    }
}
