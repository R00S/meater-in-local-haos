package P5;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.apptionlabs.meater_app.R;
import g1.C3377a;
import i0.C3574f0;
import i0.C3576g0;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public class S {
    public static void a(View view, boolean z10) {
        if (z10) {
            view.startAnimation(AnimationUtils.loadAnimation(x4.g.h(), R.anim.slide_down));
        } else {
            view.startAnimation(AnimationUtils.loadAnimation(x4.g.h(), R.anim.slide_up));
        }
    }

    public static int b(Context context, String str) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str.trim().toLowerCase(), "drawable", context.getPackageName());
    }

    public static int c(int i10) {
        return Color.argb(Color.alpha(i10), Math.max(Math.round(Color.red(i10) * 1.0f), 128), Math.max(Math.round(Color.green(i10) * 1.0f), 128), Math.max(Math.round(Color.blue(i10) * 1.0f), 128));
    }

    public static void d(Drawable drawable, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT < 29) {
            drawable.setColorFilter(i10, z10 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.DARKEN);
        } else {
            C3576g0.a();
            drawable.setColorFilter(C3574f0.a(i10, z10 ? BlendMode.MULTIPLY : BlendMode.DARKEN));
        }
    }

    public static void e(ImageView imageView, String str) {
        int iB;
        if (imageView == null || str == null || str.trim().isEmpty() || (iB = b(imageView.getContext(), str)) <= 0) {
            return;
        }
        imageView.setImageResource(iB);
    }

    public static void f(boolean z10, View... viewArr) {
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setVisibility(z10 ? 0 : 8);
                }
            }
        }
    }

    public static void g(View... viewArr) {
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setVisibility(view.getVisibility() == 0 ? 8 : 0);
                }
            }
        }
    }

    public static void h(View view, int i10, boolean z10) {
        Drawable background = view.getBackground();
        if (background instanceof ShapeDrawable) {
            Paint paint = ((ShapeDrawable) background).getPaint();
            if (z10) {
                i10 = C3377a.c(view.getContext(), i10);
            }
            paint.setColor(i10);
            return;
        }
        if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            if (z10) {
                i10 = C3377a.c(view.getContext(), i10);
            }
            gradientDrawable.setColor(i10);
            return;
        }
        if (background instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) background;
            if (z10) {
                i10 = C3377a.c(view.getContext(), i10);
            }
            colorDrawable.setColor(i10);
        }
    }
}
