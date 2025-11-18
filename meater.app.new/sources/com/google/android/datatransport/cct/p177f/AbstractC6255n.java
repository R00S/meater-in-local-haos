package com.google.android.datatransport.cct.p177f;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* compiled from: LogResponse.java */
@AutoValue
/* renamed from: com.google.android.datatransport.cct.f.n */
/* loaded from: classes2.dex */
public abstract class AbstractC6255n {
    /* renamed from: a */
    static AbstractC6255n m13502a(long j2) {
        return new C6249h(j2);
    }

    /* renamed from: b */
    public static AbstractC6255n m13503b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m13502a(Long.parseLong(jsonReader.nextString())) : m13502a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo13487c();
}
