package I2;

import U1.y;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.C3910c;

/* compiled from: IcyDecoder.java */
/* loaded from: classes.dex */
public final class a extends E2.c {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f6655c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f6656a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f6657b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f6656a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f6657b.decode(byteBuffer).toString();
                this.f6657b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f6657b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f6657b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f6656a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // E2.c
    protected y b(E2.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new y(new c(bArr, null, null));
        }
        Matcher matcher = f6655c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = C3910c.e(strGroup);
                strE.hashCode();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new y(new c(bArr, str, str2));
    }
}
