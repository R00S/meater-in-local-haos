package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5240d;
import com.airbnb.lottie.p112s.p113i.C5241e;
import com.airbnb.lottie.p112s.p113i.C5243g;
import com.airbnb.lottie.p112s.p113i.C5248l;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p119w.C5324d;
import java.io.IOException;

/* compiled from: AnimatableTransformParser.java */
/* renamed from: com.airbnb.lottie.u.c */
/* loaded from: classes.dex */
public class C5283c {
    /* renamed from: a */
    public static C5248l m9780a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        C5241e c5241e = null;
        C5243g c5243g = null;
        C5240d c5240d = null;
        InterfaceC5249m<PointF, PointF> interfaceC5249mM9775b = null;
        C5238b c5238bM9788f = null;
        C5238b c5238bM9788f2 = null;
        C5238b c5238bM9788f3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("k")) {
                            c5241e = C5279a.m9774a(jsonReader, c5180d);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "o":
                    c5240d = C5285d.m9790h(jsonReader, c5180d);
                    continue;
                case "p":
                    interfaceC5249mM9775b = C5279a.m9775b(jsonReader, c5180d);
                    continue;
                case "r":
                    break;
                case "s":
                    c5243g = C5285d.m9792j(jsonReader, c5180d);
                    continue;
                case "eo":
                    c5238bM9788f3 = C5285d.m9788f(jsonReader, c5180d, false);
                    continue;
                case "rz":
                    c5180d.m9395a("Lottie doesn't support 3D layers.");
                    break;
                case "so":
                    c5238bM9788f2 = C5285d.m9788f(jsonReader, c5180d, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            c5238bM9788f = C5285d.m9788f(jsonReader, c5180d, false);
        }
        if (z) {
            jsonReader.endObject();
        }
        if (c5241e == null) {
            Log.w("LOTTIE", "Layer has no transform property. You may be using an unsupported layer type such as a camera.");
            c5241e = new C5241e();
        }
        C5241e c5241e2 = c5241e;
        if (c5243g == null) {
            c5243g = new C5243g(new C5324d(1.0f, 1.0f));
        }
        C5243g c5243g2 = c5243g;
        if (c5240d == null) {
            c5240d = new C5240d();
        }
        return new C5248l(c5241e2, interfaceC5249mM9775b, c5243g2, c5238bM9788f, c5240d, c5238bM9788f2, c5238bM9788f3);
    }
}
