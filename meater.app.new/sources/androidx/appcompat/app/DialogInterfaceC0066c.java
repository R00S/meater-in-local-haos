package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p024c.p025a.C0823a;

/* compiled from: AlertDialog.java */
/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public class DialogInterfaceC0066c extends DialogC0071h implements DialogInterface {

    /* renamed from: h */
    final AlertController f265h;

    /* compiled from: AlertDialog.java */
    /* renamed from: androidx.appcompat.app.c$a */
    public static class a {

        /* renamed from: a */
        private final AlertController.C0061f f266a;

        /* renamed from: b */
        private final int f267b;

        public a(Context context) {
            this(context, DialogInterfaceC0066c.m240g(context, 0));
        }

        /* renamed from: a */
        public DialogInterfaceC0066c m244a() {
            DialogInterfaceC0066c dialogInterfaceC0066c = new DialogInterfaceC0066c(this.f266a.f225a, this.f267b);
            this.f266a.m213a(dialogInterfaceC0066c.f265h);
            dialogInterfaceC0066c.setCancelable(this.f266a.f242r);
            if (this.f266a.f242r) {
                dialogInterfaceC0066c.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0066c.setOnCancelListener(this.f266a.f243s);
            dialogInterfaceC0066c.setOnDismissListener(this.f266a.f244t);
            DialogInterface.OnKeyListener onKeyListener = this.f266a.f245u;
            if (onKeyListener != null) {
                dialogInterfaceC0066c.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0066c;
        }

        /* renamed from: b */
        public Context m245b() {
            return this.f266a.f225a;
        }

        /* renamed from: c */
        public a m246c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f247w = listAdapter;
            c0061f.f248x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public a m247d(boolean z) {
            this.f266a.f242r = z;
            return this;
        }

        /* renamed from: e */
        public a m248e(View view) {
            this.f266a.f231g = view;
            return this;
        }

        /* renamed from: f */
        public a m249f(int i2) {
            this.f266a.f227c = i2;
            return this;
        }

        /* renamed from: g */
        public a m250g(Drawable drawable) {
            this.f266a.f228d = drawable;
            return this;
        }

        /* renamed from: h */
        public a m251h(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f246v = c0061f.f225a.getResources().getTextArray(i2);
            this.f266a.f248x = onClickListener;
            return this;
        }

        /* renamed from: i */
        public a m252i(int i2) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f232h = c0061f.f225a.getText(i2);
            return this;
        }

        /* renamed from: j */
        public a m253j(CharSequence charSequence) {
            this.f266a.f232h = charSequence;
            return this;
        }

        /* renamed from: k */
        public a m254k(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f246v = charSequenceArr;
            c0061f.f218J = onMultiChoiceClickListener;
            c0061f.f214F = zArr;
            c0061f.f215G = true;
            return this;
        }

        /* renamed from: l */
        public a m255l(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f236l = c0061f.f225a.getText(i2);
            this.f266a.f238n = onClickListener;
            return this;
        }

        /* renamed from: m */
        public a m256m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f236l = charSequence;
            c0061f.f238n = onClickListener;
            return this;
        }

        /* renamed from: n */
        public a m257n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f239o = charSequence;
            c0061f.f241q = onClickListener;
            return this;
        }

        /* renamed from: o */
        public a m258o(DialogInterface.OnCancelListener onCancelListener) {
            this.f266a.f243s = onCancelListener;
            return this;
        }

        /* renamed from: p */
        public a m259p(DialogInterface.OnKeyListener onKeyListener) {
            this.f266a.f245u = onKeyListener;
            return this;
        }

        /* renamed from: q */
        public a m260q(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f233i = c0061f.f225a.getText(i2);
            this.f266a.f235k = onClickListener;
            return this;
        }

        /* renamed from: r */
        public a m261r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f233i = charSequence;
            c0061f.f235k = onClickListener;
            return this;
        }

        /* renamed from: s */
        public a m262s(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f247w = listAdapter;
            c0061f.f248x = onClickListener;
            c0061f.f217I = i2;
            c0061f.f216H = true;
            return this;
        }

        /* renamed from: t */
        public a m263t(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f246v = charSequenceArr;
            c0061f.f248x = onClickListener;
            c0061f.f217I = i2;
            c0061f.f216H = true;
            return this;
        }

        /* renamed from: u */
        public a m264u(int i2) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f230f = c0061f.f225a.getText(i2);
            return this;
        }

        /* renamed from: v */
        public a m265v(CharSequence charSequence) {
            this.f266a.f230f = charSequence;
            return this;
        }

        /* renamed from: w */
        public a m266w(View view) {
            AlertController.C0061f c0061f = this.f266a;
            c0061f.f250z = view;
            c0061f.f249y = 0;
            c0061f.f213E = false;
            return this;
        }

        public a(Context context, int i2) {
            this.f266a = new AlertController.C0061f(new ContextThemeWrapper(context, DialogInterfaceC0066c.m240g(context, i2)));
            this.f267b = i2;
        }
    }

    protected DialogInterfaceC0066c(Context context, int i2) {
        super(context, m240g(context, i2));
        this.f265h = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: g */
    static int m240g(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0823a.f5041o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public Button m241e(int i2) {
        return this.f265h.m195c(i2);
    }

    /* renamed from: f */
    public ListView m242f() {
        return this.f265h.m197e();
    }

    /* renamed from: h */
    public void m243h(Drawable drawable) {
        this.f265h.m204o(drawable);
    }

    @Override // androidx.appcompat.app.DialogC0071h, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f265h.m198f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f265h.m199h(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f265h.m200i(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0071h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f265h.m206r(charSequence);
    }
}
