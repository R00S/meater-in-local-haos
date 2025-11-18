package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p114j.C5267q;
import java.io.IOException;

/* compiled from: ShapeTrimPathParser.java */
/* renamed from: com.airbnb.lottie.u.i0 */
/* loaded from: classes.dex */
class C5296i0 {
    /* renamed from: a */
    static C5267q m9804a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        String strNextString = null;
        C5267q.a aVarM9708g = null;
        C5238b c5238bM9788f = null;
        C5238b c5238bM9788f2 = null;
        C5238b c5238bM9788f3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    c5238bM9788f2 = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "m":
                    aVarM9708g = C5267q.a.m9708g(jsonReader.nextInt());
                    break;
                case "o":
                    c5238bM9788f3 = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "s":
                    c5238bM9788f = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5267q(strNextString, aVarM9708g, c5238bM9788f, c5238bM9788f2, c5238bM9788f3);
    }
}
