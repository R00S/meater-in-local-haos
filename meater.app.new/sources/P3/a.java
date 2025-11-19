package P3;

import L3.C1357b;
import Q3.c;
import Q3.i;
import X3.d;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f13921d;

    /* renamed from: a, reason: collision with root package name */
    private final i<String> f13918a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f13919b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f13920c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private String f13922e = ".ttf";

    public a(Drawable.Callback callback, C1357b c1357b) {
        if (callback instanceof View) {
            this.f13921d = ((View) callback).getContext().getAssets();
        } else {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f13921d = null;
        }
    }

    private Typeface a(c cVar) {
        String strA = cVar.a();
        Typeface typeface = this.f13920c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f13921d, "fonts/" + strA + this.f13922e);
        this.f13920c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i10 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f13918a.b(cVar.a(), cVar.c());
        Typeface typeface = this.f13919b.get(this.f13918a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f13919b.put(this.f13918a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f13922e = str;
    }

    public void d(C1357b c1357b) {
    }
}
