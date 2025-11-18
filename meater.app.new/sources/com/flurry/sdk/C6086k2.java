package com.flurry.sdk;

import com.flurry.sdk.C6048g0;
import com.flurry.sdk.C6068i2;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.flurry.sdk.k2 */
/* loaded from: classes2.dex */
public final class C6086k2 extends C6095l2 implements InterfaceC6185v6 {

    /* renamed from: o */
    private PriorityQueue<String> f16076o;

    /* renamed from: com.flurry.sdk.k2$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ List f16077h;

        a(List list) {
            this.f16077h = list;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6086k2.this.f16076o.addAll(this.f16077h);
            C6086k2.this.m13153v();
        }
    }

    public C6086k2() {
        super("FrameLogTestHandler", C6068i2.m13111a(C6068i2.b.CORE));
        this.f16076o = null;
        this.f16076o = new PriorityQueue<>(4, new C6157s2());
    }

    /* renamed from: t */
    private synchronized void m13151t(String str, boolean z) {
        C6021d1.m13037j("FrameLogTestHandler", "File move to test folder for file: " + str + " fileMoved:" + z);
        C6021d1.m13030c(2, "FrameLogTestHandler", "Deleting file " + str + " deleted " + C6140q2.m13270b(str));
        m13153v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m13153v() throws Throwable {
        C6021d1.m13037j("FrameLogTestHandler", " Starting processNextFile " + this.f16076o.size());
        if (this.f16076o.peek() == null) {
            C6021d1.m13037j("FrameLogTestHandler", "No file present to process.");
            return;
        }
        String strPoll = this.f16076o.poll();
        if (C6140q2.m13272d(strPoll)) {
            File file = new File(strPoll);
            boolean zM13373c = C6201x6.m13373c(file, new File(C6004b2.m12967a().toString() + File.separator + "fCompletedInApp", String.format(Locale.US, "completedInApp-%d", Long.valueOf(System.currentTimeMillis()))));
            if (zM13373c) {
                zM13373c = file.delete();
            }
            m13151t(strPoll, zM13373c);
        }
    }

    @Override // com.flurry.sdk.InterfaceC6185v6
    /* renamed from: a */
    public final void mo13132a() {
    }

    @Override // com.flurry.sdk.InterfaceC6185v6
    /* renamed from: d */
    public final C6048g0.c mo13133d() {
        C6048g0.c cVar = new C6048g0.c();
        cVar.m13074a(this.f16076o.size());
        return cVar;
    }

    @Override // com.flurry.sdk.InterfaceC6185v6
    /* renamed from: e */
    public final void mo13134e(List<String> list) {
        if (list.size() == 0) {
            C6021d1.m13037j("FrameLogTestHandler", "File List is null or empty");
            return;
        }
        C6021d1.m13037j("FrameLogTestHandler", "Number of files being added:" + list.toString());
        mo13007m(new a(list));
    }
}
