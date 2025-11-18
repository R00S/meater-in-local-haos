package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.p112s.C5231c;
import java.io.IOException;

/* compiled from: FontParser.java */
/* renamed from: com.airbnb.lottie.u.k */
/* loaded from: classes.dex */
class C5299k {
    /* renamed from: a */
    static C5231c m9806a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        float fNextDouble = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fFamily":
                    strNextString = jsonReader.nextString();
                    break;
                case "ascent":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "fStyle":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "fName":
                    strNextString2 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C5231c(strNextString, strNextString2, strNextString3, fNextDouble);
    }
}
