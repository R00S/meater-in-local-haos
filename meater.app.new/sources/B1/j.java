package B1;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Serializer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"LB1/j;", "T", "", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lta/d;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "Loa/F;", "b", "(Ljava/lang/Object;Ljava/io/OutputStream;Lta/d;)Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "defaultValue", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface j<T> {
    T a();

    Object b(T t10, OutputStream outputStream, InterfaceC4588d<? super C4153F> interfaceC4588d);

    Object c(InputStream inputStream, InterfaceC4588d<? super T> interfaceC4588d);
}
