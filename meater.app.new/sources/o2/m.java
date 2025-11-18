package o2;

import java.util.NoSuchElementException;

/* compiled from: MediaChunkIterator.java */
/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f46399a = new a();

    /* compiled from: MediaChunkIterator.java */
    class a implements m {
        a() {
        }

        @Override // o2.m
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // o2.m
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // o2.m
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
