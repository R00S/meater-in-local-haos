package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0356a;
import androidx.datastore.preferences.protobuf.AbstractC0356a.a;
import androidx.datastore.preferences.protobuf.AbstractC0377h;
import androidx.datastore.preferences.protobuf.InterfaceC0405q0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.a */
/* loaded from: classes.dex */
public abstract class AbstractC0356a<MessageType extends AbstractC0356a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0405q0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC0356a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0405q0.a {
        /* renamed from: j */
        protected static <T> void m2550j(Iterable<T> iterable, List<? super T> list) {
            C0357a0.m2556a(iterable);
            if (!(iterable instanceof InterfaceC0372f0)) {
                if (iterable instanceof InterfaceC0426z0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m2551k(iterable, list);
                    return;
                }
            }
            List<?> listMo2676j = ((InterfaceC0372f0) iterable).mo2676j();
            InterfaceC0372f0 interfaceC0372f0 = (InterfaceC0372f0) list;
            int size = list.size();
            for (Object obj : listMo2676j) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC0372f0.size() - size) + " is null.";
                    for (int size2 = interfaceC0372f0.size() - 1; size2 >= size; size2--) {
                        interfaceC0372f0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0377h) {
                    interfaceC0372f0.mo2671a0((AbstractC0377h) obj);
                } else {
                    interfaceC0372f0.add((String) obj);
                }
            }
        }

        /* renamed from: k */
        private static <T> void m2551k(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        /* renamed from: n */
        protected static UninitializedMessageException m2552n(InterfaceC0405q0 interfaceC0405q0) {
            return new UninitializedMessageException(interfaceC0405q0);
        }

        /* renamed from: l */
        protected abstract BuilderType mo2553l(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public BuilderType mo2555z(InterfaceC0405q0 interfaceC0405q0) {
            if (mo3201b().getClass().isInstance(interfaceC0405q0)) {
                return (BuilderType) mo2553l((AbstractC0356a) interfaceC0405q0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: a */
    protected static <T> void m2542a(Iterable<T> iterable, List<? super T> list) {
        a.m2550j(iterable, list);
    }

    /* renamed from: l */
    private String m2543l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0
    /* renamed from: h */
    public AbstractC0377h mo2544h() {
        try {
            AbstractC0377h.h hVarM2719u = AbstractC0377h.m2719u(mo3153e());
            mo3156i(hVarM2719u.m2740b());
            return hVarM2719u.m2739a();
        } catch (IOException e2) {
            throw new RuntimeException(m2543l("ByteString"), e2);
        }
    }

    /* renamed from: j */
    int mo2545j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    int m2546k(InterfaceC0373f1 interfaceC0373f1) {
        int iMo2545j = mo2545j();
        if (iMo2545j != -1) {
            return iMo2545j;
        }
        int iMo2700i = interfaceC0373f1.mo2700i(this);
        mo2548n(iMo2700i);
        return iMo2700i;
    }

    /* renamed from: m */
    UninitializedMessageException m2547m() {
        return new UninitializedMessageException(this);
    }

    /* renamed from: n */
    void mo2548n(int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: o */
    public void m2549o(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamM2443f0 = CodedOutputStream.m2443f0(outputStream, CodedOutputStream.m2419I(mo3153e()));
        mo3156i(codedOutputStreamM2443f0);
        codedOutputStreamM2443f0.mo2494c0();
    }
}
