package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.C0156c;
import androidx.appcompat.widget.C0160e;
import androidx.appcompat.widget.C0162f;
import androidx.appcompat.widget.C0168i;
import androidx.appcompat.widget.C0172k;
import androidx.appcompat.widget.C0176m;
import androidx.appcompat.widget.C0179n0;
import androidx.appcompat.widget.C0182p;
import androidx.appcompat.widget.C0190t;
import androidx.appcompat.widget.C0194v;
import androidx.core.view.C0311u;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;
import p024c.p025a.C0832j;
import p024c.p025a.p032o.C0844d;
import p024c.p041e.C0873g;

/* compiled from: AppCompatViewInflater.java */
/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
public class C0073j {

    /* renamed from: a */
    private static final Class<?>[] f371a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f372b = {R.attr.onClick};

    /* renamed from: c */
    private static final String[] f373c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final C0873g<String, Constructor<? extends View>> f374d = new C0873g<>();

    /* renamed from: e */
    private final Object[] f375e = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    /* renamed from: androidx.appcompat.app.j$a */
    private static class a implements View.OnClickListener {

        /* renamed from: f */
        private final View f376f;

        /* renamed from: g */
        private final String f377g;

        /* renamed from: h */
        private Method f378h;

        /* renamed from: i */
        private Context f379i;

        public a(View view, String str) {
            this.f376f = view;
            this.f377g = str;
        }

        /* renamed from: a */
        private void m412a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f377g, View.class)) != null) {
                        this.f378h = method;
                        this.f379i = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f376f.getId();
            if (id == -1) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = " with id '" + this.f376f.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f377g + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f376f.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f378h == null) {
                m412a(this.f376f.getContext());
            }
            try {
                this.f378h.invoke(this.f379i, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    /* renamed from: a */
    private void m391a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C0311u.m2097J(view)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f372b);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: r */
    private View m392r(Context context, String str, String str2) throws InflateException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        String str3;
        C0873g<String, Constructor<? extends View>> c0873g = f374d;
        Constructor<? extends View> constructor = c0873g.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f371a);
            c0873g.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f375e);
    }

    /* renamed from: s */
    private View m393s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f375e;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m392r(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f373c;
                if (i2 >= strArr.length) {
                    return null;
                }
                View viewM392r = m392r(context, str, strArr[i2]);
                if (viewM392r != null) {
                    return viewM392r;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f375e;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m394t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5273O3, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(C0832j.f5278P3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5283Q3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0844d) && ((C0844d) context).m5345c() == resourceId) ? context : new C0844d(context, resourceId) : context;
    }

    /* renamed from: u */
    private void m395u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: b */
    protected C0156c mo396b(Context context, AttributeSet attributeSet) {
        return new C0156c(context, attributeSet);
    }

    /* renamed from: c */
    protected AppCompatButton mo397c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: d */
    protected C0160e mo398d(Context context, AttributeSet attributeSet) {
        return new C0160e(context, attributeSet);
    }

    /* renamed from: e */
    protected C0162f m399e(Context context, AttributeSet attributeSet) {
        return new C0162f(context, attributeSet);
    }

    /* renamed from: f */
    protected C0168i m400f(Context context, AttributeSet attributeSet) {
        return new C0168i(context, attributeSet);
    }

    /* renamed from: g */
    protected C0172k m401g(Context context, AttributeSet attributeSet) {
        return new C0172k(context, attributeSet);
    }

    /* renamed from: h */
    protected AppCompatImageView m402h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: i */
    protected C0176m m403i(Context context, AttributeSet attributeSet) {
        return new C0176m(context, attributeSet);
    }

    /* renamed from: j */
    protected AppCompatRadioButton mo404j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: k */
    protected AppCompatRatingBar m405k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* renamed from: l */
    protected C0182p m406l(Context context, AttributeSet attributeSet) {
        return new C0182p(context, attributeSet);
    }

    /* renamed from: m */
    protected AppCompatSpinner m407m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: n */
    protected C0190t mo408n(Context context, AttributeSet attributeSet) {
        return new C0190t(context, attributeSet);
    }

    /* renamed from: o */
    protected C0194v m409o(Context context, AttributeSet attributeSet) {
        return new C0194v(context, attributeSet);
    }

    /* renamed from: p */
    protected View m410p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: q */
    final View m411q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View viewM405k;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m394t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0179n0.m1077b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewM405k = m405k(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "CheckedTextView":
                viewM405k = m399e(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "MultiAutoCompleteTextView":
                viewM405k = m403i(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "TextView":
                viewM405k = mo408n(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "ImageButton":
                viewM405k = m401g(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "SeekBar":
                viewM405k = m406l(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "Spinner":
                viewM405k = m407m(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "RadioButton":
                viewM405k = mo404j(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "ToggleButton":
                viewM405k = m409o(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "ImageView":
                viewM405k = m402h(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "AutoCompleteTextView":
                viewM405k = mo396b(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "CheckBox":
                viewM405k = mo398d(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "EditText":
                viewM405k = m400f(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            case "Button":
                viewM405k = mo397c(context2, attributeSet);
                m395u(viewM405k, str);
                break;
            default:
                viewM405k = m410p(context2, str, attributeSet);
                break;
        }
        if (viewM405k == null && context != context2) {
            viewM405k = m393s(context2, str, attributeSet);
        }
        if (viewM405k != null) {
            m391a(viewM405k, attributeSet);
        }
        return viewM405k;
    }
}
