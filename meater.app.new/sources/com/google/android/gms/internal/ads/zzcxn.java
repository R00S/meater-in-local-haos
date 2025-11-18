package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcxn {

    /* renamed from: a */
    public final int f25269a;

    /* renamed from: b */
    public final int f25270b;

    /* renamed from: c */
    public final boolean f25271c;

    public zzcxn(int i2, int i3, boolean z) {
        this.f25269a = i2;
        this.f25270b = i3;
        this.f25271c = z;
    }

    /* renamed from: a */
    static List<zzcxn> m19022a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    iNextInt = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    iNextInt2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzcxn(iNextInt, iNextInt2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
