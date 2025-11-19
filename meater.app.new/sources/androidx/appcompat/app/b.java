package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class b extends p implements DialogInterface {

    /* renamed from: G, reason: collision with root package name */
    final AlertController f20639G;

    /* compiled from: AlertDialog.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f20640a;

        /* renamed from: b, reason: collision with root package name */
        private final int f20641b;

        public a(Context context) {
            this(context, b.n(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f20640a;
            bVar.f20621w = listAdapter;
            bVar.f20622x = onClickListener;
            return this;
        }

        public a b(View view) {
            this.f20640a.f20605g = view;
            return this;
        }

        public a c(Drawable drawable) {
            this.f20640a.f20602d = drawable;
            return this;
        }

        public b create() {
            b bVar = new b(this.f20640a.f20599a, this.f20641b);
            this.f20640a.a(bVar.f20639G);
            bVar.setCancelable(this.f20640a.f20616r);
            if (this.f20640a.f20616r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f20640a.f20617s);
            bVar.setOnDismissListener(this.f20640a.f20618t);
            DialogInterface.OnKeyListener onKeyListener = this.f20640a.f20619u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a d(DialogInterface.OnKeyListener onKeyListener) {
            this.f20640a.f20619u = onKeyListener;
            return this;
        }

        public a e(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f20640a;
            bVar.f20621w = listAdapter;
            bVar.f20622x = onClickListener;
            bVar.f20592I = i10;
            bVar.f20591H = true;
            return this;
        }

        public a f(int i10) {
            AlertController.b bVar = this.f20640a;
            bVar.f20604f = bVar.f20599a.getText(i10);
            return this;
        }

        public b g() {
            b bVarCreate = create();
            bVarCreate.show();
            return bVarCreate;
        }

        public Context getContext() {
            return this.f20640a.f20599a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f20640a;
            bVar.f20610l = bVar.f20599a.getText(i10);
            this.f20640a.f20612n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f20640a;
            bVar.f20607i = bVar.f20599a.getText(i10);
            this.f20640a.f20609k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f20640a.f20604f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f20640a;
            bVar.f20624z = view;
            bVar.f20623y = 0;
            bVar.f20588E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f20640a = new AlertController.b(new ContextThemeWrapper(context, b.n(context, i10)));
            this.f20641b = i10;
        }
    }

    protected b(Context context, int i10) {
        super(context, n(context, i10));
        this.f20639G = new AlertController(getContext(), this, getWindow());
    }

    static int n(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f42408o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView m() {
        return this.f20639G.d();
    }

    @Override // androidx.appcompat.app.p, d.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20639G.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f20639G.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f20639G.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f20639G.p(charSequence);
    }
}
