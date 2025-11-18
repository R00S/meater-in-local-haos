package com.flurry.sdk;

import com.flurry.sdk.AbstractC6014c3;
import com.flurry.sdk.InterfaceC6132p3;
import com.flurry.sdk.InterfaceC6197x2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.w2 */
/* loaded from: classes2.dex */
public final class C6189w2 extends AbstractC6014c3 {

    /* renamed from: s */
    protected InterfaceC6132p3 f16479s;

    /* renamed from: t */
    protected C6201x6 f16480t;

    /* renamed from: com.flurry.sdk.w2$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6177u6 f16481h;

        /* renamed from: com.flurry.sdk.w2$a$a, reason: collision with other inner class name */
        final class C11475a implements InterfaceC6132p3.a {
            C11475a() {
            }

            @Override // com.flurry.sdk.InterfaceC6132p3.a
            /* renamed from: a */
            public final void mo13259a() {
                C6189w2.this.f15722p = AbstractC6014c3.c.f15731h;
                C6189w2.this.f16479s.mo13187d();
                C6189w2.this.f15722p = AbstractC6014c3.c.f15732i;
                C6189w2.this.m13001v();
            }
        }

        a(InterfaceC6177u6 interfaceC6177u6) {
            this.f16481h = interfaceC6177u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            if (!C6189w2.this.f16479s.mo13186c()) {
                if (C6189w2.this.m13367y("currentFile")) {
                    C6021d1.m13030c(4, "FileWriterModule", "File created. Adding counter");
                    C6189w2.this.f16479s.mo13188f(C6168t5.m13308h(), null);
                } else {
                    C6021d1.m13030c(4, "FileWriterModule", "File creation failed.");
                }
            }
            if (this.f16481h.mo12961a().equals(EnumC6161s6.FLUSH_FRAME)) {
                C6189w2.this.f15722p = AbstractC6014c3.c.f15731h;
                C6021d1.m13030c(4, "FileWriterModule", "Adding flush frame:" + this.f16481h.mo13296d());
                C6189w2.this.f16479s.mo13188f(this.f16481h, new C11475a());
                return;
            }
            C6021d1.m13030c(4, "FileWriterModule", "Adding frame " + this.f16481h.mo12961a() + ": " + this.f16481h.mo13296d());
            C6189w2.this.f16479s.mo13188f(this.f16481h, null);
        }
    }

    C6189w2() {
        super("FileWriterModule", null);
        this.f16479s = null;
        this.f16480t = null;
        this.f16479s = new C6105m3();
        this.f16480t = new C6201x6();
    }

    /* renamed from: A */
    private static String m13365A() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null || i2 >= 1000 || sb.length() + line.length() > 524288) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
                i2++;
            }
            C6021d1.m13030c(4, "FileWriterModule", "Get Logcat lines: ".concat(String.valueOf(i2)));
            return sb.toString();
        } catch (IOException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m13367y(String str) {
        if (this.f16479s.mo13186c()) {
            C6021d1.m13030c(6, "FileWriterModule", "File was open, closing now.");
            this.f16479s.mo13184a();
        }
        return this.f16479s.mo13189i(C6140q2.m13273e(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.flurry.sdk.C6166t3 m13368z() throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6189w2.m13368z():com.flurry.sdk.t3");
    }

    @Override // com.flurry.sdk.AbstractC6014c3
    /* renamed from: b */
    public final void mo12956b(InterfaceC6177u6 interfaceC6177u6) {
        if (this.f15722p != AbstractC6014c3.c.f15731h) {
            mo13007m(new a(interfaceC6177u6));
            return;
        }
        this.f15723q.add(interfaceC6177u6);
        C6021d1.m13030c(4, "FileWriterModule", "In paused state, cannot process message now. " + interfaceC6177u6.mo12961a());
    }

    @Override // com.flurry.sdk.AbstractC6014c3, com.flurry.sdk.InterfaceC6197x2
    /* renamed from: c */
    public final InterfaceC6197x2.a mo12957c(InterfaceC6177u6 interfaceC6177u6) {
        C6105m3 c6105m3 = new C6105m3();
        if (c6105m3.mo13189i(C6140q2.m13273e(), "crashFile")) {
            c6105m3.mo13185b(interfaceC6177u6);
            c6105m3.mo13184a();
        } else {
            C6021d1.m13030c(4, "FileWriterModule", "Can't create crash file. Cannot write crash frame to disc");
        }
        return InterfaceC6197x2.a.QUEUED;
    }

    @Override // com.flurry.sdk.AbstractC6014c3
    /* renamed from: t */
    public final void mo13000t() throws NumberFormatException, IOException {
        C6140q2.m13269a();
        File file = new File(C6140q2.m13273e());
        if (!file.exists()) {
            file.mkdirs();
        }
        C6140q2.m13269a();
        File file2 = new File(C6140q2.m13271c());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        C6166t3 c6166t3M13368z = m13368z();
        C6158s3 c6158s3M13303i = c6166t3M13368z != null ? C6158s3.m13303i(c6166t3M13368z) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(C6140q2.m13273e());
        String str = File.separator;
        sb.append(str);
        sb.append("currentFile");
        if (C6140q2.m13272d(sb.toString())) {
            if (C6140q2.m13272d(C6140q2.m13273e() + str + "crashFile")) {
                C6193w6 c6193w6 = new C6193w6(C6140q2.m13273e(), "currentFile");
                C6193w6 c6193w62 = new C6193w6(C6140q2.m13273e(), "crashFile");
                if (C6149r2.m13290a(c6193w6, c6193w62) && C6149r2.m13291b(c6193w6.f16502a, c6193w6.f16503b, c6193w62.f16502a, c6193w62.f16503b) && C6201x6.m13374d(c6193w6, c6193w62)) {
                    C6201x6.m13371a(c6193w62);
                }
                C6201x6.m13371a(c6193w62);
            }
            this.f16479s.mo13187d();
        }
        if (m13367y("currentFile")) {
            this.f16479s.mo13188f(C6168t5.m13308h(), null);
            if (c6158s3M13303i != null) {
                this.f16479s.mo13185b(c6158s3M13303i);
            }
        }
    }
}
