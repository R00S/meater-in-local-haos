package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5244h;
import com.airbnb.lottie.p112s.p114j.C5265o;
import java.io.IOException;

/* compiled from: ShapePathParser.java */
/* renamed from: com.airbnb.lottie.u.g0 */
/* loaded from: classes.dex */
class C5292g0 {
    /* renamed from: a */
    static C5265o m9800a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        String strNextString = null;
        C5244h c5244hM9793k = null;
        int iNextInt = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ks":
                    c5244hM9793k = C5285d.m9793k(jsonReader, c5180d);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5265o(strNextString, iNextInt, c5244hM9793k);
    }
}
