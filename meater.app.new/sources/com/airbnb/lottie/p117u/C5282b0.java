package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5248l;
import com.airbnb.lottie.p112s.p114j.C5261k;
import java.io.IOException;

/* compiled from: RepeaterParser.java */
/* renamed from: com.airbnb.lottie.u.b0 */
/* loaded from: classes.dex */
class C5282b0 {
    /* renamed from: a */
    static C5261k m9779a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        String strNextString = null;
        C5238b c5238bM9788f = null;
        C5238b c5238bM9788f2 = null;
        C5248l c5248lM9780a = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "c":
                    c5238bM9788f = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "o":
                    c5238bM9788f2 = C5285d.m9788f(jsonReader, c5180d, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    c5248lM9780a = C5283c.m9780a(jsonReader, c5180d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5261k(strNextString, c5238bM9788f, c5238bM9788f2, c5248lM9780a);
    }
}
