package p024c.p025a.p032o;

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
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.MenuItemC0090j;
import androidx.appcompat.widget.C0185q0;
import androidx.appcompat.widget.C0200y;
import androidx.core.view.AbstractC0282b;
import androidx.core.view.C0298h;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p025a.C0832j;
import p024c.p052i.p054f.p055a.InterfaceMenuC0934a;

/* compiled from: SupportMenuInflater.java */
/* renamed from: c.a.o.g */
/* loaded from: classes.dex */
public class C0847g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f5576a;

    /* renamed from: b */
    static final Class<?>[] f5577b;

    /* renamed from: c */
    final Object[] f5578c;

    /* renamed from: d */
    final Object[] f5579d;

    /* renamed from: e */
    Context f5580e;

    /* renamed from: f */
    private Object f5581f;

    /* compiled from: SupportMenuInflater.java */
    /* renamed from: c.a.o.g$a */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private static final Class<?>[] f5582f = {MenuItem.class};

        /* renamed from: g */
        private Object f5583g;

        /* renamed from: h */
        private Method f5584h;

        public a(Object obj, String str) {
            this.f5583g = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f5584h = cls.getMethod(str, f5582f);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f5584h.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f5584h.invoke(this.f5583g, menuItem)).booleanValue();
                }
                this.f5584h.invoke(this.f5583g, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* renamed from: c.a.o.g$b */
    private class b {

        /* renamed from: A */
        AbstractC0282b f5585A;

        /* renamed from: B */
        private CharSequence f5586B;

        /* renamed from: C */
        private CharSequence f5587C;

        /* renamed from: D */
        private ColorStateList f5588D = null;

        /* renamed from: E */
        private PorterDuff.Mode f5589E = null;

        /* renamed from: a */
        private Menu f5591a;

        /* renamed from: b */
        private int f5592b;

        /* renamed from: c */
        private int f5593c;

        /* renamed from: d */
        private int f5594d;

        /* renamed from: e */
        private int f5595e;

        /* renamed from: f */
        private boolean f5596f;

        /* renamed from: g */
        private boolean f5597g;

        /* renamed from: h */
        private boolean f5598h;

        /* renamed from: i */
        private int f5599i;

        /* renamed from: j */
        private int f5600j;

        /* renamed from: k */
        private CharSequence f5601k;

        /* renamed from: l */
        private CharSequence f5602l;

        /* renamed from: m */
        private int f5603m;

        /* renamed from: n */
        private char f5604n;

        /* renamed from: o */
        private int f5605o;

        /* renamed from: p */
        private char f5606p;

        /* renamed from: q */
        private int f5607q;

        /* renamed from: r */
        private int f5608r;

        /* renamed from: s */
        private boolean f5609s;

        /* renamed from: t */
        private boolean f5610t;

        /* renamed from: u */
        private boolean f5611u;

        /* renamed from: v */
        private int f5612v;

        /* renamed from: w */
        private int f5613w;

        /* renamed from: x */
        private String f5614x;

        /* renamed from: y */
        private String f5615y;

        /* renamed from: z */
        private String f5616z;

        public b(Menu menu) {
            this.f5591a = menu;
            m5360h();
        }

        /* renamed from: c */
        private char m5352c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m5353e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0847g.this.f5580e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        /* renamed from: i */
        private void m5354i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z = false;
            menuItem.setChecked(this.f5609s).setVisible(this.f5610t).setEnabled(this.f5611u).setCheckable(this.f5608r >= 1).setTitleCondensed(this.f5602l).setIcon(this.f5603m);
            int i2 = this.f5612v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f5616z != null) {
                if (C0847g.this.f5580e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C0847g.this.m5351b(), this.f5616z));
            }
            if (this.f5608r >= 2) {
                if (menuItem instanceof C0089i) {
                    ((C0089i) menuItem).m627t(true);
                } else if (menuItem instanceof MenuItemC0090j) {
                    ((MenuItemC0090j) menuItem).m634h(true);
                }
            }
            String str = this.f5614x;
            if (str != null) {
                menuItem.setActionView((View) m5353e(str, C0847g.f5576a, C0847g.this.f5578c));
                z = true;
            }
            int i3 = this.f5613w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            AbstractC0282b abstractC0282b = this.f5585A;
            if (abstractC0282b != null) {
                C0298h.m2047a(menuItem, abstractC0282b);
            }
            C0298h.m2049c(menuItem, this.f5586B);
            C0298h.m2054h(menuItem, this.f5587C);
            C0298h.m2048b(menuItem, this.f5604n, this.f5605o);
            C0298h.m2052f(menuItem, this.f5606p, this.f5607q);
            PorterDuff.Mode mode = this.f5589E;
            if (mode != null) {
                C0298h.m2051e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f5588D;
            if (colorStateList != null) {
                C0298h.m2050d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m5355a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f5598h = true;
            m5354i(this.f5591a.add(this.f5592b, this.f5599i, this.f5600j, this.f5601k));
        }

        /* renamed from: b */
        public SubMenu m5356b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f5598h = true;
            SubMenu subMenuAddSubMenu = this.f5591a.addSubMenu(this.f5592b, this.f5599i, this.f5600j, this.f5601k);
            m5354i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* renamed from: d */
        public boolean m5357d() {
            return this.f5598h;
        }

        /* renamed from: f */
        public void m5358f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C0847g.this.f5580e.obtainStyledAttributes(attributeSet, C0832j.f5415r1);
            this.f5592b = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5425t1, 0);
            this.f5593c = typedArrayObtainStyledAttributes.getInt(C0832j.f5435v1, 0);
            this.f5594d = typedArrayObtainStyledAttributes.getInt(C0832j.f5440w1, 0);
            this.f5595e = typedArrayObtainStyledAttributes.getInt(C0832j.f5445x1, 0);
            this.f5596f = typedArrayObtainStyledAttributes.getBoolean(C0832j.f5430u1, true);
            this.f5597g = typedArrayObtainStyledAttributes.getBoolean(C0832j.f5420s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m5359g(AttributeSet attributeSet) {
            C0185q0 c0185q0M1090u = C0185q0.m1090u(C0847g.this.f5580e, attributeSet, C0832j.f5450y1);
            this.f5599i = c0185q0M1090u.m1105n(C0832j.f5206B1, 0);
            this.f5600j = (c0185q0M1090u.m1102k(C0832j.f5221E1, this.f5593c) & (-65536)) | (c0185q0M1090u.m1102k(C0832j.f5226F1, this.f5594d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f5601k = c0185q0M1090u.m1107p(C0832j.f5231G1);
            this.f5602l = c0185q0M1090u.m1107p(C0832j.f5236H1);
            this.f5603m = c0185q0M1090u.m1105n(C0832j.f5455z1, 0);
            this.f5604n = m5352c(c0185q0M1090u.m1106o(C0832j.f5241I1));
            this.f5605o = c0185q0M1090u.m1102k(C0832j.f5276P1, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.f5606p = m5352c(c0185q0M1090u.m1106o(C0832j.f5246J1));
            this.f5607q = c0185q0M1090u.m1102k(C0832j.f5296T1, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
            int i2 = C0832j.f5251K1;
            if (c0185q0M1090u.m1110s(i2)) {
                this.f5608r = c0185q0M1090u.m1092a(i2, false) ? 1 : 0;
            } else {
                this.f5608r = this.f5595e;
            }
            this.f5609s = c0185q0M1090u.m1092a(C0832j.f5211C1, false);
            this.f5610t = c0185q0M1090u.m1092a(C0832j.f5216D1, this.f5596f);
            this.f5611u = c0185q0M1090u.m1092a(C0832j.f5201A1, this.f5597g);
            this.f5612v = c0185q0M1090u.m1102k(C0832j.f5301U1, -1);
            this.f5616z = c0185q0M1090u.m1106o(C0832j.f5256L1);
            this.f5613w = c0185q0M1090u.m1105n(C0832j.f5261M1, 0);
            this.f5614x = c0185q0M1090u.m1106o(C0832j.f5271O1);
            String strM1106o = c0185q0M1090u.m1106o(C0832j.f5266N1);
            this.f5615y = strM1106o;
            boolean z = strM1106o != null;
            if (z && this.f5613w == 0 && this.f5614x == null) {
                this.f5585A = (AbstractC0282b) m5353e(strM1106o, C0847g.f5577b, C0847g.this.f5579d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f5585A = null;
            }
            this.f5586B = c0185q0M1090u.m1107p(C0832j.f5281Q1);
            this.f5587C = c0185q0M1090u.m1107p(C0832j.f5306V1);
            int i3 = C0832j.f5291S1;
            if (c0185q0M1090u.m1110s(i3)) {
                this.f5589E = C0200y.m1238e(c0185q0M1090u.m1102k(i3, -1), this.f5589E);
            } else {
                this.f5589E = null;
            }
            int i4 = C0832j.f5286R1;
            if (c0185q0M1090u.m1110s(i4)) {
                this.f5588D = c0185q0M1090u.m1094c(i4);
            } else {
                this.f5588D = null;
            }
            c0185q0M1090u.m1111w();
            this.f5598h = false;
        }

        /* renamed from: h */
        public void m5360h() {
            this.f5592b = 0;
            this.f5593c = 0;
            this.f5594d = 0;
            this.f5595e = 0;
            this.f5596f = true;
            this.f5597g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f5576a = clsArr;
        f5577b = clsArr;
    }

    public C0847g(Context context) {
        super(context);
        this.f5580e = context;
        Object[] objArr = {context};
        this.f5578c = objArr;
        this.f5579d = objArr;
    }

    /* renamed from: a */
    private Object m5349a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m5349a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m5350c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
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
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.m5360h();
                    } else if (name2.equals("item")) {
                        if (!bVar.m5357d()) {
                            AbstractC0282b abstractC0282b = bVar.f5585A;
                            if (abstractC0282b == null || !abstractC0282b.mo635a()) {
                                bVar.m5355a();
                            } else {
                                bVar.m5356b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.m5358f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.m5359g(attributeSet);
                } else if (name3.equals("menu")) {
                    m5350c(xmlPullParser, attributeSet, bVar.m5356b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: b */
    Object m5351b() {
        if (this.f5581f == null) {
            this.f5581f = m5349a(this.f5580e);
        }
        return this.f5581f;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0934a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f5580e.getResources().getLayout(i2);
                    m5350c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
