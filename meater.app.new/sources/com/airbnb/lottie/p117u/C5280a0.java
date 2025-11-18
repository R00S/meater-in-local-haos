package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5242f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p112s.p114j.C5260j;
import java.io.IOException;

/* compiled from: RectangleShapeParser.java */
/* renamed from: com.airbnb.lottie.u.a0 */
/* loaded from: classes.dex */
class C5280a0 {
    /* renamed from: a */
    static C5260j m9776a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        String strNextString = null;
        InterfaceC5249m<PointF, PointF> interfaceC5249mM9775b = null;
        C5242f c5242fM9791i = null;
        C5238b c5238bM9787e = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "p":
                    interfaceC5249mM9775b = C5279a.m9775b(jsonReader, c5180d);
                    break;
                case "r":
                    c5238bM9787e = C5285d.m9787e(jsonReader, c5180d);
                    break;
                case "s":
                    c5242fM9791i = C5285d.m9791i(jsonReader, c5180d);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5260j(strNextString, interfaceC5249mM9775b, c5242fM9791i, c5238bM9787e);
    }
}
