package D0;

import D0.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.M;
import java.io.IOException;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import o0.C4083d;
import oa.C4153F;
import org.xmlpull.v1.XmlPullParserException;
import p0.AndroidVectorParser;
import p0.C4192c;

/* compiled from: VectorResources.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lo0/d$b;", "", "id", "Lo0/d;", "b", "(Lo0/d$b;ILO/l;I)Lo0/d;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "resId", "c", "(Lo0/d$b;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Lo0/d;", "Landroid/content/res/XmlResourceParser;", "parser", "changingConfigurations", "LD0/d$a;", "a", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)LD0/d$a;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    public static final d.ImageVectorEntry a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        C4083d.a aVarA = C4192c.a(androidVectorParser, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!C4192c.d(xmlResourceParser)) {
            iG = C4192c.g(androidVectorParser, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new d.ImageVectorEntry(aVarA.e(), i10);
    }

    public static final C4083d b(C4083d.Companion companion, int i10, InterfaceC1554l interfaceC1554l, int i11) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (C1560o.J()) {
            C1560o.S(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) interfaceC1554l.o(M.g());
        Resources resourcesA = g.a(interfaceC1554l, 0);
        Resources.Theme theme = context.getTheme();
        boolean zR = interfaceC1554l.R(resourcesA) | ((((i11 & 112) ^ 48) > 32 && interfaceC1554l.h(i10)) || (i11 & 48) == 32) | interfaceC1554l.R(theme) | interfaceC1554l.R(resourcesA.getConfiguration());
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = c(companion, theme, resourcesA, i10);
            interfaceC1554l.J(objF);
        }
        C4083d c4083d = (C4083d) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return c4083d;
    }

    public static final C4083d c(C4083d.Companion companion, Resources.Theme theme, Resources resources, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        XmlResourceParser xml = resources.getXml(i10);
        C4192c.j(xml);
        C4153F c4153f = C4153F.f46609a;
        return a(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}
