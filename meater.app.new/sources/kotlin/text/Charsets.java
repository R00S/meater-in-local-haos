package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Charsets.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m32267d2 = {"Lkotlin/text/Charsets;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.h0.d, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class Charsets {

    /* renamed from: a */
    public static final Charsets f40650a = new Charsets();

    /* renamed from: b */
    public static final Charset f40651b;

    /* renamed from: c */
    public static final Charset f40652c;

    /* renamed from: d */
    public static final Charset f40653d;

    /* renamed from: e */
    public static final Charset f40654e;

    /* renamed from: f */
    public static final Charset f40655f;

    /* renamed from: g */
    public static final Charset f40656g;

    /* renamed from: h */
    private static Charset f40657h;

    /* renamed from: i */
    private static Charset f40658i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        C9801m.m32345e(charsetForName, "forName(\"UTF-8\")");
        f40651b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        C9801m.m32345e(charsetForName2, "forName(\"UTF-16\")");
        f40652c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        C9801m.m32345e(charsetForName3, "forName(\"UTF-16BE\")");
        f40653d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        C9801m.m32345e(charsetForName4, "forName(\"UTF-16LE\")");
        f40654e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        C9801m.m32345e(charsetForName5, "forName(\"US-ASCII\")");
        f40655f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        C9801m.m32345e(charsetForName6, "forName(\"ISO-8859-1\")");
        f40656g = charsetForName6;
    }

    private Charsets() {
    }

    /* renamed from: a */
    public final Charset m37416a() {
        Charset charset = f40658i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        C9801m.m32345e(charsetForName, "forName(\"UTF-32BE\")");
        f40658i = charsetForName;
        return charsetForName;
    }

    /* renamed from: b */
    public final Charset m37417b() {
        Charset charset = f40657h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        C9801m.m32345e(charsetForName, "forName(\"UTF-32LE\")");
        f40657h = charsetForName;
        return charsetForName;
    }
}
