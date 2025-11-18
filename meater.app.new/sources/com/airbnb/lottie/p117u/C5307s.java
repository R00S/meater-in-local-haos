package com.airbnb.lottie.p117u;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5246j;
import com.airbnb.lottie.p112s.p113i.C5247k;
import com.airbnb.lottie.p112s.p113i.C5248l;
import com.airbnb.lottie.p112s.p114j.InterfaceC5252b;
import com.airbnb.lottie.p112s.p115k.C5271d;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5321a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* renamed from: com.airbnb.lottie.u.s */
/* loaded from: classes.dex */
public class C5307s {
    /* renamed from: a */
    public static C5271d m9828a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        C5271d.b bVar = C5271d.b.None;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.beginObject();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        C5271d.b bVar2 = bVar;
        C5271d.a aVar = null;
        String strNextString = null;
        C5248l c5248lM9780a = null;
        C5246j c5246jM9786d = null;
        C5247k c5247kM9777a = null;
        C5238b c5238bM9788f = null;
        long jNextInt = 0;
        long jNextInt2 = -1;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        float fNextDouble3 = 1.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt3 = 0;
        int iNextInt4 = 0;
        String strNextString2 = null;
        String strNextString3 = "UNSET";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parent":
                    jNextInt2 = jsonReader.nextInt();
                    continue;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        InterfaceC5252b interfaceC5252bM9799a = C5291g.m9799a(jsonReader, c5180d);
                        if (interfaceC5252bM9799a != null) {
                            arrayList4.add(interfaceC5252bM9799a);
                        }
                    }
                    jsonReader.endArray();
                    continue;
                case "h":
                    iNextInt4 = (int) (jsonReader.nextInt() * C5320f.m9887e());
                    continue;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                c5247kM9777a = C5281b.m9777a(jsonReader, c5180d);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (strNextName2.equals("d")) {
                            c5246jM9786d = C5285d.m9786d(jsonReader, c5180d);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "w":
                    iNextInt3 = (int) (jsonReader.nextInt() * C5320f.m9887e());
                    continue;
                case "cl":
                    strNextString2 = jsonReader.nextString();
                    continue;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.hashCode();
                            if (strNextName3.equals("nm")) {
                                arrayList5.add(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    c5180d.m9395a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    continue;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                case "ks":
                    c5248lM9780a = C5283c.m9780a(jsonReader, c5180d);
                    continue;
                case "nm":
                    strNextString3 = jsonReader.nextString();
                    continue;
                case "op":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    continue;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    continue;
                case "sh":
                    iNextInt2 = (int) (jsonReader.nextInt() * C5320f.m9887e());
                    continue;
                case "sr":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    continue;
                case "st":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    continue;
                case "sw":
                    iNextInt = (int) (jsonReader.nextInt() * C5320f.m9887e());
                    continue;
                case "tm":
                    c5238bM9788f = C5285d.m9788f(jsonReader, c5180d, false);
                    continue;
                case "tt":
                    bVar2 = C5271d.b.values()[jsonReader.nextInt()];
                    break;
                case "ty":
                    int iNextInt5 = jsonReader.nextInt();
                    aVar = C5271d.a.Unknown;
                    if (iNextInt5 < aVar.ordinal()) {
                        aVar = C5271d.a.values()[iNextInt5];
                        break;
                    }
                    break;
                case "ind":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "refId":
                    strNextString = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList3.add(C5309u.m9835a(jsonReader, c5180d));
                    }
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        float f2 = fNextDouble / fNextDouble3;
        float fM9400f = fNextDouble2 / fNextDouble3;
        ArrayList arrayList6 = new ArrayList();
        if (f2 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C5321a(c5180d, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(f2)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (fM9400f <= 0.0f) {
            fM9400f = c5180d.m9400f();
        }
        arrayList2.add(new C5321a(c5180d, fValueOf, fValueOf, null, f2, Float.valueOf(fM9400f)));
        arrayList2.add(new C5321a(c5180d, fValueOf2, fValueOf2, null, fM9400f, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString3.endsWith(".ai") || "ai".equals(strNextString2)) {
            c5180d.m9395a("Convert your Illustrator layers to shape layers.");
        }
        return new C5271d(arrayList4, c5180d, strNextString3, jNextInt, aVar, jNextInt2, strNextString, arrayList, c5248lM9780a, iNextInt, iNextInt2, color, fNextDouble3, fNextDouble4, iNextInt3, iNextInt4, c5246jM9786d, c5247kM9777a, arrayList2, bVar2, c5238bM9788f);
    }

    /* renamed from: b */
    public static C5271d m9829b(C5180d c5180d) {
        Rect rectM9396b = c5180d.m9396b();
        return new C5271d(Collections.emptyList(), c5180d, "__container", -1L, C5271d.a.PreComp, -1L, null, Collections.emptyList(), new C5248l(), 0, 0, 0, 0.0f, 0.0f, rectM9396b.width(), rectM9396b.height(), null, null, Collections.emptyList(), C5271d.b.None, null);
    }
}
