package com.flurry.sdk;

import com.flurry.sdk.C6048g0;
import com.flurry.sdk.C6068i2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.flurry.sdk.j2 */
/* loaded from: classes2.dex */
public final class C6077j2 extends C6095l2 implements InterfaceC6185v6 {

    /* renamed from: o */
    private PriorityQueue<String> f16014o;

    /* renamed from: p */
    private AbstractC6129p0 f16015p;

    /* renamed from: q */
    private AbstractC6129p0 f16016q;

    /* renamed from: com.flurry.sdk.j2$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ List f16017h;

        a(List list) {
            this.f16017h = list;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6077j2.this.f16014o.addAll(this.f16017h);
            C6077j2.this.m13131w();
        }
    }

    /* renamed from: com.flurry.sdk.j2$b */
    final class b implements InterfaceC6120o0 {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6120o0
        /* renamed from: a */
        public final void mo13135a() {
            C6077j2.m13128t(true);
        }

        @Override // com.flurry.sdk.InterfaceC6120o0
        /* renamed from: d */
        public final void mo13136d() {
            C6077j2.m13128t(false);
        }
    }

    public C6077j2() {
        super("FrameLogDataSender", C6068i2.m13111a(C6068i2.b.CORE));
        this.f16014o = null;
        this.f16014o = new PriorityQueue<>(4, new C6157s2());
        this.f16015p = new C6171u0();
        this.f16016q = new C6163t0();
    }

    /* renamed from: h */
    private synchronized void m13126h(String str) {
        C6021d1.m13039l("FrameLogDataSender", "File upload status: ".concat(String.valueOf(str)));
        C6021d1.m13030c(2, "FrameLogDataSender", "Deleting file " + str + " deleted " + C6140q2.m13270b(str));
        m13131w();
    }

    /* renamed from: t */
    static /* synthetic */ void m13128t(boolean z) {
        C6104m2.m13180a().m13181b(new C6036e6(new C6045f6(z)));
    }

    /* renamed from: u */
    private static byte[] m13129u(File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                int i2 = fileInputStream.read(bArr, 0, length);
                if (i2 < length) {
                    int i3 = length - i2;
                    while (i3 > 0) {
                        int i4 = fileInputStream.read(bArr2, 0, i3);
                        System.arraycopy(bArr2, 0, bArr, length - i3, i4);
                        i3 -= i4;
                    }
                }
            } catch (IOException e2) {
                C6021d1.m13030c(6, "FrameLogDataSender", "Error reading file. ".concat(String.valueOf(e2)));
            }
            return bArr;
        } finally {
            fileInputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m13131w() {
        C6021d1.m13039l("FrameLogDataSender", " Starting processNextFile " + this.f16014o.size());
        if (this.f16014o.peek() == null) {
            C6021d1.m13039l("FrameLogDataSender", "No file present to process.");
            return;
        }
        String strPoll = this.f16014o.poll();
        if (!C6140q2.m13272d(strPoll)) {
            C6021d1.m13030c(6, "FrameLogDataSender", "Something wrong with the file. File does not exist.");
            return;
        }
        C6021d1.m13039l("FrameLogDataSender", "Starting to upload file: ".concat(String.valueOf(strPoll)));
        byte[] bArrM13129u = new byte[0];
        try {
            bArrM13129u = m13129u(new File(strPoll));
        } catch (IOException e2) {
            C6021d1.m13030c(6, "FrameLogDataSender", "Error in getting bytes form the file: " + e2.getMessage());
        }
        String strM13143b = C6084k0.m13141a().m13143b();
        StringBuilder sb = new StringBuilder();
        C6111n0.m13190a();
        sb.append(328);
        this.f16015p.m13247w(bArrM13129u, strM13143b, sb.toString());
        this.f16015p.m13246v(new b());
        m13126h(strPoll);
        C6021d1.m13039l("FrameLogDataSender", "File appended for upload: ".concat(String.valueOf(strPoll)));
    }

    @Override // com.flurry.sdk.InterfaceC6185v6
    /* renamed from: a */
    public final void mo13132a() {
        this.f16015p.m13243a();
        this.f16016q.m13243a();
    }

    @Override // com.flurry.sdk.InterfaceC6185v6
    /* renamed from: d */
    public final C6048g0.c mo13133d() {
        AbstractC6129p0 abstractC6129p0 = this.f16015p;
        C6048g0.c cVar = new C6048g0.c();
        Iterator<String> it = abstractC6129p0.f16225s.m13283a().iterator();
        while (it.hasNext()) {
            cVar.m13074a(abstractC6129p0.f16225s.m13289k(it.next()).size());
        }
        return cVar;
    }

    @Override // com.flurry.sdk.InterfaceC6185v6
    /* renamed from: e */
    public final void mo13134e(List<String> list) {
        if (list.size() == 0) {
            C6021d1.m13030c(6, "FrameLogDataSender", "File List is null or empty");
            return;
        }
        C6021d1.m13039l("FrameLogDataSender", "Number of files being added:" + list.toString());
        mo13007m(new a(list));
    }
}
