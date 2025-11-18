package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0330k;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: AppCompatCheckedTextView.java */
/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public class C0162f extends CheckedTextView {

    /* renamed from: f */
    private static final int[] f1115f = {R.attr.checkMark};

    /* renamed from: g */
    private final C0188s f1116g;

    public C0162f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0188s c0188s = this.f1116g;
        if (c0188s != null) {
            c0188s.m1155b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0170j.m1030a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(C0833a.m5262d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0330k.m2335p(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0188s c0188s = this.f1116g;
        if (c0188s != null) {
            c0188s.m1169q(context, i2);
        }
    }

    public C0162f(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0188s c0188s = new C0188s(this);
        this.f1116g = c0188s;
        c0188s.m1165m(attributeSet, i2);
        c0188s.m1155b();
        C0185q0 c0185q0M1091v = C0185q0.m1091v(getContext(), attributeSet, f1115f, i2, 0);
        setCheckMarkDrawable(c0185q0M1091v.m1098g(0));
        c0185q0M1091v.m1111w();
    }
}
