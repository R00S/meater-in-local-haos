package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import g1.C3377a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k1.C3784a;
import l.C3867a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C4411v;
import s.C4413x;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: i, reason: collision with root package name */
    private static P f21344i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, s.Y<ColorStateList>> f21346a;

    /* renamed from: b, reason: collision with root package name */
    private s.X<String, b> f21347b;

    /* renamed from: c, reason: collision with root package name */
    private s.Y<String> f21348c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, C4411v<WeakReference<Drawable.ConstantState>>> f21349d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f21350e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21351f;

    /* renamed from: g, reason: collision with root package name */
    private c f21352g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f21343h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final a f21345j = new a(6);

    /* compiled from: ResourceManagerInternal.java */
    private static class a extends C4413x<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return c(Integer.valueOf(j(i10, mode)));
        }

        PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    public interface c {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(P p10, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C4411v<WeakReference<Drawable.ConstantState>> c4411v = this.f21349d.get(context);
            if (c4411v == null) {
                c4411v = new C4411v<>();
                this.f21349d.put(context, c4411v);
            }
            c4411v.k(j10, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f21346a == null) {
            this.f21346a = new WeakHashMap<>();
        }
        s.Y<ColorStateList> y10 = this.f21346a.get(context);
        if (y10 == null) {
            y10 = new s.Y<>();
            this.f21346a.put(context, y10);
        }
        y10.b(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f21351f) {
            return;
        }
        this.f21351f = true;
        Drawable drawableI = i(context, C3867a.f44178a);
        if (drawableI == null || !p(drawableI)) {
            this.f21351f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i10) throws Resources.NotFoundException {
        if (this.f21350e == null) {
            this.f21350e = new TypedValue();
        }
        TypedValue typedValue = this.f21350e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f21352g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i10);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized P g() {
        try {
            if (f21344i == null) {
                P p10 = new P();
                f21344i = p10;
                o(p10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21344i;
    }

    private synchronized Drawable h(Context context, long j10) {
        C4411v<WeakReference<Drawable.ConstantState>> c4411v = this.f21349d.get(context);
        if (c4411v == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceF = c4411v.f(j10);
        if (weakReferenceF != null) {
            Drawable.ConstantState constantState = weakReferenceF.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c4411v.l(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        a aVar = f21345j;
        porterDuffColorFilterK = aVar.k(i10, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i10, mode);
            aVar.l(i10, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private ColorStateList m(Context context, int i10) {
        s.Y<ColorStateList> y10;
        WeakHashMap<Context, s.Y<ColorStateList>> weakHashMap = this.f21346a;
        if (weakHashMap == null || (y10 = weakHashMap.get(context)) == null) {
            return null;
        }
        return y10.g(i10);
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        s.X<String, b> x10 = this.f21347b;
        if (x10 == null || x10.isEmpty()) {
            return null;
        }
        s.Y<String> y10 = this.f21348c;
        if (y10 != null) {
            String strG = y10.g(i10);
            if ("appcompat_skip_skip".equals(strG) || (strG != null && this.f21347b.get(strG) == null)) {
                return null;
            }
        } else {
            this.f21348c = new s.Y<>();
        }
        if (this.f21350e == null) {
            this.f21350e = new TypedValue();
        }
        TypedValue typedValue = this.f21350e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
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
                this.f21348c.b(i10, name);
                b bVar = this.f21347b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f21348c.b(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = C3784a.r(drawable.mutate());
            C3784a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN == null) {
                return drawableR;
            }
            C3784a.p(drawableR, modeN);
            return drawableR;
        }
        c cVar = this.f21352g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, Y y10, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = y10.f21600d;
        if (z10 || y10.f21599c) {
            drawable.setColorFilter(f(z10 ? y10.f21597a : null, y10.f21599c ? y10.f21598b : f21343h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = C3377a.e(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                I.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f21352g;
            colorStateListM = cVar == null ? null : cVar.d(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f21352g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i10);
    }

    public synchronized void r(Context context) {
        C4411v<WeakReference<Drawable.ConstantState>> c4411v = this.f21349d.get(context);
        if (c4411v != null) {
            c4411v.b();
        }
    }

    synchronized Drawable s(Context context, g0 g0Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = g0Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f21352g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f21352g;
        return cVar != null && cVar.a(context, i10, drawable);
    }

    private static void o(P p10) {
    }
}
