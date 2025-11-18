package com.flurry.sdk;

import com.flurry.sdk.C6048g0;
import com.flurry.sdk.C6068i2;
import com.flurry.sdk.InterfaceC6132p3;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.flurry.sdk.m3 */
/* loaded from: classes2.dex */
public final class C6105m3 extends C6095l2 implements InterfaceC6132p3 {

    /* renamed from: o */
    protected static BufferedOutputStream f16136o;

    /* renamed from: p */
    private static int f16137p;

    /* renamed from: q */
    private C6123o3 f16138q;

    /* renamed from: r */
    private ReentrantLock f16139r;

    /* renamed from: com.flurry.sdk.m3$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6177u6 f16140h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC6132p3.a f16141i;

        a(InterfaceC6177u6 interfaceC6177u6, InterfaceC6132p3.a aVar) {
            this.f16140h = interfaceC6177u6;
            this.f16141i = aVar;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6105m3.this.f16139r.lock();
            try {
                C6105m3.m13183t(C6105m3.this, this.f16140h);
                InterfaceC6132p3.a aVar = this.f16141i;
                if (aVar != null) {
                    aVar.mo13259a();
                }
            } finally {
                C6105m3.this.f16139r.unlock();
            }
        }
    }

    /* renamed from: com.flurry.sdk.m3$b */
    final class b extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6177u6 f16143h;

        b(InterfaceC6177u6 interfaceC6177u6) {
            this.f16143h = interfaceC6177u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6105m3.this.f16139r.lock();
            try {
                C6105m3.m13183t(C6105m3.this, this.f16143h);
            } finally {
                C6105m3.this.f16139r.unlock();
            }
        }
    }

    public C6105m3() {
        super("BufferedFrameAppender", C6068i2.m13111a(C6068i2.b.CORE));
        this.f16138q = null;
        this.f16139r = new ReentrantLock(true);
        this.f16138q = new C6123o3();
    }

    /* renamed from: t */
    static /* synthetic */ void m13183t(C6105m3 c6105m3, InterfaceC6177u6 interfaceC6177u6) throws IOException {
        boolean z = true;
        f16137p++;
        byte[] bArrM13226a = c6105m3.f16138q.m13226a(interfaceC6177u6);
        if (bArrM13226a != null) {
            try {
                f16136o.write(bArrM13226a);
                f16136o.flush();
            } catch (IOException e2) {
                C6021d1.m13030c(2, "BufferedFrameAppender", "Error appending frame:" + e2.getMessage());
            }
        } else {
            z = false;
        }
        C6021d1.m13030c(2, "BufferedFrameAppender", "Appending Frame " + interfaceC6177u6.mo12961a() + " frameSaved:" + z + " frameCount:" + f16137p);
    }

    @Override // com.flurry.sdk.InterfaceC6132p3
    /* renamed from: a */
    public final void mo13184a() {
        C6021d1.m13030c(2, "BufferedFrameAppender", "Close");
        this.f16139r.lock();
        try {
            f16137p = 0;
            C6013c2.m12990f(f16136o);
            f16136o = null;
        } finally {
            this.f16139r.unlock();
        }
    }

    @Override // com.flurry.sdk.InterfaceC6132p3
    /* renamed from: b */
    public final void mo13185b(InterfaceC6177u6 interfaceC6177u6) throws ExecutionException, InterruptedException, CancellationException {
        C6021d1.m13030c(2, "BufferedFrameAppender", "Appending Frame:" + interfaceC6177u6.mo12961a());
        mo13008n(new b(interfaceC6177u6));
    }

    @Override // com.flurry.sdk.InterfaceC6132p3
    /* renamed from: c */
    public final boolean mo13186c() {
        return f16136o != null;
    }

    @Override // com.flurry.sdk.InterfaceC6132p3
    /* renamed from: d */
    public final void mo13187d() {
        this.f16139r.lock();
        try {
            if (mo13186c()) {
                mo13184a();
            }
            C6193w6 c6193w6 = new C6193w6(C6140q2.m13273e(), "currentFile");
            File file = new File(c6193w6.f16502a, c6193w6.f16503b);
            C6048g0.b bVarM13206a = C6114n3.m13206a(file);
            if (bVarM13206a != C6048g0.b.SUCCEED) {
                C6048g0.m13065a().m13070b(bVarM13206a);
                C6021d1.m13030c(5, "BufferedFrameAppender", "File deleted status: " + file.delete() + " InProgress.");
            } else {
                boolean zM13371a = false;
                C6193w6 c6193w62 = new C6193w6(C6140q2.m13271c(), String.format(Locale.US, "completed-%d", Long.valueOf(System.currentTimeMillis())));
                if (C6149r2.m13290a(c6193w6, c6193w62) && C6149r2.m13291b(c6193w6.f16502a, c6193w6.f16503b, c6193w62.f16502a, c6193w62.f16503b)) {
                    boolean zM13372b = C6201x6.m13372b(c6193w6, c6193w62);
                    zM13371a = zM13372b ? C6201x6.m13371a(c6193w6) : zM13372b;
                }
                C6021d1.m13030c(4, "BufferedFrameAppender", "File moved status: " + zM13371a + " InProgress to Completed.");
            }
        } finally {
            this.f16139r.unlock();
        }
    }

    @Override // com.flurry.sdk.InterfaceC6132p3
    /* renamed from: f */
    public final void mo13188f(InterfaceC6177u6 interfaceC6177u6, InterfaceC6132p3.a aVar) {
        C6021d1.m13030c(2, "BufferedFrameAppender", "Appending Frame:" + interfaceC6177u6.mo12961a());
        mo13007m(new a(interfaceC6177u6, aVar));
    }

    @Override // com.flurry.sdk.InterfaceC6132p3
    /* renamed from: i */
    public final boolean mo13189i(String str, String str2) {
        C6021d1.m13030c(2, "BufferedFrameAppender", "Open");
        this.f16139r.lock();
        boolean z = true;
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists() && !C6004b2.m12968b(file)) {
                    throw new IOException("Frame file: Error creating directory for :" + file.getAbsolutePath());
                }
                f16136o = new BufferedOutputStream(new FileOutputStream(file, true));
            } catch (IOException e2) {
                e = e2;
                z = false;
            }
            try {
                f16137p = 0;
            } catch (IOException e3) {
                e = e3;
                C6021d1.m13030c(6, "BufferedFrameAppender", "Error in opening file:" + str2 + " Message:" + e.getMessage());
                return z;
            }
            return z;
        } finally {
            this.f16139r.unlock();
        }
    }
}
