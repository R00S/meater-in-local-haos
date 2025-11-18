package m;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* compiled from: AllCapsTransformationMethod.java */
/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3943a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    private Locale f45034a;

    public C3943a(Context context) {
        this.f45034a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f45034a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
    }
}
