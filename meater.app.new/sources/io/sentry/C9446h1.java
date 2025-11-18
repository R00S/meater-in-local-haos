package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeReader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.h1 */
/* loaded from: classes2.dex */
public final class C9446h1 implements InterfaceC9584s1 {

    /* renamed from: a */
    private static final Charset f36340a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final InterfaceC9373c2 f36341b;

    public C9446h1(InterfaceC9373c2 interfaceC9373c2) {
        this.f36341b = interfaceC9373c2;
    }

    /* renamed from: b */
    private C9473i4 m30815b(byte[] bArr, int i2, int i3) {
        StringReader stringReader = new StringReader(new String(bArr, i2, i3, f36340a));
        try {
            C9473i4 c9473i4 = (C9473i4) this.f36341b.mo30489c(stringReader, C9473i4.class);
            stringReader.close();
            return c9473i4;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    private C9499k4 m30816c(byte[] bArr, int i2, int i3) {
        StringReader stringReader = new StringReader(new String(bArr, i2, i3, f36340a));
        try {
            C9499k4 c9499k4 = (C9499k4) this.f36341b.mo30489c(stringReader, C9499k4.class);
            stringReader.close();
            return c9499k4;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        r11 = new io.sentry.C9449h4(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        return r11;
     */
    @Override // io.sentry.InterfaceC9584s1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.C9449h4 mo30817a(java.io.InputStream r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C9446h1.mo30817a(java.io.InputStream):io.sentry.h4");
    }
}
