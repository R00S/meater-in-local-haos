package io.sentry;

import io.sentry.clientreport.C9398b;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.util.C9641l;
import io.sentry.util.C9643n;
import io.sentry.util.C9646q;
import io.sentry.vendor.C9663a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeItem.java */
@ApiStatus.Internal
/* renamed from: io.sentry.j4 */
/* loaded from: classes2.dex */
public final class C9492j4 {

    /* renamed from: a */
    private static final Charset f36389a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C9499k4 f36390b;

    /* renamed from: c */
    private final Callable<byte[]> f36391c;

    /* renamed from: d */
    private byte[] f36392d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SentryEnvelopeItem.java */
    /* renamed from: io.sentry.j4$a */
    static class a {

        /* renamed from: a */
        private byte[] f36393a;

        /* renamed from: b */
        private final Callable<byte[]> f36394b;

        public a(Callable<byte[]> callable) {
            this.f36394b = callable;
        }

        /* renamed from: b */
        private static byte[] m30911b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        /* renamed from: a */
        public byte[] m30912a() throws Exception {
            Callable<byte[]> callable;
            if (this.f36393a == null && (callable = this.f36394b) != null) {
                this.f36393a = callable.call();
            }
            return m30911b(this.f36393a);
        }
    }

    C9492j4(C9499k4 c9499k4, byte[] bArr) {
        this.f36390b = (C9499k4) C9646q.m31802c(c9499k4, "SentryEnvelopeItemHeader is required.");
        this.f36392d = bArr;
        this.f36391c = null;
    }

    /* renamed from: a */
    private static void m30887a(long j2, long j3, String str) throws SentryEnvelopeException {
        if (j2 > j3) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: b */
    public static C9492j4 m30888b(final InterfaceC9373c2 interfaceC9373c2, final InterfaceC9670w1 interfaceC9670w1, final C9583s0 c9583s0, final long j2) {
        final a aVar = new a(new Callable() { // from class: io.sentry.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9492j4.m30893j(c9583s0, j2, interfaceC9373c2, interfaceC9670w1);
            }
        });
        return new C9492j4(new C9499k4(EnumC9580r4.Attachment, (Callable<Integer>) new Callable() { // from class: io.sentry.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.m30912a().length);
            }
        }, c9583s0.m31577f(), c9583s0.m31578g(), c9583s0.m31575d()), (Callable<byte[]>) new Callable() { // from class: io.sentry.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.m30912a();
            }
        });
    }

    /* renamed from: c */
    public static C9492j4 m30889c(final InterfaceC9373c2 interfaceC9373c2, final C9398b c9398b) throws IOException {
        C9646q.m31802c(interfaceC9373c2, "ISerializer is required.");
        C9646q.m31802c(c9398b, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9492j4.m30896m(interfaceC9373c2, c9398b);
            }
        });
        return new C9492j4(new C9499k4(EnumC9580r4.resolve(c9398b), new Callable() { // from class: io.sentry.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.m30912a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.m30912a();
            }
        });
    }

    /* renamed from: d */
    public static C9492j4 m30890d(final InterfaceC9373c2 interfaceC9373c2, final AbstractC9375c4 abstractC9375c4) throws IOException {
        C9646q.m31802c(interfaceC9373c2, "ISerializer is required.");
        C9646q.m31802c(abstractC9375c4, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9492j4.m30899p(interfaceC9373c2, abstractC9375c4);
            }
        });
        return new C9492j4(new C9499k4(EnumC9580r4.resolve(abstractC9375c4), new Callable() { // from class: io.sentry.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.m30912a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.m30912a();
            }
        });
    }

    /* renamed from: e */
    public static C9492j4 m30891e(final C9512m3 c9512m3, final long j2, final InterfaceC9373c2 interfaceC9373c2) throws SentryEnvelopeException {
        final File fileM31057A = c9512m3.m31057A();
        final a aVar = new a(new Callable() { // from class: io.sentry.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9492j4.m30902s(fileM31057A, j2, c9512m3, interfaceC9373c2);
            }
        });
        return new C9492j4(new C9499k4(EnumC9580r4.Profile, new Callable() { // from class: io.sentry.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.m30912a().length);
            }
        }, "application-json", fileM31057A.getName()), (Callable<byte[]>) new Callable() { // from class: io.sentry.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.m30912a();
            }
        });
    }

    /* renamed from: f */
    public static C9492j4 m30892f(final InterfaceC9373c2 interfaceC9373c2, final C9422d5 c9422d5) throws IOException {
        C9646q.m31802c(interfaceC9373c2, "ISerializer is required.");
        C9646q.m31802c(c9422d5, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9492j4.m30905v(interfaceC9373c2, c9422d5);
            }
        });
        return new C9492j4(new C9499k4(EnumC9580r4.Session, new Callable() { // from class: io.sentry.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.m30912a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.m30912a();
            }
        });
    }

    /* renamed from: j */
    static /* synthetic */ byte[] m30893j(C9583s0 c9583s0, long j2, InterfaceC9373c2 interfaceC9373c2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
        if (c9583s0.m31576e() != null) {
            byte[] bArrM31576e = c9583s0.m31576e();
            m30887a(bArrM31576e.length, j2, c9583s0.m31578g());
            return bArrM31576e;
        }
        if (c9583s0.m31580i() != null) {
            byte[] bArrM31796b = C9643n.m31796b(interfaceC9373c2, interfaceC9670w1, c9583s0.m31580i());
            if (bArrM31796b != null) {
                m30887a(bArrM31796b.length, j2, c9583s0.m31578g());
                return bArrM31796b;
            }
        } else if (c9583s0.m31579h() != null) {
            return C9641l.m31776b(c9583s0.m31579h(), j2);
        }
        throw new SentryEnvelopeException(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable or a path is set.", c9583s0.m31578g()));
    }

    /* renamed from: m */
    static /* synthetic */ byte[] m30896m(InterfaceC9373c2 interfaceC9373c2, C9398b c9398b) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
            try {
                interfaceC9373c2.mo30487a(c9398b, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: p */
    static /* synthetic */ byte[] m30899p(InterfaceC9373c2 interfaceC9373c2, AbstractC9375c4 abstractC9375c4) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
            try {
                interfaceC9373c2.mo30487a(abstractC9375c4, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: s */
    static /* synthetic */ byte[] m30902s(File file, long j2, C9512m3 c9512m3, InterfaceC9373c2 interfaceC9373c2) throws Exception {
        if (!file.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strM31853c = C9663a.m31853c(C9641l.m31776b(file.getPath(), j2), 3);
        if (strM31853c.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        c9512m3.m31059E(strM31853c);
        c9512m3.m31058D();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
                    try {
                        interfaceC9373c2.mo30487a(c9512m3, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th2;
                }
            } catch (IOException e2) {
                throw new SentryEnvelopeException(String.format("Failed to serialize profiling trace data\n%s", e2.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    /* renamed from: v */
    static /* synthetic */ byte[] m30905v(InterfaceC9373c2 interfaceC9373c2, C9422d5 c9422d5) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36389a));
            try {
                interfaceC9373c2.mo30487a(c9422d5, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: g */
    public C9398b m30908g(InterfaceC9373c2 interfaceC9373c2) throws Exception {
        C9499k4 c9499k4 = this.f36390b;
        if (c9499k4 == null || c9499k4.m30919b() != EnumC9580r4.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m30909h()), f36389a));
        try {
            C9398b c9398b = (C9398b) interfaceC9373c2.mo30489c(bufferedReader, C9398b.class);
            bufferedReader.close();
            return c9398b;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: h */
    public byte[] m30909h() throws Exception {
        Callable<byte[]> callable;
        if (this.f36392d == null && (callable = this.f36391c) != null) {
            this.f36392d = callable.call();
        }
        return this.f36392d;
    }

    /* renamed from: i */
    public C9499k4 m30910i() {
        return this.f36390b;
    }

    C9492j4(C9499k4 c9499k4, Callable<byte[]> callable) {
        this.f36390b = (C9499k4) C9646q.m31802c(c9499k4, "SentryEnvelopeItemHeader is required.");
        this.f36391c = (Callable) C9646q.m31802c(callable, "DataFactory is required.");
        this.f36392d = null;
    }
}
