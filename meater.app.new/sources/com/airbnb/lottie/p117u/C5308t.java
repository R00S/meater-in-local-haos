package com.airbnb.lottie.p117u;

import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.C5183g;
import com.airbnb.lottie.p112s.C5231c;
import com.airbnb.lottie.p112s.C5232d;
import com.airbnb.lottie.p112s.p115k.C5271d;
import com.airbnb.lottie.p118v.C5320f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0870d;
import p024c.p041e.C0874h;

/* compiled from: LottieCompositionParser.java */
/* renamed from: com.airbnb.lottie.u.t */
/* loaded from: classes.dex */
public class C5308t {
    /* renamed from: a */
    public static C5180d m9830a(JsonReader jsonReader) throws IOException {
        C0874h<C5232d> c0874h;
        HashMap map;
        float fM9887e = C5320f.m9887e();
        C0870d<C5271d> c0870d = new C0870d<>();
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        C0874h<C5232d> c0874h2 = new C0874h<>();
        C5180d c5180d = new C5180d();
        jsonReader.beginObject();
        int iNextInt = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "assets":
                    c0874h = c0874h2;
                    map = map4;
                    m9831b(jsonReader, c5180d, map2, map3);
                    continue;
                    map4 = map;
                    c0874h2 = c0874h;
                case "layers":
                    c0874h = c0874h2;
                    map = map4;
                    m9834e(jsonReader, c5180d, arrayList, c0870d);
                    continue;
                    map4 = map;
                    c0874h2 = c0874h;
                case "h":
                    c0874h = c0874h2;
                    map = map4;
                    iNextInt2 = jsonReader.nextInt();
                    continue;
                    map4 = map;
                    c0874h2 = c0874h;
                case "v":
                    c0874h = c0874h2;
                    map = map4;
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (C5320f.m9890h(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        continue;
                    } else {
                        c5180d.m9395a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    map4 = map;
                    c0874h2 = c0874h;
                case "w":
                    c0874h = c0874h2;
                    map = map4;
                    iNextInt = jsonReader.nextInt();
                    continue;
                    map4 = map;
                    c0874h2 = c0874h;
                case "fr":
                    c0874h = c0874h2;
                    map = map4;
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    continue;
                    map4 = map;
                    c0874h2 = c0874h;
                case "ip":
                    c0874h = c0874h2;
                    map = map4;
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    map4 = map;
                    c0874h2 = c0874h;
                case "op":
                    c0874h = c0874h2;
                    map = map4;
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    continue;
                    map4 = map;
                    c0874h2 = c0874h;
                case "chars":
                    m9832c(jsonReader, c5180d, c0874h2);
                    break;
                case "fonts":
                    m9833d(jsonReader, map4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            c0874h = c0874h2;
            map = map4;
            map4 = map;
            c0874h2 = c0874h;
        }
        jsonReader.endObject();
        c5180d.m9408n(new Rect(0, 0, (int) (iNextInt * fM9887e), (int) (iNextInt2 * fM9887e)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, c0870d, map2, map3, c0874h2, map4);
        return c5180d;
    }

    /* renamed from: b */
    private static void m9831b(JsonReader jsonReader, C5180d c5180d, Map<String, List<C5271d>> map, Map<String, C5183g> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            C0870d c0870d = new C0870d();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            C5271d c5271dM9828a = C5307s.m9828a(jsonReader, c5180d);
                            c0870d.m5442k(c5271dM9828a.m9733b(), c5271dM9828a);
                            arrayList.add(c5271dM9828a);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                C5183g c5183g = new C5183g(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(c5183g.m9484c(), c5183g);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: c */
    private static void m9832c(JsonReader jsonReader, C5180d c5180d, C0874h<C5232d> c0874h) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            C5232d c5232dM9805a = C5297j.m9805a(jsonReader, c5180d);
            c0874h.m5486k(c5232dM9805a.hashCode(), c5232dM9805a);
        }
        jsonReader.endArray();
    }

    /* renamed from: d */
    private static void m9833d(JsonReader jsonReader, Map<String, C5231c> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C5231c c5231cM9806a = C5299k.m9806a(jsonReader);
                    map.put(c5231cM9806a.m9598b(), c5231cM9806a);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: e */
    private static void m9834e(JsonReader jsonReader, C5180d c5180d, List<C5271d> list, C0870d<C5271d> c0870d) throws IOException {
        jsonReader.beginArray();
        int i2 = 0;
        while (jsonReader.hasNext()) {
            C5271d c5271dM9828a = C5307s.m9828a(jsonReader, c5180d);
            if (c5271dM9828a.m9735d() == C5271d.a.Image) {
                i2++;
            }
            list.add(c5271dM9828a);
            c0870d.m5442k(c5271dM9828a.m9733b(), c5271dM9828a);
            if (i2 > 4) {
                C5179c.m9394d("You have " + i2 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }
}
