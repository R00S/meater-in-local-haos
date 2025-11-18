package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p112s.p114j.C5259i;
import java.io.IOException;

/* compiled from: PolystarShapeParser.java */
/* renamed from: com.airbnb.lottie.u.z */
/* loaded from: classes.dex */
class C5314z {
    /* renamed from: a */
    static C5259i m9840a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        String strNextString = null;
        C5259i.a aVarM9670g = null;
        C5238b c5238bM9788f = null;
        InterfaceC5249m<PointF, PointF> interfaceC5249mM9775b = null;
        C5238b c5238bM9788f2 = null;
        C5238b c5238bM9787e = null;
        C5238b c5238bM9787e2 = null;
        C5238b c5238bM9788f3 = null;
        C5238b c5238bM9788f4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "p":
                    interfaceC5249mM9775b = C5279a.m9775b(jsonReader, c5180d);
                    break;
                case "r":
                    c5238bM9788f2 = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "ir":
                    c5238bM9787e = C5285d.m9787e(jsonReader, c5180d);
                    break;
                case "is":
                    c5238bM9788f3 = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    c5238bM9787e2 = C5285d.m9787e(jsonReader, c5180d);
                    break;
                case "os":
                    c5238bM9788f4 = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "pt":
                    c5238bM9788f = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "sy":
                    aVarM9670g = C5259i.a.m9670g(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5259i(strNextString, aVarM9670g, c5238bM9788f, interfaceC5249mM9775b, c5238bM9788f2, c5238bM9787e, c5238bM9787e2, c5238bM9788f3, c5238bM9788f4);
    }
}
