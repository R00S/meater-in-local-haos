package com.bumptech.glide.load.p129n;

import android.util.Log;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p144q.C5586c;
import com.bumptech.glide.p145r.C5587a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* renamed from: com.bumptech.glide.load.n.d */
/* loaded from: classes.dex */
public class C5452d implements InterfaceC5462n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.d$a */
    private static final class a implements InterfaceC5433d<ByteBuffer> {

        /* renamed from: f */
        private final File f13614f;

        a(File file) {
            this.f13614f = file;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: a */
        public Class<ByteBuffer> mo10455a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: b */
        public void mo10460b() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: d */
        public EnumC5365a mo10462d() {
            return EnumC5365a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: e */
        public void mo10463e(EnumC5353g enumC5353g, InterfaceC5433d.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo10228f(C5587a.m11014a(this.f13614f));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.mo10227c(e2);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.d$b */
    public static class b implements InterfaceC5463o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<File, ByteBuffer> mo10513b(C5466r c5466r) {
            return new C5452d();
        }
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<ByteBuffer> mo10509b(File file, int i2, int i3, C5426i c5426i) {
        return new InterfaceC5462n.a<>(new C5586c(file), new a(file));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(File file) {
        return true;
    }
}
