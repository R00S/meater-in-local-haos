package D0;

import D0.d;
import Ub.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.M;
import androidx.compose.ui.res.ResourceResolutionException;
import i0.H0;
import java.io.IOException;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import n0.AbstractC4051b;
import n0.BitmapPainter;
import o0.C4083d;
import o0.C4096q;
import org.xmlpull.v1.XmlPullParserException;
import p0.C4192c;

/* compiled from: PainterResources.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "id", "Ln0/b;", "c", "(ILO/l;I)Ln0/b;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Lo0/d;", "b", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILO/l;I)Lo0/d;", "", "path", "Li0/H0;", "a", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Li0/H0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    private static final H0 a(CharSequence charSequence, Resources resources, int i10) {
        try {
            return c.a(H0.INSTANCE, resources, i10);
        } catch (Exception e10) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e10);
        }
    }

    private static final C4083d b(Resources.Theme theme, Resources resources, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (C1560o.J()) {
            C1560o.S(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        d dVar = (d) interfaceC1554l.o(M.h());
        d.Key key = new d.Key(theme, i10);
        d.ImageVectorEntry imageVectorEntryB = dVar.b(key);
        if (imageVectorEntryB == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (!C3862t.b(C4192c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            imageVectorEntryB = i.a(theme, resources, xml, i11);
            dVar.d(key, imageVectorEntryB);
        }
        C4083d imageVector = imageVectorEntryB.getImageVector();
        if (C1560o.J()) {
            C1560o.R();
        }
        return imageVector;
    }

    public static final AbstractC4051b c(int i10, InterfaceC1554l interfaceC1554l, int i11) {
        AbstractC4051b bitmapPainter;
        if (C1560o.J()) {
            C1560o.S(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)");
        }
        Context context = (Context) interfaceC1554l.o(M.g());
        interfaceC1554l.o(M.f());
        Resources resources = context.getResources();
        TypedValue typedValueB = ((f) interfaceC1554l.o(M.i())).b(resources, i10);
        CharSequence charSequence = typedValueB.string;
        boolean z10 = true;
        if (charSequence == null || !n.P(charSequence, ".xml", false, 2, null)) {
            interfaceC1554l.S(-802884675);
            Object theme = context.getTheme();
            boolean zR = interfaceC1554l.R(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !interfaceC1554l.h(i10)) && (i11 & 6) != 4) {
                z10 = false;
            }
            boolean zR2 = zR | z10 | interfaceC1554l.R(theme);
            Object objF = interfaceC1554l.f();
            if (zR2 || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = a(charSequence, resources, i10);
                interfaceC1554l.J(objF);
            }
            bitmapPainter = new BitmapPainter((H0) objF, 0L, 0L, 6, null);
            interfaceC1554l.I();
        } else {
            interfaceC1554l.S(-803040357);
            bitmapPainter = C4096q.g(b(context.getTheme(), resources, i10, typedValueB.changingConfigurations, interfaceC1554l, (i11 << 6) & 896), interfaceC1554l, 0);
            interfaceC1554l.I();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return bitmapPainter;
    }
}
