package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.InterfaceC0310t;
import androidx.core.widget.C0330k;
import p024c.p025a.C0823a;

/* compiled from: AppCompatEditText.java */
/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
public class C0168i extends EditText implements InterfaceC0310t {

    /* renamed from: f */
    private final C0158d f1149f;

    /* renamed from: g */
    private final C0188s f1150g;

    /* renamed from: h */
    private final C0186r f1151h;

    public C0168i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5013B);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f1149f;
        if (c0158d != null) {
            c0158d.m918b();
        }
        C0188s c0188s = this.f1150g;
        if (c0188s != null) {
            c0188s.m1155b();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f1149f;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f1149f;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0186r c0186r;
        return (Build.VERSION.SDK_INT >= 28 || (c0186r = this.f1151h) == null) ? super.getTextClassifier() : c0186r.m1112a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0170j.m1030a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f1149f;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f1149f;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0330k.m2335p(this, callback));
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f1149f;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f1149f;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0188s c0188s = this.f1150g;
        if (c0188s != null) {
            c0188s.m1169q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0186r c0186r;
        if (Build.VERSION.SDK_INT >= 28 || (c0186r = this.f1151h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0186r.m1113b(textClassifier);
        }
    }

    public C0168i(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0158d c0158d = new C0158d(this);
        this.f1149f = c0158d;
        c0158d.m921e(attributeSet, i2);
        C0188s c0188s = new C0188s(this);
        this.f1150g = c0188s;
        c0188s.m1165m(attributeSet, i2);
        c0188s.m1155b();
        this.f1151h = new C0186r(this);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
