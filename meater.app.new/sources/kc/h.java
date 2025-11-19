package kc;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SerialDescriptor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, d2 = {"Lkc/f;", "", "a", "(Lkc/f;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(Lkc/f;)V", "elementDescriptors", "", "b", "getElementNames$annotations", "elementNames", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* compiled from: SerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"kc/h$a", "", "Lkc/f;", "", "hasNext", "()Z", "b", "()Lkc/f;", "", "B", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<f>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int elementsLeft;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ f f43911C;

        a(f fVar) {
            this.f43911C = fVar;
            this.elementsLeft = fVar.c();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f43911C;
            int iC = fVar.c();
            int i10 = this.elementsLeft;
            this.elementsLeft = i10 - 1;
            return fVar.e(iC - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: SerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"kc/h$b", "", "", "", "hasNext", "()Z", "b", "()Ljava/lang/String;", "", "B", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Iterator<String>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int elementsLeft;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ f f43913C;

        b(f fVar) {
            this.f43913C = fVar;
            this.elementsLeft = fVar.c();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f43913C;
            int iC = fVar.c();
            int i10 = this.elementsLeft;
            this.elementsLeft = i10 - 1;
            return fVar.d(iC - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kc/h$c", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Iterable<f>, Ca.a {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ f f43914B;

        public c(f fVar) {
            this.f43914B = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f43914B);
        }
    }

    /* compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kc/h$d", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Iterable<String>, Ca.a {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ f f43915B;

        public d(f fVar) {
            this.f43915B = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f43915B);
        }
    }

    public static final Iterable<f> a(f fVar) {
        C3862t.g(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable<String> b(f fVar) {
        C3862t.g(fVar, "<this>");
        return new d(fVar);
    }
}
