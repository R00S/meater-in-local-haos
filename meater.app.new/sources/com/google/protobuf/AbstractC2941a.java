package com.google.protobuf;

import com.google.protobuf.AbstractC2941a;
import com.google.protobuf.AbstractC2941a.AbstractC0499a;
import com.google.protobuf.AbstractC2947g;
import com.google.protobuf.P;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite.java */
/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2941a<MessageType extends AbstractC2941a<MessageType, BuilderType>, BuilderType extends AbstractC0499a<MessageType, BuilderType>> implements P {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0499a<MessageType extends AbstractC2941a<MessageType, BuilderType>, BuilderType extends AbstractC0499a<MessageType, BuilderType>> implements P.a {
        protected static <T> void r(Iterable<T> iterable, List<? super T> list) {
            C2964y.a(iterable);
            if (!(iterable instanceof E)) {
                if (iterable instanceof Z) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    s(iterable, list);
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
                if (obj instanceof AbstractC2947g) {
                    e10.W((AbstractC2947g) obj);
                } else {
                    e10.add((String) obj);
                }
            }
        }

        private static <T> void s(Iterable<T> iterable, List<? super T> list) {
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

        protected static UninitializedMessageException v(P p10) {
            return new UninitializedMessageException(p10);
        }

        protected abstract BuilderType t(MessageType messagetype);

        @Override // com.google.protobuf.P.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType O0(P p10) {
            if (c().getClass().isInstance(p10)) {
                return (BuilderType) t((AbstractC2941a) p10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        AbstractC0499a.r(iterable, list);
    }

    private String t(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.P
    public AbstractC2947g i() {
        try {
            AbstractC2947g.h hVarY = AbstractC2947g.y(f());
            l(hVarY.b());
            return hVarY.a();
        } catch (IOException e10) {
            throw new RuntimeException(t("ByteString"), e10);
        }
    }

    int r() {
        throw new UnsupportedOperationException();
    }

    int s(f0 f0Var) {
        int iR = r();
        if (iR != -1) {
            return iR;
        }
        int iE = f0Var.e(this);
        v(iE);
        return iE;
    }

    UninitializedMessageException u() {
        return new UninitializedMessageException(this);
    }

    void v(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] w() {
        try {
            byte[] bArr = new byte[f()];
            CodedOutputStream codedOutputStreamC0 = CodedOutputStream.c0(bArr);
            l(codedOutputStreamC0);
            codedOutputStreamC0.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(t("byte array"), e10);
        }
    }
}
