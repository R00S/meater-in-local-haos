package com.flurry.sdk;

import com.flurry.sdk.C6085k1;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.i1 */
/* loaded from: classes2.dex */
public final class C6067i1<RequestObjectType, ResponseObjectType> extends C6085k1 {

    /* renamed from: G */
    public b<RequestObjectType, ResponseObjectType> f15979G;

    /* renamed from: H */
    public RequestObjectType f15980H;

    /* renamed from: I */
    private ResponseObjectType f15981I;

    /* renamed from: J */
    public InterfaceC6180v1<RequestObjectType> f15982J;

    /* renamed from: K */
    public InterfaceC6180v1<ResponseObjectType> f15983K;

    /* renamed from: com.flurry.sdk.i1$a */
    final class a implements C6085k1.d {
        a() {
        }

        @Override // com.flurry.sdk.C6085k1.d
        /* renamed from: a */
        public final void mo13107a() {
            C6067i1.m13106k(C6067i1.this);
        }

        @Override // com.flurry.sdk.C6085k1.d
        /* renamed from: b */
        public final void mo13108b(InputStream inputStream) throws Exception {
            if (C6067i1.this.f15983K != null) {
                C6067i1 c6067i1 = C6067i1.this;
                c6067i1.f15981I = c6067i1.f15983K.mo13096b(inputStream);
            }
        }

        @Override // com.flurry.sdk.C6085k1.d
        /* renamed from: c */
        public final void mo13109c(OutputStream outputStream) throws Exception {
            if (C6067i1.this.f15980H == null || C6067i1.this.f15982J == null) {
                return;
            }
            C6067i1.this.f15982J.mo13095a(outputStream, C6067i1.this.f15980H);
        }
    }

    /* renamed from: com.flurry.sdk.i1$b */
    public interface b<RequestObjectType, ResponseObjectType> {
        /* renamed from: a */
        void mo13110a(C6067i1<RequestObjectType, ResponseObjectType> c6067i1, ResponseObjectType responseobjecttype);
    }

    /* renamed from: k */
    static /* synthetic */ void m13106k(C6067i1 c6067i1) {
        if (c6067i1.f15979G == null || c6067i1.m13149d()) {
            return;
        }
        c6067i1.f15979G.mo13110a(c6067i1, c6067i1.f15981I);
    }

    @Override // com.flurry.sdk.C6085k1, com.flurry.sdk.AbstractRunnableC6041f2
    /* renamed from: a */
    public final void mo12950a() {
        this.f16059s = new a();
        super.mo12950a();
    }
}
