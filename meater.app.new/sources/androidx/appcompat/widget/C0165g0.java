package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.C0255a;
import androidx.core.graphics.drawable.C0265a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p025a.p028l.p029a.C0834a;
import p024c.p025a.p030m.C0838a;
import p024c.p041e.C0870d;
import p024c.p041e.C0871e;
import p024c.p041e.C0873g;
import p024c.p041e.C0874h;
import p024c.p089y.p090a.p091a.C1064c;
import p024c.p089y.p090a.p091a.C1070i;

/* compiled from: ResourceManagerInternal.java */
/* renamed from: androidx.appcompat.widget.g0 */
/* loaded from: classes.dex */
public final class C0165g0 {

    /* renamed from: b */
    private static C0165g0 f1130b;

    /* renamed from: d */
    private WeakHashMap<Context, C0874h<ColorStateList>> f1132d;

    /* renamed from: e */
    private C0873g<String, d> f1133e;

    /* renamed from: f */
    private C0874h<String> f1134f;

    /* renamed from: g */
    private final WeakHashMap<Context, C0870d<WeakReference<Drawable.ConstantState>>> f1135g = new WeakHashMap<>(0);

    /* renamed from: h */
    private TypedValue f1136h;

    /* renamed from: i */
    private boolean f1137i;

    /* renamed from: j */
    private e f1138j;

    /* renamed from: a */
    private static final PorterDuff.Mode f1129a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static final c f1131c = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.g0$a */
    static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.C0165g0.d
        /* renamed from: a */
        public Drawable mo998a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0834a.m5266m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.g0$b */
    private static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.C0165g0.d
        /* renamed from: a */
        public Drawable mo998a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1064c.m6694a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.g0$c */
    private static class c extends C0871e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        /* renamed from: h */
        private static int m999h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: i */
        PorterDuffColorFilter m1000i(int i2, PorterDuff.Mode mode) {
            return m5450c(Integer.valueOf(m999h(i2, mode)));
        }

        /* renamed from: j */
        PorterDuffColorFilter m1001j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m5451d(Integer.valueOf(m999h(i2, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.g0$d */
    private interface d {
        /* renamed from: a */
        Drawable mo998a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.g0$e */
    interface e {
        /* renamed from: a */
        boolean mo1002a(Context context, int i2, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo1003b(int i2);

        /* renamed from: c */
        Drawable mo1004c(C0165g0 c0165g0, Context context, int i2);

        /* renamed from: d */
        ColorStateList mo1005d(Context context, int i2);

        /* renamed from: e */
        boolean mo1006e(Context context, int i2, Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.g0$f */
    private static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.C0165g0.d
        /* renamed from: a */
        public Drawable mo998a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1070i.m6727c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m974a(String str, d dVar) {
        if (this.f1133e == null) {
            this.f1133e = new C0873g<>();
        }
        this.f1133e.put(str, dVar);
    }

    /* renamed from: b */
    private synchronized boolean m975b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0870d<WeakReference<Drawable.ConstantState>> c0870d = this.f1135g.get(context);
        if (c0870d == null) {
            c0870d = new C0870d<>();
            this.f1135g.put(context, c0870d);
        }
        c0870d.m5442k(j2, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: c */
    private void m976c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f1132d == null) {
            this.f1132d = new WeakHashMap<>();
        }
        C0874h<ColorStateList> c0874h = this.f1132d.get(context);
        if (c0874h == null) {
            c0874h = new C0874h<>();
            this.f1132d.put(context, c0874h);
        }
        c0874h.m5479b(i2, colorStateList);
    }

    /* renamed from: d */
    private void m977d(Context context) {
        if (this.f1137i) {
            return;
        }
        this.f1137i = true;
        Drawable drawableM990j = m990j(context, C0838a.f5531a);
        if (drawableM990j == null || !m986q(drawableM990j)) {
            this.f1137i = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: e */
    private static long m978e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m979f(Context context, int i2) throws Resources.NotFoundException {
        if (this.f1136h == null) {
            this.f1136h = new TypedValue();
        }
        TypedValue typedValue = this.f1136h;
        context.getResources().getValue(i2, typedValue, true);
        long jM978e = m978e(typedValue);
        Drawable drawableM982i = m982i(context, jM978e);
        if (drawableM982i != null) {
            return drawableM982i;
        }
        e eVar = this.f1138j;
        Drawable drawableMo1004c = eVar == null ? null : eVar.mo1004c(this, context, i2);
        if (drawableMo1004c != null) {
            drawableMo1004c.setChangingConfigurations(typedValue.changingConfigurations);
            m975b(context, jM978e, drawableMo1004c);
        }
        return drawableMo1004c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m980g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m983l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0165g0 m981h() {
        if (f1130b == null) {
            C0165g0 c0165g0 = new C0165g0();
            f1130b = c0165g0;
            m985p(c0165g0);
        }
        return f1130b;
    }

    /* renamed from: i */
    private synchronized Drawable m982i(Context context, long j2) {
        C0870d<WeakReference<Drawable.ConstantState>> c0870d = this.f1135g.get(context);
        if (c0870d == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM5438g = c0870d.m5438g(j2);
        if (weakReferenceM5438g != null) {
            Drawable.ConstantState constantState = weakReferenceM5438g.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0870d.m5443l(j2);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m983l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM1000i;
        c cVar = f1131c;
        porterDuffColorFilterM1000i = cVar.m1000i(i2, mode);
        if (porterDuffColorFilterM1000i == null) {
            porterDuffColorFilterM1000i = new PorterDuffColorFilter(i2, mode);
            cVar.m1001j(i2, mode, porterDuffColorFilterM1000i);
        }
        return porterDuffColorFilterM1000i;
    }

    /* renamed from: n */
    private ColorStateList m984n(Context context, int i2) {
        C0874h<ColorStateList> c0874h;
        WeakHashMap<Context, C0874h<ColorStateList>> weakHashMap = this.f1132d;
        if (weakHashMap == null || (c0874h = weakHashMap.get(context)) == null) {
            return null;
        }
        return c0874h.m5482g(i2);
    }

    /* renamed from: p */
    private static void m985p(C0165g0 c0165g0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0165g0.m974a("vector", new f());
            c0165g0.m974a("animated-vector", new b());
            c0165g0.m974a("animated-selector", new a());
        }
    }

    /* renamed from: q */
    private static boolean m986q(Drawable drawable) {
        return (drawable instanceof C1070i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: r */
    private Drawable m987r(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C0873g<String, d> c0873g = this.f1133e;
        if (c0873g == null || c0873g.isEmpty()) {
            return null;
        }
        C0874h<String> c0874h = this.f1134f;
        if (c0874h != null) {
            String strM5482g = c0874h.m5482g(i2);
            if ("appcompat_skip_skip".equals(strM5482g) || (strM5482g != null && this.f1133e.get(strM5482g) == null)) {
                return null;
            }
        } else {
            this.f1134f = new C0874h<>();
        }
        if (this.f1136h == null) {
            this.f1136h = new TypedValue();
        }
        TypedValue typedValue = this.f1136h;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jM978e = m978e(typedValue);
        Drawable drawableM982i = m982i(context, jM978e);
        if (drawableM982i != null) {
            return drawableM982i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1134f.m5479b(i2, name);
                d dVar = this.f1133e.get(name);
                if (dVar != null) {
                    drawableM982i = dVar.mo998a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM982i != null) {
                    drawableM982i.setChangingConfigurations(typedValue.changingConfigurations);
                    m975b(context, jM978e, drawableM982i);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableM982i == null) {
            this.f1134f.m5479b(i2, "appcompat_skip_skip");
        }
        return drawableM982i;
    }

    /* renamed from: v */
    private Drawable m988v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListM992m = m992m(context, i2);
        if (colorStateListM992m == null) {
            e eVar = this.f1138j;
            if ((eVar == null || !eVar.mo1006e(context, i2, drawable)) && !m997x(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (C0200y.m1234a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableM1821r = C0265a.m1821r(drawable);
        C0265a.m1818o(drawableM1821r, colorStateListM992m);
        PorterDuff.Mode modeM993o = m993o(i2);
        if (modeM993o == null) {
            return drawableM1821r;
        }
        C0265a.m1819p(drawableM1821r, modeM993o);
        return drawableM1821r;
    }

    /* renamed from: w */
    static void m989w(Drawable drawable, C0181o0 c0181o0, int[] iArr) {
        if (C0200y.m1234a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = c0181o0.f1230d;
        if (z || c0181o0.f1229c) {
            drawable.setColorFilter(m980g(z ? c0181o0.f1227a : null, c0181o0.f1229c ? c0181o0.f1228b : f1129a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m990j(Context context, int i2) {
        return m991k(context, i2, false);
    }

    /* renamed from: k */
    synchronized Drawable m991k(Context context, int i2, boolean z) {
        Drawable drawableM987r;
        m977d(context);
        drawableM987r = m987r(context, i2);
        if (drawableM987r == null) {
            drawableM987r = m979f(context, i2);
        }
        if (drawableM987r == null) {
            drawableM987r = C0255a.m1677f(context, i2);
        }
        if (drawableM987r != null) {
            drawableM987r = m988v(context, i2, z, drawableM987r);
        }
        if (drawableM987r != null) {
            C0200y.m1235b(drawableM987r);
        }
        return drawableM987r;
    }

    /* renamed from: m */
    synchronized ColorStateList m992m(Context context, int i2) {
        ColorStateList colorStateListM984n;
        colorStateListM984n = m984n(context, i2);
        if (colorStateListM984n == null) {
            e eVar = this.f1138j;
            colorStateListM984n = eVar == null ? null : eVar.mo1005d(context, i2);
            if (colorStateListM984n != null) {
                m976c(context, i2, colorStateListM984n);
            }
        }
        return colorStateListM984n;
    }

    /* renamed from: o */
    PorterDuff.Mode m993o(int i2) {
        e eVar = this.f1138j;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1003b(i2);
    }

    /* renamed from: s */
    public synchronized void m994s(Context context) {
        C0870d<WeakReference<Drawable.ConstantState>> c0870d = this.f1135g.get(context);
        if (c0870d != null) {
            c0870d.m5436d();
        }
    }

    /* renamed from: t */
    synchronized Drawable m995t(Context context, C0195v0 c0195v0, int i2) {
        Drawable drawableM987r = m987r(context, i2);
        if (drawableM987r == null) {
            drawableM987r = c0195v0.m1229c(i2);
        }
        if (drawableM987r == null) {
            return null;
        }
        return m988v(context, i2, false, drawableM987r);
    }

    /* renamed from: u */
    public synchronized void m996u(e eVar) {
        this.f1138j = eVar;
    }

    /* renamed from: x */
    boolean m997x(Context context, int i2, Drawable drawable) {
        e eVar = this.f1138j;
        return eVar != null && eVar.mo1002a(context, i2, drawable);
    }
}
