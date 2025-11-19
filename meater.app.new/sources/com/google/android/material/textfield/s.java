package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import t1.c;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes2.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f37400a;

    /* renamed from: b, reason: collision with root package name */
    final r f37401b;

    /* renamed from: c, reason: collision with root package name */
    final Context f37402c;

    /* renamed from: d, reason: collision with root package name */
    final CheckableImageButton f37403d;

    s(r rVar) {
        this.f37400a = rVar.f37370B;
        this.f37401b = rVar;
        this.f37402c = rVar.getContext();
        this.f37403d = rVar.r();
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    c.a h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    final void r() {
        this.f37401b.L(false);
    }

    boolean t() {
        return false;
    }

    void s() {
    }

    void u() {
    }

    void a(Editable editable) {
    }

    void n(EditText editText) {
    }

    void q(boolean z10) {
    }

    void o(View view, t1.t tVar) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
