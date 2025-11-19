package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes2.dex */
public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) {
        return read(new Q9.a(reader));
    }

    public final T fromJsonTree(j jVar) {
        try {
            return read(new com.google.gson.internal.bind.a(jVar));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public T read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return (T) TypeAdapter.this.read(aVar);
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(Q9.c cVar, T t10) throws IOException {
                if (t10 == null) {
                    cVar.p();
                } else {
                    TypeAdapter.this.write(cVar, t10);
                }
            }
        };
    }

    public abstract T read(Q9.a aVar);

    public final void toJson(Writer writer, T t10) {
        write(new Q9.c(writer), t10);
    }

    public final j toJsonTree(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t10);
            return bVar.e0();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public abstract void write(Q9.c cVar, T t10);

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }
}
