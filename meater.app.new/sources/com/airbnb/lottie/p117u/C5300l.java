package com.airbnb.lottie.p117u;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p112s.p114j.C5253c;
import com.airbnb.lottie.p118v.C5319e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientColorParser.java */
/* renamed from: com.airbnb.lottie.u.l */
/* loaded from: classes.dex */
public class C5300l implements InterfaceC5298j0<C5253c> {

    /* renamed from: a */
    private int f12905a;

    public C5300l(int i2) {
        this.f12905a = i2;
    }

    /* renamed from: b */
    private void m9807b(C5253c c5253c, List<Float> list) {
        int i2 = this.f12905a * 4;
        if (list.size() <= i2) {
            return;
        }
        int size = (list.size() - i2) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i3 = 0;
        while (i2 < list.size()) {
            if (i2 % 2 == 0) {
                dArr[i3] = list.get(i2).floatValue();
            } else {
                dArr2[i3] = list.get(i2).floatValue();
                i3++;
            }
            i2++;
        }
        for (int i4 = 0; i4 < c5253c.m9634c(); i4++) {
            int i5 = c5253c.m9632a()[i4];
            c5253c.m9632a()[i4] = Color.argb(m9808c(c5253c.m9633b()[i4], dArr, dArr2), Color.red(i5), Color.green(i5), Color.blue(i5));
        }
    }

    /* renamed from: c */
    private int m9808c(double d2, double[] dArr, double[] dArr2) {
        double dM9879i;
        int i2 = 1;
        while (true) {
            if (i2 >= dArr.length) {
                dM9879i = dArr2[dArr2.length - 1];
                break;
            }
            int i3 = i2 - 1;
            double d3 = dArr[i3];
            double d4 = dArr[i2];
            if (dArr[i2] >= d2) {
                dM9879i = C5319e.m9879i(dArr2[i3], dArr2[i2], (d2 - d3) / (d4 - d3));
                break;
            }
            i2++;
        }
        return (int) (dM9879i * 255.0d);
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5298j0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5253c mo9781a(JsonReader jsonReader, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f12905a == -1) {
            this.f12905a = arrayList.size() / 4;
        }
        int i2 = this.f12905a;
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f12905a * 4; i5++) {
            int i6 = i5 / 4;
            double dFloatValue = arrayList.get(i5).floatValue();
            int i7 = i5 % 4;
            if (i7 == 0) {
                fArr[i6] = (float) dFloatValue;
            } else if (i7 == 1) {
                Double.isNaN(dFloatValue);
                i3 = (int) (dFloatValue * 255.0d);
            } else if (i7 == 2) {
                Double.isNaN(dFloatValue);
                i4 = (int) (dFloatValue * 255.0d);
            } else if (i7 == 3) {
                Double.isNaN(dFloatValue);
                iArr[i6] = Color.argb(255, i3, i4, (int) (dFloatValue * 255.0d));
            }
        }
        C5253c c5253c = new C5253c(fArr, iArr);
        m9807b(c5253c, arrayList);
        return c5253c;
    }
}
