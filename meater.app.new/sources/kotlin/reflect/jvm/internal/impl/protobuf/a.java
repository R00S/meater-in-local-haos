package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes3.dex */
public abstract class a implements o {

    /* renamed from: B, reason: collision with root package name */
    protected int f44018B = 0;

    UninitializedMessageException a() {
        return new UninitializedMessageException(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        int iF = f();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputStream, CodedOutputStream.u(CodedOutputStream.v(iF) + iF));
        codedOutputStreamJ.o0(iF);
        i(codedOutputStreamJ);
        codedOutputStreamJ.I();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0582a<BuilderType extends AbstractC0582a> implements o.a {
        protected static UninitializedMessageException l(o oVar) {
            return new UninitializedMessageException(oVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        public abstract BuilderType k(e eVar, f fVar);

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C0583a extends FilterInputStream {

            /* renamed from: B, reason: collision with root package name */
            private int f44019B;

            C0583a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f44019B = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f44019B);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f44019B <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f44019B--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f44019B));
                if (jSkip >= 0) {
                    this.f44019B = (int) (this.f44019B - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f44019B;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f44019B -= i13;
                }
                return i13;
            }
        }
    }
}
