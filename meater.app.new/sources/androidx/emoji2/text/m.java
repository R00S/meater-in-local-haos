package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataListReader.java */
/* loaded from: classes.dex */
class m {

    /* compiled from: MetadataListReader.java */
    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f25269a;

        a(ByteBuffer byteBuffer) {
            this.f25269a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public void b(int i10) {
            ByteBuffer byteBuffer = this.f25269a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.m.c
        public int c() {
            return this.f25269a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public long d() {
            return m.c(this.f25269a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f25269a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() {
            return m.d(this.f25269a.getShort());
        }
    }

    /* compiled from: MetadataListReader.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f25270a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25271b;

        b(long j10, long j11) {
            this.f25270a = j10;
            this.f25271b = j11;
        }

        long a() {
            return this.f25270a;
        }
    }

    /* compiled from: MetadataListReader.java */
    private interface c {
        void b(int i10);

        int c();

        long d();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) throws IOException {
        long jD;
        cVar.b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jD = -1;
                break;
            }
            int iC = cVar.c();
            cVar.b(4);
            jD = cVar.d();
            cVar.b(4);
            if (1835365473 == iC) {
                break;
            }
            i10++;
        }
        if (jD != -1) {
            cVar.b((int) (jD - cVar.getPosition()));
            cVar.b(12);
            long jD2 = cVar.d();
            for (int i11 = 0; i11 < jD2; i11++) {
                int iC2 = cVar.c();
                long jD3 = cVar.d();
                long jD4 = cVar.d();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new b(jD3 + jD, jD4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static G1.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return G1.b.h(byteBufferDuplicate);
    }

    static long c(int i10) {
        return i10 & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
