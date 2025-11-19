package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.a0;
import i.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l1.InterfaceMenuC3893a;
import n.MenuItemC4048c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s1.AbstractC4423b;
import s1.C4470z;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class<?>[] f20865e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f20866f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f20867a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f20868b;

    /* renamed from: c, reason: collision with root package name */
    Context f20869c;

    /* renamed from: d, reason: collision with root package name */
    private Object f20870d;

    /* compiled from: SupportMenuInflater.java */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f20871c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f20872a;

        /* renamed from: b, reason: collision with root package name */
        private Method f20873b;

        public a(Object obj, String str) {
            this.f20872a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f20873b = cls.getMethod(str, f20871c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f20873b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f20873b.invoke(this.f20872a, menuItem)).booleanValue();
                }
                this.f20873b.invoke(this.f20872a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC4423b f20874A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f20875B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f20876C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f20877D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f20878E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f20880a;

        /* renamed from: b, reason: collision with root package name */
        private int f20881b;

        /* renamed from: c, reason: collision with root package name */
        private int f20882c;

        /* renamed from: d, reason: collision with root package name */
        private int f20883d;

        /* renamed from: e, reason: collision with root package name */
        private int f20884e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f20885f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f20886g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f20887h;

        /* renamed from: i, reason: collision with root package name */
        private int f20888i;

        /* renamed from: j, reason: collision with root package name */
        private int f20889j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f20890k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f20891l;

        /* renamed from: m, reason: collision with root package name */
        private int f20892m;

        /* renamed from: n, reason: collision with root package name */
        private char f20893n;

        /* renamed from: o, reason: collision with root package name */
        private int f20894o;

        /* renamed from: p, reason: collision with root package name */
        private char f20895p;

        /* renamed from: q, reason: collision with root package name */
        private int f20896q;

        /* renamed from: r, reason: collision with root package name */
        private int f20897r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f20898s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f20899t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f20900u;

        /* renamed from: v, reason: collision with root package name */
        private int f20901v;

        /* renamed from: w, reason: collision with root package name */
        private int f20902w;

        /* renamed from: x, reason: collision with root package name */
        private String f20903x;

        /* renamed from: y, reason: collision with root package name */
        private String f20904y;

        /* renamed from: z, reason: collision with root package name */
        private String f20905z;

        public b(Menu menu) {
            this.f20880a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f20869c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f20898s).setVisible(this.f20899t).setEnabled(this.f20900u).setCheckable(this.f20897r >= 1).setTitleCondensed(this.f20891l).setIcon(this.f20892m);
            int i10 = this.f20901v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f20905z != null) {
                if (g.this.f20869c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f20905z));
            }
            if (this.f20897r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof MenuItemC4048c) {
                    ((MenuItemC4048c) menuItem).h(true);
                }
            }
            String str = this.f20903x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f20865e, g.this.f20867a));
                z10 = true;
            }
            int i11 = this.f20902w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC4423b abstractC4423b = this.f20874A;
            if (abstractC4423b != null) {
                C4470z.a(menuItem, abstractC4423b);
            }
            C4470z.c(menuItem, this.f20875B);
            C4470z.g(menuItem, this.f20876C);
            C4470z.b(menuItem, this.f20893n, this.f20894o);
            C4470z.f(menuItem, this.f20895p, this.f20896q);
            PorterDuff.Mode mode = this.f20878E;
            if (mode != null) {
                C4470z.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f20877D;
            if (colorStateList != null) {
                C4470z.d(menuItem, colorStateList);
            }
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f20887h = true;
            i(this.f20880a.add(this.f20881b, this.f20888i, this.f20889j, this.f20890k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f20887h = true;
            SubMenu subMenuAddSubMenu = this.f20880a.addSubMenu(this.f20881b, this.f20888i, this.f20889j, this.f20890k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f20887h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f20869c.obtainStyledAttributes(attributeSet, j.f42756o1);
            this.f20881b = typedArrayObtainStyledAttributes.getResourceId(j.f42766q1, 0);
            this.f20882c = typedArrayObtainStyledAttributes.getInt(j.f42776s1, 0);
            this.f20883d = typedArrayObtainStyledAttributes.getInt(j.f42781t1, 0);
            this.f20884e = typedArrayObtainStyledAttributes.getInt(j.f42786u1, 0);
            this.f20885f = typedArrayObtainStyledAttributes.getBoolean(j.f42771r1, true);
            this.f20886g = typedArrayObtainStyledAttributes.getBoolean(j.f42761p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            a0 a0VarU = a0.u(g.this.f20869c, attributeSet, j.f42791v1);
            this.f20888i = a0VarU.n(j.f42806y1, 0);
            this.f20889j = (a0VarU.k(j.f42569B1, this.f20882c) & (-65536)) | (a0VarU.k(j.f42574C1, this.f20883d) & 65535);
            this.f20890k = a0VarU.p(j.f42579D1);
            this.f20891l = a0VarU.p(j.f42584E1);
            this.f20892m = a0VarU.n(j.f42796w1, 0);
            this.f20893n = c(a0VarU.o(j.f42589F1));
            this.f20894o = a0VarU.k(j.f42624M1, 4096);
            this.f20895p = c(a0VarU.o(j.f42594G1));
            this.f20896q = a0VarU.k(j.f42644Q1, 4096);
            int i10 = j.f42599H1;
            if (a0VarU.s(i10)) {
                this.f20897r = a0VarU.a(i10, false) ? 1 : 0;
            } else {
                this.f20897r = this.f20884e;
            }
            this.f20898s = a0VarU.a(j.f42811z1, false);
            this.f20899t = a0VarU.a(j.f42564A1, this.f20885f);
            this.f20900u = a0VarU.a(j.f42801x1, this.f20886g);
            this.f20901v = a0VarU.k(j.f42649R1, -1);
            this.f20905z = a0VarU.o(j.f42604I1);
            this.f20902w = a0VarU.n(j.f42609J1, 0);
            this.f20903x = a0VarU.o(j.f42619L1);
            String strO = a0VarU.o(j.f42614K1);
            this.f20904y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f20902w == 0 && this.f20903x == null) {
                this.f20874A = (AbstractC4423b) e(strO, g.f20866f, g.this.f20868b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f20874A = null;
            }
            this.f20875B = a0VarU.p(j.f42629N1);
            this.f20876C = a0VarU.p(j.f42654S1);
            int i11 = j.f42639P1;
            if (a0VarU.s(i11)) {
                this.f20878E = I.e(a0VarU.k(i11, -1), this.f20878E);
            } else {
                this.f20878E = null;
            }
            int i12 = j.f42634O1;
            if (a0VarU.s(i12)) {
                this.f20877D = a0VarU.c(i12);
            } else {
                this.f20877D = null;
            }
            a0VarU.x();
            this.f20887h = false;
        }

        public void h() {
            this.f20881b = 0;
            this.f20882c = 0;
            this.f20883d = 0;
            this.f20884e = 0;
            this.f20885f = true;
            this.f20886g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f20865e = clsArr;
        f20866f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f20869c = context;
        Object[] objArr = {context};
        this.f20867a = objArr;
        this.f20868b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC4423b abstractC4423b = bVar.f20874A;
                            if (abstractC4423b == null || !abstractC4423b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f20870d == null) {
            this.f20870d = a(this.f20869c);
        }
        return this.f20870d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC3893a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f20869c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
