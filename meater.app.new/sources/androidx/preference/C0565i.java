package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PreferenceInflater.java */
/* renamed from: androidx.preference.i */
/* loaded from: classes.dex */
class C0565i {

    /* renamed from: a */
    private static final Class<?>[] f3694a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final HashMap<String, Constructor> f3695b = new HashMap<>();

    /* renamed from: c */
    private final Context f3696c;

    /* renamed from: d */
    private final Object[] f3697d = new Object[2];

    /* renamed from: e */
    private C0566j f3698e;

    /* renamed from: f */
    private String[] f3699f;

    public C0565i(Context context, C0566j c0566j) {
        this.f3696c = context;
        m4132f(c0566j);
    }

    /* renamed from: a */
    private Preference m4130a(String str, String[] strArr, AttributeSet attributeSet) throws InflateException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Constructor<?> constructor = f3695b.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f3696c.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f3694a);
                    constructor.setAccessible(true);
                    f3695b.put(str, constructor);
                } catch (Exception e4) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e4);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e5) {
                throw e5;
            }
        }
        Object[] objArr = this.f3697d;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: b */
    private Preference m4131b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? m4139g(str, attributeSet) : m4130a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    /* renamed from: f */
    private void m4132f(C0566j c0566j) {
        this.f3698e = c0566j;
        m4140j(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    /* renamed from: h */
    private PreferenceGroup m4133h(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.m4032i0(this.f3698e);
        return preferenceGroup2;
    }

    /* renamed from: i */
    private void m4134i(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.m4000K0(Intent.parseIntent(m4136c().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    m4136c().getResources().parseBundleExtra("extra", attributeSet, preference.m3988E());
                    try {
                        m4135k(xmlPullParser);
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceM4131b = m4131b(name, attributeSet);
                    ((PreferenceGroup) preference).m4055Z0(preferenceM4131b);
                    m4134i(xmlPullParser, preferenceM4131b, attributeSet);
                }
            }
        }
    }

    /* renamed from: k */
    private static void m4135k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    /* renamed from: c */
    public Context m4136c() {
        return this.f3696c;
    }

    /* renamed from: d */
    public Preference m4137d(int i2, PreferenceGroup preferenceGroup) throws Resources.NotFoundException {
        XmlResourceParser xml = m4136c().getResources().getXml(i2);
        try {
            return m4138e(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    /* renamed from: e */
    public Preference m4138e(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup preferenceGroupM4133h;
        synchronized (this.f3697d) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f3697d[0] = this.f3696c;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e2) {
                    throw e2;
                } catch (IOException e3) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroupM4133h = m4133h(preferenceGroup, (PreferenceGroup) m4131b(xmlPullParser.getName(), attributeSetAsAttributeSet));
            m4134i(xmlPullParser, preferenceGroupM4133h, attributeSetAsAttributeSet);
        }
        return preferenceGroupM4133h;
    }

    /* renamed from: g */
    protected Preference m4139g(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return m4130a(str, this.f3699f, attributeSet);
    }

    /* renamed from: j */
    public void m4140j(String[] strArr) {
        this.f3699f = strArr;
    }
}
