package kotlin;

import Ub.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import h3.C3487a;
import java.io.IOException;
import kotlin.C3405k;
import kotlin.C3412r;
import kotlin.C3420z;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NavInflater.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J7\u0010!\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020#2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'¨\u0006("}, d2 = {"Lg3/y;", "", "Landroid/content/Context;", "context", "Lg3/G;", "navigatorProvider", "<init>", "(Landroid/content/Context;Lg3/G;)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "", "graphResId", "Lg3/t;", "a", "(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Lg3/t;", "dest", "Loa/F;", "f", "(Landroid/content/res/Resources;Lg3/t;Landroid/util/AttributeSet;I)V", "Landroid/os/Bundle;", "bundle", "e", "(Landroid/content/res/Resources;Landroid/os/Bundle;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "Lg3/k;", "d", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Lg3/k;", "g", "(Landroid/content/res/Resources;Lg3/t;Landroid/util/AttributeSet;)V", "c", "(Landroid/content/res/Resources;Lg3/t;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;I)V", "Lg3/v;", "b", "(I)Lg3/v;", "Landroid/content/Context;", "Lg3/G;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3419y {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f41817d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C3390G navigatorProvider;

    /* compiled from: NavInflater.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lg3/y$a;", "", "<init>", "()V", "Landroid/util/TypedValue;", "value", "Lg3/C;", "navType", "expectedNavType", "", "argType", "foundType", "a", "(Landroid/util/TypedValue;Lg3/C;Lg3/C;Ljava/lang/String;Ljava/lang/String;)Lg3/C;", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "Ljava/lang/ThreadLocal;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.y$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final AbstractC3386C<?> a(TypedValue value, AbstractC3386C<?> navType, AbstractC3386C<?> expectedNavType, String argType, String foundType) throws XmlPullParserException {
            C3862t.g(value, "value");
            C3862t.g(expectedNavType, "expectedNavType");
            C3862t.g(foundType, "foundType");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            throw new XmlPullParserException("Type is " + argType + " but found " + foundType + ": " + value.data);
        }

        private Companion() {
        }
    }

    public C3419y(Context context, C3390G navigatorProvider) {
        C3862t.g(context, "context");
        C3862t.g(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final C3414t a(Resources res, XmlResourceParser parser, AttributeSet attrs, int graphResId) throws XmlPullParserException, IOException {
        int depth;
        C3390G c3390g = this.navigatorProvider;
        String name = parser.getName();
        C3862t.f(name, "parser.name");
        C3414t c3414tA = c3390g.d(name).a();
        c3414tA.K(this.context, attrs);
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = parser.getName();
                if (C3862t.b("argument", name2)) {
                    f(res, c3414tA, attrs, graphResId);
                } else if (C3862t.b("deepLink", name2)) {
                    g(res, c3414tA, attrs);
                } else if (C3862t.b("action", name2)) {
                    c(res, c3414tA, attrs, parser, graphResId);
                } else if (C3862t.b("include", name2) && (c3414tA instanceof C3416v)) {
                    TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, C3394K.f41615i);
                    C3862t.f(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((C3416v) c3414tA).S(b(typedArrayObtainAttributes.getResourceId(C3394K.f41616j, 0)));
                    C4153F c4153f = C4153F.f46609a;
                    typedArrayObtainAttributes.recycle();
                } else if (c3414tA instanceof C3416v) {
                    ((C3416v) c3414tA).S(a(res, parser, attrs, graphResId));
                }
            }
        }
        return c3414tA;
    }

    private final void c(Resources res, C3414t dest, AttributeSet attrs, XmlResourceParser parser, int graphResId) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.context;
        int[] NavAction = C3487a.f42309a;
        C3862t.f(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3487a.f42310b, 0);
        C3401g c3401g = new C3401g(typedArrayObtainStyledAttributes.getResourceId(C3487a.f42311c, 0), null, null, 6, null);
        C3420z.a aVar = new C3420z.a();
        aVar.d(typedArrayObtainStyledAttributes.getBoolean(C3487a.f42314f, false));
        aVar.l(typedArrayObtainStyledAttributes.getBoolean(C3487a.f42320l, false));
        aVar.g(typedArrayObtainStyledAttributes.getResourceId(C3487a.f42317i, -1), typedArrayObtainStyledAttributes.getBoolean(C3487a.f42318j, false), typedArrayObtainStyledAttributes.getBoolean(C3487a.f42319k, false));
        aVar.b(typedArrayObtainStyledAttributes.getResourceId(C3487a.f42312d, -1));
        aVar.c(typedArrayObtainStyledAttributes.getResourceId(C3487a.f42313e, -1));
        aVar.e(typedArrayObtainStyledAttributes.getResourceId(C3487a.f42315g, -1));
        aVar.f(typedArrayObtainStyledAttributes.getResourceId(C3487a.f42316h, -1));
        c3401g.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && C3862t.b("argument", parser.getName())) {
                e(res, bundle, attrs, graphResId);
            }
        }
        if (!bundle.isEmpty()) {
            c3401g.d(bundle);
        }
        dest.L(resourceId, c3401g);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final C3405k d(TypedArray a10, Resources res, int graphResId) throws XmlPullParserException {
        C3405k.a aVar = new C3405k.a();
        int i10 = 0;
        aVar.c(a10.getBoolean(C3487a.f42325q, false));
        ThreadLocal<TypedValue> threadLocal = f41817d;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = a10.getString(C3487a.f42324p);
        Object objL = null;
        AbstractC3386C<Object> abstractC3386CA = string != null ? AbstractC3386C.INSTANCE.a(string, res.getResourcePackageName(graphResId)) : null;
        int i11 = C3487a.f42323o;
        if (a10.getValue(i11, typedValue)) {
            AbstractC3386C<Object> abstractC3386C = AbstractC3386C.f41564e;
            if (abstractC3386CA == abstractC3386C) {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    i10 = i12;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC3386CA.getName() + ". Must be a reference to a resource.");
                }
                objL = Integer.valueOf(i10);
            } else {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    if (abstractC3386CA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC3386CA.getName() + ". You must use a \"" + abstractC3386C.getName() + "\" type to reference other resources.");
                    }
                    abstractC3386CA = abstractC3386C;
                    objL = Integer.valueOf(i13);
                } else if (abstractC3386CA == AbstractC3386C.f41576q) {
                    objL = a10.getString(i11);
                } else {
                    int i14 = typedValue.type;
                    if (i14 == 3) {
                        String string2 = typedValue.string.toString();
                        if (abstractC3386CA == null) {
                            abstractC3386CA = AbstractC3386C.INSTANCE.b(string2);
                        }
                        objL = abstractC3386CA.l(string2);
                    } else if (i14 == 4) {
                        abstractC3386CA = INSTANCE.a(typedValue, abstractC3386CA, AbstractC3386C.f41570k, string, "float");
                        objL = Float.valueOf(typedValue.getFloat());
                    } else if (i14 == 5) {
                        abstractC3386CA = INSTANCE.a(typedValue, abstractC3386CA, AbstractC3386C.f41563d, string, "dimension");
                        objL = Integer.valueOf((int) typedValue.getDimension(res.getDisplayMetrics()));
                    } else if (i14 == 18) {
                        abstractC3386CA = INSTANCE.a(typedValue, abstractC3386CA, AbstractC3386C.f41573n, string, "boolean");
                        objL = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i14 < 16 || i14 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        AbstractC3386C<Object> abstractC3386C2 = AbstractC3386C.f41570k;
                        if (abstractC3386CA == abstractC3386C2) {
                            abstractC3386CA = INSTANCE.a(typedValue, abstractC3386CA, abstractC3386C2, string, "float");
                            objL = Float.valueOf(typedValue.data);
                        } else {
                            abstractC3386CA = INSTANCE.a(typedValue, abstractC3386CA, AbstractC3386C.f41563d, string, "integer");
                            objL = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objL != null) {
            aVar.b(objL);
        }
        if (abstractC3386CA != null) {
            aVar.d(abstractC3386CA);
        }
        return aVar.a();
    }

    private final void e(Resources res, Bundle bundle, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, C3487a.f42321m);
        C3862t.f(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(C3487a.f42322n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        C3862t.f(string, "array.getString(R.stylea…uments must have a name\")");
        C3405k c3405kD = d(typedArrayObtainAttributes, res, graphResId);
        if (c3405kD.getIsDefaultValuePresent()) {
            c3405kD.e(string, bundle);
        }
        C4153F c4153f = C4153F.f46609a;
        typedArrayObtainAttributes.recycle();
    }

    private final void f(Resources res, C3414t dest, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, C3487a.f42321m);
        C3862t.f(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(C3487a.f42322n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        C3862t.f(string, "array.getString(R.stylea…uments must have a name\")");
        dest.h(string, d(typedArrayObtainAttributes, res, graphResId));
        C4153F c4153f = C4153F.f46609a;
        typedArrayObtainAttributes.recycle();
    }

    private final void g(Resources res, C3414t dest, AttributeSet attrs) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, C3487a.f42326r);
        C3862t.f(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(C3487a.f42329u);
        String string2 = typedArrayObtainAttributes.getString(C3487a.f42327s);
        String string3 = typedArrayObtainAttributes.getString(C3487a.f42328t);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        C3412r.a aVar = new C3412r.a();
        if (string != null) {
            String packageName = this.context.getPackageName();
            C3862t.f(packageName, "context.packageName");
            aVar.d(n.C(string, "${applicationId}", packageName, false, 4, null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.context.getPackageName();
            C3862t.f(packageName2, "context.packageName");
            aVar.b(n.C(string2, "${applicationId}", packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            C3862t.f(packageName3, "context.packageName");
            aVar.c(n.C(string3, "${applicationId}", packageName3, false, 4, null));
        }
        dest.i(aVar.a());
        C4153F c4153f = C4153F.f46609a;
        typedArrayObtainAttributes.recycle();
    }

    @SuppressLint({"ResourceType"})
    public final C3416v b(int graphResId) {
        int next;
        Resources res = this.context.getResources();
        XmlResourceParser xml = res.getXml(graphResId);
        C3862t.f(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(graphResId) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        C3862t.f(res, "res");
        C3862t.f(attrs, "attrs");
        C3414t c3414tA = a(res, xml, attrs, graphResId);
        if (c3414tA instanceof C3416v) {
            return (C3416v) c3414tA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
