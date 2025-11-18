package com.google.gson.p215t;

import com.google.gson.AbstractC8571j;
import com.google.gson.C8572k;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p215t.p216n.C8614n;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* renamed from: com.google.gson.t.l */
/* loaded from: classes2.dex */
public final class C8599l {
    /* renamed from: a */
    public static AbstractC8571j m27110a(C8585a c8585a) throws JsonParseException {
        boolean z;
        try {
            try {
                c8585a.mo27001Q();
                z = false;
                try {
                    return C8614n.f32661X.mo26938b(c8585a);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return C8572k.f32449a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e3) {
                throw new JsonSyntaxException(e3);
            } catch (IOException e4) {
                throw new JsonIOException(e4);
            } catch (NumberFormatException e5) {
                throw new JsonSyntaxException(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z = true;
        }
    }

    /* renamed from: b */
    public static void m27111b(AbstractC8571j abstractC8571j, C8587c c8587c) throws IOException {
        C8614n.f32661X.mo26939d(c8587c, abstractC8571j);
    }

    /* renamed from: c */
    public static Writer m27112c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    /* renamed from: com.google.gson.t.l$a */
    private static final class a extends Writer {

        /* renamed from: f */
        private final Appendable f32569f;

        /* renamed from: g */
        private final C11519a f32570g = new C11519a();

        /* compiled from: Streams.java */
        /* renamed from: com.google.gson.t.l$a$a, reason: collision with other inner class name */
        static class C11519a implements CharSequence {

            /* renamed from: f */
            char[] f32571f;

            C11519a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f32571f[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f32571f.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f32571f, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.f32569f = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            C11519a c11519a = this.f32570g;
            c11519a.f32571f = cArr;
            this.f32569f.append(c11519a, i2, i3 + i2);
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f32569f.append((char) i2);
        }
    }
}
