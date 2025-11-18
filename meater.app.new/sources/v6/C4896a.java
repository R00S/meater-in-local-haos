package v6;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4896a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f51486a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: v6.a$a, reason: collision with other inner class name */
    public static class C0739a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new C4896a(byteBuffer);
        }
    }

    public C4896a(ByteBuffer byteBuffer) {
        this.f51486a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f51486a.position(0);
        return this.f51486a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
