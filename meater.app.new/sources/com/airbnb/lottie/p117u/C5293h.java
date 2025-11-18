package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.p112s.C5230b;
import java.io.IOException;

/* compiled from: DocumentDataParser.java */
/* renamed from: com.airbnb.lottie.u.h */
/* loaded from: classes.dex */
public class C5293h implements InterfaceC5298j0<C5230b> {

    /* renamed from: a */
    public static final C5293h f12903a = new C5293h();

    private C5293h() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5298j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5230b mo9781a(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        double dNextDouble = 0.0d;
        double dNextDouble2 = 0.0d;
        double dNextDouble3 = 0.0d;
        double dNextDouble4 = 0.0d;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int iM9816d = 0;
        int iM9816d2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "s":
                    dNextDouble = jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iM9816d = C5304p.m9816d(jsonReader);
                    break;
                case "lh":
                    dNextDouble2 = jsonReader.nextDouble();
                    break;
                case "ls":
                    dNextDouble3 = jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "sc":
                    iM9816d2 = C5304p.m9816d(jsonReader);
                    break;
                case "sw":
                    dNextDouble4 = jsonReader.nextDouble();
                    break;
                case "tr":
                    iNextInt2 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C5230b(strNextString, strNextString2, dNextDouble, iNextInt, iNextInt2, dNextDouble2, dNextDouble3, iM9816d, iM9816d2, dNextDouble4, zNextBoolean);
    }
}
