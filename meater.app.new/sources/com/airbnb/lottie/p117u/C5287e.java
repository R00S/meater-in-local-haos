package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5242f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p112s.p114j.C5251a;
import java.io.IOException;

/* compiled from: CircleShapeParser.java */
/* renamed from: com.airbnb.lottie.u.e */
/* loaded from: classes.dex */
class C5287e {
    /* renamed from: a */
    static C5251a m9795a(JsonReader jsonReader, C5180d c5180d, int i2) throws IOException {
        boolean z = i2 == 3;
        String strNextString = null;
        InterfaceC5249m<PointF, PointF> interfaceC5249mM9775b = null;
        C5242f c5242fM9791i = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "p":
                    interfaceC5249mM9775b = C5279a.m9775b(jsonReader, c5180d);
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
        return new C5251a(strNextString, interfaceC5249mM9775b, c5242fM9791i, z);
    }
}
