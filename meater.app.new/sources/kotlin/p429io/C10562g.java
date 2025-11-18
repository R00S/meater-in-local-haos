package kotlin.p429io;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ReadWrite.kt */
@Metadata(m32266d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a8\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001e\u0082\u0002\u000f\n\u0005\b\u009920\u0001\n\u0006\b\u0011(\u001f0\u0001¨\u0006 "}, m32267d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", HttpUrl.FRAGMENT_ENCODE_SET, "out", "forEachLine", HttpUrl.FRAGMENT_ENCODE_SET, "action", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/URL;", "readLines", HttpUrl.FRAGMENT_ENCODE_SET, "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Requires newer compiler version to be inlined correctly.", "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.io.g */
/* loaded from: classes2.dex */
public final class C10562g {
    /* renamed from: a */
    public static final long m37641a(Reader reader, Writer writer, int i2) throws IOException {
        C9801m.m32346f(reader, "<this>");
        C9801m.m32346f(writer, "out");
        char[] cArr = new char[i2];
        int i3 = reader.read(cArr);
        long j2 = 0;
        while (i3 >= 0) {
            writer.write(cArr, 0, i3);
            j2 += i3;
            i3 = reader.read(cArr);
        }
        return j2;
    }

    /* renamed from: b */
    public static /* synthetic */ long m37642b(Reader reader, Writer writer, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return m37641a(reader, writer, i2);
    }

    /* renamed from: c */
    public static final String m37643c(Reader reader) {
        C9801m.m32346f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m37642b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        C9801m.m32345e(string, "buffer.toString()");
        return string;
    }
}
