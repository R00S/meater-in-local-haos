package L4;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: CloseViewBinding.java */
/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final AppCompatImageView f9312a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f9313b;

    private D(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f9312a = appCompatImageView;
        this.f9313b = appCompatImageView2;
    }

    public static D a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new D(appCompatImageView, appCompatImageView);
    }
}
