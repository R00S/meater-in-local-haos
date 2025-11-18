package com.airbnb.lottie.p117u;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5237a;
import com.airbnb.lottie.p112s.p113i.C5240d;
import com.airbnb.lottie.p112s.p114j.C5263m;
import java.io.IOException;

/* compiled from: ShapeFillParser.java */
/* renamed from: com.airbnb.lottie.u.e0 */
/* loaded from: classes.dex */
class C5288e0 {
    /* renamed from: a */
    static C5263m m9796a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        String strNextString = null;
        C5237a c5237aM9785c = null;
        C5240d c5240dM9790h = null;
        int iNextInt = 1;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    c5237aM9785c = C5285d.m9785c(jsonReader, c5180d);
                    break;
                case "o":
                    c5240dM9790h = C5285d.m9790h(jsonReader, c5180d);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5263m(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c5237aM9785c, c5240dM9790h);
    }
}
