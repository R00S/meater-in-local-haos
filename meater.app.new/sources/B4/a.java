package B4;

import B4.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* compiled from: BlockStatus.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public l.e f1534a;

    /* renamed from: b, reason: collision with root package name */
    public l.f f1535b;

    /* renamed from: c, reason: collision with root package name */
    public l.d f1536c;

    /* renamed from: d, reason: collision with root package name */
    public int f1537d;

    public static a a(byte[] bArr) {
        a aVar = new a();
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        aVar.f1534a = b(l.e.class, bArr[0]) ? l.e.values()[bArr[0]] : l.e.eBlockStatusModeBooting;
        aVar.f1535b = b(l.f.class, bArr[1]) ? l.f.values()[bArr[1]] : l.f.eBlockStatusWifiUnknown;
        aVar.f1536c = b(l.d.class, bArr[2]) ? l.d.values()[bArr[2]] : l.d.eBlockStatusCloudUnknown;
        aVar.f1537d = bArr[3];
        return aVar;
    }

    public static <T extends Enum<T> & l.a> boolean b(Class<T> cls, int i10) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        Objects.requireNonNull(enumArr);
        for (Object obj : enumArr) {
            if (((l.a) obj).getValue() == i10) {
                return true;
            }
        }
        return false;
    }
}
