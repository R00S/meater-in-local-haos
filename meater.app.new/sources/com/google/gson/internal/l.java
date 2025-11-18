package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* compiled from: Streams.java */
/* loaded from: classes2.dex */
public final class l {
    public static com.google.gson.j a(Q9.a aVar) {
        boolean z10;
        try {
            try {
                aVar.N();
                z10 = false;
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (NumberFormatException e12) {
                throw new JsonSyntaxException(e12);
            }
        } catch (EOFException e13) {
            e = e13;
            z10 = true;
        }
        try {
            return TypeAdapters.f38981V.read(aVar);
        } catch (EOFException e14) {
            e = e14;
            if (z10) {
                return com.google.gson.k.f39117B;
            }
            throw new JsonSyntaxException(e);
        }
    }

    public static void b(com.google.gson.j jVar, Q9.c cVar) {
        TypeAdapters.f38981V.write(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    /* compiled from: Streams.java */
    private static final class b extends Writer {

        /* renamed from: B, reason: collision with root package name */
        private final Appendable f39095B;

        /* renamed from: C, reason: collision with root package name */
        private final a f39096C = new a();

        /* compiled from: Streams.java */
        private static class a implements CharSequence {

            /* renamed from: B, reason: collision with root package name */
            private char[] f39097B;

            /* renamed from: C, reason: collision with root package name */
            private String f39098C;

            private a() {
            }

            void a(char[] cArr) {
                this.f39097B = cArr;
                this.f39098C = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f39097B[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f39097B.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f39097B, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f39098C == null) {
                    this.f39098C = new String(this.f39097B);
                }
                return this.f39098C;
            }
        }

        b(Appendable appendable) {
            this.f39095B = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f39096C.a(cArr);
            this.f39095B.append(this.f39096C, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f39095B.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f39095B.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f39095B.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f39095B.append(str, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
