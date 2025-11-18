package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* compiled from: JsonParser.java */
/* loaded from: classes2.dex */
public final class m {
    @Deprecated
    public m() {
    }

    public static j b(Q9.a aVar) {
        boolean zN = aVar.n();
        aVar.a0(true);
        try {
            try {
                return com.google.gson.internal.l.a(aVar);
            } catch (OutOfMemoryError e10) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e10);
            } catch (StackOverflowError e11) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e11);
            }
        } finally {
            aVar.a0(zN);
        }
    }

    public static j c(Reader reader) {
        try {
            Q9.a aVar = new Q9.a(reader);
            j jVarB = b(aVar);
            if (!jVarB.x() && aVar.N() != Q9.b.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return jVarB;
        } catch (MalformedJsonException e10) {
            throw new JsonSyntaxException(e10);
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        } catch (NumberFormatException e12) {
            throw new JsonSyntaxException(e12);
        }
    }

    public static j d(String str) {
        return c(new StringReader(str));
    }

    @Deprecated
    public j a(String str) {
        return d(str);
    }
}
