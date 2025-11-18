package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonCreator;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: f */
    private int f17226f;

    /* renamed from: g */
    private int f17227g;

    /* renamed from: h */
    private View f17228h;

    /* renamed from: i */
    private View.OnClickListener f17229i;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ColorScheme {
    }

    /* renamed from: a */
    public final void m13836a(int i2, int i3) {
        this.f17226f = i2;
        this.f17227g = i3;
        Context context = getContext();
        View view = this.f17228h;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f17228h = SignInButtonCreator.m14394c(context, this.f17226f, this.f17227g);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i4 = this.f17226f;
            int i5 = this.f17227g;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.m14399a(context.getResources(), i4, i5);
            this.f17228h = signInButtonImpl;
        }
        addView(this.f17228h);
        this.f17228h.setEnabled(isEnabled());
        this.f17228h.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f17229i;
        if (onClickListener == null || view != this.f17228h) {
            return;
        }
        onClickListener.onClick(this);
    }

    public final void setColorScheme(int i2) {
        m13836a(this.f17226f, i2);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f17228h.setEnabled(z);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f17229i = onClickListener;
        View view = this.f17228h;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        m13836a(this.f17226f, this.f17227g);
    }

    public final void setSize(int i2) {
        m13836a(i2, this.f17227g);
    }
}
