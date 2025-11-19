package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2055a;
import androidx.datastore.preferences.protobuf.AbstractC2055a.AbstractC0350a;
import androidx.datastore.preferences.protobuf.AbstractC2062h;
import androidx.datastore.preferences.protobuf.P;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2055a<MessageType extends AbstractC2055a<MessageType, BuilderType>, BuilderType extends AbstractC0350a<MessageType, BuilderType>> implements P {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0350a<MessageType extends AbstractC2055a<MessageType, BuilderType>, BuilderType extends AbstractC0350a<MessageType, BuilderType>> implements P.a {
        protected static <T> void l(Iterable<T> iterable, List<? super T> list) {
            C2079z.a(iterable);
            if (!(iterable instanceof E)) {
                if (iterable instanceof Z) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m(iterable, list);
                    return;
                }
            }
            List<?> listL = ((E) iterable).l();
            E e10 = (E) list;
            int size = list.size();
            for (Object obj : listL) {
                if (obj == null) {
                    String str = "Element at index " + (e10.size() - size) + " is null.";
                    for (int size2 = e10.size() - 1; size2 >= size; size2--) {
                        e10.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC2062h) {
                    e10.i0((AbstractC2062h) obj);
                } else {
                    e10.add((String) obj);
                }
            }
        }

        private static <T> void m(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        protected static UninitializedMessageException p(P p10) {
            return new UninitializedMessageException(p10);
        }

        protected abstract BuilderType n(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType K(P p10) {
            if (c().getClass().isInstance(p10)) {
                return (BuilderType) n((AbstractC2055a) p10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        AbstractC0350a.l(iterable, list);
    }

    private String n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public AbstractC2062h i() {
        try {
            AbstractC2062h.C0351h c0351hA = AbstractC2062h.A(f());
            k(c0351hA.b());
            return c0351hA.a();
        } catch (IOException e10) {
            throw new RuntimeException(n("ByteString"), e10);
        }
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    int m(f0 f0Var) {
        int iL = l();
        if (iL != -1) {
            return iL;
        }
        int iE = f0Var.e(this);
        p(iE);
        return iE;
    }

    UninitializedMessageException o() {
        return new UninitializedMessageException(this);
    }

    void p(int i10) {
        throw new UnsupportedOperationException();
    }

    public void q(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamF0 = CodedOutputStream.f0(outputStream, CodedOutputStream.I(f()));
        k(codedOutputStreamF0);
        codedOutputStreamF0.c0();
    }
}
