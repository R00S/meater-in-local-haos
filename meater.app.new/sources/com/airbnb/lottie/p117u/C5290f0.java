package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p114j.C5264n;
import com.airbnb.lottie.p112s.p114j.InterfaceC5252b;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ShapeGroupParser.java */
/* renamed from: com.airbnb.lottie.u.f0 */
/* loaded from: classes.dex */
class C5290f0 {
    /* renamed from: a */
    static C5264n m9798a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("it")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    InterfaceC5252b interfaceC5252bM9799a = C5291g.m9799a(jsonReader, c5180d);
                    if (interfaceC5252bM9799a != null) {
                        arrayList.add(interfaceC5252bM9799a);
                    }
                }
                jsonReader.endArray();
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new C5264n(strNextString, arrayList);
    }
}
