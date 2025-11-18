package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;

/* compiled from: AbstractMessageLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10742a implements InterfaceC10756o {

    /* renamed from: f */
    protected int f41255f = 0;

    /* renamed from: a */
    UninitializedMessageException m38255a() {
        return new UninitializedMessageException(this);
    }

    /* renamed from: i */
    public void m38256i(OutputStream outputStream) throws IOException {
        int iMo34078e = mo34078e();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(outputStream, CodedOutputStream.m38195u(CodedOutputStream.m38196v(iMo34078e) + iMo34078e));
        codedOutputStreamM38173J.m38231o0(iMo34078e);
        mo34081h(codedOutputStreamM38173J);
        codedOutputStreamM38173J.m38201I();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a */
    public static abstract class a<BuilderType extends a> implements InterfaceC10756o.a {
        /* renamed from: j */
        protected static UninitializedMessageException m38257j(InterfaceC10756o interfaceC10756o) {
            return new UninitializedMessageException(interfaceC10756o);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: i */
        public abstract BuilderType mo34094i(C10746e c10746e, C10747f c10747f) throws IOException;

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C11581a extends FilterInputStream {

            /* renamed from: f */
            private int f41256f;

            C11581a(InputStream inputStream, int i2) {
                super(inputStream);
                this.f41256f = i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f41256f);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f41256f <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 >= 0) {
                    this.f41256f--;
                }
                return i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
                long jSkip = super.skip(Math.min(j2, this.f41256f));
                if (jSkip >= 0) {
                    this.f41256f = (int) (this.f41256f - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                int i4 = this.f41256f;
                if (i4 <= 0) {
                    return -1;
                }
                int i5 = super.read(bArr, i2, Math.min(i3, i4));
                if (i5 >= 0) {
                    this.f41256f -= i5;
                }
                return i5;
            }
        }
    }
}
